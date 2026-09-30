package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class setAdReviewListener {
    public /* synthetic */ setAdReviewListener(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private setAdReviewListener() {
    }

    public static final class IAuthTabCallback extends setAdReviewListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final setRequestListener onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 115;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult))) {
                return true;
            }
            int i3 = onExtraCallback + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setRequestListener setrequestlistener = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                return setrequestlistener.hashCode();
            }
            setrequestlistener.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Fetched(bundle=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 7;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull setRequestListener setrequestlistener) {
            super(null);
            Intrinsics.checkNotNullParameter(setrequestlistener, "");
            this.onExtraCallbackWithResult = setrequestlistener;
        }

        public final setRequestListener IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            setRequestListener setrequestlistener = this.onExtraCallbackWithResult;
            int i5 = i3 + 81;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return setrequestlistener;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallback extends setAdReviewListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 109;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i4 = IAuthTabCallback + 97;
                onNavigationEvent = i4 % 128;
                return i4 % 2 == 0;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                return false;
            }
            if (this.onWarmupCompleted == onextracallback.onWarmupCompleted) {
                return Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback);
            }
            int i5 = onNavigationEvent + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            IAuthTabCallback = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((this.onExtraCallbackWithResult.hashCode() >>> 47) - Integer.hashCode(this.onWarmupCompleted)) >>> 71) >>> this.onExtraCallback.hashCode() : (((this.onExtraCallbackWithResult.hashCode() * 31) + Integer.hashCode(this.onWarmupCompleted)) * 31) + this.onExtraCallback.hashCode();
            int i3 = onNavigationEvent + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MetroConnected(host=" + this.onExtraCallbackWithResult + ", port=" + this.onWarmupCompleted + ", componentName=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 57;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull String str, int i, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = i;
            this.onExtraCallback = str2;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 5 / 0;
            }
            return str;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 111;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.onWarmupCompleted;
            int i5 = i2 + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return i4;
        }
    }

    public static final class onNavigationEvent extends setAdReviewListener {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final String onExtraCallbackWithResult;
        private final Throwable onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 77;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 85;
                onWarmupCompleted = i5 % 128;
                return !(i5 % 2 != 0);
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i6 = i2 + 15;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = onExtraCallback + 35;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = onWarmupCompleted + 53;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(throwable=" + this.onNavigationEvent + ", message=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull Throwable th, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = th;
            this.onExtraCallbackWithResult = str;
        }

        public final Throwable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Throwable th = this.onNavigationEvent;
            int i5 = i3 + 117;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return th;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted extends setAdReviewListener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 61;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = onNavigationEvent + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return true;
            }
            int i6 = IAuthTabCallback + 3;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.onExtraCallback.hashCode();
            String str = this.onExtraCallbackWithResult;
            int iHashCode3 = 0;
            if (str == null) {
                int i4 = onNavigationEvent + 35;
                IAuthTabCallback = i4 % 128;
                iHashCode = i4 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.onWarmupCompleted;
            if (str2 != null) {
                iHashCode3 = str2.hashCode();
                int i5 = onNavigationEvent + 33;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "IncorrectVersion(reason=" + this.onExtraCallback + ", required=" + this.onExtraCallbackWithResult + ", actual=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 61;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            return str;
        }
    }
}
