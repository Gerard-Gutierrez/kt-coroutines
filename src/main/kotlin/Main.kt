package com.ggutierrezvi

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object Main {
    @JvmStatic fun main(args: Array<String>) {
        println("Start")

        for (i in 0..100) {
            // Start a coroutine
            GlobalScope.launch {
                println("Started coroutine $i")
                delay(1000)
                println("Finished coroutine $i")
            }
        }

        Thread.sleep(2000) // wait for 2 seconds
        println("Stop")
    }
}
