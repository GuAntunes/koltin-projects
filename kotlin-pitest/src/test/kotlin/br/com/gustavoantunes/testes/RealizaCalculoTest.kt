package br.com.gustavoantunes.testes

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


internal class RealizaCalculoTest{

    @Test
    fun `testaSoma`(){
        val realizaCalculo = RealizaCalculo()
        val resp = realizaCalculo.soma("20.0".toBigDecimal(), "30.0".toBigDecimal())
    }

    @Test
    fun whenPalindrom_thenAccept() {
        val palindromeTester = RealizaCalculo()
        assertTrue(palindromeTester.isPalindrome("noon"))
    }
}