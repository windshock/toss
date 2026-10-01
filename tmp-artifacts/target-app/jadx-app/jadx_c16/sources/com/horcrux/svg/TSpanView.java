package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import java.text.Bidi;
import java.util.ArrayList;
import javax.annotation.Nullable;
import o.ExoPlayerImplApi31ExternalSyntheticLambda0;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda0;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda3;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4$IAuthTabCallbackStub;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent;
import o.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import o.ResolutionSelectorBuilder;
import o.fromResolutionSelector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
class TSpanView extends TextView {
    private final AssetManager IAuthTabCallbackDefault;
    private Path IAuthTabCallbackStub;
    private TextPathView access100;
    private final ArrayList<Matrix> asInterface;
    private final ArrayList<String> onTransact;

    @Nullable
    String onWarmupCompleted;

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.onTransact = new ArrayList<>();
        this.asInterface = new ArrayList<>();
        this.IAuthTabCallbackDefault = ((VirtualView) this).mContext.getResources().getAssets();
    }

    public void setContent(@Nullable String str) {
        this.onWarmupCompleted = str;
        invalidate();
    }

    public void invalidate() {
        this.IAuthTabCallbackStub = null;
        super.invalidate();
    }

    void clearCache() {
        this.IAuthTabCallbackStub = null;
        super.clearCache();
    }

    void draw(Canvas canvas, Paint paint, float f) {
        if (this.onWarmupCompleted != null) {
            SVGLength sVGLength = ((TextView) this).onNavigationEvent;
            if (sVGLength != null && sVGLength.onWarmupCompleted != 0.0d) {
                if (setupFillPaint(paint, ((RenderableView) this).fillOpacity * f)) {
                    onExtraCallback(canvas, paint);
                }
                if (setupStrokePaint(paint, f * ((RenderableView) this).strokeOpacity)) {
                    onExtraCallback(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.onTransact.size();
            if (size > 0) {
                onWarmupCompleted(paint, onExtraCallback().onExtraCallbackWithResult());
                for (int i = 0; i < size; i++) {
                    String str = this.onTransact.get(i);
                    Matrix matrix = this.asInterface.get(i);
                    canvas.save();
                    canvas.concat(matrix);
                    canvas.drawText(str, 0.0f, 0.0f, paint);
                    canvas.restore();
                }
            }
            onNavigationEvent(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        IAuthTabCallback(canvas, paint, f);
    }

    private void onExtraCallback(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback = onExtraCallback();
        onNavigationEvent();
        ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.onExtraCallbackWithResult();
        TextPaint textPaint = new TextPaint(paint);
        onWarmupCompleted(textPaint, exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult);
        onExtraCallback(textPaint, exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult);
        double dIAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.IAuthTabCallback();
        int i = AnonymousClass5.onExtraCallback[exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallback_Parcel.ordinal()];
        if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout staticLayoutOnNavigationEvent = onNavigationEvent(textPaint, alignment, true, new SpannableString(this.onWarmupCompleted), (int) ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(((TextView) this).onNavigationEvent, canvas.getWidth(), 0.0d, ((VirtualView) this).mScale, dIAuthTabCallback));
        int lineAscent = staticLayoutOnNavigationEvent.getLineAscent(0);
        float fOnExtraCallbackWithResult = (float) exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.onExtraCallbackWithResult(0.0d);
        float fAsInterface = (float) (exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.asInterface() + lineAscent);
        onWarmupCompleted();
        canvas.save();
        canvas.translate(fOnExtraCallbackWithResult, fAsInterface);
        staticLayoutOnNavigationEvent.draw(canvas);
        canvas.restore();
    }

    private StaticLayout onNavigationEvent(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    public static String onExtraCallbackWithResult(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int iIntValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.IAuthTabCallbackStub;
        if (path != null) {
            return path;
        }
        if (this.onWarmupCompleted == null) {
            Path pathOnExtraCallbackWithResult = onExtraCallbackWithResult(canvas, paint);
            this.IAuthTabCallbackStub = pathOnExtraCallbackWithResult;
            return pathOnExtraCallbackWithResult;
        }
        asBinder();
        onNavigationEvent();
        this.IAuthTabCallbackStub = onExtraCallbackWithResult(onExtraCallbackWithResult(this.onWarmupCompleted), paint, canvas);
        onWarmupCompleted();
        return this.IAuthTabCallbackStub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    double onExtraCallbackWithResult(Paint paint) {
        if (!Double.isNaN(((TextView) this).IAuthTabCallback)) {
            return ((TextView) this).IAuthTabCallback;
        }
        String str = this.onWarmupCompleted;
        double dOnExtraCallbackWithResult = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                TextView childAt = getChildAt(i);
                if (childAt instanceof TextView) {
                    dOnExtraCallbackWithResult += childAt.onExtraCallbackWithResult(paint);
                }
            }
            ((TextView) this).IAuthTabCallback = dOnExtraCallbackWithResult;
            return dOnExtraCallbackWithResult;
        }
        if (str.length() == 0) {
            ((TextView) this).IAuthTabCallback = 0.0d;
            return 0.0d;
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallback().onExtraCallbackWithResult();
        onWarmupCompleted(paint, exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult);
        onExtraCallback(paint, exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult);
        double dMeasureText = paint.measureText(str);
        ((TextView) this).IAuthTabCallback = dMeasureText;
        return dMeasureText;
    }

    private void onExtraCallback(Paint paint, ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0) {
        int i = Build.VERSION.SDK_INT;
        double d = exoPlayerImplComponentListenerExternalSyntheticLambda0.access100;
        paint.setLetterSpacing((float) (d / (exoPlayerImplComponentListenerExternalSyntheticLambda0.asBinder * ((VirtualView) this).mScale)));
        if (d == 0.0d && exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallbackStub == ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + exoPlayerImplComponentListenerExternalSyntheticLambda0.onNavigationEvent);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + exoPlayerImplComponentListenerExternalSyntheticLambda0.onNavigationEvent);
        }
        if (i >= 26) {
            paint.setFontVariationSettings("'wght' " + exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback + exoPlayerImplComponentListenerExternalSyntheticLambda0.onTransact);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path onExtraCallbackWithResult(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z;
        double d;
        boolean[] zArr;
        ReadableMap readableMap;
        float[] fArr;
        ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda3;
        ExoPlayerImplApi31ExternalSyntheticLambda0 exoPlayerImplApi31ExternalSyntheticLambda0;
        boolean z2;
        int i;
        double d2;
        boolean z3;
        double d3;
        int i2;
        SVGLength sVGLength;
        double d4;
        boolean z4;
        String strIAuthTabCallback_Parcel;
        ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        String str2;
        boolean z7;
        int i5;
        boolean z8;
        String str3;
        char c;
        double d5;
        TSpanView tSpanView;
        Paint paint2;
        float[] fArr2;
        Matrix matrix;
        Path path;
        int i6;
        double d6;
        double d7;
        int i7;
        float[] fArr3;
        ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda32;
        PathMeasure pathMeasure2;
        boolean z9;
        double d8;
        ExoPlayerImplApi31ExternalSyntheticLambda0 exoPlayerImplApi31ExternalSyntheticLambda02;
        double d9;
        char c2;
        ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda33;
        PathMeasure pathMeasure3;
        Path path2;
        String str4;
        boolean z10;
        Path pathOnWarmupCompleted;
        int i8;
        double d10;
        double d11;
        int i9;
        int iHashCode;
        ?? r2;
        double d12;
        TSpanView tSpanView2 = this;
        Paint paint3 = paint;
        int length = str.length();
        Path path3 = new Path();
        tSpanView2.onTransact.clear();
        tSpanView2.asInterface.clear();
        if (length != 0) {
            boolean z11 = tSpanView2.access100 != null;
            if (z11) {
                PathMeasure pathMeasure4 = new PathMeasure(tSpanView2.access100.IAuthTabCallback(canvas, paint3), false);
                double length2 = pathMeasure4.getLength();
                boolean zIsClosed = pathMeasure4.isClosed();
                if (length2 != 0.0d) {
                    pathMeasure = pathMeasure4;
                    d = length2;
                    z = zIsClosed;
                }
            } else {
                pathMeasure = null;
                z = false;
                d = 0.0d;
            }
            ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback = onExtraCallback();
            ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.onExtraCallbackWithResult();
            tSpanView2.onWarmupCompleted(paint3, exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult);
            ExoPlayerImplApi31ExternalSyntheticLambda0 exoPlayerImplApi31ExternalSyntheticLambda03 = new ExoPlayerImplApi31ExternalSyntheticLambda0(paint3);
            boolean[] zArr2 = new boolean[length];
            char[] charArray = str.toCharArray();
            double d13 = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallbackStubProxy;
            Path path4 = path3;
            double d14 = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.getInterfaceDescriptor;
            double d15 = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.access100;
            boolean z12 = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.access000;
            boolean z13 = d15 == 0.0d && exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallbackStub == ExoPlayerImplComponentListenerExternalSyntheticLambda4.onWarmupCompleted.normal;
            int i10 = Build.VERSION.SDK_INT;
            if (z13) {
                StringBuilder sb = new StringBuilder();
                zArr = zArr2;
                sb.append("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ");
                sb.append(exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.onNavigationEvent);
                paint3.setFontFeatureSettings(sb.toString());
            } else {
                zArr = zArr2;
                paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.onNavigationEvent);
            }
            if (i10 >= 26) {
                paint3.setFontVariationSettings("'wght' " + exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallback + exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.onTransact);
            }
            ReadableMap readableMap2 = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback;
            float[] fArr4 = new float[length];
            paint3.getTextWidths(str, fArr4);
            ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback = exoPlayerImplComponentListenerExternalSyntheticLambda0OnExtraCallbackWithResult.IAuthTabCallback_Parcel;
            PathMeasure pathMeasure5 = pathMeasure;
            double d16 = d15;
            double dOnExtraCallbackWithResult = access100().onExtraCallbackWithResult(paint3);
            double dOnWarmupCompleted = tSpanView2.onWarmupCompleted(exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback, dOnExtraCallbackWithResult);
            double dIAuthTabCallback = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback.IAuthTabCallback();
            if (z11) {
                boolean z14 = tSpanView2.access100.IAuthTabCallbackStub() == ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallbackDefault.sharp;
                i = tSpanView2.access100.asBinder() == ExoPlayerImplComponentListenerExternalSyntheticLambda4.asBinder.right ? -1 : 1;
                boolean z15 = z14;
                readableMap = readableMap2;
                fArr = fArr4;
                exoPlayerImplComponentListenerExternalSyntheticLambda3 = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback;
                exoPlayerImplApi31ExternalSyntheticLambda0 = exoPlayerImplApi31ExternalSyntheticLambda03;
                double dOnNavigationEvent = onNavigationEvent(tSpanView2.access100.IAuthTabCallbackDefault(), d, dIAuthTabCallback);
                dOnWarmupCompleted += dOnNavigationEvent;
                if (z) {
                    d3 = dOnNavigationEvent + (exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback == ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.middle ? -(d / 2.0d) : 0.0d);
                    d2 = d3 + d;
                    i2 = i;
                    z3 = z15;
                    sVGLength = ((TextView) tSpanView2).onExtraCallback;
                    double d17 = 1.0d;
                    double d18 = d;
                    if (sVGLength == null) {
                        z4 = z3;
                        d4 = d3;
                        double dIAuthTabCallback2 = ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLength, canvas.getWidth(), 0.0d, ((VirtualView) tSpanView2).mScale, dIAuthTabCallback);
                        if (dIAuthTabCallback2 < 0.0d) {
                            throw new IllegalArgumentException("Negative textLength value");
                        }
                        if (AnonymousClass5.onExtraCallbackWithResult[((TextView) tSpanView2).onExtraCallbackWithResult.ordinal()] != 2) {
                            d16 += (dIAuthTabCallback2 - dOnExtraCallbackWithResult) / (length - 1);
                        } else {
                            d17 = dIAuthTabCallback2 / dOnExtraCallbackWithResult;
                        }
                    } else {
                        d4 = d3;
                        z4 = z3;
                    }
                    double d19 = i2;
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    double d20 = fontMetrics.descent;
                    float f = fontMetrics.leading;
                    double d21 = d17 * d19;
                    double dOnNavigationEvent2 = f + d20;
                    int i11 = i2;
                    double d22 = d2;
                    double d23 = (-fontMetrics.ascent) + f;
                    double d24 = -fontMetrics.top;
                    strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                    exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface = asInterface();
                    if (exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface == null) {
                        switch (AnonymousClass5.IAuthTabCallback[exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface.ordinal()]) {
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                                z5 = false;
                                dOnNavigationEvent2 = -d20;
                                break;
                            case 5:
                            default:
                                z5 = false;
                                dOnNavigationEvent2 = 0.0d;
                                break;
                            case 7:
                                z5 = false;
                                paint3.getTextBounds("x", 0, 1, new Rect());
                                dOnNavigationEvent2 = r2.height() / 2.0d;
                                break;
                            case 8:
                                dOnNavigationEvent2 = (d23 - d20) / 2.0d;
                                z5 = false;
                                break;
                            case 9:
                                d12 = 0.5d;
                                dOnNavigationEvent2 = d23 * d12;
                                z5 = false;
                                break;
                            case 10:
                                d12 = 0.8d;
                                dOnNavigationEvent2 = d23 * d12;
                                z5 = false;
                                break;
                            case 11:
                            case 12:
                            case 13:
                                dOnNavigationEvent2 = d23;
                                z5 = false;
                                break;
                            case 14:
                                z5 = false;
                                break;
                            case 15:
                                dOnNavigationEvent2 = (d24 + dOnNavigationEvent2) / 2.0d;
                                z5 = false;
                                break;
                            case 16:
                                dOnNavigationEvent2 = d24;
                                z5 = false;
                                break;
                        }
                    }
                    if (strIAuthTabCallback_Parcel != null && !strIAuthTabCallback_Parcel.isEmpty() && (i9 = AnonymousClass5.IAuthTabCallback[exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface.ordinal()]) != 14 && i9 != 16) {
                        iHashCode = strIAuthTabCallback_Parcel.hashCode();
                        if (iHashCode != -1720785339) {
                            if (strIAuthTabCallback_Parcel.equals("baseline")) {
                                r2 = z5;
                            }
                            if (r2 != 0) {
                            }
                        } else if (iHashCode != 114240) {
                            r2 = (iHashCode == 109801339 && strIAuthTabCallback_Parcel.equals("super")) ? 2 : -1;
                            if (r2 != 0) {
                                if (r2 != 1) {
                                    if (r2 == 2) {
                                        if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                            int i12 = readableMap.getInt("unitsPerEm");
                                            ReadableMap map = readableMap.getMap("tables");
                                            if (map.hasKey("os2")) {
                                                ReadableMap map2 = map.getMap("os2");
                                                if (map2.hasKey("ySuperscriptYOffset")) {
                                                    dOnNavigationEvent2 -= ((((VirtualView) tSpanView2).mScale * dIAuthTabCallback) * map2.getDouble("ySuperscriptYOffset")) / i12;
                                                }
                                            }
                                        }
                                    } else {
                                        double d25 = ((VirtualView) tSpanView2).mScale;
                                        dOnNavigationEvent2 -= ExoPlayerImplComponentListenerExternalSyntheticLambda5.onNavigationEvent(strIAuthTabCallback_Parcel, d25 * dIAuthTabCallback, d25, dIAuthTabCallback);
                                    }
                                } else if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i13 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map3 = readableMap.getMap("tables");
                                    if (map3.hasKey("os2")) {
                                        ReadableMap map4 = map3.getMap("os2");
                                        if (map4.hasKey("ySubscriptYOffset")) {
                                            dOnNavigationEvent2 += ((((VirtualView) tSpanView2).mScale * dIAuthTabCallback) * map4.getDouble("ySubscriptYOffset")) / i13;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (strIAuthTabCallback_Parcel.equals("sub")) {
                                r2 = 1;
                            }
                            if (r2 != 0) {
                            }
                        }
                    }
                    double d26 = dOnNavigationEvent2;
                    Matrix matrix2 = new Matrix();
                    Matrix matrix3 = new Matrix();
                    Matrix matrix4 = new Matrix();
                    float[] fArr5 = new float[9];
                    float[] fArr6 = new float[9];
                    i3 = 0;
                    while (i3 < length) {
                        char c3 = charArray[i3];
                        String strValueOf = String.valueOf(c3);
                        boolean z16 = zArr[i3];
                        if (z16) {
                            str2 = "";
                            i4 = length;
                            z6 = false;
                        } else {
                            String str5 = strValueOf;
                            int i14 = i3;
                            z6 = false;
                            while (true) {
                                int i15 = i14 + 1;
                                if (i15 < length && fArr[i15] <= 0.0f) {
                                    str5 = str5 + charArray[i15];
                                    zArr[i15] = true;
                                    i14 = i15;
                                    length = length;
                                    z6 = true;
                                }
                            }
                            i4 = length;
                            str2 = str5;
                        }
                        double dMeasureText = paint3.measureText(str2) * d17;
                        if (z12) {
                            z7 = z6;
                            i5 = i3;
                            z8 = z12;
                        } else {
                            z8 = z12;
                            z7 = z6;
                            i5 = i3;
                            d13 = (fArr[i3] * d17) - dMeasureText;
                        }
                        boolean z17 = c3 == ' ';
                        double d27 = dMeasureText + (z17 ? d14 : 0.0d) + d16;
                        if (z16) {
                            str3 = str2;
                            c = c3;
                            d5 = 0.0d;
                        } else {
                            str3 = str2;
                            c = c3;
                            d5 = d13 + d27;
                        }
                        ExoPlayerImplComponentListenerExternalSyntheticLambda3 exoPlayerImplComponentListenerExternalSyntheticLambda34 = exoPlayerImplComponentListenerExternalSyntheticLambda3;
                        double dOnExtraCallbackWithResult2 = exoPlayerImplComponentListenerExternalSyntheticLambda34.onExtraCallbackWithResult(d5);
                        double d28 = d26;
                        double dAsInterface = exoPlayerImplComponentListenerExternalSyntheticLambda34.asInterface();
                        double dOnWarmupCompleted2 = exoPlayerImplComponentListenerExternalSyntheticLambda34.onWarmupCompleted();
                        double dIAuthTabCallbackStub = exoPlayerImplComponentListenerExternalSyntheticLambda34.IAuthTabCallbackStub();
                        double dAsBinder = exoPlayerImplComponentListenerExternalSyntheticLambda34.asBinder();
                        if (z16 || z17) {
                            tSpanView = this;
                            paint2 = paint;
                            fArr2 = fArr6;
                            matrix = matrix4;
                            path = path4;
                            i6 = i4;
                            d6 = d21;
                            d7 = d18;
                            i7 = i11;
                            fArr3 = fArr5;
                            exoPlayerImplComponentListenerExternalSyntheticLambda32 = exoPlayerImplComponentListenerExternalSyntheticLambda34;
                            pathMeasure2 = pathMeasure5;
                            z9 = z8;
                        } else {
                            double d29 = dMeasureText * d19;
                            double d30 = (dOnWarmupCompleted + ((dOnExtraCallbackWithResult2 + dOnWarmupCompleted2) * d19)) - (d27 * d19);
                            if (z11) {
                                c2 = c;
                                double d31 = d30 + d29;
                                double d32 = d29 / 2.0d;
                                d9 = dAsBinder;
                                double d33 = d30 + d32;
                                if (d33 <= d22 && d33 >= d4) {
                                    exoPlayerImplComponentListenerExternalSyntheticLambda33 = exoPlayerImplComponentListenerExternalSyntheticLambda34;
                                    if (z4) {
                                        PathMeasure pathMeasure6 = pathMeasure5;
                                        pathMeasure6.getMatrix((float) d33, matrix3, 3);
                                        matrix = matrix4;
                                        pathMeasure3 = pathMeasure6;
                                        d11 = d32;
                                    } else {
                                        pathMeasure3 = pathMeasure5;
                                        if (d30 < 0.0d) {
                                            pathMeasure3.getMatrix(0.0f, matrix2, 3);
                                            matrix2.preTranslate((float) d30, 0.0f);
                                            i8 = 1;
                                        } else {
                                            i8 = 1;
                                            pathMeasure3.getMatrix((float) d30, matrix2, 1);
                                        }
                                        pathMeasure3.getMatrix((float) d33, matrix3, i8);
                                        if (d31 > d18) {
                                            d10 = d18;
                                            pathMeasure3.getMatrix((float) d10, matrix4, 3);
                                            matrix4.preTranslate((float) (d31 - d10), 0.0f);
                                        } else {
                                            d10 = d18;
                                            pathMeasure3.getMatrix((float) d31, matrix4, i8);
                                        }
                                        matrix2.getValues(fArr5);
                                        matrix4.getValues(fArr6);
                                        matrix = matrix4;
                                        d18 = d10;
                                        matrix3.preRotate((float) (Math.atan2(fArr6[5] - fArr5[5], fArr6[2] - fArr5[2]) * 57.29577951308232d * d19));
                                        d11 = d32;
                                    }
                                    matrix3.preTranslate((float) (-d11), (float) (dIAuthTabCallbackStub + d28));
                                    d6 = d21;
                                    i7 = i11;
                                    matrix3.preScale((float) d6, i7);
                                    matrix3.postTranslate(0.0f, (float) dAsInterface);
                                } else {
                                    matrix = matrix4;
                                    d6 = d21;
                                    i7 = i11;
                                    tSpanView = this;
                                    paint2 = paint;
                                    fArr2 = fArr6;
                                    fArr3 = fArr5;
                                    pathMeasure2 = pathMeasure5;
                                    path = path4;
                                    i6 = i4;
                                    z9 = z8;
                                    exoPlayerImplComponentListenerExternalSyntheticLambda32 = exoPlayerImplComponentListenerExternalSyntheticLambda34;
                                    d7 = d18;
                                }
                            } else {
                                d9 = dAsBinder;
                                c2 = c;
                                exoPlayerImplComponentListenerExternalSyntheticLambda33 = exoPlayerImplComponentListenerExternalSyntheticLambda34;
                                matrix = matrix4;
                                pathMeasure3 = pathMeasure5;
                                d6 = d21;
                                i7 = i11;
                                matrix3.setTranslate((float) d30, (float) (dAsInterface + dIAuthTabCallbackStub + d28));
                            }
                            matrix3.preRotate((float) d9);
                            if (z7) {
                                pathOnWarmupCompleted = new Path();
                                d7 = d18;
                                pathMeasure2 = pathMeasure3;
                                fArr2 = fArr6;
                                fArr3 = fArr5;
                                path2 = path4;
                                z9 = z8;
                                exoPlayerImplComponentListenerExternalSyntheticLambda32 = exoPlayerImplComponentListenerExternalSyntheticLambda33;
                                i6 = i4;
                                d8 = d19;
                                z10 = true;
                                paint.getTextPath(str3, 0, str3.length(), 0.0f, 0.0f, pathOnWarmupCompleted);
                                exoPlayerImplApi31ExternalSyntheticLambda02 = exoPlayerImplApi31ExternalSyntheticLambda0;
                                str4 = str3;
                            } else {
                                fArr2 = fArr6;
                                fArr3 = fArr5;
                                pathMeasure2 = pathMeasure3;
                                path2 = path4;
                                char c4 = c2;
                                i6 = i4;
                                z9 = z8;
                                exoPlayerImplComponentListenerExternalSyntheticLambda32 = exoPlayerImplComponentListenerExternalSyntheticLambda33;
                                d7 = d18;
                                str4 = str3;
                                d8 = d19;
                                exoPlayerImplApi31ExternalSyntheticLambda02 = exoPlayerImplApi31ExternalSyntheticLambda0;
                                z10 = true;
                                pathOnWarmupCompleted = exoPlayerImplApi31ExternalSyntheticLambda02.onWarmupCompleted(c4, str4);
                            }
                            RectF rectF = new RectF();
                            pathOnWarmupCompleted.computeBounds(rectF, z10);
                            if (rectF.width() == 0.0f) {
                                canvas.save();
                                canvas.concat(matrix3);
                                tSpanView = this;
                                tSpanView.onTransact.add(str4);
                                tSpanView.asInterface.add(new Matrix(matrix3));
                                paint2 = paint;
                                canvas.drawText(str4, 0.0f, 0.0f, paint2);
                                canvas.restore();
                                path = path2;
                            } else {
                                tSpanView = this;
                                paint2 = paint;
                                pathOnWarmupCompleted.transform(matrix3);
                                path = path2;
                                path.addPath(pathOnWarmupCompleted);
                            }
                            exoPlayerImplApi31ExternalSyntheticLambda0 = exoPlayerImplApi31ExternalSyntheticLambda02;
                            i11 = i7;
                            fArr5 = fArr3;
                            matrix4 = matrix;
                            exoPlayerImplComponentListenerExternalSyntheticLambda3 = exoPlayerImplComponentListenerExternalSyntheticLambda32;
                            z12 = z9;
                            length = i6;
                            d19 = d8;
                            d18 = d7;
                            pathMeasure5 = pathMeasure2;
                            d21 = d6;
                            paint3 = paint2;
                            path4 = path;
                            fArr6 = fArr2;
                            d26 = d28;
                            i3 = i5 + 1;
                            tSpanView2 = tSpanView;
                        }
                        d8 = d19;
                        exoPlayerImplApi31ExternalSyntheticLambda02 = exoPlayerImplApi31ExternalSyntheticLambda0;
                        exoPlayerImplApi31ExternalSyntheticLambda0 = exoPlayerImplApi31ExternalSyntheticLambda02;
                        i11 = i7;
                        fArr5 = fArr3;
                        matrix4 = matrix;
                        exoPlayerImplComponentListenerExternalSyntheticLambda3 = exoPlayerImplComponentListenerExternalSyntheticLambda32;
                        z12 = z9;
                        length = i6;
                        d19 = d8;
                        d18 = d7;
                        pathMeasure5 = pathMeasure2;
                        d21 = d6;
                        paint3 = paint2;
                        path4 = path;
                        fArr6 = fArr2;
                        d26 = d28;
                        i3 = i5 + 1;
                        tSpanView2 = tSpanView;
                    }
                    return path4;
                }
                z2 = z15;
            } else {
                readableMap = readableMap2;
                fArr = fArr4;
                exoPlayerImplComponentListenerExternalSyntheticLambda3 = exoPlayerImplComponentListenerExternalSyntheticLambda3OnExtraCallback;
                exoPlayerImplApi31ExternalSyntheticLambda0 = exoPlayerImplApi31ExternalSyntheticLambda03;
                z2 = false;
                i = 1;
            }
            d2 = d;
            z3 = z2;
            d3 = 0.0d;
            i2 = i;
            sVGLength = ((TextView) tSpanView2).onExtraCallback;
            double d172 = 1.0d;
            double d182 = d;
            if (sVGLength == null) {
            }
            double d192 = i2;
            Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
            double d202 = fontMetrics2.descent;
            float f2 = fontMetrics2.leading;
            double d212 = d172 * d192;
            double dOnNavigationEvent22 = f2 + d202;
            int i112 = i2;
            double d222 = d2;
            double d232 = (-fontMetrics2.ascent) + f2;
            double d242 = -fontMetrics2.top;
            strIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
            exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface = asInterface();
            if (exoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEventAsInterface == null) {
            }
            if (strIAuthTabCallback_Parcel != null) {
                iHashCode = strIAuthTabCallback_Parcel.hashCode();
                if (iHashCode != -1720785339) {
                }
            }
            double d262 = dOnNavigationEvent22;
            Matrix matrix22 = new Matrix();
            Matrix matrix32 = new Matrix();
            Matrix matrix42 = new Matrix();
            float[] fArr52 = new float[9];
            float[] fArr62 = new float[9];
            i3 = 0;
            while (i3 < length) {
            }
            return path4;
        }
        return path3;
    }

    /* renamed from: com.horcrux.svg.TSpanView$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                IAuthTabCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onNavigationEvent.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[ExoPlayerImplComponentListenerExternalSyntheticLambda4$IAuthTabCallbackStub.values().length];
            onExtraCallbackWithResult = iArr2;
            try {
                iArr2[ExoPlayerImplComponentListenerExternalSyntheticLambda4$IAuthTabCallbackStub.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onExtraCallbackWithResult[ExoPlayerImplComponentListenerExternalSyntheticLambda4$IAuthTabCallbackStub.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.values().length];
            onExtraCallback = iArr3;
            try {
                iArr3[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onExtraCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onExtraCallback[ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private double onNavigationEvent(SVGLength sVGLength, double d, double d2) {
        return ExoPlayerImplComponentListenerExternalSyntheticLambda5.IAuthTabCallback(sVGLength, d, 0.0d, ((VirtualView) this).mScale, d2);
    }

    private double onWarmupCompleted(ExoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback, double d) {
        int i = AnonymousClass5.onExtraCallback[exoPlayerImplComponentListenerExternalSyntheticLambda4$onExtraCallback.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    private void onWarmupCompleted(Paint paint, ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0) {
        int i = 0;
        boolean z = exoPlayerImplComponentListenerExternalSyntheticLambda0.asInterface == ExoPlayerImplComponentListenerExternalSyntheticLambda4.onExtraCallbackWithResult.Bold || exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback >= 550;
        boolean z2 = exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallbackDefault == ExoPlayerImplComponentListenerExternalSyntheticLambda4.IAuthTabCallback.italic;
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = exoPlayerImplComponentListenerExternalSyntheticLambda0.IAuthTabCallback;
        String str = exoPlayerImplComponentListenerExternalSyntheticLambda0.onWarmupCompleted;
        Typeface typefaceOnExtraCallbackWithResult = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                ResolutionSelectorBuilder.IAuthTabCallback();
                Typeface.Builder builderIO_ = fromResolutionSelector.iO_(this.IAuthTabCallbackDefault, str2);
                builderIO_.setFontVariationSettings("'wght' " + i2 + exoPlayerImplComponentListenerExternalSyntheticLambda0.onTransact);
                builderIO_.setWeight(i2);
                builderIO_.setItalic(z2);
                typefaceOnExtraCallbackWithResult = builderIO_.build();
                if (typefaceOnExtraCallbackWithResult == null) {
                    ResolutionSelectorBuilder.IAuthTabCallback();
                    Typeface.Builder builderIO_2 = fromResolutionSelector.iO_(this.IAuthTabCallbackDefault, str3);
                    builderIO_2.setFontVariationSettings("'wght' " + i2 + exoPlayerImplComponentListenerExternalSyntheticLambda0.onTransact);
                    builderIO_2.setWeight(i2);
                    builderIO_2.setItalic(z2);
                    typefaceOnExtraCallbackWithResult = builderIO_2.build();
                }
            } else {
                try {
                    try {
                        typefaceOnExtraCallbackWithResult = Typeface.create(Typeface.createFromAsset(this.IAuthTabCallbackDefault, str2), i);
                    } catch (Exception unused) {
                        typefaceOnExtraCallbackWithResult = Typeface.create(Typeface.createFromAsset(this.IAuthTabCallbackDefault, str3), i);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typefaceOnExtraCallbackWithResult == null) {
            try {
                typefaceOnExtraCallbackWithResult = ReactFontManager.onExtraCallback().onExtraCallbackWithResult(str, i, this.IAuthTabCallbackDefault);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceOnExtraCallbackWithResult = Typeface.create(typefaceOnExtraCallbackWithResult, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceOnExtraCallbackWithResult);
        paint.setTextSize((float) (exoPlayerImplComponentListenerExternalSyntheticLambda0.asBinder * ((VirtualView) this).mScale));
        paint.setLetterSpacing(0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void asBinder() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.access100 = (TextPathView) parent;
                return;
            } else {
                if (!(parent instanceof TextView)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    int hitTest(float[] fArr) {
        Region region;
        if (this.onWarmupCompleted == null) {
            return super/*com.horcrux.svg.GroupView*/.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && ((VirtualView) this).mInvertible) {
            float[] fArr2 = new float[2];
            ((VirtualView) this).mInvMatrix.mapPoints(fArr2, fArr);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = ((VirtualView) this).mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = ((VirtualView) this).mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || ((VirtualView) this).mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }
}
