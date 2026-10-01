package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setByType {
    String onExtraCallback();

    onWarmupCompleted onExtraCallbackWithResult(@NotNull String str, @NotNull Map<String, String> map);

    Map<String, String> onNavigationEvent();

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final Map<String, String> onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 53;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i5 = i2 + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return true;
            }
            int i6 = onExtraCallbackWithResult + 37;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 52 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Result(url=" + this.onWarmupCompleted + ", headers=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onWarmupCompleted = str;
            this.onNavigationEvent = map;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 91;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final Map<String, String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 65;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Map<String, String> map = this.onNavigationEvent;
            int i5 = i2 + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ onWarmupCompleted onNavigationEvent(setByType setbytype, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: proceed");
        }
        if ((i & 1) != 0) {
            str = setbytype.onExtraCallback();
        }
        if ((i & 2) != 0) {
            map = setbytype.onNavigationEvent();
        }
        return setbytype.onExtraCallbackWithResult(str, map);
    }
}
