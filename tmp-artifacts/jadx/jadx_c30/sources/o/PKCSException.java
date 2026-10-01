package o;

import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PKCSException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKCSException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
    }
}
