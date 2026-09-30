package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AFd1wSDK1;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDK2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ boolean onExtraCallback(List list, AFd1wSDK1.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(list, iAuthTabCallback);
        int i4 = IAuthTabCallback + 99;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return zOnWarmupCompleted;
    }

    private static final boolean onWarmupCompleted(List<AFd1wSDK1> list, AFd1wSDK1.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        List<AFd1wSDK1> list2 = list;
        if (i2 % 2 == 0) {
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                int i3 = IAuthTabCallback + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i5 = onWarmupCompleted + 29;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 29 / 0;
                    if (Intrinsics.areEqual(((AFd1wSDK1) it.next()).onNavigationEvent(), iAuthTabCallback)) {
                        return true;
                    }
                } else if (Intrinsics.areEqual(((AFd1wSDK1) it.next()).onNavigationEvent(), iAuthTabCallback)) {
                    return true;
                }
            }
            return false;
        }
        boolean z = list2 instanceof Collection;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
