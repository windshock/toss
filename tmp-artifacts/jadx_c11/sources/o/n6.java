package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n6 {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface;
    private static int onTransact;
    private final String IAuthTabCallback;
    private final setClickableViews IAuthTabCallbackStub;
    private final long asBinder;
    private final hbExternalSyntheticLambda0 onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onWarmupCompleted;

    static {
        int i = onTransact + 23;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            int i2 = asInterface + 95;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        n6 n6Var = (n6) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, n6Var.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, n6Var.onExtraCallbackWithResult)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, n6Var.onNavigationEvent)) {
            int i7 = asInterface + 65;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.asBinder == n6Var.asBinder) {
            if (this.onExtraCallback == n6Var.onExtraCallback) {
                return Intrinsics.areEqual(this.IAuthTabCallbackStub, n6Var.IAuthTabCallbackStub) && this.onWarmupCompleted == n6Var.onWarmupCompleted;
            }
            int i9 = IAuthTabCallback_Parcel + 7;
            asInterface = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = IAuthTabCallback_Parcel + 37;
        asInterface = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.IAuthTabCallback.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + Long.hashCode(this.asBinder)) * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted);
        int i4 = asInterface + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnWarmupRequest(sharedBundleName=" + this.IAuthTabCallback + ", serviceBundleName=" + this.onExtraCallbackWithResult + ", fallbackRoute=" + this.onNavigationEvent + ", waitTimeoutMs=" + this.asBinder + ", loadingView=" + this.onExtraCallback + ", warmupEvent=" + this.IAuthTabCallbackStub + ", startReactHost=" + this.onWarmupCompleted + ")";
        int i2 = IAuthTabCallback_Parcel + 29;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public n6(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull hbExternalSyntheticLambda0 hbexternalsyntheticlambda0, @NotNull setClickableViews setclickableviews, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(hbexternalsyntheticlambda0, "");
        Intrinsics.checkNotNullParameter(setclickableviews, "");
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onNavigationEvent = str3;
        this.asBinder = j;
        this.onExtraCallback = hbexternalsyntheticlambda0;
        this.IAuthTabCallbackStub = setclickableviews;
        this.onWarmupCompleted = z;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("sharedBundleName must not be blank");
        }
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("serviceBundleName must not be blank");
        }
        int i = IAuthTabCallback_Parcel + 19;
        asInterface = i % 128;
        int i2 = i % 2;
        if (!(!StringsKt.isBlank(str3))) {
            throw new IllegalArgumentException("fallbackRoute must not be blank");
        }
        if (0 <= j) {
            int i3 = IAuthTabCallback_Parcel + 1;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (j < 301) {
                return;
            }
        }
        throw new IllegalArgumentException("waitTimeoutMs must be in 0..300");
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 31;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 49;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        long j = this.asBinder;
        int i5 = i2 + 37;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final setClickableViews onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        setClickableViews setclickableviews = this.IAuthTabCallbackStub;
        int i5 = i3 + 31;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return setclickableviews;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = this.onWarmupCompleted;
        int i5 = i3 + 111;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final n6 onExtraCallback(@NotNull n3 n3Var) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(n3Var, "");
            n6 n6Var = new n6(n3Var.access000(), n3Var.getInterfaceDescriptor(), (String) n3.IAuthTabCallback(new Object[]{n3Var}, 1769799668, -1769799666, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult()), ((Long) n3.IAuthTabCallback(new Object[]{n3Var}, 464868553, -464868553, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult())).longValue(), (hbExternalSyntheticLambda0) n3.IAuthTabCallback(new Object[]{n3Var}, -443132950, 443132951, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult()), n3Var.IAuthTabCallbackStubProxy(), n3Var.onExtraCallbackWithResult());
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return n6Var;
        }
    }
}
