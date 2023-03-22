package com.example.core.data.repository

interface CharactersRemodeDataSource<T> {

    suspend fun fetchCharacters(queries: Map<String, String>): T
}