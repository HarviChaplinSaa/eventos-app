package com.example.eventosapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun MainButton(
    text: String,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit
) {
    OutlinedButton(
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = textColor,
            containerColor = backgroundColor
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        onClick = onClick,
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(text = text)
    }
}

@Composable
fun CustomIconButton(
    icon: Painter,
    onClick: () -> Unit = {}
) {

    IconButton(
        onClick = onClick,
        modifier = Modifier
            .width(60.dp)
            .height(50.dp)
            .background(
                MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = Color.Unspecified
        )
    }
}
