package viva.republica.toss.network.model.loan;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TrackGroupExternalSyntheticLambda0;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$$ExternalSyntheticLambda2;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RefinancingResultResponse implements Parcelable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    public static final Parcelable.Creator<RefinancingResultResponse> CREATOR;
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("amount")
    private final long amount;

    @SerializedName("badges")
    private final List<LoanRefinancingBadge> badges;

    @SerializedName("bottomInformation")
    private final BottomInformation bottomInformation;

    @SerializedName("companyName")
    private final String companyName;

    @SerializedName("guaranteeOrg")
    private final String guaranteeOrg;

    @SerializedName("id")
    private final long id;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("loanProductId")
    private final String loanProductId;

    @SerializedName("loanReqNo")
    private final String loanReqNo;

    @SerializedName("logoFillImageUrl")
    private final String logoFillImageUrl;

    @SerializedName("logoImageUrl")
    private final String logoImageUrl;

    @SerializedName("period")
    private final int period;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("requestInformation")
    private final String requestInformation;

    @SerializedName("rightBadge")
    private final LoanProductBadge rightBadge;

    @SerializedName("sortInterestRate")
    private final Float sortInterestRate;

    @SerializedName("status")
    private final String status;

    @SerializedName("statusName")
    private final String statusName;

    public static final class Creator implements Parcelable.Creator<RefinancingResultResponse> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingResultResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(parcel);
                obj.hashCode();
                throw null;
            }
            RefinancingResultResponse refinancingResultResponseOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return refinancingResultResponseOnExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RefinancingResultResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            RefinancingResultResponse[] refinancingResultResponseArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return refinancingResultResponseArrOnWarmupCompleted;
        }

        public final RefinancingResultResponse onExtraCallbackWithResult(Parcel parcel) {
            Float fValueOf;
            BottomInformation bottomInformation;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f = parcel.readFloat();
            if (parcel.readInt() == 0) {
                int i2 = onNavigationEvent + 63;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            LoanProductBadge loanProductBadgeCreateFromParcel = parcel.readInt() == 0 ? null : LoanProductBadge.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i5 = onNavigationEvent + 57;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                bottomInformation = null;
            } else {
                BottomInformation bottomInformationCreateFromParcel = BottomInformation.CREATOR.createFromParcel(parcel);
                int i7 = onNavigationEvent + 35;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                bottomInformation = bottomInformationCreateFromParcel;
            }
            BottomInformation bottomInformation2 = bottomInformation;
            int i9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i9);
            int i10 = 0;
            while (i10 != i9) {
                arrayList.add(LoanRefinancingBadge.CREATOR.createFromParcel(parcel));
                i10++;
                i9 = i9;
            }
            return new RefinancingResultResponse(j, j2, string, string2, f, fValueOf, string3, string4, i4, string5, string6, loanProductBadgeCreateFromParcel, string7, string8, string9, string10, bottomInformation2, arrayList);
        }

        public final RefinancingResultResponse[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 99;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            RefinancingResultResponse[] refinancingResultResponseArr = new RefinancingResultResponse[i];
            if (i3 % 2 == 0) {
                int i5 = 93 / 0;
            }
            int i6 = i4 + 43;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return refinancingResultResponseArr;
        }
    }

    public RefinancingResultResponse() {
        this(0L, 0L, (String) null, (String) null, 0.0f, (Float) null, (String) null, (String) null, 0, (String) null, (String) null, (LoanProductBadge) null, (String) null, (String) null, (String) null, (String) null, (BottomInformation) null, (List) null, 262143, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnPostMessage = onPostMessage();
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return kSerializerOnPostMessage;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i2) | i);
        int i8 = (~((~i) | (~i6))) | i7;
        int i9 = i | i6;
        int i10 = i + i6 + i4 + ((-39394691) * i3) + ((-2104995841) * i5);
        int i11 = i10 * i10;
        int i12 = (i * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i4) + ((-1529085952) * i3) + ((-319553536) * i5) + ((-289079296) * i11);
        int i13 = ((i * 1773844906) - 1404835566) + (i6 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i4 * 1773845519) + (i3 * 1055723859) + (i5 * 1996616689) + (i11 * (-1450508288));
        int i14 = i12 + (i13 * i13 * (-778371072));
        if (i14 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i14 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i14 != 3) {
            RefinancingResultResponse refinancingResultResponse = (RefinancingResultResponse) objArr[0];
            int i15 = 2 % 2;
            int i16 = onNavigationEvent + 113;
            int i17 = i16 % 128;
            IAuthTabCallback = i17;
            int i18 = i16 % 2;
            String str = refinancingResultResponse.loanProductId;
            int i19 = i17 + 45;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }
        RefinancingResultResponse refinancingResultResponse2 = (RefinancingResultResponse) objArr[0];
        int i21 = 2 % 2;
        int i22 = IAuthTabCallback;
        int i23 = i22 + 31;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        String str2 = refinancingResultResponse2.logoImageUrl;
        int i25 = i22 + 59;
        onNavigationEvent = i25 % 128;
        int i26 = i25 % 2;
        return str2;
    }

    private static final /* synthetic */ KSerializer onPostMessage() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(LoanRefinancingBadge$$serializer.INSTANCE);
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(!(obj instanceof RefinancingResultResponse))) {
            RefinancingResultResponse refinancingResultResponse = (RefinancingResultResponse) obj;
            if (this.id != refinancingResultResponse.id) {
                return false;
            }
            if (this.amount != refinancingResultResponse.amount) {
                int i3 = onNavigationEvent + 111;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if ((!Intrinsics.areEqual(this.companyName, refinancingResultResponse.companyName)) || !Intrinsics.areEqual(this.guaranteeOrg, refinancingResultResponse.guaranteeOrg) || Float.compare(this.interestRate, refinancingResultResponse.interestRate) != 0 || !Intrinsics.areEqual(this.sortInterestRate, refinancingResultResponse.sortInterestRate) || !Intrinsics.areEqual(this.logoImageUrl, refinancingResultResponse.logoImageUrl)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.logoFillImageUrl, refinancingResultResponse.logoFillImageUrl)) {
                int i4 = onNavigationEvent + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (this.period != refinancingResultResponse.period) {
                int i6 = onNavigationEvent + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.loanProductId, refinancingResultResponse.loanProductId) || !Intrinsics.areEqual(this.loanReqNo, refinancingResultResponse.loanReqNo) || (!Intrinsics.areEqual(this.rightBadge, refinancingResultResponse.rightBadge)) || !Intrinsics.areEqual(this.productName, refinancingResultResponse.productName)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.requestInformation, refinancingResultResponse.requestInformation))) {
                if (!Intrinsics.areEqual(this.status, refinancingResultResponse.status)) {
                    int i8 = IAuthTabCallback + 33;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.statusName, refinancingResultResponse.statusName)) {
                    return Intrinsics.areEqual(this.bottomInformation, refinancingResultResponse.bottomInformation) && Intrinsics.areEqual(this.badges, refinancingResultResponse.badges);
                }
                int i10 = onNavigationEvent + 15;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            int i12 = onNavigationEvent + 87;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.id);
        int iHashCode4 = Long.hashCode(this.amount);
        int iHashCode5 = this.companyName.hashCode();
        int iHashCode6 = this.guaranteeOrg.hashCode();
        int iHashCode7 = Float.hashCode(this.interestRate);
        Float f = this.sortInterestRate;
        if (f == null) {
            int i2 = IAuthTabCallback + 103;
            onNavigationEvent = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = f.hashCode();
        }
        int iHashCode8 = this.logoImageUrl.hashCode();
        int iHashCode9 = this.logoFillImageUrl.hashCode();
        int iHashCode10 = Integer.hashCode(this.period);
        int iHashCode11 = this.loanProductId.hashCode();
        int iHashCode12 = this.loanReqNo.hashCode();
        LoanProductBadge loanProductBadge = this.rightBadge;
        if (loanProductBadge == null) {
            int i3 = onNavigationEvent + 49;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = loanProductBadge.hashCode();
            int i5 = IAuthTabCallback + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        int iHashCode13 = this.productName.hashCode();
        int iHashCode14 = this.requestInformation.hashCode();
        int iHashCode15 = this.status.hashCode();
        int iHashCode16 = this.statusName.hashCode();
        BottomInformation bottomInformation = this.bottomInformation;
        return (((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (bottomInformation != null ? bottomInformation.hashCode() : 0)) * 31) + this.badges.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RefinancingResultResponse(id=" + this.id + ", amount=" + this.amount + ", companyName=" + this.companyName + ", guaranteeOrg=" + this.guaranteeOrg + ", interestRate=" + this.interestRate + ", sortInterestRate=" + this.sortInterestRate + ", logoImageUrl=" + this.logoImageUrl + ", logoFillImageUrl=" + this.logoFillImageUrl + ", period=" + this.period + ", loanProductId=" + this.loanProductId + ", loanReqNo=" + this.loanReqNo + ", rightBadge=" + this.rightBadge + ", productName=" + this.productName + ", requestInformation=" + this.requestInformation + ", status=" + this.status + ", statusName=" + this.statusName + ", bottomInformation=" + this.bottomInformation + ", badges=" + this.badges + ")";
        int i2 = onNavigationEvent + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeLong(this.amount);
        parcel.writeString(this.companyName);
        parcel.writeString(this.guaranteeOrg);
        parcel.writeFloat(this.interestRate);
        Float f = this.sortInterestRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
            int i3 = onNavigationEvent + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        parcel.writeString(this.logoImageUrl);
        parcel.writeString(this.logoFillImageUrl);
        parcel.writeInt(this.period);
        parcel.writeString(this.loanProductId);
        parcel.writeString(this.loanReqNo);
        LoanProductBadge loanProductBadge = this.rightBadge;
        if (loanProductBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loanProductBadge.writeToParcel(parcel, i);
        }
        parcel.writeString(this.productName);
        parcel.writeString(this.requestInformation);
        parcel.writeString(this.status);
        parcel.writeString(this.statusName);
        BottomInformation bottomInformation = this.bottomInformation;
        if (bottomInformation == null) {
            int i5 = onNavigationEvent + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomInformation.writeToParcel(parcel, i);
        }
        List<LoanRefinancingBadge> list = this.badges;
        parcel.writeInt(list.size());
        Iterator<LoanRefinancingBadge> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
            int i7 = onNavigationEvent + 59;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RefinancingResultResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 1;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            RefinancingResultResponse$$serializer refinancingResultResponse$$serializer = RefinancingResultResponse$$serializer.INSTANCE;
            if (i3 == 0) {
                return refinancingResultResponse$$serializer;
            }
            throw null;
        }
    }

    static {
        onActivityResized();
        Companion = new Companion(null);
        CREATOR = new Creator();
        $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.RefinancingResultResponse$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerOnExtraCallback = RefinancingResultResponse.onExtraCallback();
                int i4 = onNavigationEvent + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        })};
        int i = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ RefinancingResultResponse(int i, long j, long j2, String str, String str2, float f, Float f2, String str3, String str4, int i2, String str5, String str6, LoanProductBadge loanProductBadge, String str7, String str8, String str9, String str10, BottomInformation bottomInformation, List list, okycx okycxVar) throws Throwable {
        String strIntern;
        List listEmptyList;
        if ((i & 1) == 0) {
            this.id = 0L;
            int i3 = 2 % 2;
        } else {
            this.id = j;
        }
        if ((i & 2) == 0) {
            this.amount = 0L;
        } else {
            this.amount = j2;
        }
        Object obj = null;
        if ((i & 4) == 0) {
            int i4 = IAuthTabCallback + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.companyName = "";
            if (i5 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.companyName = str;
        }
        if ((i & 8) == 0) {
            this.guaranteeOrg = "";
        } else {
            this.guaranteeOrg = str2;
        }
        this.interestRate = (i & 16) == 0 ? 0.0f : f;
        if ((i & 32) == 0) {
            this.sortInterestRate = null;
        } else {
            this.sortInterestRate = f2;
            int i6 = onNavigationEvent + 113;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.logoImageUrl = "";
        } else {
            this.logoImageUrl = str3;
        }
        if ((i & 128) == 0) {
            int i9 = IAuthTabCallback + 125;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            this.logoFillImageUrl = "";
        } else {
            this.logoFillImageUrl = str4;
        }
        if ((i & 256) == 0) {
            this.period = 0;
        } else {
            this.period = i2;
            int i11 = 2 % 2;
        }
        if ((i & 512) == 0) {
            int i12 = IAuthTabCallback + 41;
            onNavigationEvent = i12 % 128;
            int i13 = i12 % 2;
            this.loanProductId = "";
        } else {
            this.loanProductId = str5;
        }
        if ((i & 1024) == 0) {
            this.loanReqNo = "";
        } else {
            this.loanReqNo = str6;
            int i14 = onNavigationEvent + 51;
            IAuthTabCallback = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
        }
        if ((i & 2048) == 0) {
            int i17 = IAuthTabCallback + 29;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            this.rightBadge = null;
        } else {
            this.rightBadge = loanProductBadge;
        }
        if ((i & 4096) == 0) {
            int i19 = IAuthTabCallback + 15;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            this.productName = "";
        } else {
            this.productName = str7;
        }
        if ((i & 8192) == 0) {
            this.requestInformation = "";
        } else {
            this.requestInformation = str8;
        }
        if ((i & 16384) != 0) {
            int i21 = 2 % 2;
            strIntern = str9;
        } else {
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        this.status = strIntern;
        if ((32768 & i) == 0) {
            this.statusName = "";
        } else {
            this.statusName = str10;
        }
        if ((65536 & i) == 0) {
            this.bottomInformation = null;
        } else {
            this.bottomInformation = bottomInformation;
        }
        if ((i & 131072) == 0) {
            int i22 = IAuthTabCallback + 53;
            onNavigationEvent = i22 % 128;
            if (i22 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        this.badges = listEmptyList;
    }

    public RefinancingResultResponse(long j, long j2, @NotNull String str, @NotNull String str2, float f, @Nullable Float f2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, @Nullable LoanProductBadge loanProductBadge, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @Nullable BottomInformation bottomInformation, @NotNull List<LoanRefinancingBadge> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = j;
        this.amount = j2;
        this.companyName = str;
        this.guaranteeOrg = str2;
        this.interestRate = f;
        this.sortInterestRate = f2;
        this.logoImageUrl = str3;
        this.logoFillImageUrl = str4;
        this.period = i;
        this.loanProductId = str5;
        this.loanReqNo = str6;
        this.rightBadge = loanProductBadge;
        this.productName = str7;
        this.requestInformation = str8;
        this.status = str9;
        this.statusName = str10;
        this.bottomInformation = bottomInformation;
        this.badges = list;
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            int i4 = 23 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 63;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onNavigationEvent(viva.republica.toss.network.model.loan.RefinancingResultResponse r11, o.vyl r12, kotlinx.serialization.descriptors.SerialDescriptor r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.RefinancingResultResponse.onNavigationEvent(viva.republica.toss.network.model.loan.RefinancingResultResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RefinancingResultResponse(long j, long j2, String str, String str2, float f, Float f2, String str3, String str4, int i, String str5, String str6, LoanProductBadge loanProductBadge, String str7, String str8, String str9, String str10, BottomInformation bottomInformation, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) throws Throwable {
        long j3;
        String str11;
        Float f3;
        String str12;
        LoanProductBadge loanProductBadge2;
        LoanProductBadge loanProductBadge3;
        String str13;
        String str14;
        String strIntern;
        int i3;
        BottomInformation bottomInformation2;
        BottomInformation bottomInformation3;
        List listEmptyList;
        if ((i2 & 1) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 111;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        long j4 = (i2 & 2) == 0 ? j2 : 0L;
        String str15 = (i2 & 4) != 0 ? "" : str;
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i10 = IAuthTabCallback + 105;
            onNavigationEvent = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str11 = "";
        } else {
            str11 = str2;
        }
        float f4 = (i2 & 16) != 0 ? 0.0f : f;
        if ((i2 & 32) != 0) {
            int i11 = onNavigationEvent + 89;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 54 / 0;
            }
            int i13 = 2 % 2;
            f3 = null;
        } else {
            f3 = f2;
        }
        String str16 = (i2 & 64) != 0 ? "" : str3;
        String str17 = (i2 & 128) != 0 ? "" : str4;
        int i14 = (i2 & 256) != 0 ? 0 : i;
        String str18 = (i2 & 512) != 0 ? "" : str5;
        String str19 = (i2 & 1024) != 0 ? "" : str6;
        if ((i2 & 2048) != 0) {
            int i15 = IAuthTabCallback + 81;
            str12 = "";
            onNavigationEvent = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 38 / 0;
            }
            loanProductBadge2 = null;
        } else {
            str12 = "";
            loanProductBadge2 = loanProductBadge;
        }
        String str20 = (i2 & 4096) != 0 ? str12 : str7;
        String str21 = (i2 & 8192) != 0 ? str12 : str8;
        if ((i2 & 16384) != 0) {
            loanProductBadge3 = loanProductBadge2;
            str14 = str19;
            str13 = str18;
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 0, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
            strIntern = ((String) objArr[0]).intern();
        } else {
            loanProductBadge3 = loanProductBadge2;
            str13 = str18;
            str14 = str19;
            strIntern = str9;
        }
        String str22 = (32768 & i2) != 0 ? str12 : str10;
        if ((65536 & i2) != 0) {
            i3 = 2;
            int i17 = 2 % 2;
            bottomInformation2 = null;
        } else {
            i3 = 2;
            bottomInformation2 = bottomInformation;
        }
        if ((i2 & 131072) != 0) {
            int i18 = onNavigationEvent + 89;
            bottomInformation3 = bottomInformation2;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % i3;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            bottomInformation3 = bottomInformation2;
            listEmptyList = list;
        }
        this(j3, j4, str15, str11, f4, f3, str16, str17, i14, str13, str14, loanProductBadge3, str20, str21, strIntern, str22, bottomInformation3, listEmptyList);
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.id;
        int i4 = i3 + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RefinancingResultResponse refinancingResultResponse = (RefinancingResultResponse) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Long.valueOf(refinancingResultResponse.amount);
        }
        long j = refinancingResultResponse.amount;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.companyName;
        int i5 = i3 + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.guaranteeOrg;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RefinancingResultResponse refinancingResultResponse = (RefinancingResultResponse) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        float f = refinancingResultResponse.interestRate;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float readTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 15;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Float f = this.sortInterestRate;
        int i4 = i2 + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logoFillImageUrl;
        int i5 = i2 + 61;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getInterfaceDescriptor() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            i = this.period;
            int i5 = 31 / 0;
        } else {
            i = this.period;
        }
        int i6 = i4 + 29;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.loanReqNo;
        int i5 = i3 + 17;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LoanProductBadge writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rightBadge;
        }
        throw null;
    }

    public final String access000() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String extraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestInformation;
        int i5 = i2 + 77;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusName;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BottomInformation onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        BottomInformation bottomInformation = this.bottomInformation;
        int i5 = i3 + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return bottomInformation;
    }

    public final List<LoanRefinancingBadge> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        List<LoanRefinancingBadge> list = this.badges;
        int i5 = i3 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final LoanProductStatus ICustomTabsCallback() {
        Object next;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = LoanProductStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((LoanProductStatus) next).name(), this.status)) {
                break;
            }
        }
        LoanProductStatus loanProductStatus = (LoanProductStatus) next;
        if (loanProductStatus != null) {
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return loanProductStatus;
        }
        int i6 = onNavigationEvent + 33;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        LoanProductStatus loanProductStatus2 = LoanProductStatus.UNKNOWN;
        if (i7 == 0) {
            int i8 = 91 / 0;
        }
        return loanProductStatus2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = onExtraCallback;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 53;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35283), View.MeasureSpec.makeMeasureSpec(0, 0) + 35, 14240 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $10 + 109;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Drawable.resolveOpacity(0, 0)), 64 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSizeAndState(0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        int i12 = $11 + 73;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.alpha(0)), 70 - TextUtils.getTrimmedLength(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i16 = $11 + 9;
                $10 = i16 % 128;
                int i17 = i16 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final long onNavigationEvent() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Long) onExtraCallbackWithResult(325083828, iOnWarmupCompleted, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), -325083826)).longValue();
    }

    public final float asInterface() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return ((Float) onExtraCallbackWithResult(-1790084903, iOnWarmupCompleted, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 1790084904)).floatValue();
    }

    public final String onTransact() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(-563238051, iOnWarmupCompleted, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 563238051);
    }

    public final String IAuthTabCallback_Parcel() {
        int iOnWarmupCompleted = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(-347050711, iOnWarmupCompleted, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{this}, iOnWarmupCompleted2, NotificationSettingAdapter$$ExternalSyntheticLambda2.onWarmupCompleted(), 347050714);
    }

    static void onActivityResized() {
        onExtraCallback = new char[]{27241, 27164, 27165, 27136, 27138, 27138, 27167};
    }
}
