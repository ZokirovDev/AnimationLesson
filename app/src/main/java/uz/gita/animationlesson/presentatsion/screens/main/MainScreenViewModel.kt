package uz.gita.animationlesson.presentatsion.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import uz.gita.animationlesson.domain.model.CardModel
import uz.gita.animationlesson.domain.usecase.GetAllCardsUseCase
import javax.inject.Inject


class MainScreenViewModel @Inject constructor(
    private val getAllCardsUseCase: GetAllCardsUseCase,
    private val direction: MainContract.Direction
) : ViewModel(), MainContract.ViewModel {

    // TODO: Implement the ViewModel
    override val cardList: Flow<List<CardModel>> = MutableStateFlow(emptyList())
    override val message: Flow<String> = MutableSharedFlow()

    override fun clickCard(cardModel: CardModel) {

    }

    override fun updateNextLevel() {

    }

    override fun clickBack() {
        viewModelScope.launch { direction.moveToBack() }
    }
}