package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda6;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class MarkerView extends GroupView {
    private SVGLength IAuthTabCallback;
    private SVGLength IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private float IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private SVGLength access100;
    private String asInterface;
    private SVGLength getInterfaceDescriptor;
    private String onExtraCallback;
    Matrix onExtraCallbackWithResult;
    String onNavigationEvent;
    private float onTransact;
    int onWarmupCompleted;

    public MarkerView(ReactContext reactContext) {
        super(reactContext);
        this.onExtraCallbackWithResult = new Matrix();
    }

    public void setRefX(Dynamic dynamic) {
        this.access100 = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setRefY(Dynamic dynamic) {
        this.getInterfaceDescriptor = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setMarkerWidth(Dynamic dynamic) {
        this.IAuthTabCallbackDefault = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setMarkerHeight(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setMarkerUnits(String str) {
        this.onExtraCallback = str;
        invalidate();
    }

    public void setOrient(String str) {
        this.asInterface = str;
        invalidate();
    }

    public void setMinX(float f) {
        this.onTransact = f;
        invalidate();
    }

    public void setMinY(float f) {
        this.IAuthTabCallbackStub = f;
        invalidate();
    }

    public void setVbWidth(float f) {
        this.IAuthTabCallbackStubProxy = f;
        invalidate();
    }

    public void setVbHeight(float f) {
        this.IAuthTabCallback_Parcel = f;
        invalidate();
    }

    public void setAlign(String str) {
        this.onNavigationEvent = str;
        invalidate();
    }

    public void setMeetOrSlice(int i) {
        this.onWarmupCompleted = i;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void saveDefinition() {
        if (((VirtualView) this).mName != null) {
            getSvgView().defineMarker(this, ((VirtualView) this).mName);
            for (int i = 0; i < getChildCount(); i++) {
                VirtualView childAt = getChildAt(i);
                if (childAt instanceof VirtualView) {
                    childAt.saveDefinition();
                }
            }
        }
    }

    void onNavigationEvent(Canvas canvas, Paint paint, float f, RNSVGMarkerPosition rNSVGMarkerPosition, float f2) throws Throwable {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, ((VirtualView) this).mCTM);
        this.onExtraCallbackWithResult.reset();
        ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 = rNSVGMarkerPosition.onNavigationEvent;
        this.onExtraCallbackWithResult.setTranslate((float) exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult, (float) exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallback);
        double d = "auto".equals(this.asInterface) ? -1.0d : Double.parseDouble(this.asInterface);
        if (d == -1.0d) {
            d = rNSVGMarkerPosition.onWarmupCompleted;
        }
        this.onExtraCallbackWithResult.preRotate(((float) d) + 180.0f);
        if ("strokeWidth".equals(this.onExtraCallback)) {
            Matrix matrix = this.onExtraCallbackWithResult;
            float f3 = f2 / ((VirtualView) this).mScale;
            matrix.preScale(f3, f3);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) relativeOnWidth(this.IAuthTabCallbackDefault), (float) relativeOnHeight(this.IAuthTabCallback));
        if (this.onNavigationEvent != null) {
            float f4 = this.onTransact;
            float f5 = ((VirtualView) this).mScale;
            float f6 = this.IAuthTabCallbackStub;
            Matrix matrixOnExtraCallback = ExoPlayerImplComponentListenerExternalSyntheticLambda8.onExtraCallback(new RectF(f4 * f5, f6 * f5, (f4 + this.IAuthTabCallbackStubProxy) * f5, (f6 + this.IAuthTabCallback_Parcel) * f5), rectF, this.onNavigationEvent, this.onWarmupCompleted);
            float[] fArr = new float[9];
            matrixOnExtraCallback.getValues(fArr);
            this.onExtraCallbackWithResult.preScale(fArr[0], fArr[4]);
        }
        this.onExtraCallbackWithResult.preTranslate((float) (-relativeOnWidth(this.access100)), (float) (-relativeOnHeight(this.getInterfaceDescriptor)));
        canvas.concat(this.onExtraCallbackWithResult);
        IAuthTabCallback(canvas, paint, f);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }
}
