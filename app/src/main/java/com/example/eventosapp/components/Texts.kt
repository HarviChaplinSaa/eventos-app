package com.example.eventosapp.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun TitleText(value: String = "Login here") {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = value,
        color = MaterialTheme.colorScheme.onBackground,
        fontSize = 35.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold
    )
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun SubTitleText(value: String = "Welcome back you've been missed!") {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        text = value,
        color = MaterialTheme.colorScheme.onSurface,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Medium
    )
}

@Composable
fun UnderlinedText(
    value: String = "prueba",
    onClick: () -> Unit = {},
    align: Alignment = Alignment.Center,
    color: Color = MaterialTheme.colorScheme.onBackground
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = align,
    ) {
        Text(
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(5.dp),
            style = TextStyle(
                color = color,
                textDecoration = TextDecoration.Underline // Subrayado
            ),
            text = value,
            fontWeight = FontWeight.Medium,
        )
    }
}

@Composable
fun SimpleText(
    value: String = "Simple text",
    align: TextAlign = TextAlign.Center,
    color: Color = MaterialTheme.colorScheme.onBackground
) {
    Text(
        modifier = Modifier
            .fillMaxWidth(),
        style = TextStyle(
            color = color,
        ),
        text = value,
        textAlign = align
    )
}