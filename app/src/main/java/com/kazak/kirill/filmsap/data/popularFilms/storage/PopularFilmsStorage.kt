package com.kazak.kirill.filmsap.data.popularFilms.storage

import com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity.PopularFilmsListEntity
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity

interface PopularFilmsStorage {

    fun getPopularFilmList(): PopularFilmsListEntity

    fun savePopularFilmList(popularFilmsListEntity: PopularFilmsListEntity)

    fun getPopularFilmById(id: Int): PopularFilmsEntity
}