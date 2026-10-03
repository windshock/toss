package o;

import im.toss.define.MobileCarrier;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.useFabricInterop;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAccessMethod implements ReactNativeNewArchitectureFeatureFlags {
    private final boolean autoSubmit;
    private final String birthday6;
    private final MobileCarrier carrier;
    private final boolean consentGranted;
    private final String inputPageTitle;
    private final boolean localDataPrefill;
    private final String name;
    private final String phone;
    private final boolean prefillLocalUsernameAndRRN;
    private final String rrn7th;

    public getAccessMethod() {
        this(null, null, null, null, null, null, false, false, false, false, 1023, null);
    }

    public getAccessMethod(@NotNull String str, @NotNull String str2, @NotNull MobileCarrier mobileCarrier, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mobileCarrier, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.phone = str2;
        this.carrier = mobileCarrier;
        this.birthday6 = str3;
        this.rrn7th = str4;
        this.inputPageTitle = str5;
        this.localDataPrefill = z;
        this.prefillLocalUsernameAndRRN = z2;
        this.autoSubmit = z3;
        this.consentGranted = z4;
    }

    public /* synthetic */ getAccessMethod(String str, String str2, MobileCarrier mobileCarrier, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? MobileCarrier.NONE : mobileCarrier, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : true, (i & 512) == 0 ? z4 : false);
    }

    public final boolean onExtraCallback() {
        return this.localDataPrefill;
    }

    public final boolean onWarmupCompleted() {
        return this.prefillLocalUsernameAndRRN;
    }

    public final boolean onNavigationEvent() {
        return this.autoSubmit;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.consentGranted;
    }

    public static final class onExtraCallbackWithResult implements ReactNativeNewArchitectureFeatureFlagsDefaults {
        onExtraCallbackWithResult() {
        }

        public useFabricInterop IAuthTabCallback() {
            return new useFabricInterop(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_NAME, getAccessMethod.this.name), getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_PHONE, getAccessMethod.this.phone), getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_CARRIER, getAccessMethod.this.carrier), getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_BIRTHDAY_6, getAccessMethod.this.birthday6), getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_RRN_SEVENTH, getAccessMethod.this.rrn7th), getWrite.IAuthTabCallback(useFabricInterop.onWarmupCompleted.KEY_INPUT_PAGE_TITLE, getAccessMethod.this.inputPageTitle)}));
        }
    }

    public ReactNativeNewArchitectureFeatureFlagsDefaults IAuthTabCallback() {
        return new onExtraCallbackWithResult();
    }
}
