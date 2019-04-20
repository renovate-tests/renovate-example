package com.github.bigmichi1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.ArithmeticException

class MainKtTest {
    @Test
    fun divisionByZeroError() {
        val exception = assertThrows<ArithmeticException> {
            1 / 0
        }
        assertEquals("/ by zero", exception.message)
    }
}