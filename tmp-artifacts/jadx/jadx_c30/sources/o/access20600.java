package o;

import io.realm.internal.OsSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access20600 extends access11600<Byte> {
    access20600(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Byte onExtraCallbackWithResult(int i) {
        Object objOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(i);
        if (objOnWarmupCompleted == null) {
            return null;
        }
        return Byte.valueOf(((Long) objOnWarmupCompleted).byteValue());
    }
}
