package com.grayvtouch.xinqu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class Welcome extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        this.setContentView(R.layout.welcome);
        this.run();
    }

    public void run()
    {
        // 设置数据

        Welcome context = this;

        ViewPager2 pager = this.findViewById(R.id.pager);

        pager.setAdapter(new RecyclerView.Adapter<RecyclerView.ViewHolder>() {

            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
            {
                // 进行数据填充
                LayoutInflater inflater = LayoutInflater.from(context);
                View view = inflater.inflate(R.layout.welcome_adapter_item , parent);
                return new WelcomeViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
            {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        });
    }
}
