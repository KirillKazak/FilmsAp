package com.kazak.kirill.filmsap.api

import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsModel
import com.kazak.kirill.filmsap.utils.Constants.API_KEY
import retrofit2.http.GET

interface FilmsApi {
    @GET("/3/search/movie?api_key=$API_KEY&query=popular&language=en")
    suspend fun getPopularFilms(): List<PopularFilmsModel>
}