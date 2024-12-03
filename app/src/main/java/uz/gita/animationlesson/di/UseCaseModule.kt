package uz.gita.animationlesson.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import uz.gita.animationlesson.domain.usecase.GetAllCardsUseCase
import uz.gita.animationlesson.domain.usecase.impl.GetAllCardsUseCaseImpl

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @[Binds ViewModelScoped]
    fun bindGetAllUseCase(impl:GetAllCardsUseCaseImpl):GetAllCardsUseCase
}