package o;

import io.realm.internal.OsSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access11700 extends access11600<Short> {
    access11700(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Short onExtraCallbackWithResult(int i) {
        Object objOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(i);
        if (objOnWarmupCompleted == null) {
            return null;
        }
        return Short.valueOf(((Long) objOnWarmupCompleted).shortValue());
    }
}
