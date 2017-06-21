package com.lizubing1992.imageloaderswitch;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.lizubing1992.imageloaderswitch.imageLoader.ImageLoader;
import com.lizubing1992.imageloaderswitch.imageLoader.fresco.FrescoImageLoaderStrategy;
import com.lizubing1992.imageloaderswitch.imageLoader.glide.GlideImageLoaderStrategy;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class MyApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    Fresco.initialize(this);
    //加载使用Glide
//    ImageLoader.getInstance().setLoadImgStrategy(new GlideImageLoaderStrategy());
    //加载使用Fresco
    ImageLoader.getInstance().setLoadImgStrategy(new FrescoImageLoaderStrategy());
  }
}
