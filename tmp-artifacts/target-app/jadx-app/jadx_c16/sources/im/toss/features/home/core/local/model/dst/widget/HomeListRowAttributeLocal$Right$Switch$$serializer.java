package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BaseManifest3;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Right$Switch$$serializer implements aeu2<HomeListRowAttributeLocal.Right.Switch> {
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Right$Switch$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 63 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 1;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return serialDescriptor;
    }

    static {
        HomeListRowAttributeLocal$Right$Switch$$serializer homeListRowAttributeLocal$Right$Switch$$serializer = new HomeListRowAttributeLocal$Right$Switch$$serializer();
        INSTANCE = homeListRowAttributeLocal$Right$Switch$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Right.Switch", homeListRowAttributeLocal$Right$Switch$$serializer, 5);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        setanimationsloop.onWarmupCompleted("checked", false);
        setanimationsloop.onWarmupCompleted("disabled", false);
        setanimationsloop.onWarmupCompleted("checkedHandler", false);
        setanimationsloop.onWarmupCompleted("uncheckedHandler", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 59;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeListRowAttributeLocal$Right$Switch$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {HomeListRowAttributeLocal.Right.Switch.IAuthTabCallback()[0].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker)};
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Right.Switch deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        BaseManifest3 baseManifest3;
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        HandlerLocal handlerLocal;
        HandlerLocal handlerLocal2;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Right.Switch.IAuthTabCallback();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            handlerLocal2 = null;
            baseManifest3 = null;
            i = 0;
            zOnExtraCallbackWithResult = false;
            zOnExtraCallbackWithResult2 = false;
            handlerLocal = null;
            while (z) {
                int i3 = IAuthTabCallback + 115;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = IAuthTabCallback;
                    int i6 = i5 + 81;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent != 0) {
                        int i7 = i5 + 75;
                        int i8 = i7 % 128;
                        onExtraCallbackWithResult = i8;
                        if (i7 % 2 != 0) {
                            if (iOnNavigationEvent == 0) {
                                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                                i |= 2;
                            } else if (iOnNavigationEvent != 2) {
                                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                                i |= 4;
                            } else if (iOnNavigationEvent == 3) {
                                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                                i |= 8;
                            } else {
                                if (iOnNavigationEvent != 4) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                int i9 = i8 + 103;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                                i |= 16;
                                int i11 = IAuthTabCallback + 71;
                                onExtraCallbackWithResult = i11 % 128;
                                int i12 = i11 % 2;
                            }
                        } else if (iOnNavigationEvent == 1) {
                            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                            i |= 2;
                        } else if (iOnNavigationEvent != 2) {
                        }
                    } else {
                        baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), baseManifest3);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            int i13 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
            setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, setappxversioninworker, (Object) null);
            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
            i = 31;
        }
        HandlerLocal handlerLocal3 = handlerLocal2;
        BaseManifest3 baseManifest32 = baseManifest3;
        int i15 = i;
        boolean z2 = zOnExtraCallbackWithResult;
        boolean z3 = zOnExtraCallbackWithResult2;
        HandlerLocal handlerLocal4 = handlerLocal;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        HomeListRowAttributeLocal.Right.Switch r0 = new HomeListRowAttributeLocal.Right.Switch(i15, baseManifest32, z2, z3, handlerLocal4, handlerLocal3, (okycx) null);
        int i16 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i16 % 128;
        if (i16 % 2 == 0) {
            return r0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m501deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Right.Switch r5) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(r5, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeListRowAttributeLocal.Right.Switch.onExtraCallback(r5, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Right.Switch) obj);
        int i4 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
