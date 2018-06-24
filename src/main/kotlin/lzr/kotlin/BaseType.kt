package lzr.kotlin

val maxByte:Byte = Byte.MAX_VALUE
val minByte:Byte = Byte.MIN_VALUE

val maxShort:Short = Short.MAX_VALUE
val minShort:Short = Short.MIN_VALUE

val maxInt:Int = Int.MAX_VALUE
val minInt:Int = Int.MIN_VALUE

val maxLong:Long = Long.MAX_VALUE
val minLong:Long = Long.MAX_VALUE

val maxFloat:Float = Float.MAX_VALUE
val minFloat:Float = -Float.MAX_VALUE

val maxDouble:Double = Double.MAX_VALUE
val minDouble:Double = -Double.MAX_VALUE


fun main(args: Array<String>) {
    println("Byte取值范围：$maxByte ~ $minByte")
    println("Short取值范围：$maxShort ~ $minShort")
    println("Int取值范围："+ maxInt+"~"+ minInt)
    println("Long取值范围："+ maxLong+"~"+ minLong)
    println("Float取值范围："+ maxFloat+"~"+ minFloat)
    println("Double取值范围："+ maxDouble+"~"+ minDouble)
}