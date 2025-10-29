package com.example.marsphotos.fake

import com.example.marsphotos.model.MarsPhoto

object FakeDataSource {
    const val idOne = "img1"
    const val idTwo = "img2"
    const val idThree = "img3"
    const val imgOne = "url.1"
    const val imgTwo = "url.2"
    const val imgThree = "url.3"
    val photosList = listOf(
        MarsPhoto(
            id = idOne,
            imgSrc = imgOne
        ),
        MarsPhoto(
            id = idTwo,
            imgSrc = imgTwo
        ),
        MarsPhoto(
            idThree,
            imgThree
        ),
    )
}