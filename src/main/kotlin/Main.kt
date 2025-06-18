package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    println(doc.title())

    val newElements: Elements = doc.select("article")

    for (elements: Element in newElements) {
        println("${elements.select("div > div > div")}")
    }

}