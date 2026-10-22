package com.example.sharedflowdemoromang

import android.os.Bundle
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
import com.example.sharedflowdemoromang.ui.theme.SharedFlowDemoRomanGTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SharedFlowDemoRomanGTheme {
                ScreenSetup()
            }
        }
    }
}

@Composable
fun ScreenSetup(modifier: Modifier = Modifier) {
    MainScreen(modifier)
}
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SharedFlowDemoRomanGTheme {

    }
}