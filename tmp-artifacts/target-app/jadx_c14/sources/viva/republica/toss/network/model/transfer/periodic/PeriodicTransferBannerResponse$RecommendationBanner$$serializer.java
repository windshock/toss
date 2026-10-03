package viva.republica.toss.network.model.transfer.periodic;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class PeriodicTransferBannerResponse$RecommendationBanner$$serializer implements aeu2<PeriodicTransferBannerResponse.RecommendationBanner> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final PeriodicTransferBannerResponse$RecommendationBanner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 96 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        PeriodicTransferBannerResponse$RecommendationBanner$$serializer periodicTransferBannerResponse$RecommendationBanner$$serializer = new PeriodicTransferBannerResponse$RecommendationBanner$$serializer();
        INSTANCE = periodicTransferBannerResponse$RecommendationBanner$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner", periodicTransferBannerResponse$RecommendationBanner$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{37161, 37213, 61120, 64499, 51852, 57420, 59606, 43188, 50212}, ViewConfiguration.getScrollBarSize() >> 8, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{64611, 64519, 59610, 64997, 55440, 62039, 2872, 19285, 43385, 33393, 29243, 56919, 22234, 10399, 10173}, Color.alpha(0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr3 = new Object[1];
        a(new char[]{26437, 26407, 42857, 45638, 28919, 23095, 65155, 48889, 12866, 52677}, ViewConfiguration.getScrollBarSize() >> 8, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 57;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PeriodicTransferBannerResponse$RecommendationBanner$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(PeriodicTransferBannerResponse$Button$$serializer.INSTANCE);
            kSerializerArr = new KSerializer[5];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[0] = getwrigglelayout;
            kSerializerArr[2] = getwrigglelayout;
            kSerializerArr[5] = kSerializerIAuthTabCallback;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(PeriodicTransferBannerResponse$Button$$serializer.INSTANCE);
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2, getwrigglelayout2, kSerializerIAuthTabCallback2};
        }
        int i3 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return m130deserialize(decoder);
        }
        m130deserialize(decoder);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.RecommendationBanner m130deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r21) throws kotlinx.serialization.UnknownFieldException {
        /*
            r20 = this;
            r0 = r21
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L39
            java.lang.String r3 = r0.asInterface(r2, r5)
            java.lang.String r5 = r0.asInterface(r2, r7)
            java.lang.String r1 = r0.asInterface(r2, r1)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer r7 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer.INSTANCE
            java.lang.Object r4 = r0.onExtraCallbackWithResult(r2, r4, r7, r6)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r4 = (viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button) r4
            r6 = 15
            r17 = r1
            r15 = r3
            r18 = r4
            r16 = r5
            r14 = r6
            goto L4a
        L39:
            r10 = r5
            r3 = r6
            r8 = r3
            r9 = r8
            r11 = r7
        L3e:
            r12 = r11 ^ 1
            if (r12 == 0) goto L56
            r16 = r3
            r17 = r6
            r15 = r8
            r18 = r9
            r14 = r10
        L4a:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner r0 = new viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner
            r19 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            return r0
        L56:
            int r12 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onExtraCallbackWithResult
            int r12 = r12 + 117
            int r13 = r12 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onNavigationEvent = r13
            int r12 = r12 % r1
            int r12 = r0.onNavigationEvent(r2)
            r13 = -1
            if (r12 == r13) goto Lc0
            if (r12 == 0) goto Laf
            if (r12 == r7) goto La8
            int r13 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onExtraCallbackWithResult
            int r13 = r13 + 69
            int r14 = r13 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onNavigationEvent = r14
            int r13 = r13 % r1
            if (r13 == 0) goto L79
            r13 = 5
            if (r12 == r13) goto La1
            goto L7b
        L79:
            if (r12 == r1) goto La1
        L7b:
            if (r12 != r4) goto L9b
            int r14 = r14 + 87
            int r12 = r14 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onExtraCallbackWithResult = r12
            int r14 = r14 % r1
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer r12 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button$$serializer.INSTANCE
            if (r14 != 0) goto L92
            r13 = 4
            java.lang.Object r9 = r0.onExtraCallbackWithResult(r2, r13, r12, r9)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r9 = (viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button) r9
            r10 = r10 | 72
            goto L3e
        L92:
            java.lang.Object r9 = r0.onExtraCallbackWithResult(r2, r4, r12, r9)
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$Button r9 = (viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse.Button) r9
            r10 = r10 | 8
            goto L3e
        L9b:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        La1:
            java.lang.String r6 = r0.asInterface(r2, r1)
            r10 = r10 | 4
            goto L3e
        La8:
            java.lang.String r3 = r0.asInterface(r2, r7)
            r10 = r10 | 2
            goto L3e
        Laf:
            java.lang.String r8 = r0.asInterface(r2, r5)
            r10 = r10 | 1
            int r12 = viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onExtraCallbackWithResult
            int r12 = r12 + 103
            int r13 = r12 % 128
            viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.onNavigationEvent = r13
            int r12 = r12 % r1
            goto L3e
        Lc0:
            r11 = r5
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner$$serializer.m130deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.periodic.PeriodicTransferBannerResponse$RecommendationBanner");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (PeriodicTransferBannerResponse.RecommendationBanner) obj);
        int i4 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull PeriodicTransferBannerResponse.RecommendationBanner recommendationBanner) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(recommendationBanner, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            PeriodicTransferBannerResponse.RecommendationBanner.onWarmupCompleted(recommendationBanner, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recommendationBanner, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        PeriodicTransferBannerResponse.RecommendationBanner.onWarmupCompleted(recommendationBanner, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 81 / 0;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 29;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 45812), 84 - (ViewConfiguration.getScrollBarSize() >> 8), 21233 - (ViewConfiguration.getLongPressTimeout() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14184), 18 - TextUtils.lastIndexOf("", '0'), 8808 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 23;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onExtraCallback = 9031254562443193942L;
    }
}
