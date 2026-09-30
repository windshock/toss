package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAny;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access11600;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RealmAnySetIterator extends access11600<RealmAny> {
    public RealmAnySetIterator(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public RealmAny onExtraCallbackWithResult(int i) {
        return new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.onExtraCallback, new NativeRealmAny(this.onWarmupCompleted.IAuthTabCallback(i))));
    }
}
