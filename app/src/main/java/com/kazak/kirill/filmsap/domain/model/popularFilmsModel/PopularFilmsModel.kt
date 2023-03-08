package com.kazak.kirill.filmsap.domain.model.popularFilmsModel

data class PopularFilmsModel(
    val page: Int,
    val results: List<ResultEntity>,
    val total_pages: Int,
    val total_results: Int
)