# A1.1 · Estudio comparativo de tecnologías

Voy a comparar **Android nativo, Flutter y PWA**.

| Aspecto          | Android nativo               | Flutter                            | PWA                                        |
| ---------------- | ---------------------------- | ---------------------------------- | ------------------------------------------ |
| **Lenguaje**     | Kotlin / Java                | Dart                               | HTML, CSS y JavaScript                     |
| **Herramientas** | Android Studio + Android SDK | Flutter + Android Studio/VS Code   | Editor de código + navegador               |
| **Plataformas**  | Android                      | Android, iOS, web y escritorio     | Cualquier sistema con navegador compatible |
| **Rendimiento**  | Muy alto                     | Alto                               | Medio                                      |
| **Hardware**     | Acceso completo              | Acceso amplio mediante plugins     | Acceso limitado por el navegador           |
| **Coste**        | Medio                        | Bajo/medio para varias plataformas | Bajo                                       |

### Android nativo

Es la mejor opción ya que la aplicación estará destinada principalmente a **Android** y necesita un buen rendimiento y acceso completo al hardware, como GPS.

Como estoy utilizando **Android Studio**, usaré **Kotlin**, ya que (además de ser el lenguaje que estamos trabajando en clase) es uno de los lenguajes principales para desarrollar aplicaciones Android.

### Flutter

Flutter permite crear aplicaciones para Android e iOS utilizando gran parte del mismo código.

No lo escogeremos porque nuestro proyecto está pensado para Android y no necesitamos desarrollar una versión para iOS. Aunque Flutter permitiría ahorrar trabajo al desarrollar para varias plataformas, en nuestro caso preferimos utilizar directamente las herramientas y APIs de Android.

### PWA

Una PWA es una aplicación web que funciona principalmente desde un navegador y puede instalarse en algunos dispositivos.

No la escogeremos porque nuestra aplicación necesita utilizar la localización del dispositivo y queremos una integración más directa con Android. Además, al estar trabajando específicamente con Android Studio, Android nativo se adapta mejor a los objetivos del proyecto.

### Conclusión

Finalmente, escogeremos Android nativo con Kotlin y Android Studio, porque nuestra aplicación está dirigida a Android y necesita utilizar funciones del dispositivo como la localización. Además, nos permitirá trabajar directamente con las herramientas y APIs oficiales de Android.

Descartamos Flutter porque no necesitamos desarrollar para varias plataformas y descartamos PWA porque ofrece un acceso más limitado a las funciones del dispositivo.
