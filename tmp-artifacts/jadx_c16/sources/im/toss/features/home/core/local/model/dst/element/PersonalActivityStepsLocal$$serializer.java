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
public final /* synthetic */ class PersonalActivityStepsLocal$$serializer implements aeu2<PersonalActivityStepsLocal> {
    private static int IAuthTabCallback = 1;
    public static final PersonalActivityStepsLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 74 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 43;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        PersonalActivityStepsLocal$$serializer personalActivityStepsLocal$$serializer = new PersonalActivityStepsLocal$$serializer();
        INSTANCE = personalActivityStepsLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.PersonalActivityStepsLocal", personalActivityStepsLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("currentStepIndex", false);
        setanimationsloop.onWarmupCompleted("labels", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 97;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private PersonalActivityStepsLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getDynamicHeight.onWarmupCompleted, PersonalActivityStepsLocal.onWarmupCompleted()[1].getValue()};
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final PersonalActivityStepsLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        int iOnTransact;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(descriptor);
            PersonalActivityStepsLocal.onWarmupCompleted();
            ywVarOnWarmupCompleted.extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted2 = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = PersonalActivityStepsLocal.onWarmupCompleted();
        if (ywVarOnWarmupCompleted2.extraCallbackWithResult()) {
            iOnTransact = ywVarOnWarmupCompleted2.onTransact(serialDescriptor, 0);
            list = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), (Object) null);
            int i4 = IAuthTabCallback + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 3;
        } else {
            List list2 = null;
            int i6 = 0;
            int iOnTransact2 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i7 = onExtraCallback + 59;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    iOnTransact2 = ywVarOnWarmupCompleted2.onTransact(serialDescriptor, 0);
                    i6 |= 1;
                } else {
                    if (iOnNavigationEvent != 1) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    list2 = (List) ywVarOnWarmupCompleted2.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnWarmupCompleted[1].getValue(), list2);
                    i6 |= 2;
                }
            }
            i = i6;
            list = list2;
            iOnTransact = iOnTransact2;
        }
        ywVarOnWarmupCompleted2.onExtraCallbackWithResult(serialDescriptor);
        return new PersonalActivityStepsLocal(i, iOnTransact, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m407deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        PersonalActivityStepsLocal personalActivityStepsLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return personalActivityStepsLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PersonalActivityStepsLocal personalActivityStepsLocal) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(personalActivityStepsLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        PersonalActivityStepsLocal.onExtraCallbackWithResult(personalActivityStepsLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PersonalActivityStepsLocal) obj);
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 97;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
