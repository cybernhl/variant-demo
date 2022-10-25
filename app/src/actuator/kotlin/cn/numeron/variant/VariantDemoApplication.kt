package cn.numeron.variant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//some annotation
@SpringBootApplication
class VariantDemoApplication

fun main(args: Array<String>) {
    runApplication<VariantDemoApplication>(*args)
}
