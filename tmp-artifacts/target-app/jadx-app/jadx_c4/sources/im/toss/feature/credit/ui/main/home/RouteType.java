package im.toss.feature.credit.ui.main.home;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class RouteType {
    public /* synthetic */ RouteType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Init extends RouteType {
        public static final Init onExtraCallback = new Init();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 91;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 87 / 0;
            }
        }

        private Init() {
            super(null);
        }
    }

    private RouteType() {
    }

    public static final class OnNewIntent extends RouteType {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 51;
                onExtraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof OnNewIntent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onWarmupCompleted, ((OnNewIntent) obj).onWarmupCompleted)) {
                return true;
            }
            int i3 = onExtraCallback + 69;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onWarmupCompleted.hashCode();
            int i4 = onExtraCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnNewIntent(referrer=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnNewIntent(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }
    }
}
