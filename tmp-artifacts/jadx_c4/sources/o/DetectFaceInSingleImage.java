package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface DetectFaceInSingleImage {
    Object onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, @NotNull onNavigationEvent onnavigationevent, @NotNull access13800<? super Map<String, ? extends Object>> access13800Var);

    public static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final String onExtraCallback;
        private final Long onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public onNavigationEvent() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onnavigationevent.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                int i3 = IAuthTabCallback + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = IAuthTabCallback + 105;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 25 / 0;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Long l = this.onExtraCallbackWithResult;
            int iHashCode3 = 0;
            if (l == null) {
                int i5 = i3 + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = l.hashCode();
            }
            String str = this.onWarmupCompleted;
            if (str == null) {
                int i7 = onNavigationEvent + 3;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
            String str2 = this.onExtraCallback;
            if (str2 != null) {
                int i9 = IAuthTabCallback + 87;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    str2.hashCode();
                    throw null;
                }
                iHashCode3 = str2.hashCode();
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Context(schemaId=" + this.onExtraCallbackWithResult + ", logName=" + this.onWarmupCompleted + ", logType=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onNavigationEvent(@Nullable Long l, @Nullable String str, @Nullable String str2) {
            this.onExtraCallbackWithResult = l;
            this.onWarmupCompleted = str;
            this.onExtraCallback = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onNavigationEvent(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 99;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    int i4 = 94 / 0;
                }
                int i5 = i3 + 55;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                l = null;
            }
            str = (i & 2) != 0 ? null : str;
            if ((i & 4) != 0) {
                int i8 = IAuthTabCallback + 87;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 75 / 0;
                }
                int i10 = 2 % 2;
                str2 = null;
            }
            this(l, str, str2);
        }

        public final Long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Long l = this.onExtraCallbackWithResult;
            int i5 = i3 + 37;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return l;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 85;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
