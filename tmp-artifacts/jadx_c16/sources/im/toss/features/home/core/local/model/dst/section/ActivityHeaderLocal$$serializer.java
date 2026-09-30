package im.toss.features.home.core.local.model.dst.section;

import im.toss.features.home.core.local.model.dst.widget.TextContentLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.aeu2;
import o.getBgColor;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ActivityHeaderLocal$$serializer implements aeu2<ActivityHeaderLocal> {
    public static final ActivityHeaderLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        throw null;
    }

    static {
        ActivityHeaderLocal$$serializer activityHeaderLocal$$serializer = new ActivityHeaderLocal$$serializer();
        INSTANCE = activityHeaderLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.section.ActivityHeaderLocal", activityHeaderLocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("collapsedTitlePrefix", true);
        setanimationsloop.onWarmupCompleted("collapsedTitle", false);
        setanimationsloop.onWarmupCompleted("expandedTitle", false);
        setanimationsloop.onWarmupCompleted("rightText", false);
        setanimationsloop.onWarmupCompleted("isOverdue", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 117;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ActivityHeaderLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = TextContentLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(kSerializer), kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), getBgColor.IAuthTabCallback};
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ActivityHeaderLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        boolean zOnExtraCallbackWithResult;
        int i;
        TextContentLocal textContentLocal;
        TextContentLocal textContentLocal2;
        TextContentLocal textContentLocal3;
        TextContentLocal textContentLocal4;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
            TextContentLocal textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, serializerVar, (Object) null);
            TextContentLocal textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, serializerVar, (Object) null);
            TextContentLocal textContentLocal7 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
            i = 31;
            textContentLocal = textContentLocal5;
            textContentLocal2 = textContentLocal6;
            textContentLocal3 = textContentLocal7;
        } else {
            boolean zOnExtraCallbackWithResult2 = false;
            boolean z2 = true;
            TextContentLocal textContentLocal8 = null;
            TextContentLocal textContentLocal9 = null;
            TextContentLocal textContentLocal10 = null;
            TextContentLocal textContentLocal11 = null;
            int i7 = 0;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onExtraCallbackWithResult + 3;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            textContentLocal9 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal9);
                            i7 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            textContentLocal10 = (TextContentLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, TextContentLocal$.serializer.INSTANCE, textContentLocal10);
                            i7 |= 4;
                            int i10 = onWarmupCompleted + 83;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                        } else if (iOnNavigationEvent == 3) {
                            textContentLocal11 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal11);
                            i7 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4);
                            i7 |= 16;
                        }
                        z = false;
                    } else {
                        textContentLocal8 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, TextContentLocal$.serializer.INSTANCE, textContentLocal8);
                        i7 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            i = i7;
            textContentLocal = textContentLocal8;
            textContentLocal2 = textContentLocal9;
            textContentLocal3 = textContentLocal10;
            textContentLocal4 = textContentLocal11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        ActivityHeaderLocal activityHeaderLocal = new ActivityHeaderLocal(i, textContentLocal, textContentLocal2, textContentLocal3, textContentLocal4, zOnExtraCallbackWithResult, (okycx) null);
        int i12 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return activityHeaderLocal;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m466deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ActivityHeaderLocal activityHeaderLocalDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return activityHeaderLocalDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ActivityHeaderLocal activityHeaderLocal) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(activityHeaderLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ActivityHeaderLocal.onNavigationEvent(activityHeaderLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 13 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(activityHeaderLocal, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            ActivityHeaderLocal.onNavigationEvent(activityHeaderLocal, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ActivityHeaderLocal) obj);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
