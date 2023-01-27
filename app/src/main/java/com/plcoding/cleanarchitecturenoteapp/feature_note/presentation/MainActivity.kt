package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.plcoding.cleanarchitecturenoteapp.MainViewModel
import com.plcoding.cleanarchitecturenoteapp.ui.theme.CleanArchitectureNoteAppTheme

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            setKeepOnScreenCondition{
                viewModel.isLoading.value
            }
        }

        setContent {
            CleanArchitectureNoteAppTheme {
                
            }
        }
    }
}
