package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class Authenticator {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private final int onExtraCallbackWithResult;
    private final Number onWarmupCompleted;

    static {
        int i = onExtraCallback + 99;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ Authenticator(int i, Number number, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, number);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private Authenticator(int i, Number number) {
        this.onExtraCallbackWithResult = i;
        this.onWarmupCompleted = number;
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 79;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final Number onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Number number = this.onWarmupCompleted;
        int i4 = i2 + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return number;
    }

    public static final class onNavigationEvent extends Authenticator {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public onNavigationEvent(int i, int i2) {
            super(i, Integer.valueOf(i2), null);
        }

        public boolean equals(@Nullable Object obj) {
            onNavigationEvent onnavigationevent;
            int i = 2 % 2;
            boolean z = obj instanceof onNavigationEvent;
            Number numberOnWarmupCompleted = null;
            int i2 = onWarmupCompleted;
            if (z) {
                int i3 = i2 + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent = (onNavigationEvent) obj;
            } else {
                int i5 = i2 + 41;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                onnavigationevent = null;
            }
            if (onnavigationevent == null) {
                return false;
            }
            int i7 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (onNavigationEvent() != onnavigationevent.onNavigationEvent()) {
                return false;
            }
            Number numberOnWarmupCompleted2 = onWarmupCompleted();
            onNavigationEvent onnavigationevent2 = z ? (onNavigationEvent) obj : null;
            if (onnavigationevent2 != null) {
                int i9 = onWarmupCompleted + 69;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    onnavigationevent2.onWarmupCompleted();
                    throw null;
                }
                numberOnWarmupCompleted = onnavigationevent2.onWarmupCompleted();
            }
            return Intrinsics.areEqual(numberOnWarmupCompleted2, numberOnWarmupCompleted);
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = onNavigationEvent.class.hashCode();
                int i3 = 56 / 0;
            } else {
                iHashCode = onNavigationEvent.class.hashCode();
            }
            int i4 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }
    }

    public static final class onExtraCallbackWithResult extends Authenticator {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            boolean z = obj instanceof onExtraCallbackWithResult;
            Number numberOnWarmupCompleted = null;
            onExtraCallbackWithResult onextracallbackwithresult = z ? (onExtraCallbackWithResult) obj : null;
            if (onextracallbackwithresult == null || onNavigationEvent() != onextracallbackwithresult.onNavigationEvent()) {
                return false;
            }
            Number numberOnWarmupCompleted2 = onWarmupCompleted();
            onExtraCallbackWithResult onextracallbackwithresult2 = z ? (onExtraCallbackWithResult) obj : null;
            if (onextracallbackwithresult2 != null) {
                int i2 = onWarmupCompleted + 19;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                numberOnWarmupCompleted = onextracallbackwithresult2.onWarmupCompleted();
                if (i3 != 0) {
                    int i4 = 61 / 0;
                }
            }
            if (!Intrinsics.areEqual(numberOnWarmupCompleted2, numberOnWarmupCompleted)) {
                return false;
            }
            int i5 = onNavigationEvent + 123;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult.class.hashCode();
            }
            onExtraCallbackWithResult.class.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
