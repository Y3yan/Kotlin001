var Kompas = arrayOf("bumi","bulan","bintang","matahari","komet","negri di ujung tanduk","negri  para bedebah","the intelegent investor")
fun main() {
    println("Hello, world!!!")
    println(Kompas[0])
    var ob= Perpustakaan()
    ob.Jumlah(Kompas.count())
}

class Perpustakaan{
    fun Jumlah(total : Int){
    println("Buku di perpustakaan ada : "+total)
    Buku(total)
    }
    fun Buku(jumlah : Int){
        var nomor = 1
        for (a in Kompas){
            print(nomor++)
            println("."+a)
        }
    }
}
