package im.toss.rn.toss.core.legacy.bundle.v2;

import im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleCacheMigrator;
import java.util.Comparator;
import o.getCodeNameBytes;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleCacheMigrator$special$$inlined$sortedBy$1<T> implements Comparator {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(Integer.valueOf(((ReactBundleCacheMigrator.Migration) t).IAuthTabCallback()), Integer.valueOf(((ReactBundleCacheMigrator.Migration) t2).IAuthTabCallback()));
        int i4 = onNavigationEvent + 35;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iIAuthTabCallback;
        }
        throw null;
    }
}
