package o;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LifecycleEventObserver;
import com.google.gson.JsonObject;
import com.squareup.seismic.ShakeDetector;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isIndirectCRL implements ALCFaceResult {
    public static final onWarmupCompleted Companion;
    private static char IAuthTabCallback;
    private static final WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Pair<ShakeDetector, LifecycleEventObserver>> onExtraCallback;
    private static int[] onExtraCallbackWithResult;
    private static long onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 33;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = 110 - r6
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = o.isIndirectCRL.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isIndirectCRL.$$c(int, int, int):java.lang.String");
    }

    public static /* synthetic */ void onExtraCallback(ShakeDetector shakeDetector, SensorManager sensorManager, isIndirectCRL isindirectcrl, WebViewContentOwner webViewContentOwner, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(shakeDetector, sensorManager, isindirectcrl, webViewContentOwner, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        int i4 = IAuthTabCallbackStub + 89;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(settopguidebackgroundcolor, str);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 1;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 != 0) {
            int i6 = 47 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackStub + 105;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 != 0) {
            int i4 = 23 / 0;
        }
        int i5 = asInterface + 21;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    private static final void onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setTopGuideBackgroundColor.onExtraCallbackWithResult(settopguidebackgroundcolor, str, (Function1) null, 2, (Object) null);
        int i4 = IAuthTabCallbackStub + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    private static final void IAuthTabCallback(ShakeDetector shakeDetector, SensorManager sensorManager, isIndirectCRL isindirectcrl, WebViewContentOwner webViewContentOwner, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i4 = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            shakeDetector.start(sensorManager, 3);
            return;
        }
        int i5 = IAuthTabCallbackStub + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            isindirectcrl.IAuthTabCallback(webViewContentOwner);
        } else {
            shakeDetector.stop();
            int i7 = IAuthTabCallbackStub + 35;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r25, @org.jetbrains.annotations.NotNull java.lang.String r26, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r27, @org.jetbrains.annotations.NotNull o.setTopGuideBackgroundColor r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isIndirectCRL.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor):void");
    }

    private final void IAuthTabCallback(WebViewContentOwner webViewContentOwner) {
        LifecycleEventObserver lifecycleEventObserver;
        int i = 2 % 2;
        int i2 = asInterface + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        WeakHashMap<r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, Pair<ShakeDetector, LifecycleEventObserver>> weakHashMap = onExtraCallback;
        if (weakHashMap.containsKey(webViewContentOwner)) {
            int i4 = asInterface + 71;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                weakHashMap.get(webViewContentOwner);
                throw null;
            }
            Pair<ShakeDetector, LifecycleEventObserver> pair = weakHashMap.get(webViewContentOwner);
            if (pair != null) {
                int i5 = IAuthTabCallbackStub + 57;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                ShakeDetector shakeDetector = (ShakeDetector) pair.getFirst();
                if (shakeDetector != null) {
                    shakeDetector.stop();
                }
            }
            Pair<ShakeDetector, LifecycleEventObserver> pair2 = weakHashMap.get(webViewContentOwner);
            if (pair2 != null && (lifecycleEventObserver = (LifecycleEventObserver) pair2.getSecond()) != null) {
                webViewContentOwner.getLifecycle().onExtraCallbackWithResult(lifecycleEventObserver);
            }
            weakHashMap.remove(webViewContentOwner);
            int i7 = IAuthTabCallbackStub + 5;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        onTransact = 0;
        IAuthTabCallback();
        Companion = new onWarmupCompleted(null);
        onExtraCallback = new WeakHashMap<>();
        int i = asBinder + 87;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i3 = $11 + 49;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 43 - KeyEvent.normalizeMetaState(0), 1451 - (ViewConfiguration.getPressedStateDuration() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 49123);
                    int iResolveSizeAndState = 44 - View.resolveSizeAndState(0, 0, 0);
                    int i5 = 1493 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b3 = (byte) ($$b & 7);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iResolveSizeAndState, i5, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getCapsMode("", 0, 0)), 50 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22939 - (ViewConfiguration.getEdgeSlop() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45848), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, ExpandableListView.getPackedPositionType(0L) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 63;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallbackWithResult;
        long j = 0;
        int i4 = -1469660336;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i5 = 0;
            while (i5 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 72 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 79;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallbackWithResult;
        if (iArr6 != null) {
            int i8 = $11 + 125;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i2])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 72, (ViewConfiguration.getFadingEdgeLength() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i2++;
            }
            int i9 = $11 + 83;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i11 = 0;
            for (int i12 = 16; i11 < i12; i12 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i11];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22251 - TextUtils.indexOf((CharSequence) "", '0', 0)), 39 - Color.red(0), 10301 - View.resolveSizeAndState(0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i11++;
                int i13 = $10 + 99;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 3 / 5;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4032), KeyEvent.normalizeMetaState(0) + 78, (ViewConfiguration.getEdgeSlop() >> 16) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new int[]{-1489942659, 922312703, -1114945069, 2068925733, -440696598, -1992039565, -1924400445, 2013120870, -838412548, -1032916332, 627221228, 2070202219, -762041835, 1727480994, -422121024, -202048909, -1707851860, -316164678};
        onNavigationEvent = 7798559133331975163L;
        onWarmupCompleted = -1776194565;
        IAuthTabCallback = (char) 65321;
    }
}
