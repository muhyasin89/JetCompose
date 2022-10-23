package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

var i=0

@Composable
fun myComposable(backPressedDispatcher: OnBackPressedDispatcher){

    val callback = remember{
        object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                // Do Something
            }
        }
    }


    DisposableEffect(key1 = backPressedDispatcher){
        backPressedDispatcher.addCallback(callback)
        onDispose{
            callback.remove()
        }
    }
    Button(onClick = { /*TODO*/ }) {
        Text(text="Click Me")
    }
}
