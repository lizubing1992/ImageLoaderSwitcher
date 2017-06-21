package com.lizubing1992.imageloaderswitch.imageLoader;

import android.content.Context;
import com.lizubing1992.imageloaderswitch.imageLoader.glide.GlideImageLoaderStrategy;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class ImageLoader {
  private static final ImageLoader INSTANCE = new ImageLoader();
  private ImageLoader(){
    //默认使用Glide
    mStrategy=new GlideImageLoaderStrategy();
  }
  public static ImageLoader getInstance(){
    return INSTANCE;
  }

  private BaseImageLoaderStrategy mStrategy;

  public ImageLoader(BaseImageLoaderStrategy strategy) {
    setLoadImgStrategy(strategy);
  }


  public <T extends ImageConfig> void loadImage(Context context, T config) {
    this.mStrategy.loadImage(context, config);
  }


  public void setLoadImgStrategy(BaseImageLoaderStrategy strategy) {
    this.mStrategy = strategy;
  }

}
