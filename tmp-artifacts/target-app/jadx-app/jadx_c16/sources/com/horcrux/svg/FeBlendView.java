package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import com.horcrux.svg.FeBlendView$;
import java.util.HashMap;
import o.ExoPlayerImplExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeBlendView extends FilterPrimitiveView {
    String onExtraCallback;
    String onNavigationEvent;
    ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted onWarmupCompleted;

    public FeBlendView(ReactContext reactContext) {
        super(reactContext);
        this.onTransact.mX = new SVGLength(0.0d);
        this.onTransact.mY = new SVGLength(0.0d);
        this.onTransact.mW = new SVGLength("100%");
        this.onTransact.mH = new SVGLength("100%");
    }

    public void setIn1(String str) {
        this.onExtraCallback = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.onNavigationEvent = str;
        invalidate();
    }

    public void setMode(String str) {
        this.onWarmupCompleted = ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.getEnum(str);
        invalidate();
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapOnExtraCallback = FilterPrimitiveView.onExtraCallback(map, bitmap, this.onExtraCallback);
        Bitmap bitmapOnExtraCallback2 = FilterPrimitiveView.onExtraCallback(map, bitmap, this.onNavigationEvent);
        if (this.onWarmupCompleted == ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.MULTIPLY) {
            return CustomFilter.apply(bitmapOnExtraCallback, bitmapOnExtraCallback2, new FeBlendView$.ExternalSyntheticLambda0());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapOnExtraCallback.getWidth(), bitmapOnExtraCallback.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapOnExtraCallback, 0.0f, 0.0f, paint);
        int i = AnonymousClass2.IAuthTabCallback[this.onWarmupCompleted.ordinal()];
        if (i == 1 || i == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapOnExtraCallback2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ float[] IAuthTabCallback(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = 1.0f - f;
        float f3 = fArr2[0];
        float f4 = 1.0f - f3;
        float f5 = fArr[1] * f;
        float f6 = fArr2[1];
        float f7 = fArr[2] * f;
        float f8 = fArr2[2];
        float f9 = fArr[3] * f;
        float f10 = fArr2[3];
        return new float[]{1.0f - (f2 * f4), (f5 * f4) + (f6 * f3 * f2) + (f5 * f6 * f3), (f7 * f4) + (f8 * f3 * f2) + (f7 * f8 * f3), (f4 * f9) + (f10 * f3 * f2) + (f9 * f10 * f3)};
    }

    /* renamed from: com.horcrux.svg.FeBlendView$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplExternalSyntheticLambda9.onWarmupCompleted.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
