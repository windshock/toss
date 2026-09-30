package com.horcrux.svg;

import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import o.ExoPlayerImplExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RadialGradientView extends DefinitionView {
    private static final float[] onWarmupCompleted = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private SVGLength IAuthTabCallback;
    private SVGLength IAuthTabCallbackDefault;
    private Matrix IAuthTabCallbackStub;
    private ReadableArray asBinder;
    private SVGLength asInterface;
    private SVGLength onExtraCallback;
    private SVGLength onExtraCallbackWithResult;
    private SVGLength onNavigationEvent;
    private ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent onTransact;

    public RadialGradientView(ReactContext reactContext) {
        super(reactContext);
        this.IAuthTabCallbackStub = null;
    }

    public void setFx(Dynamic dynamic) {
        this.onNavigationEvent = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setFy(Dynamic dynamic) {
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.IAuthTabCallbackDefault = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.asInterface = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setCx(Dynamic dynamic) {
        this.onExtraCallbackWithResult = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setGradient(ReadableArray readableArray) {
        this.asBinder = readableArray;
        invalidate();
    }

    public void setGradientUnits(int i) {
        if (i == 0) {
            this.onTransact = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.onTransact = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setGradientTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = onWarmupCompleted;
            if (ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(readableArray, fArr, ((VirtualView) this).mScale) == 6) {
                if (this.IAuthTabCallbackStub == null) {
                    this.IAuthTabCallbackStub = new Matrix();
                }
                this.IAuthTabCallbackStub.setValues(fArr);
            }
        } else {
            this.IAuthTabCallbackStub = null;
        }
        invalidate();
    }

    void saveDefinition() {
        if (((VirtualView) this).mName != null) {
            ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = new ExoPlayerImplExternalSyntheticLambda6(ExoPlayerImplExternalSyntheticLambda6.IAuthTabCallback.RADIAL_GRADIENT, new SVGLength[]{this.onNavigationEvent, this.onExtraCallback, this.IAuthTabCallbackDefault, this.asInterface, this.onExtraCallbackWithResult, this.IAuthTabCallback}, this.onTransact);
            exoPlayerImplExternalSyntheticLambda6.onExtraCallback(this.asBinder);
            Matrix matrix = this.IAuthTabCallbackStub;
            if (matrix != null) {
                exoPlayerImplExternalSyntheticLambda6.onExtraCallback(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.onTransact == ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE) {
                exoPlayerImplExternalSyntheticLambda6.onNavigationEvent(svgView.getCanvasBounds());
            }
            svgView.defineBrush(exoPlayerImplExternalSyntheticLambda6, ((VirtualView) this).mName);
        }
    }
}
