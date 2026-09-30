package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;
import o.ExoPlayerImplExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeColorMatrixView extends FilterPrimitiveView {
    ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent onExtraCallback;
    String onExtraCallbackWithResult;
    ReadableArray onNavigationEvent;

    public FeColorMatrixView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setIn1(String str) {
        this.onExtraCallbackWithResult = str;
        invalidate();
    }

    public void setType(String str) {
        this.onExtraCallback = ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.getEnum(str);
        invalidate();
    }

    public void setValues(ReadableArray readableArray) {
        this.onNavigationEvent = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        float[] fArr;
        Bitmap bitmapOnExtraCallback = FilterPrimitiveView.onExtraCallback(map, bitmap, this.onExtraCallbackWithResult);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i = AnonymousClass1.onExtraCallbackWithResult[this.onExtraCallback.ordinal()];
        if (i == 1) {
            if (this.onNavigationEvent.size() >= 20) {
                fArr = new float[this.onNavigationEvent.size()];
                for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
                    fArr[i2] = ((float) this.onNavigationEvent.getDouble(i2)) * (i2 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
            }
            return bitmapOnExtraCallback;
        }
        if (i != 2) {
            if (i == 3) {
                if (this.onNavigationEvent.size() == 1) {
                    double d = (((float) this.onNavigationEvent.getDouble(0)) * 3.141592653589793d) / 180.0d;
                    float fCos = (float) Math.cos(d);
                    float fSin = (float) Math.sin(d);
                    float f = 0.715f - (fCos * 0.715f);
                    float f2 = fSin * 0.715f;
                    float f3 = 0.072f - (fCos * 0.072f);
                    float f4 = 0.213f - (fCos * 0.213f);
                    fArr = new float[]{((fCos * 0.787f) + 0.213f) - (0.213f * fSin), f - f2, f3 + (fSin * 0.928f), 0.0f, 0.0f, f4 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f3 - (0.283f * fSin), 0.0f, 0.0f, f4 - (0.787f * fSin), f + f2, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
                }
                return bitmapOnExtraCallback;
            }
            if (i == 4) {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f};
            }
            colorMatrix.set(fArr);
        } else {
            if (this.onNavigationEvent.size() == 1) {
                colorMatrix.setSaturation((float) this.onNavigationEvent.getDouble(0));
            }
            return bitmapOnExtraCallback;
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapOnExtraCallback);
    }

    /* renamed from: com.horcrux.svg.FeColorMatrixView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[ExoPlayerImplExternalSyntheticLambda9.onNavigationEvent.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
