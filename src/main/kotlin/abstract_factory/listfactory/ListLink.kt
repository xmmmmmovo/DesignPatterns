/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.listfactory

import abstract_factory.factory.Link

class ListLink(caption: String, url: String) : Link(caption, url) {
    override fun makeHTML(): String {
        return "  <li><a href=\"$url\">$caption</a></li>\n"
    }
}