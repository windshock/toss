package o;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearBuildFingerprint implements Sequence, addMemoryMappings {
    public static final clearBuildFingerprint IAuthTabCallback = new clearBuildFingerprint();

    private clearBuildFingerprint() {
    }

    @Override // kotlin.sequences.Sequence
    public Iterator IAuthTabCallback() {
        return access7300.onWarmupCompleted;
    }

    @Override // o.addMemoryMappings
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public clearBuildFingerprint onNavigationEvent(int i) {
        return IAuthTabCallback;
    }

    @Override // o.addMemoryMappings
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public clearBuildFingerprint onWarmupCompleted(int i) {
        return IAuthTabCallback;
    }
}
