package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AFh1dSDK {

    public static final class onExtraCallback implements AFh1dSDK {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();

        static {
            int i = IAuthTabCallback + 3;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        private onExtraCallback() {
        }
    }

    public static final class onExtraCallbackWithResult implements AFh1dSDK {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final int onExtraCallbackWithResult;
        private final setOnQueryTextListener onWarmupCompleted;

        /* JADX WARN: Illegal instructions before constructor call */
        public onExtraCallbackWithResult() {
            setOnQueryTextListener setonquerytextlistener = null;
            this(0, setonquerytextlistener, 3, setonquerytextlistener);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                int i2 = onNavigationEvent + 79;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                return false;
            }
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onNavigationEvent = i2 % 128;
            int iHashCode = i2 % 2 == 0 ? (Integer.hashCode(this.onExtraCallbackWithResult) * 24) / this.onWarmupCompleted.hashCode() : (Integer.hashCode(this.onExtraCallbackWithResult) * 31) + this.onWarmupCompleted.hashCode();
            int i3 = onNavigationEvent + 71;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 97 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Tween(durationMillis=" + this.onExtraCallbackWithResult + ", easing=" + this.onWarmupCompleted + ")";
            int i2 = onNavigationEvent + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(int i, @NotNull setOnQueryTextListener setonquerytextlistener) {
            Intrinsics.checkNotNullParameter(setonquerytextlistener, "");
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = setonquerytextlistener;
        }

        public /* synthetic */ onExtraCallbackWithResult(int i, setOnQueryTextListener setonquerytextlistener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onNavigationEvent;
                int i4 = i3 + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2 != 0 ? 8106 : 500;
                int i6 = i3 + 123;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                i = i5;
            }
            if ((i2 & 2) != 0) {
                setonquerytextlistener = new setInputType(0.215f, 0.61f, 0.355f, 1.0f);
                int i9 = onNavigationEvent + 71;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            }
            this(i, setonquerytextlistener);
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final setOnQueryTextListener onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            setOnQueryTextListener setonquerytextlistener = this.onWarmupCompleted;
            int i5 = i3 + 109;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return setonquerytextlistener;
            }
            throw null;
        }
    }
}
