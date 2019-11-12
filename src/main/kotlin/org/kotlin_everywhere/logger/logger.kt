package org.kotlin_everywhere.logger

import org.slf4j.Logger

inline fun Logger.trace(msg: () -> String) {
    if (isTraceEnabled) {
        trace(msg())
    }
}

inline fun Logger.debug(msg: () -> String) {
    if (isDebugEnabled) {
        debug(msg())
    }
}

inline fun Logger.info(msg: () -> String) {
    if (isInfoEnabled) {
        info(msg())
    }
}

inline fun Logger.warn(msg: () -> String) {
    if (isWarnEnabled) {
        warn(msg())
    }
}

inline fun Logger.error(msg: () -> String) {
    if (isInfoEnabled) {
        error(msg())
    }
}

@JvmName("errorThrowable")
inline fun Logger.error(msg: () -> Pair<String, Throwable>) {
    if (isInfoEnabled) {
        error(msg())
    }
}
