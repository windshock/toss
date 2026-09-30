package o;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class O0 {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub;
    private static int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    static {
        int i = IAuthTabCallback + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 23;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o0 = (O0) obj;
        if (this.onWarmupCompleted != o0.onWarmupCompleted) {
            int i6 = i2 + 85;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult != o0.onExtraCallbackWithResult) {
            return false;
        }
        if (this.onNavigationEvent == o0.onNavigationEvent) {
            return true;
        }
        int i8 = i4 + 67;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.onWarmupCompleted) << 112) % Integer.hashCode(this.onExtraCallbackWithResult)) >>> 54) << Integer.hashCode(this.onNavigationEvent) : (((Integer.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Integer.hashCode(this.onNavigationEvent);
        int i3 = IAuthTabCallbackStub + 115;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 18 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsBadgeV1Spec(radius=" + this.onWarmupCompleted + ", verticalPadding=" + this.onExtraCallbackWithResult + ", horizontalPadding=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackDefault + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public O0(int i, int i2, int i3) {
        this.onWarmupCompleted = i;
        this.onExtraCallbackWithResult = i2;
        this.onNavigationEvent = i3;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 123;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 91;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i2 + 125;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onNavigationEvent;
        if (i3 != 0) {
            int i5 = 29 / 0;
        }
        return i4;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final int IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            int iCoerceIn = RangesKt.coerceIn(getBacktraceNoteBytes.IAuthTabCallback((f * 0.236d) + 6.42d), ((Number) CollectionsKt.first(R0.onExtraCallback().keySet())).intValue(), ((Number) CollectionsKt.last(R0.onExtraCallback().keySet())).intValue());
            int i4 = onExtraCallback + 7;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return iCoerceIn;
        }
    }
}
