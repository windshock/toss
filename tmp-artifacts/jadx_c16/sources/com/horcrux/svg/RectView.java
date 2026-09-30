package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda2;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda6;
import o.ExoPlayerImplExternalSyntheticLambda8;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class RectView extends RenderableView {
    private SVGLength IAuthTabCallback;
    private SVGLength onExtraCallback;
    private SVGLength onExtraCallbackWithResult;
    private SVGLength onNavigationEvent;
    private SVGLength onTransact;
    private SVGLength onWarmupCompleted;

    public RectView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setX(Dynamic dynamic) {
        this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.onTransact = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setRx(Dynamic dynamic) {
        this.onNavigationEvent = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setRy(Dynamic dynamic) {
        this.onExtraCallbackWithResult = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d;
        double d2;
        double d3;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.onWarmupCompleted);
        double dRelativeOnHeight2 = relativeOnHeight(this.onTransact);
        double dRelativeOnWidth3 = relativeOnWidth(this.onExtraCallback);
        double dRelativeOnHeight3 = relativeOnHeight(this.IAuthTabCallback);
        SVGLength sVGLength = this.onNavigationEvent;
        if (sVGLength != null || this.onExtraCallbackWithResult != null) {
            if (sVGLength == null) {
                dRelativeOnWidth = relativeOnHeight(this.onExtraCallbackWithResult);
            } else if (this.onExtraCallbackWithResult == null) {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
            } else {
                dRelativeOnWidth = relativeOnWidth(sVGLength);
                dRelativeOnHeight = relativeOnHeight(this.onExtraCallbackWithResult);
                d = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d) {
                    dRelativeOnWidth = d;
                }
                d2 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d2) {
                    dRelativeOnHeight = d2;
                }
                d3 = dRelativeOnWidth3;
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d) {
            }
            d2 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d2) {
            }
            d3 = dRelativeOnWidth3;
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        } else {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
            d3 = dRelativeOnWidth3;
        }
        ArrayList arrayList = new ArrayList();
        ((VirtualView) this).elements = arrayList;
        arrayList.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(ExoPlayerImplExternalSyntheticLambda8.kCGPathElementMoveToPoint, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth2, dRelativeOnHeight2)}));
        ArrayList arrayList2 = ((VirtualView) this).elements;
        ExoPlayerImplExternalSyntheticLambda8 exoPlayerImplExternalSyntheticLambda8 = ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddLineToPoint;
        double d4 = d3 + dRelativeOnWidth2;
        arrayList2.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d4, dRelativeOnHeight2)}));
        double d5 = dRelativeOnHeight2 + dRelativeOnHeight3;
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d4, d5)}));
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth2, d5)}));
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
