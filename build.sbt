ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    // Version
    organization := "io.github.dcascaval",
    name := "scala-threejs-facades",
    scalaVersion := "3.0.0",
    version := "0.131.0",

    // Publishing SCM information
    crossPaths := false,
    publishTo := sonatypePublishToBundle.value,

    // Dependencies
    libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.2.0")
      .cross(CrossVersion.for3Use2_13)
  )

credentials += Credentials(
  "GnuPG Key ID",
  "gpg",
  "AAE611EE1965DFC7C54E07DFA48354A0A0A8C6A8", // key identifier
  "ignored" // this field is ignored; passwords are supplied by pinentry
)
