package com.joescii

import org.specs2.matcher.XmlMatchers
import org.specs2.mutable.Specification

object XmlSpec extends Specification with XmlMatchers {
  "Xml Spec".title

  "beEqualToIgnoringSpace" should {
    "check the order of nodes" in {
      val a =
        <parent>
          <order></order>
          <matters></matters>
        </parent>

      val b =
        <parent>
          <matters></matters>
          <order></order>
        </parent>

      a must beEqualToIgnoringSpace(b)
    }

    "just like equals does" in {
      val a =
        <parent>
          <order></order>
          <matters></matters>
        </parent>

      val b =
        <parent>
          <matters></matters>
          <order></order>
        </parent>

      a must beEqualTo(b)
    }
  }
}
