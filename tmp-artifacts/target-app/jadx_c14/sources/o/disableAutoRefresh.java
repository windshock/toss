package o;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.disableAutoRefresh;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class disableAutoRefresh {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("createdAt")
    private final String createdAt;

    @SerializedName("id")
    private final long id;

    @SerializedName("summary")
    private final String summary;
    private final Lazy timeStamp$delegate;

    @SerializedName("type")
    private final String type;

    public disableAutoRefresh() {
        this(0L, 0L, null, null, null, 31, null);
    }

    public static /* synthetic */ long IAuthTabCallback(disableAutoRefresh disableautorefresh) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallback(disableautorefresh);
            throw null;
        }
        long jOnExtraCallback = onExtraCallback(disableautorefresh);
        int i3 = IAuthTabCallback + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return jOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disableAutoRefresh)) {
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        disableAutoRefresh disableautorefresh = (disableAutoRefresh) obj;
        if (this.id != disableautorefresh.id) {
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.amount != disableautorefresh.amount || (!Intrinsics.areEqual(this.createdAt, disableautorefresh.createdAt))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.summary, disableautorefresh.summary)) {
            int i6 = onNavigationEvent + 101;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(!Intrinsics.areEqual(this.type, disableautorefresh.type))) {
            return true;
        }
        int i7 = onNavigationEvent + 79;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.amount)) * 31) + this.createdAt.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.type.hashCode();
        int i4 = IAuthTabCallback + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserTransaction(id=" + this.id + ", amount=" + this.amount + ", createdAt=" + this.createdAt + ", summary=" + this.summary + ", type=" + this.type + ")";
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public disableAutoRefresh(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = j;
        this.amount = j2;
        this.createdAt = str;
        this.summary = str2;
        this.type = str3;
        this.timeStamp$delegate = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.model.account.UserTransaction$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    Long.valueOf(disableAutoRefresh.IAuthTabCallback(this.f$0));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Long lValueOf = Long.valueOf(disableAutoRefresh.IAuthTabCallback(this.f$0));
                int i3 = onWarmupCompleted + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return lValueOf;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ disableAutoRefresh(long j, long j2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str4;
        long j4 = 0;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i3 = onNavigationEvent + 63;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            j4 = j2;
        }
        String str5 = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback;
            int i6 = i5 + 61;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = i5 + 89;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        this(j3, j4, str5, str4, (i & 16) != 0 ? "" : str3);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.amount;
        int i5 = i3 + 47;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.summary;
        int i5 = i3 + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            ((Number) this.timeStamp$delegate.getValue()).longValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long jLongValue = ((Number) this.timeStamp$delegate.getValue()).longValue();
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return jLongValue;
    }

    private static final long onExtraCallback(disableAutoRefresh disableautorefresh) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Date date = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().parse(disableautorefresh.createdAt);
            Intrinsics.checkNotNull(date);
            long time = date.getTime();
            int i4 = onNavigationEvent + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return time;
            }
            throw null;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
