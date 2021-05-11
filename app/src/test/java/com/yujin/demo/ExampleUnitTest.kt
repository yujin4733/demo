package com.yujin.demo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun main() = runBlocking {
        flow {
            emit(1)
            emit(3)
            throw RuntimeException()
            emit(5)
        }.onCompletion { cause ->
            if (cause != null)
                println("Flow completed exceptionally")
            else
                println("Done")
        }.catch {
            println("catch exception")
        }.collect { println(it) }

    }

    @Test
    fun main2() = runBlocking {

        val result = arrayListOf<Int>()
        for (index in 1..100) {
            result.add(index)
        }

        //并行执行
        result.asFlow()
            .flatMapMerge {
                flow {
                    emit(it)
                }
                    .flowOn(Dispatchers.IO)
            }
            .collect { println("$it") }

    }

    @Test
    fun main3() = runBlocking {
        val result = arrayListOf<Int>()
        for (index in 1..100) {
            result.add(index)
        }

        result.asFlow()
            .flowOn(Dispatchers.IO)
            .collect { println("$it") }
    }


}