package com.gqlui.tokpediaclone.data

import androidx.compose.ui.graphics.Color
import com.gqlui.tokpediaclone.data.model.RowHomeIc
import javax.inject.Inject


class TkpHomeRepository @Inject constructor(
    tkpLocalDataSource: TkpLocalDataSource
) {

    val rowIcs: List<RowHomeIc> = tkpLocalDataSource.rowIcs
    val imagesPager: List<String> = tkpLocalDataSource.imagePager
    val continueCheck: List<RowHomeIc> = tkpLocalDataSource.continueCheck
    val discountSpecial: List<RowHomeIc> = tkpLocalDataSource.discountSpecial
    val needsSchool: List<RowHomeIc> = tkpLocalDataSource.needsSchool
    val vitaminAndSupplements: List<RowHomeIc> = tkpLocalDataSource.vitaminAndSupplements
    val promoToday: List<RowHomeIc> = tkpLocalDataSource.promoToday
    val promoReminders: List<RowHomeIc> = tkpLocalDataSource.promoReminders
    val shoppingCategory: List<RowHomeIc> = tkpLocalDataSource.shoppingCategory
}