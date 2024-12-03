package uz.gita.animationlesson.presentatsion.screens.main

import uz.gita.animationlesson.presentatsion.navigator.AppNavigator
import javax.inject.Inject

class MainDirection @Inject constructor(private val appNavigator: AppNavigator):MainContract.Direction{
    override suspend fun moveToFinishScreen() {
//        appNavigator.navigateTo()
    }

    override suspend fun moveToBack() {
        appNavigator.back()
    }

}