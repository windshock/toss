package o;

import java.util.NoSuchElementException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class detect<T> {
    public static final onExtraCallback Companion;
    private static final detect<Object> IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final T onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public detect() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Optional(value=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public detect(@Nullable T t) {
        this.onWarmupCompleted = t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ detect(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 18 / 0;
            }
            int i5 = i2 + 121;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            obj = null;
        }
        this(obj);
    }

    public static final /* synthetic */ detect onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        detect<Object> detectVar = IAuthTabCallback;
        int i5 = i2 + 103;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return detectVar;
    }

    public final T onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onWarmupCompleted;
        int i5 = i2 + 103;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return t;
        }
        throw null;
    }

    public final T IAuthTabCallback() {
        int i = 2 % 2;
        T t = this.onWarmupCompleted;
        if (t == null) {
            throw new NoSuchElementException("No value present");
        }
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 5;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = i2 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return t;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.onWarmupCompleted == null) {
            int i5 = i2 + 21;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i2 + 77;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.onWarmupCompleted == null) {
            return false;
        }
        int i4 = i2 + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        detect detectVar;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        T t = this.onWarmupCompleted;
        T t2 = null;
        if (!(obj instanceof detect)) {
            detectVar = null;
        } else {
            detectVar = (detect) obj;
            int i2 = IAuthTabCallbackStub + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        if (detectVar != null) {
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                T t3 = detectVar.onWarmupCompleted;
                t2.hashCode();
                throw null;
            }
            t2 = detectVar.onWarmupCompleted;
        }
        return Intrinsics.areEqual(t, t2);
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 121;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        T t = this.onWarmupCompleted;
        if (t == null) {
            return super.hashCode();
        }
        int i5 = i2 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            iHashCode = t.hashCode();
            int i6 = 19 / 0;
        } else {
            iHashCode = t.hashCode();
        }
        int i7 = onExtraCallbackWithResult + 49;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        @JvmStatic
        public final <T> detect<T> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            detect<T> detectVarOnExtraCallback = detect.onExtraCallback();
            Intrinsics.checkNotNull(detectVarOnExtraCallback, "");
            int i4 = onWarmupCompleted + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return detectVarOnExtraCallback;
        }

        @JvmStatic
        public final <T> detect<T> onExtraCallback(@Nullable T t) {
            detect<T> detectVarOnWarmupCompleted;
            int i = 2 % 2;
            if (t != null) {
                return new detect<>(t);
            }
            int i2 = onWarmupCompleted + 63;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                detectVarOnWarmupCompleted = onWarmupCompleted();
                int i3 = 94 / 0;
            } else {
                detectVarOnWarmupCompleted = onWarmupCompleted();
            }
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return detectVarOnWarmupCompleted;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        IAuthTabCallback = new detect<>(defaultConstructorMarker, 1, defaultConstructorMarker);
        int i = onExtraCallback + 7;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
