package o;

import j$.time.ZonedDateTime;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getUnreadableElfFilesCount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CmpServiceImplb implements getUnreadableElfFilesCount<ZonedDateTime> {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final ZonedDateTime onNavigationEvent;
    private final ZonedDateTime onWarmupCompleted;

    static {
        int i = onExtraCallback + 117;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackDefault + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CmpServiceImplb)) {
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        CmpServiceImplb cmpServiceImplb = (CmpServiceImplb) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, cmpServiceImplb.onWarmupCompleted)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, cmpServiceImplb.onNavigationEvent)) {
            return true;
        }
        int i6 = onExtraCallbackWithResult + 51;
        IAuthTabCallbackDefault = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallbackDefault + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DateTimeRange(start=" + this.onWarmupCompleted + ", endInclusive=" + this.onNavigationEvent + ")";
        int i2 = IAuthTabCallbackDefault + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public CmpServiceImplb(@NotNull ZonedDateTime zonedDateTime, @NotNull ZonedDateTime zonedDateTime2) {
        Intrinsics.checkNotNullParameter(zonedDateTime, "");
        Intrinsics.checkNotNullParameter(zonedDateTime2, "");
        this.onWarmupCompleted = zonedDateTime;
        this.onNavigationEvent = zonedDateTime2;
    }

    public /* synthetic */ boolean contains(Comparable comparable) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent((ZonedDateTime) comparable);
        int i4 = IAuthTabCallbackDefault + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return zOnNavigationEvent;
    }

    public /* synthetic */ Comparable getEndInclusive() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ZonedDateTime zonedDateTimeIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zonedDateTimeIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Comparable getStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ZonedDateTime zonedDateTimeOnWarmupCompleted = onWarmupCompleted();
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zonedDateTimeOnWarmupCompleted;
        }
        throw null;
    }

    public boolean isEmpty() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = getUnreadableElfFilesCount.IAuthTabCallback.onWarmupCompleted(this);
        int i4 = IAuthTabCallbackDefault + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public boolean onNavigationEvent(@NotNull ZonedDateTime zonedDateTime) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = getUnreadableElfFilesCount.IAuthTabCallback.onExtraCallback(this, zonedDateTime);
        int i4 = IAuthTabCallbackDefault + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ZonedDateTime onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ZonedDateTime IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ZonedDateTime zonedDateTime = this.onNavigationEvent;
        int i4 = i3 + 103;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zonedDateTime;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final CmpServiceImplb onExtraCallback(@Nullable ZonedDateTime zonedDateTime, @Nullable ZonedDateTime zonedDateTime2) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (zonedDateTime != null) {
                int i5 = i2 + 89;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                if (zonedDateTime2 != null) {
                    return new CmpServiceImplb(zonedDateTime, zonedDateTime2);
                }
            }
            return null;
        }
    }
}
