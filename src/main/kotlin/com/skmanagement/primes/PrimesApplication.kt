package com.skmanagement.primes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrimesApplication

fun main(args: Array<String>) {
	runApplication<PrimesApplication>(*args)
}
