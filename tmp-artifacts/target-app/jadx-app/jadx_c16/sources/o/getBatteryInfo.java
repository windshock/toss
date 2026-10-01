package o;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getBatteryInfo {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000;
    private final String IAuthTabCallback;
    private final List<HCEBridgeExtension1> IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String IAuthTabCallback_Parcel;
    private final asInterface access100;
    private final List<onExtraCallbackWithResult> asBinder;
    private final String asInterface;
    private final long onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final onExtraCallbackWithResult onTransact;
    private final long onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~i2;
        int i10 = ~i4;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i6 | i4)) | (~(i7 | i9 | i10));
        int i13 = i2 + i4 + i + ((-1136091917) * i3) + (376669458 * i5);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i2) + 1718550528 + ((-1748215485) * i4) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i) + ((-2044854272) * i3) + (41156608 * i5) + (1721171968 * i14);
        int i16 = ((i2 * (-924404593)) - 1636593565) + (i4 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i * (-924404175)) + (i3 * (-2083730301)) + (i5 * 182666354) + (i14 * (-51970048));
        if (i15 + (i16 * i16 * (-653721600)) != 1) {
            return IAuthTabCallback(objArr);
        }
        getBatteryInfo getbatteryinfo = (getBatteryInfo) objArr[0];
        int i17 = 2 % 2;
        int i18 = IAuthTabCallbackStubProxy;
        int i19 = i18 + 17;
        access000 = i19 % 128;
        int i20 = i19 % 2;
        String str = getbatteryinfo.IAuthTabCallback_Parcel;
        int i21 = i18 + 47;
        access000 = i21 % 128;
        int i22 = i21 % 2;
        return str;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBatteryInfo)) {
            return false;
        }
        getBatteryInfo getbatteryinfo = (getBatteryInfo) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getbatteryinfo.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, getbatteryinfo.asInterface)) {
            int i2 = access000 + 13;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.onWarmupCompleted != getbatteryinfo.onWarmupCompleted) {
            int i4 = access000 + 123;
            IAuthTabCallbackStubProxy = i4 % 128;
            return i4 % 2 == 0;
        }
        if (this.onExtraCallback != getbatteryinfo.onExtraCallback) {
            int i5 = access000 + 33;
            IAuthTabCallbackStubProxy = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, getbatteryinfo.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, getbatteryinfo.onExtraCallbackWithResult)) {
            int i6 = IAuthTabCallbackStubProxy + 27;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, getbatteryinfo.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, getbatteryinfo.IAuthTabCallbackDefault) || this.onNavigationEvent != getbatteryinfo.onNavigationEvent || !Intrinsics.areEqual(this.asBinder, getbatteryinfo.asBinder)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, getbatteryinfo.onTransact)) {
            int i8 = access000 + 121;
            IAuthTabCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, getbatteryinfo.access100)) {
            return false;
        }
        int i10 = IAuthTabCallbackStubProxy + 15;
        access000 = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 11;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = this.asInterface.hashCode();
        int iHashCode3 = Long.hashCode(this.onWarmupCompleted);
        int iHashCode4 = Long.hashCode(this.onExtraCallback);
        int iHashCode5 = this.IAuthTabCallback.hashCode();
        int iHashCode6 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode7 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode8 = this.IAuthTabCallbackDefault.hashCode();
        int iHashCode9 = Integer.hashCode(this.onNavigationEvent);
        int iHashCode10 = this.asBinder.hashCode();
        onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        if (onextracallbackwithresult == null) {
            int i5 = IAuthTabCallbackStubProxy + 35;
            access000 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode11 = onextracallbackwithresult.hashCode();
            int i7 = access000 + 81;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            i = iHashCode11;
        }
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + i) * 31) + this.access100.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BenefitPremiumAdUiModel(id=" + this.IAuthTabCallbackStub + ", requestId=" + this.asInterface + ", adId=" + this.onWarmupCompleted + ", campaignId=" + this.onExtraCallback + ", brandName=" + this.IAuthTabCallback + ", adType=" + this.onExtraCallbackWithResult + ", trackingClickId=" + this.IAuthTabCallback_Parcel + ", eventTypes=" + this.IAuthTabCallbackDefault + ", carouselItemCount=" + this.onNavigationEvent + ", carouselItems=" + this.asBinder + ", collapsedDisplay=" + this.onTransact + ", summaryHeader=" + this.access100 + ")";
        int i2 = IAuthTabCallbackStubProxy + 115;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getBatteryInfo(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<? extends HCEBridgeExtension1> list, int i, @NotNull List<onExtraCallbackWithResult> list2, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @NotNull asInterface asinterface) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        this.IAuthTabCallbackStub = str;
        this.asInterface = str2;
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = str3;
        this.onExtraCallbackWithResult = str4;
        this.IAuthTabCallback_Parcel = str5;
        this.IAuthTabCallbackDefault = list;
        this.onNavigationEvent = i;
        this.asBinder = list2;
        this.onTransact = onextracallbackwithresult;
        this.access100 = asinterface;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getBatteryInfo getbatteryinfo = (getBatteryInfo) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 117;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = getbatteryinfo.IAuthTabCallbackStub;
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access000 + 69;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 17;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i2 + 59;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 71;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 93;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 55;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 89;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 19;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<HCEBridgeExtension1> asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        List<HCEBridgeExtension1> list = this.IAuthTabCallbackDefault;
        int i5 = i3 + 9;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 109;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = this.onNavigationEvent;
        int i6 = i3 + 77;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<onExtraCallbackWithResult> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 81;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<onExtraCallbackWithResult> list = this.asBinder;
        int i4 = i2 + 85;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final onExtraCallbackWithResult onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 107;
        access000 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onExtraCallbackWithResult onextracallbackwithresult = this.onTransact;
        int i4 = i2 + 77;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return onextracallbackwithresult;
    }

    public final asInterface access100() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 37;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        asInterface asinterface = this.access100;
        int i5 = i2 + 23;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return asinterface;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int ICustomTabsCallback = 1;
        private static int extraCallback;
        private final String IAuthTabCallback;
        private final IAuthTabCallbackDefault IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final int IAuthTabCallbackStubProxy;
        private final String IAuthTabCallback_Parcel;
        private final String access000;
        private final onNavigationEvent access100;
        private final String asBinder;
        private final IAuthTabCallbackDefault asInterface;
        private final String extraCallbackWithResult;
        private final Integer getInterfaceDescriptor;
        private final onWarmupCompleted onExtraCallback;
        private final onExtraCallback onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final IAuthTabCallbackDefault onTransact;
        private final String onWarmupCompleted;
        private final onWarmupCompleted readTypedObject;

        public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = i2 | i7;
            int i9 = (~(i5 | i3)) | i2;
            int i10 = ~i5;
            int i11 = (~(i3 | i5 | i2)) | (~(i7 | i10)) | (~((~i2) | i10));
            int i12 = i5 + i2 + i + (1609234610 * i4) + (1307081305 * i6);
            int i13 = i12 * i12;
            int i14 = (((-490261092) * i5) - 1772093440) + (1576585830 * i2) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i) + ((-2101346304) * i4) + (23068672 * i6) + ((-2103967744) * i13);
            int i15 = (i5 * 273352028) + 245730370 + (i2 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i * 273352337) + (i4 * (-770635566)) + (i6 * (-73506199)) + (i13 * (-2011693056));
            int i16 = i14 + (i15 * i15 * 1080557568);
            return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }

        public static /* synthetic */ onExtraCallbackWithResult onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, String str, int i, onWarmupCompleted onwarmupcompleted, onWarmupCompleted onwarmupcompleted2, onExtraCallback onextracallback, onNavigationEvent onnavigationevent, String str2, String str3, String str4, String str5, String str6, String str7, IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallbackDefault iAuthTabCallbackDefault2, IAuthTabCallbackDefault iAuthTabCallbackDefault3, String str8, Integer num, int i2, Object obj) {
            onWarmupCompleted onwarmupcompleted3;
            onExtraCallback onextracallback2;
            onNavigationEvent onnavigationevent2;
            String str9;
            String str10;
            String str11;
            String str12;
            IAuthTabCallbackDefault iAuthTabCallbackDefault4;
            IAuthTabCallbackDefault iAuthTabCallbackDefault5;
            String str13;
            Integer num2;
            String str14;
            int i3 = 2 % 2;
            String str15 = (i2 & 1) != 0 ? onextracallbackwithresult.access000 : str;
            int i4 = (i2 & 2) != 0 ? onextracallbackwithresult.IAuthTabCallbackStubProxy : i;
            onWarmupCompleted onwarmupcompleted4 = (i2 & 4) != 0 ? onextracallbackwithresult.readTypedObject : onwarmupcompleted;
            if ((i2 & 8) != 0) {
                int i5 = ICustomTabsCallback + 43;
                extraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    onwarmupcompleted3 = onextracallbackwithresult.onExtraCallback;
                    int i6 = 88 / 0;
                } else {
                    onwarmupcompleted3 = onextracallbackwithresult.onExtraCallback;
                }
            } else {
                onwarmupcompleted3 = onwarmupcompleted2;
            }
            if ((i2 & 16) != 0) {
                int i7 = ICustomTabsCallback + 87;
                extraCallback = i7 % 128;
                int i8 = i7 % 2;
                onextracallback2 = onextracallbackwithresult.onExtraCallbackWithResult;
            } else {
                onextracallback2 = onextracallback;
            }
            if ((i2 & 32) != 0) {
                int i9 = extraCallback + 57;
                ICustomTabsCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    onnavigationevent2 = onextracallbackwithresult.access100;
                    int i10 = 77 / 0;
                } else {
                    onnavigationevent2 = onextracallbackwithresult.access100;
                }
            } else {
                onnavigationevent2 = onnavigationevent;
            }
            if ((i2 & 64) != 0) {
                int i11 = ICustomTabsCallback + 57;
                extraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    str9 = onextracallbackwithresult.extraCallbackWithResult;
                    int i12 = 99 / 0;
                } else {
                    str9 = onextracallbackwithresult.extraCallbackWithResult;
                }
            } else {
                str9 = str2;
            }
            if ((i2 & 128) != 0) {
                int i13 = ICustomTabsCallback + 11;
                extraCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    String str16 = onextracallbackwithresult.onNavigationEvent;
                    throw null;
                }
                str10 = onextracallbackwithresult.onNavigationEvent;
            } else {
                str10 = str3;
            }
            if ((i2 & 256) != 0) {
                int i14 = extraCallback + 21;
                ICustomTabsCallback = i14 % 128;
                int i15 = i14 % 2;
                str11 = onextracallbackwithresult.asBinder;
            } else {
                str11 = str4;
            }
            String str17 = (i2 & 512) != 0 ? onextracallbackwithresult.IAuthTabCallbackStub : str5;
            String str18 = (i2 & 1024) != 0 ? onextracallbackwithresult.onWarmupCompleted : str6;
            if ((i2 & 2048) != 0) {
                int i16 = ICustomTabsCallback + 61;
                int i17 = i16 % 128;
                extraCallback = i17;
                if (i16 % 2 != 0) {
                    str14 = onextracallbackwithresult.IAuthTabCallback;
                    int i18 = 71 / 0;
                } else {
                    str14 = onextracallbackwithresult.IAuthTabCallback;
                }
                int i19 = i17 + 37;
                String str19 = str14;
                ICustomTabsCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 4 % 4;
                }
                str12 = str19;
            } else {
                str12 = str7;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault6 = (i2 & 4096) != 0 ? onextracallbackwithresult.onTransact : iAuthTabCallbackDefault;
            if ((i2 & 8192) != 0) {
                int i21 = extraCallback + 117;
                iAuthTabCallbackDefault4 = iAuthTabCallbackDefault6;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                iAuthTabCallbackDefault5 = onextracallbackwithresult.IAuthTabCallbackDefault;
            } else {
                iAuthTabCallbackDefault4 = iAuthTabCallbackDefault6;
                iAuthTabCallbackDefault5 = iAuthTabCallbackDefault2;
            }
            IAuthTabCallbackDefault iAuthTabCallbackDefault7 = (i2 & 16384) != 0 ? onextracallbackwithresult.asInterface : iAuthTabCallbackDefault3;
            String str20 = (i2 & 32768) != 0 ? onextracallbackwithresult.IAuthTabCallback_Parcel : str8;
            if ((i2 & 65536) != 0) {
                int i23 = extraCallback + 5;
                str13 = str20;
                ICustomTabsCallback = i23 % 128;
                if (i23 % 2 == 0) {
                    num2 = onextracallbackwithresult.getInterfaceDescriptor;
                    int i24 = 56 / 0;
                } else {
                    num2 = onextracallbackwithresult.getInterfaceDescriptor;
                }
            } else {
                str13 = str20;
                num2 = num;
            }
            return onextracallbackwithresult.onExtraCallbackWithResult(str15, i4, onwarmupcompleted4, onwarmupcompleted3, onextracallback2, onnavigationevent2, str9, str10, str11, str17, str18, str12, iAuthTabCallbackDefault4, iAuthTabCallbackDefault5, iAuthTabCallbackDefault7, str13, num2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.access000, onextracallbackwithresult.access000)) {
                int i2 = ICustomTabsCallback + 19;
                extraCallback = i2 % 128;
                return i2 % 2 != 0;
            }
            if (this.IAuthTabCallbackStubProxy != onextracallbackwithresult.IAuthTabCallbackStubProxy || !Intrinsics.areEqual(this.readTypedObject, onextracallbackwithresult.readTypedObject) || !Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) || this.onExtraCallbackWithResult != onextracallbackwithresult.onExtraCallbackWithResult) {
                return false;
            }
            if (!Intrinsics.areEqual(this.access100, onextracallbackwithresult.access100)) {
                int i3 = extraCallback + 101;
                ICustomTabsCallback = i3 % 128;
                return i3 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.extraCallbackWithResult, onextracallbackwithresult.extraCallbackWithResult)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                int i4 = ICustomTabsCallback + 5;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asBinder, onextracallbackwithresult.asBinder)) {
                int i6 = extraCallback + 43;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i8 = ICustomTabsCallback + 41;
                extraCallback = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onTransact, onextracallbackwithresult.onTransact)) {
                int i10 = ICustomTabsCallback + 109;
                extraCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault)) {
                int i12 = extraCallback + 71;
                ICustomTabsCallback = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onextracallbackwithresult.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback_Parcel, onextracallbackwithresult.IAuthTabCallback_Parcel)) {
                int i14 = extraCallback + 43;
                ICustomTabsCallback = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.getInterfaceDescriptor, onextracallbackwithresult.getInterfaceDescriptor)) {
                return true;
            }
            int i16 = ICustomTabsCallback + 61;
            extraCallback = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            int i2 = extraCallback + 65;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode3 = this.access000.hashCode();
            int iHashCode4 = Integer.hashCode(this.IAuthTabCallbackStubProxy);
            int iHashCode5 = this.readTypedObject.hashCode();
            int iHashCode6 = this.onExtraCallback.hashCode();
            int iHashCode7 = this.onExtraCallbackWithResult.hashCode();
            int iHashCode8 = this.access100.hashCode();
            int iHashCode9 = this.extraCallbackWithResult.hashCode();
            String str = this.onNavigationEvent;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
                int i4 = ICustomTabsCallback + 77;
                extraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 5;
                }
            }
            String str2 = this.asBinder;
            if (str2 == null) {
                int i6 = ICustomTabsCallback + 121;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
            }
            int iHashCode10 = this.IAuthTabCallbackStub.hashCode();
            String str3 = this.onWarmupCompleted;
            int iHashCode11 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.IAuthTabCallback;
            int iHashCode12 = str4 == null ? 0 : str4.hashCode();
            int iHashCode13 = this.onTransact.hashCode();
            int iHashCode14 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode15 = this.asInterface.hashCode();
            String str5 = this.IAuthTabCallback_Parcel;
            int iHashCode16 = str5 == null ? 0 : str5.hashCode();
            Integer num = this.getInterfaceDescriptor;
            return (((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult(@NotNull String str, int i, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull onWarmupCompleted onwarmupcompleted2, @NotNull onExtraCallback onextracallback, @NotNull onNavigationEvent onnavigationevent, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault2, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault3, @Nullable String str8, @Nullable Integer num) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted2, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault3, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(str, i, onwarmupcompleted, onwarmupcompleted2, onextracallback, onnavigationevent, str2, str3, str4, str5, str6, str7, iAuthTabCallbackDefault, iAuthTabCallbackDefault2, iAuthTabCallbackDefault3, str8, num);
            int i3 = ICustomTabsCallback + 109;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresult;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "CollapsedDisplay(itemId=" + this.access000 + ", itemIdx=" + this.IAuthTabCallbackStubProxy + ", media=" + this.readTypedObject + ", expandedMedia=" + this.onExtraCallback + ", displayType=" + this.onExtraCallbackWithResult + ", logo=" + this.access100 + ", title=" + this.extraCallbackWithResult + ", description=" + this.onNavigationEvent + ", initialAdClearanceText=" + this.asBinder + ", expandedTitle=" + this.IAuthTabCallbackStub + ", expandedDescription=" + this.onWarmupCompleted + ", expandedAdClearanceText=" + this.IAuthTabCallback + ", initialTintColor=" + this.onTransact + ", expandedTintColor=" + this.IAuthTabCallbackDefault + ", gradientColor=" + this.asInterface + ", landingUrl=" + this.IAuthTabCallback_Parcel + ", maxWidth=" + this.getInterfaceDescriptor + ")";
            int i2 = extraCallback + 105;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onExtraCallbackWithResult(@NotNull String str, int i, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull onWarmupCompleted onwarmupcompleted2, @NotNull onExtraCallback onextracallback, @NotNull onNavigationEvent onnavigationevent, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault2, @NotNull IAuthTabCallbackDefault iAuthTabCallbackDefault3, @Nullable String str8, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted2, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault3, "");
            this.access000 = str;
            this.IAuthTabCallbackStubProxy = i;
            this.readTypedObject = onwarmupcompleted;
            this.onExtraCallback = onwarmupcompleted2;
            this.onExtraCallbackWithResult = onextracallback;
            this.access100 = onnavigationevent;
            this.extraCallbackWithResult = str2;
            this.onNavigationEvent = str3;
            this.asBinder = str4;
            this.IAuthTabCallbackStub = str5;
            this.onWarmupCompleted = str6;
            this.IAuthTabCallback = str7;
            this.onTransact = iAuthTabCallbackDefault;
            this.IAuthTabCallbackDefault = iAuthTabCallbackDefault2;
            this.asInterface = iAuthTabCallbackDefault3;
            this.IAuthTabCallback_Parcel = str8;
            this.getInterfaceDescriptor = num;
        }

        public final String IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 71;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.access000;
            }
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 97;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = onextracallbackwithresult.IAuthTabCallbackStubProxy;
            int i6 = i2 + 57;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            return Integer.valueOf(i5);
        }

        public final onWarmupCompleted extraCallback() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 111;
            extraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.readTypedObject;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final onWarmupCompleted onNavigationEvent() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 121;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = this.onExtraCallback;
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return onwarmupcompleted;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallback + 109;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = onextracallbackwithresult.onExtraCallbackWithResult;
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            return onextracallback;
        }

        public final onNavigationEvent access000() {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 97;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent onnavigationevent = this.access100;
            int i5 = i2 + 35;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationevent;
        }

        public final String extraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback;
            int i3 = i2 + 71;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.extraCallbackWithResult;
            int i5 = i2 + 51;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 121;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 107;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 99;
            int i3 = i2 % 128;
            extraCallback = i3;
            int i4 = i2 % 2;
            String str = this.asBinder;
            int i5 = i3 + 65;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 5;
            int i3 = i2 % 128;
            extraCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i3 + 47;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = extraCallback;
            int i3 = i2 + 77;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onWarmupCompleted;
            int i4 = i2 + 123;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return str;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 97;
            int i3 = i2 % 128;
            extraCallback = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i3 + 73;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
            return str;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = extraCallback + 41;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackDefault iAuthTabCallbackDefault = onextracallbackwithresult.onTransact;
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public final IAuthTabCallbackDefault onTransact() {
            int i = 2 % 2;
            int i2 = extraCallback + 21;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackDefault;
            }
            throw null;
        }

        public final IAuthTabCallbackDefault IAuthTabCallbackStub() {
            IAuthTabCallbackDefault iAuthTabCallbackDefault;
            int i = 2 % 2;
            int i2 = extraCallback + 59;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            if (i2 % 2 == 0) {
                iAuthTabCallbackDefault = this.asInterface;
                int i4 = 43 / 0;
            } else {
                iAuthTabCallbackDefault = this.asInterface;
            }
            int i5 = i3 + 121;
            extraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return iAuthTabCallbackDefault;
        }

        public final String IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = extraCallback + 87;
            int i3 = i2 % 128;
            ICustomTabsCallback = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallback_Parcel;
            int i5 = i3 + 107;
            extraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Integer getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = ICustomTabsCallback + 113;
            int i3 = i2 % 128;
            extraCallback = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            Integer num = this.getInterfaceDescriptor;
            int i4 = i3 + 75;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return num;
            }
            throw null;
        }

        public final onExtraCallback onWarmupCompleted() {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (onExtraCallback) IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, -780876855, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 780876857, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }

        public final IAuthTabCallbackDefault asBinder() {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return (IAuthTabCallbackDefault) IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, -941077906, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), 941077906, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        }

        public final int access100() {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            return ((Integer) IAuthTabCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, 284896200, iOnNavigationEvent, setApTextSize.onNavigationEvent.4.onNavigationEvent(), -284896199, setApTextSize.onNavigationEvent.4.onNavigationEvent())).intValue();
        }
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStub = 1;
        private static int onTransact;
        private final Long IAuthTabCallback;
        private final IAuthTabCallback IAuthTabCallbackDefault;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.IAuthTabCallbackDefault != onwarmupcompleted.IAuthTabCallbackDefault || !Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) || !Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                int i2 = IAuthTabCallbackStub + 117;
                onTransact = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback)) {
                int i3 = IAuthTabCallbackStub + 103;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted) {
                return true;
            }
            int i5 = onTransact + 45;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode3 = this.onExtraCallback.hashCode();
            int iHashCode4 = this.onNavigationEvent.hashCode();
            int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
            Long l = this.IAuthTabCallback;
            if (l == null) {
                int i2 = IAuthTabCallbackStub + 69;
                int i3 = i2 % 128;
                onTransact = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 21;
                IAuthTabCallbackStub = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 4 % 5;
                }
                iHashCode = 0;
            } else {
                iHashCode = l.hashCode();
            }
            return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Boolean.hashCode(this.onWarmupCompleted);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Media(type=" + this.IAuthTabCallbackDefault + ", resourceUrl=" + this.onExtraCallback + ", fallbackResourceUrl=" + this.onNavigationEvent + ", thumbnailUrl=" + this.onExtraCallbackWithResult + ", displayDurationMillis=" + this.IAuthTabCallback + ", hasAudio=" + this.onWarmupCompleted + ")";
            int i2 = onTransact + 99;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Long l, boolean z) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.IAuthTabCallbackDefault = iAuthTabCallback;
            this.onExtraCallback = str;
            this.onNavigationEvent = str2;
            this.onExtraCallbackWithResult = str3;
            this.IAuthTabCallback = l;
            this.onWarmupCompleted = z;
        }

        public final IAuthTabCallback asInterface() {
            int i = 2 % 2;
            int i2 = onTransact + 41;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallbackDefault;
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return iAuthTabCallback;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 41;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 19;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 99 / 0;
            }
            return str;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 55;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.onNavigationEvent;
            int i5 = i3 + 29;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 23;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final Long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 79;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            Long l = this.IAuthTabCallback;
            int i5 = i2 + 123;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 14 / 0;
            }
            return l;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 119;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public static final IAuthTabCallback VIDEO = new IAuthTabCallback("VIDEO", 0);
        public static final IAuthTabCallback IMAGE = new IAuthTabCallback("IMAGE", 1);

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 123;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {VIDEO, IMAGE};
            int i5 = i2 + 33;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return iAuthTabCallbackArr;
            }
            throw null;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            return enumEntries;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) $VALUES.clone();
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return iAuthTabCallbackArr;
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = onExtraCallbackWithResult + 97;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
    }

    public final String asInterface() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 10028568, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -10028568, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this});
    }

    public final String getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (String) IAuthTabCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 129241657, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -129241656, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{this});
    }
}
