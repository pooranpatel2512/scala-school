
lazy val commonSettings = Seq(
  name := "scala-school",
  version := "0.1",
  scalaVersion := "2.12.6"
)

lazy val classesAndObjects = (project in file("classes-and-objects"))
  .settings(commonSettings)

lazy val root = (project in file("."))
  .settings(commonSettings)