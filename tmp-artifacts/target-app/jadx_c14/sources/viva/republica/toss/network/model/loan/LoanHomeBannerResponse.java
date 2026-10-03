package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.tosssecurities.singlepage.earning_call.EarningCallComposeView$;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.loan.LoanHomeBannerResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LoanHomeBannerResponse implements Parcelable {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private final List<String> iconUrls;
    private final String landingUrl;
    private final String lowerText;
    private final String upperText;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LoanHomeBannerResponse> CREATOR = new onExtraCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.LoanHomeBannerResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke() {
            KSerializer kSerializerIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                kSerializerIAuthTabCallback = LoanHomeBannerResponse.IAuthTabCallback();
                int i3 = 36 / 0;
            } else {
                kSerializerIAuthTabCallback = LoanHomeBannerResponse.IAuthTabCallback();
            }
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerIAuthTabCallback;
        }
    }), null};

    public static final class onExtraCallback implements Parcelable.Creator<LoanHomeBannerResponse> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanHomeBannerResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeBannerResponse loanHomeBannerResponseOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            int i5 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return loanHomeBannerResponseOnNavigationEvent;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ LoanHomeBannerResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            LoanHomeBannerResponse[] loanHomeBannerResponseArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i5 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return loanHomeBannerResponseArrOnExtraCallbackWithResult;
        }

        public final LoanHomeBannerResponse[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 45;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            LoanHomeBannerResponse[] loanHomeBannerResponseArr = new LoanHomeBannerResponse[i];
            int i6 = i3 + 75;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return loanHomeBannerResponseArr;
        }

        public final LoanHomeBannerResponse onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LoanHomeBannerResponse loanHomeBannerResponse = new LoanHomeBannerResponse(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            int i2 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return loanHomeBannerResponse;
        }
    }

    public LoanHomeBannerResponse() {
        this((String) null, (String) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallbackStub;
        }
        throw null;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStub() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(getWriggleLayout.onNavigationEvent);
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = i7 | i4;
        int i9 = ~(i8 | i5);
        int i10 = (~i5) | (~((~i4) | i3));
        int i11 = (~(i5 | i4)) | (~(i7 | i5)) | (~i8);
        int i12 = i3 + i4 + i2 + ((-953487067) * i6) + ((-1992133889) * i);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i3) + 1765277696 + (1051104396 * i4) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i2) + ((-1703411712) * i6) + (1961361408 * i) + (907935744 * i13);
        int i15 = ((i3 * 272661978) - 2115615402) + (i4 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i2 * 272662391) + (i6 * 2077717299) + (i * 1957688713) + (i13 * 166854656);
        if (i14 + (i15 * i15 * (-213778432)) == 1) {
            return onNavigationEvent(objArr);
        }
        int i16 = 2 % 2;
        int i17 = onExtraCallbackWithResult + 17;
        int i18 = i17 % 128;
        IAuthTabCallback = i18;
        int i19 = i17 % 2;
        int i20 = i18 + 91;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanHomeBannerResponse)) {
            int i2 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LoanHomeBannerResponse loanHomeBannerResponse = (LoanHomeBannerResponse) obj;
        if (!Intrinsics.areEqual(this.upperText, loanHomeBannerResponse.upperText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lowerText, loanHomeBannerResponse.lowerText)) {
            int i4 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.iconUrls, loanHomeBannerResponse.iconUrls)) {
            return Intrinsics.areEqual(this.landingUrl, loanHomeBannerResponse.landingUrl);
        }
        int i6 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 97;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.upperText;
        if (str == null) {
            int i5 = i2 + 79;
            IAuthTabCallback = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((iHashCode * 31) + this.lowerText.hashCode()) * 31) + this.iconUrls.hashCode()) * 31) + this.landingUrl.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LoanHomeBannerResponse(upperText=" + this.upperText + ", lowerText=" + this.lowerText + ", iconUrls=" + this.iconUrls + ", landingUrl=" + this.landingUrl + ")";
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.upperText);
        parcel.writeString(this.lowerText);
        parcel.writeStringList(this.iconUrls);
        parcel.writeString(this.landingUrl);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoanHomeBannerResponse> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            LoanHomeBannerResponse$.serializer serializerVar = LoanHomeBannerResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 11 / 0;
            }
            return serializerVar;
        }
    }

    static {
        int i = onWarmupCompleted + 67;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ LoanHomeBannerResponse(int i, String str, String str2, List list, String str3, okycx okycxVar) {
        Object obj = null;
        this.upperText = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.lowerText = "";
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.lowerText = str2;
            int i4 = 2 % 2;
        }
        if ((i & 4) == 0) {
            this.iconUrls = CollectionsKt.emptyList();
        } else {
            this.iconUrls = list;
            int i5 = onExtraCallbackWithResult + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        if ((i & 8) != 0) {
            this.landingUrl = str3;
            return;
        }
        this.landingUrl = "";
        int i8 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public LoanHomeBannerResponse(@Nullable String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.upperText = str;
        this.lowerText = str2;
        this.iconUrls = list;
        this.landingUrl = str3;
    }

    public static final /* synthetic */ Lazy[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeBannerResponse r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse.$childSerializers
            r2 = 0
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            if (r3 != 0) goto L10
            java.lang.String r3 = r6.upperText
            if (r3 == 0) goto L17
        L10:
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r4 = r6.upperText
            r7.onExtraCallbackWithResult(r8, r2, r3, r4)
        L17:
            r2 = 1
            boolean r3 = r7.onWarmupCompleted(r8, r2)
            java.lang.String r4 = ""
            if (r3 != 0) goto L31
            int r3 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse.IAuthTabCallback
            int r3 = r3 + 27
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            java.lang.String r3 = r6.lowerText
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L3f
        L31:
            java.lang.String r3 = r6.lowerText
            r7.onExtraCallback(r8, r2, r3)
            int r3 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse.IAuthTabCallback
            int r3 = r3 + 55
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
        L3f:
            boolean r3 = r7.onWarmupCompleted(r8, r0)
            if (r3 != 0) goto L51
            java.util.List<java.lang.String> r3 = r6.iconUrls
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 == r2) goto L5e
        L51:
            r1 = r1[r0]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            java.util.List<java.lang.String> r3 = r6.iconUrls
            r7.onNavigationEvent(r8, r0, r1, r3)
        L5e:
            r1 = 3
            boolean r3 = r7.onWarmupCompleted(r8, r1)
            if (r3 != 0) goto L76
            int r3 = viva.republica.toss.network.model.loan.LoanHomeBannerResponse.IAuthTabCallback
            int r3 = r3 + 73
            int r5 = r3 % 128
            viva.republica.toss.network.model.loan.LoanHomeBannerResponse.onExtraCallbackWithResult = r5
            int r3 = r3 % r0
            java.lang.String r0 = r6.landingUrl
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r4)
            if (r0 == r2) goto L7b
        L76:
            java.lang.String r6 = r6.landingUrl
            r7.onExtraCallback(r8, r1, r6)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.LoanHomeBannerResponse.onWarmupCompleted(viva.republica.toss.network.model.loan.LoanHomeBannerResponse, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoanHomeBannerResponse(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            list = CollectionsKt.emptyList();
            int i9 = 2 % 2;
        }
        this(str, str2, list, (i & 8) != 0 ? "" : str3);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        LoanHomeBannerResponse loanHomeBannerResponse = (LoanHomeBannerResponse) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = loanHomeBannerResponse.upperText;
        int i5 = i2 + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.lowerText;
        }
        throw null;
    }

    public final List<String> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iconUrls;
        }
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.landingUrl;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return ((Integer) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 105513905, -105513905, new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent3)).intValue();
    }

    public final String asInterface() {
        int iOnNavigationEvent = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent2 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        int iOnNavigationEvent3 = EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent();
        return (String) onNavigationEvent(EarningCallComposeView$.ExternalSyntheticLambda11.onNavigationEvent(), iOnNavigationEvent2, 342045436, -342045435, new Object[]{this}, iOnNavigationEvent, iOnNavigationEvent3);
    }
}
