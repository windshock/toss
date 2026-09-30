package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import o.IABLandingPageActivity5;
import o.IABLandingPageActivity9;
import o.IABLandingPageActivityzb;
import o.TTAppOpenAdActivity2;
import o.TTAppOpenAdActivity5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PendingIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        IABLandingPageActivity9.onExtraCallback onextracallbackOnNavigationEvent;
        if (context == null || intent == null || (pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT")) == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
        ScanSettings scanSettings = (ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
        if (parcelableArrayListExtra == null || scanSettings == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING", true);
        boolean booleanExtra2 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING", true);
        boolean booleanExtra3 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES", true);
        long longExtra = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT", 10000L);
        long longExtra2 = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL", 10000L);
        int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE", 1);
        int intExtra2 = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES", 3);
        IABLandingPageActivity9 iABLandingPageActivity9OnNavigationEvent = IABLandingPageActivity5.onNavigationEvent();
        IABLandingPageActivity9 iABLandingPageActivity9 = iABLandingPageActivity9OnNavigationEvent;
        ArrayList arrayListOnExtraCallback = iABLandingPageActivity9.onExtraCallback(parcelableArrayListExtra);
        TTAppOpenAdActivity5 tTAppOpenAdActivity5IAuthTabCallback = iABLandingPageActivity9.IAuthTabCallback(scanSettings, booleanExtra, booleanExtra2, booleanExtra3, longExtra, longExtra2, intExtra, intExtra2);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (iABLandingPageActivity9OnNavigationEvent) {
            try {
                onextracallbackOnNavigationEvent = iABLandingPageActivity9.onNavigationEvent(pendingIntent);
                if (onextracallbackOnNavigationEvent == null) {
                    IABLandingPageActivity9.onExtraCallback onextracallback = new IABLandingPageActivity9.onExtraCallback(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, arrayListOnExtraCallback, tTAppOpenAdActivity5IAuthTabCallback, new IABLandingPageActivityzb(pendingIntent, tTAppOpenAdActivity5IAuthTabCallback));
                    iABLandingPageActivity9.onNavigationEvent(pendingIntent, onextracallback);
                    onextracallbackOnNavigationEvent = onextracallback;
                }
            } catch (IllegalStateException unused) {
                return;
            }
        }
        onextracallbackOnNavigationEvent.onExtraCallback.onWarmupCompleted(context);
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
        if (parcelableArrayListExtra2 != null) {
            ArrayList arrayListIAuthTabCallback = iABLandingPageActivity9.IAuthTabCallback(parcelableArrayListExtra2);
            if (tTAppOpenAdActivity5IAuthTabCallback.access100() > 0) {
                onextracallbackOnNavigationEvent.IAuthTabCallback(arrayListIAuthTabCallback);
            } else if (!arrayListIAuthTabCallback.isEmpty()) {
                onextracallbackOnNavigationEvent.onExtraCallback(intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1), (TTAppOpenAdActivity2) arrayListIAuthTabCallback.get(0));
            }
        } else {
            int intExtra3 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
            if (intExtra3 != 0) {
                onextracallbackOnNavigationEvent.IAuthTabCallback(intExtra3);
            }
        }
        onextracallbackOnNavigationEvent.onExtraCallback.onWarmupCompleted((Context) null);
    }
}
