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
class CircleView extends RenderableView {
    private SVGLength IAuthTabCallback;
    private SVGLength onExtraCallback;
    private SVGLength onWarmupCompleted;

    public CircleView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setCx(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setCy(Dynamic dynamic) {
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setR(Dynamic dynamic) {
        this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.IAuthTabCallback);
        double dRelativeOnHeight = relativeOnHeight(this.onExtraCallback);
        double dRelativeOnOther = relativeOnOther(this.onWarmupCompleted);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList arrayList = new ArrayList();
        ((VirtualView) this).elements = arrayList;
        double d = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(ExoPlayerImplExternalSyntheticLambda8.kCGPathElementMoveToPoint, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, d)}));
        ArrayList arrayList2 = ((VirtualView) this).elements;
        ExoPlayerImplExternalSyntheticLambda8 exoPlayerImplExternalSyntheticLambda8 = ExoPlayerImplExternalSyntheticLambda8.kCGPathElementAddLineToPoint;
        double d2 = dRelativeOnWidth + dRelativeOnOther;
        arrayList2.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, d), new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d2, dRelativeOnHeight)}));
        ArrayList arrayList3 = ((VirtualView) this).elements;
        ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 = new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d2, dRelativeOnHeight);
        double d3 = dRelativeOnHeight + dRelativeOnOther;
        arrayList3.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{exoPlayerImplComponentListenerExternalSyntheticLambda6, new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, d3)}));
        double d4 = dRelativeOnWidth - dRelativeOnOther;
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, d3), new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d4, dRelativeOnHeight)}));
        ((VirtualView) this).elements.add(new ExoPlayerImplComponentListenerExternalSyntheticLambda2(exoPlayerImplExternalSyntheticLambda8, new ExoPlayerImplComponentListenerExternalSyntheticLambda6[]{new ExoPlayerImplComponentListenerExternalSyntheticLambda6(d4, dRelativeOnHeight), new ExoPlayerImplComponentListenerExternalSyntheticLambda6(dRelativeOnWidth, d)}));
        return path;
    }
}
