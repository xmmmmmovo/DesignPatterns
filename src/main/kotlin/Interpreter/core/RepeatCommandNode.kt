/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.core

class RepeatCommandNode : Node {
    private var number: Int = 0
    private val commandNode: CommandNode = CommandNode()

    override fun parse(context: Context) {
        context.skipToken("repeat")
        number = context.currentNumber()
        context.nextToken()
        commandNode.parse(context)
    }

    override fun toString(): String {
        return "[repeat $number $commandNode]"
    }
}