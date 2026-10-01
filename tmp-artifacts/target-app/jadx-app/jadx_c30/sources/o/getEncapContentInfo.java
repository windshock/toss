package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getEncapContentInfo {
    public static final int $stable = 8;
    private String storeAddr;
    private String storeBizNo;
    private String storeTel;
    private String storeType;
    private String useStore;

    public getEncapContentInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getEncapContentInfo)) {
            return false;
        }
        getEncapContentInfo getencapcontentinfo = (getEncapContentInfo) obj;
        return Intrinsics.areEqual(this.useStore, getencapcontentinfo.useStore) && Intrinsics.areEqual(this.storeBizNo, getencapcontentinfo.storeBizNo) && Intrinsics.areEqual(this.storeAddr, getencapcontentinfo.storeAddr) && Intrinsics.areEqual(this.storeTel, getencapcontentinfo.storeTel) && Intrinsics.areEqual(this.storeType, getencapcontentinfo.storeType);
    }

    public int hashCode() {
        int iHashCode = this.useStore.hashCode();
        String str = this.storeBizNo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.storeAddr;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.storeTel;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.storeType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "CardStoreInfo(useStore=" + this.useStore + ", storeBizNo=" + this.storeBizNo + ", storeAddr=" + this.storeAddr + ", storeTel=" + this.storeTel + ", storeType=" + this.storeType + ")";
    }

    public getEncapContentInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.useStore = str;
        this.storeBizNo = str2;
        this.storeAddr = str3;
        this.storeTel = str4;
        this.storeType = str5;
    }

    public /* synthetic */ getEncapContentInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuildConfig.FLAVOR : str, (i & 2) != 0 ? BuildConfig.FLAVOR : str2, (i & 4) != 0 ? BuildConfig.FLAVOR : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4, (i & 16) != 0 ? BuildConfig.FLAVOR : str5);
    }
}
