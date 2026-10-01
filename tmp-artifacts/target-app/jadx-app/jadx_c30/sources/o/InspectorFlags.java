package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class InspectorFlags {
    public static final int $stable = 0;

    @SerializedName("companyCode")
    private final String companyCode;

    @SerializedName("scrapingId")
    private final String scrapingId;

    @SerializedName("txId")
    private final String txId;

    public InspectorFlags() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspectorFlags)) {
            return false;
        }
        InspectorFlags inspectorFlags = (InspectorFlags) obj;
        return Intrinsics.areEqual(this.companyCode, inspectorFlags.companyCode) && Intrinsics.areEqual(this.scrapingId, inspectorFlags.scrapingId) && Intrinsics.areEqual(this.txId, inspectorFlags.txId);
    }

    public int hashCode() {
        return (((this.companyCode.hashCode() * 31) + this.scrapingId.hashCode()) * 31) + this.txId.hashCode();
    }

    public String toString() {
        return "ScrapingTransaction(companyCode=" + this.companyCode + ", scrapingId=" + this.scrapingId + ", txId=" + this.txId + ")";
    }

    public InspectorFlags(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.companyCode = str;
        this.scrapingId = str2;
        this.txId = str3;
    }

    public /* synthetic */ InspectorFlags(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3);
    }
}
