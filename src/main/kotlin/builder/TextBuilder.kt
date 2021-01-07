/*
 * Copyright (c) xmmmmmovo 2021.
 */

package builder

class TextBuilder : Builder() {
    private val buf = StringBuffer()

    override fun makeTitle(title: String) {
        buf.append("================================\n")
        buf.append("[$title]\n\n")
    }

    override fun makeString(str: String) {
        buf.append("■$str\n\n")
    }

    override fun makeItems(items: List<String>) {
        items.forEach { s ->
            buf.append("   ·$s\n")
        }
        buf.append("\n")
    }

    override fun close() {
        buf.append("================================\n")
    }

    override fun build(): Any {
        return buf.toString()
    }


}