package o;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1g {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static final int onExtraCallback(@NotNull List<? extends getStreamSharingChildren> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        int i2 = onWarmupCompleted + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 2;
        }
        int iMax = 0;
        while (it.hasNext()) {
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                Math.max(iMax, ((getStreamSharingChildren) it.next()).getInterfaceDescriptor());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iMax = Math.max(iMax, ((getStreamSharingChildren) it.next()).getInterfaceDescriptor());
        }
        return iMax;
    }

    public static final int IAuthTabCallback(@NotNull List<? extends getStreamSharingChildren> list) {
        Iterator it;
        int iMax;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            it = list.iterator();
            iMax = 1;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            it = list.iterator();
            iMax = 0;
        }
        while (it.hasNext()) {
            int i3 = onWarmupCompleted + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iMax = Math.max(iMax, ((getStreamSharingChildren) it.next()).T_());
        }
        int i5 = onWarmupCompleted + 51;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return iMax;
    }
}
