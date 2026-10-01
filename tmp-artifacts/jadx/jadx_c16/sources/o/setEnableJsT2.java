package o;

import im.toss.features.kyc.navigation.models.Status;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.spv;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setEnableJsT2 implements KSerializer<Status> {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final setEnableJsT2 onExtraCallback = new setEnableJsT2();
    private static final SerialDescriptor onExtraCallbackWithResult = ujb.onExtraCallbackWithResult("KycStatusValue", spv.IAuthTabCallbackStub.onExtraCallback);
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    private setEnableJsT2() {
    }

    public /* synthetic */ Object deserialize(Decoder decoder) throws qn {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Status statusOnExtraCallbackWithResult = onExtraCallbackWithResult(decoder);
        int i3 = IAuthTabCallbackDefault + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return statusOnExtraCallbackWithResult;
    }

    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(encoder, (Status) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return serialDescriptor;
    }

    static {
        int i = IAuthTabCallback + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public void IAuthTabCallback(@NotNull Encoder encoder, @NotNull Status status) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(status, "");
            encoder.onExtraCallbackWithResult(status.name());
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(status, "");
            encoder.onExtraCallbackWithResult(status.name());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.qn */
    public Status onExtraCallbackWithResult(@NotNull Decoder decoder) throws qn {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        String strIAuthTabCallback_Parcel = decoder.IAuthTabCallback_Parcel();
        Iterator it = Status.getEntries().iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                int i2 = IAuthTabCallbackDefault + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                break;
            }
            int i4 = onNavigationEvent + 107;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(((Status) it.next()).name(), strIAuthTabCallback_Parcel);
                next.hashCode();
                throw null;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Status) next).name(), strIAuthTabCallback_Parcel)) {
                break;
            }
        }
        Status status = (Status) next;
        if (status == null) {
            throw new qn("Unknown KYC status: " + strIAuthTabCallback_Parcel);
        }
        int i5 = IAuthTabCallbackDefault + 75;
        int i6 = i5 % 128;
        onNavigationEvent = i6;
        if (i5 % 2 != 0) {
            int i7 = 50 / 0;
        }
        int i8 = i6 + 113;
        IAuthTabCallbackDefault = i8 % 128;
        int i9 = i8 % 2;
        return status;
    }
}
