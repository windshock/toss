package com.tnkfactory.ad.rwd;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class LayoutUtils {
    public static View getViewById(Activity activity, int i2) {
        if (activity != null) {
            return activity.findViewById(i2);
        }
        return null;
    }

    public static Button inflateButton(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        Button button = new Button(context);
        setViewIdLayoutParams(button, layoutParams, i2);
        return button;
    }

    public static CheckBox inflateCheckBox(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        CheckBox checkBox = new CheckBox(context);
        setViewIdLayoutParams(checkBox, layoutParams, i2);
        return checkBox;
    }

    public static GridView inflateGridView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        GridView gridView = new GridView(context);
        setViewIdLayoutParams(gridView, layoutParams, i2);
        return gridView;
    }

    public static ImageButton inflateImageButton(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        ImageButton imageButton = new ImageButton(context);
        setViewIdLayoutParams(imageButton, layoutParams, i2);
        return imageButton;
    }

    public static ImageView inflateImageView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        ImageView imageView = new ImageView(context);
        setViewIdLayoutParams(imageView, layoutParams, i2);
        return imageView;
    }

    public static LinearLayout inflateLinearLayout(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        LinearLayout linearLayout = new LinearLayout(context);
        setViewIdLayoutParams(linearLayout, layoutParams, i2);
        return linearLayout;
    }

    public static ListView inflateListView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        ListView listView = new ListView(context);
        setViewIdLayoutParams(listView, layoutParams, i2);
        return listView;
    }

    public static MediaView inflateMediaView(Context context, ViewGroup.LayoutParams layoutParams, int i2, boolean z) {
        MediaView mediaView = new MediaView(context, z);
        setViewIdLayoutParams(mediaView, layoutParams, i2);
        return mediaView;
    }

    public static ProgressBar inflateProgressBar(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleInverse);
        setViewIdLayoutParams(progressBar, layoutParams, i2);
        return progressBar;
    }

    public static RelativeLayout inflateRelativeLayout(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        setViewIdLayoutParams(relativeLayout, layoutParams, i2);
        return relativeLayout;
    }

    public static ScrollView inflateScrollView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        ScrollView scrollView = new ScrollView(context);
        setViewIdLayoutParams(scrollView, layoutParams, i2);
        return scrollView;
    }

    public static TextView inflateTextView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        TextView textView = new TextView(context);
        setViewIdLayoutParams(textView, layoutParams, i2);
        return textView;
    }

    public static View inflateView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        View view = new View(context);
        setViewIdLayoutParams(view, layoutParams, i2);
        return view;
    }

    public static WebView inflateWebView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        WebView webView = new WebView(context);
        setViewIdLayoutParams(webView, layoutParams, i2);
        return webView;
    }

    public static boolean isViewVisible(View view) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            if (!view.getGlobalVisibleRect(new Rect())) {
                return false;
            }
            if ((r1.height() * r1.width()) / (view.getHeight() * view.getWidth()) > 0.5d) {
                return true;
            }
        }
        return false;
    }

    public static void setViewIdLayoutParams(View view, ViewGroup.LayoutParams layoutParams, int i2) {
        if (view != null) {
            if (layoutParams != null) {
                view.setLayoutParams(layoutParams);
            }
            if (i2 > 0) {
                view.setId(i2);
            }
        }
    }

    public static View getViewById(View view, int i2) {
        if (view != null) {
            return view.findViewById(i2);
        }
        return null;
    }

    public static MediaView inflateMediaView(Context context, ViewGroup.LayoutParams layoutParams, int i2) {
        MediaView mediaView = new MediaView(context);
        setViewIdLayoutParams(mediaView, layoutParams, i2);
        return mediaView;
    }

    public static boolean isViewVisible(View view, boolean z) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || view.getWindowVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        if (z) {
            return ((double) (rect.height() * rect.width())) / ((double) (view.getHeight() * view.getWidth())) > 0.5d;
        }
        return true;
    }
}
