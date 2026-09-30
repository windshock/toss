package viva.republica.toss.network.model.account;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import net.sf.scuba.smartcards.BuildConfig;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String ctaLogoUrl;
    private final String ctaText;
    private final String ctaUri;
    private final String message;

    static {
        int i = onExtraCallback + 3;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse)) {
            return false;
        }
        AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse autoPayBillingKeysBeforeUserLeaveDisclaimerResponse = (AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse) obj;
        if (!(!Intrinsics.areEqual(this.message, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.message))) {
            return !(Intrinsics.areEqual(this.ctaText, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaText) ^ true) && Intrinsics.areEqual(this.ctaLogoUrl, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaLogoUrl) && Intrinsics.areEqual(this.ctaUri, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaUri);
        }
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.message.hashCode() * 31) + this.ctaText.hashCode()) * 31) + this.ctaLogoUrl.hashCode()) * 31) + this.ctaUri.hashCode();
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse(message=" + this.message + ", ctaText=" + this.ctaText + ", ctaLogoUrl=" + this.ctaLogoUrl + ", ctaUri=" + this.ctaUri + ")";
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse$$serializer autoPayBillingKeysBeforeUserLeaveDisclaimerResponse$$serializer = AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return autoPayBillingKeysBeforeUserLeaveDisclaimerResponse$$serializer;
        }
    }

    public /* synthetic */ AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse(int i, String str, String str2, String str3, String str4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.message = BuildConfig.FLAVOR;
        } else {
            this.message = str;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 2) == 0) {
            this.ctaText = BuildConfig.FLAVOR;
        } else {
            this.ctaText = str2;
        }
        if ((i & 4) == 0) {
            int i4 = onNavigationEvent + 103;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            int i6 = i4 % 2;
            this.ctaLogoUrl = BuildConfig.FLAVOR;
            int i7 = i5 + 97;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        } else {
            this.ctaLogoUrl = str3;
        }
        int i9 = 2 % 2;
        if ((i & 8) != 0) {
            this.ctaUri = str4;
            return;
        }
        int i10 = onNavigationEvent + 121;
        IAuthTabCallback = i10 % 128;
        int i11 = i10 % 2;
        this.ctaUri = BuildConfig.FLAVOR;
        if (i11 == 0) {
            throw null;
        }
    }

    public AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str4, BuildConfig.FLAVOR);
        this.message = str;
        this.ctaText = str2;
        this.ctaLogoUrl = str3;
        this.ctaUri = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse autoPayBillingKeysBeforeUserLeaveDisclaimerResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || !Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.message, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 0, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.message);
        }
        Object obj = null;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i2 = onNavigationEvent + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaText, BuildConfig.FLAVOR);
                throw null;
            }
            if (!Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaText, BuildConfig.FLAVOR)) {
                vylVar.onExtraCallback(serialDescriptor, 1, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaText);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i3 = onNavigationEvent + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaLogoUrl, BuildConfig.FLAVOR);
                obj.hashCode();
                throw null;
            }
            if (!Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaLogoUrl, BuildConfig.FLAVOR)) {
                vylVar.onExtraCallback(serialDescriptor, 2, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaLogoUrl);
                int i4 = IAuthTabCallback + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaUri, BuildConfig.FLAVOR)) {
            vylVar.onExtraCallback(serialDescriptor, 3, autoPayBillingKeysBeforeUserLeaveDisclaimerResponse.ctaUri);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoPayBillingKeysBeforeUserLeaveDisclaimerResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 77;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 67;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 53;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            int i9 = onNavigationEvent + 95;
            int i10 = i9 % 128;
            IAuthTabCallback = i10;
            if (i9 % 2 == 0) {
                int i11 = 36 / 0;
            }
            int i12 = i10 + 67;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 2;
            } else {
                int i14 = 2 % 2;
            }
            str3 = BuildConfig.FLAVOR;
        }
        this(str, str2, str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }
}
