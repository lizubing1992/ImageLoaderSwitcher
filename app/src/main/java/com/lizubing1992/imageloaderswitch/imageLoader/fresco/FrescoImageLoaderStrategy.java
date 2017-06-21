package com.lizubing1992.imageloaderswitch.imageLoader.fresco;

import android.content.Context;
import android.net.Uri;
import com.lizubing1992.imageloaderswitch.imageLoader.BaseImageLoaderStrategy;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class FrescoImageLoaderStrategy implements BaseImageLoaderStrategy<FrescoImageConfig> {

  @Override
  public void loadImage(Context ctx, FrescoImageConfig config) {
    config.getImageView().setImageURI(Uri.parse(config.getUrl()));
  }
}
