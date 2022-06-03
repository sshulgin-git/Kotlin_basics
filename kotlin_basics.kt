

//  Задание 1

fun odd_or_even(value: Int): String {
    return if (value % 2 == 0) "Even" else "Odd"
}

// Задание 2
fun four_multiply(value: Int): Int {
    return if (value % 2 == 0) value * 4 else value * 5
}

// Задание 3
fun int_negative(value: Int): Int {
    return if(value < 0) value else -value
}

// Задание 4
fun year_century(value: Int): Int {
    return (value + 99) / 100
}

// Задание 5
fun list_min(list: List<Int>): Int {
   return list.minOf { it } 
}

// Задание 6
fun list_two_max(list: List<Int>): List<Int> {
    var first: Int = Integer.MIN_VALUE
    var second: Int = Integer.MIN_VALUE

    for(value in list) {
        if(value > second) {
            first = second
            second = value
        }
        else if(value > first) {
            first = value
        }
    }
    return listOf(first, second)
}

// Задание 7
fun list_sum(list: List<Int>?): List<Int> {
    if(list.isNullOrEmpty())
        return listOf()

    var negative_value: Int = 0
    var positive_count: Int = 0

    for(value in list) {
        if(value <= 0) 
            negative_value += value 
        else 
            positive_count += 1
    }
    return listOf(positive_count, negative_value)
}

// Задание 8
fun count_vowels(string: String): Int {
    return string.lowercase().filter { it in "aeiouy" }.length
}

// Задание 9
fun middle_letters(string: String): String {
    val strlen: Int = string.length

    if(strlen < 2) {
        return string
    }
    else {
        if(strlen % 2 == 0)
            return string.substring((strlen / 2) - 1, (strlen / 2) + 1)
        else 
            return string[strlen / 2].toString()
    }
}

// Задание 10
fun multiplication_table(value: Int): List<MutableList<Int>> {
    val table = Array(value, { mutableListOf<Int>() })

    for(row in 0..value - 1) {
        for(cell in 0..value - 1) {
            if(row == 0)
                table[row].add(cell + 1)
            else
                table[row].add(if(cell == 0) row + 1 else (row + 1) * (cell + 1))
        }
    }
    return table.toList()
}

fun main() {
    println("Задание 1:")
    println(odd_or_even(5))
    println(odd_or_even(2))

    println("Задание 2:")
    println(four_multiply(3))
    println(four_multiply(1))

    println("Задание 3:")
    println(int_negative(4))
    println(int_negative(-5))

    println("Задание 4:")
    println(year_century(2001))
    println(year_century(2000))

    println("Задание 5:")
    println(list_min(listOf(34, 15, 88, 2)))

    println("Задание 6:")
    println(list_two_max(listOf(1, 5, 87, 45, 8, 8)))
    
    println("Задание 7:")
    println(list_sum(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
    println(list_sum(null))
    println(list_sum(listOf()))

    println("Задание 8:")
    println(count_vowels("Kotlin"))
    println(count_vowels("Hello world"))

    println("Задание 9:")
    println(middle_letters("test"))
    println(middle_letters("Student"))
    println(middle_letters("M"))
    println(middle_letters("MO"))

    println("Задание 10:")
    println(multiplication_table(3))
    println(multiplication_table(5))
}