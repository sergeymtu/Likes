package ru.netology

fun main() {

    val likes: Int = 111
    if (likes == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 1 && likes < 21) {
        println("Понравилось $likes людям")
    } else if (likes > 20 && likes < 100 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 20 && likes < 100 && likes % 10 !== 1) {
        println("Понравилось $likes людям")
    } else if (likes > 100 && likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else if (likes > 100 && likes % 20 < 21 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else if (likes > 100 && likes % 20 < 21 && likes % 10 !== 1) {
        println("Понравилось $likes людям")
    } else {
        println("еще вариант")
    }

}