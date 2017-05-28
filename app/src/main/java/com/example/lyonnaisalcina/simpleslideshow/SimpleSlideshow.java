package com.example.lyonnaisalcina.simpleslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SimpleSlideshow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_slideshow);

        // レイアウト上のImageViewMainを変数imageViewMainに代入
       // ImageView imageViewMain
           //     = (ImageView)findViewById(R.id.ImageViewMain);
        // リソース画像sampleをimageViewMainにセット
       // imageViewMain.setImageResource(R.drawable.sample);
    }

    public void showImage(View view) {
        //レイアウト上のImageViewMainを変数imageViewMainに代入
        ImageView imageViewMain
                = (ImageView)findViewById(R.id.ImageViewMain);
        //リソース画面sampleをimageViewMainにセット
        imageViewMain.setImageResource(R.drawable.sample);
    }
}