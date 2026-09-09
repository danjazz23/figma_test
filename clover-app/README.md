# Clover App - APK Android

## Descripción
Aplicación Android desarrollada basada en el diseño de Figma para Clover. La aplicación implementa una interfaz de usuario con navegación por anclas y funcionalidad de contacto vía WhatsApp.

## Características del Diseño (basado en Figma)

### Elementos Implementados:
1. **Ancla Flex** - Navegación a la sección Flex (y: 155px)
2. **Ancla Go** - Navegación a la sección Go (y: 3379.5px)
3. **Ancla Características** - Navegación a características (y: 5807.5px)
4. **Ancla Escribenos** - Navegación a contacto (y: 7255.5px)
5. **Botón WhatsApp** - Contacto directo al número 3166206430

### Paleta de Colores (extraída de Figma):
- Fondo oscuro: #1E1E1E (RGB: 0.117, 0.117, 0.117)
- Sección gris: #434343 (RGB: 0.266, 0.266, 0.266)
- Blanco: #FFFFFF
- Verde Clover: #4CAF50
- Gris Clover: #8C8C8C

### Tipografía:
- Familia: Graphik (sustituida por sans-serif en Android)
- Tamaño anclas: 22sp
- Peso: Regular (400)

## Estructura del Proyecto

```
clover-app/
├── app/
│   ├── build.gradle
│   ├── proguard-rules.pro
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/com/clover/app/
│           │   └── MainActivity.java
│           └── res/
│               ├── layout/
│               │   └── activity_main.xml
│               ├── values/
│               │   ├── colors.xml
│               │   ├── strings.xml
│               │   └── styles.xml
│               ├── drawable/
│               │   ├── ic_launcher_foreground.xml
│               │   └── ic_whatsapp.xml
│               └── mipmap-*/
│                   └── ic_launcher.xml
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── build.gradle
├── settings.gradle
└── gradlew
```

## Requisitos

- Android Studio Arctic Fox o superior
- JDK 1.8 o superior
- Android SDK 34
- Min SDK: 24 (Android 7.0)

## Construcción

1. Abrir el proyecto en Android Studio
2. Sincronizar Gradle
3. Ejecutar `./gradlew assembleDebug` para compilar
4. El APK se generará en `app/build/outputs/apk/debug/`

## Funcionalidades

### Botón de WhatsApp
- Abre WhatsApp directamente con el número +57 3166206430
- Incluye mensaje predeterminado: "Hola, estoy interesado en Clover"
- Fallback a navegador si WhatsApp no está instalado

### Scroll Vertical
- Implementa scroll continuo como en el diseño original
- Mantiene la estructura de secciones del diseño Figma

## Notas Técnicas

- Los colores fueron convertidos de valores RGB (0-1) a hexadecimal
- Las coordenadas fueron adaptadas de Figma a dimensiones Android dp
- La tipografía Graphik fue sustituida por sans-serif nativo de Android

## Licencia
Propietario - Clover
