package com.example.mindfulnesscoachclone

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp


@Composable
fun Homepage(){



    Column() {

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Column (
                horizontalAlignment = Alignment.Start
            ){
                Icon(imageVector = Icons.Default.List, contentDescription = null)
            }
           Column(
               horizontalAlignment = Alignment.CenterHorizontally
           ){
               Text(text = "Mindfulness Coach")
           }

            Column(
                horizontalAlignment = Alignment.End
            ){
                Icon(imageVector = Icons.Default.Star, contentDescription = null)
            }


        }

        Column(){

            Box(){
                Image(painter = painterResource(id = R.drawable.grass), contentDescription = null)
            }
        }

        Row {

            Card(
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.mindfulnesstraining),
                    contentDescription = null)

                Text(text =
                "Mindfulness" +
                        "Training"
                )

            }

            Card(
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.practisenow),
                    contentDescription = null)

                Text(text =
                "Practise" +
                        "Now"
                )

            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()

        ){

            Card(
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.trackprogress),
                    contentDescription = null)

                Text(text =
                "Track" +
                        "Progress"
                )

            }

            Card (
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.buildexpertise),
                    contentDescription = null)

                Text(text =
                "Build" +
                        "Expertise"
                )

            }
        }
    }
    }


