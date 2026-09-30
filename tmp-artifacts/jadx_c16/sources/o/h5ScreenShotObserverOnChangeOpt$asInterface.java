package o;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class h5ScreenShotObserverOnChangeOpt$asInterface extends h5ScreenShotObserverOnChangeOpt {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final h5ScreenShotObserverOnChangeOpt$asInterface IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static boolean IAuthTabCallbackStub = false;
    private static boolean asBinder = false;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final String onExtraCallback;
    private static char[] onExtraCallbackWithResult = null;
    private static final String onNavigationEvent;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 91;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj || (obj instanceof h5ScreenShotObserverOnChangeOpt$asInterface)) {
            return true;
        }
        int i4 = i2 + 89;
        IAuthTabCallbackDefault = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return 629670588;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 123;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return "DetailCard";
    }

    private static void b(int[] iArr, byte[] bArr, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 63;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 77, 20952 - (ViewConfiguration.getTapTimeout() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 77 - TextUtils.indexOf("", "", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        float f = 0.0f;
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74, 16037 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i6 = $10 + 119;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 63, (ViewConfiguration.getEdgeSlop() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                f = 0.0f;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallbackStub) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.rgb(0, 0, 0) + 16777279, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i10 = $11 + 5;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 62 / 0;
            objArr[0] = str;
        }
    }

    private h5ScreenShotObserverOnChangeOpt$asInterface() {
        super((DefaultConstructorMarker) null);
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        b(null, new byte[]{-117, -123, -115, -118, -119, -114, -116, -115, -122, -124, -117, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        IAuthTabCallback = new h5ScreenShotObserverOnChangeOpt$asInterface();
        Object[] objArr2 = new Object[1];
        b(null, new byte[]{-117, -123, -115, -118, -119, -114, -116, -115, -122, -124, -117, -119, -122, -116, -117, -124, -123, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, null, 127 - Gravity.getAbsoluteGravity(0, 0), objArr2);
        onNavigationEvent = ((String) objArr2[0]).intern();
        int i = onTransact + 71;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    protected String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = onNavigationEvent;
        int i4 = i3 + 35;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onNavigationEvent(@Nullable Intent intent) throws Throwable {
        int i = 2 % 2;
        String stringExtra = null;
        if (intent != null) {
            int i2 = IAuthTabCallbackDefault + 123;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(null, new byte[]{-124, -125, -111, -122}, null, 127 - Color.green(0), objArr);
            stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        } else {
            int i4 = IAuthTabCallbackDefault + 31;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
        }
        return stringExtra == null ? "" : stringExtra;
    }

    public final String IAuthTabCallback(@Nullable Intent intent) throws Throwable {
        Object obj;
        int i = 2 % 2;
        String stringExtra = null;
        if (intent != null) {
            int i2 = IAuthTabCallbackDefault + 99;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                b(null, new byte[]{-124, -112, -115, -113}, null, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12275, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                b(null, new byte[]{-124, -112, -115, -113}, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                obj = objArr2[0];
            }
            stringExtra = intent.getStringExtra(((String) obj).intern());
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        int i3 = IAuthTabCallbackDefault + 97;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return "";
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{32591, 32589, 32586, 32605, 32584, 32590, 32587, 32512, 32523, 32607, 32606, 32593, 32601, 32598, 32596, 32597, 32577};
        onWarmupCompleted = -1184333830;
        IAuthTabCallbackStub = true;
        asBinder = true;
    }
}
