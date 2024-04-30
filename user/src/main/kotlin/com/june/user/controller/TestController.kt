package com.june.user.controller

import jakarta.annotation.Resource
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class TestController {
    companion object{
        val logger: Logger = LoggerFactory.getLogger(TestController::class.java)
    }
    @Resource
    lateinit var mongoTemplate: MongoTemplate

    @GetMapping("/test")
    fun test(): String {
        val l1 = System.currentTimeMillis()
//        mongoTemplate.createCollection("test")
        mongoTemplate.save(TestUser(Random.nextInt(), "T"), "test")

        val l2 = System.currentTimeMillis()
        logger.info((l2-l1).toString())
        return "AAA"
    }
}

data class TestUser(val id: Int, val name: String)
