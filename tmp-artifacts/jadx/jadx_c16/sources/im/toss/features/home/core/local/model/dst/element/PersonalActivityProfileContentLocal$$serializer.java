package im.toss.features.home.core.local.model.dst.element;

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
import o.getDynamicHeight;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PersonalActivityProfileContentLocal$$serializer implements aeu2<PersonalActivityProfileContentLocal> {
    private static int IAuthTabCallback = 0;
    public static final PersonalActivityProfileContentLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        PersonalActivityProfileContentLocal$$serializer personalActivityProfileContentLocal$$serializer = new PersonalActivityProfileContentLocal$$serializer();
        INSTANCE = personalActivityProfileContentLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.PersonalActivityProfileContentLocal", personalActivityProfileContentLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("profiles", false);
        setanimationsloop.onWarmupCompleted("extraCount", false);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private PersonalActivityProfileContentLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{PersonalActivityProfileContentLocal.IAuthTabCallback()[0].getValue(), getDynamicHeight.onWarmupCompleted};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[1] = PersonalActivityProfileContentLocal.IAuthTabCallback()[1].getValue();
        kSerializerArr[0] = getDynamicHeight.onWarmupCompleted;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PersonalActivityProfileContentLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        int iOnTransact;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            PersonalActivityProfileContentLocal.IAuthTabCallback();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = PersonalActivityProfileContentLocal.IAuthTabCallback();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            iOnTransact = ywVarOnWarmupCompleted2.onTransact(serialDescriptor, 1);
            i = 3;
        } else {
            List list2 = null;
            int iOnTransact2 = 0;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int i5 = onWarmupCompleted + 31;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                    i4 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i6 = onWarmupCompleted + 1;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        iOnTransact2 = ywVarOnWarmupCompleted2.onTransact(serialDescriptor, 1);
                        i4 |= 4;
                    } else {
                        iOnTransact2 = ywVarOnWarmupCompleted2.onTransact(serialDescriptor, 1);
                        i4 |= 2;
                    }
                }
            }
            list = list2;
            iOnTransact = iOnTransact2;
            i = i4;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        PersonalActivityProfileContentLocal personalActivityProfileContentLocal = new PersonalActivityProfileContentLocal(i, list, iOnTransact, (okycx) null);
        int i7 = onNavigationEvent + 113;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return personalActivityProfileContentLocal;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m404deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        PersonalActivityProfileContentLocal personalActivityProfileContentLocalDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return personalActivityProfileContentLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PersonalActivityProfileContentLocal personalActivityProfileContentLocal) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(personalActivityProfileContentLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PersonalActivityProfileContentLocal.onExtraCallbackWithResult(personalActivityProfileContentLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(personalActivityProfileContentLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PersonalActivityProfileContentLocal.onExtraCallbackWithResult(personalActivityProfileContentLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PersonalActivityProfileContentLocal) obj);
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
