package o;

import android.content.Context;
import java.io.File;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Deinitialize;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q3bc<T extends Deinitialize> extends ComputeLandmarkConfidence<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3bc(@NotNull Context context, @NotNull String str, int i) {
        super(context, "securities-performance-logs/" + str, i, (Comparator) null, (File) null, (ExtractFeature) null, 56, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
