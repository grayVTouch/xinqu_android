package com.grayvtouch.xinqu;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class WelcomeViewHolder extends RecyclerView.ViewHolder
{
    public View view;

    public WelcomeViewHolder(View view)
    {
        // 还带调用下父类的构造函数
        super(view);

        this.view = view;
    }
}
