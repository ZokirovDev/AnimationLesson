package uz.gita.animationlesson.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.gita.animationlesson.domain.model.CardModel

interface CardRepository {
    fun getAllCards():Flow<List<CardModel>>
    fun getCardsByCount(count:Int):Flow<List<CardModel>>
}