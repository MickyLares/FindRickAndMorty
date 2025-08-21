package com.example.rickandmortyfinder.presentation.details.DetailsCharacters

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.characterservice.domain.model.CharacterDomain
import com.example.rickandmortyfinder.R
import com.skydoves.landscapist.coil.CoilImage
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun detailCharacterScreen(
    viewModel: DetailsCharacterViewModel = koinViewModel<DetailsCharacterViewModel>(),
    id: Int,
    onClickBack: () -> Unit
) {

    val characterDomain by viewModel.character.collectAsState()
    LaunchedEffect(id) {
        viewModel.setId(id)
    }
    AnimatedContent(
        targetState = characterDomain != null,
        label = ""
    ) { isAvailabelCharacter ->
        if (isAvailabelCharacter) {
            characterDomain?.let {
                BodyDetailScreen(
                    viewModel,
                    characterDomain = characterDomain, onClickBack
                )
            }
        } else {
            CircularProgressIndicator()
        }
    }

}

@Composable
fun BodyDetailScreen(
    viewModel: DetailsCharacterViewModel,
    characterDomain: CharacterDomain?,
    onClickBack: () -> Unit,
) {

    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 60.dp)
            .padding(8.dp)
    ) {
        Column {
            Box {
                // Imagen del producto
                CoilImage(
                    imageModel = { characterDomain?.image },
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.5f)
                        .alpha(if (characterDomain?.status.equals("Dead")) 0.3f else 1f)
                        .clip(RoundedCornerShape(16.dp)),
                    previewPlaceholder = painterResource(R.drawable.rick69)
                )


                IconButton(
                    onClick = onClickBack,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(8.dp)
                        .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Cancelar",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))


            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = characterDomain?.name ?: "",
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = characterDomain?.gender ?: "",
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = characterDomain?.origin?.name ?: "",
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(16.dp))

                if (!characterDomain?.status.equals("Dead")) {
                    Button(
                        onClick = {viewModel.updateDBCharacter("Dead")},
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Marcar como Eliminado")
                    }
                }
            }
        }
    }

}