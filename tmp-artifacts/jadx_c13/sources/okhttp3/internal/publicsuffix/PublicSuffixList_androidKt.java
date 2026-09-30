package okhttp3.internal.publicsuffix;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixList;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PublicSuffixList_androidKt {
    public static final PublicSuffixList getDefault(@NotNull PublicSuffixList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "");
        return new AssetPublicSuffixList(null, 1, null);
    }
}
