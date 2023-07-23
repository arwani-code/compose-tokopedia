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
        "https://images.tokopedia.net/img/cache/1200/NXCtjv/2023/7/15/e3107915-c428-49fb-9fc2-182d3f972d11.jpg",
        "https://images.tokopedia.net/img/cache/500/VxWOnu/2023/7/18/46a4dc59-9657-44ac-a33e-b867fb8203aa.jpg.webp?ect=4g",
        "https://images.tokopedia.net/img/cache/500/VxWOnu/2023/7/20/e5220c19-44c9-4038-b2b8-7771d21bf9f3.jpg.webp?ect=4g"
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
    val discountSpecial = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/6/10/f3eeca96-4714-49bf-8be7-cce44c1b5663.jpg.webp?ect=4g",
            title = "Rp 25.000",
            discount = "64%",
            price = "Rp 70.000",
            progressIndicator = "70"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2021/8/8/90dd1a77-203e-49f3-9580-704f79ab5f9e.jpg.webp?ect=4g",
            title = "Rp 34.000",
            discount = "43%",
            price = "Rp 60.000",
            progressIndicator = "80"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/5/8/130b301d-e02e-480b-a115-46bb48b91ae0.jpg.webp?ect=4g",
            title = "Rp 118.000",
            discount = "58%",
            price = "Rp 280.000",
            progressIndicator = "90"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2021/10/11/1168a76f-7c47-4ffb-8bd0-494fe7d19ff4.jpg.webp?ect=4g",
            title = "Rp 898.999",
            discount = "25%",
            price = "Rp 1.119.000",
            progressIndicator = "85"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/11/28/772cdbbf-f8e5-43c2-acd1-ed075c87764e.jpg.webp?ect=4g",
            title = "Rp 50.864",
            discount = "32%",
            price = "Rp 75.240",
            progressIndicator = "90"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/4/3/70e6cabb-b9a9-4c42-aa4e-52937a7df701.jpg.webp?ect=4g",
            title = "Rp 102.960",
            discount = "22%",
            price = "Rp 132.000",
            progressIndicator = "70"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/2/10/4b23f52a-3ad0-48a2-a44f-6b38a911fefd.jpg.webp?ect=4g",
            title = "Rp 73.500",
            discount = "26%",
            price = "Rp 99.000",
            progressIndicator = "80"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2022/3/22/c04d23af-dcd7-4361-b7c5-e352d1dc2ecc.jpg.webp?ect=4g",
            title = "Rp 44.594",
            discount = "25%",
            price = "Rp 59.300",
            progressIndicator = "80"
        ),
    )
    val needsSchool = listOf(
        RowHomeIc(image = "https://images.tokopedia.net/img/cache/400/RInQea/2023/7/20/ad1625b7-542c-4dd0-a469-adc7a75f2e2f.jpg.webp?ect=4g"),
        RowHomeIc(image = "https://images.tokopedia.net/img/cache/400/RInQea/2023/7/20/fe3a8fff-f240-4b8e-ac48-f94e9913fb1a.jpg.webp?ect=4g"),
        RowHomeIc(image = "https://images.tokopedia.net/img/cache/400/RInQea/2023/7/20/5ad50b36-1b22-4b94-a1c0-eef2d9efcf36.jpg.webp?ect=4g"),
        RowHomeIc(image = "https://images.tokopedia.net/img/cache/400/RInQea/2023/7/20/3ea68075-3576-4560-abd2-e74e1ddc00ce.jpg.webp?ect=4g")
    )
}