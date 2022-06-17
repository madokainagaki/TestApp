package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mMemoAdapter: MemoAdapter
    private lateinit var mMemoArrayList: ArrayList<Memo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mMemoAdapter = MemoAdapter(this)
        mMemoArrayList = ArrayList<Memo>()

        val title = "1日目"
        val content = "日本に初めてやってきました。"
        val name = "マルコ"
        val memo = Memo(title, content, name)
        mMemoArrayList.add(memo)
        mMemoArrayList.add(memo)

        mMemoAdapter.mMemoList = mMemoArrayList
        memoListView.adapter = mMemoAdapter
        mMemoAdapter.notifyDataSetChanged()
    }

}