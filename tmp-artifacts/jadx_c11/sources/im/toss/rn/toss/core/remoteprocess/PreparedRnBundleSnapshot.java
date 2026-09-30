package im.toss.rn.toss.core.remoteprocess;

import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.spec.bundle.TossReactBundleMeta$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.setVisitUrl;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class PreparedRnBundleSnapshot {
    public static final Companion Companion = new Companion(null);
    public static final int SCHEMA_VERSION = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String bundleBaseUrl;
    private final String company;
    private final long createdAtMillis;
    private final String distributionGroup;
    private final String id;
    private final String region;
    private final int schemaVersion;
    private final String serviceBundleName;
    private final String serviceBundlePath;
    private final String serviceBundleSha256;
    private final long serviceBundleSize;
    private final String serviceBundleUrl;
    private final boolean serviceIsFromCache;
    private final TossReactBundleMeta serviceMeta;
    private final String sharedBundleName;
    private final String sharedBundlePath;
    private final String sharedBundleSha256;
    private final long sharedBundleSize;
    private final String sharedBundleUrl;
    private final boolean sharedIsFromCache;
    private final TossReactBundleMeta sharedMeta;

    static {
        int i = onExtraCallback + 91;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = i2 | i7;
        int i11 = (~(i2 | i6)) | (~(i7 | (~i6) | i8)) | (~(i6 | i3));
        int i12 = i6 + i3 + i4 + (764943627 * i) + (189947931 * i5);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-973936384)) - 801505280) + ((-973936384) * i3) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i4) + ((-1475084288) * i) + ((-1479278592) * i5) + ((-626393088) * i13);
        int i15 = (i6 * 1860537600) + 224780607 + (i3 * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i4 * 1860538117) + (i * (-1861700041)) + (i5 * (-831392377)) + (i13 * 995229696);
        int i16 = i14 + (i15 * i15 * 1053163520);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreparedRnBundleSnapshot)) {
            return false;
        }
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) obj;
        if (this.schemaVersion != preparedRnBundleSnapshot.schemaVersion || !Intrinsics.areEqual(this.id, preparedRnBundleSnapshot.id)) {
            return false;
        }
        if (this.createdAtMillis != preparedRnBundleSnapshot.createdAtMillis) {
            int i3 = onWarmupCompleted + 93;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.region, preparedRnBundleSnapshot.region)) {
            int i5 = onNavigationEvent + 67;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.company, preparedRnBundleSnapshot.company)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleBaseUrl, preparedRnBundleSnapshot.bundleBaseUrl)) {
            int i7 = onWarmupCompleted + 43;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.distributionGroup, preparedRnBundleSnapshot.distributionGroup)) {
            int i9 = onNavigationEvent + 75;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.serviceBundleName, preparedRnBundleSnapshot.serviceBundleName) || !Intrinsics.areEqual(this.sharedBundleName, preparedRnBundleSnapshot.sharedBundleName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.serviceBundlePath, preparedRnBundleSnapshot.serviceBundlePath)) {
            int i11 = onWarmupCompleted + 19;
            onNavigationEvent = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.sharedBundlePath, preparedRnBundleSnapshot.sharedBundlePath)) {
            return false;
        }
        if (this.serviceBundleSize != preparedRnBundleSnapshot.serviceBundleSize) {
            int i12 = onNavigationEvent + 59;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.sharedBundleSize != preparedRnBundleSnapshot.sharedBundleSize || !Intrinsics.areEqual(this.serviceBundleSha256, preparedRnBundleSnapshot.serviceBundleSha256) || !Intrinsics.areEqual(this.sharedBundleSha256, preparedRnBundleSnapshot.sharedBundleSha256) || !Intrinsics.areEqual(this.serviceBundleUrl, preparedRnBundleSnapshot.serviceBundleUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.sharedBundleUrl, preparedRnBundleSnapshot.sharedBundleUrl)) {
            int i14 = onNavigationEvent + 1;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.serviceMeta, preparedRnBundleSnapshot.serviceMeta) || !Intrinsics.areEqual(this.sharedMeta, preparedRnBundleSnapshot.sharedMeta)) {
            return false;
        }
        if (this.serviceIsFromCache == preparedRnBundleSnapshot.serviceIsFromCache) {
            return this.sharedIsFromCache == preparedRnBundleSnapshot.sharedIsFromCache;
        }
        int i16 = onWarmupCompleted + 89;
        onNavigationEvent = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Integer.hashCode(this.schemaVersion);
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = Long.hashCode(this.createdAtMillis);
        int iHashCode4 = this.region.hashCode();
        int iHashCode5 = this.company.hashCode();
        int iHashCode6 = this.bundleBaseUrl.hashCode();
        String str = this.distributionGroup;
        if (str == null) {
            int i5 = onWarmupCompleted + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode7 = str.hashCode();
            int i7 = onWarmupCompleted + 37;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode7;
        }
        return (((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + i) * 31) + this.serviceBundleName.hashCode()) * 31) + this.sharedBundleName.hashCode()) * 31) + this.serviceBundlePath.hashCode()) * 31) + this.sharedBundlePath.hashCode()) * 31) + Long.hashCode(this.serviceBundleSize)) * 31) + Long.hashCode(this.sharedBundleSize)) * 31) + this.serviceBundleSha256.hashCode()) * 31) + this.sharedBundleSha256.hashCode()) * 31) + this.serviceBundleUrl.hashCode()) * 31) + this.sharedBundleUrl.hashCode()) * 31) + this.serviceMeta.hashCode()) * 31) + this.sharedMeta.hashCode()) * 31) + Boolean.hashCode(this.serviceIsFromCache)) * 31) + Boolean.hashCode(this.sharedIsFromCache);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreparedRnBundleSnapshot(schemaVersion=" + this.schemaVersion + ", id=" + this.id + ", createdAtMillis=" + this.createdAtMillis + ", region=" + this.region + ", company=" + this.company + ", bundleBaseUrl=" + this.bundleBaseUrl + ", distributionGroup=" + this.distributionGroup + ", serviceBundleName=" + this.serviceBundleName + ", sharedBundleName=" + this.sharedBundleName + ", serviceBundlePath=" + this.serviceBundlePath + ", sharedBundlePath=" + this.sharedBundlePath + ", serviceBundleSize=" + this.serviceBundleSize + ", sharedBundleSize=" + this.sharedBundleSize + ", serviceBundleSha256=" + this.serviceBundleSha256 + ", sharedBundleSha256=" + this.sharedBundleSha256 + ", serviceBundleUrl=" + this.serviceBundleUrl + ", sharedBundleUrl=" + this.sharedBundleUrl + ", serviceMeta=" + this.serviceMeta + ", sharedMeta=" + this.sharedMeta + ", serviceIsFromCache=" + this.serviceIsFromCache + ", sharedIsFromCache=" + this.sharedIsFromCache + ")";
        int i2 = onNavigationEvent + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ PreparedRnBundleSnapshot(int i, int i2, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, String str10, String str11, String str12, String str13, TossReactBundleMeta tossReactBundleMeta, TossReactBundleMeta tossReactBundleMeta2, boolean z, boolean z2, okycx okycxVar) {
        Object obj = null;
        if (2097150 != (i & 2097150)) {
            int i3 = onNavigationEvent + 81;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                htf31.onExtraCallbackWithResult(i, 2097150, PreparedRnBundleSnapshot$$serializer.INSTANCE.getDescriptor());
                obj.hashCode();
                throw null;
            }
            htf31.onExtraCallbackWithResult(i, 2097150, PreparedRnBundleSnapshot$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.schemaVersion = 1;
            int i4 = onNavigationEvent + 73;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } else {
            this.schemaVersion = i2;
        }
        this.id = str;
        this.createdAtMillis = j;
        this.region = str2;
        this.company = str3;
        this.bundleBaseUrl = str4;
        this.distributionGroup = str5;
        this.serviceBundleName = str6;
        this.sharedBundleName = str7;
        this.serviceBundlePath = str8;
        this.sharedBundlePath = str9;
        this.serviceBundleSize = j2;
        this.sharedBundleSize = j3;
        this.serviceBundleSha256 = str10;
        this.sharedBundleSha256 = str11;
        this.serviceBundleUrl = str12;
        this.sharedBundleUrl = str13;
        this.serviceMeta = tossReactBundleMeta;
        this.sharedMeta = tossReactBundleMeta2;
        this.serviceIsFromCache = z;
        this.sharedIsFromCache = z2;
        int i6 = onWarmupCompleted + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public PreparedRnBundleSnapshot(int i, @NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, long j2, long j3, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull TossReactBundleMeta tossReactBundleMeta, @NotNull TossReactBundleMeta tossReactBundleMeta2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(tossReactBundleMeta, "");
        Intrinsics.checkNotNullParameter(tossReactBundleMeta2, "");
        this.schemaVersion = i;
        this.id = str;
        this.createdAtMillis = j;
        this.region = str2;
        this.company = str3;
        this.bundleBaseUrl = str4;
        this.distributionGroup = str5;
        this.serviceBundleName = str6;
        this.sharedBundleName = str7;
        this.serviceBundlePath = str8;
        this.sharedBundlePath = str9;
        this.serviceBundleSize = j2;
        this.sharedBundleSize = j3;
        this.serviceBundleSha256 = str10;
        this.sharedBundleSha256 = str11;
        this.serviceBundleUrl = str12;
        this.sharedBundleUrl = str13;
        this.serviceMeta = tossReactBundleMeta;
        this.sharedMeta = tossReactBundleMeta2;
        this.serviceIsFromCache = z;
        this.sharedIsFromCache = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(PreparedRnBundleSnapshot preparedRnBundleSnapshot, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : !(!vylVar.onWarmupCompleted(serialDescriptor, 0))) {
            vylVar.onExtraCallback(serialDescriptor, 0, preparedRnBundleSnapshot.schemaVersion);
            int i3 = onWarmupCompleted + 31;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 4;
            }
        } else if (preparedRnBundleSnapshot.schemaVersion != 1) {
        }
        vylVar.onExtraCallback(serialDescriptor, 1, preparedRnBundleSnapshot.id);
        vylVar.onExtraCallback(serialDescriptor, 2, preparedRnBundleSnapshot.createdAtMillis);
        vylVar.onExtraCallback(serialDescriptor, 3, preparedRnBundleSnapshot.region);
        vylVar.onExtraCallback(serialDescriptor, 4, preparedRnBundleSnapshot.company);
        vylVar.onExtraCallback(serialDescriptor, 5, preparedRnBundleSnapshot.bundleBaseUrl);
        vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, preparedRnBundleSnapshot.distributionGroup);
        vylVar.onExtraCallback(serialDescriptor, 7, preparedRnBundleSnapshot.serviceBundleName);
        vylVar.onExtraCallback(serialDescriptor, 8, preparedRnBundleSnapshot.sharedBundleName);
        vylVar.onExtraCallback(serialDescriptor, 9, preparedRnBundleSnapshot.serviceBundlePath);
        vylVar.onExtraCallback(serialDescriptor, 10, preparedRnBundleSnapshot.sharedBundlePath);
        vylVar.onExtraCallback(serialDescriptor, 11, preparedRnBundleSnapshot.serviceBundleSize);
        vylVar.onExtraCallback(serialDescriptor, 12, preparedRnBundleSnapshot.sharedBundleSize);
        vylVar.onExtraCallback(serialDescriptor, 13, preparedRnBundleSnapshot.serviceBundleSha256);
        vylVar.onExtraCallback(serialDescriptor, 14, preparedRnBundleSnapshot.sharedBundleSha256);
        vylVar.onExtraCallback(serialDescriptor, 15, preparedRnBundleSnapshot.serviceBundleUrl);
        vylVar.onExtraCallback(serialDescriptor, 16, preparedRnBundleSnapshot.sharedBundleUrl);
        TossReactBundleMeta$.serializer serializerVar = TossReactBundleMeta$.serializer.INSTANCE;
        vylVar.onNavigationEvent(serialDescriptor, 17, serializerVar, preparedRnBundleSnapshot.serviceMeta);
        vylVar.onNavigationEvent(serialDescriptor, 18, serializerVar, preparedRnBundleSnapshot.sharedMeta);
        vylVar.onNavigationEvent(serialDescriptor, 19, preparedRnBundleSnapshot.serviceIsFromCache);
        vylVar.onNavigationEvent(serialDescriptor, 20, preparedRnBundleSnapshot.sharedIsFromCache);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreparedRnBundleSnapshot(int i, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j2, long j3, String str10, String str11, String str12, String str13, TossReactBundleMeta tossReactBundleMeta, TossReactBundleMeta tossReactBundleMeta2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 1) != 0) {
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            int i5 = 2 % 2;
            i3 = i4 % 2 == 0 ? 0 : 1;
        } else {
            i3 = i;
        }
        this(i3, str, j, str2, str3, str4, str5, str6, str7, str8, str9, j2, j3, str10, str11, str12, str13, tossReactBundleMeta, tossReactBundleMeta2, z, z2);
    }

    public final int asInterface() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            i = this.schemaVersion;
            int i5 = 24 / 0;
        } else {
            i = this.schemaVersion;
        }
        int i6 = i4 + 29;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = preparedRnBundleSnapshot.region;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.company;
        int i5 = i3 + 79;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = preparedRnBundleSnapshot.bundleBaseUrl;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.distributionGroup;
        int i4 = i3 + 65;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceBundleName;
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sharedBundleName;
        int i5 = i2 + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.serviceBundlePath;
        int i4 = i2 + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.sharedBundlePath;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            long j = preparedRnBundleSnapshot.serviceBundleSize;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = preparedRnBundleSnapshot.serviceBundleSize;
        int i4 = i2 + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        long j = this.sharedBundleSize;
        int i5 = i3 + 61;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return j;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.serviceBundleSha256;
        int i4 = i2 + 25;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return str;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.sharedBundleSha256;
        int i5 = i3 + 71;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 25;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.serviceBundleUrl;
        int i4 = i2 + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String writeTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sharedBundleUrl;
        int i5 = i2 + 13;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final TossReactBundleMeta IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossReactBundleMeta tossReactBundleMeta = this.serviceMeta;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return tossReactBundleMeta;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        PreparedRnBundleSnapshot preparedRnBundleSnapshot = (PreparedRnBundleSnapshot) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossReactBundleMeta tossReactBundleMeta = preparedRnBundleSnapshot.sharedMeta;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return tossReactBundleMeta;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.serviceIsFromCache;
        int i4 = i3 + 63;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final boolean extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.sharedIsFromCache;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return z;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreparedRnBundleSnapshot> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                PreparedRnBundleSnapshot$$serializer preparedRnBundleSnapshot$$serializer = PreparedRnBundleSnapshot$$serializer.INSTANCE;
                throw null;
            }
            PreparedRnBundleSnapshot$$serializer preparedRnBundleSnapshot$$serializer2 = PreparedRnBundleSnapshot$$serializer.INSTANCE;
            int i3 = onExtraCallback + 105;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return preparedRnBundleSnapshot$$serializer2;
        }
    }

    public final String onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1247246971, iOnExtraCallbackWithResult2, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), 1247246972);
    }

    public final String IAuthTabCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1908734453, iOnExtraCallbackWithResult2, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), 1908734456);
    }

    public final long onTransact() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -762314512, iOnExtraCallbackWithResult2, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), 762314512)).longValue();
    }

    public final TossReactBundleMeta ICustomTabsCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return (TossReactBundleMeta) IAuthTabCallback(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1663581814, iOnExtraCallbackWithResult2, new Object[]{this}, setVisitUrl.onExtraCallbackWithResult(), -1663581812);
    }
}
