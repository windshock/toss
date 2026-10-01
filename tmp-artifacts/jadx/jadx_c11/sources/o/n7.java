package o;

import im.toss.features.benefit.ui.BenefitItemAdapter$;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class n7 {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int getInterfaceDescriptor = 1;
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final Long IAuthTabCallbackStub;
    private final Date asBinder;
    private final String asInterface;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final boolean onTransact;
    private final String onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i3 | i6);
        int i8 = i | i3 | i6;
        int i9 = (~((~i3) | (~i6))) | i7;
        int i10 = i3 + i6 + i2 + (1512347918 * i5) + (2033855975 * i4);
        int i11 = i10 * i10;
        int i12 = ((i3 * 1295388527) - 26148864) + (1295388527 * i6) + (2139102940 * i7) + (i8 * 1077932178) + (1077932178 * i9) + ((-1921646592) * i2) + (1114898432 * i5) + (1668939776 * i4) + (346619904 * i11);
        int i13 = ((i3 * 1848112433) - 751391395) + (i6 * 1848112433) + (i7 * (-92)) + (i8 * 46) + (i9 * 46) + (i2 * 1848112479) + (i5 * (-818859470)) + (i4 * (-357164103)) + (i11 * 1740046336);
        return i12 + ((i13 * i13) * 1721171968) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ n7 IAuthTabCallback(n7 n7Var, String str, String str2, String str3, String str4, String str5, Long l, Date date, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str6;
        boolean z4;
        boolean z5;
        int i2 = 2 % 2;
        String str7 = (i & 1) != 0 ? n7Var.onExtraCallback : str;
        String str8 = (i & 2) != 0 ? n7Var.onWarmupCompleted : str2;
        String str9 = (i & 4) != 0 ? n7Var.asInterface : str3;
        if ((i & 8) != 0) {
            int i3 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            str6 = n7Var.onNavigationEvent;
        } else {
            str6 = str4;
        }
        String str10 = (i & 16) != 0 ? n7Var.onExtraCallbackWithResult : str5;
        Long l2 = (i & 32) != 0 ? n7Var.IAuthTabCallbackStub : l;
        Date date2 = (i & 64) != 0 ? n7Var.asBinder : date;
        if ((i & 128) != 0) {
            z4 = n7Var.IAuthTabCallbackDefault;
            int i5 = getInterfaceDescriptor + 7;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 3;
            }
        } else {
            z4 = z;
        }
        boolean z6 = (i & 256) != 0 ? n7Var.IAuthTabCallback : z2;
        if ((i & 512) != 0) {
            int i7 = IAuthTabCallbackStubProxy + 47;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            z5 = n7Var.onTransact;
        } else {
            z5 = z3;
        }
        return n7Var.onWarmupCompleted(str7, str8, str9, str6, str10, l2, date2, z4, z6, z5);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            int i4 = i3 + 93;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        n7 n7Var = (n7) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, n7Var.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, n7Var.onWarmupCompleted)) {
            int i6 = IAuthTabCallbackStubProxy + 95;
            getInterfaceDescriptor = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.asInterface, n7Var.asInterface)) {
            int i7 = getInterfaceDescriptor + 25;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, n7Var.onNavigationEvent)) {
            int i9 = getInterfaceDescriptor + 19;
            IAuthTabCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, n7Var.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, n7Var.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, n7Var.asBinder)) {
            int i11 = getInterfaceDescriptor + 11;
            IAuthTabCallbackStubProxy = i11 % 128;
            return i11 % 2 != 0;
        }
        if (this.IAuthTabCallbackDefault != n7Var.IAuthTabCallbackDefault) {
            return false;
        }
        if (this.IAuthTabCallback == n7Var.IAuthTabCallback) {
            return this.onTransact == n7Var.onTransact;
        }
        int i12 = getInterfaceDescriptor + 49;
        IAuthTabCallbackStubProxy = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onExtraCallback.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.onNavigationEvent.hashCode();
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        Long l = this.IAuthTabCallbackStub;
        if (l == null) {
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 87;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
        }
        Date date = this.asBinder;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + (date != null ? date.hashCode() : 0)) * 31) + Boolean.hashCode(this.IAuthTabCallbackDefault)) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onTransact);
    }

    public final n7 onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable Long l, @Nullable Date date, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        n7 n7Var = new n7(str, str2, str3, str4, str5, l, date, z, z2, z3);
        int i2 = getInterfaceDescriptor + 71;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return n7Var;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShoppingTabRnBundleLoadRequest(bundleName=" + this.onExtraCallback + ", bundleUrl=" + this.onWarmupCompleted + ", region=" + this.asInterface + ", company=" + this.onNavigationEvent + ", distributionGroup=" + this.onExtraCallbackWithResult + ", maxAge=" + this.IAuthTabCallbackStub + ", minDeployedAt=" + this.asBinder + ", isForceLoadRemote=" + this.IAuthTabCallbackDefault + ", isForceLoadAssets=" + this.IAuthTabCallback + ", isRetry=" + this.onTransact + ")";
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public n7(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable Long l, @Nullable Date date, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onExtraCallback = str;
        this.onWarmupCompleted = str2;
        this.asInterface = str3;
        this.onNavigationEvent = str4;
        this.onExtraCallbackWithResult = str5;
        this.IAuthTabCallbackStub = l;
        this.asBinder = date;
        this.IAuthTabCallbackDefault = z;
        this.IAuthTabCallback = z2;
        this.onTransact = z3;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("bundleName must not be blank");
        }
        if (StringsKt.isBlank(str2)) {
            throw new IllegalArgumentException("bundleUrl must not be blank");
        }
        int i = getInterfaceDescriptor + 111;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
        if (StringsKt.isBlank(str3)) {
            throw new IllegalArgumentException("region must not be blank");
        }
        if (!(!StringsKt.isBlank(str4))) {
            throw new IllegalArgumentException("company must not be blank");
        }
        int i3 = getInterfaceDescriptor + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            StringsKt.isBlank(str5);
            throw null;
        }
        if (StringsKt.isBlank(str5)) {
            throw new IllegalArgumentException("distributionGroup must not be blank");
        }
        int i4 = IAuthTabCallbackStubProxy + 93;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 123;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.onExtraCallback;
            int i4 = 65 / 0;
        } else {
            str = this.onExtraCallback;
        }
        int i5 = i2 + 103;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        n7 n7Var = (n7) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = n7Var.onWarmupCompleted;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        n7 n7Var = (n7) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        String str = n7Var.asInterface;
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 55;
        IAuthTabCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.onNavigationEvent;
        int i5 = i3 + 83;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 113;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 95;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 35;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.IAuthTabCallbackStub;
        int i5 = i2 + 31;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final Date asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Date date = this.asBinder;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return date;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 19;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        int i5 = i2 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        int i5 = i3 + 3;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.onTransact;
        int i4 = i2 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String onExtraCallback() {
        return (String) IAuthTabCallback(new Object[]{this}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 706361440, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -706361440);
    }

    public final String IAuthTabCallbackStub() {
        return (String) IAuthTabCallback(new Object[]{this}, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -2122339782, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), 2122339783);
    }
}
