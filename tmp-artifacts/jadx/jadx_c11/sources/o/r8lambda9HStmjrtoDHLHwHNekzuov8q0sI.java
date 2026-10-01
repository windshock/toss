package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface r8lambda9HStmjrtoDHLHwHNekzuov8q0sI {
    public static final onWarmupCompleted Companion = onWarmupCompleted.onExtraCallbackWithResult;

    getDelegateokhttp onWarmupCompleted(@NotNull r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, @NotNull pin pinVar, long j);

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        static final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI onExtraCallback = onPostbackFailure.onExtraCallback(null, 0.0f, null, null, 15, null);

        private onWarmupCompleted() {
        }

        static {
            int i = IAuthTabCallback + 97;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public final r8lambda9HStmjrtoDHLHwHNekzuov8q0sI onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            r8lambda9HStmjrtoDHLHwHNekzuov8q0sI r8lambda9hstmjrtodhlhwhnekzuov8q0si = onExtraCallback;
            int i5 = i3 + 75;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return r8lambda9hstmjrtodhlhwhnekzuov8q0si;
        }
    }
}
