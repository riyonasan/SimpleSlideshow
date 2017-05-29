package com.example.lyonnaisalcina.simpleslideshow;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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

        //ボタンによって処理を切り替える
        if (view.getId() == R.id.ButtonShow) {
            //リソース画面sampleをimageViewMainにセット
            imageViewMain.setImageResource(R.drawable.sample);
        }else {
            //SDカードの画像をbitmapに代入
            Bitmap bitmap
                    = BitmapFactory.decodeFile("/storage/self/primarysample_sd.png");
            //bitmapをimageViewMainにセット
            imageViewMain.setImageBitmap(bitmap);
        }
        //リソース画面sampleをimageViewMainにセット
        //imageViewMain.setImageBitmap(R.drawable.sample);
    }
}