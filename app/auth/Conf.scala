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

package auth

import com.typesafe.config.ConfigFactory

object Conf {
  val conf = ConfigFactory.load()
  val ldapProtocol = conf.getString("ldap.ldapProtocol")
  val ldapUseKeystore = conf.getBoolean("ldap.ldapUseKeystore")
  val ldapHost0 = conf.getString("ldap.ldapHost0")
  val ldapHost1 = conf.getString("ldap.ldapHost1")
  val ldapPort = conf.getInt("ldap.ldapPort")
  val bindDN = conf.getString("ldap.bindDN")
  val bindPass = conf.getString("ldap.bindPass")
  val poolSize = conf.getInt("ldap.poolSize")
  val roleBaseDN = conf.getString("ldap.roleBaseDN")
  val userBaseDN = conf.getString("ldap.userBaseDN")
  val uidAttribute = conf.getString("ldap.uidAttribute")
  val memberAttribute = conf.getString("ldap.memberAttribute")
  val roleMemberAttribute = conf.getString("ldap.roleMemberAttribute")
  val roleAttribute = conf.getString("ldap.roleAttribute")
  val trustStore = conf.getString("ldap.trustStore")
  val trustStorePass = conf.getString("ldap.trustStorePass").toCharArray
  val trustStoreType = conf.getString("ldap.trustStoreType")
  val ldapCacheDuration = conf.getInt("ldap.ldapCacheDuration")
  val acg1 = conf.getString("ldap.acg1")
  
  val serverAddresses = Array(ldapHost0,ldapHost1)
  val serverPorts = Array(ldapPort,ldapPort)
}
