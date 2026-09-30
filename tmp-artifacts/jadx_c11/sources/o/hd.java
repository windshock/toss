package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hd {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final getClickableViews onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 103;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 49;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, hdVar.IAuthTabCallback)) {
            int i6 = asBinder + 49;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, hdVar.onExtraCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, hdVar.onWarmupCompleted)) {
            return false;
        }
        int i8 = asBinder + 3;
        IAuthTabCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode();
        int i4 = asBinder + 93;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnServiceBundleImportLazyFragmentArguments(originScheme=" + this.IAuthTabCallback + ", sharedBundleName=" + this.onExtraCallback + ", serviceBundleImportLazyRequest=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallbackStub + 35;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    public hd(@NotNull String str, @NotNull String str2, @NotNull getClickableViews getclickableviews) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(getclickableviews, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = getclickableviews;
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("sharedBundleName must not be blank");
        }
        int i = asBinder + 37;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onExtraCallback;
            int i4 = 62 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 35;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
        int i4 = asBinder + 95;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
