package com.gqlui.tokpediaclone.data

import com.gqlui.tokpediaclone.data.model.RowHomeIc
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TkpLocalDataSource @Inject constructor() {
    val rowIcs = listOf(
        RowHomeIc(
            title = "Promo Hari Ini",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/1b1f3e31-7bf2-40c2-b930-289934c6e57e.png",
        ),
        RowHomeIc(
            title = "Lihat Semua",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/1365f379-c59e-45d7-9ed1-1d478d208bca.png",
        ),
        RowHomeIc(
            title = "Belanja 2 Jam Tiba",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/28/c6e1b5f9-b4cb-4b9a-b63c-b0f967f5cb40.png",
        ),
        RowHomeIc(
            title = "Kecantikan",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/064f02e0-b831-4c52-b051-1f78bb76aed4.png",
        ),
        RowHomeIc(
            title = "Top Up & Tagihan",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/a6571b97-5cb4-4158-8d65-2acb1c810e53.png",
        ),
        RowHomeIc(
            title = "Travel & Entertainment",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/cd85cd88-d34d-4742-ad44-817522bcf415.png",
        ),
        RowHomeIc(
            title = "Keuangan",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/48866d2f-b5de-41ca-8663-f721deb8e00b.png",
        ),
        RowHomeIc(
            title = "Kesehatan",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/3ec4cf67-b498-42f2-87e4-0d836b827733.png",
        ),
        RowHomeIc(
            title = "Makanan & Minuman",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/a6f87004-49b5-4d9c-b4d0-b8c8376a575a.png",
        ),
        RowHomeIc(
            title = "Fashion Pria",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/0269451e-fb0a-4cab-b9ac-2a95c0878932.png",
        ),
        RowHomeIc(
            title = "Perawatan Tubuh",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/27/4989439f-c1f2-4a71-ba54-555c6f19b040.png",
        ),
    )
    val imagePager = listOf(
        "https://images.tokopedia.net/img/cache/1200/NXCtjv/2023/6/30/74501321-54c7-4375-a98d-224742be0e5e.jpg.webp",
        "https://images.tokopedia.net/img/cache/1200/NXCtjv/2023/7/15/e3107915-c428-49fb-9fc2-182d3f972d11.jpg"
    )
    val continueCheck = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2022/3/21/b13e9abf-e969-430d-ae33-5422a86608bf.jpg.webp?ect=4g",
            title = "Soft Case Handphone",
            subTitle = "Lanjut browse"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2023/7/9/9be1b1e0-b869-4ec8-88d0-01e1a1887a62.png.webp?ect=4g",
            title = "Laptop Consumer",
            subTitle = "Terakhir kamu cek"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/5/3/0d7f8e2d-f56b-44f0-9f58-26d67c8bb46c.jpg.webp?ect=4g",
            title = "Router",
            subTitle = "Cek lagi yuk"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2022/11/18/19ef3445-db9b-4c0b-a261-546a6fe6e000.jpg.webp?ect=4g",
            title = "Serum Wajah",
            subTitle = "Lanjut cari"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/1/19/d2e3c751-55a9-4ed4-a217-4758d3fa7e8d.jpg.webp?ect=4g",
            title = "Soft Case Handphone",
            subTitle = "Lanjut browse"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2022/3/21/b13e9abf-e969-430d-ae33-5422a86608bf.jpg.webp?ect=4g",
            title = "Celana Dalam Anak",
            subTitle = "Cari lebih banyak"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2023/3/1/5a8fcf65-92b4-4d42-8606-f76714c685b3.png.webp?ect=4g",
            title = "Pasta Gigi",
            subTitle = "Baik lihat"
        ),
    )
}