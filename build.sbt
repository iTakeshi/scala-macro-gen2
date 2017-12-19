lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.12.4",
  libraryDependencies += "org.scalameta" %% "scalameta" % "1.8.0",
  addCompilerPlugin("org.scalameta" %  "paradise"  % "3.0.0-M10" cross CrossVersion.full)
)

lazy val core = (project in file("core"))
  .settings(commonSettings: _*)
  .dependsOn(macros)

lazy val macros = (project in file("macro"))
  .settings(commonSettings: _*)
