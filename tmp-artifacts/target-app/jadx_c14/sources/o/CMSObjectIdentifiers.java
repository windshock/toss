package o;

import android.view.View;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CMSObjectIdentifiers implements getOther {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final Date countDownEndDate;
    private final String description;
    private final String imageUrl;
    private final String linkUrl;
    private final String movieUrl;
    private final Function1<View, Unit> onBannerClicked;
    private final Function0<Unit> onCountDownEnded;
    private final String title;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CMSObjectIdentifiers)) {
            return false;
        }
        CMSObjectIdentifiers cMSObjectIdentifiers = (CMSObjectIdentifiers) obj;
        return Intrinsics.areEqual(this.title, cMSObjectIdentifiers.title) && Intrinsics.areEqual(this.description, cMSObjectIdentifiers.description) && this.backgroundColor == cMSObjectIdentifiers.backgroundColor && Intrinsics.areEqual(this.imageUrl, cMSObjectIdentifiers.imageUrl) && Intrinsics.areEqual(this.movieUrl, cMSObjectIdentifiers.movieUrl) && Intrinsics.areEqual(this.linkUrl, cMSObjectIdentifiers.linkUrl) && Intrinsics.areEqual(this.countDownEndDate, cMSObjectIdentifiers.countDownEndDate) && Intrinsics.areEqual(this.onCountDownEnded, cMSObjectIdentifiers.onCountDownEnded) && Intrinsics.areEqual(this.onBannerClicked, cMSObjectIdentifiers.onBannerClicked);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode();
        String str = this.description;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Integer.hashCode(this.backgroundColor);
        String str2 = this.imageUrl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.movieUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.linkUrl;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Date date = this.countDownEndDate;
        int iHashCode7 = date == null ? 0 : date.hashCode();
        Function0<Unit> function0 = this.onCountDownEnded;
        int iHashCode8 = function0 == null ? 0 : function0.hashCode();
        Function1<View, Unit> function1 = this.onBannerClicked;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    public String toString() {
        return "BannerItem(title=" + this.title + ", description=" + this.description + ", backgroundColor=" + this.backgroundColor + ", imageUrl=" + this.imageUrl + ", movieUrl=" + this.movieUrl + ", linkUrl=" + this.linkUrl + ", countDownEndDate=" + this.countDownEndDate + ", onCountDownEnded=" + this.onCountDownEnded + ", onBannerClicked=" + this.onBannerClicked + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CMSObjectIdentifiers(@NotNull String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date, @Nullable Function0<Unit> function0, @Nullable Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.description = str2;
        this.backgroundColor = i;
        this.imageUrl = str3;
        this.movieUrl = str4;
        this.linkUrl = str5;
        this.countDownEndDate = date;
        this.onCountDownEnded = function0;
        this.onBannerClicked = function1;
    }

    public final String IAuthTabCallbackStub() {
        return this.title;
    }

    public final String onNavigationEvent() {
        return this.description;
    }

    public final int onExtraCallbackWithResult() {
        return this.backgroundColor;
    }

    public final String onWarmupCompleted() {
        return this.imageUrl;
    }

    public final String IAuthTabCallbackDefault() {
        return this.movieUrl;
    }

    public final String onExtraCallback() {
        return this.linkUrl;
    }

    public final Date IAuthTabCallback() {
        return this.countDownEndDate;
    }

    public final Function0<Unit> asBinder() {
        return this.onCountDownEnded;
    }

    public final Function1<View, Unit> asInterface() {
        return this.onBannerClicked;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.TDS_BANNER;
    }
}
