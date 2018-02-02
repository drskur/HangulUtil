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

  val QUERTY_JASO_MAP: Map[String, String] = Map(
    "q" -> "ㅂ", "Q" -> "ㅃ",
    "w" -> "ㅈ", "W" -> "ㅉ",
    "e" -> "ㄷ", "E" -> "ㄸ",
    "r" -> "ㄱ", "R" -> "ㄲ",
    "t" -> "ㅅ", "T" -> "ㅆ",
    "y" -> "ㅛ", "Y" -> "ㅛ",
    "u" -> "ㅕ", "U" -> "ㅕ",
    "i" -> "ㅑ", "I" -> "ㅑ",
    "o" -> "ㅐ", "O" -> "ㅒ",
    "p" -> "ㅔ", "P" -> "ㅖ",
    "a" -> "ㅁ", "A" -> "ㅁ",
    "s" -> "ㄴ", "S" -> "ㄴ",
    "d" -> "ㅇ", "D" -> "ㅇ",
    "f" -> "ㄹ", "F" -> "ㄹ",
    "g" -> "ㅎ", "G" -> "ㅎ",
    "h" -> "ㅗ", "H" -> "ㅗ",
    "j" -> "ㅓ", "J" -> "ㅓ",
    "k" -> "ㅏ", "K" -> "ㅏ",
    "l" -> "ㅣ", "L" -> "ㅣ",
    "z" -> "ㅋ", "Z" -> "ㅋ",
    "x" -> "ㅌ", "X" -> "ㅌ",
    "c" -> "ㅊ", "C" -> "ㅊ,",
    "v" -> "ㅍ", "V" -> "ㅍ",
    "b" -> "ㅠ", "B" -> "ㅠ",
    "n" -> "ㅜ", "N" -> "ㅜ",
    "m" -> "ㅡ", "M" -> "ㅡ"
  )

}
