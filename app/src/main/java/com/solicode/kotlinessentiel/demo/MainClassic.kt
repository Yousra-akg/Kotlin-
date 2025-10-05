package com.solicode.kotlinessentiel.demo

fun main() {
    val p1 = PersonClassic("Yousra", 20)
    val p2 = PersonClassic("Yousra", 20)
    val p3 = p1.copy(age = 25)

    println("p1 == p2 ? ${p1 == p2}") // true (grâce à equals)
    println("p1 hashCode = ${p1.hashCode()} | p2 hashCode = ${p2.hashCode()}") // mêmes valeurs
    println("p3 = $p3")

    val set = setOf(p1, p2, p3)
    println("Set contient ${set.size} éléments") // p1 et p2 considérés égaux donc pas doublons
}
