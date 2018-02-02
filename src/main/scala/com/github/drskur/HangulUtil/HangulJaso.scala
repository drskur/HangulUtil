package com.github.drskur.HangulUtil

class HangulJaso extends HangulMapping {

  def isHangul(char: Char): Boolean =
    // I don't want to use regex, because of performance
    char >= '가' && char <= '힣'

  def isAlphabet(char: Char): Boolean =
    // I don't want to use regex, because of performance
    (char.toInt >= 65 && char.toInt <= 90) || (char.toInt >= 97 && char.toInt <= 122)

  private def disassembleOps(char: Char): String = {
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

    (ChoJung ++ Jong)
      .flatMap { s =>
        SS_JASO_MAP.getOrElse(s, List(s))
      }
      .mkString("")
  }

  def disassemble(char: Char): String =
    if (isHangul(char)) disassembleOps(char)
    else char.toString

  def disassemble(str: String): String =
    str.map(disassemble).mkString("")

  def quertyToJasoOps(char: Char): String = {
    QUERTY_JASO_MAP.getOrElse(char.toString, char.toString).toList
      .flatMap { c =>
        SS_JASO_MAP.getOrElse(c.toString, List(c.toString))
      }
      .mkString("")
  }

  def quertyToJaso(char: Char): String =
    if (isAlphabet(char)) quertyToJasoOps(char)
    else char.toString

  def quertyToJaso(str: String): String =
    str.map(quertyToJaso).mkString("")


}

object HangulJaso {

  def apply(): HangulJaso = new HangulJaso()

}
