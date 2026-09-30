package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.IABLandingPageActivity5;
import o.TTAppOpenAdActivity5;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class IABLandingPageActivity5 {
    private static IABLandingPageActivity5 onWarmupCompleted;

    abstract void onExtraCallbackWithResult(@NonNull onScrollChange onscrollchange);

    abstract void onWarmupCompleted(@NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange, @NonNull Handler handler);

    public static IABLandingPageActivity5 onNavigationEvent() {
        synchronized (IABLandingPageActivity5.class) {
            IABLandingPageActivity5 iABLandingPageActivity5 = onWarmupCompleted;
            if (iABLandingPageActivity5 != null) {
                return iABLandingPageActivity5;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                IABLandingPageActivity9 iABLandingPageActivity9 = new IABLandingPageActivity9();
                onWarmupCompleted = iABLandingPageActivity9;
                return iABLandingPageActivity9;
            }
            IABLandingPageActivity7 iABLandingPageActivity7 = new IABLandingPageActivity7();
            onWarmupCompleted = iABLandingPageActivity7;
            return iABLandingPageActivity7;
        }
    }

    IABLandingPageActivity5() {
    }

    public final void onNavigationEvent(@Nullable List<TTAppOpenAdActivity> list, @Nullable TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange) {
        if (onscrollchange == null) {
            throw new IllegalArgumentException("callback is null");
        }
        Handler handler = new Handler(Looper.getMainLooper());
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        if (tTAppOpenAdActivity5 == null) {
            tTAppOpenAdActivity5 = new TTAppOpenAdActivity5.onNavigationEvent().onExtraCallback();
        }
        onWarmupCompleted(list, tTAppOpenAdActivity5, onscrollchange, handler);
    }

    public final void onWarmupCompleted(@NonNull onScrollChange onscrollchange) {
        if (onscrollchange == null) {
            throw new IllegalArgumentException("callback is null");
        }
        onExtraCallbackWithResult(onscrollchange);
    }

    public static class onExtraCallback {
        final TTAppOpenAdActivity5 IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private final boolean asBinder;
        final List<TTAppOpenAdActivity> onExtraCallbackWithResult;
        final onScrollChange onNavigationEvent;
        private final boolean onTransact;
        final Handler onWarmupCompleted;
        private final Object onExtraCallback = new Object();
        private final List<TTAppOpenAdActivity2> access100 = new ArrayList();
        private final Set<String> asInterface = new HashSet();
        private final Map<String, TTAppOpenAdActivity2> IAuthTabCallbackStub = new HashMap();
        private final Runnable getInterfaceDescriptor = new AnonymousClass4();
        private boolean IAuthTabCallbackStubProxy = false;

        /* renamed from: o.IABLandingPageActivity5$onExtraCallback$4, reason: invalid class name */
        public class AnonymousClass4 implements Runnable {
            AnonymousClass4() {
            }

            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (onExtraCallback.this.onExtraCallback) {
                    Iterator it = onExtraCallback.this.IAuthTabCallbackStub.values().iterator();
                    while (it.hasNext()) {
                        final TTAppOpenAdActivity2 tTAppOpenAdActivity2 = (TTAppOpenAdActivity2) it.next();
                        if (tTAppOpenAdActivity2.onNavigationEvent() < jElapsedRealtimeNanos - onExtraCallback.this.IAuthTabCallback.onNavigationEvent()) {
                            it.remove();
                            onExtraCallback.this.onWarmupCompleted.post(new Runnable() { // from class: no.nordicsemi.android.support.v18.scanner.BluetoothLeScannerCompat$ScanCallbackWrapper$1$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    IABLandingPageActivity5.onExtraCallback.this.onNavigationEvent.onWarmupCompleted(4, tTAppOpenAdActivity2);
                                }
                            });
                        }
                    }
                    if (!onExtraCallback.this.IAuthTabCallbackStub.isEmpty()) {
                        onExtraCallback onextracallback = onExtraCallback.this;
                        onextracallback.onWarmupCompleted.postDelayed(this, onextracallback.IAuthTabCallback.onExtraCallbackWithResult());
                    }
                }
            }
        }

        onExtraCallback(boolean z, boolean z2, @NonNull List<TTAppOpenAdActivity> list, @NonNull TTAppOpenAdActivity5 tTAppOpenAdActivity5, @NonNull onScrollChange onscrollchange, @NonNull final Handler handler) {
            this.onExtraCallbackWithResult = Collections.unmodifiableList(list);
            this.IAuthTabCallback = tTAppOpenAdActivity5;
            this.onNavigationEvent = onscrollchange;
            this.onWarmupCompleted = handler;
            boolean z3 = false;
            this.IAuthTabCallbackDefault = (tTAppOpenAdActivity5.onWarmupCompleted() == 1 || tTAppOpenAdActivity5.IAuthTabCallbackStubProxy()) ? false : true;
            this.onTransact = (list.isEmpty() || (z2 && tTAppOpenAdActivity5.access000())) ? false : true;
            long jAccess100 = tTAppOpenAdActivity5.access100();
            if (jAccess100 > 0 && (!z || !tTAppOpenAdActivity5.IAuthTabCallback_Parcel())) {
                z3 = true;
            }
            this.asBinder = z3;
            if (z3) {
                handler.postDelayed(new Runnable() { // from class: o.IABLandingPageActivity5.onExtraCallback.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (onExtraCallback.this.IAuthTabCallbackStubProxy) {
                            return;
                        }
                        onExtraCallback.this.onNavigationEvent();
                        handler.postDelayed(this, onExtraCallback.this.IAuthTabCallback.access100());
                    }
                }, jAccess100);
            }
        }

        void onWarmupCompleted() {
            this.IAuthTabCallbackStubProxy = true;
            this.onWarmupCompleted.removeCallbacksAndMessages(null);
            synchronized (this.onExtraCallback) {
                this.IAuthTabCallbackStub.clear();
                this.asInterface.clear();
                this.access100.clear();
            }
        }

        void onNavigationEvent() {
            if (!this.asBinder || this.IAuthTabCallbackStubProxy) {
                return;
            }
            synchronized (this.onExtraCallback) {
                this.onNavigationEvent.onWarmupCompleted(new ArrayList(this.access100));
                this.access100.clear();
                this.asInterface.clear();
            }
        }

        public void onExtraCallback(int i, @NonNull TTAppOpenAdActivity2 tTAppOpenAdActivity2) {
            boolean zIsEmpty;
            TTAppOpenAdActivity2 tTAppOpenAdActivity2Put;
            if (this.IAuthTabCallbackStubProxy) {
                return;
            }
            if (this.onExtraCallbackWithResult.isEmpty() || IAuthTabCallback(tTAppOpenAdActivity2)) {
                String address = tTAppOpenAdActivity2.IAuthTabCallback().getAddress();
                if (this.IAuthTabCallbackDefault) {
                    synchronized (this.IAuthTabCallbackStub) {
                        zIsEmpty = this.IAuthTabCallbackStub.isEmpty();
                        tTAppOpenAdActivity2Put = this.IAuthTabCallbackStub.put(address, tTAppOpenAdActivity2);
                    }
                    if (tTAppOpenAdActivity2Put == null && (this.IAuthTabCallback.onWarmupCompleted() & 2) > 0) {
                        this.onNavigationEvent.onWarmupCompleted(2, tTAppOpenAdActivity2);
                    }
                    if (!zIsEmpty || (this.IAuthTabCallback.onWarmupCompleted() & 4) <= 0) {
                        return;
                    }
                    this.onWarmupCompleted.removeCallbacks(this.getInterfaceDescriptor);
                    this.onWarmupCompleted.postDelayed(this.getInterfaceDescriptor, this.IAuthTabCallback.onExtraCallbackWithResult());
                    return;
                }
                if (this.asBinder) {
                    synchronized (this.onExtraCallback) {
                        if (!this.asInterface.contains(address)) {
                            this.access100.add(tTAppOpenAdActivity2);
                            this.asInterface.add(address);
                        }
                    }
                    return;
                }
                this.onNavigationEvent.onWarmupCompleted(i, tTAppOpenAdActivity2);
            }
        }

        public void IAuthTabCallback(@NonNull List<TTAppOpenAdActivity2> list) {
            if (this.IAuthTabCallbackStubProxy) {
                return;
            }
            if (this.onTransact) {
                ArrayList arrayList = new ArrayList();
                for (TTAppOpenAdActivity2 tTAppOpenAdActivity2 : list) {
                    if (IAuthTabCallback(tTAppOpenAdActivity2)) {
                        arrayList.add(tTAppOpenAdActivity2);
                    }
                }
                list = arrayList;
            }
            this.onNavigationEvent.onWarmupCompleted(list);
        }

        public void IAuthTabCallback(int i) {
            this.onNavigationEvent.onExtraCallback(i);
        }

        private boolean IAuthTabCallback(@NonNull TTAppOpenAdActivity2 tTAppOpenAdActivity2) {
            Iterator<TTAppOpenAdActivity> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                if (it.next().onExtraCallbackWithResult(tTAppOpenAdActivity2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
