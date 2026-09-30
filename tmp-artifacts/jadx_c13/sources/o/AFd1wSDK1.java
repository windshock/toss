package o;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDK1 implements Comparable<AFd1wSDK1> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final onWarmupCompleted IAuthTabCallback;
    private final IAuthTabCallback onExtraCallback;
    private final long onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof AFd1wSDK1)) {
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AFd1wSDK1 aFd1wSDK1 = (AFd1wSDK1) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, aFd1wSDK1.IAuthTabCallback)) {
            int i6 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, aFd1wSDK1.onExtraCallback)) {
            int i7 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 != 0;
        }
        if (this.onNavigationEvent == aFd1wSDK1.onNavigationEvent) {
            int i8 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + Long.hashCode(this.onNavigationEvent);
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Stamp(tag=" + this.IAuthTabCallback + ", type=" + this.onExtraCallback + ", time=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public AFd1wSDK1(@NotNull onWarmupCompleted onwarmupcompleted, @NotNull IAuthTabCallback iAuthTabCallback, long j) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback = onwarmupcompleted;
        this.onExtraCallback = iAuthTabCallback;
        this.onNavigationEvent = j;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AFd1wSDK1 aFd1wSDK1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(aFd1wSDK1);
        int i4 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallbackWithResult;
    }

    public final onWarmupCompleted IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback;
        int i5 = i2 + 109;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompleted;
    }

    public final IAuthTabCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 57;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback iAuthTabCallback = this.onExtraCallback;
        int i5 = i2 + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public int onExtraCallbackWithResult(@NotNull AFd1wSDK1 aFd1wSDK1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1wSDK1, "");
        int iCompare = Intrinsics.compare(this.onExtraCallback.onExtraCallback(), aFd1wSDK1.onExtraCallback.onExtraCallback());
        if (iCompare == 0) {
            return Intrinsics.compare(this.onNavigationEvent, aFd1wSDK1.onNavigationEvent);
        }
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iCompare;
        }
        throw null;
    }

    public interface IAuthTabCallback {
        public static final onNavigationEvent Companion = onNavigationEvent.onExtraCallback;

        String IAuthTabCallback();

        int onExtraCallback();

        public static final class onExtraCallbackWithResult implements IAuthTabCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent = 0;
            private static int onTransact = 1;
            private static final int onWarmupCompleted = 0;
            public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();
            private static final String onExtraCallback = "START";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onTransact + 125;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onExtraCallbackWithResult) {
                    return true;
                }
                int i4 = IAuthTabCallbackStub;
                int i5 = i4 + 111;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 77;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 77;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return -1280910695;
                }
                int i3 = 4 / 0;
                return -1280910695;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 41;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 63;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return "START";
            }

            private onExtraCallbackWithResult() {
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 15;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                int i5 = onWarmupCompleted;
                int i6 = i2 + 73;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            static {
                int i = onExtraCallbackWithResult + 41;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onTransact + 73;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                String str = onExtraCallback;
                if (i3 != 0) {
                    int i4 = 78 / 0;
                }
                return str;
            }
        }

        public static final class onExtraCallback implements IAuthTabCallback {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            private final int IAuthTabCallback;
            private final String onExtraCallback;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onExtraCallbackWithResult + 65;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (obj instanceof onExtraCallback) {
                    return Intrinsics.areEqual(this.onExtraCallback, ((onExtraCallback) obj).onExtraCallback);
                }
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    this.onExtraCallback.hashCode();
                    throw null;
                }
                int iHashCode = this.onExtraCallback.hashCode();
                int i3 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "STAMP(name=" + this.onExtraCallback + ")";
                int i2 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public onExtraCallback(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallback = str;
                this.IAuthTabCallback = 1;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                String str = this.onExtraCallback;
                int i5 = i3 + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 101;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.IAuthTabCallback;
                int i6 = i2 + 61;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }
        }

        /* renamed from: o.AFd1wSDK1$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0011IAuthTabCallback implements IAuthTabCallback {
            private static int IAuthTabCallbackStub = 1;
            private static int asInterface = 0;
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final C0011IAuthTabCallback onWarmupCompleted = new C0011IAuthTabCallback();
            private static final int IAuthTabCallback = 2;
            private static final String onExtraCallbackWithResult = "END";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = asInterface + 17;
                    IAuthTabCallbackStub = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof C0011IAuthTabCallback)) {
                    int i4 = IAuthTabCallbackStub + 19;
                    int i5 = i4 % 128;
                    asInterface = i5;
                    z = i4 % 2 != 0;
                    int i6 = i5 + 41;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 45 / 0;
                    }
                }
                return z;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = asInterface + 79;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    return 2130494674;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 37;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 13;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return "END";
                }
                throw null;
            }

            private C0011IAuthTabCallback() {
            }

            static {
                int i = onNavigationEvent + 15;
                onExtraCallback = i % 128;
                int i2 = i % 2;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 53;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = IAuthTabCallback;
                int i6 = i2 + 1;
                asInterface = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 67;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                String str = onExtraCallbackWithResult;
                int i5 = i2 + 19;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }

        public static final class onWarmupCompleted implements IAuthTabCallback {
            private static int IAuthTabCallbackStub = 0;
            private static int asInterface = 1;
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;
            public static final onWarmupCompleted onExtraCallback = new onWarmupCompleted();
            private static final int onNavigationEvent = 3;
            private static final String IAuthTabCallback = "CANCEL";

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = IAuthTabCallbackStub + 11;
                    asInterface = i2 % 128;
                    return i2 % 2 != 0;
                }
                if (obj instanceof onWarmupCompleted) {
                    return true;
                }
                int i3 = asInterface + 69;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 75;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 87;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    return -1528766717;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = asInterface;
                int i3 = i2 + 87;
                IAuthTabCallbackStub = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 27;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return "CANCEL";
                }
                throw null;
            }

            private onWarmupCompleted() {
            }

            static {
                int i = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public int onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 43;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                int i4 = onNavigationEvent;
                if (i3 == 0) {
                    int i5 = 94 / 0;
                }
                return i4;
            }

            @Override // o.AFd1wSDK1.IAuthTabCallback
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                int i3 = i2 % 128;
                asInterface = i3;
                int i4 = i2 % 2;
                String str = IAuthTabCallback;
                int i5 = i3 + 23;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }
        }

        public static final class onNavigationEvent {
            private static int IAuthTabCallback = 1;
            static final /* synthetic */ onNavigationEvent onExtraCallback = new onNavigationEvent();
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            static {
                int i = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
            }

            private onNavigationEvent() {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final IAuthTabCallback onExtraCallback(@NotNull String str) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 25;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    switch (str.hashCode()) {
                        case 68795:
                            break;
                        case 79219619:
                            break;
                        case 79219778:
                            break;
                        case 1980572282:
                            break;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    int i3 = 78 / 0;
                    switch (str.hashCode()) {
                        case 68795:
                            if (str.equals("END")) {
                                int i4 = onNavigationEvent + 63;
                                IAuthTabCallback = i4 % 128;
                                if (i4 % 2 != 0) {
                                    return C0011IAuthTabCallback.onWarmupCompleted;
                                }
                                C0011IAuthTabCallback c0011IAuthTabCallback = C0011IAuthTabCallback.onWarmupCompleted;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            break;
                        case 79219619:
                            if (str.equals("STAMP")) {
                                return new onExtraCallback(str);
                            }
                            break;
                        case 79219778:
                            if (str.equals("START")) {
                                int i5 = IAuthTabCallback + 59;
                                onNavigationEvent = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return onExtraCallbackWithResult.IAuthTabCallback;
                                }
                                int i6 = 15 / 0;
                                return onExtraCallbackWithResult.IAuthTabCallback;
                            }
                            break;
                        case 1980572282:
                            if (str.equals("CANCEL")) {
                                return onWarmupCompleted.onExtraCallback;
                            }
                            break;
                        default:
                            int i7 = IAuthTabCallback + 9;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            break;
                    }
                }
                throw new IllegalArgumentException("Unknown type: " + str);
            }
        }
    }

    public static abstract class onWarmupCompleted {
        public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        /* renamed from: o.AFd1wSDK1$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static abstract class AbstractC0012onWarmupCompleted extends onWarmupCompleted {
        }

        static {
            int i = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public abstract Map<String, Object> onExtraCallback();

        public abstract String onExtraCallbackWithResult();

        public abstract String onWarmupCompleted();

        public static final class IAuthTabCallback extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final Boolean onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final Integer onWarmupCompleted;

            /* JADX WARN: Multi-variable type inference failed */
            public IAuthTabCallback() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Home(fromLauncher=" + this.onExtraCallback + ", version=" + this.onWarmupCompleted + ")";
                int i2 = onNavigationEvent + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public IAuthTabCallback(@Nullable Boolean bool, @Nullable Integer num) {
                this.onExtraCallback = bool;
                this.onWarmupCompleted = num;
                this.onExtraCallbackWithResult = "/";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ IAuthTabCallback(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallback + 71;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    bool = null;
                }
                if ((i & 2) != 0) {
                    int i3 = IAuthTabCallback + 45;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                    num = null;
                }
                this(bool, num);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 123;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
                int i4 = IAuthTabCallback + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallbackWithResult;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 85;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onExtraCallbackWithResult;
                int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public Map<String, Object> onExtraCallback() {
                int i = 2 % 2;
                Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                mapOnExtraCallbackWithResult.put(CMSAttributeTableGenerator.CONTENT_TYPE, "myAsset");
                Boolean bool = this.onExtraCallback;
                if (bool != null) {
                    int i2 = onNavigationEvent + 81;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    mapOnExtraCallbackWithResult.put("securities_tab_clicked", bool);
                }
                Integer num = this.onWarmupCompleted;
                if (num != null) {
                    int i4 = IAuthTabCallback + 15;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    mapOnExtraCallbackWithResult.put("home_version", Integer.valueOf(num.intValue()));
                    int i6 = IAuthTabCallback + 119;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                return access8200.asBinder(mapOnExtraCallbackWithResult);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 67;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                boolean zEquals = super.equals(obj);
                int i4 = onNavigationEvent + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return zEquals;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = super.hashCode();
                int i4 = onNavigationEvent + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 92 / 0;
                }
                return iHashCode;
            }
        }

        public static final class IAuthTabCallbackDefault extends onWarmupCompleted {
            private static int IAuthTabCallbackDefault = 0;
            private static int onTransact = 1;
            private final String IAuthTabCallback;
            private final Map<String, Object> onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onWarmupCompleted;

            public IAuthTabCallbackDefault() {
                this(null, null, null, null, 15, null);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "StockDetail(contentType=" + this.onExtraCallbackWithResult + ", stockCode=" + this.onNavigationEvent + ", key=" + this.IAuthTabCallback + ", params=" + this.onExtraCallback + ")";
                int i2 = IAuthTabCallbackDefault + 87;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public IAuthTabCallbackDefault(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                this.onExtraCallbackWithResult = str;
                this.onNavigationEvent = str2;
                this.IAuthTabCallback = str3;
                this.onExtraCallback = map;
                this.onWarmupCompleted = "/stocks/[stockCode]";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ IAuthTabCallbackDefault(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = onTransact + 87;
                    IAuthTabCallbackDefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 25 / 0;
                    }
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i4 = onTransact + 119;
                    IAuthTabCallbackDefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 2;
                    }
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i6 = IAuthTabCallbackDefault + 21;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 0;
                    }
                    int i8 = 2 % 2;
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    map = access8000.IAuthTabCallback();
                    int i9 = 2 % 2;
                }
                this(str, str2, str3, map);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 99;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                String str = this.IAuthTabCallback;
                if (str != null) {
                    return str;
                }
                String str2 = onExtraCallbackWithResult() + "_" + this.onNavigationEvent;
                int i4 = onTransact + 111;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                return str2;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 49;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return this.onWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r1 r2
              0x0023: PHI (r1v5 java.util.Map) = (r1v4 java.util.Map), (r1v9 java.util.Map) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
              0x0023: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v10 java.lang.String) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o.AFd1wSDK1.onWarmupCompleted
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> onExtraCallback() {
                Map mapOnExtraCallbackWithResult;
                String str;
                int i = 2 % 2;
                int i2 = onTransact + 75;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                    str = this.onExtraCallbackWithResult;
                    int i3 = 92 / 0;
                    if (str != null) {
                    }
                } else {
                    mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                    str = this.onExtraCallbackWithResult;
                    if (str != null) {
                    }
                }
                String str2 = this.onNavigationEvent;
                if (str2 != null) {
                    mapOnExtraCallbackWithResult.put("stockCode", str2);
                }
                Map<String, Object> mapOnExtraCallbackWithResult2 = access8000.onExtraCallbackWithResult(access8200.asBinder(mapOnExtraCallbackWithResult), this.onExtraCallback);
                int i4 = onTransact + 119;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return mapOnExtraCallbackWithResult2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 41;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                boolean zEquals = super.equals(obj);
                int i4 = IAuthTabCallbackDefault + 91;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return zEquals;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 85;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return super.hashCode();
                }
                super.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onExtraCallback extends AbstractC0012onWarmupCompleted {
            private static int IAuthTabCallbackStub = 0;
            private static int onTransact = 1;
            private final String IAuthTabCallback;
            private final String onExtraCallback;
            private final Map<String, Object> onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onWarmupCompleted;

            public onExtraCallback() {
                this(null, null, null, null, 15, null);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Quotes(contentType=" + this.IAuthTabCallback + ", stockCode=" + this.onNavigationEvent + ", key=" + this.onExtraCallback + ", params=" + this.onExtraCallbackWithResult + ")";
                int i2 = onTransact + 81;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onExtraCallback(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                this.IAuthTabCallback = str;
                this.onNavigationEvent = str2;
                this.onExtraCallback = str3;
                this.onExtraCallbackWithResult = map;
                this.onWarmupCompleted = "/quotes";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onExtraCallback(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = IAuthTabCallbackStub + 41;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw null;
                    }
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i3 = IAuthTabCallbackStub;
                    int i4 = i3 + 111;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 75;
                    onTransact = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 5;
                    } else {
                        int i8 = 2 % 2;
                    }
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i9 = 2 % 2;
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    map = access8000.IAuthTabCallback();
                    int i10 = IAuthTabCallbackStub + 17;
                    onTransact = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 2 % 2;
                }
                this(str, str2, str3, map);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onTransact + 11;
                IAuthTabCallbackStub = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                String str = this.onExtraCallback;
                if (str == null) {
                    str = onExtraCallbackWithResult() + "_" + this.onNavigationEvent;
                }
                int i3 = onTransact + 1;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub;
                int i3 = i2 + 111;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onWarmupCompleted;
                int i5 = i2 + 103;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public Map<String, Object> onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 5;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                    String str = this.IAuthTabCallback;
                    if (str != null) {
                    }
                    String str2 = this.onNavigationEvent;
                    if (str2 != null) {
                        mapOnExtraCallbackWithResult.put("stockCode", str2);
                        int i3 = IAuthTabCallbackStub + 43;
                        onTransact = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    return access8000.onExtraCallbackWithResult(access8200.asBinder(mapOnExtraCallbackWithResult), this.onExtraCallbackWithResult);
                }
                access8200.onExtraCallbackWithResult();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackStub + 63;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    super.equals(obj);
                    throw null;
                }
                boolean zEquals = super.equals(obj);
                int i3 = onTransact + 39;
                IAuthTabCallbackStub = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 64 / 0;
                }
                return zEquals;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public int hashCode() {
                int i = 2 % 2;
                int i2 = onTransact + 109;
                IAuthTabCallbackStub = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = super.hashCode();
                int i4 = IAuthTabCallbackStub + 61;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }
        }

        public static final class onTransact extends onWarmupCompleted {
            private static int asInterface = 0;
            private static int onTransact = 1;
            private final Map<String, Object> IAuthTabCallback;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onNavigationEvent;
            private final String onWarmupCompleted;

            public onTransact() {
                this(null, null, null, null, 15, null);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Trading(contentType=" + this.onWarmupCompleted + ", stockCode=" + this.onExtraCallbackWithResult + ", key=" + this.onExtraCallback + ", params=" + this.IAuthTabCallback + ")";
                int i2 = onTransact + 21;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onTransact(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                this.onWarmupCompleted = str;
                this.onExtraCallbackWithResult = str2;
                this.onExtraCallback = str3;
                this.IAuthTabCallback = map;
                this.onNavigationEvent = "/trading";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onTransact(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                Object obj = null;
                if ((i & 1) != 0) {
                    int i2 = asInterface + 23;
                    onTransact = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i3 = onTransact + 5;
                    asInterface = i3 % 128;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i4 = onTransact + 123;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    int i7 = onTransact + 51;
                    asInterface = i7 % 128;
                    if (i7 % 2 != 0) {
                        map = access8000.IAuthTabCallback();
                        int i8 = 26 / 0;
                    } else {
                        map = access8000.IAuthTabCallback();
                    }
                    int i9 = 2 % 2;
                }
                this(str, str2, str3, map);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = asInterface + 125;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onExtraCallback;
                if (str == null) {
                    str = onExtraCallbackWithResult() + "_" + this.onExtraCallbackWithResult;
                    int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                }
                int i6 = onTransact + 3;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 41;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onNavigationEvent;
                int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public Map<String, Object> onExtraCallback() {
                int i = 2 % 2;
                int i2 = asInterface + Imgproc.COLOR_YUV2RGB_YVYU;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    access8200.onExtraCallbackWithResult();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                String str = this.onWarmupCompleted;
                if (str != null) {
                    int i3 = asInterface + 51;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                }
                String str2 = this.onExtraCallbackWithResult;
                if (str2 != null) {
                    mapOnExtraCallbackWithResult.put("stockCode", str2);
                }
                return access8000.onExtraCallbackWithResult(access8200.asBinder(mapOnExtraCallbackWithResult), this.IAuthTabCallback);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                boolean zEquals = super.equals(obj);
                int i4 = asInterface + 5;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return zEquals;
                }
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public int hashCode() {
                int i = 2 % 2;
                int i2 = asInterface + 37;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return super.hashCode();
                }
                super.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent extends AbstractC0012onWarmupCompleted {
            private static int onNavigationEvent = 0;
            private static int onTransact = 1;
            private final Map<String, Object> IAuthTabCallback;
            private final String onExtraCallback;
            private final String onExtraCallbackWithResult;
            private final String onWarmupCompleted;

            public onNavigationEvent() {
                this(null, null, null, 7, null);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Community(stockCode=" + this.onWarmupCompleted + ", key=" + this.onExtraCallback + ", params=" + this.IAuthTabCallback + ")";
                int i2 = onTransact + 59;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 55 / 0;
                }
                return str;
            }

            public onNavigationEvent(@Nullable String str, @Nullable String str2, @NotNull Map<String, ? extends Object> map) {
                Intrinsics.checkNotNullParameter(map, "");
                this.onWarmupCompleted = str;
                this.onExtraCallback = str2;
                this.IAuthTabCallback = map;
                this.onExtraCallbackWithResult = "/community";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onNavigationEvent(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 1) != 0) {
                    int i2 = 2 % 2;
                    str = null;
                }
                if ((i & 2) != 0) {
                    int i3 = onNavigationEvent + 59;
                    onTransact = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 2 % 2;
                    }
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    int i5 = onNavigationEvent + 71;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    map = access8000.IAuthTabCallback();
                    int i7 = onNavigationEvent + 69;
                    onTransact = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 2 % 2;
                    }
                }
                this(str, str2, map);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onWarmupCompleted() {
                int i = 2 % 2;
                String str = this.onExtraCallback;
                if (str == null) {
                    str = onExtraCallbackWithResult() + "_" + this.onWarmupCompleted;
                    int i2 = onTransact + 99;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = onTransact + 119;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public String onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onTransact;
                int i3 = i2 + 101;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                String str = this.onExtraCallbackWithResult;
                int i4 = i2 + 9;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return str;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public Map<String, Object> onExtraCallback() {
                int i = 2 % 2;
                Map mapOnExtraCallbackWithResult = access8200.onExtraCallbackWithResult();
                mapOnExtraCallbackWithResult.put(CMSAttributeTableGenerator.CONTENT_TYPE, "community");
                String str = this.onWarmupCompleted;
                if (str != null) {
                    int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
                    onNavigationEvent = i2 % 128;
                    if (i2 % 2 != 0) {
                        mapOnExtraCallbackWithResult.put("stockCode", str);
                        int i3 = 30 / 0;
                    } else {
                        mapOnExtraCallbackWithResult.put("stockCode", str);
                    }
                    int i4 = onNavigationEvent + 37;
                    onTransact = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 3 % 3;
                    }
                }
                return access8000.onExtraCallbackWithResult(access8200.asBinder(mapOnExtraCallbackWithResult), this.IAuthTabCallback);
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                boolean zEquals = super.equals(obj);
                int i4 = onNavigationEvent + 9;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    return zEquals;
                }
                throw null;
            }

            @Override // o.AFd1wSDK1.onWarmupCompleted
            public int hashCode() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 5;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    return super.hashCode();
                }
                super.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        
            if (r7 == null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        
            r4 = o.AFd1wSDK1.onWarmupCompleted.onExtraCallback + 49;
            o.AFd1wSDK1.onWarmupCompleted.IAuthTabCallback = r4 % 128;
            r4 = r4 % 2;
            r0 = r7.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            r4 = o.AFd1wSDK1.onWarmupCompleted.IAuthTabCallback + 37;
            o.AFd1wSDK1.onWarmupCompleted.onExtraCallback = r4 % 128;
            r4 = r4 % 2;
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r0) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(onWarmupCompleted(), ((o.AFd1wSDK1.onWarmupCompleted) r7).onWarmupCompleted()) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 == r7) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            r1 = getClass();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = onWarmupCompleted().hashCode() * 31;
            int i4 = IAuthTabCallback + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public static final class onExtraCallbackWithResult {
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallbackWithResult() {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Multi-variable type inference failed */
            public final onWarmupCompleted onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map) {
                int i = 2;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                switch (str.hashCode()) {
                    case -2126449510:
                        if (str.equals("/community")) {
                            if (map == null) {
                                int i3 = onExtraCallbackWithResult + 33;
                                onExtraCallback = i3 % 128;
                                if (i3 % 2 == 0) {
                                    map = access8000.IAuthTabCallback();
                                    int i4 = 99 / 0;
                                } else {
                                    map = access8000.IAuthTabCallback();
                                }
                            }
                            return new onNavigationEvent(null, str2, map, 1, null);
                        }
                        break;
                    case -759660014:
                        if (!(!str.equals("/trading"))) {
                            int i5 = onExtraCallback + 61;
                            int i6 = i5 % 128;
                            onExtraCallbackWithResult = i6;
                            int i7 = i5 % 2;
                            if (map == null) {
                                int i8 = i6 + 21;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                map = access8000.IAuthTabCallback();
                            }
                            return new onTransact(str3, null, str2, map, 2, null);
                        }
                        break;
                    case 47:
                        if (str.equals("/")) {
                            return new IAuthTabCallback(null, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
                        }
                        break;
                    case 880847026:
                        if (str.equals("/stocks/[stockCode]")) {
                            if (map == null) {
                                map = access8000.IAuthTabCallback();
                            }
                            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(str3, null, str2, map, 2, null);
                            int i10 = onExtraCallback + 105;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return iAuthTabCallbackDefault;
                        }
                        break;
                    case 2109567590:
                        if (!(!str.equals("/quotes"))) {
                            int i12 = onExtraCallbackWithResult + 1;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            if (map == null) {
                                map = access8000.IAuthTabCallback();
                            }
                            return new onExtraCallback(str3, null, str2, map, 2, null);
                        }
                        break;
                }
                throw new IllegalArgumentException("Unknown tag: " + str);
            }
        }
    }
}
