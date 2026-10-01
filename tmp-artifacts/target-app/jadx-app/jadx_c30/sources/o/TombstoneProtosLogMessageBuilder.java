package o;

import io.realm.internal.OsSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TombstoneProtosLogMessageBuilder extends access11600<byte[]> {
    TombstoneProtosLogMessageBuilder(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public byte[] onExtraCallbackWithResult(int i) {
        Object objOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(i);
        if (objOnWarmupCompleted == null) {
            return null;
        }
        return (byte[]) objOnWarmupCompleted;
    }
}
