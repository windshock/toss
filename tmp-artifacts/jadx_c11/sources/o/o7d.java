package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class o7d {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final float IAuthTabCallback;
    private final float onNavigationEvent;

    public o7d(float f, float f2) {
        this.IAuthTabCallback = f;
        this.onNavigationEvent = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o7d(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            f2 = i2 % 2 != 0 ? 2.0f : 1.0f;
            int i3 = 2 % 2;
        }
        this(f, f2);
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i3 + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.onNavigationEvent;
        int i4 = i3 + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public static final class onExtraCallback extends o7d {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onNavigationEvent + 51;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return true;
            }
            int i4 = onNavigationEvent + 93;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 61;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return -2080085419;
            }
            throw null;
        }

        @Override // o.o7d
        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return "Impression20";
        }

        private onExtraCallback() {
            super(0.2f, 0.0f, 2, null);
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = this.IAuthTabCallback;
        if (i3 != 0) {
            return String.valueOf(f);
        }
        String.valueOf(f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
