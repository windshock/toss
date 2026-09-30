package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo$onNavigationEvent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onNavigationEvent = -677382409074844342L;

    public /* synthetic */ UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo$onNavigationEvent() {
    }

    public final void onExtraCallbackWithResult(@NotNull com.crosscert.android.selfauth.ToolkitManager toolkitManager) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(toolkitManager, BuildConfig.FLAVOR);
        try {
            toolkitManager.init(zzaj.onNavigationEvent().extraCallbackWithResult());
            if (!(!zzaj.onNavigationEvent().onActivityLayout())) {
                int i2 = onExtraCallback + 47;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                toolkitManager.getLicenseInfo();
            }
        } catch (com.crosscert.exception.InitializeException e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{22573, 2348, 64082, 43874, 7312, 52646, 48842, 28619, 53527, 33321, 29520, 9359, 38298, 18143, 14309, 39172}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20771, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, ((String) objArr[0]).intern(), e.getMessage(), e, (Map) null, 8, (Object) null);
            ALCDetectionMode.onExtraCallbackWithResult(e, (Map) null, 1, (Object) null);
        } catch (Throwable th) {
            ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 24 - (ViewConfiguration.getScrollBarSize() >> 8), 19628 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR), ImageFormat.getBitsPerPixel(0) + 60, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $11 + 53;
                $10 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59, 6383 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i8 = $10 + 97;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }
}
