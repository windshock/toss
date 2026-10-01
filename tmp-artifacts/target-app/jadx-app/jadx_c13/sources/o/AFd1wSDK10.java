package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AFd1wSDK1;
import o.AFd1wSDK10;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFd1wSDK10 implements AFd1wSDKExternalSyntheticLambda3 {
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult;
    private final AFd1wSDKExternalSyntheticLambda1 IAuthTabCallback;
    private final zzag onExtraCallback;
    private final AppSetIdAndScope1 onNavigationEvent;
    private final ConcurrentHashMap<AFd1wSDK1.onWarmupCompleted, List<AFd1wSDK1>> onWarmupCompleted;

    public static /* synthetic */ boolean onWarmupCompleted(String str, AFd1wSDK1 aFd1wSDK1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(str, aFd1wSDK1);
        int i4 = onExtraCallbackWithResult + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return zOnExtraCallback;
    }

    public AFd1wSDK10(@NotNull zzag zzagVar, @NotNull AFd1wSDKExternalSyntheticLambda1 aFd1wSDKExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(zzagVar, "");
        Intrinsics.checkNotNullParameter(aFd1wSDKExternalSyntheticLambda1, "");
        this.onExtraCallback = zzagVar;
        this.IAuthTabCallback = aFd1wSDKExternalSyntheticLambda1;
        this.onNavigationEvent = ea10.onExtraCallbackWithResult(Reflection.getOrCreateKotlinClass(AFd1wSDK10.class).getSimpleName());
        this.onWarmupCompleted = new ConcurrentHashMap<>();
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda3
    public zzag onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzag zzagVar = this.onExtraCallback;
        int i4 = i2 + 23;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return zzagVar;
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda3
    public void onExtraCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (onNavigationEvent(onwarmupcompleted, j)) {
            Objects.toString(onwarmupcompleted);
            return;
        }
        ConcurrentHashMap<AFd1wSDK1.onWarmupCompleted, List<AFd1wSDK1>> concurrentHashMap = this.onWarmupCompleted;
        List<AFd1wSDK1> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        listSynchronizedList.add(new AFd1wSDK1(onwarmupcompleted, AFd1wSDK1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback, j));
        concurrentHashMap.put(onwarmupcompleted, listSynchronizedList);
        Objects.toString(onwarmupcompleted);
        int i4 = asBinder + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean onNavigationEvent(AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j) {
        List<AFd1wSDK1> list;
        boolean z;
        if (!(onwarmupcompleted instanceof AFd1wSDK1.onWarmupCompleted.AbstractC0012onWarmupCompleted) || (list = this.onWarmupCompleted.get(onwarmupcompleted)) == null) {
            return false;
        }
        synchronized (list) {
            if (AFd1wSDK2.onExtraCallback(list, AFd1wSDK1.IAuthTabCallback.C0011IAuthTabCallback.onWarmupCompleted)) {
                list.add(new AFd1wSDK1(onwarmupcompleted, AFd1wSDK1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback, j));
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        onExtraCallbackWithResult(onwarmupcompleted);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:9:0x002f, B:11:0x0036, B:14:0x0040, B:15:0x0044, B:17:0x004a, B:25:0x006e, B:23:0x0063, B:24:0x006b), top: B:31:0x002f }] */
    @Override // o.AFd1wSDKExternalSyntheticLambda3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, @NotNull final String str, boolean z, long j) {
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str, "");
        List<AFd1wSDK1> list = this.onWarmupCompleted.get(onwarmupcompleted);
        if (list == null) {
            IAuthTabCallback(new AFd1wSDK1(onwarmupcompleted, new AFd1wSDK1.IAuthTabCallback.onExtraCallback(str), j));
            return;
        }
        AFd1wSDK1 aFd1wSDK1 = new AFd1wSDK1(onwarmupcompleted, new AFd1wSDK1.IAuthTabCallback.onExtraCallback(str), j);
        synchronized (list) {
            if (!z) {
                try {
                    List<AFd1wSDK1> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((AFd1wSDK1) it.next()).onNavigationEvent().IAuthTabCallback(), str)) {
                                break;
                            }
                        }
                    }
                    if (z) {
                        CollectionsKt__MutableCollectionsKt.removeAll((List) list, new Function1() { // from class: im.toss.tosssecurities.tracker.performance.StamperImpl$$ExternalSyntheticLambda0
                            private static int onNavigationEvent = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i = 2 % 2;
                                int i2 = onWarmupCompleted + 125;
                                onNavigationEvent = i2 % 128;
                                int i3 = i2 % 2;
                                Boolean boolValueOf = Boolean.valueOf(AFd1wSDK10.onWarmupCompleted(str, (AFd1wSDK1) obj));
                                int i4 = onNavigationEvent + 37;
                                onWarmupCompleted = i4 % 128;
                                if (i4 % 2 == 0) {
                                    int i5 = 43 / 0;
                                }
                                return boolValueOf;
                            }
                        });
                    }
                    list.add(aFd1wSDK1);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z) {
                }
                list.add(aFd1wSDK1);
            }
            Unit unit = Unit.INSTANCE;
        }
        Objects.toString(onwarmupcompleted);
    }

    private static final boolean onExtraCallback(String str, AFd1wSDK1 aFd1wSDK1) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK1, "");
            return Intrinsics.areEqual(aFd1wSDK1.onNavigationEvent().IAuthTabCallback(), str);
        }
        Intrinsics.checkNotNullParameter(aFd1wSDK1, "");
        Intrinsics.areEqual(aFd1wSDK1.onNavigationEvent().IAuthTabCallback(), str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda3
    public void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted, long j) {
        onExtraCallback onextracallback;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        AFd1wSDK1.IAuthTabCallback.C0011IAuthTabCallback c0011IAuthTabCallback = AFd1wSDK1.IAuthTabCallback.C0011IAuthTabCallback.onWarmupCompleted;
        AFd1wSDK1 aFd1wSDK1 = new AFd1wSDK1(onwarmupcompleted, c0011IAuthTabCallback, j);
        List<AFd1wSDK1> list = this.onWarmupCompleted.get(onwarmupcompleted);
        if (list == null) {
            IAuthTabCallback(aFd1wSDK1);
            return;
        }
        synchronized (list) {
            if (AFd1wSDK2.onExtraCallback(list, c0011IAuthTabCallback)) {
                onextracallback = new onExtraCallback(true, false);
            } else {
                list.add(aFd1wSDK1);
                onextracallback = new onExtraCallback(false, AFd1wSDK2.onExtraCallback(list, AFd1wSDK1.IAuthTabCallback.onExtraCallbackWithResult.IAuthTabCallback));
            }
        }
        if (onextracallback.onWarmupCompleted() || !onextracallback.onExtraCallback()) {
            return;
        }
        onExtraCallbackWithResult(onwarmupcompleted);
        Objects.toString(onwarmupcompleted);
    }

    private final void IAuthTabCallback(AFd1wSDK1 aFd1wSDK1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            if (aFd1wSDK1.IAuthTabCallback() instanceof AFd1wSDK1.onWarmupCompleted.AbstractC0012onWarmupCompleted) {
                ConcurrentHashMap<AFd1wSDK1.onWarmupCompleted, List<AFd1wSDK1>> concurrentHashMap = this.onWarmupCompleted;
                AFd1wSDK1.onWarmupCompleted onwarmupcompletedIAuthTabCallback = aFd1wSDK1.IAuthTabCallback();
                List<AFd1wSDK1> listSynchronizedList = Collections.synchronizedList(new ArrayList());
                listSynchronizedList.add(aFd1wSDK1);
                concurrentHashMap.put(onwarmupcompletedIAuthTabCallback, listSynchronizedList);
            }
            int i3 = onExtraCallbackWithResult + 115;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = aFd1wSDK1.IAuthTabCallback() instanceof AFd1wSDK1.onWarmupCompleted.AbstractC0012onWarmupCompleted;
        throw null;
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda3
    public void IAuthTabCallback(@NotNull AFd1wSDK1.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onWarmupCompleted.remove(onwarmupcompleted);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onWarmupCompleted.remove(onwarmupcompleted);
        int i3 = onExtraCallbackWithResult + 95;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.AFd1wSDKExternalSyntheticLambda3
    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.clear();
        int i4 = asBinder + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    private final void onExtraCallbackWithResult(AFd1wSDK1.onWarmupCompleted onwarmupcompleted) {
        List<AFd1wSDK1> list;
        List<AFd1wSDK1> listRemove = this.onWarmupCompleted.remove(onwarmupcompleted);
        if (listRemove == null) {
            return;
        }
        synchronized (listRemove) {
            list = CollectionsKt___CollectionsKt.toList(listRemove);
        }
        this.IAuthTabCallback.onExtraCallback(list);
    }

    static final class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final boolean onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (this.onWarmupCompleted != onextracallback.onWarmupCompleted) {
                return false;
            }
            if (this.onNavigationEvent == onextracallback.onNavigationEvent) {
                return true;
            }
            int i5 = i2 + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Boolean.hashCode(this.onWarmupCompleted) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 33 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EndResult(alreadyEnded=" + this.onWarmupCompleted + ", hasStart=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 97;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return str;
        }

        public onExtraCallback(boolean z, boolean z2) {
            this.onWarmupCompleted = z;
            this.onNavigationEvent = z2;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 55;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 27;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return z;
        }
    }
}
