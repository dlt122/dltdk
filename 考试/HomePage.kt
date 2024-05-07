import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.middleexam.commodityList
import com.example.middleexam.equipmentList

@Composable
fun IndexPage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "商品数量: ${commodityList.size}")
        Text(text = "装备信息: ${equipmentList.size}")
        Button(
            onClick = { navController.navigate("commodity") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "CommodityPage")
        }
        Button(
            onClick = { navController.navigate("equipment") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "EquipmentPage")
        }
        Button(
            onClick = { navController.navigate("end") },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "EndPage")
        }
    }
}
