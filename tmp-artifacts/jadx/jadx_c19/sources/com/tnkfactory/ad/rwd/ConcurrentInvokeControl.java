package com.tnkfactory.ad.rwd;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ConcurrentInvokeControl {
    public static final ConcurrentInvokeControl INSTANCE = new ConcurrentInvokeControl();
    public static final HashMap a = new HashMap();

    public final boolean checkInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = str + str2;
        HashMap map = a;
        if (!map.containsKey(str3)) {
            return false;
        }
        Object obj = map.get(str3);
        Intrinsics.checkNotNull(obj);
        return ((Boolean) obj).booleanValue();
    }

    public final void clearInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = str + str2;
        HashMap map = a;
        if (map.containsKey(str3)) {
            map.put(str3, Boolean.FALSE);
        }
    }

    public final void markInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = str + str2;
        HashMap map = a;
        if (map.containsKey(str3)) {
            map.put(str3, Boolean.TRUE);
        }
    }

    public final void prohibitConcurrentInvoke(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = str + str2;
        HashMap map = a;
        if (map.containsKey(str3)) {
            return;
        }
        map.put(str3, Boolean.FALSE);
    }
}
