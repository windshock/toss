package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class transGetKmCert {
    public /* synthetic */ transGetKmCert(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String onExtraCallbackWithResult();

    private transGetKmCert() {
    }

    public static final class onNavigationEvent extends transGetKmCert {
        private final int IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public onNavigationEvent() {
            this(null, 0, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && this.IAuthTabCallback == onnavigationevent.IAuthTabCallback && Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult);
        }

        public int hashCode() {
            int iHashCode = this.onNavigationEvent.hashCode();
            int iHashCode2 = Integer.hashCode(this.IAuthTabCallback);
            String str = this.onExtraCallbackWithResult;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DevServer(host=" + this.onNavigationEvent + ", port=" + this.IAuthTabCallback + ", componentName=" + this.onExtraCallbackWithResult + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(@NotNull String str, int i, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = str;
            this.IAuthTabCallback = i;
            this.onExtraCallbackWithResult = str2;
        }

        public /* synthetic */ onNavigationEvent(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "localhost" : str, (i2 & 2) != 0 ? 8081 : i, (i2 & 4) != 0 ? null : str2);
        }

        public final String onExtraCallback() {
            return this.onNavigationEvent;
        }

        public final int onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        @Override // o.transGetKmCert
        public String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onWarmupCompleted extends transGetKmCert {
        private final pkcs5PBKDF2 onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent);
        }

        public int hashCode() {
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            String str = this.onNavigationEvent;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Production(location=" + this.onExtraCallbackWithResult + ", componentName=" + this.onNavigationEvent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull pkcs5PBKDF2 pkcs5pbkdf2, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(pkcs5pbkdf2, "");
            this.onExtraCallbackWithResult = pkcs5pbkdf2;
            this.onNavigationEvent = str;
        }

        public final pkcs5PBKDF2 onExtraCallback() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.transGetKmCert
        public String onExtraCallbackWithResult() {
            return this.onNavigationEvent;
        }
    }
}
