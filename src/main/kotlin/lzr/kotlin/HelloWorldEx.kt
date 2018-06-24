package lzr.kotlin

val FINAL_HELLO_WORLD :String = "Hello World"
var hello_world :String = FINAL_HELLO_WORLD
var helloNullAble:String? = hello_world
val size :Int = helloNullAble!!.length
val longSize:Long = size.toLong() //强转

fun main(args: Array<String>) {

}