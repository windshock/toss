package viva.republica.toss.common.web.message.handlers.tossbank.ssenstone;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class OtpCredential$Card$PendingMigration_5_255_256$$serializer implements aeu2<OtpCredential.Card.PendingMigration_5_255_256> {
    public static final int $stable;
    private static int IAuthTabCallback;
    public static final OtpCredential$Card$PendingMigration_5_255_256$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static long onNavigationEvent;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;

    private static String $$c(byte b, int i, short s) {
        int i2 = i * 4;
        byte[] bArr = $$a;
        int i3 = 3 - (s * 4);
        int i4 = b + 109;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += -i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            i4 += -bArr[i7];
            i3 = i7;
            i5 = i6;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback = 1;
        onExtraCallbackWithResult();
        OtpCredential$Card$PendingMigration_5_255_256$$serializer otpCredential$Card$PendingMigration_5_255_256$$serializer = new OtpCredential$Card$PendingMigration_5_255_256$$serializer();
        INSTANCE = otpCredential$Card$PendingMigration_5_255_256$$serializer;
        $stable = 8;
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{28581, 56862, 53795, 62165, 21957, 40738, 8687, 20626, 3714, 22448, 25540, 64268, 63696, 44711, 39445, 34469, 50967, 25495, 38615, 7727, 30628, 45647, 12164, 11075, 38081, 1114, 32742, 49858, 741, 10037, 16987, 44804, 41607, 65444, 50412, 41823, 28156, 64405, 41709, 6417, 39712, 14596, 6842, 23447, 50704, 55723, 24356, 35849, 36245, 35068, 53970, 780, 18044, 29230, 11750, 22819, 16139, 1850, 18359, 25876, 42264, 19586, 65359, 49060, 57339, 47854, 6369, 28743, 29406, 56296, 41818, 19071, 59635, 28207, 4687, 64460, 63221, 43702, 12458, 54047, 29131, 17166, 17100, 22413, 61777, 34457, 27465, 46740, 5268, 47359, 10439, 30636, 36675, 35227, 17368, 27558, 19264, 37328, 29982, 5735, 43864, 20317, 35473, 53718, 64002, 17570, 2733, 11177, 40459, 56388, 40336, 513}, new char[]{0, 0, 0, 0}, new char[]{51846, 46615, 52263, 14809}, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), otpCredential$Card$PendingMigration_5_255_256$$serializer, 3);
        Object[] objArr2 = new Object[1];
        a((char) (11669 - Process.getGidForName("")), ExpandableListView.getPackedPositionGroup(0L), new char[]{16681, 55063, 48219, 56944, 20140, 47395}, new char[]{0, 0, 0, 0}, new char[]{32624, 58539, 38582, 19245}, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a((char) (48036 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), ViewConfiguration.getLongPressTimeout() >> 16, new char[]{53459, 31319, 10026, 19803}, new char[]{0, 0, 0, 0}, new char[]{22013, 49103, 42162, 46011}, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a((char) (26890 - TextUtils.indexOf("", "", 0)), KeyEvent.getMaxKeyCode() >> 16, new char[]{1476, 11684, 39717, 52576}, new char[]{0, 0, 0, 0}, new char[]{8398, 53926, 2660, 41065}, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private OtpCredential$Card$PendingMigration_5_255_256$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        OtpCredential.Card.PendingMigration_5_255_256 pendingMigration_5_255_256M6deserialize = m6deserialize(decoder);
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return pendingMigration_5_255_256M6deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential.Card.PendingMigration_5_255_256 m6deserialize(@org.jetbrains.annotations.NotNull kotlinx.serialization.encoding.Decoder r17) throws kotlinx.serialization.UnknownFieldException {
        /*
            r16 = this;
            r0 = r17
            r1 = 2
            int r2 = r1 % r1
            int r2 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.asInterface
            int r2 = r2 + 19
            int r3 = r2 % 128
            viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.IAuthTabCallbackDefault = r3
            int r2 = r2 % r1
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.descriptor
            o.yw r0 = r0.onWarmupCompleted(r2)
            boolean r3 = r0.extraCallbackWithResult()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            java.lang.String r3 = r0.asInterface(r2, r4)
            java.lang.String r4 = r0.asInterface(r2, r5)
            java.lang.String r1 = r0.asInterface(r2, r1)
            r5 = 7
            r14 = r1
            r12 = r3
            r13 = r4
            r11 = r5
            goto L8d
        L34:
            r3 = 0
            r6 = r3
            r7 = r6
            r8 = r4
            r9 = r5
        L39:
            if (r9 == 0) goto L89
            int r10 = r0.onNavigationEvent(r2)
            r11 = -1
            if (r10 == r11) goto L87
            int r11 = viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.IAuthTabCallbackDefault
            int r12 = r11 + 17
            int r13 = r12 % 128
            viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.asInterface = r13
            int r12 = r12 % r1
            if (r10 == 0) goto L80
            int r11 = r11 + 67
            int r12 = r11 % 128
            viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.asInterface = r12
            int r11 = r11 % r1
            if (r11 == 0) goto L59
            if (r10 == 0) goto L7b
            goto L5b
        L59:
            if (r10 == r5) goto L7b
        L5b:
            if (r10 != r1) goto L75
            int r12 = r12 + 29
            int r3 = r12 % 128
            viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.IAuthTabCallbackDefault = r3
            int r12 = r12 % r1
            if (r12 != 0) goto L6e
            r3 = 4
            java.lang.String r3 = r0.asInterface(r2, r3)
        L6b:
            r8 = r8 | 2
            goto L39
        L6e:
            java.lang.String r3 = r0.asInterface(r2, r1)
            r8 = r8 | 4
            goto L39
        L75:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L7b:
            java.lang.String r7 = r0.asInterface(r2, r5)
            goto L6b
        L80:
            java.lang.String r6 = r0.asInterface(r2, r4)
            r8 = r8 | 1
            goto L39
        L87:
            r9 = r4
            goto L39
        L89:
            r14 = r3
            r12 = r6
            r13 = r7
            r11 = r8
        L8d:
            r0.onExtraCallbackWithResult(r2)
            viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256 r0 = new viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256$$serializer.m6deserialize(kotlinx.serialization.encoding.Decoder):viva.republica.toss.common.web.message.handlers.tossbank.ssenstone.OtpCredential$Card$PendingMigration_5_255_256");
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OtpCredential.Card.PendingMigration_5_255_256) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OtpCredential.Card.PendingMigration_5_255_256 pendingMigration_5_255_256) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(pendingMigration_5_255_256, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OtpCredential.Card.PendingMigration_5_255_256.onExtraCallback(pendingMigration_5_255_256, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pendingMigration_5_255_256, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OtpCredential.Card.PendingMigration_5_255_256.onExtraCallback(pendingMigration_5_255_256, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 85;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $10 + 9;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 113;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 43, (ViewConfiguration.getScrollBarSize() >> 8) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), View.resolveSizeAndState(0, 0, 0) + 44, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 23973), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, 22939 - (ViewConfiguration.getLongPressTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf("", "", 0, 0)), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), 12577 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = 7798559133331975163L;
        onExtraCallback = -1776194565;
        onWarmupCompleted = (char) 53959;
    }
}
