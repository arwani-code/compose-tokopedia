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
//        RowHomeIc(
//            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/1/19/d2e3c751-55a9-4ed4-a217-4758d3fa7e8d.jpg.webp?ect=4g",
//            title = "Soft Case Handphone",
//            subTitle = "Lanjut browse"
//        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200-square/VqbcmM/2021/1/19/d2e3c751-55a9-4ed4-a217-4758d3fa7e8d.jpg",
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
    val promoReminders = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2021/5/29/ad16e1c5-ef9a-4cfc-bbc5-8723c36a52d0.jpg",
            subTitle = "Ebike Kit sepeda listrik dinamo bldc roda belakang 36v350w dan velg",
            title = "Rp 2.100.000",
            discount = "2%",
            price = "Rp 2.150.000",
            city = "Jakarta Utara",
            ratingStar = "5.0 | Terjual 15",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/3/10/97e14a15-8d8c-484a-a2ab-f980298aa8d0.jpg.webp?ect=4g",
            subTitle = "Apple iPad Air 5 2022 iPad Air M1 10.9\" 64GB / 256GB Wifi Cellular",
            title = "Rp 7.987.000",
            discount = "6%",
            price = "Rp 8.499.000",
            city = "Jakarta Pusat",
            ratingStar = "5.0 | Terjual 1 rb+",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/2/16/0dc05578-42e7-4dea-bee9-8c35d2db4b43.jpg",
            subTitle = "Nestle LACTOGROW 3 Madu Susu Anak 1-3 Tahun Box 350g",
            title = "Rp 54.040",
            discount = "27%",
            price = "Rp 73.700",
            city = "Jakarta Pusat",
            ratingStar = "5.0 | Terjual 4 rb+",
            textAltImage = "Harga spesial",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/4/16/5d5d6809-3b29-4b60-b2ef-77ab5aed02e0.jpg",
            subTitle = "iPad Air 5 (M1) / 10,9\" 2022 - COPPER TEMPERED GLASS FULL CLEAR",
            title = "Rp 109.900",
            discount = "63%",
            price = "Rp 300.000",
            city = "Jakarta Barat",
            ratingStar = "5.0 | Terjual 5 rb+",
            textAltImage = "WIB",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2023/6/20/ea0d5503-0b8d-4730-8fa0-5f7299f76f31.jpg",
            subTitle = "MILS Paperlike Matte Anti Gores iPad 8 10.2 Pro 11 Air 3 10.5 4 10.9",
            title = "Rp 125.900",
            discount = "14%",
            price = "Rp 145.000",
            city = "Jakarta Utara",
            ratingStar = "4.9 | Terjual 2 rb+",
            textAltImage = "Super Gadget Day",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/9/26/670077ab-2fa0-4899-afef-791a44838c37.jpg",
            subTitle = "Macbook Pro 2012 MD101 13inch Core i5 128/256/512GB SSD",
            title = "Rp 3.300.000",
            discount = "31%",
            price = "Rp 4.750.000",
            city = "Jakarta Selatan",
            ratingStar = "4.9 | Terjual 2+",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/9/19/a473459e-41ad-4fb5-8019-e5877f070ec4.jpg.webp?ect=4g",
            subTitle = "Apple iPad Air 5 2022 M1 64GB 256GB IBOX CELL Cellular WIFI Only",
            title = "Rp 8.015.000",
            discount = "10%",
            price = "Rp 8.899.000",
            city = "Jakarta Pusat",
            ratingStar = "4.9 | Terjual 1 rb+",
            textAltImage = "Super Gadget Day",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/6/3/b0c7d5ea-c900-4924-beff-7853de5824bc.jpg.webp?ect=4g",
            subTitle = "UGREEN Sleeve Case iPad Pro Macbook Air Tas Laptop Bag 13'' 13inch 16\"",
            title = "Rp 120.000",
            discount = "8%",
            price = "Rp 130.000",
            city = "Jakarta Barat",
            ratingStar = "5.0 | Terjual 100+",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/4/14/7e77d5aa-7e09-44de-965c-c9282f23ca1a.jpg",
            subTitle = "Apple Macbook Air M1 M2 8GB 16GB 256GB 512GB 13\" IBOX",
            title = "Rp 12.075.000",
            discount = "64%",
            price = "Rp 33.999.000",
            city = "Jakarta Pusat",
            ratingStar = "5.0 | Terjual 7",
            textAltImage = "Back to School",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/6/20/e140bfd4-7b17-4048-b0f3-672bd2ce21ac.png",
            subTitle = "NEW Apple Macbook Air 2022 M2 Chip 13\" 16GB 256GB 512GB 1TB SSD IT",
            title = "Rp 16.648.999",
            discount = "45%",
            price = "Rp 30.000.000",
            city = "Jakarta Pusat",
            ratingStar = "5.0 | Terjual 80+",
            textAltImage = "Mega Electrodeals",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/8/21/84aef12a-661c-493b-8a3a-23766005daa6.png.webp?ect=4g",
            subTitle = "Leather Case iPad Air ESR Rebound Pencil",
            title = "Rp 238.850",
            discount = "71%",
            price = "Rp 825.000",
            city = "Surabaya",
            ratingStar = "5.0 | Terjual 100+",
            textAltImage = "Super Gadget Day",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/9/16/b08f8d1d-9daf-4566-9751-f4945f9714dc.png",
            subTitle = "Apple Macbook Air M2 Chip 2022 8GB/512GB IBOX",
            title = "Rp 23.349.000",
            discount = "14%",
            price = "Rp 27.000.000",
            city = "Surabaya",
            ratingStar = "5.0 | Terjual 1",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/7/3/122a9899-0f41-4f69-b78a-26fe071627b1.jpg",
            subTitle = "Screen Protector iPad Air 4/ 5 10.9 Pro 11 Spigen Paperlike FC Film",
            title = "Rp 242.002",
            discount = "18%",
            price = "Rp 295.000",
            city = "Jakarta Barat",
            ratingStar = "5.0 | Terjual 750+",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/9/13/4831435a-5f24-4988-b662-0aff0292af2f.png",
            subTitle = "ECLE Storage Bag Waterproof Tas Kabel Organizer HDD Case/Pouch",
            title = "Rp 100.000",
            discount = "10%",
            price = "Rp 90.000",
            city = "Jakarta Selatan",
            ratingStar = "4.5 | Terjual 100+",
            arrived = "Tiba 5 - 12 Jan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/7/12/e6ae9c3b-d024-47a4-a714-1acffe79d704.jpg",
            subTitle = "COOGER Alat Pel Karet / Sponge Mop / Spons Mop dengan Rol Besar ",
            title = "Rp 150.000",
            discount = "20%",
            price = "Rp 120.000",
            city = "Jakarta Utara",
            ratingStar = "4.8 | Terjual 300+",
            arrived = "Tiba 8 - 15 Jan"
        ),

        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/3/30/962a48a1-44e4-4917-86f7-251ce215ce0e.jpg",
            subTitle = "Aonez Stand Hanger Besi Double Rak Gantungan Baju Pakaian 2 Tiang",
            title = "Rp 50.000",
            discount = "20%",
            price = "Rp 62.500",
            city = "Jakarta Selatan",
            ratingStar = "4.5 | Terjual 1 rb+",
            textAltImage = "Sale Day",
            arrived = "Tiba 5 - 12 Jan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2023/7/4/045b2174-73c7-44cd-be5d-68be0c33fb4c.jpg",
            subTitle = "STAND HOLDER HP PENYANGGA lIVE BRODCAST 360 DERAJAT DESKTOP HD25",
            title = "Rp 300.000",
            discount = "10%",
            price = "Rp 333.000",
            city = "Bandung",
            ratingStar = "4.8 | Terjual 500+",
            textAltImage = "Best Seller",
            arrived = "Tiba 20 - 25 Feb"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2023/3/29/119b2abc-8208-4025-b5a1-3b7aa09bfbed.jpg",
            subTitle = "Ace - Ataru Set 4 Pcs Corong - Abu-Abu/Biru",
            title = "Rp 85.000",
            discount = "5%",
            price = "Rp 89.500",
            city = "Surabaya",
            ratingStar = "4.7 | Terjual 800+",
            textAltImage = "Limited Stock",
            arrived = "Tiba 1 - 7 Mar"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2023/1/10/05c8a324-662b-4720-9cdd-69e1ec559944.jpg",
            subTitle = "Ace - Paso Balon Tinju Minion",
            title = "Rp 200.000",
            discount = "15%",
            price = "Rp 235.000",
            city = "Medan",
            ratingStar = "4.6 | Terjual 350+",
            textAltImage = "Hot Deal",
            arrived = "Tiba 15 - 22 Apr"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/2/20/332a663f-3559-4bb3-a9cc-a04a9e298a45.jpg.webp?ect=4g",
            subTitle = "Aukey Charger PA-T16 2 Ports 39W QC 3.0 - 500076",
            title = "Rp 120.000",
            discount = "8%",
            price = "Rp 130.000",
            city = "Semarang",
            ratingStar = "4.9 | Terjual 1.2 rb+",
            textAltImage = "Super Offer",
            arrived = "Tiba 10 - 18 May"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/2/14/4f0e24ea-a69a-4030-b17c-468535036c78.jpg",
            subTitle = "Deli Hole Puncher / Tang Pembolong Pelubang Sabuk Gesper Kulit DL1919C",
            title = "Rp 125.900",
            discount = "14%",
            price = "Rp 145.000",
            city = "Jakarta Utara",
            ratingStar = "4.9 | Terjual 2 rb+",
            textAltImage = "Super Gadget Day",
            arrived = "Tiba 12 - 29 Des"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/7/11/812bb137-b3d5-4e16-b4fb-560fe787e04b.jpg",
            subTitle = "COOGER Water Spray Mop Alat Pel Semprot Dengan Kain Pel Microfiber",
            title = "Rp 50.000",
            discount = "20%",
            price = "Rp 62.500",
            city = "Jakarta Selatan",
            ratingStar = "4.5 | Terjual 1 rb+",
            textAltImage = "Sale Day",
            arrived = "Tiba 5 - 12 Jan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/5/19/49fb65bb-9916-4e4a-bbd6-fe830b6754b0.jpg",
            subTitle = "Gaabor Vacuum Cleaner Kapasitas 1.5 Liter Penyedot Debu",
            title = "Rp 300.000",
            discount = "10%",
            price = "Rp 333.000",
            city = "Bandung",
            ratingStar = "4.8 | Terjual 500+",
            textAltImage = "Best Seller",
            arrived = "Tiba 20 - 25 Feb"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/6/22/a830f470-74ac-43b2-ab61-e4c123c8a914.png",
            subTitle = "Starco Timbangan Dapur Timbangan Kopi Digital Stainless 5 kg/0.1g",
            title = "Rp 180.000",
            discount = "5%",
            price = "Rp 189.000",
            city = "Yogyakarta",
            ratingStar = "4.6 | Terjual 600+",
            textAltImage = "Limited Stock",
            arrived = "Tiba 3 - 10 Nov"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/7/6/81b1cff8-8dfa-43b1-bb4b-7fa0b3bbbe7c.jpg",
            subTitle = "Sikat Toilet Golf Silicone // Sikat wc golf // brush toilet",
            title = "Rp 90.000",
            discount = "15%",
            price = "Rp 106.000",
            city = "Surabaya",
            ratingStar = "4.7 | Terjual 450+",
            textAltImage = "Hot Deal",
            arrived = "Tiba 25 - 30 Dec"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/9/8/92ac93e8-5616-4cd3-b299-685c814a899e.png",
            subTitle = "SLEEP CENTER Comforta Elegant Pillow / Bantal",
            title = "Rp 50.000",
            discount = "20%",
            price = "Rp 62.500",
            city = "Jakarta Selatan",
            ratingStar = "4.5 | Terjual 1 rb+",
            textAltImage = "Sale Day",
            arrived = "Tiba 5 - 12 Jan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2022/10/3/52be6aee-2e30-4977-aec1-af8cf14f6746.png",
            subTitle = "Uniland Kasur Lipat 90x200 Bonus Tas Kasur - Busa Gulung Lantai Travel",
            title = "Rp 300.000",
            discount = "10%",
            price = "Rp 333.000",
            city = "Bandung",
            ratingStar = "4.8 | Terjual 500+",
            textAltImage = "Best Seller",
            arrived = "Tiba 20 - 25 Feb"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2023/1/9/52f7604b-bfe3-4ea7-bd7d-3b60e5a1865f.jpg",
            subTitle = "ACE - Ataru Pouch Travel Mesh Zipper A5 - Oranye",
            title = "Rp 90.000",
            discount = "15%",
            price = "Rp 106.000",
            city = "Surabaya",
            ratingStar = "4.7 | Terjual 450+",
            textAltImage = "Hot Deal",
            arrived = "Tiba 25 - 30 Dec"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/hDjmkQ/2022/4/26/1e315d7d-da32-409e-ba7c-16f237404242.jpg",
            subTitle = "Mouse Pad Aukey KM-P1 - 500877",
            title = "Rp 75.000",
            discount = "5%",
            price = "Rp 78.750",
            city = "Medan",
            ratingStar = "4.6 | Terjual 300+",
            textAltImage = "Limited Stock",
            arrived = "Tiba 3 - 9 Jan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/300-square/VqbcmM/2023/4/12/02cd04b4-9aac-4760-a7e6-e15a7177618b.jpg",
            subTitle = "AONEZ Rak Sepatu Susun Sudut, 6-layer Rak Buku Serbaguna, Hitam",
            title = "Rp 120.000",
            discount = "8%",
            price = "Rp 130.000",
            city = "Semarang",
            ratingStar = "4.9 | Terjual 1.2 rb+",
            textAltImage = "Super Offer",
            arrived = "Tiba 10 - 18 Feb"
        )
    )
    val shoppingCategory = listOf(
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/08f9e8e2-4815-46aa-b7e7-a1078b38939a.jpg",
            title = "Makanan & Minuman"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/e69c41f4-e52f-448c-ac24-3fbf31819ead.jpg",
            title = "Kecantikan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/c97af5f1-346b-44aa-a49d-81550aaa033c.jpg",
            title = "Buku"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/47035f29-4468-4123-80d3-b6f76e813c53.jpg",
            title = "Kesehatan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/c4b0f7d1-6e74-464c-b6de-f5a14ddab065.jpg",
            title = "Perlengkapan Pesta"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/9f05ff2d-0243-4924-876c-e77fff26ffd8.jpg",
            title = "Mainan & Hobi"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/7b571052-3628-428d-bf12-b344593e1a2f.jpg",
            title = "Handphone & Tablet"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/68cd2602-be94-4ec1-ade6-6bc7103e9ff6.jpg",
            title = "Fashion Pria"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/e5bd27ec-c70a-475f-ada2-dbd0b8f91d44.jpg",
            title = "Pertukangan"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/b0cb5596-3022-49dd-9a8c-0081decb5d87.jpg",
            title = "Fashion Anak & Bayi"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/6b0cb08f-c366-42e5-a069-4b596d454d42.jpg",
            title = "Fashion Wanita"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/33cf7bc5-e9bc-4676-aaeb-2897891a5dcb.jpg",
            title = "Olahraga"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/829db53b-ed40-4263-84cf-1d6e229286bb.jpg",
            title = "Dapur"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/bbca54ee-9949-4af1-aae3-e5fc396e8b78.jpg",
            title = "Film & Musik"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/83b8b97b-c0d1-4927-839c-ed5e04edda2e.jpg",
            title = "Ibu & Bayi"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/54dd517b-c778-48b8-8e79-29090306ca85.jpg",
            title = "Otomotif"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/8031c8e2-d973-47e9-81ef-5c52dabf4c0e.jpg",
            title = "Rumah Tangga"
        ),
        RowHomeIc(
            image = "https://images.tokopedia.net/img/cache/200/zIWZzz/2022/7/5/d101fe67-b273-4094-9694-373248dc4858.jpg",
            title = "Fashion Muslim"
        ),
    )
}
