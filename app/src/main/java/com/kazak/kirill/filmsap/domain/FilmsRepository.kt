package com.kazak.kirill.filmsap.domain

import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity

interface FilmsRepository {

    fun getPopularFilmsList(): List<PopularFilmsEntity>
}