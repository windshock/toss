package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
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
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class IosAppInstallInfo$$serializer implements aeu2<IosAppInstallInfo> {
    public static final int $stable;
    private static long IAuthTabCallback;
    public static final IosAppInstallInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final byte[] $$a = {79, -25, -14, 102};
    private static final int $$b = 78;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 110 - i2;
        int i5 = 3 - (b * 4);
        int i6 = 1 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = i8;
            i4 = i5 + i7;
            i5 = i9;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            int i10 = i5 + 1;
            i7 = bArr[i10];
            int i11 = i4;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i4 = i5 + i7;
            i5 = i92;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i6) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult = 1;
        onNavigationEvent();
        IosAppInstallInfo$$serializer iosAppInstallInfo$$serializer = new IosAppInstallInfo$$serializer();
        INSTANCE = iosAppInstallInfo$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.IosAppInstallInfo", iosAppInstallInfo$$serializer, 3);
        setanimationsloop.onWarmupCompleted("delaySeconds", true);
        setanimationsloop.onWarmupCompleted("isEnabled", true);
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getTouchSlop() >> 8) + 34415), Gravity.getAbsoluteGravity(0, 0), new char[]{23990, 4003, 64590, 4672}, new char[]{0, 0, 0, 0}, new char[]{44361, 54305, 28525, 64902}, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 27;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private IosAppInstallInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getDynamicHeight.onWarmupCompleted), sp.IAuthTabCallback(getBgColor.IAuthTabCallback), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onTransact + 95;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final IosAppInstallInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        Integer num;
        Boolean bool;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            num = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, (Object) null);
            bool = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 7;
        } else {
            int i5 = 0;
            boolean z = true;
            Integer num2 = null;
            Boolean bool2 = null;
            String str2 = null;
            while (z) {
                int i6 = onTransact + 41;
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    num2 = (Integer) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getDynamicHeight.onWarmupCompleted, num2);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getBgColor.IAuthTabCallback, bool2);
                    i5 |= 2;
                } else {
                    if (iOnNavigationEvent != 2) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                    i5 |= 4;
                }
            }
            num = num2;
            bool = bool2;
            str = str2;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        IosAppInstallInfo iosAppInstallInfo = new IosAppInstallInfo(i, num, bool, str, (okycx) null);
        int i7 = onTransact + 69;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            return iosAppInstallInfo;
        }
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m14deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IosAppInstallInfo iosAppInstallInfoDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        int i5 = asBinder + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return iosAppInstallInfoDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull IosAppInstallInfo iosAppInstallInfo) {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(iosAppInstallInfo, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            IosAppInstallInfo.onExtraCallbackWithResult(iosAppInstallInfo, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(iosAppInstallInfo, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        IosAppInstallInfo.onExtraCallbackWithResult(iosAppInstallInfo, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (IosAppInstallInfo) obj);
        int i4 = asBinder + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $11 + 89;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 43 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1451, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 49123), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 50 - ((Process.getThreadPriority(0) + 20) >> 6), 22939 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    i2 = 2;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 45849), Color.argb(0, 0, 0, 0) + 29, 12577 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onExtraCallback ^ 7798559133331975163L))) ^ ((char) (onWarmupCompleted ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i9 = $11 + 113;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i3 = i2;
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

    static void onNavigationEvent() {
        IAuthTabCallback = 7798559133331975163L;
        onExtraCallback = -1776194565;
        onWarmupCompleted = (char) 40487;
    }
}
