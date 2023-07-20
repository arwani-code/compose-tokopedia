package com.gqlui.tokpediaclone.data

import com.gqlui.tokpediaclone.data.model.RowHomeIc
import javax.inject.Inject


class TkpRepository @Inject constructor(
    private val tkpLocalDataSource: TkpLocalDataSource
) {
    val rowIcs: List<RowHomeIc> = tkpLocalDataSource.rowIcs
    val imagesPager: List<String> = tkpLocalDataSource.imagePager
    val continueCheck: List<RowHomeIc> = tkpLocalDataSource.continueCheck
}