package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ALCPreviewView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    public static final ALCPreviewView onExtraCallbackWithResult;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    static {
        IAuthTabCallback();
        onExtraCallbackWithResult = new ALCPreviewView();
        int i = IAuthTabCallback + 55;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ALCPreviewView() {
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, @NotNull drawTextBox drawtextbox, @Nullable ALCLiveness aLCLiveness, @NotNull String str2, @NotNull String str3) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(drawtextbox, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            boolean z = drawtextbox.onExtraCallback() instanceof onOutOfMemory.onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(drawtextbox, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        onOutOfMemory onoutofmemoryOnExtraCallback = drawtextbox.onExtraCallback();
        if (onoutofmemoryOnExtraCallback instanceof onOutOfMemory.onNavigationEvent) {
            return true;
        }
        if (aLCLiveness == null) {
            Intrinsics.checkNotNull(onoutofmemoryOnExtraCallback, "");
            Function2<String, String, Boolean> function2OnExtraCallback = ((onOutOfMemory.IAuthTabCallback) onoutofmemoryOnExtraCallback).onExtraCallback();
            if (!((Boolean) function2OnExtraCallback.invoke(str2, str)).booleanValue()) {
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("remotePolicy", Boolean.FALSE);
                Object[] objArr = new Object[1];
                a(new int[]{-2119642343, -1669879574, 378019308, 363137872, -888602177, 1517991869}, 11 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str)});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new int[]{2100642908, -1119554258, 774048854, 336446328, 468413301, -76795694, -327133702, -215633560, -802687208, -1785474983, -1518191431, -1459326343, -1688677218, 1019356456}, (KeyEvent.getMaxKeyCode() >> 16) + 28, objArr2);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, ((String) objArr2[0]).intern(), str + " from " + str3 + " (initialUrl: " + str2 + ")", mapOnWarmupCompleted, str2, false, null, 48, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
            if (!((Boolean) function2OnExtraCallback.invoke(str3, str)).booleanValue()) {
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("remotePolicy", Boolean.FALSE);
                Object[] objArr3 = new Object[1];
                a(new int[]{-2119642343, -1669879574, 378019308, 363137872, -888602177, 1517991869}, TextUtils.lastIndexOf("", '0', 0, 0) + 11, objArr3);
                Map mapOnWarmupCompleted2 = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), str)});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr4 = new Object[1];
                a(new int[]{2100642908, -1119554258, 774048854, 336446328, 1818848151, 1040428012, 842412368, 574753863, 1554899423, 1794357979, -22745843, 1632253195, -1748975037, -390841194}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, objArr4);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray2, ((String) objArr4[0]).intern(), str + " from " + str3, mapOnWarmupCompleted2, str3, false, null, 48, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
        } else {
            if (!aLCLiveness.onExtraCallbackWithResult(str2)) {
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("remotePolicy", Boolean.TRUE);
                Object[] objArr5 = new Object[1];
                a(new int[]{-2119642343, -1669879574, 378019308, 363137872, -888602177, 1517991869}, 10 - TextUtils.getOffsetBefore("", 0), objArr5);
                Map mapOnWarmupCompleted3 = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback3, getWrite.IAuthTabCallback(((String) objArr5[0]).intern(), str)});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray3 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr6 = new Object[1];
                a(new int[]{2100642908, -1119554258, 774048854, 336446328, 468413301, -76795694, -327133702, -215633560, -802687208, -1785474983, -1518191431, -1459326343, -1688677218, 1019356456}, View.MeasureSpec.getMode(0) + 28, objArr6);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray3, ((String) objArr6[0]).intern(), str + " from " + str3 + " (initialUrl: " + str2 + ")", mapOnWarmupCompleted3, str2, false, null, 48, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
            if (!aLCLiveness.onExtraCallbackWithResult(str3)) {
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("remotePolicy", Boolean.TRUE);
                Object[] objArr7 = new Object[1];
                a(new int[]{-2119642343, -1669879574, 378019308, 363137872, -888602177, 1517991869}, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
                Map mapOnWarmupCompleted4 = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback4, getWrite.IAuthTabCallback(((String) objArr7[0]).intern(), str)});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray4 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr8 = new Object[1];
                a(new int[]{2100642908, -1119554258, 774048854, 336446328, 1818848151, 1040428012, 842412368, 574753863, 1554899423, 1794357979, -22745843, 1632253195, -1748975037, -390841194}, 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray4, ((String) objArr8[0]).intern(), str + " from " + str3, mapOnWarmupCompleted4, str3, false, null, 48, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return false;
            }
        }
        int i3 = onExtraCallback + 89;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 57 / 0;
        }
        return true;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i4 = -1469660336;
        long j = 0;
        int i5 = 16;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $11 + 113;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> i5), 73 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 72 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 8848 - ((Process.getThreadPriority(0) + 20) >> 6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i2++;
                }
                j = 0;
                i5 = 16;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int i10 = $11 + 87;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 75;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr5[i12]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + i6), (Process.myPid() >> 22) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0', i7), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i12++;
                i4 = -1469660336;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i15 = i7;
        System.arraycopy(iArr5, i15, iArr4, i15, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i15;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i15] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i16];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 22252), TextUtils.lastIndexOf("", '0', 0, 0) + 40, TextUtils.lastIndexOf("", '0') + 10302, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i16++;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4032), TextUtils.indexOf((CharSequence) "", '0', 0) + 79, 7397 - TextUtils.lastIndexOf("", '0', 0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i15 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = new int[]{-410579023, -950637084, 1765116036, -987449011, -479638939, -1131448502, 487830471, -1426840530, -494453897, -2104312967, 376289612, 170403968, -1612936484, 1530891249, 1929225163, -624084356, 1251763721, -1206028884};
    }
}
