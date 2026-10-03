package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdViewApi {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("results")
    private final List<IAuthTabCallback> results;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdViewApi() {
        List list = null;
        this(list, 1, list);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdViewApi)) {
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.results, ((AdViewApi) obj).results)) {
            return true;
        }
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List<IAuthTabCallback> list = this.results;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankOpenBankingCheckResponse(results=" + this.results + ")";
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AdViewApi(@NotNull List<IAuthTabCallback> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.results = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdViewApi(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = onWarmupCompleted + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this(list);
    }

    public final List<IAuthTabCallback> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<IAuthTabCallback> list = this.results;
        int i5 = i3 + 77;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("accountNumber")
        private final String accountNumber;

        @SerializedName("bankCode")
        private final int bankCode;

        @SerializedName("transfer")
        private final onWarmupCompleted transfer;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 == 0;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.bankCode != iAuthTabCallback.bankCode || !Intrinsics.areEqual(this.accountNumber, iAuthTabCallback.accountNumber)) {
                return false;
            }
            if (Intrinsics.areEqual(this.transfer, iAuthTabCallback.transfer)) {
                int i3 = IAuthTabCallback + 57;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            int i5 = IAuthTabCallback + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Integer.hashCode(this.bankCode) * 31) + this.accountNumber.hashCode()) * 31) + this.transfer.hashCode();
            int i4 = IAuthTabCallback + 19;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Result(bankCode=" + this.bankCode + ", accountNumber=" + this.accountNumber + ", transfer=" + this.transfer + ")";
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final int onNavigationEvent() {
            int i;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                i = this.bankCode;
                int i5 = 82 / 0;
            } else {
                i = this.bankCode;
            }
            int i6 = i3 + 65;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.accountNumber;
            int i5 = i2 + 11;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return str;
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = this.transfer;
            int i5 = i2 + 41;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onwarmupcompleted;
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @SerializedName("enabled")
        private final boolean enabled;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                int i5 = i2 + 15;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i7 = i2 + 29;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.enabled == ((onWarmupCompleted) obj).enabled) {
                return true;
            }
            int i9 = i4 + 107;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.enabled);
            if (i3 != 0) {
                int i4 = 13 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Enablement(enabled=" + this.enabled + ")";
            int i2 = onExtraCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            boolean z = this.enabled;
            int i5 = i3 + 125;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            throw null;
        }
    }
}
