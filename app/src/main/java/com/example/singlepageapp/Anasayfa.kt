package com.example.singlepageapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.singlepageapp.ui.theme.AnaRenk
import com.example.singlepageapp.ui.theme.AnaRenkDark
import com.example.singlepageapp.ui.theme.SinglePageAppTheme
import com.example.singlepageapp.ui.theme.YaziRenk1
import com.example.singlepageapp.ui.theme.YaziRenk1Dark
import com.example.singlepageapp.ui.theme.YaziRenk2
import com.example.singlepageapp.ui.theme.YaziRenk2Dark
import com.example.singlepageapp.ui.theme.c1
import com.example.singlepageapp.ui.theme.c2
import com.example.singlepageapp.ui.theme.c3
import com.example.singlepageapp.ui.theme.c4
import com.example.singlepageapp.ui.theme.c5
import com.example.singlepageapp.ui.theme.cart
import com.example.singlepageapp.ui.theme.cartText
import com.example.singlepageapp.ui.theme.oswald

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    if (isSystemInDarkTheme()) AnaRenk= AnaRenkDark
    if (isSystemInDarkTheme()) YaziRenk1 = YaziRenk1Dark
    if (isSystemInDarkTheme()) YaziRenk2 = YaziRenk2Dark
    val sizes = listOf("S", "M", "L", "XL")
    val selectedSize = remember { mutableStateOf(sizes.first()) }
    var selectedColor = remember { mutableStateOf(Color.Red) }
    val configuration = LocalConfiguration.current
    val ekranGenisligi = configuration.screenWidthDp
    val ekranYuksekligi = configuration.screenHeightDp
    Scaffold(
        //topBar = {
        //    CenterAlignedTopAppBar(title = { Text(text = "Baslik") })
        //}

    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy((ekranYuksekligi*0.018).dp),


            ) {

            Image(
                painter = painterResource(id = R.drawable.mont),
                contentDescription = "",
                modifier = Modifier
                    .padding((ekranYuksekligi*0.012).dp)
                    .clip(RoundedCornerShape(16.dp)),



                )
            Text(
                text = "AIRism Cotton Short Sleeve Set",
                color = YaziRenk1,
                fontFamily = oswald,
                fontWeight = FontWeight.Bold,
                fontSize = (ekranGenisligi*0.0625).sp,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranYuksekligi*0.020).dp, top = 0.dp, bottom = 0.dp)

            )
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.uniqlo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .padding(start = (ekranYuksekligi*0.020).dp, end = (ekranYuksekligi*0.008).dp)
                        .size((ekranGenisligi*0.0525).dp)
                        .clip(RoundedCornerShape((ekranGenisligi*0.01).dp))

                )
                Text(
                    text = "Uniqe",
                    color = YaziRenk1,

                    textAlign = TextAlign.Start, modifier = Modifier.padding(end = (ekranGenisligi*0.005).dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.verified),
                    contentDescription = "verified",
                    modifier = Modifier
                        .size((ekranYuksekligi*0.025).dp)

                )


            }
            Text(
                text = stringResource(id = R.string.sizeText),
                textAlign = TextAlign.Start,
                fontFamily = oswald,
                color = YaziRenk2,

                fontSize = (ekranGenisligi*0.04).sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranYuksekligi*0.020).dp, bottom = 0.dp, top = 0.dp)
                    .size(20.dp)

            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranYuksekligi*0.020).dp, end = 16.dp, top = 0.dp, bottom = 0.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                sizes.forEach { size ->
                    Box(
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                            .size(40.dp)
                            .background(
                                color = if (size == selectedSize.value) YaziRenk1 else Color.LightGray,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clickable {
                                selectedSize.value = size
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = size,
                            color = if (size == selectedSize.value) AnaRenk else Color.Gray
                        )
                    }
                }

            }
            Text(
                text = stringResource(id = R.string.colorText),
                textAlign = TextAlign.Start,
                color = YaziRenk2,
                fontFamily = oswald,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranYuksekligi*0.020).dp, top = 0.dp, bottom = 2.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranYuksekligi*0.03).dp, end = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ColorOption(c1, selectedColor.value == c1) {
                    selectedColor.value = c1
                }
                ColorOption(c2, selectedColor.value == c2) {
                    selectedColor.value = c2
                }
                ColorOption(c3, selectedColor.value == c3) {
                    selectedColor.value = c3
                }
                ColorOption(c4, selectedColor.value == c4) {
                    selectedColor.value = c4
                }
                ColorOption(c5, selectedColor.value == c5) {
                    selectedColor.value = c5
                }
            }

            Text(
                text = stringResource(id = R.string.aciklama),
                color = YaziRenk2,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 18.dp, top = 2.dp)
                    .size(21.dp)
            )

            //Spacer(modifier = Modifier.height(0.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = stringResource(id = R.string.priceText),
                        color = YaziRenk2,
                        textAlign = TextAlign.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp, top = 2.dp)
                    )
                    Text(
                        text = "198.16$",
                        color = YaziRenk1,
                        textAlign = TextAlign.Start,
                        fontFamily = oswald,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 18.dp, top = 0.dp)
                    )

                }
                Column( modifier = Modifier.weight(0.75f)) {
                    Box(
                        modifier = Modifier
                            .padding(start = 0.dp, top = 15.dp)
                            .size(150.dp, 50.dp) // Increase the size of the box
                            .background(
                                color = cart,
                                shape = RoundedCornerShape(16.dp) // Adjust the corner radius if needed
                            )
                            .clickable {
                                // Handle click action
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.basketicon),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .padding(start = 6.dp, end = 4.dp, top = 3.dp)
                                    .size(20.dp)

                            )
                            Text(
                                text = stringResource(id = R.string.cartText),
                                color = cartText,
                                fontWeight = FontWeight.Bold // Optionally make the text bold
                            )
                        }

                    }
                }



            }


        }//column sonu


    }//scaffold sonu
    //anasayfa sonu
}

@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    SinglePageAppTheme {
        Anasayfa()
    }

}