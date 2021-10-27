/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.listfactory

import abstract_factory.factory.Page

class ListPage(title: String, author: String) : Page(title, author) {
    override fun makeHTML(): String {
        return "<html><head><title>$title</title></head>\n<body>\n<h1>$title</h1>\n<ul>\n${
            content.joinToString {
                it.makeHTML()
            }
        }</ul>\n<hr><address>$author</address></body></html>"
    }

}