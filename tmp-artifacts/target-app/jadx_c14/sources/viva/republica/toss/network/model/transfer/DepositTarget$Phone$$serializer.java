package viva.republica.toss.network.model.transfer;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
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
import viva.republica.toss.network.model.transfer.DepositTarget;
import viva.republica.toss.network.model.transfer.DepositTarget$Account$$serializer;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class DepositTarget$Phone$$serializer implements aeu2<DepositTarget.Phone> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final DepositTarget$Phone$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            serialDescriptor = descriptor;
            int i4 = 90 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        DepositTarget$Phone$$serializer depositTarget$Phone$$serializer = new DepositTarget$Phone$$serializer();
        INSTANCE = depositTarget$Phone$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("PHONE", depositTarget$Phone$$serializer, 2);
        setanimationsloop.onWarmupCompleted("phone", false);
        setanimationsloop.onWarmupCompleted("reserveKey", true);
        Object[] objArr = new Object[1];
        a(new char[]{35842, 11075, 64318, 35958, 13113, 53965, 2208, 57017}, 1 - Drawable.resolveOpacity(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(new DepositTarget$Account$$serializer.IAuthTabCallback(((String) objArr[0]).intern()));
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 29;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DepositTarget$Phone$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout), getwrigglelayout};
        } else {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m80deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        DepositTarget.Phone phoneM80deserialize = m80deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return phoneM80deserialize;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.DepositTarget.Phone m80deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r13) throws kotlinx.serialization.UnknownFieldException {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallbackWithResult
            int r1 = r1 + 69
            int r2 = r1 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallback = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L8b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r1)
            boolean r2 = r13.extraCallbackWithResult()
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L30
            java.lang.String r0 = r13.asInterface(r1, r4)
            o.getWriggleLayout r2 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r2 = r13.onExtraCallbackWithResult(r1, r5, r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 3
            goto L82
        L30:
            r2 = r3
            r6 = r2
            r7 = r4
            r8 = r5
        L34:
            if (r8 == 0) goto L7f
            int r9 = viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallbackWithResult
            int r9 = r9 + 99
            int r10 = r9 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallback = r10
            int r9 = r9 % 2
            if (r9 != 0) goto L78
            int r9 = r13.onNavigationEvent(r1)
            r10 = -1
            if (r9 == r10) goto L76
            int r10 = viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallback
            int r10 = r10 + 63
            int r11 = r10 % 128
            viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.onExtraCallbackWithResult = r11
            int r10 = r10 % r0
            if (r10 != 0) goto L5a
            r10 = 53
            int r10 = r10 / r4
            if (r9 == 0) goto L6f
            goto L5c
        L5a:
            if (r9 == 0) goto L6f
        L5c:
            if (r9 != r5) goto L69
            o.getWriggleLayout r9 = o.getWriggleLayout.onNavigationEvent
            java.lang.Object r6 = r13.onExtraCallbackWithResult(r1, r5, r9, r6)
            java.lang.String r6 = (java.lang.String) r6
            r7 = r7 | 2
            goto L34
        L69:
            kotlinx.serialization.UnknownFieldException r13 = new kotlinx.serialization.UnknownFieldException
            r13.<init>(r9)
            throw r13
        L6f:
            java.lang.String r2 = r13.asInterface(r1, r4)
            r7 = r7 | 1
            goto L34
        L76:
            r8 = r4
            goto L34
        L78:
            r13.onNavigationEvent(r1)
            r3.hashCode()
            throw r3
        L7f:
            r0 = r2
            r2 = r6
            r4 = r7
        L82:
            r13.onExtraCallbackWithResult(r1)
            viva.republica.toss.network.model.transfer.DepositTarget$Phone r13 = new viva.republica.toss.network.model.transfer.DepositTarget$Phone
            r13.<init>(r4, r0, r2, r3)
            return r13
        L8b:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.descriptor
            o.yw r13 = r13.onWarmupCompleted(r0)
            r13.extraCallbackWithResult()
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.DepositTarget$Phone$$serializer.m80deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.DepositTarget$Phone");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTarget.Phone) obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTarget.Phone phone) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(phone, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTarget.Phone.onExtraCallback(phone, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onNavigationEvent ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 5;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getOffsetBefore("", 0) + 84, Color.blue(0) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.alpha(0)), 19 - ((Process.getThreadPriority(0) + 20) >> 6), 8808 - KeyEvent.normalizeMetaState(0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 117;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 296571714625307387L;
    }
}
