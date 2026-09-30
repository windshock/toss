package com.google.firebase.internal;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class InternalTokenResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 33861;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 19884;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 33237;
    private static char onWarmupCompleted = 6257;
    private String zza;

    public InternalTokenResult(@Nullable String str) {
        this.zza = str;
    }

    public String getToken() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        String str = this.zza;
        int i6 = i4 + 71;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Objects.hashCode(new Object[]{this.zza});
        int i5 = IAuthTabCallbackDefault + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() throws Throwable {
        Objects.ToStringHelper stringHelper;
        Object obj;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            stringHelper = Objects.toStringHelper(this);
            Object[] objArr = new Object[1];
            a(new char[]{63755, 36561, 25509, 31932, 31303, 55184}, 4 - ImageFormat.getBitsPerPixel(0), objArr);
            obj = objArr[0];
        } else {
            stringHelper = Objects.toStringHelper(this);
            Object[] objArr2 = new Object[1];
            a(new char[]{63755, 36561, 25509, 31932, 31303, 55184}, 4 - ImageFormat.getBitsPerPixel(0), objArr2);
            obj = objArr2[0];
        }
        String string = stringHelper.add(((String) obj).intern(), this.zza).toString();
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return string;
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            boolean z = obj instanceof InternalTokenResult;
            throw null;
        }
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        boolean zEqual = Objects.equal(this.zza, ((InternalTokenResult) obj).zza);
        int i4 = IAuthTabCallbackDefault + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zEqual;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 115;
            $11 = i6 % 128;
            int i7 = 58224;
            char c = 1;
            if (i6 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = 1;
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i5;
            }
            while (i3 < 16) {
                int i8 = $10 + 55;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i5];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                        int jumpTapTimeout = 12434 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(threadPriority, iNormalizeMetaState, jumpTapTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 10 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i3++;
                    cArr3 = cArr4;
                    i5 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16014), 13 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
