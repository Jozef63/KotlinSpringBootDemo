package com.example.KotlinAppkaDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinAppkaDemoApplication {
	@Bean
	fun helloKotlinInSpringBoot() {
		print("hello world")
	}

}


fun main(args: Array<String>) {
	runApplication<KotlinAppkaDemoApplication>(*args)
	println("demo appka hello world")
	}
