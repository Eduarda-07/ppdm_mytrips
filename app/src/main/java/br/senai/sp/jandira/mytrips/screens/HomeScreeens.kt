package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen (modifier: Modifier = Modifier){
    Box(

        modifier = Modifier
            .fillMaxSize()
            .background(
               Color.White
            )

    ){
        Column (
           modifier = Modifier
               .fillMaxSize(),
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center

       ){
            Column (
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    color = Color(0xFF9462EC),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(
                        R.string.go
                    ),
                    color = Color(0xFFBA9BF8),
                    fontSize = 20.sp,
                )

                OutlinedTextField(
                    value = "text",
                    onValueChange = {},
                    label = { Text("E-mail") },
                    modifier = Modifier
                      .fillMaxWidth()
                      .padding(top = 10.dp),
                    shape = RoundedCornerShape(

                        topStart = 15.dp,
                        bottomStart = 15.dp,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp

                    )
                )
                OutlinedTextField(
                    value = "text ",
                    onValueChange = {},
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(

                        topStart = 15.dp,
                        bottomStart = 15.dp,
                        topEnd = 15.dp,
                        bottomEnd = 15.dp

                    )
                )

            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(8.dp),

                modifier = Modifier
                    .padding(start = 180.dp)
//                    .background(
//                        color = Color(0xFFBA9BF8)
//                    )
                ) {
                    Text(
                        text = stringResource(
                        R.string.sign_in
                        )
                    )
                }
            Row {
                Text(
                    text = stringResource(
                        R.string.account
                    ),
                    color = Color(0xFFBA9BF8),
                    fontSize = 20.sp,
                )
                Text(
                    text = stringResource(
                        R.string.sign_up
                    ),
                    color = Color(0xFF673AB7),
                    fontSize = 20.sp,
                )
            }

       }

        Card (
            modifier = Modifier
                .align(Alignment.TopEnd)
                .width(150.dp)
                .height(100.dp)
                .padding(top = 25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF9462EC)
            ),
            shape = RoundedCornerShape(

                topStart = 20.dp,
                bottomStart = 20.dp
            )

        ){  }
        Card (
            modifier = Modifier
                .align(Alignment.BottomStart)
                .width(150.dp)
                .height(75.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF9462EC)
            ),
            shape = RoundedCornerShape(

                topEnd = 20.dp,
                bottomEnd = 20.dp
            )

        ){  }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}
