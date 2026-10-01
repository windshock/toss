package im.toss.features.home.core.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AccountDetailSchemeResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final String accountDetailScheme;

    static {
        int i = onExtraCallbackWithResult + 21;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountDetailSchemeResponse() {
        String str = null;
        this(str, 1, (DefaultConstructorMarker) str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountDetailSchemeResponse) {
            return Intrinsics.areEqual(this.accountDetailScheme, ((AccountDetailSchemeResponse) obj).accountDetailScheme);
        }
        int i5 = i3 + 115;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accountDetailScheme;
        if (str == null) {
            int i4 = i3 + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i6 = onWarmupCompleted + 25;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountDetailSchemeResponse(accountDetailScheme=" + this.accountDetailScheme + ")";
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ AccountDetailSchemeResponse(int i, String str, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.accountDetailScheme = str;
            int i2 = onWarmupCompleted + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.accountDetailScheme = null;
        int i4 = IAuthTabCallback + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public AccountDetailSchemeResponse(@Nullable String str) {
        this.accountDetailScheme = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(AccountDetailSchemeResponse accountDetailSchemeResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0 ? !vylVar.onWarmupCompleted(serialDescriptor, 0) : (!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
            int i3 = onWarmupCompleted + 119;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                String str = accountDetailSchemeResponse.accountDetailScheme;
                throw null;
            }
            if (accountDetailSchemeResponse.accountDetailScheme == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, accountDetailSchemeResponse.accountDetailScheme);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountDetailSchemeResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.accountDetailScheme;
        int i5 = i3 + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
