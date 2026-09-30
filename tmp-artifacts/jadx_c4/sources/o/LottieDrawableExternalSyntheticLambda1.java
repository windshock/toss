package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface LottieDrawableExternalSyntheticLambda1 extends LottieCompositionFactoryExternalSyntheticLambda13 {
    void IAuthTabCallback(long j);

    long IAuthTabCallbackDefault();

    boolean IAuthTabCallbackStub();

    long asBinder();

    int onExtraCallback();

    void onExtraCallback(long j);

    int onExtraCallbackWithResult();

    void onNavigationEvent(long j);

    LottieCompositionFactoryExternalSyntheticLambda7 onTransact();

    void onWarmupCompleted(long j);

    public static abstract class onWarmupCompleted {
        private final QuirkSettingsLoader onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(QuirkSettingsLoader quirkSettingsLoader, DefaultConstructorMarker defaultConstructorMarker) {
            this(quirkSettingsLoader);
        }

        /* renamed from: o.LottieDrawableExternalSyntheticLambda1$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0016onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final C0016onWarmupCompleted onExtraCallback = new C0016onWarmupCompleted();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 65;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i5 = i4 + 7;
                    IAuthTabCallback = i5 % 128;
                    return i5 % 2 != 0;
                }
                if (!(obj instanceof C0016onWarmupCompleted)) {
                    return false;
                }
                int i6 = i2 + 31;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 69;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return 1943680059;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 121;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 121;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "Center";
            }

            private C0016onWarmupCompleted() {
                super(QuirkSettingsLoader.Companion.onExtraCallback(), null);
            }
        }

        private onWarmupCompleted(QuirkSettingsLoader quirkSettingsLoader) {
            this.onNavigationEvent = quirkSettingsLoader;
        }
    }
}
