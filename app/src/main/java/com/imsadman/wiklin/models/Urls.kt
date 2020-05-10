package com.imsadman.wiklin.models

object Urls {
    val BaseUrl = "https://en.wikipedia.org/w/api.php";

    fun getSearchUrl(term: String, skip: Int, take: Int): String {
        return BaseUrl + "?action=query" +
                "&formatversion=2" +
                "&generator=prefixsearch" +
                "&gpssearch=$term" +
                "&gpslimit=$take" +
                "&gpsoffset=$skip" +
                "&prop=pageimages|info"
    }
}