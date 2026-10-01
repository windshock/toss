package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class getBoolean {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final boolean IAuthTabCallback;

    public /* synthetic */ getBoolean(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private getBoolean(boolean z) {
        this.IAuthTabCallback = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getBoolean(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 63;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 41;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(z, null);
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onTransact extends getBoolean {
        public static final onTransact onExtraCallbackWithResult = new onTransact();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 51;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onTransact() {
            super(true, null);
        }
    }

    public static final class IAuthTabCallbackStub extends getBoolean {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackStub onExtraCallback = new IAuthTabCallbackStub();
        private static int onExtraCallbackWithResult;

        static {
            int i = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallbackStub() {
            super(false, 1, null);
        }
    }

    public static final class onExtraCallbackWithResult extends getBoolean {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        static {
            int i = onNavigationEvent + 81;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onExtraCallbackWithResult() {
            super(false, 1, null);
        }
    }

    public static final class asBinder extends getBoolean {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final asBinder onWarmupCompleted = new asBinder();

        static {
            int i = onNavigationEvent + 71;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        private asBinder() {
            super(true, null);
        }
    }
}
