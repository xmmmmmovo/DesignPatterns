/*
 * Copyright (c) xmmmmmovo 2021.
 */

package abstract_factory.listfactory

import abstract_factory.factory.Factory
import abstract_factory.factory.Link
import abstract_factory.factory.Page
import abstract_factory.factory.Tray

class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }

}