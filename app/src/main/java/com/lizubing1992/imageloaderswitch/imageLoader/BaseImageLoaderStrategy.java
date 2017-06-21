package com.lizubing1992.imageloaderswitch.imageLoader;

import android.content.Context;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public interface BaseImageLoaderStrategy<T extends ImageConfig> {
  void loadImage(Context ctx, T config);
}
