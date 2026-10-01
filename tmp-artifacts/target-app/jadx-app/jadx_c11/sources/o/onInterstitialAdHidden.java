package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onInterstitialAdHidden {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final getTitleResource onExtraCallback(@Nullable getTitleResource gettitleresource, @Nullable getTitleResource gettitleresource2, @Nullable getTitleResource gettitleresource3, @NotNull getTitleResource gettitleresource4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gettitleresource4, "");
        if (gettitleresource2 == null || gettitleresource != gettitleresource2) {
            return null;
        }
        int i2 = onWarmupCompleted;
        int i3 = i2 + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (gettitleresource3 != null) {
            if (gettitleresource3 == gettitleresource2) {
                gettitleresource3 = null;
            }
            if (gettitleresource3 != null) {
                int i5 = i2 + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return gettitleresource3;
            }
        }
        return gettitleresource4;
    }

    public static final boolean onExtraCallbackWithResult(@Nullable getTitleResource gettitleresource, @NotNull Collection<? extends getTitleResource> collection) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(collection, "");
        if (gettitleresource == null) {
            return true;
        }
        Collection<? extends getTitleResource> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            collection2.iterator();
            obj.hashCode();
            throw null;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            int i3 = IAuthTabCallback + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (((getTitleResource) it.next()) == gettitleresource) {
                int i4 = IAuthTabCallback + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}
