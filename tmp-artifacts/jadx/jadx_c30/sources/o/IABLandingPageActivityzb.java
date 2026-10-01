package o;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class IABLandingPageActivityzb extends onScrollChange {
    private final long IAuthTabCallback;
    private Context onExtraCallback;
    private final PendingIntent onExtraCallbackWithResult;
    private Context onNavigationEvent;
    private long onWarmupCompleted;

    public IABLandingPageActivityzb(@NonNull PendingIntent pendingIntent, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5) {
        this.onExtraCallbackWithResult = pendingIntent;
        this.IAuthTabCallback = tTAppOpenAdActivity5.access100();
    }

    IABLandingPageActivityzb(@NonNull PendingIntent pendingIntent, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull Service service) {
        this.onExtraCallbackWithResult = pendingIntent;
        this.IAuthTabCallback = tTAppOpenAdActivity5.access100();
        this.onNavigationEvent = service;
    }

    public void onWarmupCompleted(@Nullable Context context) {
        this.onExtraCallback = context;
    }

    public void onWarmupCompleted(int i, @NonNull TTAppOpenAdActivity2 tTAppOpenAdActivity2) throws PendingIntent.CanceledException {
        Context context = this.onExtraCallback;
        if (context == null) {
            context = this.onNavigationEvent;
        }
        if (context != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", i);
                intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(Collections.singletonList(tTAppOpenAdActivity2)));
                this.onExtraCallbackWithResult.send(context, 0, intent);
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }

    public void onWarmupCompleted(@NonNull List<TTAppOpenAdActivity2> list) throws PendingIntent.CanceledException {
        Context context = this.onExtraCallback;
        if (context == null) {
            context = this.onNavigationEvent;
        }
        if (context != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.onWarmupCompleted <= (jElapsedRealtime - this.IAuthTabCallback) + 5) {
                this.onWarmupCompleted = jElapsedRealtime;
                try {
                    Intent intent = new Intent();
                    intent.putExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1);
                    intent.putParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT", new ArrayList<>(list));
                    intent.setExtrasClassLoader(TTAppOpenAdActivity2.class.getClassLoader());
                    this.onExtraCallbackWithResult.send(context, 0, intent);
                } catch (PendingIntent.CanceledException unused) {
                }
            }
        }
    }

    public void onExtraCallback(int i) throws PendingIntent.CanceledException {
        Context context = this.onExtraCallback;
        if (context == null) {
            context = this.onNavigationEvent;
        }
        if (context != null) {
            try {
                Intent intent = new Intent();
                intent.putExtra("android.bluetooth.le.extra.ERROR_CODE", i);
                this.onExtraCallbackWithResult.send(context, 0, intent);
            } catch (PendingIntent.CanceledException unused) {
            }
        }
    }
}
