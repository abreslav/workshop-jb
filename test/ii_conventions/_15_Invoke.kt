package ii_conventions

import junit.framework.Assert
import org.junit.Test as test

class _15_Invoke {
    test fun testTask17() {
        Assert.assertEquals(4, task15(Invokable()))
    }

    test fun testNumberOfInvocations() {
        val message = "The number of invocations is incorrect"
        Assert.assertEquals(message, 1, Invokable()().getNumberOfInvocations())
        Assert.assertEquals(message, 5, Invokable()()()()()().getNumberOfInvocations())
        Assert.assertEquals(message, 0, Invokable().getNumberOfInvocations())
    }

    fun Invokable.invoke() = todoTask15()
    fun Invokable.getNumberOfInvocations() = todoTask15()
}
