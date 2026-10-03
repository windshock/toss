package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanFunnelType;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SubsamplingScaleImageViewDefaultOnStateChangedListener implements Parcelable {
    public static final Parcelable.Creator<SubsamplingScaleImageViewDefaultOnStateChangedListener> CREATOR;
    public static final onExtraCallbackWithResult Companion;
    private static short[] ICustomTabsCallbackDefault;
    private static int onActivityLayout;
    public static final int onExtraCallback;
    private static int onMessageChannelReady;
    private static byte[] onMinimized;
    private static int onPostMessage;
    private static int onUnminimized;

    @SerializedName("ci")
    private String IAuthTabCallback;

    @SerializedName("hasCar")
    private boolean IAuthTabCallbackDefault;

    @SerializedName("employType")
    private String IAuthTabCallbackStub;

    @SerializedName("householderType")
    private String IAuthTabCallbackStubProxy;

    @SerializedName("noIncome")
    private boolean IAuthTabCallback_Parcel;

    @SerializedName("openDate")
    private Triple<Integer, Integer, Integer> ICustomTabsCallback;

    @SerializedName("jobType")
    private String access000;

    @SerializedName("joinDate")
    private Triple<Integer, Integer, Integer> access100;

    @SerializedName("companyName")
    private String asBinder;

    @SerializedName("companyNumber")
    private String asInterface;

    @SerializedName("termsAgreedTime")
    private Long extraCallback;

    @SerializedName("scrapedData")
    private String extraCallbackWithResult;

    @SerializedName("healthPayerType")
    private String getInterfaceDescriptor;

    @SerializedName("verifiedTs")
    private String onActivityResized;

    @SerializedName("automobileInfo")
    private String onExtraCallbackWithResult;

    @SerializedName("businessType")
    private String onNavigationEvent;

    @SerializedName("funnelType")
    private LoanFunnelType onTransact;

    @SerializedName("carNumber")
    private String onWarmupCompleted;

    @SerializedName("smsAgreedTime")
    private Long readTypedObject;

    @SerializedName("salary")
    private String writeTypedObject;
    private static final byte[] $$a = {5, -4, -80, 1};
    private static final int $$b = 160;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onRelationshipValidationResult = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int ICustomTabsCallbackStub = 0;

    public static final class onWarmupCompleted implements Parcelable.Creator<SubsamplingScaleImageViewDefaultOnStateChangedListener> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final SubsamplingScaleImageViewDefaultOnStateChangedListener createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SubsamplingScaleImageViewDefaultOnStateChangedListener(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readSerializable(), parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (LoanFunnelType) parcel.readParcelable(SubsamplingScaleImageViewDefaultOnStateChangedListener.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final SubsamplingScaleImageViewDefaultOnStateChangedListener[] newArray(int i) {
            return new SubsamplingScaleImageViewDefaultOnStateChangedListener[i];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            byte[] r0 = o.SubsamplingScaleImageViewDefaultOnStateChangedListener.$$a
            int r6 = r6 * 4
            int r6 = r6 + 115
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnStateChangedListener.$$c(byte, short, int):java.lang.String");
    }

    static {
        onUnminimized = 1;
        onMinimized();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        onExtraCallback = 8;
        CREATOR = new onWarmupCompleted();
        int i = ICustomTabsCallbackStub + 81;
        onUnminimized = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public SubsamplingScaleImageViewDefaultOnStateChangedListener() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, 1048575, null);
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~((~i3) | i7);
        int i9 = i | i8 | (~(i2 | i3));
        int i10 = (~(i3 | i)) | (~(i7 | i3)) | (~(i7 | i));
        int i11 = i + i2 + i6 + (1351532378 * i4) + (1237199896 * i5);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i2) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i6) + ((-1818230784) * i4) + ((-914358272) * i5) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i2 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i6 * 406039561) + (i4 * 1283666474) + (i5 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        Parcel parcel = (Parcel) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 59;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallback;
        if (l == null) {
            parcel.writeInt(0);
            int i4 = ICustomTabsCallbackStubProxy + 107;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = subsamplingScaleImageViewDefaultOnStateChangedListener.readTypedObject;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.onActivityResized);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallbackWithResult);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.access000);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStub);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback);
        parcel.writeSerializable(subsamplingScaleImageViewDefaultOnStateChangedListener.access100);
        parcel.writeSerializable(subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.writeTypedObject);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.asBinder);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.asInterface);
        parcel.writeInt(subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackDefault ? 1 : 0);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.onWarmupCompleted);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStubProxy);
        parcel.writeString(subsamplingScaleImageViewDefaultOnStateChangedListener.getInterfaceDescriptor);
        parcel.writeInt(subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback_Parcel ? 1 : 0);
        parcel.writeParcelable(subsamplingScaleImageViewDefaultOnStateChangedListener.onTransact, iIntValue);
        int i6 = ICustomTabsCallbackStubProxy + 9;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 0 / 0;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 99;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 107;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = ICustomTabsCallbackStubProxy + 125;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof SubsamplingScaleImageViewDefaultOnStateChangedListener)) {
            return false;
        }
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) obj;
        if ((!Intrinsics.areEqual(this.extraCallback, subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallback)) || !Intrinsics.areEqual(this.readTypedObject, subsamplingScaleImageViewDefaultOnStateChangedListener.readTypedObject) || !Intrinsics.areEqual(this.onActivityResized, subsamplingScaleImageViewDefaultOnStateChangedListener.onActivityResized) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.extraCallbackWithResult, subsamplingScaleImageViewDefaultOnStateChangedListener.extraCallbackWithResult) || !Intrinsics.areEqual(this.access000, subsamplingScaleImageViewDefaultOnStateChangedListener.access000) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStub) || !Intrinsics.areEqual(this.onNavigationEvent, subsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent) || !Intrinsics.areEqual(this.IAuthTabCallback, subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access100, subsamplingScaleImageViewDefaultOnStateChangedListener.access100)) {
            int i4 = onRelationshipValidationResult + 99;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback)) {
            int i6 = onRelationshipValidationResult + 87;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.writeTypedObject, subsamplingScaleImageViewDefaultOnStateChangedListener.writeTypedObject) || !Intrinsics.areEqual(this.asBinder, subsamplingScaleImageViewDefaultOnStateChangedListener.asBinder) || !Intrinsics.areEqual(this.asInterface, subsamplingScaleImageViewDefaultOnStateChangedListener.asInterface) || this.IAuthTabCallbackDefault != subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackDefault) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onWarmupCompleted, subsamplingScaleImageViewDefaultOnStateChangedListener.onWarmupCompleted)) {
            int i8 = ICustomTabsCallbackStubProxy + 33;
            onRelationshipValidationResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStubProxy, subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStubProxy) || !Intrinsics.areEqual(this.getInterfaceDescriptor, subsamplingScaleImageViewDefaultOnStateChangedListener.getInterfaceDescriptor) || this.IAuthTabCallback_Parcel != subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallback_Parcel) {
            return false;
        }
        if (this.onTransact == subsamplingScaleImageViewDefaultOnStateChangedListener.onTransact) {
            return true;
        }
        int i10 = ICustomTabsCallbackStubProxy + 89;
        onRelationshipValidationResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        Long l;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int iHashCode4;
        int i2;
        int iHashCode5;
        int i3 = 2 % 2;
        int i4 = onRelationshipValidationResult + 45;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int iHashCode6 = (i4 % 2 != 0 ? (l = this.extraCallback) != null : (l = this.extraCallback) != null) ? l.hashCode() : 0;
        Long l2 = this.readTypedObject;
        if (l2 == null) {
            int i5 = ICustomTabsCallbackStubProxy + 3;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l2.hashCode();
        }
        String str = this.onActivityResized;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.onExtraCallbackWithResult;
        if (str2 == null) {
            int i7 = onRelationshipValidationResult + 97;
            ICustomTabsCallbackStubProxy = i7 % 128;
            iHashCode2 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.extraCallbackWithResult;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = this.access000.hashCode();
        String str4 = this.IAuthTabCallbackStub;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.onNavigationEvent;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        int iHashCode12 = this.IAuthTabCallback.hashCode();
        Triple<Integer, Integer, Integer> triple = this.access100;
        int iHashCode13 = triple == null ? 0 : triple.hashCode();
        Triple<Integer, Integer, Integer> triple2 = this.ICustomTabsCallback;
        int iHashCode14 = triple2 == null ? 0 : triple2.hashCode();
        String str6 = this.writeTypedObject;
        int iHashCode15 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.asBinder;
        if (str7 == null) {
            int i8 = ICustomTabsCallbackStubProxy + 47;
            onRelationshipValidationResult = i8 % 128;
            iHashCode3 = i8 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str7.hashCode();
        }
        String str8 = this.asInterface;
        if (str8 == null) {
            int i9 = onRelationshipValidationResult + 3;
            i = iHashCode3;
            ICustomTabsCallbackStubProxy = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            i = iHashCode3;
            iHashCode4 = str8.hashCode();
        }
        int iHashCode16 = Boolean.hashCode(this.IAuthTabCallbackDefault);
        String str9 = this.onWarmupCompleted;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.IAuthTabCallbackStubProxy;
        if (str10 == null) {
            int i11 = onRelationshipValidationResult + 95;
            i2 = iHashCode16;
            ICustomTabsCallbackStubProxy = i11 % 128;
            int i12 = i11 % 2;
            iHashCode5 = 0;
        } else {
            i2 = iHashCode16;
            iHashCode5 = str10.hashCode();
        }
        String str11 = this.getInterfaceDescriptor;
        return (((((((((((((((((((((((((((((((((((((iHashCode6 * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + iHashCode4) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode5) * 31) + (str11 != null ? str11.hashCode() : 0)) * 31) + Boolean.hashCode(this.IAuthTabCallback_Parcel)) * 31) + this.onTransact.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanComparisonInputData(termsAgreedTime=" + this.extraCallback + ", smsAgreedTime=" + this.readTypedObject + ", verifiedTs=" + this.onActivityResized + ", automobileInfo=" + this.onExtraCallbackWithResult + ", scrapedData=" + this.extraCallbackWithResult + ", jobType=" + this.access000 + ", employType=" + this.IAuthTabCallbackStub + ", businessType=" + this.onNavigationEvent + ", ci=" + this.IAuthTabCallback + ", joinDate=" + this.access100 + ", openDate=" + this.ICustomTabsCallback + ", salary=" + this.writeTypedObject + ", companyName=" + this.asBinder + ", companyNumber=" + this.asInterface + ", hasCar=" + this.IAuthTabCallbackDefault + ", carNumber=" + this.onWarmupCompleted + ", householderType=" + this.IAuthTabCallbackStubProxy + ", healthPayerType=" + this.getInterfaceDescriptor + ", noIncome=" + this.IAuthTabCallback_Parcel + ", funnelType=" + this.onTransact + ")";
        int i2 = ICustomTabsCallbackStubProxy + 55;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public SubsamplingScaleImageViewDefaultOnStateChangedListener(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, @Nullable String str6, @NotNull String str7, @Nullable Triple<Integer, Integer, Integer> triple, @Nullable Triple<Integer, Integer, Integer> triple2, @Nullable String str8, @Nullable String str9, @Nullable String str10, boolean z, @Nullable String str11, @Nullable String str12, @Nullable String str13, boolean z2, @NotNull LoanFunnelType loanFunnelType) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(loanFunnelType, "");
        this.extraCallback = l;
        this.readTypedObject = l2;
        this.onActivityResized = str;
        this.onExtraCallbackWithResult = str2;
        this.extraCallbackWithResult = str3;
        this.access000 = str4;
        this.IAuthTabCallbackStub = str5;
        this.onNavigationEvent = str6;
        this.IAuthTabCallback = str7;
        this.access100 = triple;
        this.ICustomTabsCallback = triple2;
        this.writeTypedObject = str8;
        this.asBinder = str9;
        this.asInterface = str10;
        this.IAuthTabCallbackDefault = z;
        this.onWarmupCompleted = str11;
        this.IAuthTabCallbackStubProxy = str12;
        this.getInterfaceDescriptor = str13;
        this.IAuthTabCallback_Parcel = z2;
        this.onTransact = loanFunnelType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubsamplingScaleImageViewDefaultOnStateChangedListener(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Triple triple, Triple triple2, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, boolean z2, LoanFunnelType loanFunnelType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        Long l4;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        boolean z3;
        String str20;
        String str21;
        LoanFunnelType loanFunnelType2;
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onRelationshipValidationResult + 51;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            l3 = null;
        } else {
            l3 = l;
        }
        if ((i & 2) != 0) {
            int i3 = ICustomTabsCallbackStubProxy + 35;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            l4 = null;
        } else {
            l4 = l2;
        }
        String str22 = (i & 4) != 0 ? null : str;
        String str23 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            int i5 = ICustomTabsCallbackStubProxy + 65;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            str14 = null;
        } else {
            str14 = str3;
        }
        String code = (i & 32) != 0 ? onPreviewReleased.OFFICE_WORKER.getCode() : str4;
        String str24 = (i & 64) != 0 ? null : str5;
        String str25 = (i & 128) != 0 ? null : str6;
        String str26 = (i & 256) != 0 ? "" : str7;
        Triple triple3 = (i & 512) != 0 ? null : triple;
        Triple triple4 = (i & 1024) != 0 ? null : triple2;
        if ((i & 2048) != 0) {
            int i7 = onRelationshipValidationResult + 11;
            ICustomTabsCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str15 = null;
        } else {
            str15 = str8;
        }
        if ((i & 4096) != 0) {
            int i8 = onRelationshipValidationResult + 15;
            ICustomTabsCallbackStubProxy = i8 % 128;
            Object obj2 = null;
            if (i8 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str16 = null;
        } else {
            str16 = str9;
        }
        if ((i & 8192) != 0) {
            int i9 = ICustomTabsCallbackStubProxy + 95;
            str17 = str16;
            onRelationshipValidationResult = i9 % 128;
            int i10 = i9 % 2;
            str18 = null;
        } else {
            str17 = str16;
            str18 = str10;
        }
        if ((i & 16384) != 0) {
            int i11 = ICustomTabsCallbackStubProxy + 31;
            str19 = str18;
            onRelationshipValidationResult = i11 % 128;
            z3 = i11 % 2 != 0;
        } else {
            str19 = str18;
            z3 = z;
        }
        String str27 = (32768 & i) != 0 ? null : str11;
        String str28 = "01";
        if ((i & 65536) != 0) {
            int i12 = 2 % 2;
            str20 = "01";
        } else {
            str20 = str12;
        }
        if ((i & 131072) != 0) {
            int i13 = ICustomTabsCallbackStubProxy + 35;
            str21 = str27;
            onRelationshipValidationResult = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
        } else {
            str21 = str27;
            str28 = str13;
        }
        boolean z4 = (262144 & i) == 0 ? z2 : false;
        if ((i & 524288) != 0) {
            loanFunnelType2 = LoanFunnelType.MANUAL;
            int i16 = 2 % 2;
        } else {
            loanFunnelType2 = loanFunnelType;
        }
        this(l3, l4, str22, str23, str14, code, str24, str25, str26, triple3, triple4, str15, str17, str19, z3, str21, str20, str28, z4, loanFunnelType2);
    }

    public final void onExtraCallback(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 55;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.extraCallback = l;
        int i5 = i2 + 21;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Long readTypedObject() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 35;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.extraCallback;
        int i5 = i2 + 97;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return l;
    }

    public final Long extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 25;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.readTypedObject;
        int i5 = i2 + 95;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable Long l) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 19;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.readTypedObject = l;
        int i5 = i2 + 97;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void access000(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        this.onActivityResized = str;
        int i5 = i3 + 39;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onPostMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 91;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onActivityResized;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 45;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        String str = subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult;
        int i5 = i2 + 59;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 41;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = str;
        int i5 = i2 + 77;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void getInterfaceDescriptor(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.extraCallbackWithResult = str;
        int i5 = i3 + 17;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String str = subsamplingScaleImageViewDefaultOnStateChangedListener.access000;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public final void asBinder(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.access000 = str;
        int i4 = onRelationshipValidationResult + 49;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        String str = subsamplingScaleImageViewDefaultOnStateChangedListener.IAuthTabCallbackStub;
        int i5 = i3 + 93;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void asInterface(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 103;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = str;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        int i6 = i2 + 13;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 21;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        subsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent = str;
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        String str;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 51;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.onNavigationEvent;
            int i4 = 73 / 0;
        } else {
            str = this.onNavigationEvent;
        }
        int i5 = i2 + 115;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 107;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 109;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 51;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        int i4 = ICustomTabsCallbackStubProxy + 107;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Triple<Integer, Integer, Integer> access000() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 97;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Triple<Integer, Integer, Integer> triple = this.access100;
        int i5 = i2 + 39;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return triple;
    }

    public final void onExtraCallback(@Nullable Triple<Integer, Integer, Integer> triple) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 11;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        this.access100 = triple;
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        int i6 = i2 + 19;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        Triple<Integer, Integer, Integer> triple = (Triple) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback = triple;
        if (i3 != 0) {
            return null;
        }
        int i4 = 27 / 0;
        return null;
    }

    public final Triple<Integer, Integer, Integer> writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 19;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsCallback;
        }
        throw null;
    }

    public final String ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 81;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.writeTypedObject;
        int i5 = i2 + 1;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void onTransact(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 3;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        this.writeTypedObject = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 61;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 65;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.asBinder;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 99;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 49;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i2 + 21;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 95;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.IAuthTabCallbackDefault;
        int i5 = i2 + 47;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 105;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        subsamplingScaleImageViewDefaultOnStateChangedListener.onWarmupCompleted = str;
        int i5 = i2 + 117;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 9;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 83;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void IAuthTabCallbackStub(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStubProxy = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 85;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallbackStubProxy;
        int i4 = i2 + 53;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void IAuthTabCallbackDefault(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 33;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getInterfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 5;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull LoanFunnelType loanFunnelType) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 73;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loanFunnelType, "");
        this.onTransact = loanFunnelType;
        int i4 = ICustomTabsCallbackStubProxy + 61;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LoanFunnelType asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        LoanFunnelType loanFunnelType = this.onTransact;
        int i5 = i3 + 1;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return loanFunnelType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean z = false;
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 71;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 61;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        } else {
            z = zBooleanValue;
        }
        Object obj2 = null;
        if ((iIntValue & 2) != 0) {
            int i6 = ICustomTabsCallbackStubProxy + 75;
            onRelationshipValidationResult = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        subsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallback(z, str);
        int i8 = ICustomTabsCallbackStubProxy + 83;
        onRelationshipValidationResult = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallback(boolean z, @Nullable String str) {
        String strIAuthTabCallback;
        String strOnTransact;
        int i = 2 % 2;
        Object obj = null;
        if (z) {
            int i2 = onRelationshipValidationResult + 71;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                onPreviewReleased.SELF_BUSINESS.getCode();
                obj.hashCode();
                throw null;
            }
            strIAuthTabCallback = onPreviewReleased.SELF_BUSINESS.getCode();
        } else {
            strIAuthTabCallback = onCenterChanged.IAuthTabCallback.IAuthTabCallback("jobType");
            if (strIAuthTabCallback == null) {
                strIAuthTabCallback = onPreviewReleased.OFFICE_WORKER.getCode();
            }
        }
        this.access000 = strIAuthTabCallback;
        onCenterChanged oncenterchanged = onCenterChanged.IAuthTabCallback;
        this.IAuthTabCallbackStub = oncenterchanged.IAuthTabCallback("employeeType");
        this.onNavigationEvent = oncenterchanged.IAuthTabCallback("businessType");
        this.access100 = (Triple) onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -256290407, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 256290419, new Object[]{oncenterchanged, "joinDate"});
        this.ICustomTabsCallback = (Triple) onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -256290407, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 256290419, new Object[]{oncenterchanged, "openDate"});
        this.writeTypedObject = oncenterchanged.IAuthTabCallback("salary");
        this.asBinder = oncenterchanged.IAuthTabCallback("corporateName");
        this.asInterface = oncenterchanged.IAuthTabCallback("corporateNumber");
        this.IAuthTabCallback_Parcel = Intrinsics.areEqual(oncenterchanged.IAuthTabCallback("noIncome"), "true");
        boolean z2 = true;
        if (str == null || !(!StringsKt.isBlank(str))) {
            if (!((Boolean) onCenterChanged.onExtraCallbackWithResult(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -194589186, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 194589194, new Object[]{oncenterchanged})).booleanValue()) {
                z2 = false;
            }
        }
        this.IAuthTabCallbackDefault = z2;
        if (str == null) {
            int i3 = ICustomTabsCallbackStubProxy + 75;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            strOnTransact = z2 ? oncenterchanged.onTransact() : null;
        } else {
            strOnTransact = str;
        }
        this.onWarmupCompleted = strOnTransact;
        this.IAuthTabCallbackStubProxy = oncenterchanged.IAuthTabCallback("householderType");
        this.getInterfaceDescriptor = oncenterchanged.IAuthTabCallback("healthPayerType");
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Triple triple = (Triple) objArr[1];
        int i = 2 % 2;
        if (triple == null) {
            return null;
        }
        int i2 = onRelationshipValidationResult + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) triple.getFirst()).intValue() <= 0) {
            return null;
        }
        int i4 = onRelationshipValidationResult + 43;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
            if (((Number) triple.getSecond()).intValue() <= 0) {
                return null;
            }
        } else if (((Number) triple.getSecond()).intValue() <= 0) {
            return null;
        }
        if (((Number) triple.getThird()).intValue() <= 0) {
            return null;
        }
        Object first = triple.getFirst();
        String str = String.format("%02d", Arrays.copyOf(new Object[]{triple.getSecond()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = String.format("%02d", Arrays.copyOf(new Object[]{triple.getThird()}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return first + "-" + str + "-" + str2;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 113;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, this.access100};
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        if (i3 == 0) {
            return (String) onNavigationEvent(1139418869, -1139418869, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult2, objArr);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str;
        SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener = (SubsamplingScaleImageViewDefaultOnStateChangedListener) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 45;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = {subsamplingScaleImageViewDefaultOnStateChangedListener, subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback};
            str = (String) onNavigationEvent(1139418869, -1139418869, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr2);
            int i3 = 83 / 0;
        } else {
            Object[] objArr3 = {subsamplingScaleImageViewDefaultOnStateChangedListener, subsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallback};
            str = (String) onNavigationEvent(1139418869, -1139418869, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr3);
        }
        int i4 = ICustomTabsCallbackStubProxy + 47;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 59;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.asBinder = str;
        this.asInterface = str2;
        int i4 = ICustomTabsCallbackStubProxy + 85;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onRelationshipValidationResult;
            int i4 = i3 + 55;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 71;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        subsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNavigationEvent(boolean r5, boolean r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onRelationshipValidationResult
            int r2 = r1 + 55
            int r3 = r2 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L39
            r4.IAuthTabCallback_Parcel = r5
            r2 = 1
            if (r5 == r2) goto L15
            goto L2b
        L15:
            int r5 = r1 + 45
            int r2 = r5 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy = r2
            int r5 = r5 % r0
            if (r5 != 0) goto L25
            r5 = 13
            int r5 = r5 / 0
            if (r6 == 0) goto L2b
            goto L27
        L25:
            if (r6 == 0) goto L2b
        L27:
            r4.writeTypedObject = r3
            r4.access100 = r3
        L2b:
            int r1 = r1 + 101
            int r5 = r1 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L38
            r5 = 41
            int r5 = r5 / 0
        L38:
            return
        L39:
            r4.IAuthTabCallback_Parcel = r5
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onNavigationEvent(boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onRelationshipValidationResult
            int r1 = r1 + 69
            int r2 = r1 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy = r2
            int r1 = r1 % r0
            java.lang.String r2 = "healthPayerType"
            java.lang.String r3 = ""
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            r2 = 61
            int r2 = r2 / 0
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L3c
            goto L31
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
            if (r1 == 0) goto L3c
        L31:
            r4.getInterfaceDescriptor = r6
            int r1 = o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy
            int r1 = r1 + 29
            int r2 = r1 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onRelationshipValidationResult = r2
            int r1 = r1 % r0
        L3c:
            java.lang.String r1 = "householderType"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r5 == 0) goto L46
            r4.IAuthTabCallbackStubProxy = r6
        L46:
            int r5 = o.SubsamplingScaleImageViewDefaultOnStateChangedListener.ICustomTabsCallbackStubProxy
            int r5 = r5 + 31
            int r6 = r5 % 128
            o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onRelationshipValidationResult = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallbackWithResult(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12 onExtraCallback(@org.jetbrains.annotations.NotNull java.lang.String r33, @org.jetbrains.annotations.NotNull o.zzag r34, @org.jetbrains.annotations.NotNull java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnStateChangedListener.onExtraCallback(java.lang.String, o.zzag, java.lang.String):o.ImagePipelineExperimentsBuilderExternalSyntheticLambda12");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01be A[PHI: r0
      0x01be: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:40:0x01bc, B:37:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0 A[PHI: r0
      0x01c0: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:40:0x01bc, B:37:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r26, byte r27, int r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubsamplingScaleImageViewDefaultOnStateChangedListener.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    private final JsonObject IAuthTabCallback_Parcel(String str) {
        int i = 2 % 2;
        if (str != null) {
            JsonElement string = JsonParser.parseString(str);
            if (!string.isJsonNull()) {
                return string.getAsJsonObject();
            }
            JsonObject jsonObject = new JsonObject();
            int i2 = onRelationshipValidationResult + 55;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            return jsonObject;
        }
        int i4 = ICustomTabsCallbackStubProxy;
        int i5 = i4 + 45;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        int i7 = i4 + 111;
        onRelationshipValidationResult = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 43;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Result.Companion companion = Result.Companion;
                Pattern patternCompile = Pattern.compile("^[0-9]{2,3}[가-힣]{1}[0-9]{4}$");
                Intrinsics.checkNotNullExpressionValue(patternCompile, "");
                Matcher matcher = patternCompile.matcher(str);
                Intrinsics.checkNotNullExpressionValue(matcher, "");
                matcher.find();
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Result.Companion companion2 = Result.Companion;
            Pattern patternCompile2 = Pattern.compile("^[0-9]{2,3}[가-힣]{1}[0-9]{4}$");
            Intrinsics.checkNotNullExpressionValue(patternCompile2, "");
            Matcher matcher2 = patternCompile2.matcher(str);
            Intrinsics.checkNotNullExpressionValue(matcher2, "");
            boolean zFind = matcher2.find();
            int i3 = onRelationshipValidationResult + 111;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                return zFind;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            Object obj2 = Result.constructor-impl(ResultKt.createFailure(th));
            Throwable th2 = Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "matcher-validation", "Caused by java.util.regex.Matcher in LoanComparisonInputData", th2, (Map) null, 8, (Object) null);
                obj2 = Boolean.FALSE;
            }
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            int i4 = ICustomTabsCallbackStubProxy + 31;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }
    }

    public final boolean onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onActivityResized;
        if ((str != null && !StringsKt.isBlank(str)) || this.readTypedObject != null) {
            return true;
        }
        int i3 = ICustomTabsCallbackStubProxy + 53;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SubsamplingScaleImageViewDefaultOnStateChangedListener subsamplingScaleImageViewDefaultOnStateChangedListener, boolean z, String str, int i, Object obj) {
        Object[] objArr = {subsamplingScaleImageViewDefaultOnStateChangedListener, Boolean.valueOf(z), str, Integer.valueOf(i), obj};
        onNavigationEvent(-725178203, 725178209, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
    }

    private final String IAuthTabCallback(Triple<Integer, Integer, Integer> triple) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(1139418869, -1139418869, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, triple});
    }

    public final String onWarmupCompleted() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(2037626876, -2037626871, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
    }

    public final String asBinder() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(364069555, -364069548, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
    }

    public final String IAuthTabCallbackStubProxy() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(897511236, -897511227, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
    }

    public final String extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (String) onNavigationEvent(88269973, -88269971, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
    }

    public final void onWarmupCompleted(@Nullable String str) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onNavigationEvent(1439812487, -1439812479, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, str});
    }

    public final void onNavigationEvent(@Nullable String str) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onNavigationEvent(-1924183993, 1924183997, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, str});
    }

    public final void onNavigationEvent(@Nullable Triple<Integer, Integer, Integer> triple) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onNavigationEvent(345925429, -345925428, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, triple});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Object[] objArr = {this, parcel, Integer.valueOf(i)};
        onNavigationEvent(-996498612, 996498615, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr);
    }

    static void onMinimized() {
        onActivityLayout = -1719408583;
        onMessageChannelReady = -1538795496;
        onPostMessage = 67634889;
        onMinimized = new byte[]{8};
    }
}
