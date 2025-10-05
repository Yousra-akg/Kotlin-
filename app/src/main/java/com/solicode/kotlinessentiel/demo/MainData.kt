package com.solicode.kotlinessentiel.demo

// MainData.kt
fun main() {
    val p1 = PersonData("Yousra", 25)
    val p2 = PersonData("Yousra", 25)
    val p3 = p1.copy(age = 26)

    println("p1 == p2 ? ${p1 == p2}") // true, automatique
    println("p3 = $p3")

    // déstructuration
    val (name, age) = p1
    println("Nom: $name, Âge: $age")

    // utilisation dans un Set
    val set = setOf(p1, p2, p3)
    println("Set contient ${set.size} éléments") // 2 éléments car p1 et p2 égaux

    // Utilisation dans une Map
    val map = mapOf(p1 to "User1", p3 to "User2")
    println(map)
}
