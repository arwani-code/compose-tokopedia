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

        RowHomeIc(
            title = "Official Store",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/15/d6e0bbd2-1b41-40d1-9d25-df27e46eb42a.png",
        ),
        RowHomeIc(
            title = "Live Shopping",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2022/8/8/ef55450a-0003-4d4e-b621-5cb0b650a772.png",
        ),
        RowHomeIc(
            title = "Tokopedia Seru",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2022/6/6/6078a763-4b0f-4bed-b9cd-d3a282cc7699.png",
        ),
        RowHomeIc(
            title = "Gopay Later Cicil",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/15/0e844dcc-80e4-45f2-8969-66ee1b19a73b.png",
        ),
        RowHomeIc(
            title = "Cicilan Tanpa Bayar",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2023/4/12/ff4e96bf-bc20-4c22-9cfc-69885383f314.png",
        ),
        RowHomeIc(
            title = "Pajak PBB",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2022/7/25/d23cf22c-ad54-4ecf-81b5-1f5befff790c.png",
        ),
        RowHomeIc(
            title = "Bayar di Tempat",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2021/4/19/86e060e5-b9d9-4878-86df-20fba2db1542.png",
        ),
        RowHomeIc(
            title = "Bangga Lokal",
            image = "https://images.tokopedia.net/img/cache/64-square/iEWsxH/2021/7/27/90224ebb-fd33-4bb9-be8c-8be9d8c10ba6.png",
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
    val vitaminAndSupplements = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/a213dcf9-c1a0-4888-8c0b-03bcfe4048d2.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/e559eb07-9d00-4731-83d0-9aab9b852a6c.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/cfd1baa9-c1fe-46fa-b11c-31dabcba1510.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/00040629-e996-462f-abef-12d0d43f1283.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/ab8bf1e8-a06f-406a-9010-b98b6e568e5a.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/400-square/phZFtb/2023/7/21/99e25bd2-5d1d-4e1e-92cf-2c44c57492dc.jpg"
        ),
    )
    val promoToday = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/db956ee1-50ae-4c19-bf9e-623c80b88af1.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/23/e359a6c2-7b3e-442a-b283-3e3c04f2414f.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/37338179-8463-44b4-9792-15ae83cbcc83.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/5e7f51d1-176b-434d-bac0-a7ff56ba177f.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/10/3e9a7a09-50a6-41dc-9b2a-46d0e5d98e59.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/1/b5c6eff0-8d5a-4c3e-84bf-2e462ab5d948.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/1aa2f257-33a4-4bad-ab28-5c5f62e2c915.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/18/ea8f8e0b-e460-4d2e-9bfc-40074e453a77.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/23/d137cd52-46d3-49ac-9fdd-186672b352ff.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/6/30/e0f224e8-87e4-47f6-bdb7-df358d5529fd.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/b7df7c67-2905-48d5-8f2a-db9d178b1ab5.jpg"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/SuMXtx/2023/7/24/b37303b9-584c-4bcc-934b-5853e6e1a94b.jpg"
        ),
    )
}