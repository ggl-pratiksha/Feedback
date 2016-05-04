name := "just-play-scala"

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq("com.marklogic" % "marklogic-xcc" % "6.0.3" from "http://developer.marklogic.com/maven2/com/marklogic/marklogic-xcc/6.0.3/marklogic-xcc-6.0.3.jar",
  "org.scalatra.scalate" % "scalate-core_2.10" % "1.7.0",
  "net.liftweb" %% "lift-json" % "2.5+")
