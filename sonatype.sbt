sonatypeProfileName := "dcascaval"
publishMavenStyle := true
licenses := Seq("MIT" -> url("https://opensource.org/licenses/mit-license.php"))

homepage := Some(url("https://github.com/dcascaval/scala-threejs-facades"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/dcascaval/scala-threejs-facades"),
    "scm:git@github.com:dcascaval/scala-threejs-facades.git"
  )
)
developers := List(
  Developer(
    id = "dcascaval",
    name = "Dan Cascaval",
    email = "dan@cascaval.org",
    url = url("https://github.com/dcascaval")
  )
)
