package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFillAlpha {
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final setFillColor onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 91;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setFillAlpha)) {
            int i4 = asInterface + 79;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        setFillAlpha setfillalpha = (setFillAlpha) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, setfillalpha.onExtraCallbackWithResult)) {
            int i6 = asBinder + 63;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, setfillalpha.onNavigationEvent)) {
            return false;
        }
        if (this.IAuthTabCallbackDefault != setfillalpha.IAuthTabCallbackDefault) {
            int i8 = asInterface + 123;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.onExtraCallback != setfillalpha.onExtraCallback || this.onWarmupCompleted != setfillalpha.onWarmupCompleted) {
            return false;
        }
        if (this.IAuthTabCallback == setfillalpha.IAuthTabCallback) {
            return true;
        }
        int i10 = asInterface + 11;
        asBinder = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.onExtraCallback)) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback);
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AdMobPrivacyConsentState(consentStatus=" + this.onExtraCallbackWithResult + ", privacyOptionsRequirementStatus=" + this.onNavigationEvent + ", umpCanRequestAds=" + this.IAuthTabCallbackDefault + ", canRequestAds=" + this.onExtraCallback + ", adMobEnablementStatus=" + this.onWarmupCompleted + ", isConsentFormAvailable=" + this.IAuthTabCallback + ")";
        int i2 = asInterface + 109;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setFillAlpha(@NotNull String str, @NotNull String str2, boolean z, boolean z2, @NotNull setFillColor setfillcolor, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(setfillcolor, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
        this.IAuthTabCallbackDefault = z;
        this.onExtraCallback = z2;
        this.onWarmupCompleted = setfillcolor;
        this.IAuthTabCallback = z3;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.onExtraCallback;
        int i5 = i2 + 3;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final setFillColor onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        setFillColor setfillcolor = this.onWarmupCompleted;
        int i5 = i3 + 57;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return setfillcolor;
    }
}
