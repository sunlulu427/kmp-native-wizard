package base

/**
 * @author sunlulu.tomato
 * @date 11/08/2024
 */
object Logging {

    enum class LoggingLevel(private val color: String) {
        VERBOSE("\u001B[37m"),
        INFO("\u001B[36m"),
        DEBUG("\u001B[32m"),
        WARNING("\u001B[33m"),
        ERROR("\u001B[31m");

        internal fun format(tag: String, message: String): String {
            return "${color}[${name.first()}] $tag: ${message}\u001B[0m"
        }
    }

    var level = LoggingLevel.VERBOSE

    private fun log(loggingLevel: LoggingLevel, tag: String, message: String) {
        if (loggingLevel.ordinal >= level.ordinal) {
            println(loggingLevel.format(tag, message))
        }
    }

    fun v(tag: String, message: String) {
        log(LoggingLevel.VERBOSE, tag, message)
    }

    fun i(tag: String, message: String) {
        log(LoggingLevel.INFO, tag, message)
    }

    fun d(tag: String, message: String) {
        log(LoggingLevel.DEBUG, tag, message)
    }

    fun w(tag: String, message: String) {
        log(LoggingLevel.WARNING, tag, message)
    }

    fun e(tag: String, message: String) {
        log(LoggingLevel.ERROR, tag, message)
    }
}