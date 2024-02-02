fun main(){
    var c= KotaPinggir();
    c.tes()
}

open class KotaUtama{
    var a="Ini dari Kota Utama "
    var nilai1=43
}

// interface dimana tidak bisa menerima variabel & hanya bisa dari class turunannya
interface KotaA{
    fun Ka()
}

interface KotaB{
    fun Kb()
}

// class turunan bisa menerima banyak jenis induk
class KotaPinggir: KotaA,KotaB,KotaUtama(){
//     Pemanggilan method turunan dari interface harus didahului override
    override fun Ka(){
        println("Kabar Kota A : Sering banjir hingga ke pemukiman")
    }
    override fun Kb(){
        println("Kabar Kota B : Kekurangan pasokan makanan karena Suplai biasanya dari kota A")
    }
    fun tes(){
        var Kali = nilai1*47.093
// Awalnya hasil kali pastinya float atau bahkan double lalu di convert langsung di output 
        println(a+"Pergi ke Kota Pinggir untuk melakukan survei\nPada "+Kali.toInt())
        Ka()
        Kb()
    }
}
