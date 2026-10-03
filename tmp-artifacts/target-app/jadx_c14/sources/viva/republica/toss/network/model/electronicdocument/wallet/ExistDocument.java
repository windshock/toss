package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.oty1;
import o.py;
import o.readAsText;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ExistDocument {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final long docCode;
    private final String docName;
    private final readAsText docStatus;
    private final Long existDocId;
    private final String iconUrl;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.electronicdocument.wallet.ExistDocument$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return ExistDocument.onNavigationEvent();
            }
            ExistDocument.onNavigationEvent();
            throw null;
        }
    }), null, null};

    private static final /* synthetic */ KSerializer asBinder() {
        KSerializer kSerializerOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.ExistDocumentStatus", readAsText.values());
            int i3 = 31 / 0;
        } else {
            kSerializerOnExtraCallbackWithResult = updateRenderInfoForVideo.onExtraCallbackWithResult("viva.republica.toss.network.model.electronicdocument.wallet.ExistDocumentStatus", readAsText.values());
        }
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnExtraCallbackWithResult;
    }

    public static /* synthetic */ KSerializer onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder();
        }
        asBinder();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ExistDocument)) {
            return false;
        }
        ExistDocument existDocument = (ExistDocument) obj;
        if (this.docCode != existDocument.docCode) {
            int i4 = onExtraCallback + 53;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.docName, existDocument.docName)) {
            int i5 = IAuthTabCallback + 3;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.docStatus != existDocument.docStatus) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, existDocument.iconUrl)) {
            int i6 = IAuthTabCallback + 31;
            onExtraCallback = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.existDocId, existDocument.existDocId)) {
            int i7 = onExtraCallback + 41;
            int i8 = i7 % 128;
            IAuthTabCallback = i8;
            z = i7 % 2 == 0;
            int i9 = i8 + 61;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return z;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Long.hashCode(this.docCode);
        int iHashCode2 = this.docName.hashCode();
        int iHashCode3 = this.docStatus.hashCode();
        int iHashCode4 = this.iconUrl.hashCode();
        Long l = this.existDocId;
        if (l == null) {
            int i3 = onExtraCallback + 119;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode5 = l.hashCode();
            int i5 = IAuthTabCallback + 79;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
            i = iHashCode5;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ExistDocument(docCode=" + this.docCode + ", docName=" + this.docName + ", docStatus=" + this.docStatus + ", iconUrl=" + this.iconUrl + ", existDocId=" + this.existDocId + ")";
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
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

        public final KSerializer<ExistDocument> serializer() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ExistDocument$$serializer existDocument$$serializer = ExistDocument$$serializer.INSTANCE;
            int i4 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return existDocument$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 95;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
    }

    public /* synthetic */ ExistDocument(int i, long j, String str, readAsText readastext, String str2, Long l, okycx okycxVar) {
        if (15 != (i & 15)) {
            htf31.onExtraCallbackWithResult(i, 15, ExistDocument$$serializer.INSTANCE.getDescriptor());
            int i2 = onExtraCallback + 101;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        this.docCode = j;
        this.docName = str;
        this.docStatus = readastext;
        this.iconUrl = str2;
        Object obj = null;
        if ((i & 16) == 0) {
            this.existDocId = null;
            int i4 = IAuthTabCallback + 33;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.existDocId = l;
        int i5 = onExtraCallback + 121;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i5 = i3 + 89;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return lazyArr;
    }

    @JvmStatic
    public static final /* synthetic */ void onWarmupCompleted(ExistDocument existDocument, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        vylVar.onExtraCallback(serialDescriptor, 0, existDocument.docCode);
        vylVar.onExtraCallback(serialDescriptor, 1, existDocument.docName);
        vylVar.onNavigationEvent(serialDescriptor, 2, (py) lazyArr[2].getValue(), existDocument.docStatus);
        vylVar.onExtraCallback(serialDescriptor, 3, existDocument.iconUrl);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Long l = existDocument.existDocId;
                throw null;
            }
            if (existDocument.existDocId == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 4, oty1.onExtraCallback, existDocument.existDocId);
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.docCode;
        int i4 = i2 + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.docName;
        int i5 = i2 + 101;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final readAsText onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        readAsText readastext = this.docStatus;
        int i5 = i2 + 119;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return readastext;
        }
        throw null;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Long l = this.existDocId;
        int i5 = i2 + 111;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return l;
    }
}
