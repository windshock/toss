package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestLatestUpdateDate {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int onExtraCallback;
    private final List<Pair<String, Map<String, Object>>> onExtraCallbackWithResult;
    private final Object onNavigationEvent;
    private onNavigationEvent onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        private static int onExtraCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onNavigationEvent.values().length];
            try {
                iArr[onNavigationEvent.OPEN.ordinal()] = 1;
                int i = onWarmupCompleted + 99;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onNavigationEvent.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onNavigationEvent.PENDING.ordinal()] = 3;
                int i4 = onExtraCallback + 59;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        int i = IAuthTabCallback + 21;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public requestLatestUpdateDate() {
        this(false, 1, null);
    }

    public requestLatestUpdateDate(boolean z) {
        onNavigationEvent onnavigationevent;
        this.onNavigationEvent = new Object();
        this.onExtraCallbackWithResult = new ArrayList();
        if (z) {
            onnavigationevent = onNavigationEvent.CLOSED;
            int i = asBinder + 23;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            onnavigationevent = onNavigationEvent.PENDING;
        }
        this.onWarmupCompleted = onnavigationevent;
        int i3 = IAuthTabCallbackStub + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ requestLatestUpdateDate(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = asBinder + 37;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this(z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;
        public static final IAuthTabCallback SENT = new IAuthTabCallback("SENT", 0);
        public static final IAuthTabCallback QUEUED = new IAuthTabCallback("QUEUED", 1);
        public static final IAuthTabCallback DROPPED = new IAuthTabCallback("DROPPED", 2);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = SENT;
            if (i3 == 0) {
                return new IAuthTabCallback[]{iAuthTabCallback, QUEUED, DROPPED};
            }
            IAuthTabCallback iAuthTabCallback2 = QUEUED;
            IAuthTabCallback iAuthTabCallback3 = DROPPED;
            IAuthTabCallback[] iAuthTabCallbackArr = new IAuthTabCallback[4];
            iAuthTabCallbackArr[1] = iAuthTabCallback;
            iAuthTabCallbackArr[1] = iAuthTabCallback2;
            iAuthTabCallbackArr[4] = iAuthTabCallback3;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            if (i3 != 0) {
                return iAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onNavigationEvent + 75;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 94 / 0;
            }
        }

        private IAuthTabCallback(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onNavigationEvent PENDING = new onNavigationEvent("PENDING", 0);
        public static final onNavigationEvent OPEN = new onNavigationEvent("OPEN", 1);
        public static final onNavigationEvent CLOSED = new onNavigationEvent("CLOSED", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 91;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {PENDING, OPEN, CLOSED};
            int i5 = i3 + 1;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = $VALUES;
            if (i3 != 0) {
                return (onNavigationEvent[]) onnavigationeventArr.clone();
            }
            int i4 = 47 / 0;
            return (onNavigationEvent[]) onnavigationeventArr.clone();
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onExtraCallback + 93;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private onNavigationEvent(String str, int i) {
        }
    }

    public final IAuthTabCallback onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        IAuthTabCallback iAuthTabCallback;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function2, "");
        synchronized (this.onNavigationEvent) {
            int i = onWarmupCompleted.onExtraCallbackWithResult[this.onWarmupCompleted.ordinal()];
            if (i == 1) {
                function2.invoke(str, map);
                iAuthTabCallback = IAuthTabCallback.SENT;
            } else if (i == 2) {
                iAuthTabCallback = IAuthTabCallback.DROPPED;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.onExtraCallbackWithResult.size() < 200) {
                    this.onExtraCallbackWithResult.add(getWrite.IAuthTabCallback(str, map));
                }
                iAuthTabCallback = IAuthTabCallback.QUEUED;
            }
        }
        return iAuthTabCallback;
    }

    public final void onExtraCallback(@NotNull Function0<Unit> function0, @NotNull Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        synchronized (this.onNavigationEvent) {
            this.onWarmupCompleted = onNavigationEvent.OPEN;
            function0.invoke();
            Iterator<T> it = this.onExtraCallbackWithResult.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                function2.invoke((String) pair.onExtraCallbackWithResult(), (Map) pair.IAuthTabCallback());
            }
            this.onExtraCallbackWithResult.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull Function0<Unit> function0) {
        boolean z;
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (this.onNavigationEvent) {
            if (this.onWarmupCompleted == onNavigationEvent.OPEN) {
                function0.invoke();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void onExtraCallback() {
        synchronized (this.onNavigationEvent) {
            this.onWarmupCompleted = onNavigationEvent.CLOSED;
            this.onExtraCallbackWithResult.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
