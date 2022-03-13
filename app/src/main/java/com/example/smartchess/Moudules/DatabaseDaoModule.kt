package com.example.smartchess.Moudules

import com.example.smartchess.data.AppDatabase
import com.example.smartchess.data.FenPgnDao
import com.example.smartchess.data.GameDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class DatabaseDaoModule {
    @Provides
    fun provideChannelDao(appDatabase: AppDatabase): GameDao {
        return appDatabase.gameDao()
    }
}


@InstallIn(SingletonComponent::class)
@Module
class FenPgnDaoModule {
    @Provides
    fun provideChannelDao(appDatabase: AppDatabase): FenPgnDao {
        return appDatabase.fenPgnDao()
    }
}

