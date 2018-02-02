package com.github.drskur.HangulUtil

import java.text.Normalizer

class HangulJaso extends HangulMapping {

  def isHangul(char: Char): Boolean =
    char >= '가' && char <= '힣'

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



}

object HangulJaso {

  def apply(): HangulJaso = new HangulJaso()

}
