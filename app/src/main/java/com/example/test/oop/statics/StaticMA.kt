package com.example.test.oop.statics

fun main() {
    //Before Static
    /*val st = StaticPG();
    println(st.definedVariable)
    st.staticMethod()
    println(StaticPG().staticMethod())
    println(StaticPG().definedVariable)
    */

    //After Static
    println(StaticPG.staticMethod())
    println(StaticPG.definedVariable)
}