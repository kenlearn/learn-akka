import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "me.kenqcl",
      scalaVersion := "2.12.4",
      version      := "0.1.0"
    )),
    name := "akka",
    libraryDependencies ++= Seq(
      scalaTest,
      akkaActor,
      scalaAsync,
      akkaSlf4j,
      logback
    )
  )
