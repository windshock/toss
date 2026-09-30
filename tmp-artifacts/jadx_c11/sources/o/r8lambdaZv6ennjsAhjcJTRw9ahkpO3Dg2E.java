package o;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final long IAuthTabCallback;
    private final long onExtraCallbackWithResult;
    private final IAuthTabCallback onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E)) {
            int i5 = i2 + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e = (r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E) obj;
        if (this.onWarmupCompleted != r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.onWarmupCompleted) {
            return false;
        }
        if (this.IAuthTabCallback == r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.IAuthTabCallback) {
            return this.onExtraCallbackWithResult == r8lambdazv6ennjsahjcjtrw9ahkpo3dg2e.onExtraCallbackWithResult;
        }
        int i6 = i4 + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        return i2 % 2 == 0 ? (((r0 / 127) + Long.hashCode(this.IAuthTabCallback)) - 75) >>> Long.hashCode(this.onExtraCallbackWithResult) : (((this.onWarmupCompleted.hashCode() * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + Long.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ComposableMetric(phase=" + this.onWarmupCompleted + ", startTime=" + this.IAuthTabCallback + ", endTime=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public r8lambdaZv6ennjsAhjcJTRw9ahkpO3Dg2E(@NotNull IAuthTabCallback iAuthTabCallback, long j, long j2) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onWarmupCompleted = iAuthTabCallback;
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = j2;
    }

    public final IAuthTabCallback onExtraCallback() {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            iAuthTabCallback = this.onWarmupCompleted;
            int i4 = 17 / 0;
        } else {
            iAuthTabCallback = this.onWarmupCompleted;
        }
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final IAuthTabCallback Composition = new IAuthTabCallback("Composition", 0);
        public static final IAuthTabCallback Measure = new IAuthTabCallback("Measure", 1);
        public static final IAuthTabCallback Place = new IAuthTabCallback("Place", 2);
        public static final IAuthTabCallback Draw = new IAuthTabCallback("Draw", 3);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {Composition, Measure, Place, Draw};
            int i5 = i2 + 23;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 == 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 41;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        long jIAuthTabCallback = setCommandLine.IAuthTabCallback(this.onExtraCallbackWithResult - this.IAuthTabCallback, setRevision.NANOSECONDS);
        int i4 = onNavigationEvent + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return jIAuthTabCallback;
    }
}
