package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface wwx1 {
    String onWarmupCompleted();

    public static final class onExtraCallback implements wwx1 {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        private onExtraCallback() {
        }

        @Override // o.wwx1
        public String onWarmupCompleted() {
            return "expected an Int value";
        }
    }

    public static final class onExtraCallbackWithResult implements wwx1 {
        private final int onNavigationEvent;

        public onExtraCallbackWithResult(int i) {
            this.onNavigationEvent = i;
        }

        @Override // o.wwx1
        public String onWarmupCompleted() {
            return "expected at most " + this.onNavigationEvent + " digits";
        }
    }

    public static final class onNavigationEvent implements wwx1 {
        private final int onExtraCallback;

        public onNavigationEvent(int i) {
            this.onExtraCallback = i;
        }

        @Override // o.wwx1
        public String onWarmupCompleted() {
            return "expected at least " + this.onExtraCallback + " digits";
        }
    }

    public static final class onWarmupCompleted implements wwx1 {
        private final String IAuthTabCallback;

        public onWarmupCompleted(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        @Override // o.wwx1
        public String onWarmupCompleted() {
            return "expected '" + this.IAuthTabCallback + '\'';
        }
    }

    public static final class IAuthTabCallback implements wwx1 {
        private final Object onNavigationEvent;

        public IAuthTabCallback(@NotNull Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            this.onNavigationEvent = obj;
        }

        @Override // o.wwx1
        public String onWarmupCompleted() {
            return "attempted to overwrite the existing value '" + this.onNavigationEvent + '\'';
        }
    }
}
