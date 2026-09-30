package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class isAxonEventTracked {
    public static final onWarmupCompleted Companion;
    private static final isAxonEventTracked IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private final int onExtraCallback;
    private final String onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public isAxonEventTracked() {
        String str = null;
        this(str, 0, 3, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 117;
        int i4 = i3 % 128;
        onTransact = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 73;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof isAxonEventTracked) {
            isAxonEventTracked isaxoneventtracked = (isAxonEventTracked) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, isaxoneventtracked.onWarmupCompleted) && this.onExtraCallback == isaxoneventtracked.onExtraCallback;
        }
        int i6 = i4 + 31;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + Integer.hashCode(this.onExtraCallback);
        int i4 = onTransact + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 67;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i3 + 79;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SmsRetrieveInfo(code=" + this.onWarmupCompleted + ", simId=" + this.onExtraCallback + ")";
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public isAxonEventTracked(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        this.onExtraCallback = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ isAxonEventTracked(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onTransact + 69;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            str = "";
        }
        if ((i2 & 2) != 0) {
            int i5 = IAuthTabCallbackDefault + 31;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            i = -1;
        }
        this(str, i);
    }

    public static final /* synthetic */ isAxonEventTracked onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i2 + 95;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return i4;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final isAxonEventTracked onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            isAxonEventTracked isaxoneventtrackedOnNavigationEvent = isAxonEventTracked.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return isaxoneventtrackedOnNavigationEvent;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        IAuthTabCallback = new isAxonEventTracked(defaultConstructorMarker, 0, 3, defaultConstructorMarker);
        int i = onNavigationEvent + 49;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
