package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getRecipientInfos implements getOther {
    public static final int $stable = 8;
    private nativeToCircleWithBorderFilter cardInfo;
    private int monthOffset;
    private final Function0<Unit> onMonthTextSelected;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRecipientInfos)) {
            return false;
        }
        getRecipientInfos getrecipientinfos = (getRecipientInfos) obj;
        return Intrinsics.areEqual(this.cardInfo, getrecipientinfos.cardInfo) && this.monthOffset == getrecipientinfos.monthOffset && Intrinsics.areEqual(this.onMonthTextSelected, getrecipientinfos.onMonthTextSelected);
    }

    public int hashCode() {
        nativeToCircleWithBorderFilter nativetocirclewithborderfilter = this.cardInfo;
        return ((((nativetocirclewithborderfilter == null ? 0 : nativetocirclewithborderfilter.hashCode()) * 31) + Integer.hashCode(this.monthOffset)) * 31) + this.onMonthTextSelected.hashCode();
    }

    public String toString() {
        return "PlccCardTransactionHeader(cardInfo=" + this.cardInfo + ", monthOffset=" + this.monthOffset + ", onMonthTextSelected=" + this.onMonthTextSelected + ")";
    }

    public getRecipientInfos(@Nullable nativeToCircleWithBorderFilter nativetocirclewithborderfilter, int i, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.cardInfo = nativetocirclewithborderfilter;
        this.monthOffset = i;
        this.onMonthTextSelected = function0;
    }

    public final nativeToCircleWithBorderFilter IAuthTabCallback() {
        return this.cardInfo;
    }

    public final void onWarmupCompleted(@Nullable nativeToCircleWithBorderFilter nativetocirclewithborderfilter) {
        this.cardInfo = nativetocirclewithborderfilter;
    }

    public final int onExtraCallback() {
        return this.monthOffset;
    }

    public final void onExtraCallback(int i) {
        this.monthOffset = i;
    }

    public final Function0<Unit> onWarmupCompleted() {
        return this.onMonthTextSelected;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.PLCC_CARD_TRANSACTION_DETAIL_HEADER;
    }
}
