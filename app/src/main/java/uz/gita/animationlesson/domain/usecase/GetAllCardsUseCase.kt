package uz.gita.animationlesson.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.animationlesson.domain.model.CardModel

interface GetAllCardsUseCase {
    operator fun invoke():Flow<List<CardModel>>
}