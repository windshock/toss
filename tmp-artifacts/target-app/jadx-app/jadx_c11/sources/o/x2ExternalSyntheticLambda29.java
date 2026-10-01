package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class x2ExternalSyntheticLambda29 {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback;
    private final float IAuthTabCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    public /* synthetic */ x2ExternalSyntheticLambda29(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    private x2ExternalSyntheticLambda29(float f, float f2, float f3, float f4) {
        this.IAuthTabCallback = f;
        this.onExtraCallbackWithResult = f2;
        this.onNavigationEvent = f3;
        this.onWarmupCompleted = f4;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.IAuthTabCallback;
        int i4 = i3 + 45;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.onExtraCallbackWithResult;
        int i4 = i2 + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        float f = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        float f = this.onWarmupCompleted;
        int i5 = i3 + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public static final class IAuthTabCallback extends x2ExternalSyntheticLambda29 {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onNavigationEvent + 73;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof o.x2ExternalSyntheticLambda29.IAuthTabCallback) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r1 = r1 + 113;
            o.x2ExternalSyntheticLambda29.IAuthTabCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            r1 = r1 + 23;
            o.x2ExternalSyntheticLambda29.IAuthTabCallback.onExtraCallback = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            if ((r1 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            r6 = 45 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 77;
            o.x2ExternalSyntheticLambda29.IAuthTabCallback.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 13;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 22 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 37;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return -2074074507;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "IconList";
        }

        private IAuthTabCallback() {
            super(1.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(42.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), null);
        }
    }

    public static final class onExtraCallback extends x2ExternalSyntheticLambda29 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        static {
            int i = onNavigationEvent + 85;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj || (obj instanceof onExtraCallback)) {
                return true;
            }
            int i5 = i3 + 93;
            IAuthTabCallback = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return -78191268;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return "List";
            }
            int i3 = 18 / 0;
            return "List";
        }

        private onExtraCallback() {
            super(1.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), null);
        }
    }

    public static final class onExtraCallbackWithResult extends x2ExternalSyntheticLambda29 {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 61;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.x2ExternalSyntheticLambda29.onExtraCallbackWithResult) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 111;
            o.x2ExternalSyntheticLambda29.onExtraCallbackWithResult.onNavigationEvent = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                int i4 = 53 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return -78467122;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return "Card";
        }

        private onExtraCallbackWithResult() {
            super(1.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(240.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(38.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), null);
        }
    }

    public static final class onNavigationEvent extends x2ExternalSyntheticLambda29 {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

        static {
            int i = IAuthTabCallback + 117;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            int i4 = i2 + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return 869007798;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 61;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 40 / 0;
            }
            return "SubTitle";
        }

        private onNavigationEvent() {
            super(0.33f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), null);
        }
    }

    public static final class onWarmupCompleted extends x2ExternalSyntheticLambda29 {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 15;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this != obj) {
                return obj instanceof onWarmupCompleted;
            }
            int i5 = i3 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 1878426970;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "Title";
        }

        private onWarmupCompleted() {
            super(0.5f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), null);
        }
    }
}
