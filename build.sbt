
name := "play2-ldap-activedirectory"

version := "1.0"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Dependency Library locations
resolvers ++= Seq(
    "Typesafe repository snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Artima Maven Repository" at "http://repo.artima.com/releases",
    "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype repo" at "https://oss.sonatype.org/content/groups/scala-tools/",
    "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
    "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype staging" at "http://oss.sonatype.org/content/repositories/staging",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
    "Atlassian Releases" at "https://maven.atlassian.com/public/",
    "twitter-repo" at "http://maven.twttr.com",
    "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    Resolver.bintrayRepo("websudos", "oss-releases"),
    Resolver.sonatypeRepo("releases")
)

libraryDependencies ++= Seq(
  jdbc,
  guice,
  ehcache,
  ws
)

libraryDependencies += "com.unboundid" % "unboundid-ldapsdk" % "4.0.9"

