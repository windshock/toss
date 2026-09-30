package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g {
    public static final r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g IAuthTabCallback = new r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g();
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambda1YKMUYhshQkW0ewPXMCGMb2N1g() {
    }

    public static abstract class onWarmupCompleted {
        private final float onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(float f, DefaultConstructorMarker defaultConstructorMarker) {
            this(f);
        }

        private onWarmupCompleted(float f) {
            this.onNavigationEvent = f;
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private final float onNavigationEvent;

            public /* synthetic */ onNavigationEvent(float f, DefaultConstructorMarker defaultConstructorMarker) {
                this(f);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 73;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    int i5 = i4 + 73;
                    onWarmupCompleted = i5 % 128;
                    return i5 % 2 != 0;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    int i6 = i2 + 27;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, ((onNavigationEvent) obj).onNavigationEvent)) {
                    return true;
                }
                int i8 = onWarmupCompleted + 101;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int iOnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 55;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent);
                    int i3 = 79 / 0;
                } else {
                    iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent);
                }
                int i4 = onWarmupCompleted + 89;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return iOnWarmupCompleted;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Bottom(margin=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ")";
                int i2 = onExtraCallback + 7;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            private onNavigationEvent(float f) {
                super(f, null);
                this.onNavigationEvent = f;
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 85;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(!(obj instanceof IAuthTabCallback))) {
                    return true;
                }
                int i7 = i2 + 65;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i2 + 91;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 15;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return -6643950;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 59;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 46 / 0;
                }
                int i5 = i2 + 117;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return "Top";
            }

            private IAuthTabCallback() {
                super(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), null);
            }
        }
    }
}
