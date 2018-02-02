package com.github.drskur.HangulUtil

object implicits {

  implicit class HangulOps(value: String) {

    def disassemble: String = HangulJaso().disassemble(value)

    def quertyToJaso: String = HangulJaso().quertyToJaso(value)

  }

}
