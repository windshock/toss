package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;
import o.ExoPlayerImplExternalSyntheticLambda9;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class FeGaussianBlurView extends FilterPrimitiveView {
    ExoPlayerImplExternalSyntheticLambda9.IAuthTabCallback onExtraCallback;
    float onExtraCallbackWithResult;
    String onNavigationEvent;
    float onWarmupCompleted;

    public FeGaussianBlurView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setIn1(String str) {
        this.onNavigationEvent = str;
        invalidate();
    }

    public void setStdDeviationX(float f) {
        this.onExtraCallbackWithResult = f;
        invalidate();
    }

    public void setStdDeviationY(float f) {
        this.onWarmupCompleted = f;
        invalidate();
    }

    public void setEdgeMode(String str) {
        this.onExtraCallback = ExoPlayerImplExternalSyntheticLambda9.IAuthTabCallback.getEnum(str);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.horcrux.svg.FilterPrimitiveView
    public Bitmap onNavigationEvent(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return onWarmupCompleted(getContext(), FilterPrimitiveView.onExtraCallback(map, bitmap, this.onNavigationEvent));
    }

    private Bitmap onWarmupCompleted(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.onExtraCallbackWithResult, this.onWarmupCompleted) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }
}
