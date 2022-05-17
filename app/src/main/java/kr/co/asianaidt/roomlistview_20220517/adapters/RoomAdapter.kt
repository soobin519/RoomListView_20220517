package kr.co.asianaidt.roomlistview_20220517.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.asianaidt.roomlistview_20220517.R
import kr.co.asianaidt.roomlistview_20220517.datas.RoomData
import org.w3c.dom.Text

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) :ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data =mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressFloor = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtExplain = row.findViewById<TextView>(R.id.txtExplain)

        txtExplain.text = data.explain

        return row


    }
}