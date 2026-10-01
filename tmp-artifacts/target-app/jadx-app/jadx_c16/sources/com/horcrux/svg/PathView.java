package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda1;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda2;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class PathView extends RenderableView {
    private Path onExtraCallback;

    public PathView(ReactContext reactContext) {
        super(reactContext);
        ExoPlayerImplComponentListenerExternalSyntheticLambda1.IAuthTabCallback = ((VirtualView) this).mScale;
        this.onExtraCallback = new Path();
    }

    public void setD(String str) {
        this.onExtraCallback = ExoPlayerImplComponentListenerExternalSyntheticLambda1.IAuthTabCallback(str);
        ArrayList arrayList = ExoPlayerImplComponentListenerExternalSyntheticLambda1.onNavigationEvent;
        ((VirtualView) this).elements = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 : ((ExoPlayerImplComponentListenerExternalSyntheticLambda2) it.next()).IAuthTabCallback) {
                double d = exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult;
                double d2 = ((VirtualView) this).mScale;
                exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallbackWithResult = d * d2;
                exoPlayerImplComponentListenerExternalSyntheticLambda6.onExtraCallback *= d2;
            }
        }
        invalidate();
    }

    Path getPath(Canvas canvas, Paint paint) {
        return this.onExtraCallback;
    }
}
