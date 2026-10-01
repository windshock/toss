package o;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final onWarmupCompleted onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    public /* synthetic */ r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY(long j, String str, onWarmupCompleted onwarmupcompleted, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, onwarmupcompleted);
    }

    public static /* synthetic */ r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY onNavigationEvent(r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay, long j, String str, onWarmupCompleted onwarmupcompleted, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onNavigationEvent + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                long j2 = r8lambda3ckywq3ss3onutwsvbshr4mmay.onWarmupCompleted;
                throw null;
            }
            j = r8lambda3ckywq3ss3onutwsvbshr4mmay.onWarmupCompleted;
        }
        if ((i & 2) != 0) {
            str = r8lambda3ckywq3ss3onutwsvbshr4mmay.onExtraCallbackWithResult;
        }
        if ((i & 4) != 0) {
            onwarmupcompleted = r8lambda3ckywq3ss3onutwsvbshr4mmay.onExtraCallback;
        }
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmayOnExtraCallbackWithResult = r8lambda3ckywq3ss3onutwsvbshr4mmay.onExtraCallbackWithResult(j, str, onwarmupcompleted);
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return r8lambda3ckywq3ss3onutwsvbshr4mmayOnExtraCallbackWithResult;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r8 instanceof o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r1 = r1 + 83;
        o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onNavigationEvent = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r8 = (o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (o.getBundle.onWarmupCompleted(r7.onWarmupCompleted, r8.onWarmupCompleted) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r8 = o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.onNavigationEvent + 121;
        o.r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY.IAuthTabCallback = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (o.putCharArray.onNavigationEvent(r7.onExtraCallbackWithResult, r8.onExtraCallbackWithResult) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7.onExtraCallback, r8.onExtraCallback)) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = (((getBundle.onExtraCallback(this.onWarmupCompleted) * 31) + putCharArray.onExtraCallbackWithResult(this.onExtraCallbackWithResult)) * 31) + this.onExtraCallback.hashCode();
        int i4 = IAuthTabCallback + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    public final r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY onExtraCallbackWithResult(long j, @NotNull String str, @NotNull onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY r8lambda3ckywq3ss3onutwsvbshr4mmay = new r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY(j, str, onwarmupcompleted, null);
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return r8lambda3ckywq3ss3onutwsvbshr4mmay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambda3CkywQ3Ss3oNUTwsVBSHr4mMAY(long j, String str, onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onWarmupCompleted = j;
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = onwarmupcompleted;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 89;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 15;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onExtraCallbackWithResult;
            int i4 = 14 / 0;
        } else {
            str = this.onExtraCallbackWithResult;
        }
        int i5 = i2 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final onWarmupCompleted IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
        int i4 = i2 + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return onwarmupcompleted;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SlotDescriptor(id=" + getBundle.onNavigationEvent(this.onWarmupCompleted) + ", componentId=" + putCharArray.IAuthTabCallback(this.onExtraCallbackWithResult) + ", extras=" + this.onExtraCallback + ")";
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class onWarmupCompleted {
        public static final onExtraCallback Companion;
        private static int IAuthTabCallback = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        private static int onNavigationEvent;
        private static final onWarmupCompleted onWarmupCompleted;
        private final Map<onExtraCallback<?>, Object> onExtraCallbackWithResult;

        /* JADX WARN: Illegal instructions before constructor call */
        public onWarmupCompleted() {
            Map map = null;
            this(map, 1, map);
        }

        public onWarmupCompleted(@NotNull Map<onExtraCallback<?>, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.onExtraCallbackWithResult = map;
        }

        public static final /* synthetic */ onWarmupCompleted onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 123;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted;
            }
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = onNavigationEvent + 37;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    map = access8100.onNavigationEvent();
                    int i3 = 2 % 2;
                } else {
                    access8100.onNavigationEvent();
                    throw null;
                }
            }
            this((Map<onExtraCallback<?>, ? extends Object>) map);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(@NotNull Pair<? extends onExtraCallback<?>, ? extends Object>... pairArr) {
            this((Map<onExtraCallback<?>, ? extends Object>) access8100.asInterface(pairArr));
            Intrinsics.checkNotNullParameter(pairArr, "");
        }

        public final <T> T onWarmupCompleted(@NotNull onExtraCallback<T> onextracallback) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                return (T) this.onExtraCallbackWithResult.get(onextracallback);
            }
            Intrinsics.checkNotNullParameter(onextracallback, "");
            int i3 = 37 / 0;
            return (T) this.onExtraCallbackWithResult.get(onextracallback);
        }

        public final boolean onNavigationEvent(@NotNull onExtraCallback<?> onextracallback) {
            boolean zContainsKey;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                zContainsKey = this.onExtraCallbackWithResult.containsKey(onextracallback);
                int i3 = 58 / 0;
            } else {
                Intrinsics.checkNotNullParameter(onextracallback, "");
                zContainsKey = this.onExtraCallbackWithResult.containsKey(onextracallback);
            }
            int i4 = onNavigationEvent + 57;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return zContainsKey;
        }

        public static final class onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final onWarmupCompleted onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted.onWarmupCompleted();
                }
                onWarmupCompleted.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Companion = new onExtraCallback(defaultConstructorMarker);
            onWarmupCompleted = new onWarmupCompleted(defaultConstructorMarker, 1, defaultConstructorMarker);
            int i = onExtraCallback + 125;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallback<T> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 77;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onExtraCallback) obj).onExtraCallbackWithResult);
            }
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ExtraKey(name=" + this.onExtraCallbackWithResult + ")";
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return str;
        }

        public onExtraCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }
    }
}
