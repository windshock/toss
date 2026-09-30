package com.otaliastudios.cameraview.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o.animateDisappearance;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class GridLinesLayout extends View {
    public static final int onExtraCallback = Color.argb(160, 255, 255, 255);
    private int IAuthTabCallback;
    private final float IAuthTabCallbackStub;
    private ColorDrawable asInterface;
    private animateDisappearance onExtraCallbackWithResult;
    private ColorDrawable onNavigationEvent;
    onNavigationEvent onWarmupCompleted;

    public GridLinesLayout(@NonNull Context context) {
        this(context, null);
    }

    public GridLinesLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IAuthTabCallback = onExtraCallback;
        this.onNavigationEvent = new ColorDrawable(this.IAuthTabCallback);
        this.asInterface = new ColorDrawable(this.IAuthTabCallback);
        this.IAuthTabCallbackStub = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.onNavigationEvent.setBounds(i, 0, i3, (int) this.IAuthTabCallbackStub);
        this.asInterface.setBounds(0, i2, (int) this.IAuthTabCallbackStub, i4);
    }

    public void setGridMode(@NonNull animateDisappearance animatedisappearance) {
        this.onExtraCallbackWithResult = animatedisappearance;
        postInvalidate();
    }

    public void setGridColor(int i) {
        this.IAuthTabCallback = i;
        this.onNavigationEvent.setColor(i);
        this.asInterface.setColor(i);
        postInvalidate();
    }

    /* renamed from: com.otaliastudios.cameraview.internal.GridLinesLayout$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[animateDisappearance.values().length];
            onExtraCallback = iArr;
            try {
                iArr[animateDisappearance.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[animateDisappearance.DRAW_3X3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[animateDisappearance.DRAW_PHI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[animateDisappearance.DRAW_4X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int onExtraCallback() {
        int i = AnonymousClass2.onExtraCallback[this.onExtraCallbackWithResult.ordinal()];
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    private float onWarmupCompleted(int i) {
        return this.onExtraCallbackWithResult == animateDisappearance.DRAW_PHI ? i == 1 ? 0.38196602f : 0.618034f : (1.0f / (onExtraCallback() + 1)) * (i + 1.0f);
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int iOnExtraCallback = onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            float fOnWarmupCompleted = onWarmupCompleted(i);
            canvas.translate(0.0f, getHeight() * fOnWarmupCompleted);
            this.onNavigationEvent.draw(canvas);
            float f = -fOnWarmupCompleted;
            canvas.translate(0.0f, getHeight() * f);
            canvas.translate(fOnWarmupCompleted * getWidth(), 0.0f);
            this.asInterface.draw(canvas);
            canvas.translate(f * getWidth(), 0.0f);
        }
    }
}
