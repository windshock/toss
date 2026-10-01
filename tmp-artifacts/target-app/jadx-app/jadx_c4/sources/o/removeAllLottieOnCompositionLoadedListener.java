package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface removeAllLottieOnCompositionLoadedListener {

    public static abstract class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public static final class onWarmupCompleted extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            private final String onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onWarmupCompleted)) {
                    int i2 = IAuthTabCallback + 33;
                    onWarmupCompleted = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 19 / 0;
                    }
                    return false;
                }
                if (!Intrinsics.areEqual(this.onNavigationEvent, ((onWarmupCompleted) obj).onNavigationEvent)) {
                    int i4 = onWarmupCompleted + 95;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = IAuthTabCallback + 63;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onNavigationEvent.hashCode();
                int i4 = onWarmupCompleted + 75;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Lottie(lottieUrl=" + this.onNavigationEvent + ")";
                int i2 = onWarmupCompleted + 53;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onWarmupCompleted(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onNavigationEvent = str;
            }

            public final String IAuthTabCallback() {
                String str;
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 111;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    str = this.onNavigationEvent;
                    int i4 = 72 / 0;
                } else {
                    str = this.onNavigationEvent;
                }
                int i5 = i2 + 61;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 72 / 0;
                }
                return str;
            }
        }

        /* renamed from: o.removeAllLottieOnCompositionLoadedListener$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0030IAuthTabCallback extends IAuthTabCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            private final Object onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 23;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof C0030IAuthTabCallback)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onNavigationEvent, ((C0030IAuthTabCallback) obj).onNavigationEvent)) {
                    return true;
                }
                int i7 = onExtraCallback + 101;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 117;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onNavigationEvent.hashCode();
                int i4 = IAuthTabCallback + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 26 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Image(data=" + this.onNavigationEvent + ")";
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 10 / 0;
                }
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0030IAuthTabCallback(@NotNull Object obj) {
                super(null);
                Intrinsics.checkNotNullParameter(obj, "");
                this.onNavigationEvent = obj;
            }

            public final Object onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                Object obj = this.onNavigationEvent;
                int i5 = i3 + 23;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return obj;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }
    }
}
