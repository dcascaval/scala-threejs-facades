enablePlugins(ScalaJSPlugin)
organization := "org.cascaval"
name := "three-typings"
scalaVersion := "3.0.0"
version := "0.1.7-SNAPSHOT"
libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(
  CrossVersion.for3Use2_13
)
