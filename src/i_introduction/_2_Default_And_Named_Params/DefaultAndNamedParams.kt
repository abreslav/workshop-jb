package i_introduction._2_Default_And_Named_Params

import util.TODO
import i_introduction._1_Functions.task1

fun bar(i: Int, s: String = "", b: Boolean = true) {}

fun usage() {
    bar(1, b = false)
}

fun todoTask2_1() = TODO(
        task = """Task2(1).
        Rewrite all overloaded functions 'JavaCode2.foo' to one function 'foo' in Kotlin using default parameters.
        Uncomment the commented code and make it compile.""",
        references = { (name: String) -> JavaCode2().foo(name); foo(name) })

fun foo(name: String): String = todoTask2_1()

fun task2_1() {
    todoTask2_1()
//    ( foo("a")
//    + foo("b", number = 1)
//    + foo("c", toUpperCase = true)
//    + foo(name = "d", number = 2, toUpperCase = true))
}
