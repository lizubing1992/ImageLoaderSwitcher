package com.lizubing1992.imageloaderswitch.imageLoader.glide;

import android.widget.ImageView;
import com.lizubing1992.imageloaderswitch.imageLoader.ImageConfig;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class GlideImageConfig extends ImageConfig {

  private ImageView iamgeView;

  private GlideImageConfig(Builder builder) {
    url = builder.url;
    placeholder = builder.placeholder;
    errorPic = builder.errorPic;
    iamgeView = builder.iamgeView;
  }

  public static Builder builder(){

    return new Builder();
  }

  public ImageView getIamgeView() {
    return iamgeView;
  }

  public static final class Builder {

    private String url;
    private ImageView imageView;
    private int placeholder;
    private int errorPic;
    private ImageView iamgeView;

    public Builder() {
    }


    public Builder url(String val) {
      url = val;
      return this;
    }

    public Builder placeholder(int val) {
      placeholder = val;
      return this;
    }

    public Builder errorPic(int val) {
      errorPic = val;
      return this;
    }

    public Builder iamgeView(ImageView val) {
      iamgeView = val;
      return this;
    }

    public GlideImageConfig build() {
      return new GlideImageConfig(this);
    }
  }

}
