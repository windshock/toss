package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getFBLoginASID {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String rrn;
    private final String sessionId;
    private final onNavigationEvent value;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 11;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 65;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(obj instanceof getFBLoginASID)) {
            int i7 = i2 + 83;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        getFBLoginASID getfbloginasid = (getFBLoginASID) obj;
        if (!Intrinsics.areEqual(this.sessionId, getfbloginasid.sessionId)) {
            int i8 = onNavigationEvent + 79;
            onWarmupCompleted = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.value, getfbloginasid.value)) {
            int i9 = onNavigationEvent + 81;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rrn, getfbloginasid.rrn)) {
            return false;
        }
        int i11 = onNavigationEvent + 85;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.sessionId.hashCode();
        return i3 != 0 ? (((iHashCode - 63) - this.value.hashCode()) % 114) * this.rrn.hashCode() : (((iHashCode * 31) + this.value.hashCode()) * 31) + this.rrn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueVerifyPasswordReq(sessionId=" + this.sessionId + ", value=" + this.value + ", rrn=" + this.rrn + ")";
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
        return str;
    }

    public getFBLoginASID(@NotNull String str, @NotNull onNavigationEvent onnavigationevent, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.value = onnavigationevent;
        this.rrn = str2;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final String cardPassword;
        private final String eccEncryptionKeyNo;
        private final String rsaEncryptionKeyNo;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (Intrinsics.areEqual(this.cardPassword, onnavigationevent.cardPassword)) {
                return Intrinsics.areEqual(this.eccEncryptionKeyNo, onnavigationevent.eccEncryptionKeyNo) && Intrinsics.areEqual(this.rsaEncryptionKeyNo, onnavigationevent.rsaEncryptionKeyNo);
            }
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.cardPassword.hashCode();
            String str = this.eccEncryptionKeyNo;
            int iHashCode3 = 0;
            if (str == null) {
                int i4 = onExtraCallbackWithResult + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.rsaEncryptionKeyNo;
            if (str2 != null) {
                int i6 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                iHashCode3 = str2.hashCode();
                int i8 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 2;
                }
            }
            return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Value(cardPassword=" + this.cardPassword + ", eccEncryptionKeyNo=" + this.eccEncryptionKeyNo + ", rsaEncryptionKeyNo=" + this.rsaEncryptionKeyNo + ")";
            int i2 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onNavigationEvent(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.cardPassword = str;
            this.eccEncryptionKeyNo = str2;
            this.rsaEncryptionKeyNo = str3;
        }
    }
}
