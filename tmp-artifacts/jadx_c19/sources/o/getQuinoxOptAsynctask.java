package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class getQuinoxOptAsynctask {
    public /* synthetic */ getQuinoxOptAsynctask(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private getQuinoxOptAsynctask() {
    }

    public static final class onNavigationEvent extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        static {
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 71 / 0;
            }
        }

        private onNavigationEvent() {
            super(null);
        }
    }

    public static final class onExtraCallbackWithResult extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 107;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i6 = i4 + 17;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, ((onExtraCallbackWithResult) obj).onNavigationEvent))) {
                int i8 = onWarmupCompleted + 53;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 16 / 0;
                }
                return true;
            }
            int i10 = onWarmupCompleted + 85;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 71;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                this.onNavigationEvent.hashCode();
                throw null;
            }
            int iHashCode = this.onNavigationEvent.hashCode();
            int i4 = onWarmupCompleted + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "ClickAdBanner(url=" + this.onNavigationEvent + ")";
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
        }

        public final String onNavigationEvent() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String str = this.onNavigationEvent;
            int i6 = i3 + 91;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }
    }

    public static final class onExtraCallback extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final String onExtraCallback;
        private final enableNebulaServiceInitOpt onNavigationEvent;
        private final Function0<Unit> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i3 = onExtraCallbackWithResult + 37;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onNavigationEvent != onextracallback.onNavigationEvent) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                int i4 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = (((this.onNavigationEvent.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
            int i5 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return iHashCode;
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "ClickDisclaimer(creditBureauType=" + this.onNavigationEvent + ", infoType=" + this.onExtraCallback + ", clickLogged=" + this.onWarmupCompleted + ")";
            int i3 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull enableNebulaServiceInitOpt enablenebulaserviceinitopt, @NotNull String str, @NotNull Function0<Unit> function0) {
            super(null);
            Intrinsics.checkNotNullParameter(enablenebulaserviceinitopt, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            this.onNavigationEvent = enablenebulaserviceinitopt;
            this.onExtraCallback = str;
            this.onWarmupCompleted = function0;
        }

        public final String IAuthTabCallback() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback;
            int i4 = i3 + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String str = this.onExtraCallback;
            int i6 = i3 + 17;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final Function0<Unit> onWarmupCompleted() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onTransact extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final onTransact onNavigationEvent = new onTransact();

        static {
            int i2 = onExtraCallbackWithResult + 25;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onTransact() {
            super(null);
        }
    }

    public static final class IAuthTabCallback extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final onAvailable onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = onExtraCallback + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallback) {
                return Intrinsics.areEqual(this.onNavigationEvent, ((IAuthTabCallback) obj).onNavigationEvent);
            }
            int i5 = IAuthTabCallback + 117;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 49;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            int i5 = onExtraCallback + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "ClickHistoryItem(historyDetail=" + this.onNavigationEvent + ")";
            int i3 = onExtraCallback + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull onAvailable onavailable) {
            super(null);
            Intrinsics.checkNotNullParameter(onavailable, "");
            this.onNavigationEvent = onavailable;
        }

        public final onAvailable onNavigationEvent() {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            onAvailable onavailable = this.onNavigationEvent;
            int i6 = i4 + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return onavailable;
        }
    }

    public static final class onWarmupCompleted extends getQuinoxOptAsynctask {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = IAuthTabCallback + 1;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = onExtraCallback + 115;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onWarmupCompleted) obj).onExtraCallbackWithResult)) {
                return true;
            }
            int i7 = onExtraCallback + 99;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 121;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            if (str != null) {
                return str.hashCode();
            }
            int i5 = i4 + 121;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 13;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return 0;
        }

        public String toString() {
            int i2 = 2 % 2;
            String str = "ClickCta(url=" + this.onExtraCallbackWithResult + ")";
            int i3 = onExtraCallback + 101;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onWarmupCompleted(@Nullable String str) {
            super(null);
            this.onExtraCallbackWithResult = str;
        }

        public final String onExtraCallbackWithResult() {
            String str;
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                str = this.onExtraCallbackWithResult;
                int i5 = 80 / 0;
            } else {
                str = this.onExtraCallbackWithResult;
            }
            int i6 = i3 + 9;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 54 / 0;
            }
            return str;
        }
    }
}
