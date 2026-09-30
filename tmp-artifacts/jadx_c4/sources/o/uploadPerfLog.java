package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.isTiny;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class uploadPerfLog {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private final long IAuthTabCallback;
    private final Double asInterface;
    private final isTiny.onWarmupCompleted onExtraCallback;
    private final RVPub onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final List<isTiny.onWarmupCompleted> onWarmupCompleted;
    private static char[] onTransact = {32503, 32284, 32274, 32272, 32502, 32270, 32264, 32257, 32259, 32276, 32483, 32258, 32256, 32265, 32469, 32498, 32273, 32504, 32457, 32477, 32271, 32497, 32481, 32493, 32279, 32468};
    private static int IAuthTabCallbackDefault = -1184334147;
    private static boolean asBinder = true;
    private static boolean IAuthTabCallbackStub = true;

    public /* synthetic */ uploadPerfLog(RVPub rVPub, isTiny.onWarmupCompleted onwarmupcompleted, long j, Double d, List list, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rVPub, onwarmupcompleted, j, d, list, j2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = getInterfaceDescriptor + 55;
            IAuthTabCallback_Parcel = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof uploadPerfLog)) {
            return false;
        }
        uploadPerfLog uploadperflog = (uploadPerfLog) obj;
        if (this.onExtraCallbackWithResult == uploadperflog.onExtraCallbackWithResult) {
            return !(Intrinsics.areEqual(this.onExtraCallback, uploadperflog.onExtraCallback) ^ true) && setLogBuffers.IAuthTabCallback(this.onNavigationEvent, uploadperflog.onNavigationEvent) && Intrinsics.areEqual(this.asInterface, uploadperflog.asInterface) && Intrinsics.areEqual(this.onWarmupCompleted, uploadperflog.onWarmupCompleted) && setLogBuffers.IAuthTabCallback(this.IAuthTabCallback, uploadperflog.IAuthTabCallback);
        }
        int i3 = getInterfaceDescriptor + 95;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        RVPub rVPub = this.onExtraCallbackWithResult;
        int iHashCode2 = rVPub == null ? 0 : rVPub.hashCode();
        isTiny.onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
        if (onwarmupcompleted == null) {
            int i4 = IAuthTabCallback_Parcel + 37;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = onwarmupcompleted.hashCode();
        }
        int iExtraCallback = setLogBuffers.extraCallback(this.onNavigationEvent);
        Double d = this.asInterface;
        int iHashCode3 = (((((((((iHashCode2 * 31) + iHashCode) * 31) + iExtraCallback) * 31) + (d != null ? d.hashCode() : 0)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + setLogBuffers.extraCallback(this.IAuthTabCallback);
        int i6 = getInterfaceDescriptor + 59;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        RVPub rVPub = this.onExtraCallbackWithResult;
        isTiny.onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
        String strOnPostMessage = setLogBuffers.onPostMessage(this.onNavigationEvent);
        Double d = this.asInterface;
        List<isTiny.onWarmupCompleted> list = this.onWarmupCompleted;
        String strOnPostMessage2 = setLogBuffers.onPostMessage(this.IAuthTabCallback);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-110, -124, -111, -122, -112, -119, -122, -119, -119, -124, -113, -120, -114, -115, -116, -124, -117, -125, -118, -119, -120, -124, -121, -122, -124, -123, -124, -125, -126, -127}, 127 - TextUtils.indexOf("", "", 0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(rVPub);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-110, -107, -122, -118, -120, -125, -124, -120, -124, -106, -107, -118, -126, -121, -108, -109}, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(onwarmupcompleted);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-110, -124, -121, -118, -105, -107, -122, -118, -120, -125, -124, -120, -124, -111, -108, -109}, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(strOnPostMessage);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-110, -107, -122, -118, -120, -119, -122, -104, -107, -122, -118, -120, -125, -124, -120, -124, -106, -107, -118, -126, -121, -108, -109}, Color.blue(0) + 127, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(d);
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-110, -116, -107, -122, -118, -120, -125, -124, -120, -124, -106, -124, -107, -118, -103, -108, -109}, Color.red(0) + 127, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(list);
        Object[] objArr6 = new Object[1];
        a(null, null, new byte[]{-110, -124, -121, -118, -105, -119, -124, -120, -114, -118, -103, -108, -109}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(strOnPostMessage2);
        Object[] objArr7 = new Object[1];
        a(null, null, new byte[]{-102}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr7);
        sb.append(((String) objArr7[0]).intern());
        String string = sb.toString();
        int i2 = IAuthTabCallback_Parcel + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private uploadPerfLog(RVPub rVPub, isTiny.onWarmupCompleted onwarmupcompleted, long j, Double d, List<isTiny.onWarmupCompleted> list, long j2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = rVPub;
        this.onExtraCallback = onwarmupcompleted;
        this.onNavigationEvent = j;
        this.asInterface = d;
        this.onWarmupCompleted = list;
        this.IAuthTabCallback = j2;
    }

    public final RVPub onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        RVPub rVPub = this.onExtraCallbackWithResult;
        int i5 = i3 + 101;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return rVPub;
        }
        throw null;
    }

    public final isTiny.onWarmupCompleted IAuthTabCallback() {
        isTiny.onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 119;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 == 0) {
            onwarmupcompleted = this.onExtraCallback;
            int i4 = 0 / 0;
        } else {
            onwarmupcompleted = this.onExtraCallback;
        }
        int i5 = i3 + 27;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return onwarmupcompleted;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        int i3 = 42 / 0;
        return this.onNavigationEvent;
    }

    public final Double onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 87;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Double d = this.asInterface;
        int i4 = i3 + 117;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return d;
    }

    public final List<isTiny.onWarmupCompleted> onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean asBinder() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 43;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (this.onExtraCallbackWithResult != null) {
            return false;
        }
        int i5 = i2 + 69;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onTransact;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 77 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", c, 0) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 73;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackDefault)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 76, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (IAuthTabCallbackStub) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                try {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 63 - View.resolveSizeAndState(0, 0, 0), 12213 - MotionEvent.axisFromString(""), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!asBinder) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 63 - View.resolveSize(0, 0), 12214 - View.MeasureSpec.getMode(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }
}
