package lzr.kotlin

val range:IntRange = 0..100 //[0,100]
val range_ex:IntRange = 0 until 100 //[0,100)
val empty_range:IntRange = 0..-1  //[0,-1]

fun main(args: Array<String>) {
    println(50 in range)
    println(range_ex.contains(100))

    println(empty_range.isEmpty())
    for (i in range_ex)
        print("$i,")
}