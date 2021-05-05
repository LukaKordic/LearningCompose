package com.example.android.learningcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.learningcompose.ui.theme.LearningComposeTheme

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      LearningComposeTheme {
        val scaffoldState: ScaffoldState = rememberScaffoldState()
        Scaffold(scaffoldState = scaffoldState,
        drawerContent = {
        
        }) {
        
        }
      }
    }
  }
}