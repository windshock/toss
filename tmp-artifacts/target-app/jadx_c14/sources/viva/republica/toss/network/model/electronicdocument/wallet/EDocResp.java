package viva.republica.toss.network.model.electronicdocument.wallet;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocResp$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EDocResp {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final EDoc document;

    static {
        int i = onNavigationEvent + 93;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EDocResp() {
        EDoc eDoc = null;
        this(eDoc, 1, (DefaultConstructorMarker) eDoc);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EDocResp)) {
            int i4 = i3 + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.document, ((EDocResp) obj).document)) {
            return true;
        }
        int i6 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EDoc eDoc = this.document;
        if (eDoc != null) {
            return eDoc.hashCode();
        }
        int i5 = i2 + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocResp(document=" + this.document + ")";
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocResp> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            EDocResp$.serializer serializerVar = EDocResp$.serializer.INSTANCE;
            if (i3 != 0) {
                return serializerVar;
            }
            throw null;
        }
    }

    public /* synthetic */ EDocResp(int i, EDoc eDoc, okycx okycxVar) {
        if ((i & 1) != 0) {
            this.document = eDoc;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        this.document = null;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public EDocResp(@Nullable EDoc eDoc) {
        this.document = eDoc;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(EDocResp eDocResp, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                EDoc eDoc = eDocResp.document;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (eDocResp.document == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 0, EDoc$$serializer.INSTANCE, eDocResp.document);
        int i5 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EDocResp(EDoc eDoc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallbackWithResult + 109;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 3;
            } else {
                int i7 = 2 % 2;
            }
            eDoc = null;
        }
        this(eDoc);
    }

    public final EDoc onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        EDoc eDoc = this.document;
        int i5 = i2 + 1;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return eDoc;
    }
}
