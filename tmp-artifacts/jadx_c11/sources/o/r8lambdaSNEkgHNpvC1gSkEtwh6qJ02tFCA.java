package o;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA implements r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onNavigationEvent;

    public /* synthetic */ r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract boolean onNavigationEvent();

    public abstract boolean onWarmupCompleted();

    private r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA(int i) {
        this.onNavigationEvent = i;
    }

    @Override // o.r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8
    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onNavigationEvent;
        if (i3 != 0) {
            int i5 = 20 / 0;
        }
        return i4;
    }

    @Override // o.r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8
    public /* bridge */ int IAuthTabCallback(@NotNull r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc8) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = super.IAuthTabCallback(r8lambda8seph2zprwouvulkushwnh16lc8);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = onWarmupCompleted + 85;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return iIAuthTabCallback;
    }

    @Override // o.r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8, java.lang.Comparable
    public /* synthetic */ int compareTo(r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc8) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onWarmupCompleted = i2 % 128;
        r8lambda8SEPh2zPRwOUvUlKuSHWNH16lc8 r8lambda8seph2zprwouvulkushwnh16lc82 = r8lambda8seph2zprwouvulkushwnh16lc8;
        if (i2 % 2 == 0) {
            IAuthTabCallback(r8lambda8seph2zprwouvulkushwnh16lc82);
            throw null;
        }
        int iIAuthTabCallback = IAuthTabCallback(r8lambda8seph2zprwouvulkushwnh16lc82);
        int i3 = onWarmupCompleted + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return iIAuthTabCallback;
    }

    public static abstract class onWarmupCompleted extends r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onWarmupCompleted(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private onWarmupCompleted(int i) {
            super(i, null);
        }

        @Override // o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA
        public boolean onNavigationEvent() {
            Set setOnExtraCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onWarmupCompleted[] onwarmupcompletedArr = new onWarmupCompleted[2];
                onwarmupcompletedArr[1] = C0058onWarmupCompleted.onExtraCallback;
                onwarmupcompletedArr[1] = onExtraCallback.onExtraCallback;
                onwarmupcompletedArr[4] = onExtraCallbackWithResult.onNavigationEvent;
                setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(onwarmupcompletedArr);
            } else {
                setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new onWarmupCompleted[]{C0058onWarmupCompleted.onExtraCallback, onExtraCallback.onExtraCallback, onExtraCallbackWithResult.onNavigationEvent});
            }
            return setOnExtraCallback.contains(this);
        }

        @Override // o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA
        public boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            boolean zAreEqual = Intrinsics.areEqual(this, onNavigationEvent.onNavigationEvent);
            int i4 = onExtraCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return zAreEqual;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0058onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            public static final C0058onWarmupCompleted onExtraCallback = new C0058onWarmupCompleted();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 107;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof C0058onWarmupCompleted) {
                    return true;
                }
                int i7 = i3 + 71;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 3;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return -397541439;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 79;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 23;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return "BeforeExtendedStart";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private C0058onWarmupCompleted() {
                super(0, null);
            }
        }

        public static final class onExtraCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final onExtraCallback onExtraCallback = new onExtraCallback();
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 109;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 84 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 99;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                if (this != obj) {
                    return obj instanceof onExtraCallback;
                }
                int i5 = i3 + 29;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 91;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1296763433;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 99;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 49;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "BeforePreMarket";
            }

            private onExtraCallback() {
                super(1, null);
            }
        }

        public static final class asBinder extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            public static final asBinder onExtraCallback = new asBinder();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = IAuthTabCallback + 81;
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
                if (!(obj instanceof asBinder)) {
                    return false;
                }
                int i4 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 79;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 33;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return 995427286;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return "PreMarket";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private asBinder() {
                super(2, null);
            }
        }

        public static final class onTransact extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onTransact onNavigationEvent = new onTransact();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 73;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this != obj) {
                    return obj instanceof onTransact;
                }
                int i4 = i3 + 71;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return -1790735137;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 53;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return "EstimatedPriceMarket1";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private onTransact() {
                super(3, null);
            }
        }

        public static final class IAuthTabCallbackStub extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();

            static {
                int i = onExtraCallback + 99;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 33;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (this != obj) {
                    return obj instanceof IAuthTabCallbackStub;
                }
                int i4 = i3 + 85;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return 504477176;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 69;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 15;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return "Trading";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private IAuthTabCallbackStub() {
                super(4, null);
            }
        }

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static int onNavigationEvent;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 93;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj || (obj instanceof IAuthTabCallback)) {
                    return true;
                }
                int i2 = IAuthTabCallback + 63;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 125;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 33;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return -117591280;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 95;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return "BeforeClose";
                }
                int i3 = 3 / 0;
                return "BeforeClose";
            }

            private IAuthTabCallback() {
                super(5, null);
            }
        }

        public static final class IAuthTabCallbackDefault extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final IAuthTabCallbackDefault onNavigationEvent = new IAuthTabCallbackDefault();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 == 0) {
                    int i2 = 28 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 27;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallbackDefault) {
                    return true;
                }
                int i7 = i2 + 107;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 87;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1289432592;
                }
                int i3 = 57 / 0;
                return -1289432592;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 35;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 76 / 0;
                }
                return "ClosedPriceMarket";
            }

            private IAuthTabCallbackDefault() {
                super(6, null);
            }
        }

        public static final class asInterface extends onWarmupCompleted {
            public static final asInterface IAuthTabCallback = new asInterface();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 87;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 35;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 17;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof asInterface) {
                    return true;
                }
                int i7 = i3 + 11;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 55 / 0;
                }
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return -1790735136;
                }
                int i3 = 76 / 0;
                return -1790735136;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 23;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return "EstimatedPriceMarket2";
                }
                int i3 = 69 / 0;
                return "EstimatedPriceMarket2";
            }

            private asInterface() {
                super(7, null);
            }
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
            private static int onWarmupCompleted;

            static {
                int i = onWarmupCompleted + 49;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 79;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof onExtraCallbackWithResult)) {
                    return false;
                }
                int i7 = i2 + 89;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 35;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return 632846773;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 77;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return "Closed";
            }

            private onExtraCallbackWithResult() {
                super(8, null);
            }
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();
            private static int onWarmupCompleted = 1;

            static {
                int i = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj || !(!(obj instanceof onNavigationEvent))) {
                    return true;
                }
                int i5 = i2 + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1768146521;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 97;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 93;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 60 / 0;
                }
                return "ClosedDay";
            }

            private onNavigationEvent() {
                super(9, null);
            }
        }
    }

    public static abstract class onExtraCallbackWithResult extends r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private onExtraCallbackWithResult(int i) {
            super(i, null);
        }

        @Override // o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA
        public boolean onNavigationEvent() {
            Set setOnExtraCallback;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 45;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult[] onextracallbackwithresultArr = new onExtraCallbackWithResult[5];
                onextracallbackwithresultArr[1] = onExtraCallback.onWarmupCompleted;
                onextracallbackwithresultArr[1] = onWarmupCompleted.onWarmupCompleted;
                setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(onextracallbackwithresultArr);
            } else {
                setOnExtraCallback = clearFaultAdjacentMetadata.onExtraCallback(new onExtraCallbackWithResult[]{onExtraCallback.onWarmupCompleted, onWarmupCompleted.onWarmupCompleted});
            }
            return setOnExtraCallback.contains(this);
        }

        @Override // o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA
        public boolean onWarmupCompleted() {
            boolean zAreEqual;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                zAreEqual = Intrinsics.areEqual(this, asInterface.onWarmupCompleted);
                int i3 = 35 / 0;
            } else {
                zAreEqual = Intrinsics.areEqual(this, asInterface.onWarmupCompleted);
            }
            int i4 = onExtraCallbackWithResult + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        public static final class onExtraCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

            static {
                int i = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (this != obj) {
                    return obj instanceof onExtraCallback;
                }
                int i5 = i2 + 105;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return -1147054790;
                }
                int i3 = 82 / 0;
                return -1147054790;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 75;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "BeforeExtendedStart";
            }

            private onExtraCallback() {
                super(0, null);
            }
        }

        public static final class IAuthTabCallbackStub extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final IAuthTabCallbackStub onWarmupCompleted = new IAuthTabCallbackStub();

            static {
                int i = onExtraCallback + 63;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 113;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallbackStub) {
                    return true;
                }
                int i4 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 43;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 65;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return -512414577;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 29;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 99;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 63 / 0;
                }
                return "PreMarket";
            }

            private IAuthTabCallbackStub() {
                super(1, null);
            }
        }

        public static final class asBinder extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final asBinder onWarmupCompleted = new asBinder();

            static {
                int i = onNavigationEvent + 23;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (obj instanceof asBinder) {
                    int i2 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 75;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 94 / 0;
                }
                return -1028823604;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 65;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 35;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "PreMarketEnd";
            }

            private asBinder() {
                super(2, null);
            }
        }

        public static final class IAuthTabCallbackDefault extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            public static final IAuthTabCallbackDefault onExtraCallback = new IAuthTabCallbackDefault();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onNavigationEvent + 107;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof IAuthTabCallbackDefault) {
                    return true;
                }
                int i4 = IAuthTabCallback + 81;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 7;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return 1164359921;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 105;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 41;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return "Trading";
            }

            private IAuthTabCallbackDefault() {
                super(3, null);
            }
        }

        public static final class onTransact extends onExtraCallbackWithResult {
            public static final onTransact IAuthTabCallback = new onTransact();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 1;
                int i4 = i3 % 128;
                onNavigationEvent = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    int i6 = i4 + 93;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                if (obj instanceof onTransact) {
                    return true;
                }
                int i8 = i2 + 49;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 37;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 71;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return 632157999;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 75;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return "TradingEndBeforeAfterMarket";
                }
                throw null;
            }

            private onTransact() {
                super(4, null);
            }
        }

        public static final class IAuthTabCallback extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            public static final IAuthTabCallback onNavigationEvent = new IAuthTabCallback();
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 49;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    int i2 = 37 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallback + 105;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(!(obj instanceof IAuthTabCallback))) {
                    return true;
                }
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 1;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 123;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 58 / 0;
                }
                return -361553771;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    return "AfterSinglePrice";
                }
                int i3 = 27 / 0;
                return "AfterSinglePrice";
            }

            private IAuthTabCallback() {
                super(5, null);
            }
        }

        /* renamed from: o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0057onExtraCallbackWithResult extends onExtraCallbackWithResult {
            public static final C0057onExtraCallbackWithResult IAuthTabCallback = new C0057onExtraCallbackWithResult();
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 105;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            
                if ((r6 instanceof o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.C0057onExtraCallbackWithResult) != false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
            
                r2 = r2 + 15;
                o.r8lambdaSNEkgHNpvC1gSkEtwh6qJ02tFCA.onExtraCallbackWithResult.C0057onExtraCallbackWithResult.onNavigationEvent = r2 % 128;
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
                int i2 = onNavigationEvent + 81;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 == 0) {
                    int i4 = 56 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 21;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return 2010536433;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                int i3 = i2 % 128;
                onNavigationEvent = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = i3 + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return "AfterClosedPrice";
            }

            private C0057onExtraCallbackWithResult() {
                super(6, null);
            }
        }

        public static final class onNavigationEvent extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            static {
                int i = onExtraCallback + 5;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this != obj) {
                    if (obj instanceof onNavigationEvent) {
                        return true;
                    }
                    int i2 = IAuthTabCallback + 111;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = onNavigationEvent;
                int i5 = i4 + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 11;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 84 / 0;
                }
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 19;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return -591217400;
                }
                int i3 = 2 / 0;
                return -591217400;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 7;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return "AfterMarket";
                }
                int i3 = 3 / 0;
                return "AfterMarket";
            }

            private onNavigationEvent() {
                super(7, null);
            }
        }

        public static final class onWarmupCompleted extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 1;
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            static {
                int i = IAuthTabCallback + 29;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this != obj) {
                    if (!(!(obj instanceof onWarmupCompleted))) {
                        return true;
                    }
                    int i2 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i2 % 128;
                    return i2 % 2 == 0;
                }
                int i3 = onExtraCallback + 31;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 115;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 121;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return -592792676;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult;
                int i3 = i2 + 45;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 11;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return "Closed";
            }

            private onWarmupCompleted() {
                super(8, null);
            }
        }

        public static final class asInterface extends onExtraCallbackWithResult {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            public static final asInterface onWarmupCompleted = new asInterface();

            static {
                int i = onNavigationEvent + 57;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 113;
                int i4 = i3 % 128;
                onExtraCallback = i4;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (this == obj) {
                    int i5 = i4 + 113;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof asInterface) {
                    return true;
                }
                int i7 = i2 + 89;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    return 1018978912;
                }
                int i3 = 47 / 0;
                return 1018978912;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 101;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return "ClosedDay";
            }

            private asInterface() {
                super(9, null);
            }
        }
    }
}
