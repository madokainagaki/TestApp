package com.example.testapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.list_memo.view.*

class MemoAdapter(context: Context) : BaseAdapter() {
    private var mLayoutInflater: LayoutInflater
    var mMemoList = ArrayList<Memo>()

    init {
        mLayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int {
        return mMemoList.size
    }

    override fun getItem(position: Int): Any {
        return mMemoList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view

        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.list_memo, parent, false)
        }

        val titleText = convertView!!.text1 as TextView
        titleText.text = mMemoList[position].title

        val contentText = convertView.text2 as TextView
        contentText.text = mMemoList[position].contents

        val nameText = convertView.text3 as TextView
        nameText.text = mMemoList[position].name

        return convertView
    }
}

