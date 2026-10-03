package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RepeatedPostprocessorRunner {
    public static final int $stable = 8;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("bannerInfo")
    private final nativeAddRoundedCornersFilter bannerInfo;

    @SerializedName("cardInfo")
    private final nativeToCircleWithBorderFilter cardInfo;

    @SerializedName("eventBanners")
    private final List<GingerbreadPurgeableDecoder> eventBanners;

    @SerializedName("transactionList")
    private final List<KitKatPurgeableDecoder> transactionList;

    public RepeatedPostprocessorRunner() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof RepeatedPostprocessorRunner)) {
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RepeatedPostprocessorRunner repeatedPostprocessorRunner = (RepeatedPostprocessorRunner) obj;
        if (!Intrinsics.areEqual(this.bannerInfo, repeatedPostprocessorRunner.bannerInfo) || !Intrinsics.areEqual(this.eventBanners, repeatedPostprocessorRunner.eventBanners) || !Intrinsics.areEqual(this.cardInfo, repeatedPostprocessorRunner.cardInfo)) {
            return false;
        }
        if (Intrinsics.areEqual(this.transactionList, repeatedPostprocessorRunner.transactionList)) {
            int i6 = onExtraCallback + 119;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = onExtraCallback + 1;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        nativeAddRoundedCornersFilter nativeaddroundedcornersfilter;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0 ? (nativeaddroundedcornersfilter = this.bannerInfo) != null : (nativeaddroundedcornersfilter = this.bannerInfo) != null) {
            iHashCode = nativeaddroundedcornersfilter.hashCode();
        } else {
            int i4 = i3 + 51;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        int iHashCode3 = this.eventBanners.hashCode();
        nativeToCircleWithBorderFilter nativetocirclewithborderfilter = this.cardInfo;
        if (nativetocirclewithborderfilter != null) {
            int i6 = onExtraCallback + 63;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = nativetocirclewithborderfilter.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int iHashCode4 = (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31) + this.transactionList.hashCode();
        int i8 = onNavigationEvent + 5;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 19 / 0;
        }
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccTransactionListInfo(bannerInfo=" + this.bannerInfo + ", eventBanners=" + this.eventBanners + ", cardInfo=" + this.cardInfo + ", transactionList=" + this.transactionList + ")";
        int i2 = onExtraCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public RepeatedPostprocessorRunner(@Nullable nativeAddRoundedCornersFilter nativeaddroundedcornersfilter, @NotNull List<GingerbreadPurgeableDecoder> list, @Nullable nativeToCircleWithBorderFilter nativetocirclewithborderfilter, @NotNull List<KitKatPurgeableDecoder> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.bannerInfo = nativeaddroundedcornersfilter;
        this.eventBanners = list;
        this.cardInfo = nativetocirclewithborderfilter;
        this.transactionList = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RepeatedPostprocessorRunner(nativeAddRoundedCornersFilter nativeaddroundedcornersfilter, List list, nativeToCircleWithBorderFilter nativetocirclewithborderfilter, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        nativeaddroundedcornersfilter = (i & 1) != 0 ? null : nativeaddroundedcornersfilter;
        if ((i & 2) != 0) {
            int i2 = onNavigationEvent + 79;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        nativetocirclewithborderfilter = (i & 4) != 0 ? null : nativetocirclewithborderfilter;
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
            int i4 = onExtraCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(nativeaddroundedcornersfilter, list, nativetocirclewithborderfilter, list2);
    }

    public final nativeAddRoundedCornersFilter onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        nativeAddRoundedCornersFilter nativeaddroundedcornersfilter = this.bannerInfo;
        int i5 = i3 + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return nativeaddroundedcornersfilter;
    }

    public final List<GingerbreadPurgeableDecoder> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<GingerbreadPurgeableDecoder> list = this.eventBanners;
        int i4 = i3 + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final nativeToCircleWithBorderFilter onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        nativeToCircleWithBorderFilter nativetocirclewithborderfilter = this.cardInfo;
        int i5 = i2 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return nativetocirclewithborderfilter;
    }

    public final List<KitKatPurgeableDecoder> onExtraCallbackWithResult() {
        List<KitKatPurgeableDecoder> list;
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            list = this.transactionList;
            int i4 = 81 / 0;
        } else {
            list = this.transactionList;
        }
        int i5 = i3 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
