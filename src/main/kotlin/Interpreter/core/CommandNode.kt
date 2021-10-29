/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.core

class CommandNode : Node {
    private var node: Node? = null

    override fun parse(context: Context) {
        if (context.currentToken == "repeat") {
            node = RepeatCommandNode()
            node!!.parse(context)
        } else {
            node = PrimitiveCommandNode()
            node!!.parse(context)
        }
    }

    override fun toString(): String {
        return node.toString()
    }
}