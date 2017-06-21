package com.lizubing1992.imageloaderswitch.imageLoader.fresco;

import com.facebook.drawee.view.SimpleDraweeView;
import com.lizubing1992.imageloaderswitch.imageLoader.ImageConfig;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class FrescoImageConfig extends ImageConfig {

  private SimpleDraweeView imageView;

  private FrescoImageConfig(Builder builder){
    this.imageView = builder.imageView;
    this.url = builder.url;
    this.placeholder = builder.placeholder;
    this.errorPic = builder.errorPic;

  }


  public static Builder builder(){
    return new Builder();
  }

  public SimpleDraweeView getImageView() {
    return imageView;
  }

  public static final class Builder{
    private String url;
    private SimpleDraweeView imageView;
    private int placeholder;
    private int errorPic;

    private Builder(){

    }
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder placeholder(int placeholder) {
      this.placeholder = placeholder;
      return this;
    }

    public Builder errorPic(int errorPic) {
      this.errorPic = errorPic;
      return this;
    }

    public Builder SimpleDraweeView(SimpleDraweeView imageView) {
      this.imageView = imageView;
      return this;
    }

    public FrescoImageConfig build(){
      return new FrescoImageConfig(this);
    }


  }

}
