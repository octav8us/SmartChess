package com.example.smartchess.Moudules

import com.example.smartchess.ChessRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
//Repositories will live same as the activity that requires them
@InstallIn(ActivityComponent::class)
abstract class RepoModule {

    @Binds
    abstract fun smartRepository(): ChessRepo

}