package cl.santos.gipies;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // 3 segundos en milisegundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Crear un Handler y usarlo para enviar una intención a MainActivity después de un retraso.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Crear una nueva intención para abrir MainActivity.
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la actividad actual para que el usuario no pueda volver atrás.
            }
        }, SPLASH_DURATION);
    }
}