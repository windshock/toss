package com.skt.usp.tools.network;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.skt.usp.tools.UCPLibraryFeatures;
import com.skt.usp.utils.UCPLog;
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
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Network {
    private static WifiManager.WifiLock a;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {4, -66, -36, 8};
    private static final int $$b = 81;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4 = i2 * 2;
        int i5 = (b * 3) + 105;
        byte[] bArr = $$a;
        int i6 = i + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i6;
            int i9 = i7;
            int i10 = 0;
            int i11 = i6 + i9;
            i3 = i10;
            int i12 = i8;
            i5 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i6 + 1;
            int i14 = i5;
            i8 = i13;
            i6 = bArr[i13];
            i9 = i14;
            int i112 = i6 + i9;
            i3 = i10;
            int i122 = i8;
            i5 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        int i = onNavigationEvent + 25;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static byte[] getIpAddress(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> getIpAddress()");
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            int i4 = IAuthTabCallback + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                if (wifiManager.getConnectionInfo() != null) {
                    try {
                        int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
                        return new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >>> 24)};
                    } catch (Exception unused) {
                    }
                } else {
                    int i5 = IAuthTabCallback + 3;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return null;
                }
            } else {
                wifiManager.getConnectionInfo();
                throw null;
            }
        }
        return null;
    }

    public static byte[] getMACAddress(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> getMACAddress");
        byte[] bArr = new byte[6];
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (!wifiManager.isWifiEnabled()) {
            return null;
        }
        String strReplace = wifiManager.getConnectionInfo().getMacAddress().replace(":", "").replace(".", "");
        if (strReplace.length() < 12) {
            int i4 = onExtraCallback + 113;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return null;
        }
        int i6 = onExtraCallback + 53;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = i8 << 1;
            bArr[i8] = (byte) Integer.parseInt(strReplace.substring(i9, i9 + 2), 16);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 35125), 22 - TextUtils.indexOf((CharSequence) "", '0', 0), 10278 - KeyEvent.normalizeMetaState(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 12795), 55 - View.combineMeasuredStates(0, 0), Drawable.resolveOpacity(0, 0) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 69;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i10 = $10 + 71;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[i / simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12842), 55 - (Process.myPid() >> 22), Color.rgb(0, 0, 0) + 16779383, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.MeasureSpec.getMode(0)), View.MeasureSpec.getSize(0) + 55, 2167 - (ViewConfiguration.getEdgeSlop() >> 16), 1298711993, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static String getServerMessage(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> getServerMessage()");
        String serverMessage = getServerMessage(str, null, null);
        int i4 = onExtraCallback + 109;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return serverMessage;
    }

    public static String getServerMessage(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = ">> getServerMessage()";
            UCPLog.info(objArr);
        } else {
            UCPLog.info(">> getServerMessage()");
        }
        String serverMessage = getServerMessage(str, str2, null);
        int i3 = onExtraCallback + 5;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return serverMessage;
        }
        throw null;
    }

    public static String getServerMessage(String str, String str2, String str3) throws Throwable {
        int i;
        int i2 = 2 % 2;
        UCPLog.info(">> getServerMessage()");
        boolean z = true;
        boolean z2 = !UCPLibraryFeatures.isREAL_SERVER();
        if (!str.endsWith(UCPApiConstants.ARAM_URL)) {
            int i3 = IAuthTabCallback + 109;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (str.endsWith(UCPApiConstants.REQ_EFREFRESH_URL)) {
                int i5 = onExtraCallback + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z = false;
            }
        }
        if (z) {
            int i7 = IAuthTabCallback + 51;
            onExtraCallback = i7 % 128;
            i = i7 % 2 == 0 ? 8 : UCPApiConstants.ARAM_TIME_OUT;
        } else {
            i = 10;
        }
        UCPLog.debug(">> isOtaUrl: [%s], nTimeout: [%s]", Boolean.valueOf(z), Integer.valueOf(i));
        byte[] serverData = getServerData(str, str2, str3, i, z2);
        UCPLog.debug(">> getServerMessage - byteData[" + serverData + "]");
        if (serverData == null && !z) {
            UCPLog.warning(">> Retry getServerMessage - byteData is null");
            serverData = getServerData(str, str2, str3, 10, z2);
            UCPLog.warning(">> Retry getServerMessage - byteData [" + serverData + "]");
            int i8 = onExtraCallback + 55;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        if (serverData == null) {
            return null;
        }
        try {
            return new String(serverData);
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            return null;
        }
    }

    public static boolean isAvailableInternet() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            UCPLog.debug(">> isAvailableInternet()");
        } else {
            UCPLog.debug(">> isAvailableInternet()");
        }
        int i3 = onExtraCallback + 117;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        if (((android.net.ConnectivityManager) r6.getSystemService("connectivity")).getActiveNetworkInfo() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (((android.net.ConnectivityManager) r6.getSystemService("connectivity")).getActiveNetworkInfo() == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r6 = com.skt.usp.tools.network.Network.onExtraCallback + 27;
        com.skt.usp.tools.network.Network.IAuthTabCallback = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isNetworkEnabled(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = ">> isNetworkEnabled()";
            UCPLog.info(objArr);
        } else {
            UCPLog.info(">> isNetworkEnabled()");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r1
      0x0043: PHI (r1v6 android.net.wifi.WifiInfo) = (r1v5 android.net.wifi.WifiInfo), (r1v10 android.net.wifi.WifiInfo) binds: [B:8:0x0041, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWifiEnabled(Context context) {
        WifiInfo connectionInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = ">> isWifiEnabled()";
            UCPLog.info(objArr);
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            connectionInfo = wifiManager.getConnectionInfo();
            if (!wifiManager.isWifiEnabled()) {
                if (connectionInfo.getSSID() != null) {
                    int i3 = IAuthTabCallback + 11;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
            }
        } else {
            UCPLog.info(">> isWifiEnabled()");
            WifiManager wifiManager2 = (WifiManager) context.getSystemService("wifi");
            connectionInfo = wifiManager2.getConnectionInfo();
            if (wifiManager2.isWifiEnabled()) {
            }
        }
        int i5 = IAuthTabCallback + 71;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static void setWifiEnabled(Context context, boolean z) {
        int i = 2 % 2;
        UCPLog.info(">> setWifiEnabled()");
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (z) {
            UCPLog.debug("++ bEnable=%d", Boolean.valueOf(z));
            wifiManager.setWifiEnabled(true);
            return;
        }
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.debug("++ bEnable=%d", Boolean.valueOf(z));
        if (!(!wifiManager.isWifiEnabled())) {
            int i4 = onExtraCallback + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            wifiManager.setWifiEnabled(false);
        }
        int i6 = IAuthTabCallback + 89;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r5 = ((android.net.wifi.WifiManager) r5.getSystemService("wifi")).createWifiLock(r5.toString());
        com.skt.usp.tools.network.Network.a = r5;
        r5.setReferenceCounted(true);
        com.skt.usp.tools.network.Network.a.acquire();
        r5 = com.skt.usp.tools.network.Network.onExtraCallback + 45;
        com.skt.usp.tools.network.Network.IAuthTabCallback = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (com.skt.usp.tools.network.Network.a != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (com.skt.usp.tools.network.Network.a != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r5 = com.skt.usp.tools.network.Network.onExtraCallback + 99;
        com.skt.usp.tools.network.Network.IAuthTabCallback = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setWifiLock(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[0];
            objArr[1] = ">> setWifiLock()";
            UCPLog.info(objArr);
        } else {
            UCPLog.info(">> setWifiLock()");
        }
    }

    public static byte[] getServerData(String str, String str2, String str3, int i, boolean z) throws Throwable {
        InputStream inputStream;
        int i2 = 2 % 2;
        UCPLog.info(">> getServerData()");
        UCPLog.debug("++ strUrl : [%s]", str);
        UCPLog.debug("++ strRequestMsg : [%s]", str2);
        UCPLog.debug("++ method : [%s]", str3);
        UCPLog.debug("++ nTimeout : [%s]", Integer.valueOf(i));
        UCPLog.debug("++ bTrustAll : [%s]", Boolean.valueOf(z));
        byte[] bArr = new byte[10240];
        try {
            URL url = new URL(str);
            String lowerCase = str.toLowerCase();
            Object[] objArr = new Object[1];
            b(8 - ExpandableListView.getPackedPositionGroup(0L), 2 - View.resolveSize(0, 0), new char[]{65494, 65494, 15, 27, 27, 23, 26, 65505}, false, View.getDefaultSize(0, 0) + 208, objArr);
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
                httpsURLConnection.setRequestMethod(str3);
            }
            if (str2 != null) {
                httpsURLConnection.setRequestProperty("Content-Length", String.valueOf(str2.getBytes().length));
                httpsURLConnection.setDoOutput(true);
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(str2.getBytes());
                    outputStream.flush();
                    outputStream.close();
                    int i4 = onExtraCallback + 49;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                } finally {
                }
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode != 200) {
                UCPLog.error("Http Response error: [%s] , ResMsg : [%s]", Integer.valueOf(responseCode), httpsURLConnection.getResponseMessage());
                inputStream = httpsURLConnection.getErrorStream();
            } else {
                inputStream = httpsURLConnection.getInputStream();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int contentLength = httpsURLConnection.getContentLength();
            if (contentLength >= 0) {
                UCPLog.info("nSize = " + contentLength);
                int i6 = 0;
                while (i6 < contentLength) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    i6 += i7;
                    byteArrayOutputStream.write(bArr, 0, i7);
                }
                byteArrayOutputStream.flush();
            } else {
                int i8 = onExtraCallback + 113;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    Object[] objArr2 = new Object[0];
                    objArr2[1] = "Content-length is invalid";
                    UCPLog.warning(objArr2);
                } else {
                    UCPLog.warning("Content-length is invalid");
                }
                while (true) {
                    int i9 = inputStream.read(bArr);
                    if (i9 == -1) {
                        break;
                    }
                    int i10 = IAuthTabCallback + 31;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        byteArrayOutputStream.write(bArr, 1, i9);
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i9);
                    }
                    int i11 = IAuthTabCallback + 29;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                }
                byteArrayOutputStream.flush();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            httpsURLConnection.disconnect();
            return byteArray;
        } catch (Exception e) {
            UCPLog.error(e.getMessage());
            return ("server connection error:" + e.getMessage()).getBytes();
        }
    }

    public void setWifiUnlock() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UCPLog.info(">> Network::setWifiUnlock()");
        WifiManager.WifiLock wifiLock = a;
        if (wifiLock != null) {
            wifiLock.release();
            a = null;
            return;
        }
        int i4 = onExtraCallback + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478308958;
    }
}
