package com.github.charlesluxinger.intro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntroSpringBootWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<IntroSpringBootWithKotlinApplication>(*args)
}
