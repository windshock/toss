package o;

import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release {
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private final long IAuthTabCallback;
    private final Integer IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final String access100;
    private final findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release asBinder;
    private final String asInterface;
    private final onNavigationEvent getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final onExtraCallbackWithResult onNavigationEvent;
    private final String onTransact;
    private final onExtraCallbackWithResult onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i4 | i8 | i5)) | (~(i7 | i6)) | (~(i10 | i7));
        int i14 = i5 + i6 + i + ((-1336646162) * i3) + (1706069763 * i2);
        int i15 = i14 * i14;
        int i16 = ((i5 * (-1709230891)) - 203685888) + ((-1709230891) * i6) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i) + ((-602931200) * i3) + ((-1331167232) * i2) + ((-1604583424) * i15);
        int i17 = ((i5 * 112646815) - 831444653) + (i6 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i * 112647075) + (i3 * (-2078048118)) + (i2 * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        return i18 != 1 ? i18 != 2 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release onExtraCallbackWithResult(findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, String str, String str2, Integer num, String str3, onNavigationEvent onnavigationevent, String str4, String str5, String str6, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2, long j, long j2, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2, int i, Object obj) {
        Integer num2;
        String str7;
        String str8;
        String str9;
        onExtraCallbackWithResult onextracallbackwithresult3;
        int i2 = 2 % 2;
        String str10 = (i & 1) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onTransact : str;
        String str11 = (i & 2) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.access100 : str2;
        if ((i & 4) != 0) {
            int i3 = access000 + 43;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            num2 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault;
        } else {
            num2 = num;
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback_Parcel + 29;
            access000 = i5 % 128;
            if (i5 % 2 == 0) {
                String str12 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallbackWithResult;
                throw null;
            }
            str7 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallbackWithResult;
        } else {
            str7 = str3;
        }
        onNavigationEvent onnavigationevent2 = (i & 16) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.getInterfaceDescriptor : onnavigationevent;
        if ((i & 32) != 0) {
            str8 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStub;
            int i6 = IAuthTabCallback_Parcel + 103;
            access000 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str8 = str4;
        }
        String str13 = (i & 64) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface : str5;
        if ((i & 128) != 0) {
            int i8 = access000 + 15;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                str9 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallback;
                int i9 = 59 / 0;
            } else {
                str9 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallback;
            }
        } else {
            str9 = str6;
        }
        onExtraCallbackWithResult onextracallbackwithresult4 = (i & 256) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onNavigationEvent : onextracallbackwithresult;
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i10 = access000 + 23;
            IAuthTabCallback_Parcel = i10 % 128;
            if (i10 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult5 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted;
                throw null;
            }
            onextracallbackwithresult3 = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted;
        } else {
            onextracallbackwithresult3 = onextracallbackwithresult2;
        }
        return (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, str10, str11, num2, str7, onnavigationevent2, str8, str13, str9, onextracallbackwithresult4, onextracallbackwithresult3, Long.valueOf((i & 1024) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback : j), Long.valueOf((i & 2048) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStubProxy : j2), (i & 4096) != 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asBinder : findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 1734906588, -1734906587);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Integer num = (Integer) objArr[3];
        String str3 = (String) objArr[4];
        onNavigationEvent onnavigationevent = (onNavigationEvent) objArr[5];
        String str4 = (String) objArr[6];
        String str5 = (String) objArr[7];
        String str6 = (String) objArr[8];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[9];
        onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) objArr[10];
        long jLongValue = ((Number) objArr[11]).longValue();
        long jLongValue2 = ((Number) objArr[12]).longValue();
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[13];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2 = new findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release(str, str2, num, str3, onnavigationevent, str4, str5, str6, onextracallbackwithresult, onextracallbackwithresult2, jLongValue, jLongValue2, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release);
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return findexitinfobysessionidbugsnag_plugin_android_exitinfo_release2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release)) {
            int i2 = access000 + 13;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 53;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) obj;
        if (!Intrinsics.areEqual(this.onTransact, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onTransact)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.access100)) {
            int i6 = IAuthTabCallback_Parcel + 81;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallbackWithResult) || this.getInterfaceDescriptor != findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.getInterfaceDescriptor || !Intrinsics.areEqual(this.IAuthTabCallbackStub, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asInterface)) {
            int i8 = IAuthTabCallback_Parcel + 5;
            access000 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onExtraCallback)) {
            int i10 = IAuthTabCallback_Parcel + 9;
            access000 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onNavigationEvent, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onNavigationEvent) || !Intrinsics.areEqual(this.onWarmupCompleted, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.onWarmupCompleted) || this.IAuthTabCallback != findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallback) {
            return false;
        }
        if (this.IAuthTabCallbackStubProxy == findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.IAuthTabCallbackStubProxy) {
            return Intrinsics.areEqual(this.asBinder, findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.asBinder);
        }
        int i12 = access000 + 125;
        IAuthTabCallback_Parcel = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.onTransact.hashCode();
        String str = this.access100;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Integer num = this.IAuthTabCallbackDefault;
        if (num == null) {
            int i2 = IAuthTabCallback_Parcel + 57;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str2 = this.onExtraCallbackWithResult;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = this.getInterfaceDescriptor.hashCode();
        String str3 = this.IAuthTabCallbackStub;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.asInterface;
        if (str4 == null) {
            int i4 = IAuthTabCallback_Parcel + 41;
            access000 = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.onExtraCallback;
        if (str5 == null) {
            int i5 = access000 + 65;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
        int iHashCode9 = onextracallbackwithresult == null ? 0 : onextracallbackwithresult.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult2 = this.onWarmupCompleted;
        int iHashCode10 = onextracallbackwithresult2 == null ? 0 : onextracallbackwithresult2.hashCode();
        int iHashCode11 = Long.hashCode(this.IAuthTabCallback);
        int iHashCode12 = Long.hashCode(this.IAuthTabCallbackStubProxy);
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = this.asBinder;
        return (((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (findexitinfobysessionidbugsnag_plugin_android_exitinfo_release != null ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnderlayViewRequest(message=" + this.onTransact + ", secondaryMessage=" + this.access100 + ", primaryMessageColor=" + this.IAuthTabCallbackDefault + ", landingScheme=" + this.onExtraCallbackWithResult + ", stage=" + this.getInterfaceDescriptor + ", placement=" + this.IAuthTabCallbackStub + ", renderId=" + this.asInterface + ", impressionKey=" + this.onExtraCallback + ", impressionLog=" + this.onNavigationEvent + ", clickLog=" + this.onWarmupCompleted + ", initialDelayMillis=" + this.IAuthTabCallback + ", scanTransitionDelayMillis=" + this.IAuthTabCallbackStubProxy + ", nextStageRequest=" + this.asBinder + ")";
        int i2 = IAuthTabCallback_Parcel + 73;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull onNavigationEvent onnavigationevent, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallbackWithResult onextracallbackwithresult2, long j, long j2, @Nullable findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.onTransact = str;
        this.access100 = str2;
        this.IAuthTabCallbackDefault = num;
        this.onExtraCallbackWithResult = str3;
        this.getInterfaceDescriptor = onnavigationevent;
        this.IAuthTabCallbackStub = str4;
        this.asInterface = str5;
        this.onExtraCallback = str6;
        this.onNavigationEvent = onextracallbackwithresult;
        this.onWarmupCompleted = onextracallbackwithresult2;
        this.IAuthTabCallback = j;
        this.IAuthTabCallbackStubProxy = j2;
        this.asBinder = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release(String str, String str2, Integer num, String str3, onNavigationEvent onnavigationevent, String str4, String str5, String str6, onExtraCallbackWithResult onextracallbackwithresult, onExtraCallbackWithResult onextracallbackwithresult2, long j, long j2, findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        onExtraCallbackWithResult onextracallbackwithresult3;
        onExtraCallbackWithResult onextracallbackwithresult4;
        long j3;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        Integer num2 = (i & 4) != 0 ? null : num;
        String str8 = (i & 8) != 0 ? null : str3;
        onNavigationEvent onnavigationevent2 = (i & 16) != 0 ? onNavigationEvent.RESULT : onnavigationevent;
        String str9 = (i & 32) != 0 ? null : str4;
        String str10 = (i & 64) != 0 ? null : str5;
        String str11 = (i & 128) != 0 ? null : str6;
        if ((i & 256) != 0) {
            int i3 = 2 % 2;
            onextracallbackwithresult3 = null;
        } else {
            onextracallbackwithresult3 = onextracallbackwithresult;
        }
        if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i4 = access000 + 91;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            onextracallbackwithresult4 = null;
        } else {
            onextracallbackwithresult4 = onextracallbackwithresult2;
        }
        if ((i & 1024) != 0) {
            int i6 = access000 + 13;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            j3 = 0;
        } else {
            j3 = j;
        }
        this(str, str7, num2, str8, onnavigationevent2, str9, str10, str11, onextracallbackwithresult3, onextracallbackwithresult4, j3, (i & 2048) == 0 ? j2 : 0L, (i & 4096) == 0 ? findexitinfobysessionidbugsnag_plugin_android_exitinfo_release : null);
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 79;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onTransact;
        int i4 = i3 + 93;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 57;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        String str = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.access100;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        Integer num = this.IAuthTabCallbackDefault;
        int i5 = i3 + 89;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 69;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i2 + 7;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent onnavigationevent = findexitinfobysessionidbugsnag_plugin_android_exitinfo_release.getInterfaceDescriptor;
        if (i3 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 65;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallbackStub;
        int i4 = i2 + 73;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = access000 + 87;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.asInterface;
        int i4 = i3 + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final onExtraCallbackWithResult onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 97;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent;
        int i4 = i2 + 39;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    public final onExtraCallbackWithResult onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 109;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.onWarmupCompleted;
        int i5 = i3 + 67;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return onextracallbackwithresult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access000 + 123;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i3 + 3;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long access100() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 123;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 35;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release = this.asBinder;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return findexitinfobysessionidbugsnag_plugin_android_exitinfo_release;
        }
        throw null;
    }

    public final findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull onNavigationEvent onnavigationevent, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallbackWithResult onextracallbackwithresult2, long j, long j2, @Nullable findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release findexitinfobysessionidbugsnag_plugin_android_exitinfo_release) {
        Object[] objArr = {this, str, str2, num, str3, onnavigationevent, str4, str5, str6, onextracallbackwithresult, onextracallbackwithresult2, Long.valueOf(j), Long.valueOf(j2), findexitinfobysessionidbugsnag_plugin_android_exitinfo_release};
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 1734906588, -1734906587);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onNavigationEvent INITIAL = new onNavigationEvent("INITIAL", 0);
        public static final onNavigationEvent SCANNING = new onNavigationEvent("SCANNING", 1);
        public static final onNavigationEvent RESULT = new onNavigationEvent("RESULT", 2);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            onNavigationEvent[] onnavigationeventArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                onNavigationEvent onnavigationevent = INITIAL;
                onNavigationEvent onnavigationevent2 = SCANNING;
                onNavigationEvent onnavigationevent3 = RESULT;
                onnavigationeventArr = new onNavigationEvent[4];
                onnavigationeventArr[1] = onnavigationevent;
                onnavigationeventArr[0] = onnavigationevent2;
                onnavigationeventArr[3] = onnavigationevent3;
            } else {
                onnavigationeventArr = new onNavigationEvent[]{INITIAL, SCANNING, RESULT};
            }
            int i4 = i3 + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 91;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onNavigationEvent + 83;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = IAuthTabCallback + 51;
            onExtraCallback = i % 128;
            int i2 = i % 2;
        }
    }

    public final String getInterfaceDescriptor() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (String) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, -1935623066, 1935623066);
    }

    public final onNavigationEvent access000() {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return (onNavigationEvent) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{this}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted, 654638806, -654638804);
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private final onExtraCallbackWithResult IAuthTabCallback;
        private final onExtraCallbackWithResult onExtraCallback;
        private final onExtraCallbackWithResult onNavigationEvent;

        /* renamed from: o.findExitInfoBySessionIdbugsnag_plugin_android_exitinfo_release$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final /* synthetic */ class C0028onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            public static final /* synthetic */ int[] onNavigationEvent;

            static {
                int[] iArr = new int[onNavigationEvent.values().length];
                try {
                    iArr[onNavigationEvent.INITIAL.ordinal()] = 1;
                    int i = onExtraCallbackWithResult + 23;
                    IAuthTabCallback = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onNavigationEvent.SCANNING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onNavigationEvent.RESULT.ordinal()] = 3;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                onNavigationEvent = iArr;
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                int i5 = i3 + 119;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i7 = i3 + 77;
                onExtraCallbackWithResult = i7 % 128;
                return i7 % 2 != 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                int i8 = onExtraCallbackWithResult + 87;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                return true;
            }
            int i10 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            onExtraCallbackWithResult onextracallbackwithresult;
            int iHashCode;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0 ? (onextracallbackwithresult = this.onExtraCallback) != null : (onextracallbackwithresult = this.onExtraCallback) != null) {
                iHashCode = onextracallbackwithresult.hashCode();
                int i3 = onExtraCallbackWithResult + 83;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 5;
                }
            } else {
                iHashCode = 0;
            }
            onExtraCallbackWithResult onextracallbackwithresult2 = this.onNavigationEvent;
            int iHashCode2 = onextracallbackwithresult2 == null ? 0 : onextracallbackwithresult2.hashCode();
            onExtraCallbackWithResult onextracallbackwithresult3 = this.IAuthTabCallback;
            return (((iHashCode * 31) + iHashCode2) * 31) + (onextracallbackwithresult3 != null ? onextracallbackwithresult3.hashCode() : 0);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EventLogs(initial=" + this.onExtraCallback + ", scanning=" + this.onNavigationEvent + ", result=" + this.IAuthTabCallback + ")";
            int i2 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable onExtraCallbackWithResult onextracallbackwithresult2, @Nullable onExtraCallbackWithResult onextracallbackwithresult3) {
            this.onExtraCallback = onextracallbackwithresult;
            this.onNavigationEvent = onextracallbackwithresult2;
            this.IAuthTabCallback = onextracallbackwithresult3;
        }

        public final onExtraCallbackWithResult IAuthTabCallback(@NotNull onNavigationEvent onnavigationevent) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            int i4 = C0028onWarmupCompleted.onNavigationEvent[onnavigationevent.ordinal()];
            if (i4 == 1) {
                return this.onExtraCallback;
            }
            int i5 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (i4 == 2) {
                return this.onNavigationEvent;
            }
            if (i4 == 3) {
                return this.IAuthTabCallback;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private final Map<String, Object> onNavigationEvent;
        private final long onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ onExtraCallbackWithResult IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, long j, Map map, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = IAuthTabCallback + 21;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                j = onextracallbackwithresult.onWarmupCompleted;
            }
            if ((i & 2) != 0) {
                map = onextracallbackwithresult.onNavigationEvent;
            }
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted(j, map);
            int i5 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return onextracallbackwithresultOnWarmupCompleted;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 59;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted) {
                return Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
            }
            int i7 = i4 + 45;
            onExtraCallbackWithResult = i7 % 128;
            return i7 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Long.hashCode(this.onWarmupCompleted) * 31) + this.onNavigationEvent.hashCode();
            int i4 = onExtraCallbackWithResult + 55;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            return iHashCode;
        }

        public final onExtraCallbackWithResult onWarmupCompleted(long j, @NotNull Map<String, ? extends Object> map) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(j, map);
            int i2 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "EventLog(schemaId=" + this.onWarmupCompleted + ", params=" + this.onNavigationEvent + ")";
            int i2 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(long j, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.onWarmupCompleted = j;
            this.onNavigationEvent = map;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 35;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            long j = this.onWarmupCompleted;
            int i4 = i3 + 119;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return j;
            }
            obj.hashCode();
            throw null;
        }

        public final Map<String, Object> IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Map<String, Object> map = this.onNavigationEvent;
            int i5 = i3 + 103;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 52 / 0;
            }
            return map;
        }
    }
}
