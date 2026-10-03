package o;

import im.toss.realmdb.RealmMigrationCallback;
import viva.republica.toss.account.di.AccountModule;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_GetIssuerDN implements captureStartValues<RealmMigrationCallback> {
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RealmMigrationCallback get() {
        return onWarmupCompleted();
    }

    public static RealmMigrationCallback onWarmupCompleted() {
        return (RealmMigrationCallback) createAnimator.onNavigationEvent(AccountModule.IAuthTabCallback.IAuthTabCallback());
    }
}
