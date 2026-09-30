package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ReactFeatureFlags extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public ReactFeatureFlags() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactFeatureFlags(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Throwable th = null;
        this(str, th, 2, th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactFeatureFlags(@NotNull String str, @Nullable Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }

    public /* synthetic */ ReactFeatureFlags(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? null : th);
    }
}
