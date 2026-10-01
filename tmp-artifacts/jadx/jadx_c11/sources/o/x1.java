package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface x1 {
    public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallback;

    public static final class onExtraCallback implements x1 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 103;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof o.x1.onExtraCallback) == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r2 = r2 + 41;
            o.x1.onExtraCallback.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 23;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 9 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return -1970389074;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return "BackPress";
            }
            obj.hashCode();
            throw null;
        }

        private onExtraCallback() {
        }
    }

    public static final class IAuthTabCallback implements x1 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onNavigationEvent + 87;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 13;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (!(!(obj instanceof IAuthTabCallback))) {
                return true;
            }
            int i6 = i3 + 35;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return -12775608;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return "OutsideTouch";
            }
            throw null;
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onWarmupCompleted implements x1 {
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 47;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if ((r7 instanceof o.x1.onWarmupCompleted) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        
            r1 = r1 + 43;
            o.x1.onWarmupCompleted.IAuthTabCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r3 = r3 + 65;
            o.x1.onWarmupCompleted.onExtraCallbackWithResult = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if ((r3 % 2) == 0) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 119;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                int i5 = 83 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return 1212371426;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 109;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return "Drag";
        }

        private onWarmupCompleted() {
        }
    }

    public static final class onExtraCallbackWithResult<T> implements x1 {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private final T onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return Intrinsics.areEqual(this.onExtraCallback, ((onExtraCallbackWithResult) obj).onExtraCallback);
            }
            int i5 = i3 + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onExtraCallback.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.onExtraCallback.hashCode();
            int i3 = IAuthTabCallback + 33;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UserDefined(payloads=" + this.onExtraCallback + ")";
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            this.onExtraCallback = t;
        }

        public final T IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            T t = this.onExtraCallback;
            int i5 = i2 + 3;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }
    }

    public static final class onNavigationEvent {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        static final /* synthetic */ onNavigationEvent onExtraCallback = new onNavigationEvent();
        private static final onExtraCallbackWithResult<Unit> IAuthTabCallback = new onExtraCallbackWithResult<>(Unit.INSTANCE);

        private onNavigationEvent() {
        }

        static {
            int i = onNavigationEvent + 117;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onExtraCallbackWithResult<Unit> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 111;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult<Unit> onextracallbackwithresult = IAuthTabCallback;
            int i5 = i2 + 9;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }
    }
}
