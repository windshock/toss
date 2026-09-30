package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class installModel {
    private static int asInterface = 1;
    private static int onExtraCallback;
    private onExtraCallbackWithResult IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final Object onNavigationEvent = new Object();
    private final access6900<Function0<Unit>> onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            try {
                iArr[onExtraCallbackWithResult.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallbackWithResult.CLOSED.ordinal()] = 2;
                int i = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallbackWithResult.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i4 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public installModel(int i, boolean z) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i2;
        this.onExtraCallbackWithResult = i;
        if (z) {
            onextracallbackwithresult = onExtraCallbackWithResult.CLOSED;
            i2 = onExtraCallback + 119;
            asInterface = i2 % 128;
        } else {
            onextracallbackwithresult = onExtraCallbackWithResult.PENDING;
            i2 = asInterface + 75;
            onExtraCallback = i2 % 128;
        }
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        this.IAuthTabCallback = onextracallbackwithresult;
        this.onWarmupCompleted = new access6900<>();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onExtraCallbackWithResult PENDING = new onExtraCallbackWithResult("PENDING", 0);
        public static final onExtraCallbackWithResult OPEN = new onExtraCallbackWithResult("OPEN", 1);
        public static final onExtraCallbackWithResult CLOSED = new onExtraCallbackWithResult("CLOSED", 2);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{PENDING, OPEN};
                onextracallbackwithresultArr[4] = CLOSED;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{PENDING, OPEN, CLOSED};
            }
            int i4 = i2 + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 105;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onNavigationEvent + 69;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 51;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private onExtraCallbackWithResult(String str, int i) {
        }
    }

    public final void onWarmupCompleted(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (this.onNavigationEvent) {
            int i = onWarmupCompleted.IAuthTabCallback[this.IAuthTabCallback.ordinal()];
            if (i == 1) {
                function0.invoke();
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.onWarmupCompleted.size() < this.onExtraCallbackWithResult) {
                    this.onWarmupCompleted.addLast(function0);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onExtraCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (this.onNavigationEvent) {
            if (this.IAuthTabCallback == onExtraCallbackWithResult.OPEN) {
                function0.invoke();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void IAuthTabCallback() {
        synchronized (this.onNavigationEvent) {
            this.IAuthTabCallback = onExtraCallbackWithResult.OPEN;
            while (!this.onWarmupCompleted.isEmpty()) {
                Function0 function0 = (Function0) this.onWarmupCompleted.removeFirst();
                try {
                    Result.Companion companion = kotlin.Result.Companion;
                    kotlin.Result.constructor-impl(function0.invoke());
                } catch (Throwable th) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onWarmupCompleted() {
        synchronized (this.onNavigationEvent) {
            this.IAuthTabCallback = onExtraCallbackWithResult.CLOSED;
            this.onWarmupCompleted.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
