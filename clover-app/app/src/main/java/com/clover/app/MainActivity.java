package com.clover.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

/**
 * Actividad principal de Clover App
 * Basada en el diseño de Figma con los siguientes elementos:
 * - Ancla Flex
 * - Ancla Go
 * - Ancla Características
 * - Ancla Escribenos
 * - Botón de contacto a WhatsApp al numero 3166206430
 */
public class MainActivity extends AppCompatActivity {

    private MaterialButton buttonWhatsApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar botón de WhatsApp
        buttonWhatsApp = findViewById(R.id.buttonWhatsApp);

        // Configurar clic para abrir WhatsApp
        buttonWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp();
            }
        });
    }

    /**
     * Abre WhatsApp con el número de contacto especificado en el diseño de Figma
     * Número: 3166206430
     */
    private void openWhatsApp() {
        String phoneNumber = "573166206430"; // Código de país +57 para Colombia
        String message = "Hola, estoy interesado en Clover";
        
        try {
            // Intentar abrir WhatsApp directamente
            Uri uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.setPackage("com.whatsapp");
            startActivity(intent);
        } catch (Exception e) {
            // Si WhatsApp no está instalado, abrir en el navegador
            Uri uri = Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message));
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}
