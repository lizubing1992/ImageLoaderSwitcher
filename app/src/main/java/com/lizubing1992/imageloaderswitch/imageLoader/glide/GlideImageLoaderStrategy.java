package com.lizubing1992.imageloaderswitch.imageLoader.glide;

import android.content.Context;
import android.text.TextUtils;
import com.bumptech.glide.Glide;
import com.lizubing1992.imageloaderswitch.imageLoader.BaseImageLoaderStrategy;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class GlideImageLoaderStrategy implements BaseImageLoaderStrategy<GlideImageConfig> {

  @Override
  public void loadImage(Context ctx, GlideImageConfig config) {

    if (ctx == null) throw new IllegalStateException("Context is required");
    if (config == null) throw new IllegalStateException("GlideImageConfig is required");
    if (TextUtils.isEmpty(config.getUrl())) throw new IllegalStateException("url is required");
    if (config.getIamgeView() == null) throw new IllegalStateException("imageview is required");
    Glide.with(ctx).load(config.getUrl()).into(config.getIamgeView());
  }
}
