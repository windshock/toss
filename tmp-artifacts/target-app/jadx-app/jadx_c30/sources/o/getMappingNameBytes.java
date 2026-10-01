package o;

import io.realm.internal.OsSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getMappingNameBytes extends access11600<Integer> {
    getMappingNameBytes(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Integer onExtraCallbackWithResult(int i) {
        Object objOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(i);
        if (objOnWarmupCompleted == null) {
            return null;
        }
        return Integer.valueOf(((Long) objOnWarmupCompleted).intValue());
    }
}
