package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setHeaders {
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private final String IAuthTabCallback;
    private final Integer IAuthTabCallbackDefault;
    private final float asBinder;
    private final onNavigationEvent onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final Integer onNavigationEvent;
    private final onExtraCallback onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHeaders)) {
            return false;
        }
        setHeaders setheaders = (setHeaders) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, setheaders.onNavigationEvent)) {
            int i2 = IAuthTabCallbackStub + 13;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Float.compare(this.asBinder, setheaders.asBinder) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, setheaders.IAuthTabCallbackDefault)) {
            int i4 = IAuthTabCallbackStub + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, setheaders.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, setheaders.onWarmupCompleted)) {
            return false;
        }
        if (this.onExtraCallbackWithResult != setheaders.onExtraCallbackWithResult) {
            int i6 = IAuthTabCallbackStub + 113;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, setheaders.onExtraCallback)) {
            return false;
        }
        int i8 = asInterface + 23;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        Integer num;
        int iHashCode;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        IAuthTabCallbackStub = i3 % 128;
        int iHashCode3 = 1;
        if (i3 % 2 == 0) {
            num = this.onNavigationEvent;
            if (num == null) {
                i = 1;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = num.hashCode();
                int i4 = IAuthTabCallbackStub + 17;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            num = this.onNavigationEvent;
            if (num == null) {
                i = 0;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = num.hashCode();
                int i42 = IAuthTabCallbackStub + 17;
                asInterface = i42 % 128;
                int i52 = i42 % 2;
            }
        }
        int iHashCode4 = Float.hashCode(this.asBinder);
        Integer num2 = this.IAuthTabCallbackDefault;
        if (num2 == null) {
            int i6 = asInterface + 123;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = num2.hashCode();
        }
        String str = this.IAuthTabCallback;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        onExtraCallback onextracallback = this.onWarmupCompleted;
        if (onextracallback != null) {
            iHashCode = onextracallback.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult)) * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditLoanNeedsInfo(kcbCreditScore=" + this.onNavigationEvent + ", lowestInterestRates=" + this.asBinder + ", loanApprovalRates=" + this.IAuthTabCallbackDefault + ", averageMaxLimit=" + this.IAuthTabCallback + ", estimatedLoanSummary=" + this.onWarmupCompleted + ", isLoanNeedsUser=" + this.onExtraCallbackWithResult + ", cta=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallbackStub + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public setHeaders(@Nullable Integer num, float f, @Nullable Integer num2, @Nullable String str, @Nullable onExtraCallback onextracallback, boolean z, @NotNull onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onNavigationEvent = num;
        this.asBinder = f;
        this.IAuthTabCallbackDefault = num2;
        this.IAuthTabCallback = str;
        this.onWarmupCompleted = onextracallback;
        this.onExtraCallbackWithResult = z;
        this.onExtraCallback = onnavigationevent;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        float f = this.asBinder;
        int i5 = i3 + 53;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Integer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.IAuthTabCallbackDefault;
        int i5 = i2 + 123;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 53;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final onExtraCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 35;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = this.onWarmupCompleted;
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return onextracallback;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                int i4 = onExtraCallbackWithResult + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                return false;
            }
            int i6 = onExtraCallback + 55;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallbackWithResult + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Cta(title=" + this.onNavigationEvent + ", linkUrl=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 43;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onNavigationEvent = str;
            this.onWarmupCompleted = str2;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String onExtraCallbackWithResult;
        private final float onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            Object obj2 = null;
            if (this == obj) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 81;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 13;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (Float.compare(this.onNavigationEvent, onextracallback.onNavigationEvent) != 0) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                int i6 = IAuthTabCallback + 13;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 == 0;
            }
            int i7 = onWarmupCompleted + 119;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (Float.hashCode(this.onNavigationEvent) - 50) * this.onExtraCallbackWithResult.hashCode() : (Float.hashCode(this.onNavigationEvent) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i3 = IAuthTabCallback + 31;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EstimatedLoanSummary(lowestInterestRate=" + this.onNavigationEvent + ", maxLimit=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 1;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(float f, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = f;
            this.onExtraCallbackWithResult = str;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.onNavigationEvent;
            int i4 = i3 + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 99;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }
}
