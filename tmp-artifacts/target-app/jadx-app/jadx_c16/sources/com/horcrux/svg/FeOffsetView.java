package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeOffsetView extends FilterPrimitiveView {
    SVGLength IAuthTabCallback;
    String onExtraCallback;
    SVGLength onNavigationEvent;

    public FeOffsetView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setIn1(String str) {
        this.onExtraCallback = str;
        invalidate();
    }

    public void setDx(Dynamic dynamic) {
        this.onNavigationEvent = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setDy(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapOnExtraCallback = FilterPrimitiveView.onExtraCallback(map, bitmap, this.onExtraCallback);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        SVGLength sVGLength = this.onNavigationEvent;
        float fRelativeOnWidth = sVGLength != null ? (float) relativeOnWidth(sVGLength) : 0.0f;
        SVGLength sVGLength2 = this.IAuthTabCallback;
        RectF rectF = new RectF(0.0f, 0.0f, fRelativeOnWidth, sVGLength2 != null ? (float) relativeOnHeight(sVGLength2) : 0.0f);
        getSvgView().getCtm().mapRect(rectF);
        float fWidth = rectF.left;
        if (fWidth >= 0.0f) {
            fWidth = rectF.width();
        }
        float fHeight = rectF.top;
        if (fHeight >= 0.0f) {
            fHeight = rectF.height();
        }
        canvas.drawBitmap(bitmapOnExtraCallback, fWidth, fHeight, (Paint) null);
        return bitmapCreateBitmap;
    }
}
