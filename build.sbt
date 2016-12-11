name := "undefined"
version := "1.0.0-SNAPSHOT"
organization := "com.github.mlangc"
scalaVersion := "2.11.8"

libraryDependencies += "com.beachape" %% "enumeratum" % "1.5.2"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test" 
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.2.5" % "provided"

EclipseKeys.withSource := true
EclipseKeys.createSrc := EclipseCreateSrc.Default
scalacOptions := Seq("-encoding", "utf8", "-feature", "-deprecation", "-optimise", "-target:jvm-1.8", "-Ywarn-unused", "-Ywarn-dead-code", "-Ywarn-unused-import")

updateOptions := updateOptions.value.withCachedResolution(true)
