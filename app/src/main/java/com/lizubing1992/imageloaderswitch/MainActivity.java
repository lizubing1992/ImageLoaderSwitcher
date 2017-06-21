package com.lizubing1992.imageloaderswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.lizubing1992.imageloaderswitch.imageLoader.ImageLoader;
import com.lizubing1992.imageloaderswitch.imageLoader.fresco.FrescoImageConfig;
import com.lizubing1992.imageloaderswitch.imageLoader.glide.GlideImageConfig;

public class MainActivity extends AppCompatActivity implements OnClickListener {
  private String url = "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2489051743,1646771720&fm=26&gp=0.jpg";
  /**
   * 加在图片
   */
  private Button loadBT;
  private ImageView imageView;
  private SimpleDraweeView drawView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }


  private void initView() {
    loadBT = (Button) findViewById(R.id.loadBT);
    loadBT.setOnClickListener(this);
    imageView = (ImageView) findViewById(R.id.imageView);
    drawView = (SimpleDraweeView) findViewById(R.id.drawView);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.loadBT:
//        ImageLoader.getInstance().loadImage(this, GlideImageConfig.builder().iamgeView(imageView).url(url).build());
        ImageLoader.getInstance().loadImage(this, FrescoImageConfig.builder().SimpleDraweeView(drawView).url(url).build());

        break;
    }
  }
}
