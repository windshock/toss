package o;

import im.toss.features.credit.data.remote.model.CardUsageReportResponse;
import im.toss.features.credit.data.remote.model.LoanUsageReportResponse;
import im.toss.features.credit.data.remote.model.ScoreReportResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addPermRequstCallback {
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private final LoanUsageReportResponse onExtraCallback;
    private final List<hasProvider> onExtraCallbackWithResult;
    private final ScoreReportResponse onNavigationEvent;
    private final CardUsageReportResponse onWarmupCompleted;

    public addPermRequstCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ addPermRequstCallback onExtraCallbackWithResult(addPermRequstCallback addpermrequstcallback, ScoreReportResponse scoreReportResponse, CardUsageReportResponse cardUsageReportResponse, LoanUsageReportResponse loanUsageReportResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback + 67;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                ScoreReportResponse scoreReportResponse2 = addpermrequstcallback.onNavigationEvent;
                throw null;
            }
            scoreReportResponse = addpermrequstcallback.onNavigationEvent;
        }
        if ((i & 2) != 0) {
            int i4 = asBinder + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            cardUsageReportResponse = addpermrequstcallback.onWarmupCompleted;
        }
        if ((i & 4) != 0) {
            int i6 = asBinder + 125;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            loanUsageReportResponse = addpermrequstcallback.onExtraCallback;
        }
        if ((i & 8) != 0) {
            list = addpermrequstcallback.onExtraCallbackWithResult;
        }
        return addpermrequstcallback.onWarmupCompleted(scoreReportResponse, cardUsageReportResponse, loanUsageReportResponse, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof addPermRequstCallback)) {
            return false;
        }
        addPermRequstCallback addpermrequstcallback = (addPermRequstCallback) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, addpermrequstcallback.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, addpermrequstcallback.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, addpermrequstcallback.onExtraCallback)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, addpermrequstcallback.onExtraCallbackWithResult);
        }
        int i7 = asBinder + 19;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        ScoreReportResponse scoreReportResponse = this.onNavigationEvent;
        int iHashCode3 = scoreReportResponse == null ? 0 : scoreReportResponse.hashCode();
        CardUsageReportResponse cardUsageReportResponse = this.onWarmupCompleted;
        if (cardUsageReportResponse == null) {
            int i2 = asBinder;
            int i3 = i2 + 117;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = cardUsageReportResponse.hashCode();
        }
        LoanUsageReportResponse loanUsageReportResponse = this.onExtraCallback;
        if (loanUsageReportResponse == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = loanUsageReportResponse.hashCode();
            int i7 = IAuthTabCallback + 33;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        List<hasProvider> list = this.onExtraCallbackWithResult;
        return (((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final addPermRequstCallback onWarmupCompleted(@Nullable ScoreReportResponse scoreReportResponse, @Nullable CardUsageReportResponse cardUsageReportResponse, @Nullable LoanUsageReportResponse loanUsageReportResponse, @Nullable List<hasProvider> list) {
        int i = 2 % 2;
        addPermRequstCallback addpermrequstcallback = new addPermRequstCallback(scoreReportResponse, cardUsageReportResponse, loanUsageReportResponse, list);
        int i2 = IAuthTabCallback + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return addpermrequstcallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScoreReportScreenData(scoreReport=" + this.onNavigationEvent + ", cardUsageReport=" + this.onWarmupCompleted + ", loanUsageReport=" + this.onExtraCallback + ", parsedDescriptions=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public addPermRequstCallback(@Nullable ScoreReportResponse scoreReportResponse, @Nullable CardUsageReportResponse cardUsageReportResponse, @Nullable LoanUsageReportResponse loanUsageReportResponse, @Nullable List<hasProvider> list) {
        this.onNavigationEvent = scoreReportResponse;
        this.onWarmupCompleted = cardUsageReportResponse;
        this.onExtraCallback = loanUsageReportResponse;
        this.onExtraCallbackWithResult = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addPermRequstCallback(ScoreReportResponse scoreReportResponse, CardUsageReportResponse cardUsageReportResponse, LoanUsageReportResponse loanUsageReportResponse, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            scoreReportResponse = null;
        }
        if ((i & 2) != 0) {
            int i5 = asBinder + 39;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            cardUsageReportResponse = null;
        }
        loanUsageReportResponse = (i & 4) != 0 ? null : loanUsageReportResponse;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            list = null;
        }
        this(scoreReportResponse, cardUsageReportResponse, loanUsageReportResponse, list);
    }

    public final ScoreReportResponse onWarmupCompleted() {
        ScoreReportResponse scoreReportResponse;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            scoreReportResponse = this.onNavigationEvent;
            int i4 = 54 / 0;
        } else {
            scoreReportResponse = this.onNavigationEvent;
        }
        int i5 = i2 + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return scoreReportResponse;
    }

    public final CardUsageReportResponse onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        CardUsageReportResponse cardUsageReportResponse = this.onWarmupCompleted;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return cardUsageReportResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoanUsageReportResponse onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        LoanUsageReportResponse loanUsageReportResponse = this.onExtraCallback;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return loanUsageReportResponse;
    }

    public final List<hasProvider> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        List<hasProvider> list = this.onExtraCallbackWithResult;
        int i5 = i3 + 67;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
