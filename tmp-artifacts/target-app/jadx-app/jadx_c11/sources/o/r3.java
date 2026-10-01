package o;

import im.toss.tosssecurities.core.storage.domain.crosstype.CrossType;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r3 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final setRubIn<Boolean> IAuthTabCallback;
    private final setRubIn<Boolean> onExtraCallback;
    private final DiskLruCacheEntry onWarmupCompleted;

    @Inject
    public r3(@NotNull DiskLruCacheEntry diskLruCacheEntry) {
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        this.onWarmupCompleted = diskLruCacheEntry;
        setRubIn<Boolean> setrubinOnNavigationEvent = diskLruCacheEntry.onNavigationEvent(CrossType.Remote.Shared.IAuthTabCallback.onWarmupCompleted);
        this.onExtraCallback = setrubinOnNavigationEvent;
        this.IAuthTabCallback = setrubinOnNavigationEvent;
    }

    public final setRubIn<Boolean> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        setRubIn<Boolean> setrubin = this.IAuthTabCallback;
        int i4 = i3 + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }
}
