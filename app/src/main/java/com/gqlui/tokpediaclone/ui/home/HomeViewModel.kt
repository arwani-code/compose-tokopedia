package com.gqlui.tokpediaclone.ui.home

import androidx.lifecycle.ViewModel
import com.gqlui.tokpediaclone.data.TkpHomeRepository
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val tkpRepository: TkpHomeRepository
) : ViewModel() {

    val imagesPager = tkpRepository.imagesPager

    private val _rowIcsState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val rowIcsState: StateFlow<List<RowHomeIc>> get() = _rowIcsState

    private val _continueCheckState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val continueCheckState: StateFlow<List<RowHomeIc>> get() = _continueCheckState

    private val _discountSpecialState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val discountSpecial: StateFlow<List<RowHomeIc>> get() = _discountSpecialState

    init {
        _rowIcsState.value = tkpRepository.rowIcs
        _continueCheckState.value = tkpRepository.continueCheck
        _discountSpecialState.value = tkpRepository.discountSpecial
    }
}
