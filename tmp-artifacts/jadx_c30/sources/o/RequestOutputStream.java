package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RequestOutputStream implements setOnOutOfMemeryErrorCallback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int[] onWarmupCompleted = {-707927846, -672864277, 414389077, 1612207870, 48631325, 902118066, -1357624980, -2085614256, 571582974, 1725655734, 1945564176, -955355391, 1389731502, -1582926265, -202417834, 491996621, 1441473237, 1842974004};
    private final Function2<JsonObject, Boolean, Unit> IAuthTabCallback;

    public void onNavigationEvent(@NotNull String str, @Nullable Map<?, ?> map) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Function1<? super startRunning, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        int i4 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent(@NotNull String str, @NotNull Object[] objArr, @Nullable String str2, @NotNull ALCFaceValidation aLCFaceValidation, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(objArr, BuildConfig.FLAVOR);
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(aLCFaceValidation, BuildConfig.FLAVOR);
            throw null;
        }
        Intrinsics.checkNotNullParameter(aLCFaceValidation, BuildConfig.FLAVOR);
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onWarmupCompleted;
        int i4 = -1469660336;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                if (i8 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> i5), 72 - Drawable.resolveOpacity(0, 0), AndroidCharacter.getMirror('0') + 8800, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), Color.red(0) + 72, 8848 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i7++;
                i2 = 2;
                i5 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onWarmupCompleted;
        if (iArr5 != null) {
            int i9 = $10 + 15;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 103;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i6] = Integer.valueOf(iArr5[i11]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 72, 8848 - (Process.myTid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i11 <<= 1;
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 71 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), 8848 - KeyEvent.normalizeMetaState(0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i11++;
                }
                i4 = -1469660336;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i6;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i13;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i13] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $10 + 109;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.combineMeasuredStates(0, 0) + 39, 10302 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14 += 98;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                    try {
                        Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback6 == null) {
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - ExpandableListView.getPackedPositionType(0L)), 38 - ((byte) KeyEvent.getModifierMetaStateMask()), 10300 - Process.getGidForName(BuildConfig.FLAVOR), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback6).invoke(null, objArr7)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i14++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr8 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback7 == null) {
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4033), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 78, View.getDefaultSize(0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public RequestOutputStream(@NotNull Function2<? super JsonObject, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, BuildConfig.FLAVOR);
        this.IAuthTabCallback = function2;
    }

    public void IAuthTabCallback(@NotNull Function1<? super startRunning, Unit> function1) throws Throwable {
        JsonElement jsonElementOnNavigationEvent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, BuildConfig.FLAVOR);
        startRunning startrunning = new startRunning();
        function1.invoke(startrunning);
        onPreviewFrame[] onpreviewframeArrOnExtraCallback = startrunning.onExtraCallback();
        xkz2 xkz2Var = new xkz2();
        int length = onpreviewframeArrOnExtraCallback.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                xkz2Var.onWarmupCompleted(canExtendToken.onWarmupCompleted(onpreviewframeArrOnExtraCallback[i2]));
                i2 += 81;
            } else {
                xkz2Var.onWarmupCompleted(canExtendToken.onWarmupCompleted(onpreviewframeArrOnExtraCallback[i2]));
                i2++;
            }
        }
        JsonElement jsonElementOnNavigationEvent2 = xkz2Var.onNavigationEvent();
        int size = jsonElementOnNavigationEvent2.size();
        if (size == 0) {
            jsonElementOnNavigationEvent = JsonNull.INSTANCE;
        } else if (size != 1) {
            int i4 = onExtraCallbackWithResult + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jsonElementOnNavigationEvent = jsonElementOnNavigationEvent2;
        } else {
            jsonElementOnNavigationEvent = jsonElementOnNavigationEvent2.onNavigationEvent(0);
        }
        Function2<JsonObject, Boolean, Unit> function2 = this.IAuthTabCallback;
        PangleEncryptManager pangleEncryptManager = new PangleEncryptManager();
        Object[] objArr = new Object[1];
        a(new int[]{-722409451, 2114912884, 119691859, 369957616}, 8 - ExpandableListView.getPackedPositionType(0L), objArr);
        dynamicTrack.onExtraCallback(pangleEncryptManager, ((String) objArr[0]).intern(), "onSuccess");
        pangleEncryptManager.onExtraCallbackWithResult("args", jsonElementOnNavigationEvent2);
        Object[] objArr2 = new Object[1];
        a(new int[]{-1303541015, 918981663, -603406985, 903779546}, KeyEvent.normalizeMetaState(0) + 7, objArr2);
        pangleEncryptManager.onExtraCallbackWithResult(((String) objArr2[0]).intern(), jsonElementOnNavigationEvent);
        function2.invoke(pangleEncryptManager.onExtraCallbackWithResult(), Boolean.FALSE);
    }

    public void onExtraCallbackWithResult(@Nullable String str, @Nullable String str2, @NotNull Map<String, String> map) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(map, BuildConfig.FLAVOR);
        this.IAuthTabCallback.invoke(canExtendToken.onNavigationEvent(str, str2, map), Boolean.TRUE);
        int i4 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
