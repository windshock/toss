package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class UseView extends RenderableView {
    private SVGLength IAuthTabCallback;
    private SVGLength onExtraCallback;
    private SVGLength onExtraCallbackWithResult;
    private String onNavigationEvent;
    private SVGLength onWarmupCompleted;

    public UseView(ReactContext reactContext) {
        super(reactContext);
    }

    public void setHref(String str) {
        this.onNavigationEvent = str;
        invalidate();
    }

    public void setX(Dynamic dynamic) {
        this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setY(Dynamic dynamic) {
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setWidth(Dynamic dynamic) {
        this.onExtraCallbackWithResult = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    public void setHeight(Dynamic dynamic) {
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
    }

    void draw(Canvas canvas, Paint paint, float f) {
        RenderableView definedTemplate = getSvgView().getDefinedTemplate(this.onNavigationEvent);
        if (definedTemplate == null) {
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.onWarmupCompleted), (float) relativeOnHeight(this.IAuthTabCallback));
        boolean z = definedTemplate instanceof RenderableView;
        if (z) {
            definedTemplate.mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, ((VirtualView) this).mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof SymbolView) {
            ((SymbolView) definedTemplate).onWarmupCompleted(canvas, paint, f, (float) relativeOnWidth(this.onExtraCallbackWithResult), (float) relativeOnHeight(this.onExtraCallback));
        } else {
            definedTemplate.draw(canvas, paint, f * ((VirtualView) this).mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas, paint).computeBounds(rectF, true);
        canvas.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas, iSaveAndSetupCanvas);
        if (z) {
            definedTemplate.resetProperties();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    int hitTest(float[] fArr) {
        int iHitTest;
        if (!((VirtualView) this).mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        ((VirtualView) this).mInvMatrix.mapPoints(fArr2, fArr);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.onNavigationEvent);
        if (definedTemplate == null || (iHitTest = definedTemplate.hitTest(fArr2)) == -1) {
            return -1;
        }
        return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
    }

    Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.onNavigationEvent);
        if (definedTemplate == null) {
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.onWarmupCompleted), (float) relativeOnHeight(this.IAuthTabCallback));
        path.transform(matrix, path2);
        return path2;
    }
}
