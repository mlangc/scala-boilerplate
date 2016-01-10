name := "undefined"

version := "1.0.0-SNAPSHOT"

organization := "com.github.mlangc"

scalaVersion := "2.11.7"

scalacOptions := Seq("-encoding", "utf8", "-feature", "-deprecation", "-optimise", "-target:jvm-1.8", "-Ywarn-unused", "-Ywarn-dead-code", "-Ywarn-unused-import")

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

libraryDependencies += "com.beachape" %% "enumeratum" % "1.3.6"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test" 

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.5" % "test"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/releases"
