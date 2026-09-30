package im.toss.feature.credit.terms.network.response;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class CreditTermResponse {
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean agreed;
    private final String attribute;
    private final String contentsUrl;
    private final String notificationType;
    private final long termsId;
    private final String title;

    static {
        int i = onExtraCallback + 87;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public CreditTermResponse() {
        this((String) null, false, 0L, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof CreditTermResponse)) {
            int i3 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        CreditTermResponse creditTermResponse = (CreditTermResponse) obj;
        if (!Intrinsics.areEqual(this.title, creditTermResponse.title)) {
            return false;
        }
        if (this.agreed != creditTermResponse.agreed) {
            int i5 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i5 % 128;
            return i5 % 2 == 0;
        }
        if (this.termsId != creditTermResponse.termsId || !Intrinsics.areEqual(this.contentsUrl, creditTermResponse.contentsUrl)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.notificationType, creditTermResponse.notificationType))) {
            return Intrinsics.areEqual(this.attribute, creditTermResponse.attribute);
        }
        int i6 = onExtraCallbackWithResult + 121;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.title.hashCode() * 31) + Boolean.hashCode(this.agreed)) * 31) + Long.hashCode(this.termsId)) * 31) + this.contentsUrl.hashCode()) * 31) + this.notificationType.hashCode()) * 31) + this.attribute.hashCode();
        int i4 = onNavigationEvent + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditTermResponse(title=" + this.title + ", agreed=" + this.agreed + ", termsId=" + this.termsId + ", contentsUrl=" + this.contentsUrl + ", notificationType=" + this.notificationType + ", attribute=" + this.attribute + ")";
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreditTermResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                CreditTermResponse$$serializer creditTermResponse$$serializer = CreditTermResponse$$serializer.INSTANCE;
                obj.hashCode();
                throw null;
            }
            CreditTermResponse$$serializer creditTermResponse$$serializer2 = CreditTermResponse$$serializer.INSTANCE;
            int i3 = onNavigationEvent + 79;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return creditTermResponse$$serializer2;
            }
            throw null;
        }
    }

    public /* synthetic */ CreditTermResponse(int i, String str, boolean z, long j, String str2, String str3, String str4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.agreed = false;
            int i2 = 2 % 2;
        } else {
            this.agreed = z;
        }
        if ((i & 4) == 0) {
            int i3 = onExtraCallbackWithResult + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.termsId = 0L;
        } else {
            this.termsId = j;
        }
        int i5 = 2 % 2;
        if ((i & 8) == 0) {
            this.contentsUrl = "";
            int i6 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            this.contentsUrl = str2;
        }
        if ((i & 16) == 0) {
            int i9 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            this.notificationType = "";
            if (i10 != 0) {
                throw null;
            }
        } else {
            this.notificationType = str3;
        }
        if ((i & 32) == 0) {
            this.attribute = "";
            return;
        }
        this.attribute = str4;
        int i11 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public CreditTermResponse(@NotNull String str, boolean z, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.title = str;
        this.agreed = z;
        this.termsId = j;
        this.contentsUrl = str2;
        this.notificationType = str3;
        this.attribute = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IAuthTabCallback(CreditTermResponse creditTermResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(creditTermResponse.title, "")) {
                vylVar.onExtraCallback(serialDescriptor, 0, creditTermResponse.title);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 1) || creditTermResponse.agreed) {
            vylVar.onNavigationEvent(serialDescriptor, 1, creditTermResponse.agreed);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i4 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (creditTermResponse.termsId != 0) {
                vylVar.onExtraCallback(serialDescriptor, 2, creditTermResponse.termsId);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || !Intrinsics.areEqual(creditTermResponse.contentsUrl, "")) {
            vylVar.onExtraCallback(serialDescriptor, 3, creditTermResponse.contentsUrl);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4) || !Intrinsics.areEqual(creditTermResponse.notificationType, "")) {
            vylVar.onExtraCallback(serialDescriptor, 4, creditTermResponse.notificationType);
        }
        if ((true ^ vylVar.onWarmupCompleted(serialDescriptor, 5)) && Intrinsics.areEqual(creditTermResponse.attribute, "")) {
            return;
        }
        vylVar.onExtraCallback(serialDescriptor, 5, creditTermResponse.attribute);
        int i6 = onExtraCallbackWithResult + 69;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditTermResponse(String str, boolean z, long j, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        boolean z2;
        long j2;
        String str6;
        String str7;
        String str8 = "";
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 105;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 4) != 0) {
            int i6 = onNavigationEvent + 83;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            int i9 = onExtraCallbackWithResult + 21;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            str7 = "";
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            int i11 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } else {
            str8 = str4;
        }
        this(str5, z2, j2, str6, str7, str8);
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 69;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.agreed;
        int i4 = i2 + 93;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return z;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.termsId;
        int i5 = i2 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return j;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.contentsUrl;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.notificationType;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.attribute;
        int i5 = i3 + 61;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
