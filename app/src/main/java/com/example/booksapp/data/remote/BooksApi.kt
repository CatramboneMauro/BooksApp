package com.example.booksapp.data.remote

interface BooksApi {

    @GET()
    suspend fun searchBook(
        @Query
    )
    companion object {
        const val BASE_URL = "https://us.openfoodfacts.org/"
    }
}
