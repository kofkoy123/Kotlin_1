package lzr.kotlin

import lzr.kotlin.City.Sh.Shuji

val arrayOfInt: IntArray = intArrayOf(1, 2, 3, 4, 5)
val arrayOfShort: ShortArray = shortArrayOf(1, 2, 3, 4)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("我", "是", "中", "国人")
val arrayOfObj: Array<Shuji> = arrayOf(Shuji("黄"), Shuji("邓"), Shuji("冯"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)

    println(arrayOfChar.joinToString(""))

    println(arrayOfShort.slice(1..2))
    for (str in arrayOfString)
        println(str)
    for (shuji in arrayOfObj)
        println(shuji.toString())
    println(arrayOfObj[2])
    arrayOfObj[2] = Shuji("张")
    println(arrayOfObj[2])
}

