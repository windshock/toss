package o;

import io.realm.DynamicRealmObject;
import io.realm.internal.OsSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearMappingName extends access11600<DynamicRealmObject> {
    private final String onExtraCallbackWithResult;

    clearMappingName(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, String str) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
        this.onExtraCallbackWithResult = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public DynamicRealmObject onExtraCallbackWithResult(int i) {
        return this.onExtraCallback.onWarmupCompleted(DynamicRealmObject.class, this.onExtraCallbackWithResult, this.onWarmupCompleted.onNavigationEvent(i));
    }
}
