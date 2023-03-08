package com.kazak.kirill.filmsap.data.popularFilms.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kazak.kirill.filmsap.data.popularFilms.popularFilmsEntity.PopularFilmsListEntity

@Database(
    entities = [PopularFilmsListEntity::class],
    version = 1,
    exportSchema = true
)
abstract class PopularFilmsDatabase: RoomDatabase() {

    abstract fun popularFilmsItemDao(): PopularFilmsDao
}