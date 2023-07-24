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

    private val _needsSchoolState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val needsSchool: StateFlow<List<RowHomeIc>> get() = _needsSchoolState

    private val _vitaminAndSupplementsState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val vitaminAndSupplements: StateFlow<List<RowHomeIc>> get() = _vitaminAndSupplementsState

    private val _promoTodayState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val promoToday: StateFlow<List<RowHomeIc>> get() = _promoTodayState

    init {
        _rowIcsState.value = tkpRepository.rowIcs
        _continueCheckState.value = tkpRepository.continueCheck
        _discountSpecialState.value = tkpRepository.discountSpecial
        _needsSchoolState.value = tkpRepository.needsSchool
        _vitaminAndSupplementsState.value = tkpRepository.vitaminAndSupplements
        _promoTodayState.value = tkpRepository.promoToday
    }
}
