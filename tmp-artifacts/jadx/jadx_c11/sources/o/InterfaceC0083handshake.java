package o;

import org.jetbrains.annotations.Nullable;

/* renamed from: o.handshake, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface InterfaceC0083handshake {
    public static final onExtraCallback Companion = onExtraCallback.onNavigationEvent;

    float onExtraCallbackWithResult(float f);

    /* renamed from: o.handshake$onNavigationEvent */
    public static final class onNavigationEvent implements InterfaceC0083handshake {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final float IAuthTabCallback;

        public onNavigationEvent(float f) {
            this.IAuthTabCallback = f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float f = this.IAuthTabCallback;
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            return f;
        }

        @Override // o.InterfaceC0083handshake
        public float onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 43;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            float f2 = f * this.IAuthTabCallback;
            int i5 = i2 + 35;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 56 / 0;
            }
            return f2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(!(obj instanceof onNavigationEvent))) {
                    return this.IAuthTabCallback == ((onNavigationEvent) obj).IAuthTabCallback;
                }
                int i2 = onNavigationEvent + 103;
                onWarmupCompleted = i2 % 128;
                return i2 % 2 != 0;
            }
            int i3 = onNavigationEvent;
            int i4 = i3 + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 19;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Float.hashCode(this.IAuthTabCallback);
            int i4 = onWarmupCompleted + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }
    }

    /* renamed from: o.handshake$onExtraCallback */
    public static final class onExtraCallback {
        private static int asInterface = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        static final /* synthetic */ onExtraCallback onNavigationEvent = new onExtraCallback();
        private static final InterfaceC0083handshake IAuthTabCallback = new IAuthTabCallback();

        private onExtraCallback() {
        }

        /* renamed from: o.handshake$onExtraCallback$IAuthTabCallback */
        public static final class IAuthTabCallback implements InterfaceC0083handshake {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            IAuthTabCallback() {
            }

            @Override // o.InterfaceC0083handshake
            public float onExtraCallbackWithResult(float f) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                float fOnExtraCallback = protocol.onExtraCallback(f, null, 2, null);
                int i4 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return fOnExtraCallback;
                }
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i = onExtraCallback + 75;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final InterfaceC0083handshake IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            InterfaceC0083handshake interfaceC0083handshake = IAuthTabCallback;
            int i5 = i2 + 37;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return interfaceC0083handshake;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
