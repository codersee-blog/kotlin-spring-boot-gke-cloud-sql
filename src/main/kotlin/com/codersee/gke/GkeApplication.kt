package com.codersee.gke

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GkeApplication

fun main(args: Array<String>) {
    runApplication<GkeApplication>(*args)
}
