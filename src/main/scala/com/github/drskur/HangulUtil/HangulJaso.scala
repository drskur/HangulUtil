package com.github.drskur.HangulUtil

class HangulJaso {

  private val CHOSUNG = Vector(
    'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
  )

  private val JUNGSUNG = Vector(
    'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'
  )

  private val JUNGSUNG_LENGTH = JUNGSUNG.length

  private val JONGSUNG = Vector(
    ' ', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ',
    'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
  )

  private val JONGSUNG_LENGTH = JONGSUNG.length

  def isHangul(char: Char): Boolean =
    char >= '가' && char <= '힣'

  def disassemble(char: Char): String = {

    val diff = char.toInt - '가'.toInt

    val chosungIndex = diff / JONGSUNG_LENGTH / JUNGSUNG_LENGTH
    val jungsungIndex = diff / JONGSUNG_LENGTH % JUNGSUNG_LENGTH
    val jongsungIndex = diff % JONGSUNG_LENGTH

    val ChoJung =
      List(
        CHOSUNG(chosungIndex).toString,
        JUNGSUNG(jungsungIndex).toString
      )
    val Jong =
      if (jongsungIndex > 0) List(JONGSUNG(jongsungIndex).toString)
      else List.empty

    (ChoJung ++ Jong).mkString("")
  }

  def disassemble(str: String): String =
    str.map(disassemble).mkString("")


}

object HangulJaso {

  def apply(): HangulJaso = new HangulJaso()

}
