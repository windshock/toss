package im.toss.features.home.core.local.model.dst.widget;

import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
import im.toss.features.home.core.local.model.dst.widget.TextContentLocal$;
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
import o.getServiceBeans;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer implements aeu2<HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber> {
    private static int IAuthTabCallback = 0;
    public static final HomeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        HomeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer homeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer = new HomeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer();
        INSTANCE = homeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber", homeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer, 11);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("prefix", false);
        setanimationsloop.onWarmupCompleted("stringNumber", true);
        setanimationsloop.onWarmupCompleted("suffix", false);
        setanimationsloop.onWarmupCompleted("fontSize", false);
        setanimationsloop.onWarmupCompleted("fontWeight", false);
        setanimationsloop.onWarmupCompleted("textAlign", false);
        setanimationsloop.onWarmupCompleted("baseColor", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        setanimationsloop.onWarmupCompleted("number", true);
        setanimationsloop.onWarmupCompleted("precision", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 63;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private HomeListRowAttributeLocal$Center$ContentAttribute$RollingNumber$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, sp.IAuthTabCallback(serializerVar), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(serializerVar), getdynamicheight, lazyArrOnNavigationEvent[5].getValue(), lazyArrOnNavigationEvent[6].getValue(), getwrigglelayout, sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback), sp.IAuthTabCallback(oty1.onExtraCallback), sp.IAuthTabCallback(getdynamicheight)};
        int i4 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b A[PHI: r0 r2 r6
      0x013b: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r6v2 kotlin.Lazy[]) = (r6v1 kotlin.Lazy[]), (r6v10 kotlin.Lazy[]) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r0 r2 r6
      0x0049: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r2v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x0049: PHI (r6v8 kotlin.Lazy[]) = (r6v1 kotlin.Lazy[]), (r6v10 kotlin.Lazy[]) binds: [B:8:0x0047, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnNavigationEvent;
        HandlerLocal handlerLocal;
        Long l;
        String str;
        TextContentLocal textContentLocal;
        int i;
        getServiceBeans.asBinder asbinder;
        getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault;
        String str2;
        String str3;
        int i2;
        TextContentLocal textContentLocal2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 8;
        Integer num = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber.onNavigationEvent();
            int i9 = 3 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                TextContentLocal$.serializer serializerVar = TextContentLocal$.serializer.INSTANCE;
                TextContentLocal textContentLocal3 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, serializerVar, (Object) null);
                String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
                TextContentLocal textContentLocal4 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, (Object) null);
                int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                getServiceBeans.asBinder asbinder2 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
                getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault2 = (getServiceBeans.IAuthTabCallbackDefault) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), (Object) null);
                String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 7);
                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, setAppxVersionInWorker.onExtraCallback, (Object) null);
                l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, oty1.onExtraCallback, (Object) null);
                num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 10, getDynamicHeight.onWarmupCompleted, (Object) null);
                str = str4;
                textContentLocal = textContentLocal3;
                i = 2047;
                asbinder = asbinder2;
                iAuthTabCallbackDefault = iAuthTabCallbackDefault2;
                str2 = strAsInterface2;
                str3 = strAsInterface;
                i2 = iOnTransact;
                textContentLocal2 = textContentLocal4;
            } else {
                boolean z = true;
                int i10 = 0;
                int iOnTransact2 = 0;
                getServiceBeans.asBinder asbinder3 = null;
                getServiceBeans.IAuthTabCallbackDefault iAuthTabCallbackDefault3 = null;
                handlerLocal = null;
                l = null;
                String strAsInterface3 = null;
                TextContentLocal textContentLocal5 = null;
                String str5 = null;
                TextContentLocal textContentLocal6 = null;
                String strAsInterface4 = null;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                            i6 = 9;
                            i7 = 7;
                            i8 = 8;
                        case 0:
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i10 |= 1;
                            i5 = 10;
                            i6 = 9;
                            i7 = 7;
                            i8 = 8;
                        case 1:
                            i10 |= 2;
                            textContentLocal6 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, TextContentLocal$.serializer.INSTANCE, textContentLocal6);
                            i5 = 10;
                            i6 = 9;
                            i7 = 7;
                            i8 = 8;
                        case 2:
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                            i10 |= 4;
                            i5 = 10;
                            i6 = 9;
                        case 3:
                            i10 |= 8;
                            textContentLocal5 = (TextContentLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, TextContentLocal$.serializer.INSTANCE, textContentLocal5);
                            i5 = 10;
                            i6 = 9;
                        case 4:
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 4);
                            i10 |= 16;
                            i5 = 10;
                        case 5:
                            asbinder3 = (getServiceBeans.asBinder) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), asbinder3);
                            i10 |= 32;
                            i5 = 10;
                        case 6:
                            iAuthTabCallbackDefault3 = (getServiceBeans.IAuthTabCallbackDefault) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 6, (jp) lazyArrOnNavigationEvent[6].getValue(), iAuthTabCallbackDefault3);
                            i10 |= 64;
                            i5 = 10;
                        case 7:
                            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i7);
                            i10 |= 128;
                            i5 = 10;
                        case 8:
                            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i8, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                            i10 |= 256;
                            i5 = 10;
                        case 9:
                            l = (Long) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i6, oty1.onExtraCallback, l);
                            i10 |= 512;
                            i5 = 10;
                        case 10:
                            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getDynamicHeight.onWarmupCompleted, num);
                            i10 |= 1024;
                            int i11 = onExtraCallbackWithResult + 109;
                            IAuthTabCallback = i11 % 128;
                            int i12 = i11 % 2;
                            i5 = 10;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                textContentLocal = textContentLocal6;
                asbinder = asbinder3;
                str3 = strAsInterface4;
                i2 = iOnTransact2;
                str = str5;
                i = i10;
                textContentLocal2 = textContentLocal5;
                iAuthTabCallbackDefault = iAuthTabCallbackDefault3;
                str2 = strAsInterface3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnNavigationEvent = HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber.onNavigationEvent();
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber(i, str3, textContentLocal, str, textContentLocal2, i2, asbinder, iAuthTabCallbackDefault, str2, handlerLocal, l, num, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m492deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber rollingNumberDeserialize = deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return rollingNumberDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber rollingNumber) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(rollingNumber, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber.IAuthTabCallback(rollingNumber, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(rollingNumber, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber.IAuthTabCallback(rollingNumber, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Center.ContentAttribute.RollingNumber) obj);
        int i4 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }
}
