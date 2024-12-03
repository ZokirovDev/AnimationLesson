package uz.gita.animationlesson.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.animationlesson.presentatsion.screens.main.MainContract
import uz.gita.animationlesson.presentatsion.screens.main.MainDirection

@Module
@InstallIn(ViewModelComponent::class)
interface DirectionModule {

    @Binds
    fun bindMainDirection(impl:MainDirection):MainContract.Direction
}