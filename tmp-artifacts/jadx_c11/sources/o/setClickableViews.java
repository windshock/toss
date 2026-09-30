package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.n0c;
import o.n1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setClickableViews {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final setClickableViews onExtraCallback = new setClickableViews("", "", false);

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setClickableViews)) {
            return false;
        }
        setClickableViews setclickableviews = (setClickableViews) obj;
        if (Intrinsics.areEqual(this.IAuthTabCallback, setclickableviews.IAuthTabCallback)) {
            return Intrinsics.areEqual(this.onNavigationEvent, setclickableviews.onNavigationEvent) && this.onExtraCallbackWithResult == setclickableviews.onExtraCallbackWithResult;
        }
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 101;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 53;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asBinder = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.IAuthTabCallback.hashCode() * 122) % this.onNavigationEvent.hashCode()) >> 83) - Boolean.hashCode(this.onExtraCallbackWithResult) : (((this.IAuthTabCallback.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallbackWithResult);
        int i3 = asBinder + 19;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnWarmupEvent(completedEventName=" + this.IAuthTabCallback + ", failedEventName=" + this.onNavigationEvent + ", callbackRequired=" + this.onExtraCallbackWithResult + ")";
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setClickableViews(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onNavigationEvent = str2;
        this.onExtraCallbackWithResult = z;
        if (z && StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("completedEventName must not be blank when callbackRequired is true");
        }
        if (z) {
            int i = asBinder + 123;
            IAuthTabCallbackStub = i % 128;
            int i2 = i % 2;
            if (StringsKt.isBlank(str2)) {
                throw new IllegalArgumentException("failedEventName must not be blank when callbackRequired is true");
            }
        }
        int i3 = asBinder + 15;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ setClickableViews IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        setClickableViews setclickableviews = onExtraCallback;
        int i5 = i3 + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return setclickableviews;
    }

    public final n1a.onExtraCallbackWithResult IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n0c.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (!this.onExtraCallbackWithResult) {
            int i2 = asBinder + 83;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        n1a.onExtraCallbackWithResult onextracallbackwithresult2 = new n1a.onExtraCallbackWithResult(this.IAuthTabCallback, str, str2, n5Var, onextracallbackwithresult.IAuthTabCallbackDefault(), onextracallbackwithresult.IAuthTabCallback());
        int i3 = asBinder + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return onextracallbackwithresult2;
    }

    public final n1a.onNavigationEvent IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull n5 n5Var, @NotNull n2 n2Var, @Nullable Throwable th) {
        String name;
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(n5Var, "");
            Intrinsics.checkNotNullParameter(n2Var, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(n5Var, "");
        Intrinsics.checkNotNullParameter(n2Var, "");
        if (!this.onExtraCallbackWithResult) {
            return null;
        }
        String str3 = this.onNavigationEvent;
        if (th != null) {
            int i3 = IAuthTabCallbackStub + 7;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                th.getClass().getName();
                obj.hashCode();
                throw null;
            }
            name = th.getClass().getName();
        } else {
            name = null;
        }
        n1a.onNavigationEvent onnavigationevent = new n1a.onNavigationEvent(str3, str, str2, n5Var, n2Var, name, th != null ? th.getMessage() : null);
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return onnavigationevent;
    }

    public static final class onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final setClickableViews onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setClickableViews setclickableviewsIAuthTabCallback = setClickableViews.IAuthTabCallback();
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return setclickableviewsIAuthTabCallback;
            }
            throw null;
        }
    }

    static {
        int i = asInterface + 35;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
