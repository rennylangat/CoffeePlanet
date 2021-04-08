package com.example.coffeeplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.coffeeplanet.adapters.ItemAdapter;
import com.example.coffeeplanet.models.Coffee;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView tvLogo;
    Animation animLogoMove,animationTransition;
    RelativeLayout relLayoutMain;

    HorizontalInfiniteCycleViewPager viewPager;
    List<Coffee> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLogo=findViewById(R.id.tv_logo);
        viewPager=findViewById(R.id.view_pager);
        relLayoutMain=findViewById(R.id.relMain);

        animLogoMove= AnimationUtils.loadAnimation(this,R.anim.logo_move);
        animationTransition=AnimationUtils.loadAnimation(this,R.anim.tranisition);

        initData();

        ItemAdapter adapter=new ItemAdapter(this,list);

        tvLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLogo.setVisibility(View.VISIBLE);
                tvLogo.startAnimation(animLogoMove);
                viewPager.setVisibility(View.VISIBLE);
                viewPager.startAnimation(animationTransition);
            }
        });
    }

    private void initData() {
        list.add(new Coffee("Tiraumisu","Cappuccino",getString(R.string.item_desc),R.drawable.cup_capucino,R.drawable.back_cappu,R.drawable.coffee, Color.parseColor("#2d181c")));
        list.add(new Coffee("GreenTea","Latte",getString(R.string.item_desc),R.drawable.cup_greentea,R.drawable.back_green,R.drawable.tea, Color.parseColor("#5d6d1b")));
        list.add(new Coffee("Mochacino","Choco",getString(R.string.item_desc),R.drawable.cup_mocha,R.drawable.back_mocha,R.drawable.choco, Color.parseColor("#2d181c")));

    }
}