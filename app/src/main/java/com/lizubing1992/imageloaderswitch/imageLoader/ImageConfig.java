package com.lizubing1992.imageloaderswitch.imageLoader;

import android.widget.ImageView;

/**
 * 类的作用
 *
 * @author: lizubing
 */

public class ImageConfig {
  protected String url;
  protected int placeholder;
  protected int errorPic;

  public String getUrl() {
    return url;
  }

  public int getPlaceholder() {
    return placeholder;
  }

  public int getErrorPic() {
    return errorPic;
  }
}
