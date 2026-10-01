package o;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class access600 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Map<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc, r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE> onExtraCallbackWithResult;

    @Inject
    public access600(@NotNull Map<r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc, r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r6
      0x003b: PHI (r6v3 o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE) = (r6v2 o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE), (r6v5 o.r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE) binds: [B:8:0x0039, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE r8lambdaazkh_2zqsfpht4kgqgn6y7angve;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
            r8lambdaazkh_2zqsfpht4kgqgn6y7angve = this.onExtraCallbackWithResult.get(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
            int i3 = 74 / 0;
            if (r8lambdaazkh_2zqsfpht4kgqgn6y7angve != null) {
                r8lambdaazkh_2zqsfpht4kgqgn6y7angve.onExtraCallback(str, map);
                int i4 = onExtraCallback + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
            r8lambdaazkh_2zqsfpht4kgqgn6y7angve = this.onExtraCallbackWithResult.get(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
            if (r8lambdaazkh_2zqsfpht4kgqgn6y7angve != null) {
            }
        }
        int i6 = onWarmupCompleted + 25;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Iterable<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> iterable) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(iterable, "");
            iterable.iterator();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> it = iterable.iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 63;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted(str, map, it.next());
                throw null;
            }
            onWarmupCompleted(str, map, it.next());
        }
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
            this.onExtraCallbackWithResult.get(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
        r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE r8lambdaazkh_2zqsfpht4kgqgn6y7angve = this.onExtraCallbackWithResult.get(r8lambdaqfjxzpq89uignp4inuj4r5tibc);
        if (r8lambdaazkh_2zqsfpht4kgqgn6y7angve != null) {
            r8lambdaazkh_2zqsfpht4kgqgn6y7angve.IAuthTabCallback(str, map);
            int i3 = onExtraCallback + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onWarmupCompleted + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Iterable<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> iterable) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> it = iterable.iterator();
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        while (!(!it.hasNext())) {
            onExtraCallback(str, map, it.next());
        }
        int i4 = onWarmupCompleted + 19;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.values().iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.onExtraCallbackWithResult.values().iterator();
        while (it.hasNext()) {
            int i3 = onExtraCallback + 5;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ((r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE) it.next()).onExtraCallbackWithResult(str);
        }
        int i5 = onWarmupCompleted + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onNavigationEvent(@NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc... r8lambdaqfjxzpq89uignp4inuj4r5tibcArr) {
        Collection<r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE> collectionValues;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibcArr, "");
        if (r8lambdaqfjxzpq89uignp4inuj4r5tibcArr.length == 0) {
            collectionValues = this.onExtraCallbackWithResult.values();
        } else {
            List listDistinct = ArraysKt.distinct(r8lambdaqfjxzpq89uignp4inuj4r5tibcArr);
            ArrayList arrayList = new ArrayList();
            Iterator it = listDistinct.iterator();
            while (it.hasNext()) {
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    this.onExtraCallbackWithResult.get((r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) it.next());
                    throw null;
                }
                r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE r8lambdaazkh_2zqsfpht4kgqgn6y7angve = this.onExtraCallbackWithResult.get((r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) it.next());
                if (r8lambdaazkh_2zqsfpht4kgqgn6y7angve != null) {
                    arrayList.add(r8lambdaazkh_2zqsfpht4kgqgn6y7angve);
                }
            }
            collectionValues = arrayList;
        }
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            int i3 = onExtraCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ((r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE) it2.next()).IAuthTabCallback();
        }
    }

    public final void onExtraCallback(@Nullable Activity activity, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.onExtraCallbackWithResult.values().iterator();
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            ((r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE) it.next()).onExtraCallback(activity, str);
            i2 = onExtraCallback + 63;
            onWarmupCompleted = i2 % 128;
        }
    }
}
