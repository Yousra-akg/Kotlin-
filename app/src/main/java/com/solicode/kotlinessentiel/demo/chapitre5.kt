package com.solicode.kotlinessentiel.demo

fun main() {
    val tags: List<String> = listOf("android", "kotlin", "compose") // immuable
    val bag: MutableList<Int> = mutableListOf(1, 2, 2)              // modifiable

    val uniq: Set<String> = setOf("kotlin", "kotlin", "compose")    // {"kotlin","compose"}
    val counts: MutableMap<String, Int> = mutableMapOf("done" to 3)

    // for-each simple
    for (t in tags) println("tag=$t")

    // index + valeur
    for ((i, t) in tags.withIndex()) println("$i → $t")

    // Déstructuration Map
    val counts2 = mapOf("done" to 3, "todo" to 5)
    for ((k, v) in counts2) println("$k = $v")

    // Version fonctionnelle
    tags.forEach { println("• $it") }

    println("tags=$tags")
    println("bag avant: $bag")
    bag.add(2)
    println("bag après: $bag")
    println("uniq=$uniq")
    println("counts=$counts")
}