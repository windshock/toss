package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ah {
    private static final byte[] $$a = {15, 58, -59};
    private static final int $$b = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onNavigationEvent = {60900, 15169};
    private static long onExtraCallback = 816321983017830636L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s + 3;
        int i4 = i * 4;
        int i5 = (s2 * 4) + 97;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i2 = i3;
            int i7 = i4;
            i3 += -i7;
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i2];
            i3 += -i7;
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i4) {
            }
        } else {
            i2 = i3;
            i3 = i5;
            i6++;
            bArr2[i6] = (byte) i3;
            i2++;
            if (i6 == i4) {
            }
        }
    }

    private static void a(LinkProperties linkProperties, JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        for (InetAddress inetAddress : linkProperties.getDnsServers()) {
            if (inetAddress != null) {
                int i6 = IAuthTabCallback + 13;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    jSONArray.put(inetAddress.getHostAddress());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                jSONArray.put(inetAddress.getHostAddress());
            }
        }
    }

    public static String[] a(Context context) {
        Network[] allNetworks;
        NetworkInfo networkInfo;
        int i = 2 % 2;
        String[] strArr = new String[5];
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            JSONArray jSONArray5 = new JSONArray();
            int length = allNetworks.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = IAuthTabCallback + 67;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    Network network = allNetworks[i2];
                    obj.hashCode();
                    throw null;
                }
                Network network2 = allNetworks[i2];
                if (network2 != null && (networkInfo = connectivityManager.getNetworkInfo(network2)) != null) {
                    int i4 = IAuthTabCallback + 77;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object obj2 = null;
                        networkInfo.getState();
                        NetworkInfo.State state = NetworkInfo.State.CONNECTED;
                        obj2.hashCode();
                        throw null;
                    }
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                        int i5 = IAuthTabCallback + 85;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(network2);
                        if (linkProperties != null) {
                            int i7 = onWarmupCompleted + 39;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            int type = networkInfo.getType();
                            if (type == 0 || type == 1) {
                                a(linkProperties, jSONArray5);
                                if (type == 0) {
                                    int i9 = onWarmupCompleted + 51;
                                    IAuthTabCallback = i9 % 128;
                                    int i10 = i9 % 2;
                                    c(linkProperties, jSONArray);
                                    b(linkProperties, jSONArray2);
                                    if (i10 == 0) {
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                } else {
                                    c(linkProperties, jSONArray3);
                                    b(linkProperties, jSONArray4);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            strArr[0] = jSONArray3.toString();
            strArr[1] = jSONArray4.toString();
            strArr[2] = jSONArray.toString();
            strArr[3] = jSONArray2.toString();
            strArr[4] = jSONArray5.toString();
        }
        return strArr;
    }

    public static String b(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            context.getResources().getConfiguration();
            throw null;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration != null) {
            return configuration.mcc + String.valueOf(configuration.mnc);
        }
        int i3 = onWarmupCompleted + 111;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
        return "!error!";
    }

    private static void b(LinkProperties linkProperties, JSONArray jSONArray) {
        InetAddress gateway;
        int i = 2 % 2;
        Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                it.next();
                throw null;
            }
            RouteInfo next = it.next();
            if (next != null && next.isDefaultRoute() && (gateway = next.getGateway()) != null && (!(gateway instanceof Inet6Address) || !"::".equals(gateway.getHostAddress()))) {
                jSONArray.put(gateway.getHostAddress());
            }
        }
    }

    public static String c(Context context) throws Throwable {
        int i = 2 % 2;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        Object[] objArr = new Object[1];
        d((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, -ImageFormat.getBitsPerPixel(0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (wifiManager == null) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            d(TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String string = sb.toString();
            int i2 = onWarmupCompleted + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return string;
        }
        StringBuilder sb2 = new StringBuilder();
        if (wifiManager.isWifiEnabled()) {
            Object[] objArr3 = new Object[1];
            d(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 1, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54947), objArr3);
            strIntern = ((String) objArr3[0]).intern();
        }
        sb2.append(strIntern);
        String string2 = sb2.toString();
        int i4 = IAuthTabCallback + 93;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return string2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(LinkProperties linkProperties, JSONArray jSONArray) {
        LinkAddress next;
        int i = 2 % 2;
        Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
        while (it.hasNext()) {
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                next = it.next();
                int i3 = 98 / 0;
                if (next != null) {
                    int i4 = onWarmupCompleted + 31;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    if (next.getAddress() == null) {
                        int i6 = onWarmupCompleted + 37;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            next.getAddress().isLoopbackAddress();
                            throw null;
                        }
                        if (!next.getAddress().isLoopbackAddress()) {
                            jSONArray.put(next.getAddress().getHostAddress());
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                next = it.next();
                if (next != null) {
                    int i42 = onWarmupCompleted + 31;
                    IAuthTabCallback = i42 % 128;
                    int i52 = i42 % 2;
                    if (next.getAddress() == null) {
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = 49123;
            i4 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myPid() >> 22) + 59697), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 10973 - (ViewConfiguration.getScrollBarSize() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 31 - TextUtils.getCapsMode("", 0, 0), 20219 - TextUtils.lastIndexOf("", '0'), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore("", 0)), 43 - Process.getGidForName(""), 1494 - Color.red(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $11 + 25;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i9 = $10 + 95;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (i3 - View.resolveSizeAndState(0, 0, 0)), View.resolveSizeAndState(0, 0, 0) + 44, 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i11 = $11 + 73;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            i3 = 49123;
            i4 = -1401950695;
        }
        objArr[0] = new String(cArr);
    }
}
