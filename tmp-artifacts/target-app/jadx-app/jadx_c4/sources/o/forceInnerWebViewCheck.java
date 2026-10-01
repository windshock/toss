package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class forceInnerWebViewCheck {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onTransact;
    private final StartAction onExtraCallbackWithResult;
    private final ActivityAnimBean1 onWarmupCompleted;
    private static char[] IAuthTabCallback = {32471, 32508, 32498, 32496, 32454, 32500, 32481, 32501, 32458, 32484, 32461, 32494, 32495, 32482, 32437, 32503, 32472, 32425, 32445, 32490, 32436};
    private static int onNavigationEvent = -1184334179;
    private static boolean onExtraCallback = true;
    private static boolean asBinder = true;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 85;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 111;
            onTransact = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof forceInnerWebViewCheck)) {
            return false;
        }
        forceInnerWebViewCheck forceinnerwebviewcheck = (forceInnerWebViewCheck) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, forceinnerwebviewcheck.onExtraCallbackWithResult)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, forceinnerwebviewcheck.onWarmupCompleted)) {
            return true;
        }
        int i9 = onTransact + 117;
        IAuthTabCallbackStub = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onWarmupCompleted.hashCode();
        int i4 = onTransact + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        StartAction startAction = this.onExtraCallbackWithResult;
        ActivityAnimBean1 activityAnimBean1 = this.onWarmupCompleted;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-111, -124, -125, -126, -112, -113, -114, -121, -115, -122, -116, -117, -118, -124, -119, -120, -121, -122, -123, -124, -125, -126, -127}, 127 - Color.red(0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(startAction);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-111, -114, -121, -115, -122, -116, -117, -118, -124, -108, -109, -110}, 127 - TextUtils.getOffsetAfter("", 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(activityAnimBean1);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-107}, Color.rgb(0, 0, 0) + 16777343, objArr3);
        sb.append(((String) objArr3[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public forceInnerWebViewCheck(@NotNull StartAction startAction, @NotNull ActivityAnimBean1 activityAnimBean1) {
        Intrinsics.checkNotNullParameter(startAction, "");
        Intrinsics.checkNotNullParameter(activityAnimBean1, "");
        this.onExtraCallbackWithResult = startAction;
        this.onWarmupCompleted = activityAnimBean1;
    }

    public final StartAction onExtraCallback() {
        StartAction startAction;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            startAction = this.onExtraCallbackWithResult;
            int i4 = 82 / 0;
        } else {
            startAction = this.onExtraCallbackWithResult;
        }
        int i5 = i3 + 93;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return startAction;
    }

    public final ActivityAnimBean1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ActivityAnimBean1 activityAnimBean1 = this.onWarmupCompleted;
        int i5 = i3 + 3;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return activityAnimBean1;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = IAuthTabCallback;
        if (cArr3 != null) {
            int i3 = $11 + 39;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 77 - Color.alpha(0), KeyEvent.getDeadChar(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            long j = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74, 16038 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (asBinder) {
                int i6 = $10 + 111;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.lastIndexOf("", '0', 0, 0) + 64, TextUtils.indexOf((CharSequence) "", '0', 0) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 87;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 62 - ExpandableListView.getPackedPositionChild(j), 12214 - (ViewConfiguration.getScrollBarSize() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i11 = $10 + 15;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
