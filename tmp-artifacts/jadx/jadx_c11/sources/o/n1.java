package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n1 {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final String asBinder;
    private final n2 onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final n5 onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[n2.values().length];
            try {
                iArr[n2.ServiceBundleLoadFailed.ordinal()] = 1;
                int i = IAuthTabCallback + 89;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 5;
                } else {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n2.SharedBundleLoadFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n2.ReactHostStartFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = IAuthTabCallback + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = onTransact + 11;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ n1 onWarmupCompleted(n1 n1Var, String str, String str2, n5 n5Var, n2 n2Var, String str3, String str4, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str5 = n1Var.IAuthTabCallback;
            int i3 = IAuthTabCallbackStub + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } else {
            str5 = str;
        }
        String str8 = (i & 2) != 0 ? n1Var.onExtraCallbackWithResult : str2;
        n5 n5Var2 = (i & 4) != 0 ? n1Var.onWarmupCompleted : n5Var;
        n2 n2Var2 = (i & 8) != 0 ? n1Var.onExtraCallback : n2Var;
        if ((i & 16) != 0) {
            int i5 = asInterface + 83;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = n1Var.onNavigationEvent;
                throw null;
            }
            str6 = n1Var.onNavigationEvent;
        } else {
            str6 = str3;
        }
        if ((i & 32) != 0) {
            int i6 = asInterface + 57;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            str7 = n1Var.asBinder;
            if (i7 == 0) {
                int i8 = 29 / 0;
            }
        } else {
            str7 = str4;
        }
        return n1Var.onExtraCallbackWithResult(str5, str8, n5Var2, n2Var2, str6, str7);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, n1Var.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, n1Var.onExtraCallbackWithResult)) {
            int i4 = IAuthTabCallbackStub;
            int i5 = i4 + 123;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 119;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, n1Var.onWarmupCompleted)) {
            return false;
        }
        if (this.onExtraCallback != n1Var.onExtraCallback) {
            int i9 = IAuthTabCallbackStub + 123;
            asInterface = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, n1Var.onNavigationEvent)) {
            int i10 = IAuthTabCallbackStub + 95;
            asInterface = i10 % 128;
            return i10 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.asBinder, n1Var.asBinder)) {
            return true;
        }
        int i11 = IAuthTabCallbackStub + 61;
        asInterface = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        String str = this.onNavigationEvent;
        int iHashCode5 = 0;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.asBinder;
        if (str2 != null) {
            iHashCode5 = str2.hashCode();
            int i4 = asInterface + 99;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public final n1 onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n2 n2Var, @Nullable String str3, @Nullable String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(n2Var, "");
        n1 n1Var = new n1(str, str2, n5Var, n2Var, str3, str4);
        int i2 = asInterface + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return n1Var;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnWarmupFailureState(sharedBundleName=" + this.IAuthTabCallback + ", serviceBundleName=" + this.onExtraCallbackWithResult + ", state=" + this.onWarmupCompleted + ", reason=" + this.onExtraCallback + ", throwableClassName=" + this.onNavigationEvent + ", throwableMessage=" + this.asBinder + ")";
        int i2 = IAuthTabCallbackStub + 83;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public n1(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n2 n2Var, @Nullable String str3, @Nullable String str4) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(n2Var, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = n5Var;
        this.onExtraCallback = n2Var;
        this.onNavigationEvent = str3;
        this.asBinder = str4;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("sharedBundleName must not be blank");
        }
        if (!(!StringsKt.isBlank(str2))) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        int i = onNavigationEvent.onExtraCallbackWithResult[n2Var.ordinal()];
        if (i == 1 || i == 2) {
            if (n5Var.IAuthTabCallback() != n0a.Failed) {
                throw new IllegalArgumentException("bundle load failure state requires failed shared bundle state");
            }
            int i2 = IAuthTabCallbackStub + 89;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = i3 + 25;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        if (n5Var.IAuthTabCallback() != n0a.Loaded) {
            throw new IllegalArgumentException("ReactHost failure state requires loaded shared bundle state");
        }
        int i8 = asInterface + 107;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        if (n5Var.onNavigationEvent()) {
            throw new IllegalArgumentException("ReactHost failure state requires stopped ReactHost");
        }
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 47;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i3 + 95;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final n5 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        n5 n5Var = this.onWarmupCompleted;
        int i5 = i2 + 81;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return n5Var;
    }

    public final n2 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 95;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        n2 n2Var = this.onExtraCallback;
        int i4 = i2 + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return n2Var;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 47;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 45;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        String str = this.asBinder;
        int i5 = i3 + 117;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final n1 IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n2 n2Var, @Nullable Throwable th) {
            String name;
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(n5Var, "");
            Intrinsics.checkNotNullParameter(n2Var, "");
            if (th != null) {
                int i4 = onNavigationEvent + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                name = th.getClass().getName();
            } else {
                int i6 = onExtraCallback + 59;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                name = null;
            }
            return new n1(str, str2, n5Var, n2Var, name, th != null ? th.getMessage() : null);
        }
    }
}
