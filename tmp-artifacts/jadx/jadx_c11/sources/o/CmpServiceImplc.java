package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface CmpServiceImplc {
    boolean onNavigationEvent(long j, @NotNull CmpServiceImpla cmpServiceImpla);

    public static abstract class IAuthTabCallback implements CmpServiceImplc {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final long onExtraCallbackWithResult;
        private long onNavigationEvent;

        public IAuthTabCallback() {
            this(0L, 1, null);
        }

        protected abstract Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla);

        public IAuthTabCallback(long j) {
            this.onExtraCallbackWithResult = j;
            this.onNavigationEvent = -1L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = IAuthTabCallback + 31;
                onExtraCallback = i2 % 128;
                int i3 = 2 % 2;
                j = i2 % 2 != 0 ? 1L : 0L;
            }
            this(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[PHI: r3 r6
          0x0036: PHI (r3v3 long) = (r3v2 long), (r3v9 long) binds: [B:10:0x0034, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x0036: PHI (r6v2 long) = (r6v1 long), (r6v6 long) binds: [B:10:0x0034, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[PHI: r3
          0x0048: PHI (r3v8 long) = (r3v2 long), (r3v3 long), (r3v9 long) binds: [B:10:0x0034, B:12:0x003b, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // o.CmpServiceImplc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onNavigationEvent(long j, @NotNull CmpServiceImpla cmpServiceImpla) {
            long jLongValue;
            long j2;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            Long lOnNavigationEvent = onNavigationEvent(cmpServiceImpla);
            boolean z2 = false;
            if (lOnNavigationEvent == null) {
                return false;
            }
            int i2 = IAuthTabCallback + 51;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                jLongValue = lOnNavigationEvent.longValue() + this.onExtraCallbackWithResult;
                j2 = 3000 * jLongValue;
                if (j2 <= j) {
                    if (j < jLongValue + 4000) {
                        int i3 = onExtraCallback + 69;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                jLongValue = lOnNavigationEvent.longValue() + this.onExtraCallbackWithResult;
                j2 = 3000 + jLongValue;
                if (j2 <= j) {
                }
            }
            boolean z3 = this.onNavigationEvent < j2;
            if (z) {
                int i5 = onExtraCallback + 27;
                int i6 = i5 % 128;
                IAuthTabCallback = i6;
                int i7 = i5 % 2;
                if (!(!z3)) {
                    int i8 = i6 + 119;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    z2 = true;
                }
            }
            if (!z2) {
                return z2;
            }
            this.onNavigationEvent = j;
            return true;
        }
    }

    public static final class onNavigationEvent extends IAuthTabCallback {
        public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj || (obj instanceof onNavigationEvent)) {
                return true;
            }
            int i4 = i3 + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 53;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return 521610842;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 95;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "옵션_정규장_10분전";
            }
            throw null;
        }

        private onNavigationEvent() {
            super(0L, 1, null);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                return CmpServiceImplaa.onExtraCallback(cmpServiceImpla);
            }
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            CmpServiceImplaa.onExtraCallback(cmpServiceImpla);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 99;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj || (obj instanceof onExtraCallbackWithResult)) {
                return true;
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return 118660149;
            }
            int i3 = 54 / 0;
            return 118660149;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 31 / 0;
            }
            return "옵션_정규장_10분전_지연";
        }

        private onExtraCallbackWithResult() {
            super(900000L);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                return CmpServiceImplaa.onExtraCallback(cmpServiceImpla);
            }
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            CmpServiceImplaa.onExtraCallback(cmpServiceImpla);
            throw null;
        }
    }

    public static final class asInterface extends IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final asInterface onNavigationEvent = new asInterface();
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 125;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                return !((obj instanceof asInterface) ^ true);
            }
            int i5 = i2 + 13;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return -2012844453;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 111;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return "옵션_프리장_10분전";
        }

        private asInterface() {
            super(0L, 1, null);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                return CmpServiceImplaa.onWarmupCompleted(cmpServiceImpla);
            }
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            CmpServiceImplaa.onWarmupCompleted(cmpServiceImpla);
            throw null;
        }
    }

    public static final class onTransact extends IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        public static final onTransact onExtraCallback = new onTransact();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 23;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onTransact) {
                return true;
            }
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            return i4 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 8 / 0;
            }
            return 1686030484;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return "옵션_프리장_10분전_지연";
            }
            throw null;
        }

        private onTransact() {
            super(900000L);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                return CmpServiceImplaa.onWarmupCompleted(cmpServiceImpla);
            }
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            int i3 = 14 / 0;
            return CmpServiceImplaa.onWarmupCompleted(cmpServiceImpla);
        }
    }

    public static final class onWarmupCompleted extends IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onWarmupCompleted + 45;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj || (obj instanceof onWarmupCompleted)) {
                return true;
            }
            int i5 = i2 + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 29 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 21;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = i2 + 103;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
            return -481948909;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "옵션_애프터장_종료";
            }
            throw null;
        }

        private onWarmupCompleted() {
            super(0L, 1, null);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                return CmpServiceImplaa.onExtraCallbackWithResult(cmpServiceImpla);
            }
            Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
            CmpServiceImplaa.onExtraCallbackWithResult(cmpServiceImpla);
            throw null;
        }
    }

    public static final class onExtraCallback extends IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 109;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i3 + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return true;
            }
            int i6 = i3 + 63;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 9;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 68 / 0;
            }
            int i5 = i2 + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return 337465564;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return "옵션_애프터장_종료_지연";
        }

        private onExtraCallback() {
            super(900000L);
        }

        @Override // o.CmpServiceImplc.IAuthTabCallback
        protected Long onNavigationEvent(@NotNull CmpServiceImpla cmpServiceImpla) {
            Long lOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                lOnExtraCallbackWithResult = CmpServiceImplaa.onExtraCallbackWithResult(cmpServiceImpla);
                int i3 = 26 / 0;
            } else {
                Intrinsics.checkNotNullParameter(cmpServiceImpla, "");
                lOnExtraCallbackWithResult = CmpServiceImplaa.onExtraCallbackWithResult(cmpServiceImpla);
            }
            int i4 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return lOnExtraCallbackWithResult;
        }
    }
}
