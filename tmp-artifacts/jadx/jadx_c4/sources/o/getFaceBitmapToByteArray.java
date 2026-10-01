package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.core.webkit.bridge.HighlightV3Handler$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.tooltip.TdsHighlightV3View;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.generateAppWithState;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFaceBitmapToByteArray implements ALCFaceQuality {
    private static final byte[] $$a = {120, 11, 65, 93};
    private static final int $$b = 250;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallbackStub = 1;
    private static long onExtraCallback = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char IAuthTabCallback = 1602;
    private static int onNavigationEvent = 478309052;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = s + 105;
        int i5 = 3 - (b * 2);
        int i6 = (i * 3) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8;
            i2 = i3;
            i5 = i7;
            i4 = i9;
            int i10 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i10];
            i5 = i4;
            i7 = i10;
            int i92 = i5 + i8;
            i2 = i3;
            i5 = i7;
            i4 = i92;
            int i102 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i2);
        int i11 = i9 | i10 | (~(i4 | i3));
        int i12 = i8 | i4;
        int i13 = (~((~i3) | i4)) | i10;
        int i14 = i4 + i2 + i6 + (111814883 * i) + (1975835455 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i2) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i) + (1432616960 * i5) + (442957824 * i15);
        int i17 = ((i4 * 961080817) - 60187382) + (i2 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i * 1618335983) + (i5 * 193609403) + (i15 * 1988296704);
        return i16 + ((i17 * i17) * 176226304) != 1 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        getAppDataMetadata getappdatametadata = (getAppDataMetadata) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setonoutofmemeryerrorcallback, getappdatametadata);
        int i4 = IAuthTabCallbackStub + 123;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asBinder(setonoutofmemeryerrorcallback, getappdatametadata);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        int i5 = onWarmupCompleted + 111;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(getAppDataMetadata getappdatametadata, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(getappdatametadata, startrunning);
        }
        IAuthTabCallback(getappdatametadata, startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setonoutofmemeryerrorcallback, getappdatametadata);
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onNavigationEvent(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(str, str2);
        int i4 = IAuthTabCallbackStub + 5;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        getAppDataMetadata getappdatametadata = (getAppDataMetadata) objArr[0];
        startRunning startrunning = (startRunning) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(getappdatametadata, startrunning);
        }
        onExtraCallback(getappdatametadata, startrunning);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(getAppDataMetadata getappdatametadata, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(getappdatametadata, startrunning);
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    @Override // o.ALCFaceQuality
    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = IAuthTabCallbackStub + 9;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            super.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        int i3 = onWarmupCompleted + 123;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    @Override // o.drawTextBox
    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super.onNavigationEvent();
        int i4 = IAuthTabCallbackStub + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.drawTextBox
    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super.onWarmupCompleted(str);
        int i3 = onWarmupCompleted + 121;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceQuality
    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackStub + 25;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.drawTextBox
    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new HighlightV3Handler$.ExternalSyntheticLambda1());
        int i2 = onWarmupCompleted + 11;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "");
            return filterCreatePageParams.onTransact(uri);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri2 = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri2, "");
        filterCreatePageParams.onTransact(uri2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getappdatametadata, "");
        Object[] objArr = new Object[1];
        a((char) TextUtils.indexOf("", "", 0, 0), View.combineMeasuredStates(0, 0) + 925232993, new char[]{31726, 11736, 3990, 43714, 3675, 28392, 19774}, new char[]{0, 0, 0, 0}, new char[]{24954, 9711, 36151, 11179}, objArr);
        setonoutofmemeryerrorcallback.onNavigationEvent(((String) objArr[0]).intern(), (Function1<? super startRunning, Unit>) new HighlightV3Handler$.ExternalSyntheticLambda2(getappdatametadata));
        int i2 = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getAppDataMetadata getappdatametadata, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 1, 9 - TextUtils.indexOf("", "", 0), new char[]{65532, 65530, 3, 6, '\n', 65532, 65515, 16, 7}, 253 - TextUtils.lastIndexOf("", '0', 0, 0), false, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), getappdatametadata.getType());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return unit;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43;
                    int size = View.MeasureSpec.getSize(i3) + 1451;
                    byte b = (byte) 5;
                    byte b2 = (byte) (b - 5);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, maximumFlingVelocity, size, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cBlue = (char) (49123 - Color.blue(i3));
                    int iIndexOf = TextUtils.indexOf("", "") + 44;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1494;
                    byte length4 = (byte) $$a.length;
                    byte b3 = (byte) (length4 - 4);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cBlue, iIndexOf, minimumFlingVelocity, 1533236389, false, $$c(length4, b3, b3), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - ((Process.getThreadPriority(0) + 20) >> 6)), 50 - (Process.myPid() >> 22), 22938 - ExpandableListView.getPackedPositionChild(0L), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 29 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12577 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i4 = $10 + 93;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 93;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - Color.alpha(0)), 23 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12843), 54 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $11 + 35;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $10 + 35;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i13 = $10 + 53;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i2 / simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.green(0)), ImageFormat.getBitsPerPixel(0) + 56, 2166 - ImageFormat.getBitsPerPixel(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), 54 - TextUtils.lastIndexOf("", '0', 0, 0), KeyEvent.normalizeMetaState(0) + 2167, 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static final void onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getappdatametadata, "");
        Object[] objArr = new Object[1];
        a((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 925232993 + (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{31726, 11736, 3990, 43714, 3675, 28392, 19774}, new char[]{0, 0, 0, 0}, new char[]{24954, 9711, 36151, 11179}, objArr);
        setonoutofmemeryerrorcallback.onNavigationEvent(((String) objArr[0]).intern(), (Function1<? super startRunning, Unit>) new HighlightV3Handler$.ExternalSyntheticLambda3(getappdatametadata));
        int i2 = IAuthTabCallbackStub + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
    }

    private static final Unit onExtraCallback(getAppDataMetadata getappdatametadata, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b(TextUtils.getCapsMode("", 0, 0) + 1, TextUtils.lastIndexOf("", '0', 0, 0) + 10, new char[]{65532, 65530, 3, 6, '\n', 65532, 65515, 16, 7}, 254 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), getappdatametadata.getType());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final void asBinder(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getappdatametadata, "");
        Object[] objArr = new Object[1];
        a((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getMode(0) + 925232993, new char[]{31726, 11736, 3990, 43714, 3675, 28392, 19774}, new char[]{0, 0, 0, 0}, new char[]{24954, 9711, 36151, 11179}, objArr);
        setonoutofmemeryerrorcallback.onNavigationEvent(((String) objArr[0]).intern(), (Function1<? super startRunning, Unit>) new HighlightV3Handler$.ExternalSyntheticLambda0(getappdatametadata));
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    private static final Unit IAuthTabCallbackDefault(getAppDataMetadata getappdatametadata, startRunning startrunning) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(startrunning, "");
        JsonObject jsonObject = new JsonObject();
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 9, new char[]{65532, 65530, 3, 6, '\n', 65532, 65515, 16, 7}, 254 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), getappdatametadata.getType());
        startRunning.onExtraCallbackWithResult(WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), -1586593611, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{startrunning, jsonObject}, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1586593612, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x08c7  */
    @Override // o.ALCFaceQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        Integer numValueOf;
        generateAppWithState.onWarmupCompleted onwarmupcompleted;
        generateAppWithState.onExtraCallback onextracallback;
        generateAppWithState.onNavigationEvent onnavigationevent;
        generateAppWithState.onWarmupCompleted onwarmupcompleted2;
        generateAppWithState.onWarmupCompleted onwarmupcompleted3;
        generateAppWithState.onExtraCallback onextracallback2;
        generateAppWithState.onExtraCallback onextracallback3;
        int i;
        generateAppWithState.onNavigationEvent onnavigationevent2;
        Integer numValueOf2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Context context = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getContext();
        if (context != null) {
            setText settext = new setText(jsonObject);
            Object[] objArr = new Object[1];
            a((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57330), (-1) - TextUtils.indexOf((CharSequence) "", '0'), new char[]{43309, 1415, 4545, 9097}, new char[]{0, 0, 0, 0}, new char[]{18654, 49121, 61974, 1247}, objArr);
            String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
            Object[] objArr2 = new Object[1];
            a((char) (3455 - TextUtils.getTrimmedLength("")), (-1897216534) - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{26274}, new char[]{0, 0, 0, 0}, new char[]{59949, 60101, 32654, 56333}, objArr2);
            int iFloatValue = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr2[0]).intern(), Float.valueOf(0.0f)})).floatValue();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(Integer.valueOf(iFloatValue), displayMetrics);
            Object[] objArr3 = new Object[1];
            b((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, new char[]{0}, 271 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), true, objArr3);
            int iFloatValue2 = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr3[0]).intern(), Float.valueOf(0.0f)})).floatValue();
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Integer.valueOf(iFloatValue2), displayMetrics2) + M_.onExtraCallback.access000();
            Object[] objArr4 = new Object[1];
            a((char) (5028 - TextUtils.getCapsMode("", 0, 0)), (-1264174249) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{50847, 46879, 8566, 57215, 61144}, new char[]{0, 0, 0, 0}, new char[]{22772, 42555, 42164, 65299}, objArr4);
            int iOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr4[0]).intern(), 0);
            DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            int iOnNavigationEvent4 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent3), displayMetrics3);
            Object[] objArr5 = new Object[1];
            b(1 - (ViewConfiguration.getLongPressTimeout() >> 16), 7 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{11, 65535, 65532, 0, 65534, 65535}, 254 - (ViewConfiguration.getJumpTapTimeout() >> 16), false, objArr5);
            int iOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr5[0]).intern(), 0);
            DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
            int iOnNavigationEvent6 = varyMatches.onNavigationEvent(Integer.valueOf(iOnNavigationEvent5), displayMetrics4);
            Object[] objArr6 = new Object[1];
            b(7 - TextUtils.indexOf("", ""), ((Process.getThreadPriority(0) + 20) >> 6) + 7, new char[]{4, 65532, '\n', '\n', 65528, 65534, 65532}, ExpandableListView.getPackedPositionChild(0L) + 255, false, objArr6);
            String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr6[0]).intern(), "");
            Object[] objArr7 = new Object[1];
            a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48269), ViewConfiguration.getTouchSlop() >> 8, new char[]{62766, 22875, 8416, 19919, 62264, 45360}, new char[]{0, 0, 0, 0}, new char[]{43171, 24879, 36061, 65212}, objArr7);
            int iFloatValue3 = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr7[0]).intern(), Float.valueOf(16.0f)})).floatValue();
            Object[] objArr8 = new Object[1];
            a((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.rgb(0, 0, 0) - 14513050, new char[]{51070, 3177, 31735, 58214, 44403, 25024, 31327}, new char[]{0, 0, 0, 0}, new char[]{26322, 8844, 18686, 8097}, objArr8);
            int iFloatValue4 = (int) ((Float) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -702054883, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 702054886, new Object[]{settext, ((String) objArr8[0]).intern(), Float.valueOf(28.0f)})).floatValue();
            Object[] objArr9 = new Object[1];
            a((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), KeyEvent.getMaxKeyCode() >> 16, new char[]{37251, 30266, 46942, 51762, 27514, 54747, 31797, 51815, 20725, 26022, '\t', 24395}, new char[]{0, 0, 0, 0}, new char[]{2005, 58083, 55157, 63053}, objArr9);
            String strOnNavigationEvent3 = settext.onNavigationEvent(((String) objArr9[0]).intern(), "");
            Object[] objArr10 = new Object[1];
            b(TextUtils.getCapsMode("", 0, 0) + 8, (KeyEvent.getMaxKeyCode() >> 16) + 9, new char[]{65535, 1, 4, 65497, '\f', 16, 65533, '\f', 6}, Color.alpha(0) + 253, true, objArr10);
            String strOnNavigationEvent4 = settext.onNavigationEvent(((String) objArr10[0]).intern(), "");
            Object[] objArr11 = new Object[1];
            b(2 - ((byte) KeyEvent.getModifierMetaStateMask()), 3 - ExpandableListView.getPackedPositionGroup(0L), new char[]{5, 1, 65532}, 253 - ExpandableListView.getPackedPositionType(0L), true, objArr11);
            String strOnNavigationEvent5 = settext.onNavigationEvent(((String) objArr11[0]).intern(), "");
            Object[] objArr12 = new Object[1];
            b((ViewConfiguration.getPressedStateDuration() >> 16) + 5, (Process.myTid() >> 22) + 11, new char[]{65528, 65532, 7, 65532, '\t', 11, 5, '\f', 6, 65498, 11}, Color.green(0) + 254, true, objArr12);
            int iOnNavigationEvent7 = settext.onNavigationEvent(((String) objArr12[0]).intern(), -1);
            Object[] objArr13 = new Object[1];
            b(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{5, 5, 0, 65535, 65523, 6}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 260, false, objArr13);
            boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr13[0]).intern(), false})).booleanValue();
            int i3 = iOnNavigationEvent + iOnNavigationEvent4;
            Rect rect = new Rect(iOnNavigationEvent, iOnNavigationEvent2, i3, iOnNavigationEvent6 + iOnNavigationEvent2);
            Rect rect2 = new Rect(iOnNavigationEvent, iOnNavigationEvent2, i3, iOnNavigationEvent4 + iOnNavigationEvent2);
            Object[] objArr14 = new Object[1];
            b(View.resolveSize(0, 0) + 3, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, new char[]{65530, 65532, '\t', 65532, 3, 65534, 5, 65528, 11}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 254, true, objArr14);
            if (!StringsKt.equals(strOnNavigationEvent, ((String) objArr14[0]).intern(), true)) {
                Object[] objArr15 = new Object[1];
                b(View.resolveSizeAndState(0, 0, 0) + 2, (ViewConfiguration.getScrollBarSize() >> 8) + 6, new char[]{1, 65531, 65533, 4, 65531, '\n'}, 253 - (ViewConfiguration.getScrollBarSize() >> 8), true, objArr15);
                if (!StringsKt.equals(strOnNavigationEvent, ((String) objArr15[0]).intern(), true)) {
                    Object[] objArr16 = new Object[1];
                    a((char) (TextUtils.indexOf((CharSequence) "", '0') + 65478), Color.red(0) + 215065431, new char[]{20459, 19093, 21540, 41357, 42666}, new char[]{0, 0, 0, 0}, new char[]{22495, 53667, 50444, 24831}, objArr16);
                    if (StringsKt.equals(strOnNavigationEvent, ((String) objArr16[0]).intern(), true)) {
                        TdsHighlightV3View.onExtraCallbackWithResult onextracallbackwithresult = TdsHighlightV3View.Companion;
                        if (iOnNavigationEvent7 < 0) {
                            int i4 = IAuthTabCallbackStub + 107;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(iOnNavigationEvent7);
                        }
                        if (onextracallbackwithresult.onExtraCallback(context, rect, numValueOf, new HighlightV3Handler$.ExternalSyntheticLambda6(setonoutofmemeryerrorcallback))) {
                            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
                            return;
                        }
                        Object[] objArr17 = new Object[1];
                        b((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, new char[]{65533, 5, 16, 5, '\n', 5, 65468, 16, 11, '\n', 65468, 16, 4, 3, 5, '\b', 4, 3, 5, 4, 0, 1, 16}, 249 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, objArr17);
                        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr17[0]).intern(), null, null, 6, null);
                        int i6 = onWarmupCompleted + 81;
                        IAuthTabCallbackStub = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                    return;
                }
                int i8 = IAuthTabCallbackStub + 57;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                TdsHighlightV3View.onExtraCallbackWithResult onextracallbackwithresult2 = TdsHighlightV3View.Companion;
                Locale locale = Locale.ROOT;
                String upperCase = strOnNavigationEvent3.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                Object[] objArr18 = new Object[1];
                b(2 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, new char[]{1, 65535, 65524, 1, 6, 6}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 227, false, objArr18);
                if (!Intrinsics.areEqual(upperCase, ((String) objArr18[0]).intern())) {
                    int i10 = onWarmupCompleted + 75;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    Object[] objArr19 = new Object[1];
                    b(2 - TextUtils.indexOf("", ""), 3 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{65534, 65535, 3}, 229 - TextUtils.indexOf((CharSequence) "", '0', 0), false, objArr19);
                    onwarmupcompleted = Intrinsics.areEqual(upperCase, ((String) objArr19[0]).intern()) ? generateAppWithState.onWarmupCompleted.TOP : generateAppWithState.onWarmupCompleted.BOTTOM;
                }
                String upperCase2 = strOnNavigationEvent4.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                int iHashCode = upperCase2.hashCode();
                if (iHashCode == 2332679) {
                    Object[] objArr20 = new Object[1];
                    a((char) (Color.red(0) + 3488), ViewConfiguration.getEdgeSlop() >> 16, new char[]{49725, 54490, 55627, 23389}, new char[]{0, 0, 0, 0}, new char[]{37627, 26661, 41181, 47373}, objArr20);
                    if (upperCase2.equals(((String) objArr20[0]).intern())) {
                        onextracallback = generateAppWithState.onExtraCallback.LEFT;
                    }
                } else if (iHashCode == 77974012) {
                    Object[] objArr21 = new Object[1];
                    a((char) (21373 - Process.getGidForName("")), (-891205493) - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{40052, 60923, 35360, 22010, 37119}, new char[]{0, 0, 0, 0}, new char[]{35615, 57672, 32458, 8019}, objArr21);
                    if (upperCase2.equals(((String) objArr21[0]).intern())) {
                        onextracallback = generateAppWithState.onExtraCallback.RIGHT;
                    }
                } else if (iHashCode == 1984282709) {
                    Object[] objArr22 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0') + 3, AndroidCharacter.getMirror('0') - '*', new char[]{65531, 65529, '\b', 65531, '\n', 4}, Color.green(0) + 223, true, objArr22);
                    onextracallback = upperCase2.equals(((String) objArr22[0]).intern()) ? generateAppWithState.onExtraCallback.CENTER : generateAppWithState.onExtraCallback.CENTER;
                }
                generateAppWithState.onExtraCallback onextracallback4 = onextracallback;
                String upperCase3 = strOnNavigationEvent5.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                Object[] objArr23 = new Object[1];
                a((char) (19694 - View.getDefaultSize(0, 0)), Gravity.getAbsoluteGravity(0, 0), new char[]{16014, 41033, 24249, 17145, 56937, 20675}, new char[]{0, 0, 0, 0}, new char[]{56667, 40488, 61012, 50508}, objArr23);
                if (Intrinsics.areEqual(upperCase3, ((String) objArr23[0]).intern())) {
                    onnavigationevent = generateAppWithState.onNavigationEvent.STRONG;
                } else {
                    Object[] objArr24 = new Object[1];
                    b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, Gravity.getAbsoluteGravity(0, 0) + 4, new char[]{'\r', 65531, 65527, 1}, 224 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), false, objArr24);
                    Intrinsics.areEqual(upperCase3, ((String) objArr24[0]).intern());
                    onnavigationevent = generateAppWithState.onNavigationEvent.WEAK;
                }
                if (!onextracallbackwithresult2.IAuthTabCallback(context, rect2, strOnNavigationEvent2, onwarmupcompleted, onextracallback4, onnavigationevent, iOnNavigationEvent7 < 0 ? null : Integer.valueOf(iOnNavigationEvent7), new HighlightV3Handler$.ExternalSyntheticLambda5(setonoutofmemeryerrorcallback), zBooleanValue, iFloatValue4)) {
                    Object[] objArr25 = new Object[1];
                    b(20 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 23, new char[]{65533, 5, 16, 5, '\n', 5, 65468, 16, 11, '\n', 65468, 16, 4, 3, 5, '\b', 4, 3, 5, 4, 0, 1, 16}, 249 - ExpandableListView.getPackedPositionType(0L), true, objArr25);
                    setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr25[0]).intern(), null, null, 6, null);
                    return;
                } else {
                    int i12 = onWarmupCompleted + 113;
                    IAuthTabCallbackStub = i12 % 128;
                    int i13 = i12 % 2;
                    setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, 1, null);
                    return;
                }
            }
            TdsHighlightV3View.onExtraCallbackWithResult onextracallbackwithresult3 = TdsHighlightV3View.Companion;
            Locale locale2 = Locale.ROOT;
            String upperCase4 = strOnNavigationEvent3.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
            Object[] objArr26 = new Object[1];
            b(2 - View.combineMeasuredStates(0, 0), 6 - (ViewConfiguration.getScrollBarSize() >> 8), new char[]{1, 65535, 65524, 1, 6, 6}, 227 - View.MeasureSpec.getSize(0), false, objArr26);
            if (!Intrinsics.areEqual(upperCase4, ((String) objArr26[0]).intern())) {
                int i14 = IAuthTabCallbackStub + 39;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                Object[] objArr27 = new Object[1];
                b((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, 2 - Process.getGidForName(""), new char[]{65534, 65535, 3}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 230, false, objArr27);
                onwarmupcompleted2 = Intrinsics.areEqual(upperCase4, ((String) objArr27[0]).intern()) ^ true ? generateAppWithState.onWarmupCompleted.BOTTOM : generateAppWithState.onWarmupCompleted.TOP;
            }
            generateAppWithState.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted2;
            String upperCase5 = strOnNavigationEvent4.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase5, "");
            int iHashCode2 = upperCase5.hashCode();
            if (iHashCode2 != 2332679) {
                int i16 = IAuthTabCallbackStub + 83;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (iHashCode2 != 77974012) {
                    if (iHashCode2 == 1984282709) {
                        Object[] objArr28 = new Object[1];
                        b(1 - TextUtils.lastIndexOf("", '0'), TextUtils.indexOf((CharSequence) "", '0') + 7, new char[]{65531, 65529, '\b', 65531, '\n', 4}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 222, true, objArr28);
                        if (upperCase5.equals(((String) objArr28[0]).intern())) {
                            onextracallback3 = generateAppWithState.onExtraCallback.CENTER;
                            onwarmupcompleted3 = onwarmupcompleted4;
                        }
                    }
                    onwarmupcompleted3 = onwarmupcompleted4;
                } else {
                    onwarmupcompleted3 = onwarmupcompleted4;
                    Object[] objArr29 = new Object[1];
                    a((char) (TextUtils.getCapsMode("", 0, 0) + 21374), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 891205494, new char[]{40052, 60923, 35360, 22010, 37119}, new char[]{0, 0, 0, 0}, new char[]{35615, 57672, 32458, 8019}, objArr29);
                    if (upperCase5.equals(((String) objArr29[0]).intern())) {
                        onextracallback2 = generateAppWithState.onExtraCallback.RIGHT;
                    }
                    onextracallback3 = onextracallback2;
                }
                onextracallback3 = onextracallback2;
            } else {
                onwarmupcompleted3 = onwarmupcompleted4;
                Object[] objArr30 = new Object[1];
                a((char) (3488 - (ViewConfiguration.getTouchSlop() >> 8)), ExpandableListView.getPackedPositionGroup(0L), new char[]{49725, 54490, 55627, 23389}, new char[]{0, 0, 0, 0}, new char[]{37627, 26661, 41181, 47373}, objArr30);
                onextracallback2 = upperCase5.equals(((String) objArr30[0]).intern()) ? generateAppWithState.onExtraCallback.LEFT : generateAppWithState.onExtraCallback.CENTER;
                onextracallback3 = onextracallback2;
            }
            String upperCase6 = strOnNavigationEvent5.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase6, "");
            Object[] objArr31 = new Object[1];
            a((char) (19693 - MotionEvent.axisFromString("")), View.MeasureSpec.getMode(0), new char[]{16014, 41033, 24249, 17145, 56937, 20675}, new char[]{0, 0, 0, 0}, new char[]{56667, 40488, 61012, 50508}, objArr31);
            if (Intrinsics.areEqual(upperCase6, ((String) objArr31[0]).intern())) {
                int i17 = IAuthTabCallbackStub + 7;
                onWarmupCompleted = i17 % 128;
                if (i17 % 2 != 0) {
                    generateAppWithState.onNavigationEvent onnavigationevent3 = generateAppWithState.onNavigationEvent.STRONG;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onnavigationevent2 = generateAppWithState.onNavigationEvent.STRONG;
                i = 1;
            } else {
                i = 1;
                Object[] objArr32 = new Object[1];
                b(4 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 4 - Color.alpha(0), new char[]{'\r', 65531, 65527, 1}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 223, false, objArr32);
                Intrinsics.areEqual(upperCase6, ((String) objArr32[0]).intern());
                onnavigationevent2 = generateAppWithState.onNavigationEvent.WEAK;
            }
            if (iOnNavigationEvent7 < 0) {
                int i18 = IAuthTabCallbackStub + 41;
                onWarmupCompleted = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(iOnNavigationEvent7);
            }
            generateAppWithState.onNavigationEvent onnavigationevent4 = onnavigationevent2;
            int i19 = i;
            if (((Boolean) TdsHighlightV3View.onExtraCallbackWithResult.IAuthTabCallback(OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{onextracallbackwithresult3, context, rect, strOnNavigationEvent2, onwarmupcompleted3, onextracallback3, onnavigationevent4, Boolean.valueOf(zBooleanValue), numValueOf2, Integer.valueOf(iFloatValue3), new HighlightV3Handler$.ExternalSyntheticLambda4(setonoutofmemeryerrorcallback)}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), -866706066, OverseasRrnInputTextField.IAuthTabCallback(), 866706067)).booleanValue()) {
                setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, null, i19, null);
                return;
            }
            Object[] objArr33 = new Object[i19];
            b(20 - TextUtils.indexOf("", "", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 23, new char[]{65533, 5, 16, 5, '\n', 5, 65468, 16, 11, '\n', 65468, 16, 4, 3, 5, '\b', 4, 3, 5, 4, 0, 1, 16}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 249, true, objArr33);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, ((String) objArr33[0]).intern(), null, null, 6, null);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getAppDataMetadata getappdatametadata, startRunning startrunning) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1876556876, iOnExtraCallback, -1876556875, new Object[]{getappdatametadata, startrunning}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ void IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, getAppDataMetadata getappdatametadata) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -369448708, iOnExtraCallback, 369448708, new Object[]{setonoutofmemeryerrorcallback, getappdatametadata}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }
}
