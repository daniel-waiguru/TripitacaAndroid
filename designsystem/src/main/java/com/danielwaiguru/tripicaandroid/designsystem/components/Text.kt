package com.danielwaiguru.tripicaandroid.designsystem.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun IconText(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    text: String
) {
    Row(
        modifier = modifier
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text)
    }
}