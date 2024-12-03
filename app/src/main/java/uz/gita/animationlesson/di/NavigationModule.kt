package uz.gita.animationlesson.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.animationlesson.presentatsion.navigator.AppNavigationDispatcher
import uz.gita.animationlesson.presentatsion.navigator.AppNavigationHandler
import uz.gita.animationlesson.presentatsion.navigator.AppNavigator

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {
    @Binds
    fun bindAppNavigator(dispatcher: AppNavigationDispatcher): AppNavigator

    @Binds
    fun bindAppNavigationHandler(dispatcher: AppNavigationDispatcher): AppNavigationHandler
}