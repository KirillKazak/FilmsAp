package com.kazak.kirill.filmsap.data.popularFilms.storage

import android.content.Context
import androidx.room.Room
import com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity.PopularFilmsListEntity
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity
import com.kazak.kirill.filmsap.utils.Constants.FILMS_DATABASE_NAME

class PopularFilmsStorageImpl(context: Context): PopularFilmsStorage {

    private val popularFilmsDatabase by lazy {
        Room.databaseBuilder(
            context,
            PopularFilmsDatabase::class.java,
            FILMS_DATABASE_NAME
        )
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }

    override fun getPopularFilmList(): PopularFilmsListEntity =
        popularFilmsDatabase.popularFilmsItemDao().getPopularFilmList()

    override fun savePopularFilmList(popularFilmsListEntity: List<Unit>) {
        popularFilmsDatabase.popularFilmsItemDao().savePopularFilmList(popularFilmsListEntity)
    }

    override fun getPopularFilmById(id: Int): PopularFilmsEntity =
        popularFilmsDatabase.popularFilmsItemDao().getPopularFilmById(id)
}