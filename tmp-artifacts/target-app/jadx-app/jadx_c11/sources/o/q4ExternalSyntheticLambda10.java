package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.q4ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class q4ExternalSyntheticLambda10 {
    public /* synthetic */ q4ExternalSyntheticLambda10(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onWarmupCompleted extends q4ExternalSyntheticLambda10 {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final String IAuthTabCallback;
        private final int onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                if (this.onExtraCallbackWithResult == onwarmupcompleted.onExtraCallbackWithResult) {
                    return true;
                }
                int i4 = onExtraCallback + 89;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onNavigationEvent + 113;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 15;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            return i3 != 0 ? (iHashCode >> 61) - Integer.hashCode(this.onExtraCallbackWithResult) : (iHashCode * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Drop(reason=" + this.IAuthTabCallback + ", droppedCount=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 35;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull String str, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
            this.onExtraCallbackWithResult = i;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i3 + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 107;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i2 + 125;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    private q4ExternalSyntheticLambda10() {
    }

    public static final class onExtraCallback extends q4ExternalSyntheticLambda10 {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final Throwable onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = i3 + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallback) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i6 = onWarmupCompleted + 59;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.onExtraCallbackWithResult.hashCode();
                int i3 = 13 / 0;
            } else {
                iHashCode = this.onExtraCallbackWithResult.hashCode();
            }
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Create(throwable=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallbackWithResult = th;
        }

        public final Throwable onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Throwable th = this.onExtraCallbackWithResult;
            int i5 = i2 + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return th;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends q4ExternalSyntheticLambda10 {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final q4ExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i2 = onWarmupCompleted + 15;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallbackWithResult) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            int i4 = onExtraCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Build(result=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull q4ExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            super(null);
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onExtraCallbackWithResult = onextracallbackwithresult;
        }

        public final q4ExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            q4ExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
            int i5 = i2 + 69;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent extends q4ExternalSyntheticLambda10 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final Throwable onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 123;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i7 = IAuthTabCallback + 117;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, ((onNavigationEvent) obj).onWarmupCompleted)) {
                return false;
            }
            int i9 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = this.onWarmupCompleted.hashCode();
                int i3 = 66 / 0;
            } else {
                iHashCode = this.onWarmupCompleted.hashCode();
            }
            int i4 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Track(throwable=" + this.onWarmupCompleted + ")";
            int i2 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onWarmupCompleted = th;
        }

        public final Throwable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Throwable th = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 14 / 0;
            }
            return th;
        }
    }
}
