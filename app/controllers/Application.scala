/*
 * Copyright (C) 2015 Jason Mar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package controllers

import javax.inject.Inject
import models.{Security, User}
import play.api.i18n.I18nSupport
import play.api.mvc._

class Application @Inject() (cc : ControllerComponents)
    extends AbstractController(cc)
    with Security
    with I18nSupport {
  
  import models.Conf
  
  def index = HasRole(List(Conf.acg1)) {
    uid => _ =>
      Ok(views.html.index("Authenticated as " + uid))
  }
  
  def login = Action {
    implicit request =>
      Ok(views.html.login(User.loginForm))
  }
  
  def logout = Action {
    Redirect(routes.Application.login).withNewSession.flashing("success" -> "You've been logged out")
  }
  
  def untrail(path: String) = Action {
    MovedPermanently("/" + path)
  }
  
  def authenticate = Action {
    implicit request =>
      User.loginForm.bindFromRequest.fold(
        formWithErrors =>
          BadRequest(views.html.login(formWithErrors)),
        user =>
          Redirect(routes.Application.index)
            .withSession("uid" -> user._1)
      )
  }

}
