package com.harlan.lhc.luckpan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.harlan.lhc.luckpanlibrary.LuckPanLayout;
import com.harlan.lhc.luckpanlibrary.RotatePan;

public class MainActivity extends AppCompatActivity implements LuckPanLayout.AnimationEndListener{
    private RotatePan rotatePan;
    private LuckPanLayout luckPanLayout;
    private ImageView goBtn;
    private ImageView yunIv;
    private String[] strs ;
   // List<Bitmap> imgs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strs = getResources().getStringArray(R.array.names);
        luckPanLayout = (LuckPanLayout) findViewById(R.id.luckpan_layout);
        luckPanLayout.setAnimationEndListener(this);

        goBtn = (ImageView)findViewById(R.id.go);
        yunIv = (ImageView)findViewById(R.id.yun);
    }
    public void rotation(View view){
        luckPanLayout.rotate(1,500);
    }
    @Override
    public void endAnimation(int position) {

    }
}
