version := "1.0.0"
name := "scala-akka-petstore-client"
organization := "org.openapitools"
scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.3",
  "com.typesafe.akka" %% "akka-actor" % "2.5.21",
  "com.typesafe.akka" %% "akka-stream" % "2.5.21",
  "com.typesafe.akka" %% "akka-http" % "10.1.7",
  "joda-time" % "joda-time" % "2.10.1",
  "org.json4s" %% "json4s-jackson" % "3.6.5",
  "org.json4s" %% "json4s-ext" % "3.6.5",
  "de.heikoseeberger" %% "akka-http-json4s" % "1.25.2",
  // test dependencies
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "junit" % "junit" % "4.12" % "test"
)

resolvers ++= Seq(Resolver.mavenLocal)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

publishArtifact in (Compile, packageDoc) := false