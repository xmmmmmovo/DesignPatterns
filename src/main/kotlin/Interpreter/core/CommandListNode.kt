/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.core


class CommandListNode : Node {
    private val list = ArrayList<CommandNode>()
    override fun parse(context: Context) {
        while (true) {
            if (context.currentToken == null) {
                throw ParseException("Missing 'end'")
            } else if (context.currentToken == "end") {
                context.skipToken("end")
                break
            } else {
                val commandNode = CommandNode()
                commandNode.parse(context)
                list.add(commandNode)
            }
        }
    }

    override fun toString(): String {
        return list.toString()
    }
}