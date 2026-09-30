package io.realm.internal.android;

import android.os.Handler;
import android.os.Looper;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmNotifier;
import javax.annotation.Nullable;
import o.TombstoneProtosMemoryErrorTypeTypeVerifier;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AndroidRealmNotifier extends RealmNotifier {
    private Handler handler;

    public AndroidRealmNotifier(@Nullable OsSharedRealm osSharedRealm, TombstoneProtosMemoryErrorTypeTypeVerifier tombstoneProtosMemoryErrorTypeTypeVerifier) {
        super(osSharedRealm);
        if (tombstoneProtosMemoryErrorTypeTypeVerifier.onExtraCallbackWithResult()) {
            this.handler = new Handler(Looper.myLooper());
        } else {
            this.handler = null;
        }
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(Runnable runnable) {
        Handler handler = this.handler;
        return handler != null && handler.post(runnable);
    }
}
