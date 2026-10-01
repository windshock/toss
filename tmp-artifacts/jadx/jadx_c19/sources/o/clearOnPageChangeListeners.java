package o;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class clearOnPageChangeListeners {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int onTransact;
    private final Function0<Long> onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final Map<String, Long> onWarmupCompleted;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static final long onNavigationEvent = TimeUnit.HOURS.toMillis(2);

    public clearOnPageChangeListeners() {
        this(0L, null, 3, null);
    }

    public clearOnPageChangeListeners(long j, @NotNull Function0<Long> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult = j;
        this.onExtraCallback = function0;
        this.onWarmupCompleted = new LinkedHashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ clearOnPageChangeListeners(long j, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = onTransact + 67;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                j = onNavigationEvent;
                int i4 = 14 / 0;
            } else {
                j = onNavigationEvent;
            }
            int i5 = 2 % 2;
        }
        if ((i2 & 2) != 0) {
            int i6 = onTransact + 3;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                AnonymousClass5 anonymousClass5 = AnonymousClass5.onNavigationEvent;
                throw null;
            }
            function0 = AnonymousClass5.onNavigationEvent;
            int i7 = 2 % 2;
        }
        this(j, function0);
    }

    /* renamed from: o.clearOnPageChangeListeners$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Long> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        public static final AnonymousClass5 onNavigationEvent = new AnonymousClass5();
        private static int onWarmupCompleted = 1;

        static {
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        AnonymousClass5() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        public /* synthetic */ Object invoke() {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Long lOnNavigationEvent = onNavigationEvent();
            int i5 = onWarmupCompleted + 93;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return lOnNavigationEvent;
        }

        public final Long onNavigationEvent() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 123;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return Long.valueOf(System.currentTimeMillis());
            }
            int i4 = 81 / 0;
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull NativeAdsEventLogType nativeAdsEventLogType, @NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (onNavigationEvent(nativeAdsEventLogType)) {
                return true;
            }
            long jLongValue = ((Number) this.onExtraCallback.invoke()).longValue();
            onExtraCallbackWithResult(jLongValue);
            Long l = this.onWarmupCompleted.get(str);
            if (l != null) {
                if (jLongValue - l.longValue() < this.onExtraCallbackWithResult) {
                    return false;
                }
            }
            this.onWarmupCompleted.put(str, Long.valueOf(jLongValue));
            return true;
        }
    }

    public final void onExtraCallbackWithResult() {
        synchronized (this) {
            this.onWarmupCompleted.clear();
        }
    }

    private final void onExtraCallbackWithResult(long j) {
        int i2 = 2 % 2;
        int i3 = asBinder + 37;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Iterator<Map.Entry<String, Long>> it = this.onWarmupCompleted.entrySet().iterator();
            while (it.hasNext()) {
                int i4 = onTransact + 81;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                if (j - it.next().getValue().longValue() >= this.onExtraCallbackWithResult) {
                    it.remove();
                }
            }
            return;
        }
        this.onWarmupCompleted.entrySet().iterator();
        throw null;
    }

    private final boolean onNavigationEvent(NativeAdsEventLogType nativeAdsEventLogType) {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        boolean zContains = NativeAdsEventLogType.Companion.onExtraCallback().contains(nativeAdsEventLogType);
        int i5 = asBinder + 27;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return zContains;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static {
        int i2 = IAuthTabCallbackStub + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }
}
