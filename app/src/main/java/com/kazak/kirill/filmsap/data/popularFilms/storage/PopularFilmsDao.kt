package com.kazak.kirill.filmsap.data.popularFilms.storage

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity.PopularFilmsListEntity
import com.kazak.kirill.filmsap.domain.model.popularFilmsModel.PopularFilmsEntity
import com.kazak.kirill.filmsap.utils.Constants.POPULAR_FILMS_TABLE_NAME

@Dao
interface PopularFilmsDao {

    @Query("SELECT * FROM $POPULAR_FILMS_TABLE_NAME ORDER BY listId DESC")
    fun getPopularFilmList(): PopularFilmsListEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun savePopularFilmList(popularFilmsListEntity: PopularFilmsListEntity)

    @Query("SELECT * FROM $POPULAR_FILMS_TABLE_NAME WHERE filmId=:filmId")
    fun getPopularFilmById(id: Int): PopularFilmsEntity
}