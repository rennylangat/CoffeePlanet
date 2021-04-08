package com.example.coffeeplanet.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.coffeeplanet.R;
import com.example.coffeeplanet.models.Coffee;

import java.util.List;

public class ItemAdapter extends PagerAdapter {
    private Context context;
    private List<Coffee> coffeeList;

    public ItemAdapter(Context context, List<Coffee> coffeeList) {
        this.context = context;
        this.coffeeList = coffeeList;
    }

    @Override
    public int getCount() {
        return coffeeList.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(0);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_food,container,false);
        ImageView imageView=view.findViewById(R.id.item_img);
        ImageView decoration=view.findViewById(R.id.tv_decoration);
        TextView itemTitle=view.findViewById(R.id.item_title);
        TextView itemSubTitle=view.findViewById(R.id.item_subtitle);
        TextView itemDesc= view.findViewById(R.id.item_desc);
        RelativeLayout relativeLayoutBack=view.findViewById(R.id.backLay);

        imageView.setImageResource(coffeeList.get(position).getImage());
        decoration.setImageResource(coffeeList.get(position).getDecoration());
        relativeLayoutBack.setBackgroundResource(coffeeList.get(position).getBackground());
        itemTitle.setText(coffeeList.get(position).getTitle());
        itemSubTitle.setText(coffeeList.get(position).getmSubtitle());
        itemDesc.setText(coffeeList.get(position).getDescription());


        return view;
    }
}
