package viva.republica.toss.network.model.verify;

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
import viva.republica.toss.network.model.verify.GenerateSaltResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class GenerateSaltResponse {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String salt;

    static {
        int i = onWarmupCompleted + 35;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof GenerateSaltResponse))) {
            return Intrinsics.areEqual(this.salt, ((GenerateSaltResponse) obj).salt);
        }
        int i2 = IAuthTabCallback;
        int i3 = i2 + 75;
        onExtraCallbackWithResult = i3 % 128;
        boolean z = i3 % 2 == 0;
        int i4 = i2 + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.salt;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GenerateSaltResponse(salt=" + this.salt + ")";
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
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

        public final KSerializer<GenerateSaltResponse> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            GenerateSaltResponse$.serializer serializerVar = GenerateSaltResponse$.serializer.INSTANCE;
            if (i3 == 0) {
                return serializerVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ GenerateSaltResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            htf31.onExtraCallbackWithResult(i, 1, (i2 % 2 == 0 ? GenerateSaltResponse$.serializer.INSTANCE : GenerateSaltResponse$.serializer.INSTANCE).getDescriptor());
            int i3 = 2 % 2;
        }
        this.salt = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GenerateSaltResponse generateSaltResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, generateSaltResponse.salt);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.salt;
        int i5 = i3 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
