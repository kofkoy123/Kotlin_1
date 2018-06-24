package lzr.kotlin

open class Language(var type: String) {
    init {
        println("我今天学习了一门计算机语言，它的名字叫${this.javaClass.simpleName}，它是一门${type}的语言")
    }
}

class Kotlin(type: String) : Language(type) {

    //返回类型后面加个问号表示可以为null
    //不加不能返回null
    fun getName(): String? {
        return null
    }
}

class Java(type: String) : Language(type)

open class Person {
    init {
        println("认识了一个${this.javaClass.simpleName}")
    }
}

class Boy : Person(){
    fun getAge():Int{
        return 10
    }
}


fun main(args: Array<String>) {
    val kotlin: Kotlin = Kotlin("面向对象")
    val java: Java = Java("面向对象")
    val boy: Boy = Boy()
    println(kotlin is Language)
    println(boy is Person)
    //如果方法返回的为null 就直接return
//    val name :String = kotlin.getName() ?: return
//    println(name.length)
    //类型后面加个问号表示可以为空
    val nullName :String? = "小红"
    //因为声明可以为null，所以调用会报错，必须认证不能为null
    println(nullName !!.length)
    //又或者 下面两种判断都可以直接调用
    if (nullName is String)
        println(nullName.length)
    if (nullName != null)
        println(nullName.length)
    val person:Person = Boy()
    //如果判断到person是boy的类型就不要在强转直接调用方法
    if (person is Boy){
        println(person.getAge())
    }

    val castPerson :Person = Person()
    //强转 下面强转会出现异常
//    val castBoy:Boy? = castPerson as Boy
    //这样强转不会异常 失败会返回null
    val notNullBoy :Boy? = castPerson as? Boy
    println(notNullBoy)
}