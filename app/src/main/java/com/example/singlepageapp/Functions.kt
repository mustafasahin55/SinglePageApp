package com.example.singlepageapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.singlepageapp.ui.theme.AnaRenk

@Composable
fun ColorOption(color: Color, isSelected: Boolean, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(50.dp)
            .background(color, shape = CircleShape)
            .clickable { onClick() }
            .padding(2.dp)
            .border(
                width = 2.dp,
                color = if (isSelected) AnaRenk else Color.Transparent,
                shape = CircleShape
            )
    )
}