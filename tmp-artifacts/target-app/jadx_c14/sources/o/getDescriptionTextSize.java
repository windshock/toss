package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDescriptionTextSize {

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @SerializedName("bankAccount")
        private String bankAccount;

        @SerializedName("bankCode")
        private int bankCode;

        @SerializedName("refId")
        private String refId;

        public IAuthTabCallback() {
            this(null, null, 0, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.refId, iAuthTabCallback.refId)) {
                int i7 = onNavigationEvent + 99;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.bankAccount, iAuthTabCallback.bankAccount)) {
                int i9 = onExtraCallback + 113;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (this.bankCode == iAuthTabCallback.bankCode) {
                return true;
            }
            int i11 = onNavigationEvent + 125;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0 ? (((r0 * 45) << this.bankAccount.hashCode()) - 89) - Integer.hashCode(this.bankCode) : (((this.refId.hashCode() * 31) + this.bankAccount.hashCode()) * 31) + Integer.hashCode(this.bankCode);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DocumentForRequest(refId=" + this.refId + ", bankAccount=" + this.bankAccount + ", bankCode=" + this.bankCode + ")";
            int i2 = onNavigationEvent + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 29 / 0;
            }
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.refId = str;
            this.bankAccount = str2;
            this.bankCode = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onNavigationEvent + 87;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
                str = "";
            }
            if ((i2 & 2) != 0) {
                int i6 = onNavigationEvent + 27;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                str2 = "";
            }
            this(str, str2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public static final class onExtraCallback {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @SerializedName("doc")
        private String doc;

        @SerializedName("refId")
        private String refId;

        @SerializedName("signId")
        private long signId;

        public onExtraCallback() {
            this(null, null, 0L, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 79;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = onWarmupCompleted + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.refId, onextracallback.refId)) {
                int i6 = onWarmupCompleted + 25;
                onNavigationEvent = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.doc, onextracallback.doc)) {
                int i7 = onNavigationEvent + 33;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.signId != onextracallback.signId) {
                int i9 = onNavigationEvent + 123;
                onWarmupCompleted = i9 % 128;
                return i9 % 2 == 0;
            }
            int i10 = onNavigationEvent + 119;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.refId.hashCode();
            return i3 == 0 ? (((iHashCode - 26) + this.doc.hashCode()) * 44) - Long.hashCode(this.signId) : (((iHashCode * 31) + this.doc.hashCode()) * 31) + Long.hashCode(this.signId);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DocumentForResponse(refId=" + this.refId + ", doc=" + this.doc + ", signId=" + this.signId + ")";
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull String str2, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.refId = str;
            this.doc = str2;
            this.signId = j;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
                str = "";
            }
            if ((i & 2) != 0) {
                int i5 = onNavigationEvent;
                int i6 = i5 + 71;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 119;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
                str2 = "";
            }
            this(str, str2, (i & 4) != 0 ? 0L : j);
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String str = this.refId;
            int i5 = i2 + 99;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 54 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 5;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            String str = this.doc;
            int i5 = i3 + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 26 / 0;
            }
            return str;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            long j = this.signId;
            if (i4 != 0) {
                int i5 = 8 / 0;
            }
            int i6 = i3 + 119;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return j;
            }
            throw null;
        }
    }
}
