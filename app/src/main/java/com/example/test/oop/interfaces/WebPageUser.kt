package com.example.test.oop.interfaces

class WebPageUser : IUser {
    override val userId: Int = 66

    override fun foo() {
        println("Foo Method Triggered for WebPageUser")
    }

    override fun getUserIdForThis(): Int {
        return userId
    }
}