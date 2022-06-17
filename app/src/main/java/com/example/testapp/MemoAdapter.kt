package com.example.testapp

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MemoAdapter(context: Context): BaseAdapter() {

    private val mLayoutInflater: LayoutInflater
    var mMemoList= arrayListOf<Memo>()

    init {
        this.mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getItem(position: Int): Any {
        return mMemoList[position]
    }

    override fun getItemId(position: Int): Long {
        return  0
    }

    override fun getCount(): Int {
        return mMemoList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: mLayoutInflater.inflate(R.layout.simple_list_item_2, null)
        val textView1 = view.findViewById<TextView>(R.id.text1)
        val textView2 = view.findViewById<TextView>(R.id.text2)

        // 後でTaskクラスから情報を取得するように変更する
        textView1.text = mMemoList[position].title
        textView2.text = mMemoList[position].contents

        return view
    }
}