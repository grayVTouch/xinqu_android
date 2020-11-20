package com.grayvtouch.xinqu;

import android.os.Bundle;
import android.os.Handler;
import android.content.SharedPreferences;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Index extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        this.setContentView(R.layout.index);
        SharedPreferences spf = this.getPreferences(this.MODE_PRIVATE);
        Boolean once = spf.getBoolean("once" , true);
        if (once) {
            this.goWelcome();
        } else {
            this.goIndex();
        }
    }

    // 跳转到欢迎页
    public void goWelcome()
    {
        Intent intent = new Intent(this , Welcome.class);
        this.startActivity(intent);
    }

    // 跳转到首页
    public void goIndex()
    {
        Intent intent = new Intent(this , Index.class);
        this.startActivity(intent);
    }
}
