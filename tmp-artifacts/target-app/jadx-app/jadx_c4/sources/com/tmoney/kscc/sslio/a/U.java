package com.tmoney.kscc.sslio.a;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class U {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 42146;
    private static int asInterface = 1;
    private static char onExtraCallback = 58832;
    private static char onExtraCallbackWithResult = 53331;
    private static char onNavigationEvent = 4838;
    private static int onWarmupCompleted;
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private boolean j;

    public U() {
    }

    public U(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.a = bArr2;
        this.b = new byte[1];
        this.c = new byte[4];
        this.d = new byte[1];
        this.e = new byte[8];
        this.f = new byte[4];
        this.g = new byte[8];
        this.h = new byte[4];
        byte[] bArr3 = new byte[2];
        this.i = bArr3;
        this.j = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 33) {
                int i = onWarmupCompleted + 35;
                asInterface = i % 128;
                int i2 = i % 2;
                System.arraycopy(bArr, 0, bArr2, 0, 1);
                System.arraycopy(bArr, 1, this.b, 0, 1);
                System.arraycopy(bArr, 2, this.c, 0, 4);
                System.arraycopy(bArr, 6, this.d, 0, 1);
                System.arraycopy(bArr, 7, this.e, 0, 8);
                System.arraycopy(bArr, 15, this.f, 0, 4);
                System.arraycopy(bArr, 19, this.g, 0, 8);
                System.arraycopy(bArr, 27, this.h, 0, 4);
                System.arraycopy(bArr, 31, this.i, 0, 2);
                byte[] bArr4 = this.i;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    int i3 = asInterface;
                    int i4 = i3 + 57;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    this.j = true;
                    int i6 = i3 + 61;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 3 / 2;
                    } else {
                        int i8 = 2 % 2;
                    }
                }
            }
        }
    }

    public static OkHttpClient client() {
        int i = 2 % 2;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(10L, timeUnit).readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).retryOnConnectionFailure(false).build();
        int i2 = asInterface + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return okHttpClientBuild;
    }

    public static InterfaceC0047h create() throws Throwable {
        int i = 2 % 2;
        Retrofit.Builder builder = new Retrofit.Builder();
        Object[] objArr = new Object[1];
        k(new char[]{9532, 9717, 46369, 27055, 5829, 58498, 31796, 17989, 5418, 24910, 17148, 63541, 8024, 31931, 45515, 23227, 22248, 22529, '4', 33551, 37856, 19782, 42078, 34995, 60207, 29744, 52005, 8810, 44553, 54046, 42397, 22093, 65245, 38409, 44938, 42236, 14206, 24369}, 38 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        InterfaceC0047h interfaceC0047h = (InterfaceC0047h) builder.IAuthTabCallback(((String) objArr[0]).intern()).onExtraCallbackWithResult(client()).IAuthTabCallback().onNavigationEvent(InterfaceC0047h.class);
        int i2 = asInterface + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return interfaceC0047h;
    }

    public int getBalance() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        int i3 = i2 % 128;
        asInterface = i3;
        try {
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!this.j) {
                return -1;
            }
            int i4 = i3 + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return NumberUtil.parseInt(this.c);
        } catch (Exception unused) {
            return -1;
        }
    }

    public String getSW() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        byte[] bArr = this.i;
        if (bArr == null) {
            return "NONE";
        }
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        if (bArr.length != 2) {
            return "NONE";
        }
        int i7 = i3 + 97;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public boolean isbResData() {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void k(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 53;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                        int iResolveOpacity = 12434 - Drawable.resolveOpacity(0, 0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, longPressTimeout, iResolveOpacity, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i10 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i10 + 1;
                    int i11 = $10 + 101;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getEdgeSlop() >> 16)), 13 - TextUtils.lastIndexOf("", '0', 0), 19900 - TextUtils.lastIndexOf("", '0', 0, 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
