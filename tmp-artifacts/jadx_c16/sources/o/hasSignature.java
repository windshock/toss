package o;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hasSignature {
    private static int asBinder = 0;
    public static final int onExtraCallback = 0;
    private static int onTransact = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final List<onNavigationEvent> asInterface;
    private final long onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public hasSignature() {
        this(null, null, null, null, null, 0L, null, 127, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asBinder + 83;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof hasSignature)) {
            int i4 = asBinder + 103;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        hasSignature hassignature = (hasSignature) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, hassignature.IAuthTabCallbackDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, hassignature.onWarmupCompleted)) {
            int i6 = onTransact + 41;
            asBinder = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, hassignature.IAuthTabCallback) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, hassignature.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, hassignature.onNavigationEvent)) {
            int i7 = asBinder + 63;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult == hassignature.onExtraCallbackWithResult) {
            return !(Intrinsics.areEqual(this.asInterface, hassignature.asInterface) ^ true);
        }
        int i9 = asBinder + 67;
        onTransact = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode3 = this.onWarmupCompleted.hashCode();
        int iHashCode4 = this.IAuthTabCallback.hashCode();
        String str = this.IAuthTabCallbackStub;
        int iHashCode5 = 0;
        if (str == null) {
            int i2 = asBinder + 111;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.onNavigationEvent;
        if (str2 != null) {
            int i4 = onTransact + 67;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 18 / 0;
                iHashCode5 = str2.hashCode();
            } else {
                iHashCode5 = str2.hashCode();
            }
            int i6 = asBinder + 95;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + Long.hashCode(this.onExtraCallbackWithResult)) * 31) + this.asInterface.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCardBenefitCalculationByTransactionModel(title=" + this.IAuthTabCallbackDefault + ", descriptionRow1=" + this.onWarmupCompleted + ", descriptionRow2=" + this.IAuthTabCallback + ", subTitle=" + this.IAuthTabCallbackStub + ", schemeUrl=" + this.onNavigationEvent + ", benefitAmount=" + this.onExtraCallbackWithResult + ", transactions=" + this.asInterface + ")";
        int i2 = onTransact + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hasSignature(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, long j, @NotNull List<onNavigationEvent> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallbackDefault = str;
        this.onWarmupCompleted = str2;
        this.IAuthTabCallback = str3;
        this.IAuthTabCallbackStub = str4;
        this.onNavigationEvent = str5;
        this.onExtraCallbackWithResult = j;
        this.asInterface = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hasSignature(String str, String str2, String str3, String str4, String str5, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        String str6 = (i & 1) != 0 ? "" : str;
        String str7 = (i & 2) != 0 ? "" : str2;
        String str8 = (i & 4) == 0 ? str3 : "";
        String str9 = null;
        String str10 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i2 = onTransact;
            int i3 = i2 + 9;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 95;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i8 = onTransact + 71;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        this(str6, str7, str8, str10, str9, j2, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 125;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i3 + 115;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 61;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.IAuthTabCallback;
        int i4 = i2 + 69;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 81;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<onNavigationEvent> asInterface() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
