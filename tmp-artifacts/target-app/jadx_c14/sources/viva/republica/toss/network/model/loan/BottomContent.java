package viva.republica.toss.network.model.loan;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
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
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.checkCanOpenLandingPage;
import o.htf31;
import o.liq;
import o.okycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BottomContent implements Parcelable {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final LoanProductBadge badge;
    private final long clickLogId;
    private final String helpText;
    private final String iconUrl;
    private final long impressionLogId;
    private final String mainText;
    private final RemainingTimeInfo remainTimeInfo;
    private final String scheme;
    private final List<SubContent> subContents;
    private final String subText;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BottomContent> CREATOR = new onExtraCallback();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.loan.BottomContent$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = BottomContent.onExtraCallbackWithResult();
            int i4 = onWarmupCompleted + 69;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallbackWithResult;
            }
            throw null;
        }
    }), null, null, null};

    public static final class onExtraCallback implements Parcelable.Creator<BottomContent> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BottomContent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BottomContent bottomContentOnNavigationEvent = onNavigationEvent(parcel);
            int i4 = onNavigationEvent + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return bottomContentOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BottomContent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            BottomContent[] bottomContentArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 == 0) {
                int i5 = 23 / 0;
            }
            return bottomContentArrOnExtraCallbackWithResult;
        }

        public final BottomContent[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 57;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            BottomContent[] bottomContentArr = new BottomContent[i];
            int i6 = i4 + 37;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return bottomContentArr;
        }

        public final BottomContent onNavigationEvent(Parcel parcel) {
            LoanProductBadge loanProductBadgeCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = IAuthTabCallback + 73;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                loanProductBadgeCreateFromParcel = null;
            } else {
                loanProductBadgeCreateFromParcel = LoanProductBadge.CREATOR.createFromParcel(parcel);
            }
            LoanProductBadge loanProductBadge = loanProductBadgeCreateFromParcel;
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = IAuthTabCallback + 111;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            for (int i7 = 0; i7 != i4; i7++) {
                arrayList.add(SubContent.CREATOR.createFromParcel(parcel));
            }
            return new BottomContent(string, string2, string3, string4, string5, loanProductBadge, arrayList, parcel.readLong(), parcel.readLong(), parcel.readInt() != 0 ? RemainingTimeInfo.CREATOR.createFromParcel(parcel) : null);
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(SubContent$$serializer.INSTANCE);
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return checkcanopenlandingpage;
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
            int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent4 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent5 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent6 = RNSScreenManagerDelegate.onNavigationEvent();
        KSerializer kSerializer = (KSerializer) onWarmupCompleted(iOnNavigationEvent4, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent6, iOnNavigationEvent5, new Object[0], 2103200714, -2103200712);
        int i3 = onExtraCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 91 / 0;
        }
        return kSerializer;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i6 | i)) | i5;
        int i8 = i | i6 | i5;
        int i9 = ~i6;
        int i10 = i6 + i5 + i4 + ((-421447895) * i3) + ((-859425246) * i2);
        int i11 = i10 * i10;
        int i12 = (i6 * (-629045104)) + 1817116672 + ((-629045104) * i5) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i4) + ((-2125594624) * i3) + (888930304 * i2) + (441384960 * i11);
        int i13 = (i6 * 1303038832) + 2077918271 + (i5 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i4 * 1303038783) + (i3 * 1583617559) + (i2 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        return i14 != 1 ? i14 != 2 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onExtraCallback = i2 % 128;
        return 1 ^ (i2 % 2 != 0 ? 0 : 1);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomContent)) {
            return false;
        }
        BottomContent bottomContent = (BottomContent) obj;
        if (!Intrinsics.areEqual(this.iconUrl, bottomContent.iconUrl)) {
            int i2 = onExtraCallbackWithResult + 65;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mainText, bottomContent.mainText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subText, bottomContent.subText)) {
            int i4 = onExtraCallbackWithResult + 91;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.scheme, bottomContent.scheme)) {
            int i6 = onExtraCallbackWithResult + 5;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.helpText, bottomContent.helpText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.badge, bottomContent.badge)) {
            int i8 = onExtraCallbackWithResult + 61;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subContents, bottomContent.subContents)) {
            return false;
        }
        if (this.impressionLogId != bottomContent.impressionLogId) {
            int i10 = onExtraCallback + 51;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.clickLogId != bottomContent.clickLogId) {
            int i12 = onExtraCallbackWithResult + 7;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.remainTimeInfo, bottomContent.remainTimeInfo)) {
            return true;
        }
        int i14 = onExtraCallbackWithResult + 1;
        onExtraCallback = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.iconUrl.hashCode();
        int iHashCode3 = this.mainText.hashCode();
        String str = this.subText;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.scheme;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.helpText;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        LoanProductBadge loanProductBadge = this.badge;
        if (loanProductBadge == null) {
            int i2 = onExtraCallbackWithResult + 105;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = loanProductBadge.hashCode();
        }
        int iHashCode8 = this.subContents.hashCode();
        int iHashCode9 = Long.hashCode(this.impressionLogId);
        int iHashCode10 = Long.hashCode(this.clickLogId);
        RemainingTimeInfo remainingTimeInfo = this.remainTimeInfo;
        if (remainingTimeInfo != null) {
            int i4 = onExtraCallbackWithResult + 15;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = remainingTimeInfo.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BottomContent(iconUrl=" + this.iconUrl + ", mainText=" + this.mainText + ", subText=" + this.subText + ", scheme=" + this.scheme + ", helpText=" + this.helpText + ", badge=" + this.badge + ", subContents=" + this.subContents + ", impressionLogId=" + this.impressionLogId + ", clickLogId=" + this.clickLogId + ", remainTimeInfo=" + this.remainTimeInfo + ")";
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.mainText);
        parcel.writeString(this.subText);
        parcel.writeString(this.scheme);
        parcel.writeString(this.helpText);
        LoanProductBadge loanProductBadge = this.badge;
        if (loanProductBadge == null) {
            int i5 = onExtraCallback + 53;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loanProductBadge.writeToParcel(parcel, i);
        }
        List<SubContent> list = this.subContents;
        parcel.writeInt(list.size());
        Iterator<SubContent> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.impressionLogId);
        parcel.writeLong(this.clickLogId);
        RemainingTimeInfo remainingTimeInfo = this.remainTimeInfo;
        if (remainingTimeInfo != null) {
            parcel.writeInt(1);
            remainingTimeInfo.writeToParcel(parcel, i);
            return;
        }
        int i7 = onExtraCallback + 47;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(0);
        }
        int i8 = onExtraCallbackWithResult + 25;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BottomContent> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            BottomContent$$serializer bottomContent$$serializer = BottomContent$$serializer.INSTANCE;
            int i4 = onWarmupCompleted + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return bottomContent$$serializer;
        }
    }

    static {
        int i = onWarmupCompleted + 97;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ BottomContent(int i, String str, String str2, String str3, String str4, String str5, LoanProductBadge loanProductBadge, List list, long j, long j2, RemainingTimeInfo remainingTimeInfo, okycx okycxVar) {
        List listEmptyList;
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onExtraCallbackWithResult + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = BottomContent$$serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = BottomContent$$serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
        }
        this.iconUrl = str;
        this.mainText = str2;
        Object obj = null;
        if ((i & 4) == 0) {
            this.subText = null;
            int i4 = 2 % 2;
        } else {
            this.subText = str3;
        }
        if ((i & 8) == 0) {
            this.scheme = null;
        } else {
            this.scheme = str4;
        }
        if ((i & 16) == 0) {
            this.helpText = null;
        } else {
            this.helpText = str5;
        }
        if ((i & 32) == 0) {
            int i5 = onExtraCallbackWithResult + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.badge = null;
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
            int i7 = 2 % 2;
        } else {
            this.badge = loanProductBadge;
        }
        if ((i & 64) == 0) {
            int i8 = onExtraCallbackWithResult + 67;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                this.subContents = CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        this.subContents = listEmptyList;
        int i9 = 2 % 2;
        if ((i & 128) == 0) {
            int i10 = onExtraCallback + 47;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.impressionLogId = -1L;
        } else {
            this.impressionLogId = j;
        }
        if ((i & 256) == 0) {
            this.clickLogId = -1L;
            int i12 = onExtraCallback + 23;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            this.clickLogId = j2;
        }
        if ((i & 512) != 0) {
            this.remainTimeInfo = remainingTimeInfo;
            return;
        }
        int i15 = onExtraCallback + 55;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        this.remainTimeInfo = null;
        if (i16 == 0) {
            int i17 = 72 / 0;
        }
    }

    public BottomContent(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable LoanProductBadge loanProductBadge, @NotNull List<SubContent> list, long j, long j2, @Nullable RemainingTimeInfo remainingTimeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.iconUrl = str;
        this.mainText = str2;
        this.subText = str3;
        this.scheme = str4;
        this.helpText = str5;
        this.badge = loanProductBadge;
        this.subContents = list;
        this.impressionLogId = j;
        this.clickLogId = j2;
        this.remainTimeInfo = remainingTimeInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(viva.republica.toss.network.model.loan.BottomContent r9, o.vyl r10, kotlinx.serialization.descriptors.SerialDescriptor r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.loan.BottomContent.onExtraCallbackWithResult(viva.republica.toss.network.model.loan.BottomContent, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.mainText;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subText;
        int i5 = i2 + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 71;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.scheme;
        int i5 = i2 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.helpText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LoanProductBadge onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        LoanProductBadge loanProductBadge = this.badge;
        int i4 = i2 + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return loanProductBadge;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BottomContent bottomContent = (BottomContent) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        List<SubContent> list = bottomContent.subContents;
        int i5 = i3 + 3;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.impressionLogId;
        }
        int i3 = 88 / 0;
        return this.impressionLogId;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BottomContent bottomContent = (BottomContent) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            long j = bottomContent.clickLogId;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = bottomContent.clickLogId;
        int i4 = i2 + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final RemainingTimeInfo asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RemainingTimeInfo remainingTimeInfo = this.remainTimeInfo;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        return remainingTimeInfo;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (KSerializer) onWarmupCompleted(iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[0], 2103200714, -2103200712);
    }

    public final long IAuthTabCallback() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return ((Long) onWarmupCompleted(iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -1488658494, 1488658495)).longValue();
    }

    public final List<SubContent> access000() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
        return (List) onWarmupCompleted(iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, new Object[]{this}, -378705727, 378705727);
    }
}
