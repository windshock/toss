package o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ExtHubPageContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExtHubPageContext$IAuthTabCallback$IAuthTabCallback extends ExtHubPageContext.IAuthTabCallback {
    public static final Parcelable.Creator<ExtHubPageContext$IAuthTabCallback$IAuthTabCallback> CREATOR = new onNavigationEvent();
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 125;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 25;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ExtHubPageContext$IAuthTabCallback$IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, ((ExtHubPageContext$IAuthTabCallback$IAuthTabCallback) obj).onWarmupCompleted)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, r6.IAuthTabCallback))) {
            return true;
        }
        int i4 = onNavigationEvent + 99;
        asInterface = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode();
        int i4 = asInterface + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Remote(unselectedUrl=" + this.onWarmupCompleted + ", selectedUrl=" + this.IAuthTabCallback + ")";
        int i2 = asInterface + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return str;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.IAuthTabCallback);
        int i5 = asInterface + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtHubPageContext$IAuthTabCallback$IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
        UserChoiceBillingListener userChoiceBillingListener = UserChoiceBillingListener.onExtraCallback;
        LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(userChoiceBillingListener.onExtraCallback()), str, (Context) null, 2, (Object) null);
        if (!Intrinsics.areEqual(str2, str)) {
            LinkGenerator.onExtraCallback(CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(userChoiceBillingListener.onExtraCallback()), str2, (Context) null, 2, (Object) null);
            int i = asInterface + 115;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = asInterface + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 19;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i2 + 21;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 111;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 73;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
