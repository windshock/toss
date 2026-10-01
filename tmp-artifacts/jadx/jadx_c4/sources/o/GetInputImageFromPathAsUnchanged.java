package o;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GetInputImageFromPathAsUnchanged;
import o.access;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetInputImageFromPathAsUnchanged {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final AppSetIdAndScope1 onNavigationEvent;
    private static int onTransact = 1;
    private volatile IAuthTabCallback IAuthTabCallback;
    private final ConcurrentHashMap<String, onExtraCallback> IAuthTabCallbackStub;
    private final CopyOnWriteArrayList<onWarmupCompleted> onExtraCallback;
    private final Function2<String, Integer, Unit> onExtraCallbackWithResult;
    private final ConcurrentHashMap<String, onExtraCallbackWithResult> onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetInputImageFromPathAsUnchanged() {
        IAuthTabCallback iAuthTabCallback = null;
        this(iAuthTabCallback, iAuthTabCallback, 3, iAuthTabCallback);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i)) | i8 | (~(i2 | i));
        int i10 = (~((~i2) | i6)) | (~(i6 | i));
        int i11 = (~((~i) | i7)) | i8;
        int i12 = i6 + i2 + i5 + (1821889583 * i4) + ((-349070011) * i3);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i2) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i5) + (473956352 * i4) + (1723858944 * i3) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i2 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i5 * 921699455) + (i4 * 347275089) + (i3 * 1925323067) + (i13 * 94371840);
        if (i14 + (i15 * i15 * (-174063616)) != 1) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i16 = 2 % 2;
            int i17 = IAuthTabCallbackDefault + 111;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
            boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
            int i19 = onTransact + 91;
            IAuthTabCallbackDefault = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        Map.Entry entry = (Map.Entry) objArr[2];
        int i21 = 2 % 2;
        int i22 = IAuthTabCallbackDefault + 53;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        Object value = entry.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        onExtraCallback onextracallback = (onExtraCallback) value;
        long j = onextracallback.onExtraCallbackWithResult().get();
        long j2 = onextracallback.onExtraCallback().get();
        if (j > 0) {
            int i24 = onTransact + 51;
            IAuthTabCallbackDefault = i24 % 128;
            if (i24 % 2 == 0 ? jLongValue - j > jLongValue2 : j * jLongValue > jLongValue2) {
                if (j2 < jLongValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean IAuthTabCallback(long j, long j2, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), entry};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iIAuthTabCallback, 1207429208, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, -1207429207)).booleanValue();
        int i4 = onTransact + 39;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetInputImageFromPathAsUnchanged(@NotNull IAuthTabCallback iAuthTabCallback, @Nullable Function2<? super String, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback = iAuthTabCallback;
        this.onExtraCallbackWithResult = function2;
        this.IAuthTabCallbackStub = new ConcurrentHashMap<>();
        this.onWarmupCompleted = new ConcurrentHashMap<>();
        this.onExtraCallback = new CopyOnWriteArrayList<>();
    }

    public /* synthetic */ GetInputImageFromPathAsUnchanged(IAuthTabCallback iAuthTabCallback, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            iAuthTabCallback = new IAuthTabCallback(0L, 0, 0L, 7, null);
            int i2 = IAuthTabCallbackDefault + 11;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = onTransact + 57;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            function2 = null;
        }
        this(iAuthTabCallback, function2);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("LogCircuitBreaker");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        onNavigationEvent = appSetIdAndScope1OnExtraCallbackWithResult;
        int i = asInterface + 57;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final void onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.IAuthTabCallback = iAuthTabCallback;
        new Object[]{Integer.valueOf(iAuthTabCallback.onWarmupCompleted()), Long.valueOf(iAuthTabCallback.onExtraCallback()), Long.valueOf(iAuthTabCallback.onExtraCallbackWithResult())};
        int i4 = onTransact + 123;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        private final long IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final long onNavigationEvent;

        public IAuthTabCallback() {
            this(0L, 0, 0L, 7, null);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 31;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (this.onNavigationEvent != iAuthTabCallback.onNavigationEvent) {
                int i6 = i2 + 29;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.onExtraCallbackWithResult == iAuthTabCallback.onExtraCallbackWithResult) {
                return this.IAuthTabCallback == iAuthTabCallback.IAuthTabCallback;
            }
            int i8 = i4 + 125;
            onExtraCallback = i8 % 128;
            return i8 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Long.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onExtraCallbackWithResult)) * 31) + Long.hashCode(this.IAuthTabCallback);
            int i4 = onExtraCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Config(windowMillis=" + this.onNavigationEvent + ", threshold=" + this.onExtraCallbackWithResult + ", cooldownMillis=" + this.IAuthTabCallback + ")";
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public IAuthTabCallback(long j, int i, long j2) {
            this.onNavigationEvent = j;
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = j2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(long j, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 1) != 0) {
                int i3 = onExtraCallback + 17;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 2;
                } else {
                    int i7 = 2 % 2;
                }
                j = 10000;
            }
            long j3 = j;
            if ((i2 & 2) != 0) {
                int i8 = 2 % 2;
                i = 500;
            }
            int i9 = i;
            if ((i2 & 4) != 0) {
                int i10 = onExtraCallback + 15;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 2 % 2;
                }
                j2 = 60000;
            }
            this(j3, i9, j2);
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 19;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            long j = this.onNavigationEvent;
            int i5 = i3 + 79;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final int onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = i2 + 83;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 15;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            long j = this.IAuthTabCallback;
            int i5 = i2 + 119;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 36 / 0;
            }
            return j;
        }
    }

    static final class onExtraCallbackWithResult {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final IAuthTabCallback onNavigationEvent;
        private final Function1<InterfaceC0059deInitialize, String> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onExtraCallbackWithResult(@NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
            this.onNavigationEvent = iAuthTabCallback;
        }

        public final Function1<InterfaceC0059deInitialize, String> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            Function1<InterfaceC0059deInitialize, String> function1 = this.onWarmupCompleted;
            int i5 = i3 + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IAuthTabCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 99;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = this.onNavigationEvent;
            int i4 = i2 + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 77 / 0;
            }
            return iAuthTabCallback;
        }
    }

    static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final Function1<InterfaceC0059deInitialize, String> onExtraCallback;
        private final IAuthTabCallback onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(@NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = function1;
            this.onWarmupCompleted = iAuthTabCallback;
        }

        public final Function1<InterfaceC0059deInitialize, String> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            Function1<InterfaceC0059deInitialize, String> function1 = this.onExtraCallback;
            int i5 = i3 + 49;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return function1;
        }

        public final IAuthTabCallback onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 51;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
            int i5 = i2 + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int asInterface = 1;
        private final AtomicInteger onNavigationEvent = new AtomicInteger(0);
        private final AtomicLong onWarmupCompleted = new AtomicLong(0);
        private final AtomicLong onExtraCallback = new AtomicLong(0);
        private final AtomicBoolean onExtraCallbackWithResult = new AtomicBoolean(false);

        public final AtomicInteger onNavigationEvent() {
            AtomicInteger atomicInteger;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                atomicInteger = this.onNavigationEvent;
                int i4 = 14 / 0;
            } else {
                atomicInteger = this.onNavigationEvent;
            }
            int i5 = i3 + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return atomicInteger;
        }

        public final AtomicLong onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AtomicLong atomicLong = this.onWarmupCompleted;
            int i5 = i2 + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return atomicLong;
        }

        public final AtomicLong onExtraCallback() {
            AtomicLong atomicLong;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            int i3 = i2 % 128;
            asInterface = i3;
            if (i2 % 2 == 0) {
                atomicLong = this.onExtraCallback;
                int i4 = 58 / 0;
            } else {
                atomicLong = this.onExtraCallback;
            }
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return atomicLong;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AtomicBoolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 3;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            AtomicBoolean atomicBoolean = this.onExtraCallbackWithResult;
            int i4 = i2 + 97;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return atomicBoolean;
            }
            throw null;
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted.put(str, new onExtraCallbackWithResult(function1, iAuthTabCallback));
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Function1<? super InterfaceC0059deInitialize, String> function1, @Nullable IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback.add(new onWarmupCompleted(function1, iAuthTabCallback));
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r1 = r4.IAuthTabCallback;
        r2 = o.GetInputImageFromPathAsUnchanged.onTransact + 121;
        o.GetInputImageFromPathAsUnchanged.IAuthTabCallbackDefault = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        return o.getWrite.IAuthTabCallback(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        r1 = r4.onExtraCallback.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r1.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r2 = o.GetInputImageFromPathAsUnchanged.IAuthTabCallbackDefault + 63;
        o.GetInputImageFromPathAsUnchanged.onTransact = r2 % 128;
        r2 = r2 % 2;
        r2 = r1.next();
        r3 = (java.lang.String) r2.onWarmupCompleted().invoke(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r5 = r2.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r5 = r4.IAuthTabCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        return o.getWrite.IAuthTabCallback(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        return o.getWrite.IAuthTabCallback(o.checkValidPitchUnder.IAuthTabCallback(r5) + ":" + r5.IAuthTabCallbackStubProxy(), r4.IAuthTabCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r5 = r1.onNavigationEvent().invoke(r5);
        r1 = r1.onExtraCallbackWithResult();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, IAuthTabCallback> onNavigationEvent(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
            onextracallbackwithresult = this.onWarmupCompleted.get(interfaceC0059deInitialize.IAuthTabCallbackStubProxy());
            int i3 = 30 / 0;
        } else {
            Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
            onextracallbackwithresult = this.onWarmupCompleted.get(interfaceC0059deInitialize.IAuthTabCallbackStubProxy());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        onExtraCallback onextracallbackPutIfAbsent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Pair<String, IAuthTabCallback> pairOnNavigationEvent = onNavigationEvent(interfaceC0059deInitialize);
        String str = (String) pairOnNavigationEvent.onExtraCallbackWithResult();
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) pairOnNavigationEvent.IAuthTabCallback();
        ConcurrentHashMap<String, onExtraCallback> concurrentHashMap = this.IAuthTabCallbackStub;
        onExtraCallback onextracallback = concurrentHashMap.get(str);
        if (onextracallback == null && (onextracallbackPutIfAbsent = concurrentHashMap.putIfAbsent(str, (onextracallback = new onExtraCallback()))) != null) {
            onextracallback = onextracallbackPutIfAbsent;
        }
        onExtraCallback onextracallback2 = onextracallback;
        long j = onextracallback2.onExtraCallback().get();
        if (j > 0) {
            if (jCurrentTimeMillis < j) {
                int i2 = IAuthTabCallbackDefault + 87;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            new Object[]{str, Integer.valueOf(onextracallback2.onNavigationEvent().get()), Long.valueOf(jCurrentTimeMillis - j)};
            onextracallback2.onExtraCallback().set(0L);
            onextracallback2.onNavigationEvent().set(0);
            onextracallback2.onExtraCallbackWithResult().set(jCurrentTimeMillis);
            onextracallback2.IAuthTabCallback().set(false);
            return false;
        }
        long j2 = onextracallback2.onExtraCallbackWithResult().get();
        if (j2 == 0 || jCurrentTimeMillis - j2 > iAuthTabCallback.onExtraCallback()) {
            onextracallback2.onExtraCallbackWithResult().set(jCurrentTimeMillis);
            onextracallback2.onNavigationEvent().set(1);
            return false;
        }
        int iIncrementAndGet = onextracallback2.onNavigationEvent().incrementAndGet();
        if (iIncrementAndGet <= iAuthTabCallback.onWarmupCompleted()) {
            return false;
        }
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            onextracallback2.onExtraCallback().set(jCurrentTimeMillis & iAuthTabCallback.onExtraCallbackWithResult());
            if (onextracallback2.IAuthTabCallback().compareAndSet(false, true)) {
                new Object[]{str, Integer.valueOf(iIncrementAndGet), Integer.valueOf(iAuthTabCallback.onWarmupCompleted()), Long.valueOf(iAuthTabCallback.onExtraCallbackWithResult())};
                Function2<String, Integer, Unit> function2 = this.onExtraCallbackWithResult;
                if (function2 != null) {
                    int i5 = IAuthTabCallbackDefault + 27;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                    function2.invoke(str, Integer.valueOf(iIncrementAndGet));
                }
            }
        } else {
            onextracallback2.onExtraCallback().set(jCurrentTimeMillis + iAuthTabCallback.onExtraCallbackWithResult());
            if (onextracallback2.IAuthTabCallback().compareAndSet(false, true)) {
            }
        }
        return true;
    }

    public static /* synthetic */ void IAuthTabCallback(GetInputImageFromPathAsUnchanged getInputImageFromPathAsUnchanged, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 11;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            j = 300000;
        }
        getInputImageFromPathAsUnchanged.onWarmupCompleted(j);
        int i8 = onTransact + 103;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Boolean bool = (Boolean) function1.invoke(obj);
        if (i3 != 0) {
            bool.booleanValue();
            obj2.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = onTransact + 79;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public final void onWarmupCompleted(final long j) {
        int i = 2 % 2;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Set<Map.Entry<String, onExtraCallback>> setEntrySet = this.IAuthTabCallbackStub.entrySet();
        final Function1 function1 = new Function1() { // from class: im.toss.core.tracker.LogCircuitBreaker$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 77;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return Boolean.valueOf(GetInputImageFromPathAsUnchanged.IAuthTabCallback(jCurrentTimeMillis, j, (Map.Entry) obj));
                }
                Boolean.valueOf(GetInputImageFromPathAsUnchanged.IAuthTabCallback(jCurrentTimeMillis, j, (Map.Entry) obj));
                throw null;
            }
        };
        setEntrySet.removeIf(new Predicate() { // from class: im.toss.core.tracker.LogCircuitBreaker$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1, obj};
                int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                boolean zBooleanValue = ((Boolean) GetInputImageFromPathAsUnchanged.IAuthTabCallback(iIAuthTabCallback, -168345977, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, 168345977)).booleanValue();
                int i5 = IAuthTabCallback + 5;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 6 / 0;
                }
                return zBooleanValue;
            }
        });
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, -168345977, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), new Object[]{function1, obj}, iIAuthTabCallback3, iIAuthTabCallback2, 168345977)).booleanValue();
    }

    private static final boolean onNavigationEvent(long j, long j2, Map.Entry entry) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), entry};
        int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback, 1207429208, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), objArr, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), iIAuthTabCallback2, -1207429207)).booleanValue();
    }
}
