package com.solicode.kotlinessentiel.demo

class PersonClassic(val name: String, val age: Int) {

    // Override de equals() et hashCode() manuellement
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersonClassic) return false
        return name == other.name && age == other.age
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + age
    }

    // Fonction copy manuelle (pas automatique ici)
    fun copy(name: String = this.name, age: Int = this.age): PersonClassic {
        return PersonClassic(name, age)
    }

    override fun toString(): String = "PersonClassic(name=$name, age=$age)"
}
