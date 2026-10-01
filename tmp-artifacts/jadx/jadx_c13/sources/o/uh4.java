package o;

import java.util.Iterator;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface uh4 extends Iterator<ycx41> {
    ycx41 onExtraCallback();

    boolean onExtraCallback(ycx41.IAuthTabCallback... iAuthTabCallbackArr);

    @Override // java.util.Iterator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    ycx41 next();

    void onNavigationEvent();

    default boolean onWarmupCompleted(ycx41.IAuthTabCallback iAuthTabCallback) {
        return onExtraCallback(iAuthTabCallback);
    }
}
