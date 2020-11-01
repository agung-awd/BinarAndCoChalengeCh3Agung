class Controller (private val listener:Callback){
    private var pemain : Pemain? = null

    fun cariPemenang() {
        var hasil:String
        if (pemain!!.suit1.equals("1") && pemain!!.suit2.equals("1") ||
                pemain!!.suit1.equals("2") && pemain!!.suit2.equals("2") ||
                pemain!!.suit1.equals("3") && pemain!!.suit2.equals("3"))
            hasil = "draw"

        else if (pemain!!.suit1.equals("1") && pemain!!.suit2.equals("2") ||
                pemain!!.suit1.equals("2") && pemain!!.suit2.equals("3") ||
                pemain!!.suit1.equals("3") && pemain!!.suit2.equals("1"))
            hasil = pemain!!.pemain1
        else {
            hasil = pemain!!.pemain2
        }
        listener.hasil(hasil)

    }
    fun setPemain(pemain:Pemain){
        this.pemain = pemain
    }
}