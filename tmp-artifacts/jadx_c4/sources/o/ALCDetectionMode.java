package o;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import o.auth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCDetectionMode {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ void onWarmupCompleted(Throwable th, Map map, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 121;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 5;
            onNavigationEvent = i5 % 128;
            map = null;
            if (i5 % 2 != 0) {
                map.hashCode();
                throw null;
            }
        }
        onNavigationEvent(th, map);
    }

    public static final void onNavigationEvent(@NotNull Throwable th, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            auth.onNavigationEvent.onExtraCallback(th, auth.onWarmupCompleted.WARNING, map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        auth.onNavigationEvent.onExtraCallback(th, auth.onWarmupCompleted.WARNING, map);
        int i3 = onNavigationEvent + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Throwable th, Map map, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            map = null;
        }
        IAuthTabCallback(th, map);
        int i5 = onNavigationEvent + 93;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static final void IAuthTabCallback(@NotNull Throwable th, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        auth.onNavigationEvent.onExtraCallback(th, auth.onWarmupCompleted.ERROR, map);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final boolean onExtraCallback(@NotNull File file) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        List listListOf = CollectionsKt.listOf(new File[]{new File(file, "bugsnag/errors"), new File(file, "bugsnag/sessions"), new File(file, "bugsnag/native"), new File(file, "bugsnag-errors"), new File(file, "bugsnag-sessions"), new File(file, "bugsnag-native")});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int i2 = onNavigationEvent + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(Boolean.valueOf(FilesKt.deleteRecursively((File) it.next())));
                throw null;
            }
            arrayList.add(Boolean.valueOf(FilesKt.deleteRecursively((File) it.next())));
        }
        if (arrayList.isEmpty()) {
            int i3 = onNavigationEvent + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!((Boolean) it2.next()).booleanValue()) {
                return false;
            }
        }
        int i5 = onNavigationEvent + 39;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }
}
