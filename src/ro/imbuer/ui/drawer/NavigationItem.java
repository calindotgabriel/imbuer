package ro.imbuer.ui.drawer;

import android.graphics.drawable.Drawable;

/**
 * Created by Loopiezlol on 30.11.2014.
 */
public class NavigationItem {
    private String mText;
    private Drawable mDrawable;

    public NavigationItem(String text, Drawable drawable) {
        mText = text;
        mDrawable = drawable;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }
}