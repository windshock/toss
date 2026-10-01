package im.toss.appsintoss.game.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.appsintoss.game.model.GamePromotionRewardExecutionRequest$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GamePromotionRewardExecutionRequest {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static char[] IAuthTabCallback;
    private static long onExtraCallback;
    private static int onNavigationEvent;
    private final int amount;
    private final String key;
    private final String promotionCode;
    private final boolean uiAutomationDetected;
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = s2 * 4;
        int i4 = 4 - (i * 4);
        byte[] bArr = $$a;
        int i5 = (s * 4) + 97;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4++;
            i5 += -i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i5 += -i6;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    static {
        onNavigationEvent = 1;
        onNavigationEvent();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onExtraCallbackWithResult + 27;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamePromotionRewardExecutionRequest)) {
            int i2 = asBinder + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        GamePromotionRewardExecutionRequest gamePromotionRewardExecutionRequest = (GamePromotionRewardExecutionRequest) obj;
        if (!Intrinsics.areEqual(this.key, gamePromotionRewardExecutionRequest.key)) {
            int i4 = onWarmupCompleted + 111;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.promotionCode, gamePromotionRewardExecutionRequest.promotionCode)) {
            int i6 = onWarmupCompleted + 87;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.amount != gamePromotionRewardExecutionRequest.amount) {
            int i8 = asBinder + 97;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.uiAutomationDetected == gamePromotionRewardExecutionRequest.uiAutomationDetected) {
            return true;
        }
        int i10 = asBinder + 75;
        onWarmupCompleted = i10 % 128;
        return i10 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.key.hashCode();
        return i3 == 0 ? (((((iHashCode >>> 126) * this.promotionCode.hashCode()) << 96) - Integer.hashCode(this.amount)) / 5) * Boolean.hashCode(this.uiAutomationDetected) : (((((iHashCode * 31) + this.promotionCode.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31) + Boolean.hashCode(this.uiAutomationDetected);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.key;
        String str2 = this.promotionCode;
        int i2 = this.amount;
        boolean z = this.uiAutomationDetected;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0), 39 - MotionEvent.axisFromString(""), (char) (15459 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(39 - TextUtils.lastIndexOf("", '0', 0, 0), 16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(str2);
        Object[] objArr3 = new Object[1];
        a(55 - MotionEvent.axisFromString(""), Color.alpha(0) + 9, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(i2);
        Object[] objArr4 = new Object[1];
        a(65 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 24, (char) (888 - (KeyEvent.getMaxKeyCode() >> 16)), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(z);
        Object[] objArr5 = new Object[1];
        a(88 - Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 1, (char) (47288 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i3 = asBinder + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public /* synthetic */ GamePromotionRewardExecutionRequest(int i, String str, String str2, int i2, boolean z, okycx okycxVar) {
        if (15 != (i & 15)) {
            int i3 = onWarmupCompleted + 77;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            htf31.onExtraCallbackWithResult(i, 15, GamePromotionRewardExecutionRequest$.serializer.INSTANCE.getDescriptor());
            int i5 = onWarmupCompleted + 23;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this.key = str;
        this.promotionCode = str2;
        this.amount = i2;
        this.uiAutomationDetected = z;
    }

    public GamePromotionRewardExecutionRequest(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.promotionCode = str2;
        this.amount = i;
        this.uiAutomationDetected = z;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(GamePromotionRewardExecutionRequest gamePromotionRewardExecutionRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, gamePromotionRewardExecutionRequest.key);
        vylVar.onExtraCallback(serialDescriptor, 1, gamePromotionRewardExecutionRequest.promotionCode);
        vylVar.onExtraCallback(serialDescriptor, 2, gamePromotionRewardExecutionRequest.amount);
        vylVar.onNavigationEvent(serialDescriptor, 3, gamePromotionRewardExecutionRequest.uiAutomationDetected);
        int i4 = asBinder + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i << i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 59697), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, 10973 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 31 - (Process.myTid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getTapTimeout() >> 16) + 44, 1494 - TextUtils.indexOf("", "", 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (KeyEvent.getMaxKeyCode() >> 16)), 17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20219, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.rgb(0, 0, 0) + 16777260, KeyEvent.keyCodeFromString("") + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 49123), View.resolveSizeAndState(0, 0, 0) + 44, 1494 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                int i7 = $10 + 3;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr);
        int i9 = $10 + 81;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{53744, 56849, 52820, 65159, 61179, 40742, 36722, 49067, 45024, 23612, 19480, 31829, 27789, 7422, 3376, 15721, 11686, 56818, 51757, 64055, 59971, 39553, 35534, 47907, 43883, 23473, 19438, 30756, 26657, 6233, 2196, 14555, 10546, 55651, 51629, 63914, 58912, 38417, 34372, 46811, 60920, 57907, 61994, 49907, 53927, 41818, 45841, 33745, 37765, 24644, 28796, 16410, 20719, 8363, 12627, 320, 60920, 57907, 62011, 49900, 53927, 41794, 45840, 33745, 37841, 61056, 57675, 61783, 49552, 53745, 41018, 45170, 32946, 37113, 25394, 29470, 17224, 21399, 9177, 12810, 608, 4776, 58110, 62769, 50461, 54597, 42395, 46475, 21829};
        onExtraCallback = 1117037063215702547L;
    }
}
