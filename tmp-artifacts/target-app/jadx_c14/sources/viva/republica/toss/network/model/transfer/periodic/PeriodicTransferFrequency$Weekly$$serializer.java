package viva.republica.toss.network.model.transfer.periodic;

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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Monthly$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferFrequency$Weekly$$serializer implements aeu2<PeriodicTransferFrequency.Weekly> {
    private static int IAuthTabCallback = 1;
    public static final PeriodicTransferFrequency$Weekly$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 19;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 17 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        PeriodicTransferFrequency$Weekly$$serializer periodicTransferFrequency$Weekly$$serializer = new PeriodicTransferFrequency$Weekly$$serializer();
        INSTANCE = periodicTransferFrequency$Weekly$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("WEEKLY", periodicTransferFrequency$Weekly$$serializer, 3);
        setanimationsloop.onWarmupCompleted("startDate", false);
        setanimationsloop.onWarmupCompleted("endDate", false);
        setanimationsloop.onWarmupCompleted("dayOfWeek", false);
        setanimationsloop.onWarmupCompleted(new PeriodicTransferFrequency$Monthly$$serializer.onExtraCallback("frequencyType"));
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 79;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PeriodicTransferFrequency$Weekly$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = PeriodicTransferFrequency.Weekly.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), lazyArrIAuthTabCallback[2].getValue()};
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m134deserialize(decoder);
            throw null;
        }
        PeriodicTransferFrequency.Weekly weeklyM134deserialize = m134deserialize(decoder);
        int i3 = onExtraCallback + 65;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return weeklyM134deserialize;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.Weekly m134deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r18) throws kotlinx.serialization.UnknownFieldException {
        /*
            r17 = this;
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            kotlin.Lazy[] r3 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.Weekly.IAuthTabCallback()
            boolean r4 = r0.extraCallbackWithResult()
            r5 = 1
            r4 = r4 ^ r5
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L84
            int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.onExtraCallback
            int r4 = r4 + 21
            int r8 = r4 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.IAuthTabCallback = r8
            int r4 = r4 % r1
            r9 = r5
            r10 = r6
            r4 = r7
            r8 = r4
        L2b:
            if (r9 == 0) goto L81
            int r11 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.IAuthTabCallback
            int r11 = r11 + 27
            int r12 = r11 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.onExtraCallback = r12
            int r11 = r11 % r1
            int r11 = r0.onNavigationEvent(r2)
            r12 = -1
            if (r11 == r12) goto L7f
            if (r11 == 0) goto L74
            int r12 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.onExtraCallback
            int r12 = r12 + 113
            int r13 = r12 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.IAuthTabCallback = r13
            int r12 = r12 % 2
            if (r12 != 0) goto L4e
            if (r11 == 0) goto L69
            goto L50
        L4e:
            if (r11 == r5) goto L69
        L50:
            if (r11 != r1) goto L63
            r11 = r3[r1]
            java.lang.Object r11 = r11.getValue()
            o.jp r11 = (o.jp) r11
            java.lang.Object r4 = r0.onNavigationEvent(r2, r1, r11, r4)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$onExtraCallback r4 = (viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.onExtraCallback) r4
            r10 = r10 | 4
            goto L2b
        L63:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r11)
            throw r0
        L69:
            o.getWriggleLayout r11 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r7 = r0.onExtraCallbackWithResult(r2, r5, r11, r7)
            java.lang.String r7 = (java.lang.String) r7
            r10 = r10 | 2
            goto L2b
        L74:
            o.getWriggleLayout r11 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r8 = r0.onExtraCallbackWithResult(r2, r6, r11, r8)
            java.lang.String r8 = (java.lang.String) r8
            r10 = r10 | 1
            goto L2b
        L7f:
            r9 = r6
            goto L2b
        L81:
            r15 = r4
            r14 = r7
            goto Lad
        L84:
            int r4 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.onExtraCallback
            int r4 = r4 + 3
            int r8 = r4 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.IAuthTabCallback = r8
            int r4 = r4 % r1
            o.getWriggleLayout r4 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r6 = r0.onExtraCallbackWithResult(r2, r6, r4, r7)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r0.onExtraCallbackWithResult(r2, r5, r4, r7)
            java.lang.String r4 = (java.lang.String) r4
            r3 = r3[r1]
            java.lang.Object r3 = r3.getValue()
            o.jp r3 = (o.jp) r3
            java.lang.Object r1 = r0.onNavigationEvent(r2, r1, r3, r7)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$onExtraCallback r1 = (viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency.onExtraCallback) r1
            r10 = 7
            r15 = r1
            r14 = r4
        Lad:
            r13 = r8
            r12 = r10
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly r0 = new viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly$$serializer.m134deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.periodic.PeriodicTransferFrequency$Weekly");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferFrequency.Weekly) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferFrequency.Weekly weekly) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(weekly, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PeriodicTransferFrequency.Weekly.onExtraCallbackWithResult(weekly, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 96 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(weekly, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            PeriodicTransferFrequency.Weekly.onExtraCallbackWithResult(weekly, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallback + 119;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
