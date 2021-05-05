package com.example.android.learningcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Note() {
  val backgroundShape: Shape = RoundedCornerShape(4.dp)
  Row(
    modifier = Modifier
      .padding(8.dp)
      .shadow(1.dp, backgroundShape)
      .fillMaxWidth()
      .heightIn(min = 64.dp)
      .background(Color.White, backgroundShape),
    verticalAlignment = Alignment.CenterVertically
  ) {
    NoteColor(color = Color.Green, size = 40.dp, border = 2.dp, padding = 4.dp)
    Column(
      modifier = Modifier
        .weight(1F)
        .padding(start = 10.dp)
    ) {
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