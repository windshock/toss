package o;

import android.app.Activity;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
final class encryptPrikey implements Activity.ScreenCaptureCallback, UST_CERT_GetSignatureAlgorithmType {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static boolean onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onTransact;
    private final Function0<Unit> onWarmupCompleted;

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-108, -109, -126, -121, -110, -111, -111, -121, -122, -124, -111, -126, -114, -126, -124, -112, -116, -113, -114, -119, -116, -115, -116, -119, -126, -117, -124, -125, -118, -119, -120, -121, -122, -123, -124, -124, -125, -126, -127}, 126 - TextUtils.lastIndexOf("", '0', 0), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new IAuthTabCallback(null);
        int i = asBinder + 19;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public encryptPrikey(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = function0;
    }

    public /* bridge */ void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityCreated(activity, bundle);
        int i4 = IAuthTabCallbackDefault + 67;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onActivityDestroyed(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityDestroyed(activity);
        int i4 = asInterface + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    public /* bridge */ void onActivityPaused(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityPaused(activity);
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onActivityResumed(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onActivityResumed(activity);
        int i4 = asInterface + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onActivitySaveInstanceState(activity, bundle);
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
    }

    public void onActivityStarted(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.registerScreenCaptureCallback(activity.getMainExecutor(), this);
                int i3 = 25 / 0;
            } else {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.registerScreenCaptureCallback(activity.getMainExecutor(), this);
            }
        } catch (Exception unused) {
            TextUtils.lastIndexOf("", '0', 0, 0);
            TextUtils.getCapsMode("", 0, 0);
        }
    }

    public void onActivityStopped(@NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        IAuthTabCallbackDefault = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.unregisterScreenCaptureCallback(this);
            } else {
                Intrinsics.checkNotNullParameter(activity, "");
                activity.unregisterScreenCaptureCallback(this);
                throw null;
            }
        } catch (Exception unused) {
            ImageFormat.getBitsPerPixel(0);
            Drawable.resolveOpacity(0, 0);
        }
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public void onScreenCaptured() {
        int i = 2 % 2;
        int i2 = asInterface + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.invoke();
        if (i3 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr4[i3] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr3[i3]);
            }
            cArr3 = cArr4;
        }
        int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(onNavigationEvent);
        if (onTransact) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i4 = $11 + 77;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) >> defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] % i] - iY);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                }
                Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i5 = $11 + 21;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
            Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{32469, 32453, 32502, 32507, 32498, 32421, 32455, 32496, 32500, 32491, 32423, 32511, 32490, 32495, 32476, 32506, 32508, 32454, 32509, 32501, 32474, 32452, 32384, 32497, 32505};
        onNavigationEvent = -1184333984;
        onExtraCallback = true;
        onTransact = true;
    }
}
