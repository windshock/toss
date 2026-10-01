package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o.q4ExternalSyntheticLambda6;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1lSDK {
    private static int IAuthTabCallback;
    public static final AFi1lSDK onExtraCallback;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {5, 64, ByteCompanionObject.MAX_VALUE, 81};
    private static final int $$b = 137;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = i2 * 3;
        int i5 = i + 4;
        int i6 = (b * 4) + 105;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i6 += -i8;
            i3 = i9;
            i5++;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i5];
            i6 += -i8;
            i3 = i9;
            i5++;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i5++;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        onExtraCallbackWithResult();
        onExtraCallback = new AFi1lSDK();
        int i = onNavigationEvent + 73;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7);
        int i9 = ~i4;
        int i10 = ~(i9 | i5);
        int i11 = ~(i7 | i4);
        int i12 = i8 | i10 | i11;
        int i13 = ~(i9 | i7 | i2);
        int i14 = (~(i2 | i7)) | i10 | i11;
        int i15 = i4 + i5 + i + (2052055731 * i3) + (1687666023 * i6);
        int i16 = i15 * i15;
        int i17 = (i4 * (-1966771951)) + 1000013824 + ((-1966771951) * i5) + ((-617538080) * i12) + ((-926307120) * i13) + (308769040 * i14) + (2019426304 * i) + (632946688 * i3) + ((-741212160) * i6) + (2121465856 * i16);
        int i18 = (i4 * 1533266457) + 1248777597 + (i5 * 1533266457) + (i12 * (-800)) + (i13 * (-1200)) + (i14 * 400) + (i * 1533266057) + (i3 * 706030027) + (i6 * 1023530015) + (i16 * (-2088042496));
        int i19 = i17 + (i18 * i18 * 1434255360);
        if (i19 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i19 == 2) {
            return onExtraCallback(objArr);
        }
        if (i19 == 3) {
            return onNavigationEvent(objArr);
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i20 = 2 % 2;
        if (iIntValue == -11) {
            return "ssl_handshake";
        }
        if (iIntValue == -2) {
            return "host_lookup";
        }
        int i21 = onExtraCallbackWithResult;
        int i22 = i21 + 111;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        if (iIntValue == -8) {
            int i24 = i21 + 17;
            onTransact = i24 % 128;
            int i25 = i24 % 2;
            return "redirect_loop";
        }
        if (iIntValue != -7) {
            return iIntValue != -6 ? "web_resource_error" : "connect";
        }
        Object[] objArr2 = new Object[1];
        a(AndroidCharacter.getMirror('0') - ')', Color.blue(0) + 7, new char[]{6, 7, 1, 65527, 65535, 65531, 6}, true, 299 - ExpandableListView.getPackedPositionType(0L), objArr2);
        return ((String) objArr2[0]).intern();
    }

    private AFi1lSDK() {
    }

    public final q4ExternalSyntheticLambda3 IAuthTabCallback(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{65529, 2, 3, 2}, true, 298 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 5, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, new char[]{65529, 2, 3, 2}, true, 297 - View.combineMeasuredStates(0, 0), objArr2);
        Object[] objArr3 = {this, accessgetstatep, str, "slow_success", str2, true, Long.valueOf(j), Long.valueOf(j2), "true", strIntern, ((String) objArr2[0]).intern()};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, -2017737439, 2017737441, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onExtraCallbackWithResult + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return q4externalsyntheticlambda3;
    }

    public final q4ExternalSyntheticLambda3 onWarmupCompleted(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, @Nullable Boolean bool, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strOnWarmupCompleted = onWarmupCompleted(bool);
        Object[] objArr = {this, Integer.valueOf(i)};
        String str3 = (String) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 1162033052, -1162033052, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 4, new char[]{65529, 2, 3, 2}, true, (Process.myTid() >> 22) + 297, objArr2);
        Object[] objArr3 = {this, accessgetstatep, str, "resource_error", str2, false, Long.valueOf(j), Long.valueOf(j2), strOnWarmupCompleted, ((String) objArr2[0]).intern(), str3};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr3, -2017737439, 2017737441, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i5 = onExtraCallbackWithResult + 57;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return q4externalsyntheticlambda3;
    }

    public final q4ExternalSyntheticLambda3 IAuthTabCallback(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, int i, @Nullable Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = {this, accessgetstatep, str, "http_error", str2, false, Long.valueOf(j), Long.valueOf(j2), onWarmupCompleted(bool), onExtraCallbackWithResult(i), onExtraCallback(i)};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -2017737439, 2017737441, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i5 = onTransact + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda3;
    }

    public final q4ExternalSyntheticLambda3 onWarmupCompleted(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, boolean z) {
        String str3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(accessgetstatep, "");
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i3 = onTransact + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            str3 = "pending";
        } else {
            str3 = "unrecoverable";
        }
        return onWarmupCompleted(accessgetstatep, str, "render_gone", str2, false, j, j2, "renderer_gone", str3);
    }

    public final q4ExternalSyntheticLambda3 onNavigationEvent(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, boolean z) {
        String strIntern;
        String str3;
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i4 = onExtraCallbackWithResult + 17;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a((TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)) + 3, 5 >>> (ViewConfiguration.getDoubleTapTimeout() + 104), new char[]{65529, 2, 3, 2}, false, 13624 >>> (Process.myTid() + 115), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(4 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4, new char[]{65529, 2, 3, 2}, true, (Process.myTid() >> 22) + 297, objArr2);
                obj = objArr2[0];
            }
            strIntern = ((String) obj).intern();
        } else {
            strIntern = "recovery_failed";
        }
        String str4 = strIntern;
        if (z) {
            int i5 = onExtraCallbackWithResult + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            str3 = "success";
        } else {
            int i7 = onExtraCallbackWithResult + 31;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            str3 = "failure";
        }
        return onWarmupCompleted(accessgetstatep, str, "recovery_result", str2, z, j, j2, str4, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = -1;
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (Process.myTid() >> 22)), 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10277 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 12843), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, 2168 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i10 = $10 + 105;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i12 = $11 + Imgproc.COLOR_YUV2RGBA_YVYU;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >>> 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 12844), 54 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 12843), 55 - (ViewConfiguration.getTapTimeout() >> 16), 2167 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                c = '0';
                i4 = -1;
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final q4ExternalSyntheticLambda3 onExtraCallback(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, @NotNull String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        boolean zAreEqual = Intrinsics.areEqual(str3, "healthy");
        Object[] objArr = {this, accessgetstatep, str, "health_check", str3, str2, Boolean.valueOf(zAreEqual), Long.valueOf(j), Long.valueOf(j2), onNavigationEvent(str3)};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 94368224, -94368223, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onTransact + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return q4externalsyntheticlambda3;
    }

    public final q4ExternalSyntheticLambda3 IAuthTabCallback(@NotNull accessgetStatep accessgetstatep, @NotNull String str, @Nullable String str2, long j, long j2, @NotNull String str3, @NotNull String str4) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Object[] objArr = {this, accessgetstatep, str, str3, "degraded", str2, false, Long.valueOf(j), Long.valueOf(j2), str4};
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 94368224, -94368223, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
        int i4 = onTransact + 77;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return q4externalsyntheticlambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        int iHashCode = str.hashCode();
        if (iHashCode == 795560349) {
            if (!str.equals("healthy")) {
                return "js_unhealthy";
            }
            int i2 = onTransact + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 5, View.resolveSize(0, 0) + 4, new char[]{65529, 2, 3, 2}, true, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 297, objArr);
            return ((String) objArr[0]).intern();
        }
        int i4 = onTransact + 43;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        int i6 = i4 % 2;
        if (iHashCode == 1116551471) {
            return !(str.equals("context_gone") ^ true) ? "js_context_gone" : "js_unhealthy";
        }
        if (iHashCode != 1488488717) {
            return "js_unhealthy";
        }
        int i7 = i5 + 73;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return str.equals("unresponsive") ? "js_unresponsive" : "js_unhealthy";
    }

    public final String IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        if (str == null) {
            int i2 = onTransact + 35;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 17 / 0;
            }
            return "unresponsive";
        }
        if (StringsKt__StringsJVMKt.equals(str, "true", true)) {
            int i4 = onTransact + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return "healthy";
            }
            throw null;
        }
        if (!StringsKt__StringsJVMKt.equals(str, "null", true)) {
            return "unhealthy";
        }
        int i5 = onTransact + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return "context_gone";
    }

    public final q7 onNavigationEvent(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("webview_type", onExtraCallback(str));
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = q4ExternalSyntheticLambda9.onExtraCallbackWithResult;
        q7 q7Var = new q7(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback("path_template", q4ExternalSyntheticLambda9.onExtraCallback(q4externalsyntheticlambda9, str2, 0, 2, (Object) null)), getWrite.IAuthTabCallback("host_category", q4externalsyntheticlambda9.onWarmupCompleted(str2))));
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return q7Var;
    }

    public final q7 onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        q7 q7Var = new q7(access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("webview_type", onExtraCallback(str)), getWrite.IAuthTabCallback("path_template", "other"), getWrite.IAuthTabCallback("host_category", "other")));
        int i2 = onTransact + 23;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return q7Var;
    }

    public final q4ExternalSyntheticLambda3 onExtraCallback(@NotNull accessgetStatep accessgetstatep, @NotNull r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(r8lambdalzlost8ymkygg6aehcg97m8xisw, "");
        String strOnNavigationEvent = accesssetTrailersp.onNavigationEvent(accessgetstatep);
        String strIAuthTabCallback = accesssetTrailersp.IAuthTabCallback(accessgetstatep);
        String lowerCase = accessgetstatep.AudioAttributesImplApi26Parcelizer().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3 = new q4ExternalSyntheticLambda3("se_webview_page_load_summary", "WEBVIEW", "hybrid", "rum_p1_webview_100pct", strOnNavigationEvent, strIAuthTabCallback, lowerCase, r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.onExtraCallbackWithResult.onNavigationEvent(accessgetstatep.getSmallIconBitmap()), "hybrid-webview", "hybrid", onExtraCallback(r8lambdalzlost8ymkygg6aehcg97m8xisw), access8000.onExtraCallbackWithResult(access8000.onExtraCallbackWithResult(r8lambdalzlost8ymkygg6aehcg97m8xisw.onExtraCallback().IAuthTabCallback(), access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("summary_window_bucket", onExtraCallback(r8lambdalzlost8ymkygg6aehcg97m8xisw.asBinder())), getWrite.IAuthTabCallback("flush_reason", onExtraCallback(r8lambdalzlost8ymkygg6aehcg97m8xisw.onExtraCallbackWithResult())), getWrite.IAuthTabCallback("summary_overflowed", onWarmupCompleted(Boolean.valueOf(r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallbackDefault()))), getWrite.IAuthTabCallback("metric_step_detail", "webview_page_load_summary"))), q5a.onNavigationEvent.onWarmupCompleted()), (String) null, false, 4096, (DefaultConstructorMarker) null);
        int i2 = onExtraCallbackWithResult + 57;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return q4externalsyntheticlambda3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<q4ExternalSyntheticLambda6> onExtraCallback(r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = q4ExternalSyntheticLambda6.Companion;
        List<q4ExternalSyntheticLambda6> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new q4ExternalSyntheticLambda6[]{iAuthTabCallback.onWarmupCompleted("eligible", r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallback()), iAuthTabCallback.onWarmupCompleted("success", r8lambdalzlost8ymkygg6aehcg97m8xisw.onTransact()), iAuthTabCallback.onWarmupCompleted("failure", r8lambdalzlost8ymkygg6aehcg97m8xisw.onWarmupCompleted()), iAuthTabCallback.onWarmupCompleted("slow_success_count", r8lambdalzlost8ymkygg6aehcg97m8xisw.IAuthTabCallbackStub()), iAuthTabCallback.onExtraCallback("latency_ms", Long.valueOf(r8lambdalzlost8ymkygg6aehcg97m8xisw.onNavigationEvent()))});
        int i4 = onTransact + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str;
        String str2;
        AFi1lSDK aFi1lSDK = (AFi1lSDK) objArr[0];
        accessgetStatep accessgetstatep = (accessgetStatep) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        String str5 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        long jLongValue = ((Number) objArr[6]).longValue();
        long jLongValue2 = ((Number) objArr[7]).longValue();
        String str6 = (String) objArr[8];
        String str7 = (String) objArr[9];
        String str8 = (String) objArr[10];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue3 = ((Long) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{aFi1lSDK, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, -1247495238, 1247495241, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).longValue();
        String strOnNavigationEvent = accesssetTrailersp.onNavigationEvent(accessgetstatep);
        String strIAuthTabCallback = accesssetTrailersp.IAuthTabCallback(accessgetstatep);
        String lowerCase = accessgetstatep.AudioAttributesImplApi26Parcelizer().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o r8lambdat8lihx0zykzoz0sxavj4aicfk_o = r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.onExtraCallbackWithResult;
        String strOnNavigationEvent2 = r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onNavigationEvent(accessgetstatep.getSmallIconBitmap());
        q4ExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = q4ExternalSyntheticLambda6.Companion;
        q4ExternalSyntheticLambda6 q4externalsyntheticlambda6OnWarmupCompleted = q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, "eligible", 0L, 2, (Object) null);
        if (zBooleanValue) {
            int i4 = onExtraCallbackWithResult + 23;
            str = "success";
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str2 = str;
        } else {
            str = "success";
            str2 = "failure";
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new q4ExternalSyntheticLambda6[]{q4externalsyntheticlambda6OnWarmupCompleted, q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, str2, 0L, 2, (Object) null), iAuthTabCallback.onExtraCallback("latency_ms", Long.valueOf(jLongValue3))});
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("webview_type", aFi1lSDK.onExtraCallback(str3));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("page_load_event", aFi1lSDK.onExtraCallback(str4));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("page_load_outcome", zBooleanValue ^ true ? "failure" : str);
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = q4ExternalSyntheticLambda9.onExtraCallbackWithResult;
        return new q4ExternalSyntheticLambda3("se_webview_page_load_event", "WEBVIEW", "hybrid", "rum_p1_webview_100pct", strOnNavigationEvent, strIAuthTabCallback, lowerCase, strOnNavigationEvent2, "hybrid-webview", "hybrid", listListOf, access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("path_template", q4ExternalSyntheticLambda9.onExtraCallback(q4externalsyntheticlambda9, str5, 0, 2, (Object) null)), getWrite.IAuthTabCallback("host_category", q4externalsyntheticlambda9.onWarmupCompleted(str5)), getWrite.IAuthTabCallback("is_main_frame", aFi1lSDK.onExtraCallback(str6)), getWrite.IAuthTabCallback("http_status_bucket", aFi1lSDK.onExtraCallback(str7)), getWrite.IAuthTabCallback("error_category", aFi1lSDK.onExtraCallback(str8)), getWrite.IAuthTabCallback("load_duration_bucket", r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onExtraCallback(jLongValue3)), getWrite.IAuthTabCallback("metric_step_detail", "webview_page_load_event")), q5a.onNavigationEvent.onWarmupCompleted()), (String) null, false, 4096, (DefaultConstructorMarker) null);
    }

    private final q4ExternalSyntheticLambda3 onWarmupCompleted(accessgetStatep accessgetstatep, String str, String str2, String str3, boolean z, long j, long j2, String str4, String str5) {
        String str6;
        int i = 2 % 2;
        int i2 = onTransact + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue = ((Long) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{this, Long.valueOf(j), Long.valueOf(j2)}, -1247495238, 1247495241, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).longValue();
        String strOnNavigationEvent = accesssetTrailersp.onNavigationEvent(accessgetstatep);
        String strIAuthTabCallback = accesssetTrailersp.IAuthTabCallback(accessgetstatep);
        String lowerCase = accessgetstatep.AudioAttributesImplApi26Parcelizer().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o r8lambdat8lihx0zykzoz0sxavj4aicfk_o = r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.onExtraCallbackWithResult;
        String strOnNavigationEvent2 = r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onNavigationEvent(accessgetstatep.getSmallIconBitmap());
        q4ExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = q4ExternalSyntheticLambda6.Companion;
        q4ExternalSyntheticLambda6 q4externalsyntheticlambda6OnWarmupCompleted = q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, "eligible", 0L, 2, (Object) null);
        if (z) {
            int i4 = onExtraCallbackWithResult + 55;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str6 = "success";
        } else {
            str6 = "failure";
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new q4ExternalSyntheticLambda6[]{q4externalsyntheticlambda6OnWarmupCompleted, q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, str6, 0L, 2, (Object) null), iAuthTabCallback.onExtraCallback("latency_ms", Long.valueOf(jLongValue))});
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("webview_type", onExtraCallback(str));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("render_process_event", onExtraCallback(str2));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("recovery_outcome", onExtraCallback(str5));
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = q4ExternalSyntheticLambda9.onExtraCallbackWithResult;
        return new q4ExternalSyntheticLambda3("se_webview_render_process_event", "WEBVIEW", "hybrid", "rum_p1_webview_100pct", strOnNavigationEvent, strIAuthTabCallback, lowerCase, strOnNavigationEvent2, "hybrid-webview", "hybrid", listListOf, access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("path_template", q4ExternalSyntheticLambda9.onExtraCallback(q4externalsyntheticlambda9, str3, 0, 2, (Object) null)), getWrite.IAuthTabCallback("host_category", q4externalsyntheticlambda9.onWarmupCompleted(str3)), getWrite.IAuthTabCallback("error_category", onExtraCallback(str4)), getWrite.IAuthTabCallback("load_duration_bucket", r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onExtraCallback(jLongValue)), getWrite.IAuthTabCallback("metric_step_detail", "webview_render_process_event")), q5a.onNavigationEvent.onWarmupCompleted()), (String) null, false, 4096, (DefaultConstructorMarker) null);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str;
        AFi1lSDK aFi1lSDK = (AFi1lSDK) objArr[0];
        accessgetStatep accessgetstatep = (accessgetStatep) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        long jLongValue = ((Number) objArr[7]).longValue();
        long jLongValue2 = ((Number) objArr[8]).longValue();
        String str6 = (String) objArr[9];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jLongValue3 = ((Long) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{aFi1lSDK, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, -1247495238, 1247495241, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).longValue();
        String strOnNavigationEvent = accesssetTrailersp.onNavigationEvent(accessgetstatep);
        String strIAuthTabCallback = accesssetTrailersp.IAuthTabCallback(accessgetstatep);
        String lowerCase = accessgetstatep.AudioAttributesImplApi26Parcelizer().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o r8lambdat8lihx0zykzoz0sxavj4aicfk_o = r8lambdat8liHx0zyKzoz0sXAVj4AicfK_o.onExtraCallbackWithResult;
        String strOnNavigationEvent2 = r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onNavigationEvent(accessgetstatep.getSmallIconBitmap());
        q4ExternalSyntheticLambda6.IAuthTabCallback iAuthTabCallback = q4ExternalSyntheticLambda6.Companion;
        q4ExternalSyntheticLambda6 q4externalsyntheticlambda6OnWarmupCompleted = q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, "eligible", 0L, 2, (Object) null);
        if (zBooleanValue) {
            int i4 = onExtraCallbackWithResult + 27;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            str = "success";
        } else {
            str = "failure";
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new q4ExternalSyntheticLambda6[]{q4externalsyntheticlambda6OnWarmupCompleted, q4ExternalSyntheticLambda6.IAuthTabCallback.onWarmupCompleted(iAuthTabCallback, str, 0L, 2, (Object) null), iAuthTabCallback.onExtraCallback("latency_ms", Long.valueOf(jLongValue3))});
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("webview_type", aFi1lSDK.onExtraCallback(str2));
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("js_health_event", aFi1lSDK.onExtraCallback(str3));
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("js_health_result", aFi1lSDK.onExtraCallback(str4));
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = q4ExternalSyntheticLambda9.onExtraCallbackWithResult;
        return new q4ExternalSyntheticLambda3("se_webview_js_health_event", "WEBVIEW", "hybrid", "rum_p1_webview_100pct", strOnNavigationEvent, strIAuthTabCallback, lowerCase, strOnNavigationEvent2, "hybrid-webview", "hybrid", listListOf, access8000.onExtraCallbackWithResult(access8000.IAuthTabCallbackStub(pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("path_template", q4ExternalSyntheticLambda9.onExtraCallback(q4externalsyntheticlambda9, str5, 0, 2, (Object) null)), getWrite.IAuthTabCallback("host_category", q4externalsyntheticlambda9.onWarmupCompleted(str5)), getWrite.IAuthTabCallback("error_category", aFi1lSDK.onExtraCallback(str6)), getWrite.IAuthTabCallback("load_duration_bucket", r8lambdat8lihx0zykzoz0sxavj4aicfk_o.onExtraCallback(jLongValue3)), getWrite.IAuthTabCallback("metric_step_detail", "webview_js_health_event")), q5a.onNavigationEvent.onWarmupCompleted()), (String) null, false, 4096, (DefaultConstructorMarker) null);
    }

    private final String onExtraCallback(int i) {
        int i2 = 2 % 2;
        if (500 <= i) {
            int i3 = onTransact + 47;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                if (i < 5775) {
                    return "http_5xx";
                }
            } else if (i < 600) {
                return "http_5xx";
            }
        }
        if (400 > i || i >= 500) {
            return "http_other";
        }
        int i4 = onTransact + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return "http_4xx";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String onExtraCallbackWithResult(int i) throws Throwable {
        int i2 = 2 % 2;
        if (100 <= i && i < 200) {
            int i3 = onTransact + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 8 / 0;
            }
            return "1xx";
        }
        if (200 <= i) {
            int i5 = onTransact + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (i < 300) {
                return "2xx";
            }
        }
        if (300 <= i && i < 400) {
            return "3xx";
        }
        if (400 <= i && i < 500) {
            return "4xx";
        }
        if (500 <= i) {
            int i7 = onTransact + 107;
            int i8 = i7 % 128;
            onExtraCallbackWithResult = i8;
            int i9 = i7 % 2;
            if (i < 600) {
                int i10 = i8 + 39;
                onTransact = i10 % 128;
                int i11 = i10 % 2;
                return "5xx";
            }
        }
        Object[] objArr = new Object[1];
        a(8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, true, View.combineMeasuredStates(0, 0) + 301, objArr);
        return ((String) objArr[0]).intern();
    }

    private final String onWarmupCompleted(Boolean bool) throws Throwable {
        Object obj;
        int i = 2 % 2;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            int i2 = onExtraCallbackWithResult + 29;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return "true";
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            return "false";
        }
        if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = onExtraCallbackWithResult + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(91 >> (Process.myPid() << 42), 2 >> View.resolveSizeAndState(1, 1, 1), new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, false, 12737 >> (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(7 - (Process.myPid() >> 22), View.resolveSizeAndState(0, 0, 0) + 5, new char[]{65535, 65534, 65531, 65534, 5, 65534, 7}, true, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 300, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    private final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onTransact = i2 % 128;
        String strOnNavigationEvent = i2 % 2 == 0 ? q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 4, (Object) null) : q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 2, (Object) null);
        int i3 = onTransact + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return strOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jLongValue2 - jLongValue, 0L);
        int i4 = onTransact + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jCoerceAtLeast);
        }
        throw null;
    }

    private final long onNavigationEvent(long j, long j2) {
        Object[] objArr = {this, Long.valueOf(j), Long.valueOf(j2)};
        return ((Long) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -1247495238, 1247495241, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted())).longValue();
    }

    private final q4ExternalSyntheticLambda3 onExtraCallbackWithResult(accessgetStatep accessgetstatep, String str, String str2, String str3, String str4, boolean z, long j, long j2, String str5) {
        Object[] objArr = {this, accessgetstatep, str, str2, str3, str4, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), str5};
        return (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 94368224, -94368223, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final q4ExternalSyntheticLambda3 onNavigationEvent(accessgetStatep accessgetstatep, String str, String str2, String str3, boolean z, long j, long j2, String str4, String str5, String str6) {
        Object[] objArr = {this, accessgetstatep, str, str2, str3, Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(j2), str4, str5, str6};
        return (q4ExternalSyntheticLambda3) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, -2017737439, 2017737441, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    private final String onWarmupCompleted(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        return (String) onWarmupCompleted(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 1162033052, -1162033052, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted());
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 478309012;
    }
}
