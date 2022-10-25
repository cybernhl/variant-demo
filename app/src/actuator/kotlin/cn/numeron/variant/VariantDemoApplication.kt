package cn.numeron.variant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class VariantDemoApplication {

    @GetMapping("say-hello")
    fun sayHello(): String {
        return "Hello world!"
    }

}

fun main(args: Array<String>) {
    runApplication<VariantDemoApplication>(*args)
}
