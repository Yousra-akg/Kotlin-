package com.solicode.kotlinessentiel.demo

class Person(val name: String, val age: Int) {
    fun isAdult() = age >= 18
}
fun greet(name: String) = println("Bonjour, $name")

fun checkAge(age: Int) =
    if (age >= 18) "Majeur" else "Mineur"
data class Counter(val count: Int = 0) {
    fun increment() = copy(count = count + 1)
}
fun main() {
    val person = Person("yousra", 20)
    greet(person.name)
    println("${person.name} est ${checkAge(person.age)}")

    val c1 = Counter()
    val c2 = c1.increment()
    println("c1=$c1, c2=$c2")
}
