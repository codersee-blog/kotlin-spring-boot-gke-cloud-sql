package com.codersee.gke.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {

    @GetMapping("/hello")
    fun getHelloMessage(): ResponseEntity<String> = ResponseEntity.ok("Hello world!")

    @GetMapping("/status")
    fun getStatus(): ResponseEntity<String> = ResponseEntity.ok("OK")
}
