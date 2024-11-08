package base

import kotlin.test.Test

/**
 * @author sunlulu.tomato
 * @date 11/08/2024
 */
class LoggingTest {

    @Test
    fun testLogging() {
        Logging.v("LoggingTest", "Hello World!")
        Logging.i("LoggingTest", "Hello World!")
        Logging.d("LoggingTest", "Hello World!")
        Logging.w("LoggingTest", "Hello World!")
        Logging.e("LoggingTest", "Hello World!")
    }
}