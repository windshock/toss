package im.toss.features.home.core.remote.request;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DefaultHomeRequestBody$$serializer implements aeu2<DefaultHomeRequestBody> {
    public static final DefaultHomeRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 60 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        DefaultHomeRequestBody$$serializer defaultHomeRequestBody$$serializer = new DefaultHomeRequestBody$$serializer();
        INSTANCE = defaultHomeRequestBody$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.request.DefaultHomeRequestBody", defaultHomeRequestBody$$serializer, 3);
        setanimationsloop.onWarmupCompleted("schemeParams", false);
        setanimationsloop.onWarmupCompleted("initialState", true);
        setanimationsloop.onWarmupCompleted("currentState", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 61;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private DefaultHomeRequestBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = DefaultHomeRequestBody.onExtraCallback();
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallback[0].getValue(), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[1].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[2].getValue())};
        int i4 = onWarmupCompleted + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DefaultHomeRequestBody deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Map map;
        Map map2;
        Map map3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = DefaultHomeRequestBody.onExtraCallback();
        Map map4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Map map5 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            Map map6 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            map2 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), (Object) null);
            i = 7;
            map3 = map5;
            map = map6;
        } else {
            int i3 = onWarmupCompleted + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            Map map7 = null;
            Map map8 = null;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onExtraCallback;
                    int i7 = i6 + 19;
                    onWarmupCompleted = i7 % 128;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent == 1) {
                            map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), map4);
                            i5 |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i6 + 107;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, (jp) lazyArrOnExtraCallback[2].getValue(), map7);
                            i5 |= 2;
                        } else {
                            map7 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallback[2].getValue(), map7);
                            i5 |= 4;
                        }
                    } else {
                        if (iOnNavigationEvent == 1) {
                            map4 = (Map) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), map4);
                            i5 |= 2;
                        }
                        if (iOnNavigationEvent == 2) {
                        }
                    }
                } else {
                    map8 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), map8);
                    i5 |= 1;
                    int i9 = onExtraCallback + 95;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            i = i5;
            map = map4;
            map2 = map7;
            map3 = map8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DefaultHomeRequestBody(i, map3, map, map2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m606deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DefaultHomeRequestBody defaultHomeRequestBodyDeserialize = deserialize(decoder);
        int i4 = onWarmupCompleted + 45;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultHomeRequestBodyDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DefaultHomeRequestBody defaultHomeRequestBody) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(defaultHomeRequestBody, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DefaultHomeRequestBody.IAuthTabCallback(defaultHomeRequestBody, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(defaultHomeRequestBody, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DefaultHomeRequestBody.IAuthTabCallback(defaultHomeRequestBody, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DefaultHomeRequestBody) obj);
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }
}
