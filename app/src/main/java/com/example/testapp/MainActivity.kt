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

        fun reload(){
            mMemoAdapter.mMemoList = mMemoArrayList
            memoListView.adapter = mMemoAdapter
            mMemoAdapter.notifyDataSetChanged()
        }

        addButton.setOnClickListener{

            if (titleEdit.text.isNotEmpty()) {

                val title: String = titleEdit.text.toString()
                val content: String = contentEdit.text.toString()
                val name: String = nameEdit.text.toString()
                val memo = Memo(title, content, name)

                mMemoArrayList.add(memo)
                reload()

                titleEdit.setText("")
                contentEdit.setText("")
                nameEdit.setText("")
                titleEdit.setHint("タイトルを入力")

            }else{
                titleEdit.setHint("[必須]タイトルを入力してください")
            }
        }
    }
}