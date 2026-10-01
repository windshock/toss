package im.toss.tracker.api;

import dagger.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1mSDK2;
import o.AFj1nSDK1;
import o.AFj1nSDK3;
import o.ComputeDistances;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CoreLogStoreModule {
    public static final CoreLogStoreModule IAuthTabCallback = new CoreLogStoreModule();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 123;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private CoreLogStoreModule() {
    }

    public final ComputeDistances onNavigationEvent(@NotNull Lazy<AFj1mSDK2> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        ComputeDistances computeDistances = new ComputeDistances("logitems", (String) null, new onNavigationEvent(lazy), (Integer) null, 10, (DefaultConstructorMarker) null);
        int i2 = onNavigationEvent + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return computeDistances;
        }
        throw null;
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function0<AFj1mSDK2> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ AFj1mSDK2 invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AFj1mSDK2 aFj1mSDK2OnNavigationEvent = onNavigationEvent();
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
            return aFj1mSDK2OnNavigationEvent;
        }

        public final AFj1mSDK2 onNavigationEvent() {
            AFj1mSDK2 aFj1mSDK2;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                aFj1mSDK2 = (AFj1mSDK2) ((Lazy) this.receiver).get();
                int i3 = 62 / 0;
            } else {
                aFj1mSDK2 = (AFj1mSDK2) ((Lazy) this.receiver).get();
            }
            int i4 = onNavigationEvent + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return aFj1mSDK2;
        }
    }

    public final ComputeDistances onWarmupCompleted(@NotNull Lazy<AFj1nSDK3> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        ComputeDistances computeDistances = new ComputeDistances("domainLog", (String) null, new onWarmupCompleted(lazy), (Integer) null, 10, (DefaultConstructorMarker) null);
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return computeDistances;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function0<AFj1nSDK3> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        onWarmupCompleted(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ AFj1nSDK3 invoke() {
            AFj1nSDK3 aFj1nSDK3OnExtraCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                aFj1nSDK3OnExtraCallback = onExtraCallback();
                int i3 = 38 / 0;
            } else {
                aFj1nSDK3OnExtraCallback = onExtraCallback();
            }
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return aFj1nSDK3OnExtraCallback;
        }

        public final AFj1nSDK3 onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AFj1nSDK3 aFj1nSDK3 = (AFj1nSDK3) ((Lazy) this.receiver).get();
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return aFj1nSDK3;
        }
    }

    public final ComputeDistances onExtraCallback(@NotNull Lazy<AFj1nSDK1> lazy) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(lazy, "");
        ComputeDistances computeDistances = new ComputeDistances("domainLogV2", (String) null, new IAuthTabCallback(lazy), (Integer) null, 10, (DefaultConstructorMarker) null);
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
        return computeDistances;
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements Function0<AFj1nSDK1> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        IAuthTabCallback(Object obj) {
            super(0, obj, Lazy.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ AFj1nSDK1 invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AFj1nSDK1 aFj1nSDK1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return aFj1nSDK1OnExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AFj1nSDK1 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            AFj1nSDK1 aFj1nSDK1 = (AFj1nSDK1) ((Lazy) this.receiver).get();
            if (i3 == 0) {
                return aFj1nSDK1;
            }
            throw null;
        }
    }
}
