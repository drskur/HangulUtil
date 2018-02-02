name := "HangulUtil"

version := "0.1"

scalaVersion := "2.12.4"

resolvers += Resolver.jcenterRepo

// Test
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayPackageLabels := Seq("hangul", "korean")

crossScalaVersions := Seq("2.11.8","2.10.6")