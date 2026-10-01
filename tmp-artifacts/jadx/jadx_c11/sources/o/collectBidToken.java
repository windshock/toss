package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class collectBidToken {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private volatile onNavigationEvent IAuthTabCallback;
    private final Function1<String, String> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public collectBidToken(@NotNull Function1<? super String, String> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
    }

    public final String onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent onnavigationevent = this.IAuthTabCallback;
        if (onnavigationevent != null && Intrinsics.areEqual(onnavigationevent.onNavigationEvent(), str)) {
            return onnavigationevent.onWarmupCompleted();
        }
        String str2 = (String) this.onWarmupCompleted.invoke(str);
        this.IAuthTabCallback = new onNavigationEvent(str, str2);
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    static final class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;

        public onNavigationEvent(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = str2;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallback;
            int i5 = i2 + 7;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }
}
