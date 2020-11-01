import kotlin.system.exitProcess

class Main {
    companion object : Callback {

        var pemain1 = "Pemain1"
        var pemain2 = "Pemain2"
        @JvmStatic
        fun main(args: Array<String>) {
            println("Masukkan nama pemain1 :")
            pemain1 = readLine()!!
            println("Masukkan nama pemain2 :")
            pemain2 = readLine()!!
//            println("======================== Game Start ========================\n")
//            println("$pemain1 memilih: \n1. Batu\n2. Gunting\n3. Kertas")
//            val suit1 = readLine()!!
//            println("$pemain2 memilih: \n1. Batu\n2. Gunting\n3. Kertas")
//            val suit2 = readLine()!!
//            val pemain = Pemain(pemain1, suit1, pemain2, suit2)
//            val controller = Controller(this)
//            controller.setPemain(pemain)
//            controller.cariPemenang()
            mulaiPermainan()

        }

        private fun mulaiPermainan() {

            println("======================== Game Start ========================\n")
            println("$pemain1 memilih: \n1. Batu\n2. Gunting\n3. Kertas\n4. Keluar game")
            val suit1 = readLine()!!
            if (suit1.equals("4")) System.exit(-1)
            println("$pemain2 memilih: \n1. Batu\n2. Gunting\n3. Kertas\n4. Keluar game")
            val suit2 = readLine()!!
            if (suit2.equals("4")) System.exit(-1)
            val pemain = Pemain(pemain1, suit1, pemain2, suit2)
            val controller = Controller(this)
            controller.setPemain(pemain)
            controller.cariPemenang()
        }


        override fun hasil(hasil: String) {
            println("Pemenangnya adalah : $hasil \n")
            mulaiPermainan()
        }
    }
}