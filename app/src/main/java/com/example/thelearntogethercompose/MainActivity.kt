package com.example.thelearntogethercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.sourceInformationMarkerEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thelearntogethercompose.ui.theme.TheLearnTogetherComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheLearnTogetherComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleCardApp()
                }
            }
        }
    }
}

@Composable
private fun ArticleCardApp () {
    ArticleCard(
        image = painterResource(id = R.drawable.bg_compose_background),
        title = stringResource(id = R.string.title_compose_tutorial),
        shortDescription = stringResource(id = R.string.compose_short_desc),
        longDescription = stringResource(id = R.string.compose_long_desc)
    )

}

@Composable
private fun ArticleCard(
    image: Painter,
    title: String,
    shortDescription: String,
    longDescription: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheLearnTogetherComposeTheme {
        ArticleCardApp()
    }
}