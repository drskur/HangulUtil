package com.github.drskur.HangulUtil
import org.scalatest._

class HangulJasoSpec extends FlatSpec with Matchers {

  "isHangul" should "return true, when enter hangul char" in {
    HangulJaso().isHangul('가') should be (true)
    HangulJaso().isHangul('힣') should be (true)
  }

  "isHangul" should "return false, when enter non hangul char" in {
    HangulJaso().isHangul('a') should be (false)
    HangulJaso().isHangul('.') should be (false)
  }

  "assemble" should "return separated jaso string" in {
    HangulJaso().disassemble('한') should be ("ㅎㅏㄴ")
    HangulJaso().disassemble('글') should be ("ㄱㅡㄹ")
    HangulJaso().disassemble("한글") should be ("ㅎㅏㄴㄱㅡㄹ")
  }

}
