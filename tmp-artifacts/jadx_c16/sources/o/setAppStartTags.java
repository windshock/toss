package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class setAppStartTags {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final boolean onNavigationEvent;

    static {
        int i = onExtraCallback + 71;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    public /* synthetic */ setAppStartTags(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String onExtraCallbackWithResult();

    private setAppStartTags() {
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.onNavigationEvent;
        int i4 = i2 + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static final class onExtraCallback extends setAppStartTags {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final boolean onExtraCallbackWithResult;

        public onExtraCallback() {
            this(false, 1, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 81;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 22 / 0;
                }
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return this.onExtraCallbackWithResult == ((onExtraCallback) obj).onExtraCallbackWithResult;
            }
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
                int i3 = 3 / 0;
            } else {
                iHashCode = Boolean.hashCode(this.onExtraCallbackWithResult);
            }
            int i4 = onWarmupCompleted + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Search(clearBackStack=" + this.onExtraCallbackWithResult + ")";
            int i2 = onWarmupCompleted + 53;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(boolean z) {
            super(null);
            this.onExtraCallbackWithResult = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onWarmupCompleted;
                int i3 = i2 + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 55;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                z = false;
            }
            this(z);
        }

        @Override // o.setAppStartTags
        public boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            boolean z = this.onExtraCallbackWithResult;
            int i5 = i3 + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        @Override // o.setAppStartTags
        public String onExtraCallbackWithResult() {
            String strIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                strIAuthTabCallback = onVisit.IAuthTabCallback(this);
                int i3 = 28 / 0;
            } else {
                strIAuthTabCallback = onVisit.IAuthTabCallback(this);
            }
            int i4 = onWarmupCompleted + 55;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return strIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
