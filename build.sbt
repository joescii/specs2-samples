scalaVersion := "2.11.7"
lazy val scala_xml              = "org.scala-lang.modules"     %% "scala-xml"         % "1.0.5"
lazy val specs2      = "org.specs2"                 %% "specs2"                   % "3.7"  % "test"
libraryDependencies ++= Seq(scala_xml, specs2)
