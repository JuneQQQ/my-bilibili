package com.june.video

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class VideoApplication

fun main(args: Array<String>) {
    runApplication<VideoApplication>(*args)
}
