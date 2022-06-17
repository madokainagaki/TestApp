package com.example.testapp

//    大変だったこと
//
//    Memoクラス型のArrayListをlistViewに渡して表示する際
//    [com.example.testapp.Memo@4caa8f3]になって
//    タイトルや内容が文字列で表示できなかった
//    ⇨渡された先のAdapter内でmMemoList[position].title としてあげたら
//    文字列で出るようになった。
//
