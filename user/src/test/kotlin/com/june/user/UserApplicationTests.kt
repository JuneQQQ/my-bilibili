package com.june.user

import jakarta.annotation.Resource
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.mongodb.core.MongoTemplate
import kotlin.random.Random

@SpringBootTest
class UserApplicationTests {
    @Resource
    lateinit var mongoTemplate: MongoTemplate

    @Test
    fun contextLoads() {
        println(mongoTemplate.db)
        mongoTemplate.save(TestUser(Random.nextInt(),"T"),"test")
    }
}

data class TestUser(val id: Int, val name: String) {

}
