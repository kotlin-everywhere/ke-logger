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

inline fun Logger.error(throwable: Throwable? = null, msg: () -> String) {
    if (isInfoEnabled) {
        if (throwable != null) {
            error(msg(), throwable)
        } else {
            error(msg())
        }
    }
}
