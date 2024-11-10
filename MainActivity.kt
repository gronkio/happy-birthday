package com.example.happybirthday

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import kotlinx.coroutines.NonCancellable.message
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        text = "Andre",
                        modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }



    }
@Composable
fun GreetingText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text
    )
}
@Preview(showSystemUi =true)
@Composable
fun BirthdayCardPreview(){
    HappyBirthdayTheme{
        GreetingText(
            text =  "Happy Birthday Andre!")
        }