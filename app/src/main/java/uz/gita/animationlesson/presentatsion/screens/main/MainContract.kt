package uz.gita.animationlesson.presentatsion.screens.main

import kotlinx.coroutines.flow.Flow
import uz.gita.animationlesson.domain.model.CardModel

interface MainContract {
    interface ViewModel{
        val cardList:Flow<List<CardModel>>
        val message:Flow<String>

        fun clickCard(cardModel: CardModel)
        fun updateNextLevel()
        fun clickBack()
    }
    interface Direction{
        suspend fun moveToFinishScreen()
        suspend fun moveToBack()
    }
}