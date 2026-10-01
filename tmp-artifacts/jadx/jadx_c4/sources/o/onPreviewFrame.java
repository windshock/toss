package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface onPreviewFrame {

    public static final class onWarmupCompleted implements onPreviewFrame {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 59;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof onWarmupCompleted))) {
                return true;
            }
            int i4 = onWarmupCompleted + 35;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return -498369005;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 27 / 0;
            }
            return "Null";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallback implements onPreviewFrame {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final boolean onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 53;
                onExtraCallback = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i3 = onExtraCallback + 7;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.onExtraCallbackWithResult == ((onExtraCallback) obj).onExtraCallbackWithResult) {
                return true;
            }
            int i5 = onExtraCallback + 15;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
            int i4 = onExtraCallback + 69;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 85 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Bool(value=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallback(boolean z) {
            this.onExtraCallbackWithResult = z;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements onPreviewFrame {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final int onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 103;
                onWarmupCompleted = i3 % 128;
                boolean z = i3 % 2 != 0;
                int i4 = i2 + 79;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i6 = onWarmupCompleted + 103;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
            if (this.onNavigationEvent == ((onExtraCallbackWithResult) obj).onNavigationEvent) {
                return true;
            }
            int i7 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onNavigationEvent);
            int i4 = onWarmupCompleted + 113;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Int(value=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(int i) {
            this.onNavigationEvent = i;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 61;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    public static final class IAuthTabCallback implements onPreviewFrame {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final double onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 15;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i4 = onNavigationEvent + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Double.compare(this.onExtraCallbackWithResult, ((IAuthTabCallback) obj).onExtraCallbackWithResult) == 0) {
                return true;
            }
            int i6 = onExtraCallback + 83;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return Double.hashCode(this.onExtraCallbackWithResult);
            }
            Double.hashCode(this.onExtraCallbackWithResult);
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Double(value=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(double d) {
            this.onExtraCallbackWithResult = d;
        }

        public final double onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            int i3 = 79 / 0;
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallbackDefault implements onPreviewFrame {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final String IAuthTabCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 99;
                onNavigationEvent = i2 % 128;
                return i2 % 2 != 0;
            }
            if (obj instanceof IAuthTabCallbackDefault) {
                if (Intrinsics.areEqual(this.IAuthTabCallback, ((IAuthTabCallbackDefault) obj).IAuthTabCallback)) {
                    return true;
                }
                int i3 = onExtraCallback + 119;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = onNavigationEvent + 81;
            int i6 = i5 % 128;
            onExtraCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 31;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.IAuthTabCallback.hashCode();
            int i4 = onNavigationEvent + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Str(value=" + this.IAuthTabCallback + ")";
            int i2 = onNavigationEvent + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallbackDefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 73;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class onNavigationEvent implements onPreviewFrame {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final String onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i2 = IAuthTabCallback + 63;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, ((onNavigationEvent) obj).onExtraCallback)) {
                return true;
            }
            int i4 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.onExtraCallback.hashCode();
                throw null;
            }
            int iHashCode = this.onExtraCallback.hashCode();
            int i3 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Json(raw=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 63;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 33 / 0;
            }
            return str;
        }

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 57;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 83;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
