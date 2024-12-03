package uz.gita.animationlesson.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uz.gita.animationlesson.domain.model.CardModel
import uz.gita.animationlesson.domain.repository.CardRepository

class CardRepositoryImpl : CardRepository {
    override fun getAllCards(): Flow<List<CardModel>> = flow {
        val cards = listOf(
            CardModel(
                0,
                "https://mir-s3-cdn-cf.behance.net/project_modules/fs/26dd9e169974305.6455cc4c31616.jpg"
            ),
        )
        emit(cards)
    }

    override fun getCardsByCount(count: Int): Flow<List<CardModel>> = flow {

    }

}