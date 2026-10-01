package im.toss.url.resolver.internal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegistrationContext<H> {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private boolean onWarmupCompleted = true;
    private boolean onExtraCallbackWithResult = true;
    private final List<Registration<H>> onExtraCallback = new ArrayList();
    private final Set<String> onNavigationEvent = new LinkedHashSet();

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean onWarmupCompleted() {
        boolean z;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.onExtraCallbackWithResult;
            int i4 = 80 / 0;
        } else {
            z = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 83;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<Registration<H>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Set<String> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public static final class Registration<H> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private final Set<String> IAuthTabCallback;
        private final H onExtraCallbackWithResult;
        private final String onWarmupCompleted;

        public Registration(@NotNull String str, @NotNull Set<String> set, H h) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(set, "");
            this.onWarmupCompleted = str;
            this.IAuthTabCallback = set;
            this.onExtraCallbackWithResult = h;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public final Set<String> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Set<String> set = this.IAuthTabCallback;
            int i5 = i3 + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return set;
        }

        public final H IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            H h = this.onExtraCallbackWithResult;
            int i5 = i3 + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return h;
            }
            throw null;
        }
    }
}
