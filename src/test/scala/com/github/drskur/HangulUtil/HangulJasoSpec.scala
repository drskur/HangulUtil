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

  "isAlphabet" should "return true, when enter alphaber char" in {
    HangulJaso().isAlphabet('A') should be (true)
    HangulJaso().isAlphabet('z') should be (true)
  }

  "isAlphabet" should "return false, when enter non alphaber char" in {
    HangulJaso().isAlphabet('@') should be (false)
    HangulJaso().isAlphabet('.') should be (false)
  }

  "assemble" should "return separated jaso string" in {
    HangulJaso().disassemble('한') should be ("ㅎㅏㄴ")
    HangulJaso().disassemble('글') should be ("ㄱㅡㄹ")
    HangulJaso().disassemble("한글") should be ("ㅎㅏㄴㄱㅡㄹ")
    HangulJaso().disassemble("쌍자음") should be ("ㅅㅅㅏㅇㅈㅏㅇㅡㅁ")
    HangulJaso().disassemble("값") should be ("ㄱㅏㅂㅅ")
  }

  "quertyToJaso" should "return converted jaso string from querty" in {
    HangulJaso().quertyToJaso("gks") should be ("ㅎㅏㄴ")
    HangulJaso().quertyToJaso("rmf") should be ("ㄱㅡㄹ")
    HangulJaso().quertyToJaso("gksrmf") should be ("ㅎㅏㄴㄱㅡㄹ")
    HangulJaso().quertyToJaso("Tkdwkdma") should be ("ㅅㅅㅏㅇㅈㅏㅇㅡㅁ")
    HangulJaso().quertyToJaso("rkqt") should be ("ㄱㅏㅂㅅ")
  }

}
