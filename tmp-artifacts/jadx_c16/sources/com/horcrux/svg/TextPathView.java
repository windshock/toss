package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import javax.annotation.Nullable;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class TextPathView extends TextView {
    private ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallbackDefault IAuthTabCallbackDefault;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda4.asInterface IAuthTabCallbackStub;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda4.access000 asInterface;

    @Nullable
    private SVGLength getInterfaceDescriptor;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda4.asBinder onTransact;
    private String onWarmupCompleted;

    void onNavigationEvent() {
    }

    void onWarmupCompleted() {
    }

    public TextPathView(ReactContext reactContext) {
        super(reactContext);
        this.IAuthTabCallbackStub = ExoPlayerImplComponentListenerExternalSyntheticLambda4.asInterface.align;
        this.asInterface = ExoPlayerImplComponentListenerExternalSyntheticLambda4.access000.exact;
    }

    public void setHref(String str) {
        this.onWarmupCompleted = str;
        invalidate();
    }

    public void setStartOffset(Dynamic dynamic) {
        this.getInterfaceDescriptor = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setMethod(@Nullable String str) {
        this.IAuthTabCallbackStub = ExoPlayerImplComponentListenerExternalSyntheticLambda4.asInterface.valueOf(str);
        invalidate();
    }

    public void setSpacing(@Nullable String str) {
        this.asInterface = ExoPlayerImplComponentListenerExternalSyntheticLambda4.access000.valueOf(str);
        invalidate();
    }

    public void setSide(@Nullable String str) {
        this.onTransact = ExoPlayerImplComponentListenerExternalSyntheticLambda4.asBinder.valueOf(str);
        invalidate();
    }

    public void setSharp(@Nullable String str) {
        this.IAuthTabCallbackDefault = ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallbackDefault.valueOf(str);
        invalidate();
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda4.asBinder asBinder() {
        return this.onTransact;
    }

    ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallbackDefault IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    SVGLength IAuthTabCallbackDefault() {
        return this.getInterfaceDescriptor;
    }

    void draw(Canvas canvas, Paint paint, float f) {
        IAuthTabCallback(canvas, paint, f);
    }

    Path IAuthTabCallback(Canvas canvas, Paint paint) {
        RenderableView definedTemplate = getSvgView().getDefinedTemplate(this.onWarmupCompleted);
        if (definedTemplate instanceof RenderableView) {
            return definedTemplate.getPath(canvas, paint);
        }
        return null;
    }

    Path getPath(Canvas canvas, Paint paint) {
        return onExtraCallbackWithResult(canvas, paint);
    }
}
