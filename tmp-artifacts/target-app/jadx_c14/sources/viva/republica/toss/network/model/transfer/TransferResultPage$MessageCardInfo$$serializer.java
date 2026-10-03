package viva.republica.toss.network.model.transfer;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import im.toss.features.transfer.message_card.library.model.TransferMessageCardColor$;
import im.toss.features.transfer.message_card.library.model.TransferMessageCardGradient$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.TransferResultPage;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class TransferResultPage$MessageCardInfo$$serializer implements aeu2<TransferResultPage.MessageCardInfo> {
    public static final int $stable;
    private static char[] IAuthTabCallback;
    public static final TransferResultPage$MessageCardInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onNavigationEvent;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {0, Byte.MIN_VALUE, 34, -14, 68};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = 97 - r9
            byte[] r0 = viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$$serializer.$$a
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = r7 + 5
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$$serializer.$$c(int, short, short):java.lang.String");
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 25;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 21;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 59697), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 46135), Drawable.resolveOpacity(0, 0) + 31, 20220 - (ViewConfiguration.getLongPressTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123);
                    int longPressTimeout = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1494;
                    byte b = $$a[0];
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(touchSlop, longPressTimeout, longPressTimeout2, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i7 = $11 + 49;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49124);
                int iNormalizeMetaState = 44 - KeyEvent.normalizeMetaState(0);
                int iIndexOf = 1494 - TextUtils.indexOf("", "", 0);
                byte b3 = $$a[0];
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(modifierMetaStateMask, iNormalizeMetaState, iIndexOf, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    static {
        onNavigationEvent = 0;
        onNavigationEvent();
        TransferResultPage$MessageCardInfo$$serializer transferResultPage$MessageCardInfo$$serializer = new TransferResultPage$MessageCardInfo$$serializer();
        INSTANCE = transferResultPage$MessageCardInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo", transferResultPage$MessageCardInfo$$serializer, 5);
        setanimationsloop.onWarmupCompleted("messageCardId", true);
        Object[] objArr = new Object[1];
        a(KeyEvent.getMaxKeyCode() >> 16, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, (char) (18253 - (KeyEvent.getMaxKeyCode() >> 16)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("resource", true);
        setanimationsloop.onWarmupCompleted("strokeColor", true);
        setanimationsloop.onWarmupCompleted("gradient", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 17;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private TransferResultPage$MessageCardInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = TransferResultPage.MessageCardInfo.onNavigationEvent();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[2].getValue()), sp.IAuthTabCallback(TransferMessageCardColor$.serializer.INSTANCE), sp.IAuthTabCallback(TransferMessageCardGradient$.serializer.INSTANCE)};
        int i4 = onExtraCallback + 101;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TransferResultPage.MessageCardInfo messageCardInfoM114deserialize = m114deserialize(decoder);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        int i5 = onExtraCallback + 27;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return messageCardInfoM114deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.network.model.transfer.TransferResultPage.MessageCardInfo m114deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r25) throws kotlinx.serialization.UnknownFieldException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo$$serializer.m114deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.network.model.transfer.TransferResultPage$MessageCardInfo");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferResultPage.MessageCardInfo) obj);
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferResultPage.MessageCardInfo messageCardInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(messageCardInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferResultPage.MessageCardInfo.onExtraCallback(messageCardInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 75;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 123;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = asBinder + 11;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{43757, 21012, 23345, 16469};
        onWarmupCompleted = -2110386795946109636L;
    }
}
