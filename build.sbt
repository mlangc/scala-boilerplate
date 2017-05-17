name := "undefined"
version := "1.0.0-SNAPSHOT"
organization := "com.github.mlangc"
scalaVersion := "2.12.2"

libraryDependencies += "com.beachape" %% "enumeratum" % "1.5.12"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test" 
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"

libraryDependencies += "com.lihaoyi" % "ammonite" % "0.8.5" % "test" cross CrossVersion.full
initialCommands in (Test, console) := """ammonite.Main().run()"""

scalacOptions := Seq("-encoding", "utf8", "-feature", "-deprecation", "-opt:l:project", "-Ywarn-unused", "-Ywarn-dead-code", "-Ywarn-unused-import")

updateOptions := updateOptions.value.withCachedResolution(true)
