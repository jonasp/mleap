package ml.combust.mleap

import sbt.Keys._
import sbt._
import sbtprotoc.ProtocPlugin.autoImport.PB

object Protobuf {
  lazy val bundleSettings = Seq(PB.targets in Compile := Seq(scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value),
    PB.includePaths in Compile := Seq(file("bundle-protobuf/bundle")),
    PB.protoSources in Compile := Seq(file("bundle-protobuf/bundle")))

  lazy val mleapSettings = Seq(PB.targets in Compile := Seq(scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value),
    PB.includePaths in Compile := Seq(file("bundle-protobuf/mleap")),
    PB.protoSources in Compile := Seq(file("bundle-protobuf/mleap")))
}
