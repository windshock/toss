package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDoc implements Parcelable {
    private static final Lazy<KSerializer<Object>>[] $childSerializers;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final EDocIssuableCandidate.onNavigationEvent applyType;
    private final EDocButton button;
    private final long docCode;
    private final long docId;
    private final String docName;
    private final EDocStatus docStatus;
    private final String expireTs;
    private final String iconUrl;
    private final String receivedDateTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EDoc> CREATOR = new IAuthTabCallback();

    public static final class IAuthTabCallback implements Parcelable.Creator<EDoc> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDoc createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EDoc eDocOnWarmupCompleted = onWarmupCompleted(parcel);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            int i5 = onExtraCallback + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return eDocOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EDoc[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EDoc[] eDocArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 23 / 0;
            }
            int i6 = IAuthTabCallback + 13;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return eDocArrOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final EDoc[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 75;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            EDoc[] eDocArr = new EDoc[i];
            int i6 = i3 + 81;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return eDocArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final EDoc onWarmupCompleted(Parcel parcel) {
            EDocStatus eDocStatusValueOf;
            EDocIssuableCandidate.onNavigationEvent onnavigationeventValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            EDocButton eDocButtonCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 69;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                eDocStatusValueOf = null;
            } else {
                eDocStatusValueOf = EDocStatus.valueOf(parcel.readString());
            }
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 111;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 34 / 0;
                }
                onnavigationeventValueOf = null;
            } else {
                onnavigationeventValueOf = EDocIssuableCandidate.onNavigationEvent.valueOf(parcel.readString());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                eDocButtonCreateFromParcel = EDocButton.CREATOR.createFromParcel(parcel);
                int i6 = IAuthTabCallback + 97;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            return new EDoc(j, string, eDocStatusValueOf, string2, j2, onnavigationeventValueOf, string3, string4, eDocButtonCreateFromParcel);
        }
    }

    public EDoc() {
        this(0L, (String) null, (EDocStatus) null, (String) null, 0L, (EDocIssuableCandidate.onNavigationEvent) null, (String) null, (String) null, (EDocButton) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerAccess000 = access000();
        int i4 = onWarmupCompleted + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerAccess000;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.ApplyType", EDocIssuableCandidate.onNavigationEvent.values());
        int i4 = IAuthTabCallback + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    private static final /* synthetic */ KSerializer access000() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<EDocStatus> kSerializerSerializer = EDocStatus.Companion.serializer();
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i | i7);
        int i9 = i3 | i8;
        int i10 = ~i3;
        int i11 = i8 | (~(i7 | i10));
        int i12 = (~(i7 | i3)) | (~(i10 | i2));
        int i13 = i2 + i3 + i6 + (513088896 * i5) + ((-1342203445) * i4);
        int i14 = i13 * i13;
        int i15 = (665020156 * i2) + 661520384 + (1303681286 * i3) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i6) + ((-771751936) * i5) + (1382285312 * i4) + ((-350355456) * i14);
        int i16 = ((i2 * (-363642324)) - 614971735) + (i3 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i6 * (-363641803)) + (i5 * (-2127225984)) + (i4 * (-1080704249)) + (i14 * (-1523187712));
        int i17 = i15 + (i16 * i16 * (-227409920));
        if (i17 == 1) {
            EDoc eDoc = (EDoc) objArr[0];
            int i18 = 2 % 2;
            int i19 = IAuthTabCallback;
            int i20 = i19 + 45;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            long j = eDoc.docCode;
            int i22 = i19 + 47;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
            return Long.valueOf(j);
        }
        if (i17 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        EDoc eDoc2 = (EDoc) objArr[0];
        int i24 = 2 % 2;
        int i25 = IAuthTabCallback;
        int i26 = i25 + 71;
        onWarmupCompleted = i26 % 128;
        int i27 = i26 % 2;
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = eDoc2.applyType;
        int i28 = i25 + 19;
        onWarmupCompleted = i28 % 128;
        int i29 = i28 % 2;
        return onnavigationevent;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        int i4 = IAuthTabCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerIAuthTabCallback_Parcel;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof EDoc)) {
            int i4 = IAuthTabCallback + 35;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 == 0;
        }
        EDoc eDoc = (EDoc) obj;
        if (this.docId != eDoc.docId) {
            int i5 = IAuthTabCallback + 115;
            int i6 = i5 % 128;
            onWarmupCompleted = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 63;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.docName, eDoc.docName) || this.docStatus != eDoc.docStatus || !Intrinsics.areEqual(this.expireTs, eDoc.expireTs)) {
            return false;
        }
        if (this.docCode != eDoc.docCode) {
            int i9 = IAuthTabCallback + 105;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.applyType != eDoc.applyType) {
            return false;
        }
        if (Intrinsics.areEqual(this.receivedDateTime, eDoc.receivedDateTime)) {
            return Intrinsics.areEqual(this.iconUrl, eDoc.iconUrl) && Intrinsics.areEqual(this.button, eDoc.button);
        }
        int i11 = onWarmupCompleted + 17;
        IAuthTabCallback = i11 % 128;
        return i11 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Long.hashCode(this.docId);
        int iHashCode3 = this.docName.hashCode();
        EDocStatus eDocStatus = this.docStatus;
        int iHashCode4 = 0;
        if (eDocStatus == null) {
            int i2 = IAuthTabCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = eDocStatus.hashCode();
        }
        int iHashCode5 = this.expireTs.hashCode();
        int iHashCode6 = Long.hashCode(this.docCode);
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = this.applyType;
        int iHashCode7 = onnavigationevent == null ? 0 : onnavigationevent.hashCode();
        String str = this.receivedDateTime;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.iconUrl;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        EDocButton eDocButton = this.button;
        if (eDocButton != null) {
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = eDocButton.hashCode();
            int i6 = onWarmupCompleted + 121;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDoc(docId=" + this.docId + ", docName=" + this.docName + ", docStatus=" + this.docStatus + ", expireTs=" + this.expireTs + ", docCode=" + this.docCode + ", applyType=" + this.applyType + ", receivedDateTime=" + this.receivedDateTime + ", iconUrl=" + this.iconUrl + ", button=" + this.button + ")";
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.docId);
        parcel.writeString(this.docName);
        EDocStatus eDocStatus = this.docStatus;
        if (eDocStatus == null) {
            parcel.writeInt(0);
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeString(eDocStatus.name());
        }
        parcel.writeString(this.expireTs);
        parcel.writeLong(this.docCode);
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = this.applyType;
        if (onnavigationevent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(onnavigationevent.name());
            int i5 = IAuthTabCallback + 121;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        parcel.writeString(this.receivedDateTime);
        parcel.writeString(this.iconUrl);
        EDocButton eDocButton = this.button;
        if (eDocButton == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        eDocButton.writeToParcel(parcel, i);
        int i7 = onWarmupCompleted + 93;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 27 / 0;
        }
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDoc> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            EDoc$$serializer eDoc$$serializer = EDoc$$serializer.INSTANCE;
            if (i3 != 0) {
                int i4 = 8 / 0;
            }
            return eDoc$$serializer;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDoc$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                KSerializer kSerializerIAuthTabCallback = EDoc.IAuthTabCallback();
                int i4 = onExtraCallbackWithResult + 113;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return kSerializerIAuthTabCallback;
                }
                throw null;
            }
        }), null, null, LazyKt.onNavigationEvent(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.EDoc$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return EDoc.onNavigationEvent();
                }
                EDoc.onNavigationEvent();
                throw null;
            }
        }), null, null, null};
        int i = onExtraCallbackWithResult + 93;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ EDoc(int r10, long r11, java.lang.String r13, viva.republica.toss.network.model.electronicdocument.wallet.EDocStatus r14, java.lang.String r15, long r16, viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.onNavigationEvent r18, java.lang.String r19, java.lang.String r20, viva.republica.toss.network.model.electronicdocument.wallet.EDocButton r21, o.okycx r22) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r9.<init>()
            r2 = r1 & 1
            r3 = 0
            r5 = 2
            if (r2 != 0) goto Lf
            r0.docId = r3
            goto L14
        Lf:
            r6 = r11
            r0.docId = r6
            int r2 = r5 % r5
        L14:
            r2 = r1 & 2
            java.lang.String r6 = ""
            if (r2 != 0) goto L1d
            r0.docName = r6
            goto L2e
        L1d:
            r2 = r13
            r0.docName = r2
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback
            int r2 = r2 + 43
            int r7 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDoc.onWarmupCompleted = r7
            int r2 = r2 % r5
            if (r2 != 0) goto L2c
            goto L2e
        L2c:
            int r2 = r5 % r5
        L2e:
            r2 = r1 & 4
            r7 = 0
            if (r2 != 0) goto L42
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback
            int r2 = r2 + 123
            int r8 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDoc.onWarmupCompleted = r8
            int r2 = r2 % r5
            r0.docStatus = r7
            if (r2 == 0) goto L41
            goto L45
        L41:
            throw r7
        L42:
            r2 = r14
            r0.docStatus = r2
        L45:
            r2 = r1 & 8
            if (r2 != 0) goto L4c
            r0.expireTs = r6
            goto L51
        L4c:
            r2 = r15
            r0.expireTs = r2
            int r2 = r5 % r5
        L51:
            r2 = r1 & 16
            if (r2 != 0) goto L66
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback
            int r2 = r2 + 101
            int r6 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDoc.onWarmupCompleted = r6
            int r2 = r2 % r5
            if (r2 != 0) goto L63
            r2 = 1
            goto L68
        L63:
            r0.docCode = r3
            goto L6a
        L66:
            r2 = r16
        L68:
            r0.docCode = r2
        L6a:
            r2 = r1 & 32
            if (r2 != 0) goto L71
            r0.applyType = r7
            goto L75
        L71:
            r2 = r18
            r0.applyType = r2
        L75:
            r2 = r1 & 64
            if (r2 != 0) goto L7e
            r0.receivedDateTime = r7
            int r2 = r5 % r5
            goto L82
        L7e:
            r2 = r19
            r0.receivedDateTime = r2
        L82:
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 != 0) goto L9a
            int r2 = viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback
            int r2 = r2 + 95
            int r3 = r2 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDoc.onWarmupCompleted = r3
            int r2 = r2 % r5
            r0.iconUrl = r7
            int r3 = r3 + 45
            int r2 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback = r2
            int r3 = r3 % r5
            int r5 = r5 % r5
            goto L9e
        L9a:
            r2 = r20
            r0.iconUrl = r2
        L9e:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto La5
            r0.button = r7
            return
        La5:
            r1 = r21
            r0.button = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDoc.<init>(int, long, java.lang.String, viva.republica.toss.network.model.electronicdocument.wallet.EDocStatus, java.lang.String, long, viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$onNavigationEvent, java.lang.String, java.lang.String, viva.republica.toss.network.model.electronicdocument.wallet.EDocButton, o.okycx):void");
    }

    public EDoc(long j, @NotNull String str, @Nullable EDocStatus eDocStatus, @NotNull String str2, long j2, @Nullable EDocIssuableCandidate.onNavigationEvent onnavigationevent, @Nullable String str3, @Nullable String str4, @Nullable EDocButton eDocButton) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.docId = j;
        this.docName = str;
        this.docStatus = eDocStatus;
        this.expireTs = str2;
        this.docCode = j2;
        this.applyType = onnavigationevent;
        this.receivedDateTime = str3;
        this.iconUrl = str4;
        this.button = eDocButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDoc r10, o.vyl r11, kotlinx.serialization.descriptors.SerialDescriptor r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.EDoc.IAuthTabCallback(viva.republica.toss.network.model.electronicdocument.wallet.EDoc, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i2 + 71;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return lazyArr;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDoc(long j, String str, EDocStatus eDocStatus, String str2, long j2, EDocIssuableCandidate.onNavigationEvent onnavigationevent, String str3, String str4, EDocButton eDocButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        String str5;
        EDocStatus eDocStatus2;
        EDocIssuableCandidate.onNavigationEvent onnavigationevent2;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            j3 = 0;
        } else {
            j3 = j;
        }
        String str6 = "";
        EDocButton eDocButton2 = null;
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 63;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                eDocButton2.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i6 = IAuthTabCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            eDocStatus2 = null;
        } else {
            eDocStatus2 = eDocStatus;
        }
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
        } else {
            str6 = str2;
        }
        long j4 = (i & 16) == 0 ? j2 : 0L;
        if ((i & 32) != 0) {
            int i9 = 2 % 2;
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        String str7 = (i & 64) != 0 ? null : str3;
        String str8 = (i & 128) != 0 ? null : str4;
        if ((i & 256) != 0) {
            int i10 = 2 % 2;
        } else {
            eDocButton2 = eDocButton;
        }
        this(j3, str5, eDocStatus2, str6, j4, onnavigationevent2, str7, str8, eDocButton2);
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        long j = this.docId;
        int i5 = i2 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.docName;
        }
        throw null;
    }

    public final EDocStatus asBinder() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        EDocStatus eDocStatus = this.docStatus;
        int i5 = i3 + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return eDocStatus;
    }

    public final String IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expireTs;
        int i5 = i2 + 3;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        EDoc eDoc = (EDoc) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = eDoc.receivedDateTime;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public final String IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 83;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EDocButton onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EDocButton eDocButton = this.button;
        int i4 = i2 + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return eDocButton;
    }

    public final EDocIssuableCandidate.onNavigationEvent onWarmupCompleted() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (EDocIssuableCandidate.onNavigationEvent) onExtraCallbackWithResult(iOnNavigationEvent, new Object[]{this}, -1800436919, 1800436919, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2);
    }

    public final long asInterface() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Long) onExtraCallbackWithResult(iOnNavigationEvent, new Object[]{this}, -1269047320, 1269047321, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2)).longValue();
    }

    public final String getInterfaceDescriptor() {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (String) onExtraCallbackWithResult(iOnNavigationEvent, new Object[]{this}, 2111907460, -2111907458, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2);
    }
}
