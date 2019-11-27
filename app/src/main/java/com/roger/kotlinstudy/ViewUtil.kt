package com.roger.kotlinstudy

import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener


/**
 * @Author: CoderPig
 * @Description: 一些和View相关的扩展方法
 * @Date: Create in 下午 02:59 2019/10/17 0017
 */
/* === RecycleView滚动监听  === */
inline fun RecyclerView.addOnScrollListener(
    crossinline scrolled: (recyclerView: RecyclerView, dx: Int, dy: Int) -> Unit = { _, _, _-> },
    crossinline scrollStateChanged: (recyclerView: RecyclerView, newState: Int) -> Unit = { _, _ -> }
) {
    addOnScrollListener(object : OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            scrolled(recyclerView, dx, dy)
        }

        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            super.onScrollStateChanged(recyclerView, newState)
            scrollStateChanged(recyclerView, newState)
        }
    })
}

/* === 获取输入框文本 === */
fun TextView.textStr(): String {
    return this.text.toString()
}

/* === 输入框判空 ===*/
fun TextView.checkNotBlank(): Boolean {
    return textStr().isNotBlank()
}