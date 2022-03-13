package com.example.smartchess.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(SmartGame::class , SmartFenPgn::class), version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun gameDao(): GameDao
    abstract fun fenPgnDao(): FenPgnDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_database")
                    .createFromAsset("database/smartchess_games.db")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}