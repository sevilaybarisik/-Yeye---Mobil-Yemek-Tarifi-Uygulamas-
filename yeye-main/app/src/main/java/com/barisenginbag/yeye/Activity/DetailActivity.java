package com.barisenginbag.yeye.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.barisenginbag.yeye.Domain.FoodDomain;
import com.barisenginbag.yeye.Helper.ManagmentCart;
import com.barisenginbag.yeye.R;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
private Button addToCartBtn;
private TextView  titleTxt, feeTxt, descriptionTxt, startTxt, caloryTxt, timeTxt;
private ImageView picFood;
private FoodDomain object;
private int numberOrder = 1;
private ManagmentCart managmentCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        managmentCart=new ManagmentCart(DetailActivity.this);

        initView();
        getBundle();
    }

    private void getBundle() {
        object=(FoodDomain) getIntent().getSerializableExtra("object");

        int drawableResourceId=this.getResources().getIdentifier(object.getPicUrl(), "drawable", this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(picFood);

        titleTxt.setText(object.getTitle());
        feeTxt.setText("$"+object.getPrice());
        descriptionTxt.setText(object.getDescription());
        //numberOrderTxt.setText(""+numberOrder);
        caloryTxt.setText(object.getEnergy()+" Cal");
        startTxt.setText(object.getScore()+"");
        timeTxt.setText(object.getTime()+" min");
        addToCartBtn.setText("Favorilere ekle"+Math.round(numberOrder)); // buraya işlem lazım favorilere yönlendirmesi için


        addToCartBtn.setOnClickListener(v -> {
            object.setNumberinCart(numberOrder);
            managmentCart.insertFood(object);
        });
    }



    private void initView() {
        addToCartBtn=findViewById(R.id.addToCartBtn);
        timeTxt=findViewById(R.id.timeTxt);
        feeTxt=findViewById(R.id.priceTxt);
        titleTxt=findViewById(R.id.titleTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
       // numberOrderTxt=findViewById(R.id.numberItemTxt);
        //plusBtn=findViewById(R.id.plusCardBtn);
        //minusBtn=findViewById(R.id.MinusCartBtn);
        picFood=findViewById(R.id.foodPic);
        startTxt=findViewById(R.id.StarTxt);
        caloryTxt=findViewById(R.id.calTxt);

        

    }
}