package o;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.TTAppOpenAdActivity5;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTAppOpenAdActivity1 extends Service {
    private HashMap<Integer, onScrollChange> IAuthTabCallback;
    private Handler onNavigationEvent;
    private final Object onWarmupCompleted = new Object();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.IAuthTabCallback = new HashMap<>();
        this.onNavigationEvent = new Handler();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean zContainsKey;
        boolean zIsEmpty;
        if (intent != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT");
            int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.REQUEST_CODE", 0);
            boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_START", false);
            if (pendingIntent == null) {
                synchronized (this.onWarmupCompleted) {
                    zIsEmpty = this.IAuthTabCallback.isEmpty();
                }
                if (zIsEmpty) {
                    stopSelf();
                }
                return 2;
            }
            synchronized (this.onWarmupCompleted) {
                zContainsKey = this.IAuthTabCallback.containsKey(Integer.valueOf(intExtra));
            }
            if (booleanExtra && !zContainsKey) {
                List<TTAppOpenAdActivity> parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
                TTAppOpenAdActivity5 tTAppOpenAdActivity5OnExtraCallback = (TTAppOpenAdActivity5) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = Collections.EMPTY_LIST;
                }
                if (tTAppOpenAdActivity5OnExtraCallback == null) {
                    tTAppOpenAdActivity5OnExtraCallback = new TTAppOpenAdActivity5.onNavigationEvent().onExtraCallback();
                }
                onNavigationEvent(parcelableArrayListExtra, tTAppOpenAdActivity5OnExtraCallback, pendingIntent, intExtra);
            } else if (!booleanExtra && zContainsKey) {
                onExtraCallbackWithResult(intExtra);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IABLandingPageActivity5 iABLandingPageActivity5OnNavigationEvent = IABLandingPageActivity5.onNavigationEvent();
        Iterator<onScrollChange> it = this.IAuthTabCallback.values().iterator();
        while (it.hasNext()) {
            try {
                iABLandingPageActivity5OnNavigationEvent.onWarmupCompleted(it.next());
            } catch (Exception unused) {
            }
        }
        this.IAuthTabCallback.clear();
        this.IAuthTabCallback = null;
        this.onNavigationEvent = null;
        super.onDestroy();
    }

    private void onNavigationEvent(@NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull PendingIntent pendingIntent, int i) {
        IABLandingPageActivityzb iABLandingPageActivityzb = new IABLandingPageActivityzb(pendingIntent, tTAppOpenAdActivity5, this);
        synchronized (this.onWarmupCompleted) {
            this.IAuthTabCallback.put(Integer.valueOf(i), iABLandingPageActivityzb);
        }
        try {
            IABLandingPageActivity5.onNavigationEvent().onWarmupCompleted(list, tTAppOpenAdActivity5, iABLandingPageActivityzb, this.onNavigationEvent);
        } catch (Exception unused) {
        }
    }

    private void onExtraCallbackWithResult(int i) {
        onScrollChange onscrollchangeRemove;
        boolean zIsEmpty;
        synchronized (this.onWarmupCompleted) {
            onscrollchangeRemove = this.IAuthTabCallback.remove(Integer.valueOf(i));
            zIsEmpty = this.IAuthTabCallback.isEmpty();
        }
        if (onscrollchangeRemove != null) {
            try {
                IABLandingPageActivity5.onNavigationEvent().onWarmupCompleted(onscrollchangeRemove);
            } catch (Exception unused) {
            }
            if (zIsEmpty) {
                stopSelf();
            }
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
