lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "org.cascaval",
    name := "scala-threejs-facades",
    scalaVersion := "3.0.0",
    version := "0.131.0-SNAPSHOT",
    libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.2.0")
      .cross(CrossVersion.for3Use2_13),
    githubOwner := "dcascaval",
    githubRepository := "scala-threejs-facades",
    githubTokenSource := TokenSource.Environment("GITHUB_PACKAGES_TOKEN")
  )
