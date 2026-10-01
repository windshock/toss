package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface clampToInt {
    public static final IAuthTabCallback Companion = IAuthTabCallback.onWarmupCompleted;

    maxAge onExtraCallback();

    void onExtraCallback(@NotNull maxAge maxage);

    float onExtraCallbackWithResult();

    void onNavigationEvent(float f);

    public static final class IAuthTabCallback {
        private static int asInterface = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        static final /* synthetic */ IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();
        private static final clampToInt IAuthTabCallback = new C0012IAuthTabCallback();

        /* renamed from: o.clampToInt$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0012IAuthTabCallback implements clampToInt {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // o.clampToInt
            public void onExtraCallback(maxAge maxage) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(maxage, "");
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.clampToInt
            public float onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                IAuthTabCallback = i2 % 128;
                return i2 % 2 != 0 ? 2.0f : 1.0f;
            }

            @Override // o.clampToInt
            public void onNavigationEvent(float f) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 87;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 48 / 0;
                }
            }

            C0012IAuthTabCallback() {
            }

            @Override // o.clampToInt
            public maxAge onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 111;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                maxAge maxage = maxAge.System;
                int i4 = IAuthTabCallback + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return maxage;
            }
        }

        private IAuthTabCallback() {
        }

        static {
            int i = onExtraCallbackWithResult + 51;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 97 / 0;
            }
        }

        public final clampToInt onExtraCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 25;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallback;
            }
            throw null;
        }
    }
}
