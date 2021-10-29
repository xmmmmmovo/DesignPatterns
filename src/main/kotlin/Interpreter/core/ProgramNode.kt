/*
 * Copyright (c) xmmmmmovo 2021.
 */

package Interpreter.core

class ProgramNode : Node {
    private var commandListNode = CommandListNode()
    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode.parse(context)
    }

    override fun toString(): String {
        return "[program $commandListNode]"
    }

}