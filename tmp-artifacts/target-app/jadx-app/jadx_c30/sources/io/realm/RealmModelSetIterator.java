package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import java.util.ArrayList;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access11600;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RealmModelSetIterator<T extends RealmModel> extends access11600<T> {
    private final Class<T> onExtraCallbackWithResult;

    public RealmModelSetIterator(OsSet osSet, TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, Class<T> cls) {
        super(osSet, tombstoneProtosLogMessageOrBuilder);
        this.onExtraCallbackWithResult = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.access11600
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public T onExtraCallbackWithResult(int i) {
        return (T) this.onExtraCallback.IAuthTabCallback(this.onExtraCallbackWithResult, this.onWarmupCompleted.onNavigationEvent(i), false, new ArrayList());
    }
}
