package im.toss.features.kyc.network.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ReformTargetRequest {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;
    private final String reason;
    private final String reasonCode;

    static {
        onNavigationEvent();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = IAuthTabCallback + 109;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReformTargetRequest() {
        String str = null;
        this(str, str, 3, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 107;
        onWarmupCompleted = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof ReformTargetRequest)) {
            int i6 = i2 + 107;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        ReformTargetRequest reformTargetRequest = (ReformTargetRequest) obj;
        if (Intrinsics.areEqual(this.reasonCode, reformTargetRequest.reasonCode)) {
            return Intrinsics.areEqual(this.reason, reformTargetRequest.reason);
        }
        int i8 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.reasonCode.hashCode();
        return i3 == 0 ? (iHashCode % 26) / this.reason.hashCode() : (iHashCode * 31) + this.reason.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReformTargetRequest(reasonCode=" + this.reasonCode + ", reason=" + this.reason + ")";
        int i2 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ReformTargetRequest(int i, String str, String str2, okycx okycxVar) throws Throwable {
        if ((i & 1) == 0) {
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 3;
            } else {
                int i4 = 2 % 2;
            }
            str = "KYC_OVERDUE";
        }
        this.reasonCode = str;
        if ((i & 2) != 0) {
            this.reason = str2;
            int i5 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
                return;
            }
            return;
        }
        Object[] objArr = new Object[1];
        a(new char[]{28088, 48930, 51369, 6681}, 53898 - ImageFormat.getBitsPerPixel(0), objArr);
        this.reason = ((String) objArr[0]).intern();
        int i7 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
    }

    public ReformTargetRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.reasonCode = str;
        this.reason = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(ReformTargetRequest reformTargetRequest, vyl vylVar, SerialDescriptor serialDescriptor) throws Throwable {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(reformTargetRequest.reasonCode, "KYC_OVERDUE");
                throw null;
            }
            if (!Intrinsics.areEqual(reformTargetRequest.reasonCode, "KYC_OVERDUE")) {
                vylVar.onExtraCallback(serialDescriptor, 0, reformTargetRequest.reasonCode);
                int i3 = onWarmupCompleted + 75;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 2;
                }
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i5 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                String str = reformTargetRequest.reason;
                Object[] objArr = new Object[1];
                a(new char[]{28088, 48930, 51369, 6681}, 53899 >>> Color.blue(0), objArr);
                if (Intrinsics.areEqual(str, ((String) objArr[0]).intern())) {
                    return;
                }
            } else {
                String str2 = reformTargetRequest.reason;
                Object[] objArr2 = new Object[1];
                a(new char[]{28088, 48930, 51369, 6681}, Color.blue(0) + 53899, objArr2);
                if (Intrinsics.areEqual(str2, ((String) objArr2[0]).intern())) {
                    return;
                }
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 1, reformTargetRequest.reason);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReformTargetRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 67;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 4;
            } else {
                int i7 = 2 % 2;
            }
            str = "KYC_OVERDUE";
        }
        if ((i & 2) != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{28088, 48930, 51369, 6681}, MotionEvent.axisFromString("") + 53900, objArr);
            str2 = ((String) objArr[0]).intern();
        }
        this(str, str2);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 24 - View.resolveSizeAndState(0, 0, 0), 19628 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 59, KeyEvent.getDeadChar(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 95;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 2;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $11 + 81;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 59 - TextUtils.getCapsMode("", 0, 0), 6383 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 3610305431057721563L;
    }
}
