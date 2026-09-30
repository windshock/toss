package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import o.ExoPlayerImplExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeCompositeView extends FilterPrimitiveView {
    String IAuthTabCallback;
    ExoPlayerImplExternalSyntheticLambda9.onExtraCallback IAuthTabCallbackDefault;
    float asInterface;
    float onExtraCallback;
    float onExtraCallbackWithResult;
    String onNavigationEvent;
    float onWarmupCompleted;

    public FeCompositeView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setIn1(String str) {
        this.onNavigationEvent = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.IAuthTabCallback = str;
        invalidate();
    }

    public void setK1(Float f) {
        this.onWarmupCompleted = f.floatValue();
        invalidate();
    }

    public void setK2(Float f) {
        this.onExtraCallbackWithResult = f.floatValue();
        invalidate();
    }

    public void setK3(Float f) {
        this.onExtraCallback = f.floatValue();
        invalidate();
    }

    public void setK4(Float f) {
        this.asInterface = f.floatValue();
        invalidate();
    }

    public void setOperator(String str) {
        this.IAuthTabCallbackDefault = ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.getEnum(str);
        invalidate();
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmap2;
        Bitmap bitmapOnExtraCallback = FilterPrimitiveView.onExtraCallback(map, bitmap, this.onNavigationEvent);
        Bitmap bitmapOnExtraCallback2 = FilterPrimitiveView.onExtraCallback(map, bitmap, this.IAuthTabCallback);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapOnExtraCallback.getWidth(), bitmapOnExtraCallback.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapOnExtraCallback, 0.0f, 0.0f, paint);
        switch (AnonymousClass3.onExtraCallback[this.IAuthTabCallbackDefault.ordinal()]) {
            case 1:
                bitmap2 = bitmapOnExtraCallback2;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                bitmap2 = bitmapOnExtraCallback2;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                bitmap2 = bitmapOnExtraCallback2;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                bitmap2 = bitmapOnExtraCallback2;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                bitmap2 = bitmapOnExtraCallback2;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                int[] iArr2 = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                bitmapOnExtraCallback2.getPixels(iArr2, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int i = 0;
                while (i < width) {
                    int i2 = iArr[i];
                    int i3 = iArr2[i];
                    float f = this.onWarmupCompleted;
                    float f2 = (i2 >> 16) & 255;
                    float f3 = (i3 >> 16) & 255;
                    float f4 = this.onExtraCallbackWithResult;
                    float f5 = this.onExtraCallback;
                    float f6 = this.asInterface;
                    int i4 = (int) ((f * f2 * f3) + (f2 * f4) + (f3 * f5) + f6);
                    int i5 = width;
                    float f7 = (i2 >> 8) & 255;
                    Bitmap bitmap3 = bitmapOnExtraCallback2;
                    float f8 = (i3 >> 8) & 255;
                    int i6 = (int) ((f * f7 * f8) + (f7 * f4) + (f8 * f5) + f6);
                    float f9 = i2 & 255;
                    float f10 = i3 & 255;
                    int i7 = (int) ((f * f9 * f10) + (f9 * f4) + (f10 * f5) + f6);
                    float f11 = i2 >>> 24;
                    float f12 = i3 >>> 24;
                    int i8 = (int) ((f * f11 * f12) + (f11 * f4) + (f5 * f12) + f6);
                    int iMin = Math.min(255, Math.max(0, i4));
                    iArr[i] = (Math.min(255, Math.max(0, i6)) << 8) | (Math.min(255, Math.max(0, i8)) << 24) | (iMin << 16) | Math.min(255, Math.max(0, i7));
                    i++;
                    width = i5;
                    bitmapOnExtraCallback2 = bitmap3;
                }
                bitmap2 = bitmapOnExtraCallback2;
                bitmapCreateBitmap.setPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                break;
            default:
                bitmap2 = bitmapOnExtraCallback2;
                break;
        }
        if (this.IAuthTabCallbackDefault != ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.ARITHMETIC) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: com.horcrux.svg.FeCompositeView$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.values().length];
            onExtraCallback = iArr;
            try {
                iArr[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallback[ExoPlayerImplExternalSyntheticLambda9.onExtraCallback.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
