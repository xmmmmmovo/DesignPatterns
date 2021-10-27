/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.listfactory

import abstract_factory.factory.Tray

class ListTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        return "<li>\n$caption\n<ul>\n${tray.joinToString { it.makeHTML() }}</ul>\n</li>\n"
    }
}