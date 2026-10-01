package com.iap.ac.android.common.utils;

import com.iap.ac.android.common.utils.NetworkUtils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class NetworkUtils$NetworkSwitchListener implements NetworkUtils.NetworkStateListener {
    public abstract void onInvalid2Mobile();

    public abstract void onInvalid2Wifi();

    public abstract void onMobile2Invalid();

    public abstract void onMobile2Wifi();

    public final void onNetworkChanged(int i, int i2) {
        if (i == 0) {
            if (NetworkUtils.isMobileNetwork(i2)) {
                onInvalid2Mobile();
                return;
            } else {
                if (NetworkUtils.isWiFiMobileNetwork(i2)) {
                    onInvalid2Wifi();
                    return;
                }
                return;
            }
        }
        if (NetworkUtils.isMobileNetwork(i)) {
            if (i2 == 0) {
                onMobile2Invalid();
                return;
            } else {
                if (NetworkUtils.isWiFiMobileNetwork(i2)) {
                    onMobile2Wifi();
                    return;
                }
                return;
            }
        }
        if (NetworkUtils.isWiFiMobileNetwork(i)) {
            if (i2 == 0) {
                onWifi2Invalid();
            } else if (NetworkUtils.isMobileNetwork(i2)) {
                onWifi2Mobile();
            }
        }
    }

    public abstract void onWifi2Invalid();

    public abstract void onWifi2Mobile();
}
