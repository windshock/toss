package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import o.ExoPlayerImplExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class LinearGradientView extends DefinitionView {
    private static final float[] onExtraCallback = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private ReadableArray IAuthTabCallback;
    private SVGLength IAuthTabCallbackStub;
    private SVGLength asInterface;
    private ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent onExtraCallbackWithResult;
    private SVGLength onNavigationEvent;
    private SVGLength onTransact;
    private Matrix onWarmupCompleted;

    public LinearGradientView(ReactContext reactContext) {
        super(reactContext);
        this.onWarmupCompleted = null;
    }

    public void setX1(Dynamic dynamic) {
        this.onNavigationEvent = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY1(Dynamic dynamic) {
        this.asInterface = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setX2(Dynamic dynamic) {
        this.onTransact = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY2(Dynamic dynamic) {
        this.IAuthTabCallbackStub = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setGradient(ReadableArray readableArray) {
        this.IAuthTabCallback = readableArray;
        invalidate();
    }

    public void setGradientUnits(int i) {
        if (i == 0) {
            this.onExtraCallbackWithResult = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.onExtraCallbackWithResult = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setGradientTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = onExtraCallback;
            if (ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(readableArray, fArr, ((VirtualView) this).mScale) == 6) {
                if (this.onWarmupCompleted == null) {
                    this.onWarmupCompleted = new Matrix();
                }
                this.onWarmupCompleted.setValues(fArr);
            }
        } else {
            this.onWarmupCompleted = null;
        }
        invalidate();
    }

    void saveDefinition() {
        if (((VirtualView) this).mName != null) {
            ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = new ExoPlayerImplExternalSyntheticLambda6(ExoPlayerImplExternalSyntheticLambda6.IAuthTabCallback.LINEAR_GRADIENT, new SVGLength[]{this.onNavigationEvent, this.asInterface, this.onTransact, this.IAuthTabCallbackStub}, this.onExtraCallbackWithResult);
            exoPlayerImplExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallback);
            Matrix matrix = this.onWarmupCompleted;
            if (matrix != null) {
                exoPlayerImplExternalSyntheticLambda6.onExtraCallback(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.onExtraCallbackWithResult == ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE) {
                exoPlayerImplExternalSyntheticLambda6.onNavigationEvent(svgView.getCanvasBounds());
            }
            svgView.defineBrush(exoPlayerImplExternalSyntheticLambda6, ((VirtualView) this).mName);
        }
    }
}
