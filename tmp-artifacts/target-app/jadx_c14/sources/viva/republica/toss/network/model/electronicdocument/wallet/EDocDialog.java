package viva.republica.toss.network.model.electronicdocument.wallet;

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
public final class EDocDialog {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String message;
    private final String schemeUrl;

    static {
        int i = onWarmupCompleted + 35;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof EDocDialog) {
            EDocDialog eDocDialog = (EDocDialog) obj;
            if (Intrinsics.areEqual(this.message, eDocDialog.message)) {
                return Intrinsics.areEqual(this.schemeUrl, eDocDialog.schemeUrl);
            }
            int i4 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.message.hashCode();
        return i3 != 0 ? (iHashCode / 47) >>> this.schemeUrl.hashCode() : (iHashCode * 31) + this.schemeUrl.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EDocDialog(message=" + this.message + ", schemeUrl=" + this.schemeUrl + ")";
        int i2 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EDocDialog> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            EDocDialog$$serializer eDocDialog$$serializer = EDocDialog$$serializer.INSTANCE;
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return eDocDialog$$serializer;
        }
    }

    public /* synthetic */ EDocDialog(int i, String str, String str2, okycx okycxVar) {
        if (3 != (i & 3)) {
            int i2 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 2, EDocDialog$$serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 3, EDocDialog$$serializer.INSTANCE.getDescriptor());
            }
            int i3 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        this.message = str;
        this.schemeUrl = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(EDocDialog eDocDialog, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, eDocDialog.message);
        vylVar.onExtraCallback(serialDescriptor, 1, eDocDialog.schemeUrl);
        int i4 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return this.schemeUrl;
        }
        throw null;
    }
}
