package kr.co.asianaidt.roomlistview_20220517.datas

import java.io.Serializable

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val explain: String,
) : Serializable {

    //가격을 구하는 함수
    fun getPrice(): String{
        if(this.price<10000){
            return "%,d".format(this.price)
        }
        else{
            val uk = this.price / 10000

            val reset = this.price % 10000

            return "${uk}억 ${"%,d".format(reset)}"
        }
    }

    //층수를 구하는 함수
    fun getFloor(): String {
        if (this.floor >1){
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }
}