package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import o.TombstoneProtosMemoryMappingBuilder;
import o.liq;
import o.okycx;
import o.updateRenderInfoForVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DocumentWalletConfigDoc implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final EDocIssuableCandidate.onNavigationEvent applyType;
    private final long docCode;
    private final String docName;
    private final Long existDocId;
    private final boolean hidden;
    private final boolean isPrepare;
    private int rank;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DocumentWalletConfigDoc> CREATOR = new onExtraCallbackWithResult();
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallbackWithResult = DocumentWalletConfigDoc.onExtraCallbackWithResult();
            int i4 = IAuthTabCallback + 119;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallbackWithResult;
        }
    }), null, null};

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<DocumentWalletConfigDoc> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final DocumentWalletConfigDoc IAuthTabCallback(Parcel parcel) {
            Long lValueOf;
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            String string = parcel.readString();
            EDocIssuableCandidate.onNavigationEvent onnavigationeventValueOf = null;
            if (parcel.readInt() == 0) {
                int i2 = onExtraCallback + 105;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                int i3 = onExtraCallback + 117;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                int i5 = IAuthTabCallback + 75;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                onnavigationeventValueOf = EDocIssuableCandidate.onNavigationEvent.valueOf(parcel.readString());
            }
            EDocIssuableCandidate.onNavigationEvent onnavigationevent = onnavigationeventValueOf;
            if (parcel.readInt() == 0) {
                int i7 = IAuthTabCallback + 21;
                onExtraCallback = i7 % 128;
                z2 = i7 % 2 != 0;
            } else {
                z2 = true;
            }
            return new DocumentWalletConfigDoc(j, string, lValueOf, z, onnavigationevent, z2);
        }

        public final DocumentWalletConfigDoc[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 81;
            onExtraCallback = i3 % 128;
            DocumentWalletConfigDoc[] documentWalletConfigDocArr = new DocumentWalletConfigDoc[i];
            if (i3 % 2 != 0) {
                int i4 = 90 / 0;
            }
            return documentWalletConfigDocArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletConfigDoc createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletConfigDoc documentWalletConfigDocIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallback + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return documentWalletConfigDocIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ DocumentWalletConfigDoc[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 103;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(i);
            }
            IAuthTabCallback(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public DocumentWalletConfigDoc() {
        this(0L, null, null, false, null, false, 63, null);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.ApplyType", EDocIssuableCandidate.onNavigationEvent.values());
        }
        int i3 = 62 / 0;
        return updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate.ApplyType", EDocIssuableCandidate.onNavigationEvent.values());
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3 | i);
        int i9 = (~((~i) | i3)) | (~(i3 | i5));
        int i10 = i3 + i5 + i4 + (32217706 * i2) + (238734613 * i6);
        int i11 = i10 * i10;
        int i12 = (((-3446596) * i3) - 528416768) + (677943110 * i5) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i4) + ((-154927104) * i2) + ((-131989504) * i6) + ((-1876361216) * i11);
        int i13 = ((i3 * 1127137324) - 440746823) + (i5 * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i4 * 1127136485) + (i2 * 976419026) + (i6 * 1106960329) + (i11 * 279773184);
        return i12 + ((i13 * i13) * (-1943076864)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        KSerializer kSerializer = (KSerializer) onExtraCallbackWithResult(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -470250741, new Object[0], iOnExtraCallback2, 470250742, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = onExtraCallback + 75;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return kSerializer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentWalletConfigDoc)) {
            return false;
        }
        DocumentWalletConfigDoc documentWalletConfigDoc = (DocumentWalletConfigDoc) obj;
        if (this.docCode != documentWalletConfigDoc.docCode) {
            int i4 = i2 + 29;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.docName, documentWalletConfigDoc.docName)) {
            int i5 = onWarmupCompleted + 67;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.existDocId, documentWalletConfigDoc.existDocId)) {
            int i6 = onExtraCallback + 31;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.isPrepare != documentWalletConfigDoc.isPrepare) {
            int i8 = onWarmupCompleted + 29;
            onExtraCallback = i8 % 128;
            return i8 % 2 != 0;
        }
        if (this.applyType != documentWalletConfigDoc.applyType) {
            return false;
        }
        if (this.hidden == documentWalletConfigDoc.hidden) {
            return true;
        }
        int i9 = onExtraCallback + 113;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = Long.hashCode(this.docCode);
        String str = this.docName;
        if (str == null) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Long l = this.existDocId;
        if (l == null) {
            int i7 = onExtraCallback + 77;
            onWarmupCompleted = i7 % 128;
            iHashCode2 = 1 ^ (i7 % 2 == 0 ? 0 : 1);
        } else {
            iHashCode2 = l.hashCode();
        }
        int iHashCode4 = Boolean.hashCode(this.isPrepare);
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = this.applyType;
        return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (onnavigationevent != null ? onnavigationevent.hashCode() : 0)) * 31) + Boolean.hashCode(this.hidden);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DocumentWalletConfigDoc(docCode=" + this.docCode + ", docName=" + this.docName + ", existDocId=" + this.existDocId + ", isPrepare=" + this.isPrepare + ", applyType=" + this.applyType + ", hidden=" + this.hidden + ")";
        int i2 = onWarmupCompleted + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.docCode);
        parcel.writeString(this.docName);
        Long l = this.existDocId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isPrepare ? 1 : 0);
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = this.applyType;
        if (onnavigationevent == null) {
            int i5 = onExtraCallback + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        } else {
            parcel.writeInt(1);
            parcel.writeString(onnavigationevent.name());
            int i6 = onExtraCallback + 7;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
        parcel.writeInt(this.hidden ? 1 : 0);
        int i8 = onExtraCallback + 67;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    public static final class Companion {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DocumentWalletConfigDoc> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            DocumentWalletConfigDoc$$serializer documentWalletConfigDoc$$serializer = DocumentWalletConfigDoc$$serializer.INSTANCE;
            int i4 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return documentWalletConfigDoc$$serializer;
        }
    }

    static {
        int i = onNavigationEvent + 47;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    public /* synthetic */ DocumentWalletConfigDoc(int i, long j, String str, Long l, boolean z, EDocIssuableCandidate.onNavigationEvent onnavigationevent, boolean z2, int i2, okycx okycxVar) {
        if ((i & 1) == 0) {
            int i3 = 2 % 2;
            j = 0;
        }
        this.docCode = j;
        if ((i & 2) == 0) {
            this.docName = null;
            int i4 = 2 % 2;
        } else {
            this.docName = str;
        }
        if ((i & 4) == 0) {
            this.existDocId = null;
        } else {
            this.existDocId = l;
        }
        if ((i & 8) == 0) {
            int i5 = onExtraCallback + 23;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.isPrepare = false;
        } else {
            this.isPrepare = z;
            int i7 = 2 % 2;
        }
        if ((i & 16) == 0) {
            int i8 = onWarmupCompleted + 43;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            this.applyType = null;
            int i10 = 2 % 2;
        } else {
            this.applyType = onnavigationevent;
        }
        if ((i & 32) == 0) {
            this.hidden = false;
        } else {
            this.hidden = z2;
        }
        if ((i & 64) == 0) {
            this.rank = 0;
        } else {
            this.rank = i2;
        }
    }

    public DocumentWalletConfigDoc(long j, @Nullable String str, @Nullable Long l, boolean z, @Nullable EDocIssuableCandidate.onNavigationEvent onnavigationevent, boolean z2) {
        this.docCode = j;
        this.docName = str;
        this.existDocId = l;
        this.isPrepare = z;
        this.applyType = onnavigationevent;
        this.hidden = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc r7, o.vyl r8, kotlinx.serialization.descriptors.SerialDescriptor r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.$childSerializers
            r2 = 0
            boolean r3 = r8.onWarmupCompleted(r9, r2)
            if (r3 != 0) goto L14
            long r3 = r7.docCode
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L19
        L14:
            long r3 = r7.docCode
            r8.onExtraCallback(r9, r2, r3)
        L19:
            r3 = 1
            boolean r4 = r8.onWarmupCompleted(r9, r3)
            if (r4 != 0) goto L24
            java.lang.String r4 = r7.docName
            if (r4 == 0) goto L34
        L24:
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.String r5 = r7.docName
            r8.onExtraCallbackWithResult(r9, r3, r4, r5)
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted
            int r3 = r3 + 39
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onExtraCallback = r4
            int r3 = r3 % r0
        L34:
            boolean r3 = r8.onWarmupCompleted(r9, r0)
            if (r3 != 0) goto L3e
            java.lang.Long r3 = r7.existDocId
            if (r3 == 0) goto L45
        L3e:
            o.oty1 r3 = o.oty1.onExtraCallback
            java.lang.Long r4 = r7.existDocId
            r8.onExtraCallbackWithResult(r9, r0, r3, r4)
        L45:
            r3 = 3
            boolean r4 = r8.onWarmupCompleted(r9, r3)
            if (r4 != 0) goto L50
            boolean r4 = r7.isPrepare
            if (r4 == 0) goto L55
        L50:
            boolean r4 = r7.isPrepare
            r8.onNavigationEvent(r9, r3, r4)
        L55:
            r3 = 4
            boolean r4 = r8.onWarmupCompleted(r9, r3)
            r5 = 0
            if (r4 != 0) goto L73
            int r4 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onExtraCallback
            int r4 = r4 + 75
            int r6 = r4 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted = r6
            int r4 = r4 % r0
            if (r4 == 0) goto L6d
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$onNavigationEvent r4 = r7.applyType
            if (r4 == 0) goto L89
            goto L73
        L6d:
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$onNavigationEvent r7 = r7.applyType
            r5.hashCode()
            throw r5
        L73:
            r1 = r1[r3]
            java.lang.Object r1 = r1.getValue()
            o.py r1 = (o.py) r1
            viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate$onNavigationEvent r4 = r7.applyType
            r8.onExtraCallbackWithResult(r9, r3, r1, r4)
            int r1 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted
            int r1 = r1 + 123
            int r3 = r1 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onExtraCallback = r3
            int r1 = r1 % r0
        L89:
            r1 = 5
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto La6
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted
            int r3 = r3 + 95
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onExtraCallback = r4
            int r3 = r3 % r0
            if (r3 != 0) goto La0
            boolean r3 = r7.hidden
            if (r3 == 0) goto Lab
            goto La6
        La0:
            boolean r7 = r7.hidden
            r5.hashCode()
            throw r5
        La6:
            boolean r3 = r7.hidden
            r8.onNavigationEvent(r9, r1, r3)
        Lab:
            r1 = 6
            boolean r3 = r8.onWarmupCompleted(r9, r1)
            if (r3 != 0) goto Lc7
            int r3 = viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted
            int r3 = r3 + 73
            int r4 = r3 % 128
            viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onExtraCallback = r4
            int r3 = r3 % r0
            int r0 = r7.rank
            if (r3 == 0) goto Lc5
            r3 = 26
            int r3 = r3 / r2
            if (r0 == 0) goto Lcc
            goto Lc7
        Lc5:
            if (r0 == 0) goto Lcc
        Lc7:
            int r7 = r7.rank
            r8.onExtraCallback(r9, r1, r7)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc.onWarmupCompleted(viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletConfigDoc, o.vyl, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i2 + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DocumentWalletConfigDoc(long j, String str, Long l, boolean z, EDocIssuableCandidate.onNavigationEvent onnavigationevent, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        Long l2;
        boolean z3;
        long j2 = (i & 1) != 0 ? 0L : j;
        if ((i & 2) != 0) {
            int i2 = onExtraCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 4) != 0) {
            int i4 = onExtraCallback + 57;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                onnavigationevent.hashCode();
                throw null;
            }
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 63;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 65;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        this(j2, str2, l2, z3, (i & 16) == 0 ? onnavigationevent : null, (i & 32) == 0 ? z2 : false);
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        long j = this.docCode;
        int i5 = i3 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.docName;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DocumentWalletConfigDoc documentWalletConfigDoc = (DocumentWalletConfigDoc) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 25;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Long l = documentWalletConfigDoc.existDocId;
        int i5 = i2 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }

    public final boolean asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isPrepare;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return z;
    }

    public final EDocIssuableCandidate.onNavigationEvent IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EDocIssuableCandidate.onNavigationEvent onnavigationevent = this.applyType;
        int i4 = i3 + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationevent;
        }
        throw null;
    }

    public final boolean onTransact() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        boolean z = this.hidden;
        int i5 = i3 + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.rank;
        int i6 = i2 + 15;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 39 / 0;
        }
        return i5;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 5;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        this.rank = i;
        int i6 = i3 + 93;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final /* synthetic */ KSerializer IAuthTabCallbackDefault() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (KSerializer) onExtraCallbackWithResult(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -470250741, new Object[0], iOnExtraCallback2, 470250742, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    public final Long IAuthTabCallbackStub() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Long) onExtraCallbackWithResult(iOnExtraCallback, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 1522766293, new Object[]{this}, iOnExtraCallback2, -1522766293, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }
}
