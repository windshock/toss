package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FilterPrimitiveView extends DefinitionView {
    private String onExtraCallback;
    public final FilterRegion onTransact;

    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return null;
    }

    void saveDefinition() {
    }

    public FilterPrimitiveView(ReactContext reactContext) {
        super(reactContext);
        this.onTransact = new FilterRegion();
    }

    public void setX(Dynamic dynamic) {
        this.onTransact.setX(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.onTransact.setY(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.onTransact.setWidth(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.onTransact.setHeight(dynamic);
        invalidate();
    }

    public void setResult(String str) {
        this.onExtraCallback = str;
        invalidate();
    }

    public String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    protected static Bitmap onExtraCallback(HashMap<String, Bitmap> map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }
}
