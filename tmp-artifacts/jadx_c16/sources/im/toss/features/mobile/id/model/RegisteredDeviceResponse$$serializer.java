package im.toss.features.mobile.id.model;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.mobile.id.model.RegisteredDeviceResponse;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RegisteredDeviceResponse$$serializer implements aeu2<RegisteredDeviceResponse> {
    private static int IAuthTabCallback;
    public static final RegisteredDeviceResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {70, 83, 77, 1};
    private static final int $$b = 199;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = (i * 3) + 105;
        byte[] bArr = $$a;
        int i4 = s * 2;
        int i5 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += -i6;
            i2 = i7;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i3 += -i6;
            i2 = i7;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 31;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback = 1;
        onWarmupCompleted();
        RegisteredDeviceResponse$$serializer registeredDeviceResponse$$serializer = new RegisteredDeviceResponse$$serializer();
        INSTANCE = registeredDeviceResponse$$serializer;
        Object[] objArr = new Object[1];
        a(57 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 55 - TextUtils.getOffsetBefore("", 0), new char[]{65483, 17, '\f', 16, 16, 65483, 3, 2, 65534, 17, 18, 15, 2, 16, 65483, '\n', '\f', 65535, 6, '\t', 2, 65483, 6, 1, 65483, '\n', '\f', 1, 2, '\t', 65483, 65519, 2, 4, 6, 16, 17, 2, 15, 2, 1, 65505, 2, 19, 6, 0, 2, 65519, 2, 16, '\r', '\f', 11, 16, 2, 6, '\n'}, false, 229 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), registeredDeviceResponse$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(3 - TextUtils.lastIndexOf("", '0', 0, 0), 3 - TextUtils.lastIndexOf("", '0'), new char[]{65534, 65507, 18, 14}, true, 231 - TextUtils.lastIndexOf("", '0', 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(6 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Process.getGidForName("") + 7, new char[]{65532, 65533, 14, 1, 65531, 65533}, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 234, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        Object[] objArr4 = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, 3 - (Process.myPid() >> 22), new char[]{7, 65532, 7, 65528, 65535}, true, 238 - MotionEvent.axisFromString(""), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(6 - Process.getGidForName(""), 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{'\n', '\n', 65528, 65534, 65532, 4, 65532}, false, 235 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private RegisteredDeviceResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer.INSTANCE), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RegisteredDeviceResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        RegisteredDeviceResponse.ConnectedDeviceInfo connectedDeviceInfo;
        String str2;
        String str3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String str4 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            RegisteredDeviceResponse.ConnectedDeviceInfo connectedDeviceInfo2 = (RegisteredDeviceResponse.ConnectedDeviceInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer.INSTANCE, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str2 = strAsInterface;
            str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            connectedDeviceInfo = connectedDeviceInfo2;
            i = 15;
        } else {
            int i4 = 0;
            boolean z = true;
            RegisteredDeviceResponse.ConnectedDeviceInfo connectedDeviceInfo3 = null;
            String strAsInterface2 = null;
            String str5 = null;
            while (z) {
                int i5 = onExtraCallback + 49;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = onExtraCallback + 105;
                    int i8 = i7 % 128;
                    onNavigationEvent = i8;
                    if (i7 % 2 != 0) {
                        if (iOnNavigationEvent == 0) {
                            connectedDeviceInfo3 = (RegisteredDeviceResponse.ConnectedDeviceInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer.INSTANCE, connectedDeviceInfo3);
                            i4 |= 2;
                            i2 = onExtraCallback + 91;
                            onNavigationEvent = i2 % 128;
                            if (i2 % 2 == 0) {
                                int i9 = 5 / 2;
                            }
                        } else if (iOnNavigationEvent != 2) {
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i4 |= 4;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i8 + 97;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str5);
                            i4 |= 8;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        connectedDeviceInfo3 = (RegisteredDeviceResponse.ConnectedDeviceInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, RegisteredDeviceResponse$ConnectedDeviceInfo$$serializer.INSTANCE, connectedDeviceInfo3);
                        i4 |= 2;
                        i2 = onExtraCallback + 91;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 == 0) {
                        }
                    } else if (iOnNavigationEvent != 2) {
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i4 |= 1;
                }
            }
            i = i4;
            str = str4;
            connectedDeviceInfo = connectedDeviceInfo3;
            str2 = strAsInterface2;
            str3 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new RegisteredDeviceResponse(i, str2, connectedDeviceInfo, str, str3, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m669deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        RegisteredDeviceResponse registeredDeviceResponseDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return registeredDeviceResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull RegisteredDeviceResponse registeredDeviceResponse) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(registeredDeviceResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        RegisteredDeviceResponse.onNavigationEvent(registeredDeviceResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (RegisteredDeviceResponse) obj);
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $10 + 89;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35125), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843);
                    int i11 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2168;
                    byte b = (byte) ($$a[3] - 1);
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, i11, iIndexOf, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i12 = $11 + 15;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i14 = $11 + 115;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12842);
                    int edgeSlop = 55 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int maxKeyCode = 2167 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b3 = (byte) ($$a[3] - 1);
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c, edgeSlop, maxKeyCode, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 478309035;
    }
}
