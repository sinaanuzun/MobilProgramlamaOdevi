fun main() {
    val kilo: Double
    val boy: Double

    // Kullanıcıdan kilo ve boy bilgilerini alın
    print("Lütfen kilonuzu kilogram cinsinden girin: ")
    kilo = readLine()!!.toDouble()

    print("Lütfen boyunuzu metre cinsinden girin: ")
    boy = readLine()!!.toDouble()

    // Vücut kitle indeksini hesapla
    val vucutKitleIndeksi = kilo / (boy * boy)

    // Duruma göre kullanıcıyı bilgilendir
    if (vucutKitleIndeksi < 18.5) {
        println("Vücut kitle indeksiniz: $vucutKitleIndeksi. Zayıfsınız.")
    } else if (vucutKitleIndeksi >= 18.5 && vucutKitleIndeksi < 25) {
        println("Vücut kitle indeksiniz: $vucutKitleIndeksi. Normal kilodasınız.")
    } else if (vucutKitleIndeksi >= 25 && vucutKitleIndeksi < 30) {
        println("Vücut kitle indeksiniz: $vucutKitleIndeksi. Kilolusunuz.")
    } else {
        println("Vücut kitle indeksiniz: $vucutKitleIndeksi. Obezsiniz.")
    }
}
