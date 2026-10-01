package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class maxStaleSeconds {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final List<maxStaleSeconds> onWarmupCompleted = CollectionsKt.listOf(new maxStaleSeconds[]{onWarmupCompleted.onExtraCallbackWithResult, IAuthTabCallback.IAuthTabCallback, asBinder.onExtraCallback, onExtraCallback.onNavigationEvent, IAuthTabCallbackStub.IAuthTabCallback, onExtraCallbackWithResult.onExtraCallback, asInterface.onNavigationEvent, IAuthTabCallbackDefault.onExtraCallback});

    public /* synthetic */ maxStaleSeconds(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int onExtraCallback(boolean z);

    public abstract float onNavigationEvent(boolean z);

    private maxStaleSeconds() {
    }

    public static final class onWarmupCompleted extends maxStaleSeconds {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        public static final onWarmupCompleted onExtraCallbackWithResult = new onWarmupCompleted();
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted = 1;

        static {
            int i = onNavigationEvent + 15;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 35 / 0;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.maxStaleSeconds.onWarmupCompleted) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 59;
            o.maxStaleSeconds.onWarmupCompleted.IAuthTabCallback = r2 % 128;
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
            int i2 = IAuthTabCallback + 103;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 92 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 57 / 0;
            }
            int i5 = i3 + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return -1655844951;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            if (!z) {
                return 0.2f;
            }
            int i2 = onWarmupCompleted + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return 1.0f;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                int i4 = 28 / 0;
            }
            int i5 = i3 + 81;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "Grey";
        }

        private onWarmupCompleted() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (z) {
                int i4 = i2 + 47;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return charset.onExtraCallbackWithResult.read().IAuthTabCallback();
            }
            Object[] objArr = {charset.onExtraCallbackWithResult};
            int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            return ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 382802400, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -382802383, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).IAuthTabCallback();
        }
    }

    public static final class IAuthTabCallback extends maxStaleSeconds {
        public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback();
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 45;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this != obj) {
                return obj instanceof IAuthTabCallback;
            }
            int i4 = i3 + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return -1655999196;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!z) {
                int i4 = i3 + 113;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return 0.7f;
                }
                throw null;
            }
            int i5 = i3 + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return 0.5f;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return "Blue";
            }
            obj.hashCode();
            throw null;
        }

        private IAuthTabCallback() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (!z) {
                return charset.onExtraCallbackWithResult.onTransact().IAuthTabCallback();
            }
            int iIAuthTabCallback = charset.onExtraCallbackWithResult.onTransact().IAuthTabCallback();
            int i4 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final class asBinder extends maxStaleSeconds {
        private static int IAuthTabCallback = 0;
        public static final asBinder onExtraCallback = new asBinder();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 59;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 18 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof asBinder))) {
                return true;
            }
            int i4 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 15;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 1193521799;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 75;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                return 0.5f;
            }
            int i4 = i2 + 91;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return 0.7f;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return "Red";
            }
            int i3 = 41 / 0;
            return "Red";
        }

        private asBinder() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!z) {
                return charset.onExtraCallbackWithResult.ITrustedWebActivityServiceDefault().IAuthTabCallback();
            }
            int i4 = i3 + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return charset.onExtraCallbackWithResult.ITrustedWebActivityServiceDefault().IAuthTabCallback();
        }
    }

    public static final class onExtraCallback extends maxStaleSeconds {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallback onNavigationEvent = new onExtraCallback();
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 117;
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
            if (this == obj) {
                int i2 = onExtraCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallback) {
                return true;
            }
            int i4 = onWarmupCompleted + 5;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return -1900191624;
            }
            throw null;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 21;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (!z) {
                int i5 = i2 + 79;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return 0.7f;
                }
                throw null;
            }
            int i6 = i4 + 55;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return 0.5f;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "Orange";
        }

        private onExtraCallback() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (!z) {
                return charset.onExtraCallbackWithResult.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4().IAuthTabCallback();
            }
            int iIAuthTabCallback = charset.onExtraCallbackWithResult.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28().IAuthTabCallback();
            int i3 = onWarmupCompleted + 115;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return iIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub extends maxStaleSeconds {
        public static final IAuthTabCallbackStub IAuthTabCallback = new IAuthTabCallbackStub();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallback + 33;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof IAuthTabCallbackStub) {
                return true;
            }
            int i4 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return -1625579842;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            if (!z) {
                int i2 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 23 / 0;
                }
                return 0.7f;
            }
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return 0.5f;
            }
            int i5 = 51 / 0;
            return 0.5f;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return "Yellow";
            }
            throw null;
        }

        private IAuthTabCallbackStub() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (z) {
                int iIAuthTabCallback = charset.onExtraCallbackWithResult.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8().IAuthTabCallback();
                int i3 = onExtraCallbackWithResult + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return iIAuthTabCallback;
            }
            int iIAuthTabCallback2 = charset.onExtraCallbackWithResult.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28().IAuthTabCallback();
            int i5 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return iIAuthTabCallback2;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult extends maxStaleSeconds {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 91;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallbackWithResult + 103;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof onExtraCallbackWithResult) {
                return true;
            }
            int i4 = onWarmupCompleted + 91;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return 208413561;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 47;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (z) {
                return 0.5f;
            }
            int i5 = i2 + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return 0.7f;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 25;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "Green";
        }

        private onExtraCallbackWithResult() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (!z) {
                return charset.onExtraCallbackWithResult.onActivityLayout().IAuthTabCallback();
            }
            int iIAuthTabCallback = charset.onExtraCallbackWithResult.onMessageChannelReady().IAuthTabCallback();
            int i3 = onWarmupCompleted + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return iIAuthTabCallback;
        }
    }

    public static final class asInterface extends maxStaleSeconds {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final asInterface onNavigationEvent = new asInterface();
        private static int onWarmupCompleted = 1;

        static {
            int i = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof o.maxStaleSeconds.asInterface) == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        
            r2 = r2 + 111;
            o.maxStaleSeconds.asInterface.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
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
            int i2 = onExtraCallback + 75;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 == 0) {
                int i4 = 75 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 7;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return -1655470298;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            if (!z) {
                return 0.7f;
            }
            int i2 = onExtraCallback;
            int i3 = i2 + 121;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return 0.5f;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return "Teal";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private asInterface() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!z) {
                Object[] objArr = {charset.onExtraCallbackWithResult};
                return ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 702584624, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -702584610, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).IAuthTabCallback();
            }
            int iIAuthTabCallback = charset.onExtraCallbackWithResult.MediaSessionCompatResultReceiverWrapper().IAuthTabCallback();
            int i4 = onWarmupCompleted + 91;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault extends maxStaleSeconds {
        private static int IAuthTabCallback = 1;
        public static final IAuthTabCallbackDefault onExtraCallback = new IAuthTabCallbackDefault();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 27;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                int i2 = 32 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 3;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(obj instanceof IAuthTabCallbackDefault))) {
                return true;
            }
            int i4 = IAuthTabCallback + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 23;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 99;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return -1868283386;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.maxStaleSeconds
        public float onNavigationEvent(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 71;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (!z) {
                return 0.7f;
            }
            int i5 = i3 + 21;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0.5f;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                int i4 = 84 / 0;
            }
            int i5 = i3 + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return "Purple";
        }

        private IAuthTabCallbackDefault() {
            super(null);
        }

        @Override // o.maxStaleSeconds
        public int onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (z) {
                int i5 = i3 + 69;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = {charset.onExtraCallbackWithResult};
                    int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                    return ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -653196507, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 653196517, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).IAuthTabCallback();
                }
                Object[] objArr2 = {charset.onExtraCallbackWithResult};
                int iOnWarmupCompleted2 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
                ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -653196507, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 653196517, iOnWarmupCompleted2, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr2)).IAuthTabCallback();
                throw null;
            }
            Object[] objArr3 = {charset.onExtraCallbackWithResult};
            int iOnWarmupCompleted3 = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
            int iIAuthTabCallback = ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -653196507, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 653196517, iOnWarmupCompleted3, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), objArr3)).IAuthTabCallback();
            int i6 = IAuthTabCallback + 61;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 28 / 0;
            }
            return iIAuthTabCallback;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        int i = onNavigationEvent + 67;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }
}
