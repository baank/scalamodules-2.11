publishMavenStyle := true

pomIncludeRepository := { _ => false }

scalaVersion := "2.11.7"

version := "2.0.4"

name := "scalamodules_2.11"

publishTo <<= version { v: String =>
  val nexus = "https://nexus.ad.colesfinancialservices.com.au/"
  Some("colesfs-libraries" at nexus + "content/repositories/colesfs-libraries")
}