package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.checkCanOpenLandingPage;
import o.liq;
import o.okycx;
import o.oty1;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocIssuableCandidate implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final onNavigationEvent applyType;
    private final String candidateName;
    private final List<Long> docCodeList;
    private final String iconUrl;
    private final String maintenanceMessage;
    private final Long packageId;
    private final String statusMessage;
    private final boolean underMaintenance;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EDocIssuableCandidate> CREATOR = new onExtraCallbackWithResult();

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<EDocIssuableCandidate> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocIssuableCandidate createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            EDocIssuableCandidate eDocIssuableCandidateOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onNavigationEvent + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return eDocIssuableCandidateOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDocIssuableCandidate[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                onWarmupCompleted(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EDocIssuableCandidate[] eDocIssuableCandidateArrOnWarmupCompleted = onWarmupCompleted(i);
            int i4 = onNavigationEvent + 65;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return eDocIssuableCandidateArrOnWarmupCompleted;
        }

        public final EDocIssuableCandidate onWarmupCompleted(Parcel parcel) {
            ArrayList arrayList;
            onNavigationEvent onnavigationeventValueOf;
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                int i4 = onNavigationEvent + 55;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onnavigationeventValueOf = null;
            } else {
                onnavigationeventValueOf = onNavigationEvent.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                int i6 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            EDocIssuableCandidate eDocIssuableCandidate = new EDocIssuableCandidate(string, arrayList, onnavigationeventValueOf, z, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
            int i8 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                return eDocIssuableCandidate;
            }
            throw null;
        }

        public final EDocIssuableCandidate[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            EDocIssuableCandidate[] eDocIssuableCandidateArr = new EDocIssuableCandidate[i];
            int i6 = i3 + 105;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return eDocIssuableCandidateArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public EDocIssuableCandidate() {
        this((String) null, (List) null, (onNavigationEvent) null, false, (String) null, (String) null, (Long) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i2 | i3);
        int i11 = i9 | i10 | (~(i2 | i5));
        int i12 = i8 | i2;
        int i13 = (~((~i5) | i2)) | i10;
        int i14 = i2 + i3 + i6 + (111814883 * i4) + (1975835455 * i);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i2) - 1583611904) + (47848387 * i3) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i4) + (1432616960 * i) + (442957824 * i15);
        int i17 = ((i2 * 961080817) - 60187382) + (i3 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i4 * 1618335983) + (i * 193609403) + (i15 * 1988296704);
        int i18 = i16 + (i17 * i17 * 176226304);
        return i18 != 1 ? i18 != 2 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return kSerializerIAuthTabCallbackStubProxy;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        checkCanOpenLandingPage checkcanopenlandingpage = new checkCanOpenLandingPage(oty1.onExtraCallback);
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return checkcanopenlandingpage;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.ApplyType", onNavigationEvent.values());
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 57 / 0;
        }
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess000 = access000();
        int i4 = onWarmupCompleted + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return kSerializerAccess000;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof EDocIssuableCandidate)) {
            int i7 = i2 + 77;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        EDocIssuableCandidate eDocIssuableCandidate = (EDocIssuableCandidate) obj;
        if (!Intrinsics.areEqual(this.candidateName, eDocIssuableCandidate.candidateName)) {
            int i9 = onNavigationEvent + 21;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.docCodeList, eDocIssuableCandidate.docCodeList)) {
            int i11 = onWarmupCompleted + 61;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.applyType != eDocIssuableCandidate.applyType) {
            int i13 = onNavigationEvent + 85;
            onWarmupCompleted = i13 % 128;
            return i13 % 2 == 0;
        }
        if (this.underMaintenance != eDocIssuableCandidate.underMaintenance || !Intrinsics.areEqual(this.maintenanceMessage, eDocIssuableCandidate.maintenanceMessage) || !Intrinsics.areEqual(this.statusMessage, eDocIssuableCandidate.statusMessage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.packageId, eDocIssuableCandidate.packageId)) {
            int i14 = onNavigationEvent + 81;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.iconUrl, eDocIssuableCandidate.iconUrl)) {
            return true;
        }
        int i16 = onNavigationEvent + 87;
        onWarmupCompleted = i16 % 128;
        return i16 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode5 = this.candidateName.hashCode();
        List<Long> list = this.docCodeList;
        if (list == null) {
            int i4 = onNavigationEvent + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        onNavigationEvent onnavigationevent = this.applyType;
        if (onnavigationevent == null) {
            int i6 = onWarmupCompleted + 43;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = onnavigationevent.hashCode();
        }
        int iHashCode6 = Boolean.hashCode(this.underMaintenance);
        String str = this.maintenanceMessage;
        if (str == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
            int i8 = onWarmupCompleted + 111;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 3;
            }
        }
        String str2 = this.statusMessage;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Long l = this.packageId;
        if (l == null) {
            iHashCode4 = 0;
        } else {
            iHashCode4 = l.hashCode();
            int i10 = onNavigationEvent + 85;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        String str3 = this.iconUrl;
        return (((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocIssuableCandidate(candidateName=" + this.candidateName + ", docCodeList=" + this.docCodeList + ", applyType=" + this.applyType + ", underMaintenance=" + this.underMaintenance + ", maintenanceMessage=" + this.maintenanceMessage + ", statusMessage=" + this.statusMessage + ", packageId=" + this.packageId + ", iconUrl=" + this.iconUrl + ")";
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.candidateName);
        List<Long> list = this.docCodeList;
        if (list == null) {
            int i3 = onWarmupCompleted + 91;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        onNavigationEvent onnavigationevent = this.applyType;
        if (onnavigationevent == null) {
            int i5 = onWarmupCompleted + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(onnavigationevent.name());
        }
        parcel.writeInt(this.underMaintenance ? 1 : 0);
        parcel.writeString(this.maintenanceMessage);
        parcel.writeString(this.statusMessage);
        Long l = this.packageId;
        if (l == null) {
            int i7 = onWarmupCompleted + 49;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.iconUrl);
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocIssuableCandidate> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocIssuableCandidate$$serializer eDocIssuableCandidate$$serializer = EDocIssuableCandidate$$serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 63 / 0;
            }
            return eDocIssuableCandidate$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 33;
                IAuthTabCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    EDocIssuableCandidate.IAuthTabCallback();
                    obj.hashCode();
                    throw null;
                }
                KSerializer kSerializerIAuthTabCallback = EDocIssuableCandidate.IAuthTabCallback();
                int i3 = IAuthTabCallback + 59;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        }), LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                KSerializer kSerializerOnExtraCallback;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    kSerializerOnExtraCallback = EDocIssuableCandidate.onExtraCallback();
                    int i3 = 19 / 0;
                } else {
                    kSerializerOnExtraCallback = EDocIssuableCandidate.onExtraCallback();
                }
                int i4 = onWarmupCompleted + 97;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return kSerializerOnExtraCallback;
            }
        }), null, null, null, null, null};
        int i = onExtraCallback + 95;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
    }

    public /* synthetic */ EDocIssuableCandidate(int i, String str, List list, onNavigationEvent onnavigationevent, boolean z, String str2, String str3, Long l, String str4, okycx okycxVar) {
        this.candidateName = (i & 1) == 0 ? "" : str;
        Object obj = null;
        if ((i & 2) == 0) {
            this.docCodeList = null;
        } else {
            this.docCodeList = list;
        }
        if ((i & 4) == 0) {
            this.applyType = null;
        } else {
            this.applyType = onnavigationevent;
        }
        if ((i & 8) == 0) {
            this.underMaintenance = false;
        } else {
            this.underMaintenance = z;
            int i2 = 2 % 2;
        }
        if ((i & 16) == 0) {
            this.maintenanceMessage = null;
        } else {
            this.maintenanceMessage = str2;
        }
        if ((i & 32) == 0) {
            int i3 = onWarmupCompleted + 53;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.statusMessage = null;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.statusMessage = str3;
            int i5 = onNavigationEvent + 99;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 2;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i & 64) == 0) {
            this.packageId = null;
            int i8 = 2 % 2;
        } else {
            this.packageId = l;
        }
        if ((i & 128) == 0) {
            this.iconUrl = null;
            return;
        }
        this.iconUrl = str4;
        int i9 = onNavigationEvent + 7;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 33 / 0;
        }
    }

    public EDocIssuableCandidate(@NotNull String str, @Nullable List<Long> list, @Nullable onNavigationEvent onnavigationevent, boolean z, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.candidateName = str;
        this.docCodeList = list;
        this.applyType = onnavigationevent;
        this.underMaintenance = z;
        this.maintenanceMessage = str2;
        this.statusMessage = str3;
        this.packageId = l;
        this.iconUrl = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate r6, o.vyl r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            lazyArr = $childSerializers;
            int i4 = 28 / 0;
        } else {
            lazyArr = $childSerializers;
        }
        int i5 = i3 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocIssuableCandidate(String str, List list, onNavigationEvent onnavigationevent, boolean z, String str2, String str3, Long l, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        onNavigationEvent onnavigationevent2;
        boolean z2;
        String str5;
        String str6;
        Long l2;
        String str7 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        if ((i & 8) != 0) {
            int i5 = onNavigationEvent + 77;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            int i7 = onNavigationEvent + 121;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i9 = i8 + 115;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 32) != 0) {
            int i12 = onNavigationEvent + 83;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 64) != 0) {
            int i14 = 2 % 2;
            l2 = null;
        } else {
            l2 = l;
        }
        this(str7, list2, onnavigationevent2, z2, str5, str6, l2, (i & 128) == 0 ? str4 : null);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        EDocIssuableCandidate eDocIssuableCandidate = (EDocIssuableCandidate) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        String str = eDocIssuableCandidate.candidateName;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<Long> asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.docCodeList;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        EDocIssuableCandidate eDocIssuableCandidate = (EDocIssuableCandidate) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent onnavigationevent = eDocIssuableCandidate.applyType;
        if (i4 == 0) {
            int i5 = 72 / 0;
        }
        int i6 = i2 + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return onnavigationevent;
    }

    public final boolean getInterfaceDescriptor() {
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            z = this.underMaintenance;
            int i4 = 76 / 0;
        } else {
            z = this.underMaintenance;
        }
        int i5 = i3 + 49;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String str = this.maintenanceMessage;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return str;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.statusMessage;
        }
        throw null;
    }

    public final Long asInterface() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.packageId;
        int i5 = i2 + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        throw null;
    }

    public final String onTransact() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.iconUrl;
            int i4 = 38 / 0;
        } else {
            str = this.iconUrl;
        }
        int i5 = i2 + 45;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        public static final onNavigationEvent NATIVE = new onNavigationEvent("NATIVE", 0);
        public static final onNavigationEvent GOV24 = new onNavigationEvent("GOV24", 1);
        public static final onNavigationEvent UNIV = new onNavigationEvent("UNIV", 2);
        public static final onNavigationEvent INTECH = new onNavigationEvent("INTECH", 3);
        public static final onNavigationEvent DIGITAL_ZONE = new onNavigationEvent("DIGITAL_ZONE", 4);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {NATIVE, GOV24, UNIV, INTECH, DIGITAL_ZONE};
            int i5 = i2 + 115;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
            }
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i3 + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onWarmupCompleted + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        private onNavigationEvent(String str, int i) {
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onNavigationEvent + 107;
            IAuthTabCallback = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (Lazy[]) IAuthTabCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1533836587, new Object[0], -1533836586, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2);
    }

    public final onNavigationEvent onNavigationEvent() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (onNavigationEvent) IAuthTabCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -474710285, new Object[]{this}, 474710287, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2);
    }

    public final String onWarmupCompleted() {
        int iIAuthTabCallback = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        int iIAuthTabCallback3 = ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback();
        return (String) IAuthTabCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 575392802, new Object[]{this}, -575392802, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2);
    }
}
