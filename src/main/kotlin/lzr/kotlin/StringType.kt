package lzr.kotlin

val aString:String = "abc"
val anotherString:String = "abc"
val arg1:Int = 100
val arg2:Int = 138
val name:String = "zile"

val arrayString:String = String(charArrayOf('a','b','c'))


fun main(args: Array<String>) {
    println("比较字符串内容是否相等="+(aString == arrayString))
    println("比较字符串对象是否相等="+(aString === arrayString))
    //字符串模板
    println("$arg1 + $arg2 = ${arg1+ arg2}")
    println("Hello $name")

}