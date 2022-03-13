package com.example.smartchess.Moudules

import android.content.Context
import androidx.room.Room
import com.example.smartchess.ChessRepo
import com.example.smartchess.SmartChessApplication
import com.example.smartchess.data.AppDatabase
import com.example.smartchess.data.GameDao
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SmartChessApplication::class)


object SmartDbModule {

@Singleton
@Provides
    fun provideDB(@ApplicationContext context: Context) : AppDatabase{
        return Room.databaseBuilder (context , AppDatabase::class.java,
            "app_database").createFromAsset("database/smartchess_games.db")
            .build()
    }

}
