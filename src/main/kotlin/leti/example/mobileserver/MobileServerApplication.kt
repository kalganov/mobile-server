package leti.example.mobileserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MobileServerApplication

fun main(args: Array<String>) {
	runApplication<MobileServerApplication>(*args)
}
