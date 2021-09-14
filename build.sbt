enablePlugins(ScalaJSPlugin)
name := "three-typings"
scalaVersion := "3.0.0"
libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(
  CrossVersion.for3Use2_13
)
