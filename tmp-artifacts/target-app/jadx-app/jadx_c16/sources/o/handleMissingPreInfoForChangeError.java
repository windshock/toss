package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class handleMissingPreInfoForChangeError {
    public static String onExtraCallbackWithResult(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        int i = length - 1;
        while (i >= 0) {
            int i2 = i - 1;
            cArr[i] = (char) (str.charAt(i) ^ '\f');
            if (i2 < 0) {
                break;
            }
            i -= 2;
            cArr[i2] = (char) (str.charAt(i2) ^ 'C');
        }
        return new String(cArr);
    }

    public static void onExtraCallback(View view) {
        if (view == null) {
            return;
        }
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        view.setBackgroundResource(0);
        if (view.getDrawingCache() != null) {
            view.getDrawingCache().recycle();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.removeView(viewGroup.getChildAt(i));
                onExtraCallback(viewGroup.getChildAt(i));
            }
            if (!(view instanceof AdapterView)) {
                viewGroup.removeAllViews();
            }
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setCallback(null);
            }
            imageView.setImageDrawable(null);
            if (imageView.getBackground() != null) {
                imageView.getBackground().setCallback(null);
            }
            imageView.setBackgroundResource(0);
        }
        if (view instanceof ImageButton) {
            ImageButton imageButton = (ImageButton) view;
            if (imageButton.getDrawable() != null) {
                imageButton.getDrawable().setCallback(null);
            }
            imageButton.setImageDrawable(null);
            if (imageButton.getBackground() != null) {
                imageButton.getBackground().setCallback(null);
            }
            imageButton.setBackgroundResource(0);
        }
    }
}
