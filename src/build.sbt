publishMavenStyle := true

pomIncludeRepository := { _ => false }

scalaVersion := "2.11.7"

version := "2.0.4"

name := "scalamodules_2.11"

val OsgiVersion = "4.2.0"
val PaxExamVersion = "1.2.3"
val Slf4jVersion = "1.6.1"

val (specsVersion, mockitoVersion, slf4sVersion) = scalaVersion match {
  case "2.11.7" => ("1.6.9","1.8.5","1.0.7")
  case _ => error("No clue what versions for specs and mockito to use!")
}
libraryDependencies ++= Seq(
"com.weiglewilczek.slf4s" %% "slf4s" % slf4sVersion withSources,

// Provided
 "org.osgi" % "org.osgi.core" % OsgiVersion % "provided" withSources,
"org.osgi" % "org.osgi.compendium" % OsgiVersion % "provided" withSources,

// Test
"org.scala-tools.testing" %% "specs" % specsVersion % "test" withSources,
"org.mockito" % "mockito-all" % mockitoVersion % "test" withSources,
"org.slf4j" % "slf4j-simple" % Slf4jVersion % "test" intransitive,

// Test (Pax Exam)
"org.ops4j.pax.exam" % "pax-exam" % PaxExamVersion % "test",
 "org.ops4j.pax.exam" % "pax-exam-junit" % PaxExamVersion % "test",
"org.ops4j.pax.exam" % "pax-exam-container-default" % PaxExamVersion % "test"
)


