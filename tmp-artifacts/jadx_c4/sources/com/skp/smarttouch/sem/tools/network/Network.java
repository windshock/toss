package com.skp.smarttouch.sem.tools.network;

import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.skp.smarttouch.sem.tools.LibraryFeatures;
import com.skt.usp.UCPApiConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Network {
    private static int IAuthTabCallback;
    private static WifiManager.WifiLock a;
    private static long onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {63, 67, 46, -88};
    private static final int $$b = 129;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = i * 3;
        int i4 = 4 - (s * 2);
        byte[] bArr = $$a;
        int i5 = s2 + 109;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            int i9 = 0;
            int i10 = (-i4) + i8;
            int i11 = i7 + 1;
            i2 = i9;
            i5 = i10;
            i4 = i11;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i7 = i4;
            i4 = bArr[i4];
            i8 = i12;
            int i102 = (-i4) + i8;
            int i112 = i7 + 1;
            i2 = i9;
            i5 = i102;
            i4 = i112;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        IAuthTabCallback = 0;
        IAuthTabCallback();
        int i = onExtraCallback + 11;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r8
      0x0033: PHI (r8v3 android.net.wifi.WifiManager) = (r8v2 android.net.wifi.WifiManager), (r8v17 android.net.wifi.WifiManager) binds: [B:8:0x0031, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getIpAddress(Context context) {
        WifiManager wifiManager;
        int i = 2 % 2;
        int i2 = asInterface + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            objArr[1] = ">> getIpAddress()";
            xkzzb.onExtraCallback(objArr);
            wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                if (wifiManager.isWifiEnabled()) {
                    if (wifiManager.getConnectionInfo() != null) {
                        try {
                            int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
                            return new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >>> 24)};
                        } catch (Exception unused) {
                        }
                    } else {
                        int i3 = asInterface + 55;
                        onTransact = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 7 / 0;
                        }
                        return null;
                    }
                }
            }
        } else {
            xkzzb.onExtraCallback(new Object[]{">> getIpAddress()"});
            wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
            }
        }
        int i5 = asInterface + 19;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static byte[] getMACAddress(Context context) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> getMACAddress"});
        byte[] bArr = new byte[6];
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!(!wifiManager.isWifiEnabled())) {
            String strReplace = wifiManager.getConnectionInfo().getMacAddress().replace(":", "").replace(".", "");
            if (strReplace.length() < 12) {
                return null;
            }
            for (int i4 = 0; i4 < 6; i4++) {
                int i5 = i4 << 1;
                bArr[i4] = (byte) Integer.parseInt(strReplace.substring(i5, i5 + 2), 16);
            }
            return bArr;
        }
        int i6 = onTransact + 119;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void b(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 103;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iBlue = Color.blue(i4) + 43;
                    int offsetBefore = 1451 - TextUtils.getOffsetBefore("", i4);
                    byte b = (byte) i4;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(scrollBarSize, iBlue, offsetBefore, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i4;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetAfter("", i4)), 44 - ((Process.getThreadPriority(i4) + 20) >> 6), TextUtils.getCapsMode("", i4, i4) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0) + 23973), 50 - KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45847), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.red(0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 83;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static String getServerMessage(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            xkzzb.onExtraCallback(new Object[]{">> getServerMessage()"});
        } else {
            xkzzb.onExtraCallback(new Object[]{">> getServerMessage()"});
        }
        String serverMessage = getServerMessage(str, null, null);
        int i3 = onTransact + 35;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return serverMessage;
    }

    public static String getServerMessage(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            xkzzb.onExtraCallback(new Object[]{">> getServerMessage()"});
        } else {
            xkzzb.onExtraCallback(new Object[]{">> getServerMessage()"});
        }
        String serverMessage = getServerMessage(str, str2, null);
        int i3 = asInterface + 51;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return serverMessage;
        }
        throw null;
    }

    public static String getServerMessage(String str, String str2, String str3) throws Throwable {
        int i;
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        xkzzb.onExtraCallback(new Object[]{">> getServerMessage()"});
        boolean z = !LibraryFeatures.isREAL_SERVER();
        boolean zEndsWith = str.endsWith(UCPApiConstants.ARAM_URL);
        if (!zEndsWith) {
            i = 10;
        } else {
            int i5 = asInterface + 91;
            onTransact = i5 % 128;
            i = i5 % 2 != 0 ? 18 : UCPApiConstants.ARAM_TIME_OUT;
        }
        xkzzb.onExtraCallback(new Object[]{">> isOtaUrl: %s, nTimeout: %s", Boolean.valueOf(zEndsWith), Integer.valueOf(i)});
        byte[] serverData = getServerData(str, str2, str3, i, z);
        xkzzb.onExtraCallback(new Object[]{">> getServerMessage - byteData[" + serverData + "]"});
        if (serverData == null && !zEndsWith) {
            xkzzb.IAuthTabCallback(new Object[]{">> Retry getServerMessage - byteData is null"});
            serverData = getServerData(str, str2, str3, i, z);
            xkzzb.IAuthTabCallback(new Object[]{">> Retry getServerMessage - byteData [" + serverData + "]"});
        }
        if (serverData == null) {
            return null;
        }
        try {
            return new String(serverData);
        } catch (Exception e) {
            xkzzb.onNavigationEvent(e);
            return null;
        }
    }

    public static boolean isAvailableInternet() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> isAvailableInternet()"});
        int i4 = asInterface + 35;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static boolean isNetworkEnabled(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> isNetworkEnabled()"});
        if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            int i4 = asInterface + 47;
            onTransact = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onTransact + 51;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[PHI: r1
      0x0042: PHI (r1v6 android.net.wifi.WifiInfo) = (r1v5 android.net.wifi.WifiInfo), (r1v9 android.net.wifi.WifiInfo) binds: [B:8:0x0040, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWifiEnabled(Context context) {
        WifiInfo connectionInfo;
        int i = 2 % 2;
        int i2 = onTransact + 95;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            objArr[1] = ">> isWifiEnabled()";
            xkzzb.onExtraCallback(objArr);
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            connectionInfo = wifiManager.getConnectionInfo();
            if (!wifiManager.isWifiEnabled()) {
                if (connectionInfo.getSSID() != null) {
                    return true;
                }
            }
        } else {
            xkzzb.onExtraCallback(new Object[]{">> isWifiEnabled()"});
            WifiManager wifiManager2 = (WifiManager) context.getSystemService("wifi");
            connectionInfo = wifiManager2.getConnectionInfo();
            if (wifiManager2.isWifiEnabled()) {
            }
        }
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return false;
    }

    public static void setWifiEnabled(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> setWifiEnabled()"});
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!z) {
            int i4 = onTransact + 59;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[4];
                objArr[0] = "++ bEnable=%d";
                objArr[0] = Boolean.valueOf(z);
                xkzzb.onExtraCallback(objArr);
                if (!wifiManager.isWifiEnabled()) {
                    return;
                }
            } else {
                xkzzb.onExtraCallback(new Object[]{"++ bEnable=%d", Boolean.valueOf(z)});
                if (!wifiManager.isWifiEnabled()) {
                    return;
                }
            }
            wifiManager.setWifiEnabled(false);
            return;
        }
        xkzzb.onExtraCallback(new Object[]{"++ bEnable=%d", Boolean.valueOf(z)});
        wifiManager.setWifiEnabled(true);
    }

    public static void setWifiLock(Context context) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> setWifiLock()"});
        if (a == null) {
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(context.toString());
            a = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.setReferenceCounted(true);
            a.acquire();
            return;
        }
        int i4 = onTransact + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static byte[] getServerData(String str, String str2, String str3, int i, boolean z) throws Throwable {
        InputStream inputStream;
        int i2 = 2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> getServerData()"});
        xkzzb.onExtraCallback(new Object[]{"++ strUrl : [%s]", str});
        xkzzb.onExtraCallback(new Object[]{"++ strRequestMsg : [%s]", str2});
        xkzzb.onExtraCallback(new Object[]{"++ method : [%s]", str3});
        xkzzb.onExtraCallback(new Object[]{"++ nTimeout : [%s]", Integer.valueOf(i)});
        xkzzb.onExtraCallback(new Object[]{"++ bTrustAll : [%s]", Boolean.valueOf(z)});
        byte[] bArr = new byte[10240];
        byte[] byteArray = null;
        try {
            URL url = new URL(str);
            String lowerCase = str.toLowerCase();
            Object[] objArr = new Object[1];
            b((char) View.combineMeasuredStates(0, 0), View.MeasureSpec.getMode(0), new char[]{19029, 41816, 49630, 64356, 19237, 10936, 29477, 5921}, new char[]{8315, 35675, 41639, 51379}, new char[]{12869, 53355, 41328, 41117}, objArr);
            if (lowerCase.indexOf(((String) objArr[0]).intern()) != 0) {
                return null;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            int i3 = i * 1000;
            httpsURLConnection.setConnectTimeout(i3);
            httpsURLConnection.setReadTimeout(i3);
            httpsURLConnection.setUseCaches(false);
            httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
            simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
            httpsURLConnection.setRequestProperty("Date", simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
            httpsURLConnection.setRequestProperty("Host", httpsURLConnection.getURL().getHost());
            if (str3 != null) {
                int i4 = onTransact + 115;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                httpsURLConnection.setRequestMethod(str3);
            }
            if (str2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2.getBytes().length);
                httpsURLConnection.setRequestProperty("Content-Length", sb.toString());
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.connect();
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                outputStream.write(str2.getBytes());
                outputStream.flush();
                outputStream.close();
                int i6 = onTransact + 87;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
            } else {
                httpsURLConnection.connect();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode != 200) {
                xkzzb.IAuthTabCallback(new Object[]{"Http Response error:%d (%s)", Integer.valueOf(responseCode), httpsURLConnection.getResponseMessage()});
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int contentLength = httpsURLConnection.getContentLength();
            if (contentLength < 0) {
                xkzzb.IAuthTabCallback(new Object[]{"Content-length is invalid"});
                while (true) {
                    int i8 = inputStream.read(bArr);
                    if (i8 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i8);
                }
                byteArrayOutputStream.flush();
            } else {
                xkzzb.IAuthTabCallback(new Object[]{"nSize = " + contentLength});
                int i9 = onTransact + 43;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 0;
                while (i11 < contentLength) {
                    int i12 = inputStream.read(bArr);
                    i11 += i12;
                    byteArrayOutputStream.write(bArr, 0, i12);
                }
                byteArrayOutputStream.flush();
            }
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            httpsURLConnection.disconnect();
            return byteArray;
        } catch (Exception unused) {
            return byteArray;
        }
    }

    public void setWifiUnlock() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        xkzzb.onExtraCallback(new Object[]{">> Network::setWifiUnlock()"});
        WifiManager.WifiLock wifiLock = a;
        if (wifiLock != null) {
            wifiLock.release();
            a = null;
        } else {
            int i4 = asInterface + 73;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = -6590544641391965312L;
        onWarmupCompleted = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
