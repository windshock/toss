package im.toss.core.tracker;

import java.io.File;
import java.io.FileFilter;
import o.GetDetectingInterval;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LogStoreManager$$ExternalSyntheticLambda0 implements FileFilter {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = GetDetectingInterval.IAuthTabCallback(file);
        int i4 = IAuthTabCallback + 43;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
