package uz.gita.animationlesson.presentatsion.navigator

interface AppNavigator {
    suspend fun navigateTo(id: Int)
    suspend fun back()
}