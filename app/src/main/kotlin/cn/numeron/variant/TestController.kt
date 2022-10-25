package cn.numeron.variant

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("say-hello")
    fun sayHello(): String {
        return "Hello world!"
    }

}