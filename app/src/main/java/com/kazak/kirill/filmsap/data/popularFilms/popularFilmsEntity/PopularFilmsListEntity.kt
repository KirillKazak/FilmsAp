package com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kazak.kirill.filmsap.utils.Constants

@Entity(tableName = Constants.POPULAR_FILMS_TABLE_NAME)
data class PopularFilmsListEntity (
    @PrimaryKey()
    val listId: Int,
    val popularFilmsList: List<PopularFilmsListEntity>
)