package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PrepareCallbackImpl2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final List<onExtraCallback> onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PrepareCallbackImpl2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((PrepareCallbackImpl2) obj).onNavigationEvent)) {
            return true;
        }
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionHiddenSaveParameterDto(items=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return str;
    }

    public PrepareCallbackImpl2(@NotNull List<onExtraCallback> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    public final List<onExtraCallback> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<onExtraCallback> list = this.onNavigationEvent;
        int i4 = i2 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        private final String IAuthTabCallback;
        private final List<String> onExtraCallbackWithResult;
        private final boolean onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                int i4 = onExtraCallback + 63;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback)) {
                if (this.onNavigationEvent == onextracallback.onNavigationEvent) {
                    return true;
                }
                int i6 = onExtraCallback + 21;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = onExtraCallback + 27;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 121;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            return i3 != 0 ? (((iHashCode / 91) + this.IAuthTabCallback.hashCode()) * 42) >> Boolean.hashCode(this.onNavigationEvent) : (((iHashCode * 31) + this.IAuthTabCallback.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "HiddenTransaction(sourceIds=" + this.onExtraCallbackWithResult + ", timelineTime=" + this.IAuthTabCallback + ", hidden=" + this.onNavigationEvent + ")";
            int i2 = onWarmupCompleted + 29;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(@NotNull List<String> list, @NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = list;
            this.IAuthTabCallback = str;
            this.onNavigationEvent = z;
        }

        public final List<String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 77;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            List<String> list = this.onExtraCallbackWithResult;
            int i5 = i2 + 65;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallback;
            int i5 = i2 + 33;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 53;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }
}
