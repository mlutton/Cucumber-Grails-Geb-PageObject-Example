package pages

import geb.Page


class AmazonHomePage extends Page {
    static url = "http://www.amazon.com"

    static at = {
        title.contains("Amazon.com")
    }

    static content = {
        headerImage  { $("nav-logo").url}
    }
}