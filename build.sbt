
name := "play2-ldap-activedirectory"

version := "1.0"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies += "com.unboundid" % "unboundid-ldapsdk" % "2.3.6"
