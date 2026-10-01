package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class liteTrackWatchDogHandlerThreadOpt {
    public /* synthetic */ liteTrackWatchDogHandlerThreadOpt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private liteTrackWatchDogHandlerThreadOpt() {
    }

    public static final class onWarmupCompleted extends liteTrackWatchDogHandlerThreadOpt {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final onUnavailable onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, ((onWarmupCompleted) obj).onExtraCallback)) {
                int i3 = onWarmupCompleted + 41;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = onNavigationEvent + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onUnavailable onunavailable = this.onExtraCallback;
            if (i3 == 0) {
                return onunavailable.hashCode();
            }
            onunavailable.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ClickIntelli(banner=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 55;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 70 / 0;
            }
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull onUnavailable onunavailable) {
            super(null);
            Intrinsics.checkNotNullParameter(onunavailable, "");
            this.onExtraCallback = onunavailable;
        }

        public final onUnavailable onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            onUnavailable onunavailable = this.onExtraCallback;
            int i5 = i3 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return onunavailable;
        }
    }

    public static final class onExtraCallback extends liteTrackWatchDogHandlerThreadOpt {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final onUnavailable onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 93;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 83;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 37 / 0;
                }
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i8 = i3 + 39;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, ((onExtraCallback) obj).onWarmupCompleted)) {
                return false;
            }
            int i10 = onExtraCallback + 9;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onUnavailable onunavailable = this.onWarmupCompleted;
            if (i3 != 0) {
                return onunavailable.hashCode();
            }
            onunavailable.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CloseIntelli(banner=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull onUnavailable onunavailable) {
            super(null);
            Intrinsics.checkNotNullParameter(onunavailable, "");
            this.onWarmupCompleted = onunavailable;
        }

        public final onUnavailable onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onUnavailable onunavailable = this.onWarmupCompleted;
            int i5 = i2 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onunavailable;
        }
    }

    public static final class onNavigationEvent extends liteTrackWatchDogHandlerThreadOpt {
        private static int onExtraCallback = 0;
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 31;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    public static final class onExtraCallbackWithResult extends liteTrackWatchDogHandlerThreadOpt {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private final long IAuthTabCallback;

        public onExtraCallbackWithResult() {
            this(0L, 1, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 73;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 75 / 0;
                }
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            if (this.IAuthTabCallback == ((onExtraCallbackWithResult) obj).IAuthTabCallback) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Long.hashCode(this.IAuthTabCallback);
            int i4 = onExtraCallback + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NavigateScoreRaiseScreen(delay=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 45;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(long j) {
            super(null);
            this.IAuthTabCallback = j;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onExtraCallback + 25;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                long j2 = i2 % 2 != 0 ? 1L : 0L;
                int i4 = i3 + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                j = j2;
            }
            this(j);
        }
    }

    public static final class IAuthTabCallback extends liteTrackWatchDogHandlerThreadOpt {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final String onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = onNavigationEvent + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onExtraCallback, ((IAuthTabCallback) obj).onExtraCallback))) {
                return true;
            }
            int i6 = onNavigationEvent + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            if (str != null) {
                return str.hashCode();
            }
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return 0;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "NavigateScoreRaiseCoolTimeScreen(availableDate=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallback;
            if (str == null) {
                return -1;
            }
            int iOnWarmupCompleted = zzcl.onWarmupCompleted(str, (String) null, 1, (Object) null);
            int i3 = IAuthTabCallback + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return iOnWarmupCompleted;
        }
    }

    public static final class IAuthTabCallbackStub extends liteTrackWatchDogHandlerThreadOpt {
        private static int onExtraCallback = 1;
        public static final IAuthTabCallbackStub onNavigationEvent = new IAuthTabCallbackStub();
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 77;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private IAuthTabCallbackStub() {
            super(null);
        }
    }

    public static final class IAuthTabCallback_Parcel extends liteTrackWatchDogHandlerThreadOpt {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final switchJudgment onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback_Parcel)) {
                int i4 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, ((IAuthTabCallback_Parcel) obj).onExtraCallback)) {
                int i6 = onExtraCallbackWithResult + 15;
                onNavigationEvent = i6 % 128;
                return i6 % 2 == 0;
            }
            int i7 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallback.hashCode();
            int i4 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowOverdueDeleteNudgeBottomSheet(nudge=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final switchJudgment onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            switchJudgment switchjudgment = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            return switchjudgment;
        }
    }

    public static final class onTransact extends liteTrackWatchDogHandlerThreadOpt {
        public static final onTransact onExtraCallbackWithResult = new onTransact();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 103;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onTransact() {
            super(null);
        }
    }

    public static final class asBinder extends liteTrackWatchDogHandlerThreadOpt {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final boolean onExtraCallback;
        private final Throwable onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 1;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                int i5 = i2 + 101;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof asBinder)) {
                return false;
            }
            asBinder asbinder = (asBinder) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, asbinder.onNavigationEvent)) {
                int i7 = IAuthTabCallback + 73;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (this.onExtraCallback != asbinder.onExtraCallback) {
                return false;
            }
            int i9 = IAuthTabCallback + 29;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onNavigationEvent.hashCode() * 31) + Boolean.hashCode(this.onExtraCallback);
            int i4 = onWarmupCompleted + 19;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowAlertOrToast(e=" + this.onNavigationEvent + ", isFinish=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(@NotNull Throwable th, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.onNavigationEvent = th;
            this.onExtraCallback = z;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            boolean z = this.onExtraCallback;
            int i4 = i2 + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        public final Throwable onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Throwable th = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            return th;
        }
    }

    public static final class IAuthTabCallbackDefault extends liteTrackWatchDogHandlerThreadOpt {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final boolean onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackDefault)) {
                return false;
            }
            if (this.onExtraCallback == ((IAuthTabCallbackDefault) obj).onExtraCallback) {
                return true;
            }
            int i5 = i3 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 7;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onExtraCallback);
            int i4 = onNavigationEvent + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowLoadingDialog(show=" + this.onExtraCallback + ")";
            int i2 = onNavigationEvent + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            boolean z = this.onExtraCallback;
            int i5 = i3 + 45;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface extends liteTrackWatchDogHandlerThreadOpt {
        private static int IAuthTabCallback = 0;
        public static final asInterface onExtraCallback = new asInterface();
        private static int onExtraCallbackWithResult = 1;

        static {
            int i = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private asInterface() {
            super(null);
        }
    }

    public static final class access000 extends liteTrackWatchDogHandlerThreadOpt {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final enableOverridePendingTransitionNew onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof access000)) {
                int i5 = i3 + 33;
                IAuthTabCallback = i5 % 128;
                return i5 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, ((access000) obj).onNavigationEvent)) {
                return true;
            }
            int i6 = IAuthTabCallback + 87;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            enableOverridePendingTransitionNew enableoverridependingtransitionnew = this.onNavigationEvent;
            if (i3 != 0) {
                return enableoverridependingtransitionnew.hashCode();
            }
            enableoverridependingtransitionnew.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ShowScoreRaiseAnimation(scoreDiff=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access000(@NotNull enableOverridePendingTransitionNew enableoverridependingtransitionnew) {
            super(null);
            Intrinsics.checkNotNullParameter(enableoverridependingtransitionnew, "");
            this.onNavigationEvent = enableoverridependingtransitionnew;
        }

        public final enableOverridePendingTransitionNew onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            enableOverridePendingTransitionNew enableoverridependingtransitionnew = this.onNavigationEvent;
            int i5 = i3 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return enableoverridependingtransitionnew;
        }
    }

    public static final class access100 extends liteTrackWatchDogHandlerThreadOpt {
        public static final access100 onExtraCallback = new access100();
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private access100() {
            super(null);
        }
    }

    public static final class IAuthTabCallbackStubProxy extends liteTrackWatchDogHandlerThreadOpt {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallbackStubProxy onExtraCallback = new IAuthTabCallbackStubProxy();
        private static int onNavigationEvent = 1;

        static {
            int i = onNavigationEvent + 9;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        private IAuthTabCallbackStubProxy() {
            super(null);
        }
    }
}
