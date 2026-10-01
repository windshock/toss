package com.google.android.exoplayer2.util;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NetworkTypeObserver$Api31$DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final NetworkTypeObserver instance;

    public NetworkTypeObserver$Api31$DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
        this.instance = networkTypeObserver;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        NetworkTypeObserver.access$200(this.instance, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
