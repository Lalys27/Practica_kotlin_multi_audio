package mx.ipn.cic.geo.multimediaaudio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import mx.ipn.cic.geo.multimediaaudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.hide()

        // Crear el objeto media player.
        mediaPlayer = MediaPlayer.create(this, R.raw.labrador_barking)

        // Métodos para reproducir y detener el audio.

        // 2. Habilitar por view binding.
        btnPlay = findViewById(R.id.btnPlay)
        binding.btnPlay.setOnClickListener {
            Log.d("MultimediaAudio", "Iniciando Reproducción...")
            mediaPlayer.start()
        }
        /*
        btnPlay.setOnClickListener {
            Log.d("MultimediaAudio", "Iniciando Reproducción...")
            mediaPlayer.start()
        }
        */

        btnPause = findViewById(R.id.btnPause)
        binding.btnPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                Log.d("MultimediaAudio", "Pausando Reproducción...")
                mediaPlayer.pause()
            }
        }
        /*

        btnPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                Log.d("MultimediaAudio", "Pausando Reproducción...")
                mediaPlayer.pause()
            }
        }
        */



        /*
        findViewById<Button>(R.id.btnPlay).setOnClickListener {
            Log.d("MultimediaAudio", "Iniciando Reproducción...")
            mediaPlayer.start()
        }
        findViewById<Button>(R.id.btnPause).setOnClickListener {
            if (mediaPlayer.isPlaying) {
                Log.d("MultimediaAudio", "Pausando Reproducción...")
                mediaPlayer.pause()
            }
        }
        */

        // Práctica. Modificar el programa para:
        // 1. Agregar colores (temas, en ambos modos).
        //THEMES.XML
        //<item name="colorPrimary">#ba68c8</item> -->
        //<item name="colorPrimaryVariant">#ee98fb</item> -->
        //<item name="colorOnPrimary">#883997</item> -->
        //<!-- Secondary brand color. -->
        //<item name="colorSecondary">#f48fb1</item> -->
        //<item name="colorSecondaryVariant">#ffc1e3</item> -->
        //<item name="colorOnSecondary">#bf5f82</item> -->

        //NIGTH THEMES
        //<item name="colorPrimary">#ce93d8</item>
        //<item name="colorPrimaryVariant">#ffc4ff</item>
        //<item name="colorOnPrimary">#9c64a6</item>
        //<!-- Secondary brand color. -->
        //<item name="colorSecondary">#a7ffeb</item>
        //<item name="colorSecondaryVariant">#dbffff</item>
        //<item name="colorOnSecondary">#75ccb9</item>


// 2. Habilitar por view binding. Activado en build.gradle y modificado en .kt

        // Documento escrito. Investigar la forma de habilitar asignación de listeners en Kotlin en archivo XML.
    }

    fun mostrarMensaje(view: View) {
        Toast.makeText(this, "Opción Seleccionada...", Toast.LENGTH_LONG).show()
    }
}