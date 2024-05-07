package com.example.middleexam

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CommodityPage() {
    val commodities = remember { mutableStateListOf(*commodityList.toTypedArray()) }

    Column {
        Text(text = "Commodity Page")
        // 在此处显示商品信息并实现增删改操作
    }
}

@Preview
@Composable
fun PreviewCommodityPage() {
    CommodityPage()
}
