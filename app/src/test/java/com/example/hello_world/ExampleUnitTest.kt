package com.example.hello_world

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    fun add(x:Int, y:Int):Int{
        return x + y
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}