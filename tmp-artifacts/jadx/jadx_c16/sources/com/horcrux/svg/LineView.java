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
class LineView extends RenderableView {
    private SVGLength IAuthTabCallback;
    private SVGLength onExtraCallbackWithResult;
    private SVGLength onNavigationEvent;
    private SVGLength onWarmupCompleted;

    public LineView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setX1(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY1(Dynamic dynamic) {
        this.onNavigationEvent = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setX2(Dynamic dynamic) {
        this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY2(Dynamic dynamic) {
        this.onExtraCallbackWithResult = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.IAuthTabCallback);
        double dRelativeOnHeight = relativeOnHeight(this.onNavigationEvent);
        double dRelativeOnWidth2 = relativeOnWidth(this.onWarmupCompleted);
        double dRelativeOnHeight2 = relativeOnHeight(this.onExtraCallbackWithResult);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList arrayList = new ArrayList();
        ((VirtualView) this).elements = arrayList;
        arrayList.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(ExoPlayerImplExternalSyntheticLambda8.kCGPathElementMoveToPoint, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, dRelativeOnHeight)}));
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddLineToPoint, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
