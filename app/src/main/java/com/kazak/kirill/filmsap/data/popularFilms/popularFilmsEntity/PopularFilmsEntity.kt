package com.kazak.kirill.filmsap.domain.model.popularFilmsModel

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kazak.kirill.filmsap.utils.Constants.POPULAR_FILMS_TABLE_NAME


data class PopularFilmsEntity(
    val page: Int,
    val results: List<ResultEntity>,
    val total_pages: Int,
    val total_results: Int
)