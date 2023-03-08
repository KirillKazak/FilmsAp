package com.kazak.kirill.filmsap.domain.useCases

import com.kazak.kirill.filmsap.domain.FilmsRepository
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity

class GetPopularFilmsListUseCase(private val filmsRepository: FilmsRepository) {

    fun getPopularFilmsList(): List<PopularFilmsEntity> =
        filmsRepository.getPopularFilmsList()
}