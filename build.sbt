
lazy val commonSettings = Seq(
  version := "0.1",
  scalaVersion := "2.12.6"
)

lazy val classesAndObjects = (project in file("classes-and-objects"))
  .settings(
    commonSettings ++
    Seq(
      name := "classes-and-objects"
    )
  )

lazy val root = (project in file("."))
  .settings(
    commonSettings ++
    Seq(
      name := "scala-school"
    )
  )