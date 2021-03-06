package i_introduction._0_Hello_World.Hello

import util.TODO

//compiles to a static function in a class HelloPackage
fun main(args: Array<String>) {
    println("Hello, world!")
}

fun todoTask0() = TODO(
        task = """Introduction.
        The task in the workshop is usually to change the function 'taskN' by replacing it's body,
        the function invocation 'todoTaskN()', with the corresponding code according to the problem.

        There are usually explanations of the Kotlin features to read at the same file as the task.
        Please read them, we prepared carefully them for you =).

        Using references you can usually navigate and see the code mentioned in the task description.

        For the start please make the function 'task0' return "OK" =).""",

        references = { task0(); "OK" }
)

fun task0(): String {
    return todoTask0()
}


