package com.example.android.learningcompose.ui.appdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.learningcompose.ui.theme.LearningComposeTheme

@Composable
fun AppDrawerHeader() {
  Row(
    modifier = Modifier
      .fillMaxWidth()
      .padding(12.dp),
    verticalAlignment = Alignment.CenterVertically
  ) {
    Icon(imageVector = Icons.Filled.Menu, contentDescription = "Drawer icon")
    Text(
      text = "JetNotes", modifier = Modifier
        .padding(12.dp)
        .fillMaxWidth()
    )
  }
}

@Composable
fun ScreenNavigationButton(
  icon: ImageVector,
  label: String,
  isSelected: Boolean = false,
  onClick: () -> Unit
) {
  val colors = MaterialTheme.colors
  val imageAlpha = if (isSelected) 1F else 0.6F
  val textColor = if (isSelected) colors.primary else colors.onSurface.copy(alpha = 0.6F)
  val backgroundColor = if (isSelected) colors.primary.copy(alpha = 0.12F) else colors.surface
  
  Surface(
    modifier = Modifier
      .fillMaxWidth()
      .padding(start = 8.dp, top = 8.dp, end = 8.dp),
    color = backgroundColor,
    shape = MaterialTheme.shapes.small
  ) {
    Row(
      modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
        .clickable(onClick = onClick),
      horizontalArrangement = Arrangement.Start,
      verticalAlignment = Alignment.CenterVertically
    ) {
      Image(
        imageVector = icon,
        colorFilter = ColorFilter.tint(textColor),
        alpha = imageAlpha,
        contentDescription = null
      )
      Spacer(modifier = Modifier.width(16.dp))
      Text(
        text = label,
        style = MaterialTheme.typography.body2,
        color = textColor,
        modifier = Modifier.fillMaxWidth()
      )
    }
  }
}

@Preview
@Composable
fun DrawerPreview() {
  LearningComposeTheme {
    ScreenNavigationButton(Icons.Filled.Home, "Notes", true) {}
  }
}