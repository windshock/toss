package im.toss.features.home.core.local.model.dst.element;

import im.toss.features.home.core.local.model.dst.property.PaddingLocal;
import im.toss.features.home.core.local.model.dst.property.PaddingLocal$$serializer;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ContentsHorizontalLocal$$serializer implements aeu2<ContentsHorizontalLocal> {
    private static int IAuthTabCallback = 0;
    public static final ContentsHorizontalLocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 99;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 48 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 11;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        ContentsHorizontalLocal$$serializer contentsHorizontalLocal$$serializer = new ContentsHorizontalLocal$$serializer();
        INSTANCE = contentsHorizontalLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ContentsHorizontalLocal", contentsHorizontalLocal$$serializer, 2);
        setanimationsloop.onWarmupCompleted("contents", false);
        setanimationsloop.onWarmupCompleted("padding", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 103;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ContentsHorizontalLocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 == 0 ? new KSerializer[]{ContentsHorizontalLocal.IAuthTabCallback()[1].getValue(), PaddingLocal$$serializer.INSTANCE} : new KSerializer[]{ContentsHorizontalLocal.IAuthTabCallback()[0].getValue(), PaddingLocal$$serializer.INSTANCE};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContentsHorizontalLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        PaddingLocal paddingLocal;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ContentsHorizontalLocal.IAuthTabCallback();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            paddingLocal = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, PaddingLocal$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            List list2 = null;
            PaddingLocal paddingLocal2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onWarmupCompleted;
                    int i7 = i6 + 83;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 8 / 0;
                        if (iOnNavigationEvent == 0) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                            i5 |= 1;
                            int i9 = onWarmupCompleted + 79;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                        } else {
                            if (iOnNavigationEvent == 1) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i6 + 125;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            PaddingLocal$$serializer paddingLocal$$serializer = PaddingLocal$$serializer.INSTANCE;
                            if (i12 != 0) {
                                paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, paddingLocal$$serializer, paddingLocal2);
                                i5 |= 5;
                            } else {
                                paddingLocal2 = (PaddingLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, paddingLocal$$serializer, paddingLocal2);
                                i5 |= 2;
                            }
                        }
                    } else if (iOnNavigationEvent == 0) {
                        list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), list2);
                        i5 |= 1;
                        int i92 = onWarmupCompleted + 79;
                        IAuthTabCallback = i92 % 128;
                        int i102 = i92 % 2;
                    } else if (iOnNavigationEvent == 1) {
                    }
                } else {
                    z = false;
                }
            }
            list = list2;
            paddingLocal = paddingLocal2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ContentsHorizontalLocal(i, list, paddingLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m325deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ContentsHorizontalLocal contentsHorizontalLocalDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return contentsHorizontalLocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ContentsHorizontalLocal contentsHorizontalLocal) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(contentsHorizontalLocal, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ContentsHorizontalLocal.onExtraCallback(contentsHorizontalLocal, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ContentsHorizontalLocal) obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
