# Sayı Toplayıcı 📱

İki sayı girip toplamını hesaplayan basit bir Android uygulaması — Kotlin ile yazılmıştır.

## Özellikler

- İki sayı (tam veya ondalıklı) girişi
- Tek tuşla toplama işlemi
- Hatalı / boş giriş kontrolü
- Temiz ve sade Material Design arayüzü

## Ekran Görüntüsü

```
┌─────────────────────────┐
│      Sayı Toplayıcı     │
│                         │
│  [ Birinci sayı...    ] │
│  [ İkinci sayı...     ] │
│                         │
│      [ TOPLA ]          │
│                         │
│      Sonuç: 42          │
└─────────────────────────┘
```

## Gereksinimler

| Araç            | Versiyon       |
|-----------------|----------------|
| Android Studio  | Hedgehog+      |
| Kotlin          | 1.9.22         |
| Min SDK         | 24 (Android 7) |
| Target SDK      | 34 (Android 14)|
| Gradle          | 8.2            |

## Kurulum

```bash
git clone https://github.com/sdtylmz75/sayi-toplayici.git
cd sayi-toplayici
```

Android Studio'da projeyi açın ve **Run** butonuna basın.

## Proje Yapısı

```
sayi-toplayici/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/sayitoplayici/
│           │   └── MainActivity.kt       # Ana aktivite (toplama mantığı)
│           ├── res/
│           │   ├── layout/
│           │   │   └── activity_main.xml # Kullanıcı arayüzü
│           │   ├── values/
│           │   │   ├── strings.xml
│           │   │   ├── colors.xml
│           │   │   └── themes.xml
│           │   └── drawable/
│           │       └── edittext_bg.xml   # EditText arka plan şekli
│           └── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Lisans

MIT
