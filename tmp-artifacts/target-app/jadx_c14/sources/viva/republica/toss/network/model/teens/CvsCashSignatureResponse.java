package viva.republica.toss.network.model.teens;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.teens.CvsCashSignatureResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CvsCashSignatureResponse {
    public static final Companion Companion;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private final String doc;
    private final long signId;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 69;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 95;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        if (!(obj instanceof CvsCashSignatureResponse)) {
            return false;
        }
        CvsCashSignatureResponse cvsCashSignatureResponse = (CvsCashSignatureResponse) obj;
        if (Intrinsics.areEqual(this.doc, cvsCashSignatureResponse.doc)) {
            return this.signId == cvsCashSignatureResponse.signId;
        }
        int i6 = IAuthTabCallback + 43;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.doc.hashCode() * 31) + Long.hashCode(this.signId);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CvsCashSignatureResponse(doc=" + this.doc + ", signId=" + this.signId + ")";
        int i2 = IAuthTabCallback + 119;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CvsCashSignatureResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 29;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            CvsCashSignatureResponse$.serializer serializerVar = CvsCashSignatureResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ CvsCashSignatureResponse(int i, String str, long j, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, CvsCashSignatureResponse$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, CvsCashSignatureResponse$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = onNavigationEvent + 21;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.doc = str;
        this.signId = j;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(CvsCashSignatureResponse cvsCashSignatureResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, cvsCashSignatureResponse.doc);
        vylVar.onExtraCallback(serialDescriptor, 1, cvsCashSignatureResponse.signId);
        int i4 = onNavigationEvent + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.doc;
        int i5 = i2 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.signId;
        }
        int i3 = 60 / 0;
        return this.signId;
    }
}
