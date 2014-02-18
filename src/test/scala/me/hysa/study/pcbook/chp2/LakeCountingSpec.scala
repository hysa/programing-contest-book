/*
 * programing-contest-book
 * User: hysa
 * Date: 2014/02/18
 */
package me.hysa.study.pcbook.chp2

import org.specs2.mutable._

/**
 * LakeCountingSpec
 *
 */
class LakeCountingSpec extends Specification {

  "LakeCounting" should {
    "簡単な例" in {
      new LakeCounting(
        x = 4, y = 5,
        Array(
          Array(0, 0, 0, 0),
          Array(0, 1, 1, 1),
          Array(0, 1, 0, 0),
          Array(0, 0, 0, 0),
          Array(0, 0, 1, 0)
        )
      ).solve() mustEqual 2
    }

    "p.35の例" in {
      new LakeCounting(
        x = 12, y = 10,
        Array(
          Array(1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0),
          Array(0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1),
          Array(0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0),
          Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0),
          Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
          Array(0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0),
          Array(0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0),
          Array(1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0),
          Array(0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0),
          Array(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0)
        )
      ).solve() mustEqual 3
    }
  }
}
