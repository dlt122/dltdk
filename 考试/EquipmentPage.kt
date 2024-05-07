package com.example.middleexam

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EquipmentPage() {
    val equipment = remember { mutableStateListOf(*equipmentList.toTypedArray()) }

    Column {
        Text(text = "Equipment Page")
        // 在此处显示装备信息并实现增删改操作
    }
}

@Preview
@Composable
fun PreviewEquipmentPage() {
    EquipmentPage()
}
