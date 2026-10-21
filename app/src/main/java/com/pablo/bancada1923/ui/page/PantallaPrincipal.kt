package com.pablo.bancada1923.ui.page

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PantallaPrincipal (/*viewModel: ViewModel*/ modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Pantalla Principal")
    }
}

@Preview
@Composable
fun PantallaPrincipalPreview() {
    PantallaPrincipal()
}