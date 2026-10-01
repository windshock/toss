package im.toss.rn.toss.core.legacy.bundle.v2;

import java.util.Date;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access13800;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface ReactRemoteBundleSource {
    Object IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Date date, boolean z, @NotNull access13800<? super Result> access13800Var);

    static /* synthetic */ Object onNavigationEvent(ReactRemoteBundleSource reactRemoteBundleSource, String str, String str2, String str3, Date date, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBundle");
        }
        if ((i & 8) != 0) {
            date = null;
        }
        Date date2 = date;
        if ((i & 16) != 0) {
            z = true;
        }
        return reactRemoteBundleSource.IAuthTabCallback(str, str2, str3, date2, z, access13800Var);
    }

    public static abstract class Result {
        public static final Companion Companion = new Companion(null);
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Success extends Result {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            private final int onExtraCallback;
            private final long onNavigationEvent;
            private final ReactBundle onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                if (Intrinsics.areEqual(this.onWarmupCompleted, success.onWarmupCompleted)) {
                    return this.onExtraCallback == success.onExtraCallback && this.onNavigationEvent == success.onNavigationEvent;
                }
                int i4 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onExtraCallbackWithResult = i2 % 128;
                int iHashCode = i2 % 2 != 0 ? (((this.onWarmupCompleted.hashCode() / 119) / Integer.hashCode(this.onExtraCallback)) + 115) >> Long.hashCode(this.onNavigationEvent) : (((this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.onNavigationEvent);
                int i3 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Success(bundle=" + this.onWarmupCompleted + ", responseCode=" + this.onExtraCallback + ", fetchedByte=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 23;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull ReactBundle reactBundle, int i, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(reactBundle, "");
                this.onWarmupCompleted = reactBundle;
                this.onExtraCallback = i;
                this.onNavigationEvent = j;
            }

            public final ReactBundle onExtraCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                ReactBundle reactBundle = this.onWarmupCompleted;
                int i5 = i3 + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return reactBundle;
            }
        }

        private Result() {
        }

        public static final class Error extends Result {
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;
            private final Throwable onExtraCallbackWithResult;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallbackWithResult, ((Error) obj).onExtraCallbackWithResult)) {
                    int i2 = IAuthTabCallback + 81;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = onNavigationEvent + 75;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Throwable th = this.onExtraCallbackWithResult;
                if (i3 == 0) {
                    return th.hashCode();
                }
                th.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Error(throwable=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 7;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.onExtraCallbackWithResult = th;
            }

            public final Throwable IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 3;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Throwable th = this.onExtraCallbackWithResult;
                int i5 = i2 + 33;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return th;
                }
                throw null;
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
}
