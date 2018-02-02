package com.github.drskur.HangulUtil

trait HangulMapping {

  val CHOSUNG = Vector(
    'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
  )

  val JUNGSUNG = Vector(
    'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'
  )

  val JUNGSUNG_LENGTH: Int = JUNGSUNG.length

  val JONGSUNG = Vector(
    ' ', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ',
    'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
  )

  val JONGSUNG_LENGTH: Int = JONGSUNG.length

  val SS_JASO_MAP: Map[String, List[String]] = Map(
    "ㄲ" -> List("ㄱ", "ㄱ"),
    "ㄸ" -> List("ㄷ", "ㄷ"),
    "ㅃ" -> List("ㅂ", "ㅂ"),
    "ㅆ" -> List("ㅅ", "ㅅ"),
    "ㅉ" -> List("ㅈ", "ㅈ"),
    "ㅘ" -> List("ㅗ", "ㅏ"),
    "ㅙ" -> List("ㅗ", "ㅐ"),
    "ㅝ" -> List("ㅜ", "ㅓ"),
    "ㅞ" -> List("ㅜ", "ㅔ"),
    "ㅟ" -> List("ㅜ", "ㅣ"),
    "ㅢ" -> List("ㅡ", "ㅣ"),
    "ㄳ" -> List("ㄱ", "ㅅ"),
    "ㄵ" -> List("ㄴ", "ㅈ"),
    "ㄶ" -> List("ㄴ", "ㅎ"),
    "ㄺ" -> List("ㄹ", "ㄱ"),
    "ㄻ" -> List("ㄹ", "ㅁ"),
    "ㄼ" -> List("ㄹ", "ㅂ"),
    "ㄽ" -> List("ㄹ", "ㅅ"),
    "ㄾ" -> List("ㄹ", "ㅌ"),
    "ㄿ" -> List("ㄹ", "ㅍ"),
    "ㅀ" -> List("ㄹ", "ㅎ"),
    "ㅄ" -> List("ㅂ", "ㅅ")
  )

}
