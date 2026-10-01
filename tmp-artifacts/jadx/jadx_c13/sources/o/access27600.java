package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access27600 {
    public static final void onExtraCallback(@NotNull deserializeUriCollection deserializeuricollection, @NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        Intrinsics.checkParameterIsNotNull(deserializeuricollection, "");
        Intrinsics.checkParameterIsNotNull(deserializeurinullablecollection, "");
        deserializeuricollection.onNavigationEvent(deserializeurinullablecollection);
    }

    public static final deserializeUriNullableCollection onExtraCallback(@NotNull deserializeUriNullableCollection deserializeurinullablecollection, @NotNull deserializeUriCollection deserializeuricollection) {
        Intrinsics.checkParameterIsNotNull(deserializeurinullablecollection, "");
        Intrinsics.checkParameterIsNotNull(deserializeuricollection, "");
        deserializeuricollection.onNavigationEvent(deserializeurinullablecollection);
        return deserializeurinullablecollection;
    }
}
