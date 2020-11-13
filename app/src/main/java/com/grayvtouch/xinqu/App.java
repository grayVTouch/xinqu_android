package com.grayvtouch.xinqu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class App extends AppCompatActivity
{
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        this.setContentView(R.layout.app);
    }

    public void openViewActivity(View view)
    {
        Intent intent = new Intent(this ,MyView.class);
        this.startActivity(intent);
    }
}
