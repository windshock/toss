package viva.republica.toss.network.model.transfer;

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

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class SignDoc {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String doc;
    private final String refId;
    private final long signId;

    static {
        int i = onExtraCallbackWithResult + 19;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignDoc)) {
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SignDoc signDoc = (SignDoc) obj;
        if (!Intrinsics.areEqual(this.refId, signDoc.refId)) {
            return false;
        }
        if (this.signId != signDoc.signId) {
            int i4 = IAuthTabCallback + 7;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.doc, signDoc.doc)) {
            return true;
        }
        int i6 = IAuthTabCallback + 39;
        onWarmupCompleted = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.refId.hashCode();
        return i3 != 0 ? (((iHashCode / 14) >> Long.hashCode(this.signId)) / 17) << this.doc.hashCode() : (((iHashCode * 31) + Long.hashCode(this.signId)) * 31) + this.doc.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignDoc(refId=" + this.refId + ", signId=" + this.signId + ", doc=" + this.doc + ")";
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignDoc> serializer() {
            SignDoc$$serializer signDoc$$serializer;
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                signDoc$$serializer = SignDoc$$serializer.INSTANCE;
                int i3 = 12 / 0;
            } else {
                signDoc$$serializer = SignDoc$$serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return signDoc$$serializer;
        }
    }

    public /* synthetic */ SignDoc(int i, String str, long j, String str2, okycx okycxVar) {
        if (7 != (i & 7)) {
            int i2 = IAuthTabCallback + 71;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 7, SignDoc$$serializer.INSTANCE.getDescriptor());
            int i4 = onWarmupCompleted + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.refId = str;
        this.signId = j;
        this.doc = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallback(SignDoc signDoc, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 1, signDoc.refId);
            vylVar.onExtraCallback(serialDescriptor, 0, signDoc.signId);
            i = 4;
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, signDoc.refId);
            vylVar.onExtraCallback(serialDescriptor, 1, signDoc.signId);
        }
        vylVar.onExtraCallback(serialDescriptor, i, signDoc.doc);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.signId;
        int i5 = i3 + 19;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.doc;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return str;
    }
}
