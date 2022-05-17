package kr.co.asianaidt.roomlistview_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.asianaidt.roomlistview_20220517.adapters.RoomAdapter
import kr.co.asianaidt.roomlistview_20220517.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))
        mRoomList.add( RoomData(8000, "서울시 종로구 ", 1, "특가, 풀옵션 "))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)


        roomListView.adapter = mRoomAdapter
    }
}