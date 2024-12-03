package uz.gita.animationlesson.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.animationlesson.domain.model.CardModel
import uz.gita.animationlesson.domain.repository.CardRepository
import uz.gita.animationlesson.domain.usecase.GetAllCardsUseCase
import javax.inject.Inject

class GetAllCardsUseCaseImpl @Inject constructor(private val repository:CardRepository):GetAllCardsUseCase {
    override fun invoke(): Flow<List<CardModel>>  = repository.getAllCards()

}