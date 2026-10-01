package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import javax.annotation.Nullable;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import o.ExoPlayerImplExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class PatternView extends GroupView {
    private static final float[] onWarmupCompleted = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public int IAuthTabCallback;
    private ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent IAuthTabCallbackDefault;
    private ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private SVGLength access000;
    private SVGLength access100;
    private float asInterface;
    private SVGLength getInterfaceDescriptor;
    private SVGLength onExtraCallback;
    public String onExtraCallbackWithResult;
    private Matrix onNavigationEvent;
    private float onTransact;

    public PatternView(ReactContext reactContext) {
        super(reactContext);
        this.onNavigationEvent = null;
    }

    public void setX(Dynamic dynamic) {
        this.access100 = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.getInterfaceDescriptor = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.access000 = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setPatternUnits(int i) {
        if (i == 0) {
            this.IAuthTabCallbackStub = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.IAuthTabCallbackStub = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setPatternContentUnits(int i) {
        if (i == 0) {
            this.IAuthTabCallbackDefault = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.OBJECT_BOUNDING_BOX;
        } else if (i == 1) {
            this.IAuthTabCallbackDefault = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public void setPatternTransform(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = onWarmupCompleted;
            if (ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(readableArray, fArr, ((VirtualView) this).mScale) == 6) {
                if (this.onNavigationEvent == null) {
                    this.onNavigationEvent = new Matrix();
                }
                this.onNavigationEvent.setValues(fArr);
            }
        } else {
            this.onNavigationEvent = null;
        }
        invalidate();
    }

    public void setMinX(float f) {
        this.onTransact = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.asInterface = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.IAuthTabCallback_Parcel = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.IAuthTabCallbackStubProxy = f;
        invalidate();
    }

    public void setAlign(String str) {
        this.onExtraCallbackWithResult = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.IAuthTabCallback = i;
        invalidate();
    }

    public RectF asInterface() {
        float f = this.onTransact;
        float f2 = ((VirtualView) this).mScale;
        float f3 = this.asInterface;
        return new RectF(f * f2, f3 * f2, (f + this.IAuthTabCallback_Parcel) * f2, (f3 + this.IAuthTabCallbackStubProxy) * f2);
    }

    void saveDefinition() {
        if (((VirtualView) this).mName != null) {
            ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6 = new ExoPlayerImplExternalSyntheticLambda6(ExoPlayerImplExternalSyntheticLambda6.IAuthTabCallback.PATTERN, new SVGLength[]{this.access100, this.getInterfaceDescriptor, this.access000, this.onExtraCallback}, this.IAuthTabCallbackStub);
            exoPlayerImplExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallbackDefault);
            exoPlayerImplExternalSyntheticLambda6.onExtraCallbackWithResult(this);
            Matrix matrix = this.onNavigationEvent;
            if (matrix != null) {
                exoPlayerImplExternalSyntheticLambda6.onExtraCallback(matrix);
            }
            SvgView svgView = getSvgView();
            ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent = this.IAuthTabCallbackStub;
            ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent onnavigationevent2 = ExoPlayerImplExternalSyntheticLambda6.onNavigationEvent.USER_SPACE_ON_USE;
            if (onnavigationevent == onnavigationevent2 || this.IAuthTabCallbackDefault == onnavigationevent2) {
                exoPlayerImplExternalSyntheticLambda6.onNavigationEvent(svgView.getCanvasBounds());
            }
            svgView.defineBrush(exoPlayerImplExternalSyntheticLambda6, ((VirtualView) this).mName);
        }
    }
}
