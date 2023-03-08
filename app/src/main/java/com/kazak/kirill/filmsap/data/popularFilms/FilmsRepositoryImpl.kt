package com.kazak.kirill.filmsap.data.popularFilms

import com.kazak.kirill.filmsap.api.ApiConfig
import com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity.PopularFilmsListEntity
import com.kazak.kirill.filmsap.data.popularFilms.storage.PopularFilmsStorage
import com.kazak.kirill.filmsap.domain.FilmsRepository
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity

class FilmsRepositoryImpl(private val popularFilmsStorage: PopularFilmsStorage): FilmsRepository {

    private val popularFilmsMapper =  PopularFilmsMapper()

    override fun getPopularFilmsList(): List<PopularFilmsEntity> {
        TODO("Not yet implemented")
    }

    private suspend fun getPopularFilmsFromRemote() =
        ApiConfig().filmsApi.getPopularFilms()

    private suspend fun savePopularFilms() {
        popularFilmsStorage.savePopularFilmList(
            PopularFilmsListEntity(
                listId = 1,
                popularFilmsMapper.mapPopularFilmsModelListToEntityList(getPopularFilmsFromRemote)
            )
        )
    }
}