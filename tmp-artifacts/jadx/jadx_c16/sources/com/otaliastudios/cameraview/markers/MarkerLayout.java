package com.otaliastudios.cameraview.markers;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import o.nestedScrollBy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class MarkerLayout extends FrameLayout {
    private final HashMap<Integer, View> onExtraCallbackWithResult;

    public MarkerLayout(@NonNull Context context) {
        super(context);
        this.onExtraCallbackWithResult = new HashMap<>();
    }

    public void onExtraCallback(int i, @Nullable nestedScrollBy nestedscrollby) {
        View viewOnWarmupCompleted;
        View view = this.onExtraCallbackWithResult.get(Integer.valueOf(i));
        if (view != null) {
            removeView(view);
        }
        if (nestedscrollby == null || (viewOnWarmupCompleted = nestedscrollby.onWarmupCompleted(getContext(), this)) == null) {
            return;
        }
        this.onExtraCallbackWithResult.put(Integer.valueOf(i), viewOnWarmupCompleted);
        addView(viewOnWarmupCompleted);
    }

    public void IAuthTabCallback(int i, @NonNull PointF[] pointFArr) {
        View view = this.onExtraCallbackWithResult.get(Integer.valueOf(i));
        if (view != null) {
            view.clearAnimation();
            if (i == 1) {
                PointF pointF = pointFArr[0];
                float width = (int) (pointF.x - (view.getWidth() / 2));
                float height = (int) (pointF.y - (view.getHeight() / 2));
                view.setTranslationX(width);
                view.setTranslationY(height);
            }
        }
    }
}
