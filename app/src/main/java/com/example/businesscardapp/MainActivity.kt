package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF1E2347)
    ) {
        val image = painterResource(id = R.drawable.android_logo)

        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y = 180.dp)
        ) {
            MainTitle(image = image)
            ContactSection(modifier = Modifier.padding(top = 200.dp))
        }
    }
}

@Composable
fun MainTitle(
    modifier: Modifier = Modifier,
    image: Painter
) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .size(100.dp)
            .padding(bottom = 7.dp)
    )
    Text(
        text = stringResource(R.string.employee_name),
        color = Color.White,
        fontSize = 40.sp,
        fontWeight = FontWeight.Light,
        modifier = Modifier.padding(bottom = 5.dp)
    )
    Text(
        text = stringResource(R.string.employee_position),
        color = Color(0xFF3ddc84),
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun ContactSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Divider(
            color = Color.Gray,
            thickness = 1.dp
        )
        Row(
            modifier = Modifier.padding(top = 15.dp, start = 50.dp)
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(end = 20.dp)
            )
            Text(
                text = stringResource(R.string.employee_phone_no),
                color = Color.White
            )
        }
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.padding(top = 10.dp)
        )
        Row(
            modifier = Modifier.padding(top = 15.dp, start = 50.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(end = 20.dp)
            )
            Text(
                text = stringResource(R.string.employee_social),
                color = Color.White
            )
        }
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.padding(top = 10.dp)
        )
        Row(
            modifier = Modifier.padding(top = 15.dp, start = 50.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF3ddc84),
                modifier = Modifier.padding(end = 20.dp)
            )
            Text(
                text = stringResource(R.string.employee_email_id),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        MyApp()
    }
}