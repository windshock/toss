package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.media.MediaDrm;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tnkfactory.ad.Logger;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DeviceManager {
    public static final DeviceManager INSTANCE = new DeviceManager();
    public static final UUID a = new UUID(-1301668207276963122L, -6645017420763422227L);

    public final Context getApplicationContext() {
        return TnkCore.INSTANCE.getAppResource().getApplicationContext();
    }

    public final String[] getNetworkOperator() {
        String str;
        String networkCountryIso;
        Exception e;
        TelephonyManager telephonyManager;
        String simOperatorName = "-";
        str = "";
        try {
            Object systemService = getApplicationContext().getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "");
            telephonyManager = (TelephonyManager) systemService;
            networkCountryIso = telephonyManager.getNetworkCountryIso();
        } catch (Exception e2) {
            networkCountryIso = str;
            e = e2;
        }
        try {
            str = Utils.isNull(networkCountryIso) ? "" : networkCountryIso;
            simOperatorName = telephonyManager.getSimOperatorName();
            if (Utils.isNull(simOperatorName)) {
                simOperatorName = telephonyManager.getNetworkOperatorName();
            }
            Logger.d("network country = " + str + ", " + simOperatorName);
        } catch (Exception e3) {
            e = e3;
            Logger.e("initalization failed : no network operator " + e);
            str = networkCountryIso;
            return new String[]{simOperatorName, str};
        }
        return new String[]{simOperatorName, str};
    }

    public final float[] getScreenResolution() {
        int i2;
        float f = 1.0f;
        float f2 = 320.0f;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = getApplicationContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 >= i3) {
                i2 = i3;
            }
            try {
                f = displayMetrics.density;
                f2 = i2 / f;
                Logger.d("screen resolution : " + i2 + " : " + f);
            } catch (Exception unused) {
                Logger.e("intialization failed : no screen resolution");
                return new float[]{i2, f, f2};
            }
        } catch (Exception unused2) {
            i2 = 0;
        }
        return new float[]{i2, f, f2};
    }

    public final boolean isWifiConnected() {
        try {
            Object systemService = getApplicationContext().getSystemService("wifi");
            Intrinsics.checkNotNull(systemService, "");
            WifiInfo connectionInfo = ((WifiManager) systemService).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getIpAddress() != 0;
            }
            Logger.d("no wifi connection info");
            return false;
        } catch (Exception e) {
            Logger.e("isWifiConnected error : " + e);
            return false;
        }
    }

    public final String[] getWidevineInfo() {
        String string;
        MediaDrm mediaDrm;
        String propertyString = null;
        try {
            mediaDrm = new MediaDrm(a);
            byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
            Intrinsics.checkNotNullExpressionValue(propertyByteArray, "");
            String strEncodeToString = Base64.encodeToString(propertyByteArray, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            int length = strEncodeToString.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = Intrinsics.compare(strEncodeToString.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            string = strEncodeToString.subSequence(i2, length + 1).toString();
        } catch (Throwable unused) {
            string = null;
        }
        try {
            propertyString = mediaDrm.getPropertyString("securityLevel");
            if (Build.VERSION.SDK_INT >= 28) {
                mediaDrm.release();
            } else {
                mediaDrm.release();
            }
        } catch (Throwable unused2) {
            Logger.d("no wdvn..");
            return new String[]{string, propertyString};
        }
        return new String[]{string, propertyString};
    }
}
