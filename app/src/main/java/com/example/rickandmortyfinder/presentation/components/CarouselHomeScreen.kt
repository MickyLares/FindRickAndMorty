import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.rickandmortyfinder.R
import com.example.rickandmortyfinder.presentation.components.BodyCard
import com.example.rickandmortyfinder.presentation.main.MainViewModel
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.skydoves.landscapist.coil.CoilImage
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun CarouselHome(
    paddingValues: PaddingValues,
    viewModel: MainViewModel,
    onClickCard: (id: Int) -> Unit
) {
    val lista by viewModel.characters.collectAsState()
    val pagerState = rememberPagerState(initialPage = 0)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HorizontalPager(
            count = lista.size,
            state = pagerState,
            contentPadding = paddingValues,
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            val character = lista[page]
            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onClickCard.invoke(character.id) }
                    .graphicsLayer {
                        rotationY = pageOffset * 30f
                        val scale = 1f - 0.15f * pageOffset
                        scaleX = scale
                        scaleY = scale
                        alpha = 1f - 0.3f * pageOffset
                    },
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                border = BorderStroke(
                    1.dp,
                    color = if (character.status == "Alive") Color.Green.copy(0.48f) else Color.Red
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = if (pageOffset < 0.5f) 16.dp else 2.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    CoilImage(
                        imageModel = { character.image },
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.5f)
                            .alpha(if (character.status.equals("Dead")) 0.3f else 1f)
                            .clip(RoundedCornerShape(16.dp)),
                        previewPlaceholder = painterResource(R.drawable.rick69)
                    )
                    BodyCard(
                        character.name,
                        character.location?.name ?: "",
                        status = character.status
                    )
                }
            }
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier.padding(16.dp)
        )
    }
}
