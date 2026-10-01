package o;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public abstract class parse {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 121;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ parse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class onTransact extends parse {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final onTransact onExtraCallbackWithResult = new onTransact();
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onWarmupCompleted + 125;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 69 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof onTransact)) {
                    return false;
                }
                int i2 = onExtraCallback + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = onNavigationEvent + 121;
            int i5 = i4 % 128;
            onExtraCallback = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 23;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return -997181985;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 13;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return "NotInstalled";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onTransact() {
            super(null);
        }
    }

    private parse() {
    }

    public static final class IAuthTabCallbackStub extends parse {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final int onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallbackStub)) {
                int i2 = IAuthTabCallback + 111;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (this.onExtraCallback == ((IAuthTabCallbackStub) obj).onExtraCallback) {
                return true;
            }
            int i4 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.onExtraCallback;
            if (i3 == 0) {
                return Integer.hashCode(i4);
            }
            Integer.hashCode(i4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Pending(sessionId=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallbackStub(int i) {
            super(null);
            this.onExtraCallback = i;
        }
    }

    public static final class onExtraCallback extends parse {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        private final int IAuthTabCallback;
        private final long onExtraCallback;
        private final long onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = onNavigationEvent + 85;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.IAuthTabCallback != onextracallback.IAuthTabCallback) {
                return false;
            }
            if (this.onExtraCallback == onextracallback.onExtraCallback) {
                if (this.onExtraCallbackWithResult == onextracallback.onExtraCallbackWithResult) {
                    return true;
                }
                int i4 = onNavigationEvent + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = onWarmupCompleted + 3;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 81;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 65;
            onNavigationEvent = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((Integer.hashCode(this.IAuthTabCallback) / 80) + Long.hashCode(this.onExtraCallback)) / 94) << Long.hashCode(this.onExtraCallbackWithResult) : (((Integer.hashCode(this.IAuthTabCallback) * 31) + Long.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.onExtraCallbackWithResult);
            int i3 = onNavigationEvent + 105;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Downloading(sessionId=" + this.IAuthTabCallback + ", bytesDownloaded=" + this.onExtraCallback + ", totalBytes=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallback(int i, long j, long j2) {
            super(null);
            this.IAuthTabCallback = i;
            this.onExtraCallback = j;
            this.onExtraCallbackWithResult = j2;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            long j = this.onExtraCallbackWithResult;
            if (i4 != 0) {
                if (j <= 0) {
                    return 0.0f;
                }
            } else if (j <= 0) {
                return 0.0f;
            }
            int i5 = i3 + 89;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            float f = this.onExtraCallback;
            float f2 = j;
            return i6 == 0 ? f % f2 : f / f2;
        }
    }

    public static final class onNavigationEvent extends parse {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final int onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        
            if ((r6 instanceof o.parse.onNavigationEvent) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        
            if (r5.onWarmupCompleted == ((o.parse.onNavigationEvent) r6).onWarmupCompleted) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r1 = r1 + 125;
            o.parse.onNavigationEvent.onExtraCallbackWithResult = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
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
            int i3 = i2 + 25;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 7 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onWarmupCompleted);
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Downloaded(sessionId=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(int i) {
            super(null);
            this.onWarmupCompleted = i;
        }
    }

    public static final class asInterface extends parse {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 117;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof asInterface) {
                return this.onWarmupCompleted == ((asInterface) obj).onWarmupCompleted;
            }
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Integer.hashCode(this.onWarmupCompleted);
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 39 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Installing(sessionId=" + this.onWarmupCompleted + ")";
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public asInterface(int i) {
            super(null);
            this.onWarmupCompleted = i;
        }
    }

    public static final class asBinder extends parse {
        public static final asBinder IAuthTabCallback = new asBinder();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallback + 119;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                int i2 = 94 / 0;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (this != obj) {
                return obj instanceof asBinder;
            }
            int i5 = i2 + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            int i5 = i2 + 21;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return -1396543870;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return "Installed";
        }

        private asBinder() {
            super(null);
        }
    }

    public static final class IAuthTabCallbackDefault extends parse {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final int onExtraCallback;
        private final SplitInstallSessionState onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            if (i3 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 17;
                IAuthTabCallback = i5 % 128;
                return i5 % 2 != 0;
            }
            if (!(obj instanceof IAuthTabCallbackDefault)) {
                int i6 = i2 + 111;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault = (IAuthTabCallbackDefault) obj;
            if (this.onExtraCallback != iAuthTabCallbackDefault.onExtraCallback || !Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallbackDefault.onExtraCallbackWithResult)) {
                return false;
            }
            int i7 = IAuthTabCallback + 61;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Integer.hashCode(this.onExtraCallback) * 31) + this.onExtraCallbackWithResult.hashCode();
            int i4 = IAuthTabCallback + 41;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RequiresConfirmation(sessionId=" + this.onExtraCallback + ", state=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackDefault(int i, @NotNull SplitInstallSessionState splitInstallSessionState) {
            super(null);
            Intrinsics.checkNotNullParameter(splitInstallSessionState, "");
            this.onExtraCallback = i;
            this.onExtraCallbackWithResult = splitInstallSessionState;
        }
    }

    public static final class onWarmupCompleted extends parse {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

        static {
            int i = onNavigationEvent + 59;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 85;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(!(obj instanceof onWarmupCompleted))) {
                return true;
            }
            int i7 = i3 + 103;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return -1277539183;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 71;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "Canceled";
        }

        private onWarmupCompleted() {
            super(null);
        }
    }

    public static final class IAuthTabCallback extends parse {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private final String onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 113;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                int i6 = i2 + 25;
                onNavigationEvent = i6 % 128;
                return i6 % 2 == 0;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i7 = i4 + 95;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onWarmupCompleted != iAuthTabCallback.onWarmupCompleted || !Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult)) {
                return false;
            }
            int i9 = onNavigationEvent + 91;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Integer.hashCode(this.onWarmupCompleted);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
            String str = this.onExtraCallbackWithResult;
            if (str == null) {
                int i3 = onNavigationEvent + 27;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Failed(errorCode=" + this.onWarmupCompleted + ", message=" + this.onExtraCallbackWithResult + ")";
            int i2 = onNavigationEvent + 67;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public IAuthTabCallback(int i, @Nullable String str) {
            super(null);
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = str;
        }

        public final int onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 61;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onWarmupCompleted;
            int i6 = i2 + 113;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 99;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
            return str;
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        if (!(this instanceof IAuthTabCallbackStub) && !(this instanceof onExtraCallback) && !(this instanceof onNavigationEvent)) {
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!(this instanceof asInterface) && !(this instanceof IAuthTabCallbackDefault)) {
                int i5 = i2 + 77;
                IAuthTabCallback = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        int i6 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return true;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 95;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            boolean z = this instanceof asBinder;
            throw null;
        }
        if ((this instanceof asBinder) || (this instanceof onWarmupCompleted) || (this instanceof IAuthTabCallback)) {
            return true;
        }
        int i4 = i2 + 61;
        IAuthTabCallback = i4 % 128;
        boolean z2 = this instanceof onTransact;
        if (i4 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float onExtraCallbackWithResult() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (this instanceof onTransact) {
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0 ? 1.0f : 0.0f;
        }
        if (this instanceof IAuthTabCallbackStub) {
            int i3 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return 0.05f;
        }
        if (this instanceof onExtraCallback) {
            return (((onExtraCallback) this).onNavigationEvent() * 0.85f) + 0.05f;
        }
        if (this instanceof onNavigationEvent) {
            return 0.90000004f;
        }
        if (this instanceof asInterface) {
            int i5 = IAuthTabCallback + 39;
            int i6 = i5 % 128;
            onExtraCallbackWithResult = i6;
            if (i5 % 2 == 0) {
                int i7 = 16 / 0;
            }
            int i8 = i6 + 43;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 59 / 0;
            }
            return 0.95000005f;
        }
        if (this instanceof asBinder) {
            int i10 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return 1.0f;
        }
        if (this instanceof IAuthTabCallbackDefault) {
            return 0.05f;
        }
        if ((!(this instanceof onWarmupCompleted)) && !(this instanceof IAuthTabCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        return 0.0f;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
