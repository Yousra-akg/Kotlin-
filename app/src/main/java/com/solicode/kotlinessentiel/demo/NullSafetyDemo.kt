package com.solicode.kotlinessentiel.demo

fun greet(input: String?): String =
    input
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.let { "Bonjour, $it !" }
        ?: "hhhh"

fun parseCount(input: String?): Int =
    input
        ?.trim()
        ?.toIntOrNull()
        ?.coerceAtLeast(0)
        ?: 0

fun safeAt(xs: List<Int>, index: Int): Int =
    xs.getOrNull(index) ?: -1

fun parseAnyToNonNegativeInt(x: Any?): Int =
    (x as? String)?.toIntOrNull()?.coerceAtLeast(0) ?: 0

fun lengthOrZero(s: String?): Int = s?.length ?: 0


fun main() {
    println("=== DEMO Null-safety ===")

    println(greet(null))        // ""
    println(greet("  "))        // ""
    println(greet("  Ada "))    // "Bonjour, Ada !"
    println(parseCount(null))   // 0
    println(parseCount(" -5 ")) // 0
    println(parseCount(" 12 ")) // 12
    println(safeAt(listOf(10, 20), 1))  // 20
    println(safeAt(listOf(10, 20), 9))  // -1

    println(parseAnyToNonNegativeInt("42"))   // 42
    println(parseAnyToNonNegativeInt("x"))    // 0
    println(parseAnyToNonNegativeInt(null))   // 0

    println(lengthOrZero(null))     // 0
    println(lengthOrZero("Kotlin")) // 6

}