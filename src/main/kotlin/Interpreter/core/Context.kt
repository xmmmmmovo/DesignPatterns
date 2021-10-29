/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.core

import java.util.*
import kotlin.NumberFormatException

class Context(text: String) {
    private val tokenizer: StringTokenizer = StringTokenizer(text)
    private var _currentToken: String? = ""

    val currentToken
        get() = _currentToken

    init {
        nextToken()
    }

    fun nextToken(): String? {
        _currentToken = if (tokenizer.hasMoreTokens()) tokenizer.nextToken() else null
        return _currentToken
    }

    fun skipToken(token: String) {
        if (currentToken != token) {
            throw ParseException("Warning: $token is expected, but $currentToken is found")
        }
        nextToken()
    }

    fun currentNumber(): Int {
        return try {
            currentToken?.toInt() ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            throw ParseException("Warning: $e")
        }
    }
}