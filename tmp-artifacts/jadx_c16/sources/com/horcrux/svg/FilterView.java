package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import o.ExoPlayerImplExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FilterView extends DefinitionView {
    private final HashMap<String, Bitmap> onExtraCallback;
    private final FilterRegion onExtraCallbackWithResult;
    private ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult onNavigationEvent;
    private ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult onWarmupCompleted;

    public FilterView(ReactContext reactContext) {
        super(reactContext);
        this.onExtraCallback = new HashMap<>();
        this.onExtraCallbackWithResult = new FilterRegion();
    }

    public void setX(Dynamic dynamic) {
        this.onExtraCallbackWithResult.setX(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.onExtraCallbackWithResult.setY(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.onExtraCallbackWithResult.setWidth(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.onExtraCallbackWithResult.setHeight(dynamic);
        invalidate();
    }

    public void setFilterUnits(String str) {
        this.onWarmupCompleted = ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult.getEnum(str);
        invalidate();
    }

    public void setPrimitiveUnits(String str) {
        this.onNavigationEvent = ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult.getEnum(str);
        invalidate();
    }

    void saveDefinition() {
        SvgView svgView;
        if (((VirtualView) this).mName == null || (svgView = getSvgView()) == null) {
            return;
        }
        svgView.defineFilter(this, ((VirtualView) this).mName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap onExtraCallbackWithResult(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        this.onExtraCallback.clear();
        this.onExtraCallback.put("SourceGraphic", bitmap);
        this.onExtraCallback.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmap));
        this.onExtraCallback.put("BackgroundImage", bitmap2);
        this.onExtraCallback.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(bitmap2));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect cropRect = this.onExtraCallbackWithResult.getCropRect(this, this.onWarmupCompleted, rectF);
        for (int i = 0; i < getChildCount(); i++) {
            Object childAt = getChildAt(i);
            if (childAt instanceof FilterPrimitiveView) {
                FilterPrimitiveView filterPrimitiveView = (FilterPrimitiveView) childAt;
                bitmapCreateBitmap.eraseColor(0);
                FilterRegion filterRegion = filterPrimitiveView.onTransact;
                ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
                Rect cropRect2 = filterRegion.getCropRect(filterPrimitiveView, onextracallbackwithresult, onextracallbackwithresult == ExoPlayerImplExternalSyntheticLambda9.onExtraCallbackWithResult.USER_SPACE_ON_USE ? new RectF(cropRect) : rectF);
                canvas.drawBitmap(filterPrimitiveView.onNavigationEvent(this.onExtraCallback, bitmap), cropRect2, cropRect2, (Paint) null);
                bitmap = bitmapCreateBitmap.copy(Bitmap.Config.ARGB_8888, true);
                String strOnWarmupCompleted = filterPrimitiveView.onWarmupCompleted();
                if (strOnWarmupCompleted != null) {
                    this.onExtraCallback.put(strOnWarmupCompleted, bitmap);
                }
            }
        }
        bitmapCreateBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, cropRect, cropRect, (Paint) null);
        return bitmapCreateBitmap;
    }
}
