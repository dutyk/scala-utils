import sbt._
import Keys._

version := "1.0"

scalaVersion := "2.11.7"

lazy val commonSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"))

lazy val utils = (project in file("scala-utils"))
  .settings(commonSettings: _*)
