package com.vikas.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform