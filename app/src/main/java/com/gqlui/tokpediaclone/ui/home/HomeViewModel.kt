package com.gqlui.tokpediaclone.ui.home

import androidx.compose.ui.graphics.Color
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

    private val _promoRemindersState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val promoReminders: StateFlow<List<RowHomeIc>> get() = _promoRemindersState

    private val _shoppingCategoryState: MutableStateFlow<List<RowHomeIc>> =
        MutableStateFlow(emptyList())
    val shoppingCategories: StateFlow<List<RowHomeIc>> get() = _shoppingCategoryState

    init {
        initDataState()
    }

    val bgImageSpecialDiscount = ImageColor(
        imageUrl = "240/zssuBf/2023/7/18/698df21c-4678-43d4-a348-f648c102e971.png",
        color = listOf(
            Color(0xFF73E53F),
            Color(0xFF07AC10),
        )
    )
    val bgImagePromoReminders = ImageColor(
        imageUrl = "200/PYbRbC/2023/6/6/a80a40dc-a2fe-464d-964a-464eba518fef.png",
        color = listOf(
            Color(0xFF06C7F4),
            Color(0xFF06C4F0)
        )
    )
    val bgImageInterestingPromo = ImageColor(
        imageUrl = "200/PYbRbC/2023/7/26/b865dfd5-66c1-4487-9cd4-89e98c19f085.jpg",
        color = listOf(
            Color(0xFF7F37D6),
            Color(0xFF7F37D7)
        )
    )

    fun refreshDataState() {
        initDataState()
    }

    private fun initDataState() {
        _rowIcsState.value = tkpRepository.rowIcs
        _continueCheckState.value = tkpRepository.continueCheck.shuffled()
        _discountSpecialState.value = tkpRepository.discountSpecial.shuffled()
        _needsSchoolState.value = tkpRepository.needsSchool
        _vitaminAndSupplementsState.value = tkpRepository.vitaminAndSupplements
        _promoTodayState.value = tkpRepository.promoToday.shuffled()
        _promoRemindersState.value = tkpRepository.promoReminders.shuffled()
        _shoppingCategoryState.value = tkpRepository.shoppingCategory
    }
}

data class ImageColor(
    val imageUrl: String,
    val color: List<Color>
)
