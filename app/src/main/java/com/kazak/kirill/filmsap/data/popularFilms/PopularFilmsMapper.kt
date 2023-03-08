package com.kazak.kirill.filmsap.data.popularFilms

import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsModel

class PopularFilmsMapper {

    private fun mapPopularFilmsModelToEntity(popularFilmModel: PopularFilmsModel) {
        PopularFilmsEntity(
            page = popularFilmModel.page,
            results = popularFilmModel.results,
            total_pages = popularFilmModel.total_pages,
            total_results = popularFilmModel.total_results
        )
    }

    fun mapPopularFilmsModelListToEntityList(popularFilmsListModel: List<PopularFilmsModel>) =
        popularFilmsListModel.map {
            mapPopularFilmsModelToEntity(it)
        }
}