package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.datasource.onWarmupCompleted;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.horcrux.svg.events.SvgLoadEvent;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda8;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.ViewCompatFocusRelativeDirection;
import o.ViewPropertyAnimatorCompatExternalSyntheticLambda0;
import o.getCodeCacheDir;
import o.getOnlyAlertOnce;
import o.getSystemGestureInsets;
import o.getSystemWindowInsets;
import o.getTypeAnonymous;
import o.isList;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import o.restoreState;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class ImageView extends RenderableView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel;
    private static int[] getInterfaceDescriptor = {277508127, -1261103456, -1746215045, -1482021054, -232305613, -405352743, -747822863, 646524624, 1790161491, -447369996, 1832350357, 1953980676, -365731474, 436897947, -1101324008, -1280902827, 1423354575, 588300707};
    private String IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub;
    private SVGLength asBinder;
    private SVGLength asInterface;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private final AtomicBoolean onNavigationEvent;
    private SVGLength onTransact;
    private SVGLength onWarmupCompleted;

    static /* synthetic */ AtomicBoolean IAuthTabCallback(ImageView imageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        AtomicBoolean atomicBoolean = imageView.onNavigationEvent;
        int i5 = i2 + 51;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return atomicBoolean;
    }

    static /* synthetic */ String onExtraCallbackWithResult(ImageView imageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        String str = imageView.IAuthTabCallbackStub;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public ImageView(ReactContext reactContext) {
        super(reactContext);
        this.onNavigationEvent = new AtomicBoolean(false);
    }

    public void setX(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        int i4 = IAuthTabCallback_Parcel + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setY(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.asBinder = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
            int i3 = IAuthTabCallback_Parcel + 121;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.asBinder = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        throw null;
    }

    public void setWidth(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact = SVGLength.onWarmupCompleted(dynamic);
        invalidate();
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setHeight(Dynamic dynamic) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
            int i3 = 82 / 0;
        } else {
            this.onWarmupCompleted = SVGLength.onWarmupCompleted(dynamic);
            invalidate();
        }
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSrc(@Nullable ReadableMap readableMap) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 59;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        if (readableMap != null) {
            int i5 = i2 + 87;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            b(new int[]{1221922062, -345350947}, 3 - View.getDefaultSize(0, 0), objArr);
            String string = readableMap.getString(((String) objArr[0]).intern());
            this.IAuthTabCallbackStub = string;
            if (string != null) {
                int i7 = IAuthTabCallback_Parcel + 31;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                if (!string.isEmpty()) {
                    if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                        int i9 = IAuthTabCallback_Parcel + 11;
                        IAuthTabCallbackStubProxy = i9 % 128;
                        if (i9 % 2 == 0) {
                            this.onExtraCallbackWithResult = readableMap.getInt("width");
                            this.onExtraCallback = readableMap.getInt("height");
                            int i10 = 29 / 0;
                        } else {
                            this.onExtraCallbackWithResult = readableMap.getInt("width");
                            this.onExtraCallback = readableMap.getInt("height");
                        }
                    } else {
                        this.onExtraCallbackWithResult = 0;
                        this.onExtraCallback = 0;
                    }
                    if (Uri.parse(this.IAuthTabCallbackStub).getScheme() == null) {
                        ResourceDrawableIdHelper.onExtraCallback();
                        ResourceDrawableIdHelper.onNavigationEvent(((VirtualView) this).mContext, this.IAuthTabCallbackStub);
                    }
                }
            }
        }
        int i11 = IAuthTabCallbackStubProxy + 71;
        IAuthTabCallback_Parcel = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 82 / 0;
        }
    }

    public void setAlign(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = str;
        invalidate();
        int i4 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public void setMeetOrSlice(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = i;
        invalidate();
        int i5 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    void draw(Canvas canvas, Paint paint, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this.onNavigationEvent.get()) {
            return;
        }
        ViewCompatFocusRelativeDirection viewCompatFocusRelativeDirectionIAuthTabCallback = getTypeAnonymous.IAuthTabCallback();
        restoreState restorestateOnWarmupCompleted = restoreState.onWarmupCompleted(new isList(((VirtualView) this).mContext, this.IAuthTabCallbackStub).onWarmupCompleted());
        if (!(!viewCompatFocusRelativeDirectionIAuthTabCallback.onNavigationEvent(restorestateOnWarmupCompleted))) {
            onWarmupCompleted(viewCompatFocusRelativeDirectionIAuthTabCallback, restorestateOnWarmupCompleted, canvas, paint, f * ((VirtualView) this).mOpacity);
            return;
        }
        onWarmupCompleted(viewCompatFocusRelativeDirectionIAuthTabCallback, restorestateOnWarmupCompleted);
        int i4 = IAuthTabCallback_Parcel + 113;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    Path getPath(Canvas canvas, Paint paint) {
        int i = 2 % 2;
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(IAuthTabCallback(), Path.Direction.CW);
        Path path2 = ((VirtualView) this).mPath;
        int i2 = IAuthTabCallbackStubProxy + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return path2;
    }

    private static void b(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getInterfaceDescriptor;
        int i4 = -1469660336;
        long j = 0;
        int i5 = 16;
        if (iArr4 != null) {
            int i6 = $10 + 117;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i7 = 0;
            while (i7 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), 72 - (ViewConfiguration.getKeyRepeatDelay() >> i5), 8848 - Color.blue(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    j = 0;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $11 + 73;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getInterfaceDescriptor;
        if (iArr6 != null) {
            int i10 = $10 + 17;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i11 = $11 + 83;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getOffsetBefore("", 0) + 72, 8848 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 72, TextUtils.indexOf((CharSequence) "", '0') + 8849, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i2++;
                }
                i4 = -1469660336;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i12 = $11 + 79;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i14 = $11 + 125;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22251), 40 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4034), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 79, 7398 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private void onWarmupCompleted(ViewCompatFocusRelativeDirection viewCompatFocusRelativeDirection, restoreState restorestate) {
        int i = 2 % 2;
        this.onNavigationEvent.set(true);
        viewCompatFocusRelativeDirection.onNavigationEvent(restorestate, ((VirtualView) this).mContext).onExtraCallback(new ViewPropertyAnimatorCompatExternalSyntheticLambda0() { // from class: com.horcrux.svg.ImageView.2
            public void onExtraCallbackWithResult(Bitmap bitmap) {
                RenderableView renderableView = ImageView.this;
                EventDispatcher eventDispatcherOnExtraCallbackWithResult = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallbackWithResult(((VirtualView) renderableView).mContext, renderableView.getId());
                int iOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(ImageView.this);
                int id = ImageView.this.getId();
                ImageView imageView = ImageView.this;
                eventDispatcherOnExtraCallbackWithResult.onWarmupCompleted(new SvgLoadEvent(iOnExtraCallback, id, ((VirtualView) imageView).mContext, ImageView.onExtraCallbackWithResult(imageView), bitmap.getWidth(), bitmap.getHeight()));
                ImageView.IAuthTabCallback(ImageView.this).set(false);
                SvgView svgView = ImageView.this.getSvgView();
                if (svgView != null) {
                    svgView.invalidate();
                }
            }

            public void onFailureImpl(onWarmupCompleted onwarmupcompleted) {
                ImageView.IAuthTabCallback(ImageView.this).set(false);
                onwarmupcompleted.onExtraCallback();
            }
        }, getOnlyAlertOnce.onNavigationEvent());
        int i2 = IAuthTabCallback_Parcel + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Nonnull
    private RectF IAuthTabCallback() {
        int i = 2 % 2;
        double dRelativeOnWidth = relativeOnWidth(this.asInterface);
        double dRelativeOnHeight = relativeOnHeight(this.asBinder);
        double dRelativeOnWidth2 = relativeOnWidth(this.onTransact);
        double dRelativeOnHeight2 = relativeOnHeight(this.onWarmupCompleted);
        if (dRelativeOnWidth2 == 0.0d) {
            int i2 = IAuthTabCallbackStubProxy + 21;
            IAuthTabCallback_Parcel = i2 % 128;
            dRelativeOnWidth2 = i2 % 2 != 0 ? this.onExtraCallbackWithResult % ((VirtualView) this).mScale : this.onExtraCallbackWithResult * ((VirtualView) this).mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.onExtraCallback * ((VirtualView) this).mScale;
            int i3 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 5;
            }
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void onNavigationEvent(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (this.onExtraCallbackWithResult == 0 || this.onExtraCallback == 0) {
                this.onExtraCallbackWithResult = bitmap.getWidth();
                this.onExtraCallback = bitmap.getHeight();
                int i3 = IAuthTabCallbackStubProxy + 79;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
            }
            RectF rectFIAuthTabCallback = IAuthTabCallback();
            RectF rectF = new RectF(0.0f, 0.0f, this.onExtraCallbackWithResult, this.onExtraCallback);
            ExoPlayerImplComponentListenerExternalSyntheticLambda8.onExtraCallback(rectF, rectFIAuthTabCallback, this.IAuthTabCallback, this.IAuthTabCallbackDefault).mapRect(rectF);
            canvas.clipPath(getPath(canvas, paint));
            Path clipPath = getClipPath(canvas, paint);
            if (clipPath != null) {
                canvas.clipPath(clipPath);
            }
            Paint paint2 = new Paint();
            paint2.setAlpha((int) (f * 255.0f));
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
            ((VirtualView) this).mCTM.mapRect(rectF);
            setClientRect(rectF);
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void onWarmupCompleted(ViewCompatFocusRelativeDirection viewCompatFocusRelativeDirection, restoreState restorestate, Canvas canvas, Paint paint, float f) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompletedOnExtraCallback = viewCompatFocusRelativeDirection.onExtraCallback(restorestate, ((VirtualView) this).mContext);
        try {
            try {
                getCodeCacheDir getcodecachedir = (getCodeCacheDir) onwarmupcompletedOnExtraCallback.IAuthTabCallbackStub();
                try {
                    if (getcodecachedir == null) {
                        int i2 = IAuthTabCallbackStubProxy + 93;
                        IAuthTabCallback_Parcel = i2 % 128;
                        int i3 = i2 % 2;
                        return;
                    }
                    try {
                        getSystemGestureInsets getsystemgestureinsets = (getSystemWindowInsets) getcodecachedir.onExtraCallback();
                        if (!(!(getsystemgestureinsets instanceof getSystemGestureInsets))) {
                            Bitmap bitmapOnTransact = getsystemgestureinsets.onTransact();
                            if (bitmapOnTransact == null) {
                                return;
                            }
                            onNavigationEvent(canvas, paint, bitmapOnTransact, f);
                            return;
                        }
                        int i4 = IAuthTabCallbackStubProxy + 47;
                        IAuthTabCallback_Parcel = i4 % 128;
                        if (i4 % 2 != 0) {
                            onwarmupcompletedOnExtraCallback.onNavigationEvent();
                            int i5 = 89 / 0;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                } finally {
                    getCodeCacheDir.onExtraCallbackWithResult(getcodecachedir);
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        } finally {
            onwarmupcompletedOnExtraCallback.onNavigationEvent();
        }
    }
}
