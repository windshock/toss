package o;

import android.os.Parcel;
import android.os.Parcelable;
import gatewayprotocol.v1.AdResponseKtKt;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class onAvailable implements Parcelable {
    public static final Parcelable.Creator<onAvailable> CREATOR = new onExtraCallback();
    private static int ICustomTabsCallback = 0;
    private static int access100 = 0;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 1;
    private final String IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final Integer IAuthTabCallback_Parcel;
    private final Integer access000;
    private final String asBinder;
    private final String asInterface;
    private final WifiConnectorExternalSyntheticApiModelOutline1 getInterfaceDescriptor;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final WifiConnector1 onNavigationEvent;
    private final String onTransact;
    private final String onWarmupCompleted;

    static {
        int i = extraCallbackWithResult + 49;
        access100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public onAvailable() {
        this(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ onAvailable IAuthTabCallback(onAvailable onavailable, WifiConnector1 wifiConnector1, String str, String str2, String str3, int i, WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, String str4, Integer num, String str5, String str6, String str7, String str8, Integer num2, String str9, int i2, Object obj) {
        String str10;
        String str11;
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline12;
        String str12;
        String str13;
        String str14;
        String str15;
        Integer num3;
        String str16;
        int i3 = 2 % 2;
        WifiConnector1 wifiConnector12 = (i2 & 1) != 0 ? onavailable.onNavigationEvent : wifiConnector1;
        String str17 = (i2 & 2) != 0 ? onavailable.IAuthTabCallback : str;
        if ((i2 & 4) != 0) {
            int i4 = extraCallback + 109;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            str10 = onavailable.onExtraCallback;
        } else {
            str10 = str2;
        }
        Object obj2 = null;
        if ((i2 & 8) != 0) {
            int i6 = extraCallback + 7;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                String str18 = onavailable.asBinder;
                obj2.hashCode();
                throw null;
            }
            str11 = onavailable.asBinder;
        } else {
            str11 = str3;
        }
        int i7 = (i2 & 16) != 0 ? onavailable.IAuthTabCallbackStubProxy : i;
        if ((i2 & 32) != 0) {
            int i8 = ICustomTabsCallback + 1;
            extraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                wifiConnectorExternalSyntheticApiModelOutline12 = onavailable.getInterfaceDescriptor;
                int i9 = 28 / 0;
            } else {
                wifiConnectorExternalSyntheticApiModelOutline12 = onavailable.getInterfaceDescriptor;
            }
        } else {
            wifiConnectorExternalSyntheticApiModelOutline12 = wifiConnectorExternalSyntheticApiModelOutline1;
        }
        if ((i2 & 64) != 0) {
            str12 = onavailable.IAuthTabCallbackStub;
            int i10 = extraCallback + 5;
            ICustomTabsCallback = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 / 3;
            }
        } else {
            str12 = str4;
        }
        Integer num4 = (i2 & 128) != 0 ? onavailable.access000 : num;
        if ((i2 & 256) != 0) {
            int i12 = ICustomTabsCallback + 29;
            extraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                String str19 = onavailable.onTransact;
                throw null;
            }
            str13 = onavailable.onTransact;
        } else {
            str13 = str5;
        }
        String str20 = (i2 & 512) != 0 ? onavailable.onExtraCallbackWithResult : str6;
        if ((i2 & 1024) != 0) {
            int i13 = extraCallback + 61;
            ICustomTabsCallback = i13 % 128;
            if (i13 % 2 != 0) {
                String str21 = onavailable.onWarmupCompleted;
                obj2.hashCode();
                throw null;
            }
            str14 = onavailable.onWarmupCompleted;
        } else {
            str14 = str7;
        }
        String str22 = (i2 & 2048) != 0 ? onavailable.IAuthTabCallbackDefault : str8;
        if ((i2 & 4096) != 0) {
            int i14 = ICustomTabsCallback + 121;
            str15 = str22;
            extraCallback = i14 % 128;
            if (i14 % 2 == 0) {
                num3 = onavailable.IAuthTabCallback_Parcel;
                int i15 = 15 / 0;
            } else {
                num3 = onavailable.IAuthTabCallback_Parcel;
            }
        } else {
            str15 = str22;
            num3 = num2;
        }
        if ((i2 & 8192) != 0) {
            int i16 = ICustomTabsCallback + 103;
            extraCallback = i16 % 128;
            if (i16 % 2 == 0) {
                String str23 = onavailable.asInterface;
                throw null;
            }
            str16 = onavailable.asInterface;
        } else {
            str16 = str9;
        }
        return onavailable.onWarmupCompleted(wifiConnector12, str17, str10, str11, i7, wifiConnectorExternalSyntheticApiModelOutline12, str12, num4, str13, str20, str14, str15, num3, str16);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = ~(i3 | i6);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i3 + i6 + i4 + ((-1585779005) * i2) + (640148872 * i);
        int i17 = i16 * i16;
        int i18 = (i3 * 308833806) + 153878528 + (308833806 * i6) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i4) + (1159200768 * i2) + ((-734003200) * i) + (2089549824 * i17);
        int i19 = (i3 * (-1291220770)) + 263398195 + (i6 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i4 * (-1291221671)) + (i2 * (-1079815989)) + (i * 669414472) + (i17 * 145489920);
        int i20 = i18 + (i19 * i19 * (-1699479552));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 3;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 1;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onAvailable)) {
            return false;
        }
        onAvailable onavailable = (onAvailable) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, onavailable.onNavigationEvent)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, onavailable.IAuthTabCallback)) {
            int i2 = extraCallback + 111;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallback, onavailable.onExtraCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, onavailable.asBinder)) {
            int i4 = extraCallback + 31;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStubProxy != onavailable.IAuthTabCallbackStubProxy || this.getInterfaceDescriptor != onavailable.getInterfaceDescriptor || !Intrinsics.areEqual(this.IAuthTabCallbackStub, onavailable.IAuthTabCallbackStub)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access000, onavailable.access000)) {
            int i6 = ICustomTabsCallback + 1;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, onavailable.onTransact)) {
            int i8 = ICustomTabsCallback + 21;
            extraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onavailable.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onWarmupCompleted, onavailable.onWarmupCompleted) || !Intrinsics.areEqual(this.IAuthTabCallbackDefault, onavailable.IAuthTabCallbackDefault) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, onavailable.IAuthTabCallback_Parcel)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.asInterface, onavailable.asInterface))) {
            return true;
        }
        int i10 = ICustomTabsCallback + 99;
        extraCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        int iHashCode5 = this.asBinder.hashCode();
        int iHashCode6 = Integer.hashCode(this.IAuthTabCallbackStubProxy);
        int iHashCode7 = this.getInterfaceDescriptor.hashCode();
        int iHashCode8 = this.IAuthTabCallbackStub.hashCode();
        Integer num = this.access000;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        int iHashCode10 = this.onTransact.hashCode();
        int iHashCode11 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode12 = this.onWarmupCompleted.hashCode();
        int iHashCode13 = this.IAuthTabCallbackDefault.hashCode();
        Integer num2 = this.IAuthTabCallback_Parcel;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        String str = this.asInterface;
        if (str != null) {
            int i4 = ICustomTabsCallback + 17;
            extraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                str.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        return (((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode;
    }

    public final onAvailable onWarmupCompleted(@NotNull WifiConnector1 wifiConnector1, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, @NotNull String str4, @Nullable Integer num, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable Integer num2, @Nullable String str9) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(wifiConnector1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(wifiConnectorExternalSyntheticApiModelOutline1, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        onAvailable onavailable = new onAvailable(wifiConnector1, str, str2, str3, i, wifiConnectorExternalSyntheticApiModelOutline1, str4, num, str5, str6, str7, str8, num2, str9);
        int i3 = extraCallback + 87;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return onavailable;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HistoryDetail(additionalInform=" + this.onNavigationEvent + ", content=" + this.IAuthTabCallback + ", description=" + this.onExtraCallback + ", referenceDate=" + this.asBinder + ", score=" + this.IAuthTabCallbackStubProxy + ", type=" + this.getInterfaceDescriptor + ", iconUrl=" + this.IAuthTabCallbackStub + ", titleYear=" + this.access000 + ", inquiryBranchName=" + this.onTransact + ", category=" + this.onExtraCallbackWithResult + ", channelOrganizationName=" + this.onWarmupCompleted + ", linkUrl=" + this.IAuthTabCallbackDefault + ", scoreDelta=" + this.IAuthTabCallback_Parcel + ", direction=" + this.asInterface + ")";
        int i2 = extraCallback + 53;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 119;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        this.onNavigationEvent.writeToParcel(parcel, i);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeString(this.onExtraCallback);
        parcel.writeString(this.asBinder);
        parcel.writeInt(this.IAuthTabCallbackStubProxy);
        parcel.writeString(this.getInterfaceDescriptor.name());
        parcel.writeString(this.IAuthTabCallbackStub);
        Integer num = this.access000;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.onTransact);
        parcel.writeString(this.onExtraCallbackWithResult);
        parcel.writeString(this.onWarmupCompleted);
        parcel.writeString(this.IAuthTabCallbackDefault);
        Integer num2 = this.IAuthTabCallback_Parcel;
        if (num2 == null) {
            int i5 = extraCallback + 37;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.asInterface);
    }

    public onAvailable(@NotNull WifiConnector1 wifiConnector1, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, @NotNull String str4, @Nullable Integer num, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable Integer num2, @Nullable String str9) {
        Intrinsics.checkNotNullParameter(wifiConnector1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(wifiConnectorExternalSyntheticApiModelOutline1, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.onNavigationEvent = wifiConnector1;
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.asBinder = str3;
        this.IAuthTabCallbackStubProxy = i;
        this.getInterfaceDescriptor = wifiConnectorExternalSyntheticApiModelOutline1;
        this.IAuthTabCallbackStub = str4;
        this.access000 = num;
        this.onTransact = str5;
        this.onExtraCallbackWithResult = str6;
        this.onWarmupCompleted = str7;
        this.IAuthTabCallbackDefault = str8;
        this.IAuthTabCallback_Parcel = num2;
        this.asInterface = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onAvailable(WifiConnector1 wifiConnector1, String str, String str2, String str3, int i, WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1, String str4, Integer num, String str5, String str6, String str7, String str8, Integer num2, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline12;
        String str12;
        Integer num3;
        String str13;
        String str14;
        String str15;
        Integer num4;
        WifiConnector1 wifiConnector12 = (i2 & 1) != 0 ? new WifiConnector1((String) null, (String) null, false, (List) null, (String) null, (removeReceive) null, (List) null, (List) null, (String) null, (WifiConnectorWiFiConnectReceiver) null, 1023, (DefaultConstructorMarker) null) : wifiConnector1;
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallback + 33;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallback + 113;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str11 = "";
        } else {
            str11 = str2;
        }
        String str16 = (i2 & 8) != 0 ? "" : str3;
        int i8 = (i2 & 16) != 0 ? 0 : i;
        Object obj = null;
        if ((i2 & 32) != 0) {
            int i9 = extraCallback + 25;
            ICustomTabsCallback = i9 % 128;
            if (i9 % 2 != 0) {
                WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline13 = WifiConnectorExternalSyntheticApiModelOutline1.OTHER;
                obj.hashCode();
                throw null;
            }
            wifiConnectorExternalSyntheticApiModelOutline12 = WifiConnectorExternalSyntheticApiModelOutline1.OTHER;
            int i10 = 2 % 2;
        } else {
            wifiConnectorExternalSyntheticApiModelOutline12 = wifiConnectorExternalSyntheticApiModelOutline1;
        }
        if ((i2 & 64) != 0) {
            int i11 = ICustomTabsCallback + 17;
            extraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i12 = 2 % 2;
            str12 = "";
        } else {
            str12 = str4;
        }
        if ((i2 & 128) != 0) {
            int i13 = extraCallback + 77;
            ICustomTabsCallback = i13 % 128;
            int i14 = i13 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 256) != 0) {
            int i15 = extraCallback + 103;
            ICustomTabsCallback = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            str13 = "";
        } else {
            str13 = str5;
        }
        String str17 = (i2 & 512) != 0 ? "" : str6;
        String str18 = (i2 & 1024) != 0 ? "" : str7;
        String str19 = (i2 & 2048) == 0 ? str8 : "";
        if ((i2 & 4096) != 0) {
            int i16 = ICustomTabsCallback;
            int i17 = i16 + 9;
            str14 = str19;
            extraCallback = i17 % 128;
            if (i17 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i18 = i16 + 77;
            extraCallback = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 2 % 2;
            str15 = null;
            num4 = null;
        } else {
            str14 = str19;
            str15 = null;
            num4 = num2;
        }
        this(wifiConnector12, str10, str11, str16, i8, wifiConnectorExternalSyntheticApiModelOutline12, str12, num3, str13, str17, str18, str14, num4, (i2 & 8192) == 0 ? str9 : str15);
    }

    public final WifiConnector1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WifiConnector1 wifiConnector1 = this.onNavigationEvent;
        int i4 = i3 + 61;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return wifiConnector1;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 59;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        int i5 = i2 + 61;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 47;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asBinder;
        int i5 = i2 + 107;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int IAuthTabCallback_Parcel() {
        int i;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 21;
        int i4 = i3 % 128;
        extraCallback = i4;
        if (i3 % 2 == 0) {
            i = this.IAuthTabCallbackStubProxy;
            int i5 = 70 / 0;
        } else {
            i = this.IAuthTabCallbackStubProxy;
        }
        int i6 = i4 + 111;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WifiConnectorExternalSyntheticApiModelOutline1 readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        WifiConnectorExternalSyntheticApiModelOutline1 wifiConnectorExternalSyntheticApiModelOutline1 = this.getInterfaceDescriptor;
        int i5 = i3 + 11;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return wifiConnectorExternalSyntheticApiModelOutline1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final Integer IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Integer num = this.access000;
        int i5 = i3 + 73;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 49;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 75;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 71;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 21;
        ICustomTabsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i2 + 29;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 53;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.IAuthTabCallbackDefault;
        int i4 = i2 + 59;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.asInterface;
        int i4 = i3 + 1;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (this.getInterfaceDescriptor != WifiConnectorExternalSyntheticApiModelOutline1.CHANGE || this.onNavigationEvent.asInterface().length() > 0 || this.onNavigationEvent.onExtraCallbackWithResult().length() > 0) {
            return true;
        }
        int i4 = extraCallback + 1;
        int i5 = i4 % 128;
        ICustomTabsCallback = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 57;
        extraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        return i2 % 2 != 0 ? StringsKt.contains$default(this.onTransact, "비바리퍼블리카", false, 4, (Object) null) : StringsKt.contains$default(this.onTransact, "비바리퍼블리카", false, 2, (Object) null);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        onAvailable onavailable = (onAvailable) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = onavailable.onNavigationEvent.IAuthTabCallbackDefault();
        int i4 = ICustomTabsCallback + 15;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zIAuthTabCallbackDefault);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        onAvailable onavailable = (onAvailable) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        WifiConnector1 wifiConnector1 = onavailable.onNavigationEvent;
        if (i3 != 0) {
            wifiConnector1.onExtraCallback();
            throw null;
        }
        removeReceive removereceiveOnExtraCallback = wifiConnector1.onExtraCallback();
        if (removereceiveOnExtraCallback != null) {
            int i4 = extraCallback + 125;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            boolean zIAuthTabCallback = removereceiveOnExtraCallback.IAuthTabCallback();
            if (i5 == 0 ? zIAuthTabCallback : zIAuthTabCallback) {
                int i6 = ICustomTabsCallback + 41;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        onAvailable onavailable = (onAvailable) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onavailable.onWarmupCompleted.length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = onavailable.onWarmupCompleted;
        if (str.length() == 0) {
            int i3 = extraCallback + 37;
            int i4 = i3 % 128;
            ICustomTabsCallback = i4;
            int i5 = i3 % 2;
            str = onavailable.IAuthTabCallback;
            int i6 = i4 + 13;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 2;
            }
        }
        return str;
    }

    public final String IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = extraCallback + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Date dateOnExtraCallbackWithResult = mergeParams.onExtraCallbackWithResult(this.asBinder, "yyyy-MM-dd");
        if (dateOnExtraCallbackWithResult == null) {
            return "오늘";
        }
        int i4 = ICustomTabsCallback + 3;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        String strIAuthTabCallback = commonTestFlag.onExtraCallback.IAuthTabCallback(str, dateOnExtraCallbackWithResult);
        int i6 = extraCallback + 99;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return strIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return o.commonTestFlag.onExtraCallback.IAuthTabCallback("yyyy", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r4 = o.onAvailable.extraCallback + 95;
        o.onAvailable.ICustomTabsCallback = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r4 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r0 = o.onAvailable.extraCallback + 13;
        o.onAvailable.ICustomTabsCallback = r0 % 128;
        r0 = r0 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Date dateOnExtraCallbackWithResult;
        onAvailable onavailable = (onAvailable) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            dateOnExtraCallbackWithResult = mergeParams.onExtraCallbackWithResult(onavailable.asBinder, "yyyy-MM-dd");
            int i3 = 94 / 0;
        } else {
            dateOnExtraCallbackWithResult = mergeParams.onExtraCallbackWithResult(onavailable.asBinder, "yyyy-MM-dd");
        }
    }

    public final int access100() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 85;
        int i4 = i3 % 128;
        ICustomTabsCallback = i4;
        int i5 = i3 % 2;
        Integer num = this.IAuthTabCallback_Parcel;
        if (num == null) {
            int i6 = i2 + 105;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
            }
            return 0;
        }
        int i8 = i4 + 17;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
        int iIntValue = num.intValue();
        if (i9 != 0) {
            return Math.abs(iIntValue);
        }
        Math.abs(iIntValue);
        throw null;
    }

    public final String IAuthTabCallback() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (String) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 2117324819, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, -2117324818);
    }

    public final String IAuthTabCallbackStub() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (String) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, 530623689, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, -530623686);
    }

    public final boolean ICustomTabsCallback() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, -2141976892, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, 2141976894)).booleanValue();
    }

    public final boolean extraCallbackWithResult() {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return ((Boolean) onExtraCallback(AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback3, -1414290753, iIAuthTabCallback2, new Object[]{this}, iIAuthTabCallback, 1414290753)).booleanValue();
    }
}
