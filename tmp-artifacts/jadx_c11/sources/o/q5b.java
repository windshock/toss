package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q5b {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static int asInterface;
    private static int onTransact;
    private final LinkedHashMap<q7, IAuthTabCallback> IAuthTabCallback;
    private long IAuthTabCallbackStub;
    private final Function0<Long> onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final Object onWarmupCompleted;

    static {
        int i = onTransact + 123;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public q5b(long j, int i, @NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = j;
        this.onExtraCallback = function0;
        this.onNavigationEvent = RangesKt.coerceAtLeast(i, 1);
        this.onWarmupCompleted = new Object();
        this.IAuthTabCallback = new LinkedHashMap<>();
        this.IAuthTabCallbackStub = ((Number) function0.invoke()).longValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q5b(long j, int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = asInterface;
            int i4 = i3 + 67;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            j = 60000;
        }
        if ((i2 & 2) != 0) {
            int i9 = IAuthTabCallbackDefault + 39;
            asInterface = i9 % 128;
            i = i9 % 2 != 0 ? 0 : 31;
            int i10 = 2 % 2;
        }
        this(j, i, function0);
    }

    public final List<r8lambdalzLoST8ymKYgG6aEHcG97m8xISw> onExtraCallback(@NotNull q7 q7Var, @NotNull q7 q7Var2, boolean z, long j, long j2) {
        List<r8lambdalzLoST8ymKYgG6aEHcG97m8xISw> listEmptyList;
        Intrinsics.checkNotNullParameter(q7Var, "");
        Intrinsics.checkNotNullParameter(q7Var2, "");
        long jLongValue = ((Number) this.onExtraCallback.invoke()).longValue();
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j, 0L);
        synchronized (this.onWarmupCompleted) {
            if (onWarmupCompleted(jLongValue)) {
                listEmptyList = IAuthTabCallback("interval", jLongValue);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            Pair<q7, Boolean> pairIAuthTabCallback = IAuthTabCallback(q7Var, q7Var2);
            q7 q7Var3 = (q7) pairIAuthTabCallback.onExtraCallbackWithResult();
            boolean zBooleanValue = ((Boolean) pairIAuthTabCallback.IAuthTabCallback()).booleanValue();
            LinkedHashMap<q7, IAuthTabCallback> linkedHashMap = this.IAuthTabCallback;
            IAuthTabCallback iAuthTabCallback = linkedHashMap.get(q7Var3);
            if (iAuthTabCallback == null) {
                iAuthTabCallback = new IAuthTabCallback(zBooleanValue);
                linkedHashMap.put(q7Var3, iAuthTabCallback);
            }
            IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
            boolean z2 = false;
            iAuthTabCallback2.onExtraCallbackWithResult(iAuthTabCallback2.onExtraCallbackWithResult() || zBooleanValue);
            if (z && jCoerceAtLeast >= j2) {
                z2 = true;
            }
            iAuthTabCallback2.onWarmupCompleted(z, jCoerceAtLeast, z2);
        }
        return listEmptyList;
    }

    public final List<r8lambdalzLoST8ymKYgG6aEHcG97m8xISw> onExtraCallback(@NotNull String str) {
        List<r8lambdalzLoST8ymKYgG6aEHcG97m8xISw> listIAuthTabCallback;
        Intrinsics.checkNotNullParameter(str, "");
        long jLongValue = ((Number) this.onExtraCallback.invoke()).longValue();
        synchronized (this.onWarmupCompleted) {
            listIAuthTabCallback = IAuthTabCallback(str, jLongValue);
        }
        return listIAuthTabCallback;
    }

    public final void onNavigationEvent() {
        long jLongValue = ((Number) this.onExtraCallback.invoke()).longValue();
        synchronized (this.onWarmupCompleted) {
            this.IAuthTabCallback.clear();
            this.IAuthTabCallbackStub = jLongValue;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        long j2 = this.IAuthTabCallbackStub;
        if (i4 == 0 ? j - j2 >= this.onExtraCallbackWithResult : j % j2 >= this.onExtraCallbackWithResult) {
            int i5 = i3 + 17;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = i3 + 19;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<q7, Boolean> IAuthTabCallback(q7 q7Var, q7 q7Var2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallback.containsKey(q7Var)) {
            return getWrite.IAuthTabCallback(q7Var, Boolean.FALSE);
        }
        Collection<IAuthTabCallback> collectionValues = this.IAuthTabCallback.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Collection<IAuthTabCallback> collection = collectionValues;
        int i4 = 0;
        if (!collection.isEmpty()) {
            int i5 = IAuthTabCallbackDefault + 33;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            Iterator<T> it = collection.iterator();
            int i7 = IAuthTabCallbackDefault + 97;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (it.hasNext()) {
                int i10 = IAuthTabCallbackDefault + 111;
                asInterface = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 94 / 0;
                    if (!((IAuthTabCallback) it.next()).onExtraCallbackWithResult()) {
                        i9++;
                        if (i9 >= 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else if (!((IAuthTabCallback) it.next()).onExtraCallbackWithResult()) {
                    i9++;
                    if (i9 >= 0) {
                    }
                }
            }
            i4 = i9;
        }
        return i4 < this.onNavigationEvent ? getWrite.IAuthTabCallback(q7Var, Boolean.FALSE) : getWrite.IAuthTabCallback(q7Var2, Boolean.TRUE);
    }

    private final List<r8lambdalzLoST8ymKYgG6aEHcG97m8xISw> IAuthTabCallback(String str, long j) throws Throwable {
        int i = 2 % 2;
        long jCoerceAtLeast = RangesKt.coerceAtLeast(j - this.IAuthTabCallbackStub, 0L);
        if (this.IAuthTabCallback.isEmpty()) {
            int i2 = IAuthTabCallbackDefault + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStub = j;
            return CollectionsKt.emptyList();
        }
        String strOnNavigationEvent = q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 2, null);
        String strOnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(jCoerceAtLeast);
        LinkedHashMap<q7, IAuthTabCallback> linkedHashMap = this.IAuthTabCallback;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry<q7, IAuthTabCallback> entry : linkedHashMap.entrySet()) {
            q7 key = entry.getKey();
            IAuthTabCallback value = entry.getValue();
            arrayList.add(new r8lambdalzLoST8ymKYgG6aEHcG97m8xISw(key, value.onNavigationEvent(), value.asInterface(), value.onWarmupCompleted(), value.IAuthTabCallback(), value.onExtraCallback(), strOnNavigationEvent, strOnExtraCallbackWithResult, value.onExtraCallbackWithResult()));
            int i4 = asInterface + 105;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        this.IAuthTabCallback.clear();
        this.IAuthTabCallbackStub = j;
        return arrayList;
    }

    static final class IAuthTabCallback {
        private static int asBinder = 0;
        private static int asInterface = 1;
        private boolean IAuthTabCallback;
        private long IAuthTabCallbackStub;
        private long onExtraCallback;
        private long onExtraCallbackWithResult;
        private long onNavigationEvent;
        private long onWarmupCompleted;

        public IAuthTabCallback(boolean z) {
            this.IAuthTabCallback = z;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = asBinder + 63;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallback = z;
            int i5 = i3 + 97;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface + 51;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            boolean z = this.IAuthTabCallback;
            int i5 = i3 + 117;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asInterface + 27;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            long j = this.onExtraCallbackWithResult;
            int i4 = i3 + 59;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        public final long asInterface() {
            int i = 2 % 2;
            int i2 = asInterface + 23;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallbackStub;
            }
            int i3 = 83 / 0;
            return this.IAuthTabCallbackStub;
        }

        public final long onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 121;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = this.onWarmupCompleted;
            int i4 = i2 + 125;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
            }
            return j;
        }

        public final long IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface + 35;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            long j = this.onExtraCallback;
            int i4 = i3 + 81;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return j;
            }
            throw null;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 67;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            long j = this.onNavigationEvent;
            int i5 = i2 + 1;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        public final void onWarmupCompleted(boolean z, long j, boolean z2) {
            int i = 2 % 2;
            this.onExtraCallbackWithResult++;
            if (z) {
                int i2 = asBinder;
                int i3 = i2 + 15;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                this.IAuthTabCallbackStub++;
                if (z2) {
                    int i5 = i2 + 31;
                    asInterface = i5 % 128;
                    int i6 = i5 % 2;
                    this.onExtraCallback++;
                }
            } else {
                this.onWarmupCompleted++;
            }
            this.onNavigationEvent = Math.max(this.onNavigationEvent, j);
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final String onExtraCallbackWithResult(long j) {
            int i = 2 % 2;
            if (j < 10000) {
                int i2 = onNavigationEvent + 125;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return "lt_10s";
            }
            if (j < 60000) {
                return "lt_1m";
            }
            if (j >= 300000) {
                return "gte_5m";
            }
            int i4 = IAuthTabCallback + 75;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return "lt_5m";
            }
            throw null;
        }
    }
}
