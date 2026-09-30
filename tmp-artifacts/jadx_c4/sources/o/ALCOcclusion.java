package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ALCOcclusion {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallbackWithResult;

    ALCLiveness onExtraCallback(@NotNull String str);

    ALCLiveness onExtraCallbackWithResult(@NotNull String str);

    public static final class onNavigationEvent {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();
        private static final ALCOcclusion IAuthTabCallback = new C0012onNavigationEvent();

        /* renamed from: o.ALCOcclusion$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public static final class C0012onNavigationEvent implements ALCOcclusion {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // o.ALCOcclusion
            public ALCLiveness onExtraCallback(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 93;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.ALCOcclusion
            public ALCLiveness onExtraCallbackWithResult(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                int i4 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return null;
            }

            C0012onNavigationEvent() {
            }
        }

        private onNavigationEvent() {
        }

        static {
            int i = onWarmupCompleted + 85;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public final ALCOcclusion onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 109;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback;
            }
            throw null;
        }
    }
}
