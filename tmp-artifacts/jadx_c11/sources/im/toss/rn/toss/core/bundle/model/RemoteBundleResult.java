package im.toss.rn.toss.core.bundle.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setRequestListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class RemoteBundleResult {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = IAuthTabCallback + 19;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public /* synthetic */ RemoteBundleResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RemoteBundleResult() {
    }

    public static final class Success extends RemoteBundleResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final int onExtraCallback;
        private final setRequestListener onNavigationEvent;
        private final long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, success.onNavigationEvent)) {
                return false;
            }
            if (this.onExtraCallback == success.onExtraCallback) {
                return this.onWarmupCompleted == success.onWarmupCompleted;
            }
            int i6 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onNavigationEvent.hashCode() - 97) - Integer.hashCode(this.onExtraCallback)) << 122) % Long.hashCode(this.onWarmupCompleted) : (((this.onNavigationEvent.hashCode() * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.onWarmupCompleted);
            int i3 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(bundle=" + this.onNavigationEvent + ", responseCode=" + this.onExtraCallback + ", fetchedBytes=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull setRequestListener setrequestlistener, int i, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(setrequestlistener, "");
            this.onNavigationEvent = setrequestlistener;
            this.onExtraCallback = i;
            this.onWarmupCompleted = j;
        }

        public final setRequestListener IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setRequestListener setrequestlistener = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 68 / 0;
            }
            return setrequestlistener;
        }

        public final int onExtraCallbackWithResult() {
            int i;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                i = this.onExtraCallback;
                int i5 = 58 / 0;
            } else {
                i = this.onExtraCallback;
            }
            int i6 = i3 + 41;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 97 / 0;
            }
            return i;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onWarmupCompleted;
            int i5 = i2 + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return j;
        }
    }

    public static final class Error extends RemoteBundleResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final Integer IAuthTabCallback;
        private final Throwable onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof Error)) {
                int i3 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            Error error = (Error) obj;
            if (Intrinsics.areEqual(this.onExtraCallback, error.onExtraCallback)) {
                if (Intrinsics.areEqual(this.IAuthTabCallback, error.IAuthTabCallback)) {
                    return true;
                }
                int i5 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = onExtraCallbackWithResult + 33;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            boolean z = i7 % 2 != 0;
            int i9 = i8 + 45;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return z;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            Integer num = this.IAuthTabCallback;
            if (num == null) {
                int i4 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(throwable=" + this.onExtraCallback + ", responseCode=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable th, @Nullable Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onExtraCallback = th;
            this.IAuthTabCallback = num;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(Throwable th, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onWarmupCompleted + 25;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 123;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                num = null;
            }
            this(th, num);
        }

        public final Throwable onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Throwable th = this.onExtraCallback;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return th;
            }
            throw null;
        }

        public final Integer IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.IAuthTabCallback;
            int i5 = i2 + 33;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
