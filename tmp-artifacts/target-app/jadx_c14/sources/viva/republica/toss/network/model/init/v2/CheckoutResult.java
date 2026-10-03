package viva.republica.toss.network.model.init.v2;

import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.HashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.AndroidUnicodeUtils;
import o.TombstoneProtosMemoryMappingBuilder;
import o.getWriggleLayout;
import o.liq;
import o.nativeReadByte;
import o.okycx;
import o.ul1;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.init.v2.CheckoutResult$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CheckoutResult {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final boolean accountVerified;
    private final String birthday;
    private final String callingCode;
    private final String carrier;
    private final nativeReadByte currentPasswordFormat;
    private final String enhancedVerificationType;
    private final String gaNo;
    private final String gender;
    private final String identificationType;
    private final String middleName;
    private final boolean minor;
    private final String nationality;
    private final String phone;
    private final int rrn7th;
    private final String salt;
    private final long timestamp;
    private final Set<String> userGroups;
    private final String userName;
    private final String userNo;
    private final Set<String> userTypes;

    public CheckoutResult() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, false, (Set) null, (Set) null, (String) null, false, (String) null, (String) null, (String) null, 0, (String) null, (nativeReadByte) null, (String) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallbackStub() {
        int i = 2 % 2;
        ul1 ul1Var = new ul1(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return ul1Var;
    }

    private static final /* synthetic */ KSerializer ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        ul1 ul1Var = new ul1(getWriggleLayout.onNavigationEvent);
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return ul1Var;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            ICustomTabsCallbackStub();
            throw null;
        }
        KSerializer kSerializerICustomTabsCallbackStub = ICustomTabsCallbackStub();
        int i3 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerICustomTabsCallbackStub;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy();
        int i4 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i)) | i2;
        int i9 = ~i;
        int i10 = i7 | i2;
        int i11 = (~(i4 | i9 | i2)) | (~(i10 | i));
        int i12 = (~i10) | (~(i9 | (~i2)));
        int i13 = i2 + i + i3 + (1353909401 * i6) + ((-1351514252) * i5);
        int i14 = i13 * i13;
        int i15 = (1883508457 * i2) + 799145984 + ((-1483212659) * i) + (2050486552 * i8) + (i11 * 1122240372) + (1122240372 * i12) + ((-360972288) * i3) + (337379328 * i6) + ((-1540358144) * i5) + (669122560 * i14);
        int i16 = ((i2 * 521834465) - 1171472169) + (i * 521833829) + (i8 * (-424)) + (i11 * 212) + (i12 * 212) + (i3 * 521834041) + (i6 * 1123214353) + (i5 * (-684621612)) + (i14 * 1028784128);
        int i17 = i15 + (i16 * i16 * 1635647488);
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        int i18 = 2 % 2;
        int i19 = onExtraCallbackWithResult;
        int i20 = i19 + 47;
        onNavigationEvent = i20 % 128;
        int i21 = i20 % 2;
        boolean z = checkoutResult.accountVerified;
        int i22 = i19 + 5;
        onNavigationEvent = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnUnminimized = onUnminimized();
        int i4 = onExtraCallbackWithResult + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnUnminimized;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer onUnminimized() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
            int i3 = 87 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.password.PasswordFormat", nativeReadByte.values());
        }
        int i4 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutResult)) {
            return false;
        }
        CheckoutResult checkoutResult = (CheckoutResult) obj;
        if (this.timestamp != checkoutResult.timestamp) {
            int i4 = i2 + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.gaNo, checkoutResult.gaNo) || !Intrinsics.areEqual(this.userNo, checkoutResult.userNo) || !Intrinsics.areEqual(this.userName, checkoutResult.userName) || !Intrinsics.areEqual(this.birthday, checkoutResult.birthday)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.gender, checkoutResult.gender)) {
            int i6 = onExtraCallbackWithResult + 61;
            onNavigationEvent = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.minor != checkoutResult.minor || !Intrinsics.areEqual(this.userGroups, checkoutResult.userGroups)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.userTypes, checkoutResult.userTypes)) {
            int i7 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.enhancedVerificationType, checkoutResult.enhancedVerificationType)) {
            int i9 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.accountVerified != checkoutResult.accountVerified || !Intrinsics.areEqual(this.carrier, checkoutResult.carrier)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nationality, checkoutResult.nationality)) {
            int i11 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.callingCode, checkoutResult.callingCode)) {
            int i13 = onNavigationEvent;
            int i14 = i13 + 13;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i13 + 79;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.rrn7th != checkoutResult.rrn7th || !Intrinsics.areEqual(this.identificationType, checkoutResult.identificationType) || this.currentPasswordFormat != checkoutResult.currentPasswordFormat || !Intrinsics.areEqual(this.salt, checkoutResult.salt) || !Intrinsics.areEqual(this.phone, checkoutResult.phone)) {
            return false;
        }
        if (Intrinsics.areEqual(this.middleName, checkoutResult.middleName)) {
            return true;
        }
        int i17 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i17 % 128;
        int i18 = i17 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Long.hashCode(this.timestamp);
        int iHashCode2 = this.gaNo.hashCode();
        int iHashCode3 = this.userNo.hashCode();
        int iHashCode4 = this.userName.hashCode();
        int iHashCode5 = this.birthday.hashCode();
        int iHashCode6 = this.gender.hashCode();
        int iHashCode7 = Boolean.hashCode(this.minor);
        int iHashCode8 = this.userGroups.hashCode();
        int iHashCode9 = this.userTypes.hashCode();
        int iHashCode10 = this.enhancedVerificationType.hashCode();
        int iHashCode11 = Boolean.hashCode(this.accountVerified);
        int iHashCode12 = this.carrier.hashCode();
        int iHashCode13 = this.nationality.hashCode();
        int iHashCode14 = this.callingCode.hashCode();
        int iHashCode15 = Integer.hashCode(this.rrn7th);
        int iHashCode16 = this.identificationType.hashCode();
        int iHashCode17 = this.currentPasswordFormat.hashCode();
        int iHashCode18 = this.salt.hashCode();
        int iHashCode19 = this.phone.hashCode();
        String str = this.middleName;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode20 = str.hashCode();
            int i5 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode20;
        }
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CheckoutResult(timestamp=" + this.timestamp + ", gaNo=" + this.gaNo + ", userNo=" + this.userNo + ", userName=" + this.userName + ", birthday=" + this.birthday + ", gender=" + this.gender + ", minor=" + this.minor + ", userGroups=" + this.userGroups + ", userTypes=" + this.userTypes + ", enhancedVerificationType=" + this.enhancedVerificationType + ", accountVerified=" + this.accountVerified + ", carrier=" + this.carrier + ", nationality=" + this.nationality + ", callingCode=" + this.callingCode + ", rrn7th=" + this.rrn7th + ", identificationType=" + this.identificationType + ", currentPasswordFormat=" + this.currentPasswordFormat + ", salt=" + this.salt + ", phone=" + this.phone + ", middleName=" + this.middleName + ")";
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ CheckoutResult(int i, long j, String str, String str2, String str3, String str4, String str5, boolean z, Set set, Set set2, String str6, boolean z2, String str7, String str8, String str9, int i2, String str10, nativeReadByte nativereadbyte, String str11, String str12, String str13, okycx okycxVar) {
        String strOnNavigationEvent;
        this.timestamp = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.gaNo = "";
        } else {
            this.gaNo = str;
        }
        if ((i & 4) == 0) {
            this.userNo = "";
        } else {
            this.userNo = str2;
        }
        if ((i & 8) == 0) {
            int i3 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            this.userName = "";
            if (i4 != 0) {
                str.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
        } else {
            this.userName = str3;
        }
        if ((i & 16) == 0) {
            this.birthday = "";
        } else {
            this.birthday = str4;
            int i6 = 2 % 2;
        }
        if ((i & 32) == 0) {
            int i7 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            this.gender = "";
            if (i8 == 0) {
                int i9 = 54 / 0;
            }
            int i10 = 2 % 2;
        } else {
            this.gender = str5;
        }
        if ((i & 64) == 0) {
            int i11 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            this.minor = false;
        } else {
            this.minor = z;
        }
        this.userGroups = (i & 128) == 0 ? new HashSet() : set;
        if ((i & 256) == 0) {
            this.userTypes = new HashSet();
        } else {
            this.userTypes = set2;
            int i13 = 2 % 2;
        }
        this.enhancedVerificationType = (i & 512) == 0 ? "NONE" : str6;
        if ((i & 1024) == 0) {
            this.accountVerified = false;
        } else {
            this.accountVerified = z2;
        }
        if ((i & 2048) == 0) {
            this.carrier = "";
        } else {
            this.carrier = str7;
        }
        if ((i & 4096) == 0) {
            this.nationality = "";
        } else {
            this.nationality = str8;
        }
        if ((i & 8192) == 0) {
            int i14 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            this.callingCode = "";
        } else {
            this.callingCode = str9;
        }
        this.rrn7th = (i & 16384) == 0 ? -1 : i2;
        if ((32768 & i) == 0) {
            this.identificationType = "";
        } else {
            this.identificationType = str10;
        }
        this.currentPasswordFormat = (65536 & i) == 0 ? AndroidUnicodeUtils.onExtraCallbackWithResult().onExtraCallbackWithResult() : nativereadbyte;
        if ((131072 & i) == 0) {
            strOnNavigationEvent = AndroidUnicodeUtils.onExtraCallbackWithResult().onNavigationEvent();
            int i16 = 2 % 2;
        } else {
            strOnNavigationEvent = str11;
        }
        this.salt = strOnNavigationEvent;
        this.phone = (262144 & i) == 0 ? AndroidUnicodeUtils.onExtraCallbackWithResult().IAuthTabCallback() : str12;
        this.middleName = (i & 524288) != 0 ? str13 : null;
    }

    public CheckoutResult(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull Set<String> set, @NotNull Set<String> set2, @NotNull String str6, boolean z2, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, @NotNull String str10, @NotNull nativeReadByte nativereadbyte, @NotNull String str11, @NotNull String str12, @Nullable String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(set2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(nativereadbyte, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.timestamp = j;
        this.gaNo = str;
        this.userNo = str2;
        this.userName = str3;
        this.birthday = str4;
        this.gender = str5;
        this.minor = z;
        this.userGroups = set;
        this.userTypes = set2;
        this.enhancedVerificationType = str6;
        this.accountVerified = z2;
        this.carrier = str7;
        this.nationality = str8;
        this.callingCode = str9;
        this.rrn7th = i;
        this.identificationType = str10;
        this.currentPasswordFormat = nativereadbyte;
        this.salt = str11;
        this.phone = str12;
        this.middleName = str13;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
      0x002a: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:10:0x0028, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v16 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v17 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.init.v2.CheckoutResult r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.init.v2.CheckoutResult.onNavigationEvent(viva.republica.toss.network.model.init.v2.CheckoutResult, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 119;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public /* synthetic */ CheckoutResult(long j, String str, String str2, String str3, String str4, String str5, boolean z, Set set, Set set2, String str6, boolean z2, String str7, String str8, String str9, int i, String str10, nativeReadByte nativereadbyte, String str11, String str12, String str13, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        String str14;
        boolean z3;
        Set hashSet;
        Set hashSet2;
        boolean z4;
        String str15;
        String str16;
        String str17;
        int i3;
        nativeReadByte nativereadbyteOnExtraCallbackWithResult;
        String strOnNavigationEvent;
        String str18;
        String str19;
        String strIAuthTabCallback;
        if ((i2 & 1) != 0) {
            int i4 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            j2 = 0;
        } else {
            j2 = j;
        }
        String str20 = (i2 & 2) != 0 ? "" : str;
        String str21 = (i2 & 4) != 0 ? "" : str2;
        String str22 = (i2 & 8) != 0 ? "" : str3;
        if ((i2 & 16) != 0) {
            int i6 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str14 = "";
        } else {
            str14 = str4;
        }
        String str23 = (i2 & 32) != 0 ? "" : str5;
        if ((i2 & 64) != 0) {
            int i7 = onNavigationEvent + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 128) != 0) {
            hashSet = new HashSet();
            int i9 = 2 % 2;
        } else {
            hashSet = set;
        }
        if ((i2 & 256) != 0) {
            hashSet2 = new HashSet();
            int i10 = 2 % 2;
        } else {
            hashSet2 = set2;
        }
        String str24 = (i2 & 512) != 0 ? "NONE" : str6;
        if ((i2 & 1024) != 0) {
            int i11 = onNavigationEvent + 35;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        String str25 = (i2 & 2048) != 0 ? "" : str7;
        if ((i2 & 4096) != 0) {
            int i13 = onNavigationEvent + 71;
            str15 = "";
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            str16 = str15;
        } else {
            str15 = "";
            str16 = str8;
        }
        String str26 = (i2 & 8192) != 0 ? str15 : str9;
        int i16 = (i2 & 16384) != 0 ? -1 : i;
        str15 = (i2 & 32768) == 0 ? str10 : str15;
        if ((i2 & 65536) != 0) {
            nativereadbyteOnExtraCallbackWithResult = AndroidUnicodeUtils.onExtraCallbackWithResult().onExtraCallbackWithResult();
            i3 = i16;
            int i17 = onNavigationEvent + 119;
            str17 = str16;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 2 % 2;
            }
        } else {
            str17 = str16;
            i3 = i16;
            nativereadbyteOnExtraCallbackWithResult = nativereadbyte;
        }
        if ((131072 & i2) != 0) {
            int i19 = onExtraCallbackWithResult + 109;
            onNavigationEvent = i19 % 128;
            if (i19 % 2 == 0) {
                strOnNavigationEvent = AndroidUnicodeUtils.onExtraCallbackWithResult().onNavigationEvent();
                int i20 = 69 / 0;
            } else {
                strOnNavigationEvent = AndroidUnicodeUtils.onExtraCallbackWithResult().onNavigationEvent();
            }
        } else {
            strOnNavigationEvent = str11;
        }
        if ((262144 & i2) != 0) {
            int i21 = onExtraCallbackWithResult + 9;
            str18 = strOnNavigationEvent;
            onNavigationEvent = i21 % 128;
            if (i21 % 2 == 0) {
                AndroidUnicodeUtils.onExtraCallbackWithResult().IAuthTabCallback();
                throw null;
            }
            strIAuthTabCallback = AndroidUnicodeUtils.onExtraCallbackWithResult().IAuthTabCallback();
            int i22 = 2 % 2;
            str19 = null;
        } else {
            str18 = strOnNavigationEvent;
            str19 = null;
            strIAuthTabCallback = str12;
        }
        this(j2, str20, str21, str22, str14, str23, z3, hashSet, hashSet2, str24, z4, str25, str17, str26, i3, str15, nativereadbyteOnExtraCallbackWithResult, str18, strIAuthTabCallback, (i2 & 524288) == 0 ? str13 : str19);
    }

    public final long ICustomTabsCallback() {
        long j;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            j = this.timestamp;
            int i4 = 70 / 0;
        } else {
            j = this.timestamp;
        }
        int i5 = i2 + 61;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.gaNo;
        int i5 = i3 + 47;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = checkoutResult.userNo;
        int i5 = i3 + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onActivityResized() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.userName;
        if (i3 != 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.birthday;
        int i4 = i3 + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return str;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.gender;
        int i5 = i3 + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.minor;
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Set<String> onActivityLayout() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = this.userGroups;
        int i5 = i2 + 35;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return set;
    }

    public final Set<String> onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set<String> set = this.userTypes;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return set;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.enhancedVerificationType;
        int i5 = i2 + 97;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.carrier;
        int i5 = i3 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nationality;
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = checkoutResult.callingCode;
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        int i6 = i2 + 121;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int extraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rrn7th;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.identificationType;
        int i5 = i3 + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final nativeReadByte onTransact() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        nativeReadByte nativereadbyte = this.currentPasswordFormat;
        int i5 = i2 + 91;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return nativereadbyte;
        }
        throw null;
    }

    public final String readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.salt;
        int i5 = i3 + 9;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.phone;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.middleName;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CheckoutResult checkoutResult = (CheckoutResult) objArr[0];
        int i = 2 % 2;
        if (checkoutResult.gaNo.length() > 0 && checkoutResult.userNo.length() > 0) {
            int i2 = onNavigationEvent + 107;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            if (checkoutResult.timestamp > 0) {
                int i5 = i3 + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutResult> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            CheckoutResult$.serializer serializerVar = CheckoutResult$.serializer.INSTANCE;
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return serializerVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.init.v2.CheckoutResult$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallbackWithResult = CheckoutResult.onExtraCallbackWithResult();
                int i4 = onWarmupCompleted + 31;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
                return kSerializerOnExtraCallbackWithResult;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.init.v2.CheckoutResult$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 3;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                KSerializer kSerializer = (KSerializer) CheckoutResult.onNavigationEvent(-942198543, 942198547, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], iOnNavigationEvent3);
                int i4 = onExtraCallbackWithResult + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializer;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }), null, null, null, null, null, null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.init.v2.CheckoutResult$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnNavigationEvent = CheckoutResult.onNavigationEvent();
                int i4 = IAuthTabCallback + 35;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnNavigationEvent;
            }
        }), null, null, null};
        int i = onExtraCallback + 109;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (KSerializer) onNavigationEvent(-942198543, 942198547, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], iOnNavigationEvent3);
    }

    public final boolean onExtraCallback() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onNavigationEvent(1738607546, -1738607543, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3)).booleanValue();
    }

    public final String IAuthTabCallbackStub() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onNavigationEvent(824555286, -824555286, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3);
    }

    public final String onPostMessage() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (String) onNavigationEvent(651634805, -651634803, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3);
    }

    public final boolean onMinimized() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Boolean) onNavigationEvent(-1946883688, 1946883689, iOnNavigationEvent2, iOnNavigationEvent, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3)).booleanValue();
    }
}
