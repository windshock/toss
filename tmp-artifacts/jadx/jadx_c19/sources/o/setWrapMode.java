package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.ConstraintLayout;
import o.setLastHorizontalStyle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class setWrapMode {
    private static volatile setWrapMode IAuthTabCallback;
    private final onExtraCallback onExtraCallbackWithResult;
    final Set<setLastHorizontalStyle.onExtraCallback> onNavigationEvent = new HashSet();
    private boolean onWarmupCompleted;

    interface onExtraCallback {
        boolean IAuthTabCallback();

        void onExtraCallback();
    }

    static setWrapMode IAuthTabCallback(@NonNull Context context) {
        if (IAuthTabCallback == null) {
            synchronized (setWrapMode.class) {
                if (IAuthTabCallback == null) {
                    IAuthTabCallback = new setWrapMode(context.getApplicationContext());
                }
            }
        }
        return IAuthTabCallback;
    }

    private setWrapMode(@NonNull final Context context) {
        this.onExtraCallbackWithResult = new onWarmupCompleted(ConstraintLayout.onWarmupCompleted(new ConstraintLayout.onWarmupCompleted<ConnectivityManager>() { // from class: o.setWrapMode.3
            @Override // o.ConstraintLayout.onWarmupCompleted
            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public ConnectivityManager onWarmupCompleted() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new setLastHorizontalStyle.onExtraCallback() { // from class: o.setWrapMode.5
            @Override // o.setLastHorizontalStyle.onExtraCallback
            public void onExtraCallbackWithResult(boolean z) {
                ArrayList arrayList;
                synchronized (setWrapMode.this) {
                    arrayList = new ArrayList(setWrapMode.this.onNavigationEvent);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((setLastHorizontalStyle.onExtraCallback) it.next()).onExtraCallbackWithResult(z);
                }
            }
        });
    }

    void onWarmupCompleted(setLastHorizontalStyle.onExtraCallback onextracallback) {
        synchronized (this) {
            this.onNavigationEvent.add(onextracallback);
            onWarmupCompleted();
        }
    }

    void onExtraCallback(setLastHorizontalStyle.onExtraCallback onextracallback) {
        synchronized (this) {
            this.onNavigationEvent.remove(onextracallback);
            onExtraCallback();
        }
    }

    private void onWarmupCompleted() {
        if (this.onWarmupCompleted || this.onNavigationEvent.isEmpty()) {
            return;
        }
        this.onWarmupCompleted = this.onExtraCallbackWithResult.IAuthTabCallback();
    }

    private void onExtraCallback() {
        if (this.onWarmupCompleted && this.onNavigationEvent.isEmpty()) {
            this.onExtraCallbackWithResult.onExtraCallback();
            this.onWarmupCompleted = false;
        }
    }

    static final class onWarmupCompleted implements onExtraCallback {
        boolean IAuthTabCallback;
        private final ConnectivityManager.NetworkCallback onExtraCallbackWithResult = new AnonymousClass1();
        final setLastHorizontalStyle.onExtraCallback onNavigationEvent;
        private final ConstraintLayout.onWarmupCompleted<ConnectivityManager> onWarmupCompleted;

        /* renamed from: o.setWrapMode$onWarmupCompleted$1, reason: invalid class name */
        final class AnonymousClass1 extends ConnectivityManager.NetworkCallback {
            AnonymousClass1() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                onWarmupCompleted(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                onWarmupCompleted(false);
            }

            private void onWarmupCompleted(final boolean z) {
                applyConstraintsFromLayoutParams.onExtraCallbackWithResult(new Runnable() { // from class: o.setWrapMode.onWarmupCompleted.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.IAuthTabCallback(z);
                    }
                });
            }

            void IAuthTabCallback(boolean z) {
                applyConstraintsFromLayoutParams.onNavigationEvent();
                onWarmupCompleted onwarmupcompleted = onWarmupCompleted.this;
                boolean z2 = onwarmupcompleted.IAuthTabCallback;
                onwarmupcompleted.IAuthTabCallback = z;
                if (z2 != z) {
                    onwarmupcompleted.onNavigationEvent.onExtraCallbackWithResult(z);
                }
            }
        }

        onWarmupCompleted(ConstraintLayout.onWarmupCompleted<ConnectivityManager> onwarmupcompleted, setLastHorizontalStyle.onExtraCallback onextracallback) {
            this.onWarmupCompleted = onwarmupcompleted;
            this.onNavigationEvent = onextracallback;
        }

        @Override // o.setWrapMode.onExtraCallback
        public boolean IAuthTabCallback() {
            this.IAuthTabCallback = this.onWarmupCompleted.onWarmupCompleted().getActiveNetwork() != null;
            try {
                this.onWarmupCompleted.onWarmupCompleted().registerDefaultNetworkCallback(this.onExtraCallbackWithResult);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // o.setWrapMode.onExtraCallback
        public void onExtraCallback() {
            this.onWarmupCompleted.onWarmupCompleted().unregisterNetworkCallback(this.onExtraCallbackWithResult);
        }
    }
}
