package o;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BiometricData {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static long onWarmupCompleted = -9139812798959287971L;

    @SerializedName("loadedAdNetworkInfo")
    private final getBiometricDataHash IAuthTabCallback;

    @SerializedName("adNetworkInfoArray")
    private final List<getBiometricDataHash> onExtraCallbackWithResult;

    @SerializedName("responseId")
    private final String onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onTransact + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof BiometricData) {
            BiometricData biometricData = (BiometricData) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, biometricData.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, biometricData.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, biometricData.onNavigationEvent);
        }
        int i4 = onExtraCallback + 111;
        onTransact = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        getBiometricDataHash getbiometricdatahash = this.IAuthTabCallback;
        int iHashCode2 = getbiometricdatahash == null ? 0 : getbiometricdatahash.hashCode();
        String str = this.onNavigationEvent;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
        int i4 = onTransact + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        List<getBiometricDataHash> list = this.onExtraCallbackWithResult;
        getBiometricDataHash getbiometricdatahash = this.IAuthTabCallback;
        String str = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{1067, 15081, 31177, 47280, 65428, 16059, 32101, 48200, 62242, 12826, 28930, 47092, 63195, 13720, 29862, 43909, 60021, 10517, 26677, 44843, 60968, 11516, 25540, 41692, 57773, 8343, 26487, 42622, 58688, 9255, 23319, 39378, 55544, 8159, 24229, 40326, 56363}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16102, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(list);
        Object[] objArr2 = new Object[1];
        a(new char[]{1094, 26765, 56712, 16976, 46871, 7149, 34981, 64895, 25107, 55025, 15330, 43138, 7498, 33286, 63207, 23473, 51313, 15636, 41466, 5833, 31625, 59396}, Drawable.resolveOpacity(0, 0) + 27847, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getbiometricdatahash);
        Object[] objArr3 = new Object[1];
        a(new char[]{1094, 40181, 13670, 52786, 26341, 65441, 36991, 10557, 49633, 23224, 62293, 37947, 11427}, KeyEvent.getDeadChar(0, 0) + 39103, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(str);
        Object[] objArr4 = new Object[1];
        a(new char[]{1091}, 46199 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
        sb.append(((String) objArr4[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallback + 107;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public BiometricData(@NotNull List<getBiometricDataHash> list, @Nullable getBiometricDataHash getbiometricdatahash, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        this.onExtraCallbackWithResult = list;
        this.IAuthTabCallback = getbiometricdatahash;
        this.onNavigationEvent = str;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 1;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - View.getDefaultSize(0, 0), 19626 - ImageFormat.getBitsPerPixel(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, 6431 - AndroidCharacter.getMirror('0'), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 1), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 6383 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i6 = $11 + 71;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }
}
