package viva.republica.toss.network.model.serviceManagement.marketingNotifications;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
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

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class StdConsentModuleCodes$$serializer implements aeu2<StdConsentModuleCodes> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    public static final StdConsentModuleCodes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 101;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        StdConsentModuleCodes$$serializer stdConsentModuleCodes$$serializer = new StdConsentModuleCodes$$serializer();
        INSTANCE = stdConsentModuleCodes$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes", stdConsentModuleCodes$$serializer, 4);
        Object[] objArr = new Object[1];
        a(new char[]{16806, 16854, 30658, 57651, 8433, 39977, 13948, 57923}, View.resolveSizeAndState(0, 0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("sms", true);
        setanimationsloop.onWarmupCompleted("email", true);
        setanimationsloop.onWarmupCompleted("integrated", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 109;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private StdConsentModuleCodes$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        StdConsentModuleCodes stdConsentModuleCodesM71deserialize = m71deserialize(decoder);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = onWarmupCompleted + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return stdConsentModuleCodesM71deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes m71deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r20) throws kotlinx.serialization.UnknownFieldException {
        /*
            r19 = this;
            r0 = r20
            r1 = 2
            int r2 = r1 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 3
            r5 = 0
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L48
            int r3 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.onExtraCallback
            int r3 = r3 + 107
            int r8 = r3 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.onWarmupCompleted = r8
            int r3 = r3 % r1
            o.getWriggleLayout r3 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r5 = r0.onExtraCallbackWithResult(r2, r5, r3, r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.onExtraCallbackWithResult(r2, r6, r3, r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r0.onExtraCallbackWithResult(r2, r1, r3, r7)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.onExtraCallbackWithResult(r2, r4, r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 15
            r16 = r1
            r17 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            goto La7
        L48:
            r3 = r5
            r11 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L4d:
            if (r11 == 0) goto La0
            int r12 = r0.onNavigationEvent(r2)
            r13 = -1
            if (r12 == r13) goto L9e
            if (r12 == 0) goto L93
            int r13 = viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.onWarmupCompleted
            int r13 = r13 + 87
            int r14 = r13 % 128
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.onExtraCallback = r14
            int r13 = r13 % r1
            if (r13 != 0) goto L66
            if (r12 == r6) goto L88
            goto L68
        L66:
            if (r12 == r6) goto L88
        L68:
            if (r12 == r1) goto L7d
            if (r12 != r4) goto L77
            o.getWriggleLayout r12 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r8 = r0.onExtraCallbackWithResult(r2, r4, r12, r8)
            java.lang.String r8 = (java.lang.String) r8
            r3 = r3 | 8
            goto L4d
        L77:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r12)
            throw r0
        L7d:
            o.getWriggleLayout r12 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r7 = r0.onExtraCallbackWithResult(r2, r1, r12, r7)
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 | 4
            goto L4d
        L88:
            o.getWriggleLayout r12 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r10 = r0.onExtraCallbackWithResult(r2, r6, r12, r10)
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 2
            goto L4d
        L93:
            o.getWriggleLayout r12 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r9 = r0.onExtraCallbackWithResult(r2, r5, r12, r9)
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 1
            goto L4d
        L9e:
            r11 = r5
            goto L4d
        La0:
            r13 = r3
            r16 = r7
            r17 = r8
            r14 = r9
            r15 = r10
        La7:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes r0 = new viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes$$serializer.m71deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.serviceManagement.marketingNotifications.StdConsentModuleCodes");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (StdConsentModuleCodes) obj);
        int i4 = onExtraCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull StdConsentModuleCodes stdConsentModuleCodes) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stdConsentModuleCodes, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        StdConsentModuleCodes.IAuthTabCallback(stdConsentModuleCodes, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 69;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45812), 84 - (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myPid() >> 22) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.keyCodeFromString("") + 19, TextUtils.getOffsetAfter("", 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onExtraCallback() {
        IAuthTabCallback = 5971126773029048466L;
    }
}
