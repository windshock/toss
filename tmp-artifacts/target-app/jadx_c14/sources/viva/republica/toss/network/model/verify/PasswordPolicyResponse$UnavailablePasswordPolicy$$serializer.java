package viva.republica.toss.network.model.verify;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.verify.PasswordPolicyResponse;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer implements aeu2<PasswordPolicyResponse.UnavailablePasswordPolicy> {
    public static final PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer passwordPolicyResponse$UnavailablePasswordPolicy$$serializer = new PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer();
        INSTANCE = passwordPolicyResponse$UnavailablePasswordPolicy$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.verify.PasswordPolicyResponse.UnavailablePasswordPolicy", passwordPolicyResponse$UnavailablePasswordPolicy$$serializer, 2);
        setanimationsloop.onWarmupCompleted("passwordSet", true);
        setanimationsloop.onWarmupCompleted("errorMessage", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 31;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    private PasswordPolicyResponse$UnavailablePasswordPolicy$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {PasswordPolicyResponse.UnavailablePasswordPolicy.IAuthTabCallback()[0].getValue(), getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallback + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PasswordPolicyResponse.UnavailablePasswordPolicy unavailablePasswordPolicyM138deserialize = m138deserialize(decoder);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unavailablePasswordPolicyM138deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final PasswordPolicyResponse.UnavailablePasswordPolicy m138deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String strAsInterface;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = PasswordPolicyResponse.UnavailablePasswordPolicy.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onWarmupCompleted + 97;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            i = 3;
        } else {
            List list2 = null;
            String strAsInterface2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                    i5 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onExtraCallback + 85;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                    int i8 = onExtraCallback + 73;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            list = list2;
            strAsInterface = strAsInterface2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new PasswordPolicyResponse.UnavailablePasswordPolicy(i, list, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PasswordPolicyResponse.UnavailablePasswordPolicy) obj);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PasswordPolicyResponse.UnavailablePasswordPolicy unavailablePasswordPolicy) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unavailablePasswordPolicy, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PasswordPolicyResponse.UnavailablePasswordPolicy.IAuthTabCallback(unavailablePasswordPolicy, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 87;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }
}
