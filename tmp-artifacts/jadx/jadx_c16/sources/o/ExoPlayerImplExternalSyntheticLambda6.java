package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.PatternView;
import com.horcrux.svg.SVGLength;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ExoPlayerImplExternalSyntheticLambda6 {
    private Matrix IAuthTabCallback;
    private Rect IAuthTabCallbackDefault;
    private boolean asBinder;
    private final boolean asInterface;
    private ReadableArray onExtraCallback;
    private PatternView onExtraCallbackWithResult;
    private final IAuthTabCallback onNavigationEvent;
    private final SVGLength[] onWarmupCompleted;

    public enum onNavigationEvent {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    public ExoPlayerImplExternalSyntheticLambda6(IAuthTabCallback iAuthTabCallback, SVGLength[] sVGLengthArr, onNavigationEvent onnavigationevent) {
        this.onNavigationEvent = iAuthTabCallback;
        this.onWarmupCompleted = sVGLengthArr;
        this.asInterface = onnavigationevent == onNavigationEvent.OBJECT_BOUNDING_BOX;
    }

    public void onExtraCallback(onNavigationEvent onnavigationevent) {
        this.asBinder = onnavigationevent == onNavigationEvent.OBJECT_BOUNDING_BOX;
    }

    public void onExtraCallbackWithResult(PatternView patternView) {
        this.onExtraCallbackWithResult = patternView;
    }

    private static void onExtraCallback(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 << 1;
            fArr[i2] = (float) readableArray.getDouble(i3);
            iArr[i2] = (readableArray.getInt(i3 + 1) & 16777215) | (Math.round((r1 >>> 24) * f) << 24);
        }
    }

    public void onNavigationEvent(Rect rect) {
        this.IAuthTabCallbackDefault = rect;
    }

    public void onExtraCallback(ReadableArray readableArray) {
        this.onExtraCallback = readableArray;
    }

    public void onExtraCallback(Matrix matrix) {
        this.IAuthTabCallback = matrix;
    }

    private RectF onWarmupCompleted(RectF rectF) {
        float f;
        float f2;
        if (!this.asInterface) {
            rectF = new RectF(this.IAuthTabCallbackDefault);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.asInterface) {
            f = rectF.left;
            f2 = rectF.top;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new RectF(f, f2, fWidth + f, fHeight + f2);
    }

    private double onWarmupCompleted(SVGLength sVGLength, double d, float f, float f2) {
        return ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLength, d, 0.0d, (this.asInterface && sVGLength.onExtraCallbackWithResult == SVGLength.UnitType.NUMBER) ? d : f, f2);
    }

    public void onNavigationEvent(Paint paint, RectF rectF, float f, float f2) {
        float[] fArr;
        int[] iArr;
        double d;
        RectF rectFOnWarmupCompleted = onWarmupCompleted(rectF);
        float fWidth = rectFOnWarmupCompleted.width();
        float fHeight = rectFOnWarmupCompleted.height();
        float f3 = rectFOnWarmupCompleted.left;
        float f4 = rectFOnWarmupCompleted.top;
        float textSize = paint.getTextSize();
        if (this.onNavigationEvent == IAuthTabCallback.PATTERN) {
            double d2 = fWidth;
            double dOnWarmupCompleted = onWarmupCompleted(this.onWarmupCompleted[0], d2, f, textSize);
            double d3 = fHeight;
            double dOnWarmupCompleted2 = onWarmupCompleted(this.onWarmupCompleted[1], d3, f, textSize);
            double dOnWarmupCompleted3 = onWarmupCompleted(this.onWarmupCompleted[2], d2, f, textSize);
            double dOnWarmupCompleted4 = onWarmupCompleted(this.onWarmupCompleted[3], d3, f, textSize);
            if (dOnWarmupCompleted3 <= 1.0d || dOnWarmupCompleted4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dOnWarmupCompleted3, (int) dOnWarmupCompleted4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF rectFAsInterface = this.onExtraCallbackWithResult.asInterface();
            if (rectFAsInterface != null && rectFAsInterface.width() > 0.0f && rectFAsInterface.height() > 0.0f) {
                RectF rectF2 = new RectF((float) dOnWarmupCompleted, (float) dOnWarmupCompleted2, (float) dOnWarmupCompleted3, (float) dOnWarmupCompleted4);
                PatternView patternView = this.onExtraCallbackWithResult;
                canvas.concat(ExoPlayerImplComponentListenerExternalSyntheticLambda8.onExtraCallback(rectFAsInterface, rectF2, patternView.onExtraCallbackWithResult, patternView.IAuthTabCallback));
            }
            if (this.asBinder) {
                canvas.scale(fWidth / f, fHeight / f);
            }
            this.onExtraCallbackWithResult.draw(canvas, new Paint(), f2);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.IAuthTabCallback;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.onExtraCallback.size();
        if (size == 0) {
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        onExtraCallback(this.onExtraCallback, i, fArr2, iArr2, f2);
        if (i == 1) {
            int i2 = iArr2[0];
            iArr2 = new int[]{i2, i2};
            float f5 = fArr2[0];
            fArr2 = new float[]{f5, f5};
        }
        int[] iArr3 = iArr2;
        float[] fArr3 = fArr2;
        IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
        if (iAuthTabCallback == IAuthTabCallback.LINEAR_GRADIENT) {
            double d4 = fWidth;
            double d5 = f3;
            double d6 = fHeight;
            double d7 = f4;
            LinearGradient linearGradient = new LinearGradient((float) (onWarmupCompleted(this.onWarmupCompleted[0], d4, f, textSize) + d5), (float) (onWarmupCompleted(this.onWarmupCompleted[1], d6, f, textSize) + d7), (float) (d5 + onWarmupCompleted(this.onWarmupCompleted[2], d4, f, textSize)), (float) (onWarmupCompleted(this.onWarmupCompleted[3], d6, f, textSize) + d7), iArr3, fArr3, Shader.TileMode.CLAMP);
            if (this.IAuthTabCallback != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.IAuthTabCallback);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        if (iAuthTabCallback == IAuthTabCallback.RADIAL_GRADIENT) {
            double d8 = fWidth;
            double dOnWarmupCompleted5 = onWarmupCompleted(this.onWarmupCompleted[2], d8, f, textSize);
            double d9 = fHeight;
            double dOnWarmupCompleted6 = onWarmupCompleted(this.onWarmupCompleted[3], d9, f, textSize);
            if (dOnWarmupCompleted5 <= 0.0d || dOnWarmupCompleted6 <= 0.0d) {
                fArr = new float[]{fArr3[0], fArr3[fArr3.length - 1]};
                iArr = new int[]{iArr3[iArr3.length - 1], iArr3[iArr3.length - 1]};
                d = d8;
                dOnWarmupCompleted6 = d9;
            } else {
                iArr = iArr3;
                fArr = fArr3;
                d = dOnWarmupCompleted5;
            }
            double d10 = dOnWarmupCompleted6 / d;
            RadialGradient radialGradient = new RadialGradient((float) (onWarmupCompleted(this.onWarmupCompleted[4], d8, f, textSize) + f3), (float) (onWarmupCompleted(this.onWarmupCompleted[5], d9 / d10, f, textSize) + (f4 / d10)), (float) d, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d10);
            Matrix matrix5 = this.IAuthTabCallback;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
