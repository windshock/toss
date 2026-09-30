package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class ForeignObjectView extends GroupView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    SVGLength IAuthTabCallback;
    SVGLength IAuthTabCallbackDefault;
    SVGLength onExtraCallback;
    Canvas onExtraCallbackWithResult;
    Bitmap onNavigationEvent;
    SVGLength onWarmupCompleted;
    private static char[] IAuthTabCallbackStub = {32539, 32538, 32748};
    private static int asInterface = -1184333943;
    private static boolean onTransact = true;
    private static boolean access000 = true;

    public ForeignObjectView(ReactContext reactContext) {
        super(reactContext);
        this.onNavigationEvent = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.onExtraCallbackWithResult = new Canvas(this.onNavigationEvent);
    }

    void draw(Canvas canvas, Paint paint, float f) {
        int i = 2 % 2;
        int i2 = access100 + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float fRelativeOnWidth = (float) relativeOnWidth(this.onExtraCallback);
        float fRelativeOnHeight = (float) relativeOnHeight(this.IAuthTabCallbackDefault);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.onWarmupCompleted);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.IAuthTabCallback);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f);
        int i4 = access100 + 107;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDescendantInvalidated(@NonNull View view, @NonNull View view2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.ViewGroup*/.onDescendantInvalidated(view, view2);
        invalidate();
        int i4 = access100 + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setX(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
            int i3 = IAuthTabCallback_Parcel + 99;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        throw null;
    }

    public void setY(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        int i4 = access100 + 95;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setWidth(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
        } else {
            this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
            throw null;
        }
    }

    public void setHeight(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = access100 + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        int i4 = IAuthTabCallback_Parcel + 33;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void invalidate() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*com.horcrux.svg.VirtualView*/.invalidate();
        SvgView svgView = getSvgView();
        if (svgView != null) {
            int i4 = IAuthTabCallback_Parcel + 103;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            svgView.invalidate();
        }
        int i6 = access100 + 27;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void IAuthTabCallback(Canvas canvas, Paint paint, float f) throws Throwable {
        int i = 2 % 2;
        onNavigationEvent();
        SvgView svgView = getSvgView();
        RectF rectFIAuthTabCallbackStub = IAuthTabCallbackStub();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            SvgView childAt = getChildAt(i2);
            if (!(childAt instanceof MaskView)) {
                if (!(!(childAt instanceof VirtualView))) {
                    RenderableView renderableView = (VirtualView) childAt;
                    Object[] objArr = new Object[1];
                    b(null, new byte[]{-125, -127, -126, -127}, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                    if (!((String) objArr[0]).intern().equals(((VirtualView) renderableView).mDisplay)) {
                        boolean z = renderableView instanceof RenderableView;
                        if (z) {
                            int i3 = access100 + 41;
                            IAuthTabCallback_Parcel = i3 % 128;
                            if (i3 % 2 != 0) {
                                renderableView.mergeProperties(this);
                                int i4 = 71 / 0;
                            } else {
                                renderableView.mergeProperties(this);
                            }
                        }
                        int iSaveAndSetupCanvas = renderableView.saveAndSetupCanvas(canvas, ((VirtualView) this).mCTM);
                        renderableView.render(canvas, paint, ((VirtualView) this).mOpacity * f);
                        RectF clientRect = renderableView.getClientRect();
                        if (clientRect != null) {
                            int i5 = access100 + 25;
                            IAuthTabCallback_Parcel = i5 % 128;
                            int i6 = i5 % 2;
                            rectFIAuthTabCallbackStub.union(clientRect);
                        }
                        renderableView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z) {
                            renderableView.resetProperties();
                        }
                        if (renderableView.isResponsible()) {
                            svgView.enableTouchEvents();
                            int i7 = access100 + 123;
                            IAuthTabCallback_Parcel = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    int iSave = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
        }
        setClientRect(rectFIAuthTabCallbackStub);
        onWarmupCompleted();
    }

    private RectF IAuthTabCallbackStub() {
        int i = 2 % 2;
        float fRelativeOnWidth = (float) relativeOnWidth(this.onExtraCallback);
        float fRelativeOnHeight = (float) relativeOnHeight(this.IAuthTabCallbackDefault);
        RectF rectF = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(this.onWarmupCompleted)) + fRelativeOnWidth, ((float) relativeOnHeight(this.IAuthTabCallback)) + fRelativeOnHeight);
        int i2 = IAuthTabCallback_Parcel + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return rectF;
    }

    Path getPath(Canvas canvas, Paint paint) {
        int i = 2 % 2;
        RectF rectFIAuthTabCallbackStub = IAuthTabCallbackStub();
        Path path = new Path();
        path.addRect(rectFIAuthTabCallbackStub, Path.Direction.CW);
        path.close();
        int i2 = access100 + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return path;
    }

    public void dispatchDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super/*com.facebook.react.views.view.ReactViewGroup*/.dispatchDraw(this.onExtraCallbackWithResult);
        int i4 = access100 + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 121;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Canvas canvas2 = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            return super/*com.facebook.react.views.view.ReactViewGroup*/.drawChild(canvas2, view, j);
        }
        super/*com.facebook.react.views.view.ReactViewGroup*/.drawChild(canvas2, view, j);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallbackStub;
        long j = 0;
        float f = 0.0f;
        if (cArr2 != null) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 76, 20953 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $11 + 71;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    j = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(asInterface)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 75 - TextUtils.indexOf("", ""), 16038 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (access000) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12214 - (ViewConfiguration.getFadingEdgeLength() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onTransact) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = $11 + 97;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 'o' - AndroidCharacter.getMirror('0'), 12214 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
