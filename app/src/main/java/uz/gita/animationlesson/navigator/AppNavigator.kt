package uz.gita.animationlesson.navigator

interface AppNavigator {
    suspend fun navigateTo(id: Int)
    suspend fun back()
}