package com.example.achievements.di

import com.example.achievements.api.IProjectApi
import com.example.achievements.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideRepository(iProjectApi: IProjectApi):Repository{
        return Repository(iProjectApi)
    }

}