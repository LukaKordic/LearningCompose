package com.example.android.learningcompose.ui.notes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Note() {
  Row(modifier = Modifier.fillMaxWidth().padding(12.dp),
  verticalAlignment = Alignment.CenterVertically) {
    Box(
      modifier = Modifier
        .size(40.dp)
        .background(Color.Green)
    )
    Column(modifier = Modifier.weight(1F).padding(start = 10.dp)) {
      Text(text = "Title", maxLines = 1)
      Text(text = "Description", maxLines = 1)
    }
    Checkbox(
      checked = false, onCheckedChange = { /*TODO*/ }
    )
  }
}

@Preview
@Composable
fun NotePreview() {
  Note()
}