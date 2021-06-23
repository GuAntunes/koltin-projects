package br.com.gustavoantunes.testes

import java.math.BigDecimal

class RealizaCalculo {

    fun soma(x: BigDecimal, y: BigDecimal) = x + y

    fun isPalindrome(inputString: String): Boolean {
        return if (inputString.length == 0) {
            true
        } else {
            val firstChar = inputString[0]
            val lastChar = inputString[inputString.length - 1]
            val mid = inputString.substring(1, inputString.length - 1)
            firstChar == lastChar && isPalindrome(mid)
        }
    }
}