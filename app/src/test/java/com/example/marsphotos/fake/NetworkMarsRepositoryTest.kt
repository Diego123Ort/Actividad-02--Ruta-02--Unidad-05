package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import org.junit.Test
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList()=
        runTest {
        val repository= NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )
        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }

}