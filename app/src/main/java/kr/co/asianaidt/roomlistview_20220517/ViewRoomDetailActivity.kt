package kr.co.asianaidt.roomlistview_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kr.co.asianaidt.roomlistview_20220517.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text =roomData.getPrice()
        txtDescription.text = roomData.explain

        txtAddress.text =roomData.address
        txtFloor.text = roomData.getFloor()
    }
}