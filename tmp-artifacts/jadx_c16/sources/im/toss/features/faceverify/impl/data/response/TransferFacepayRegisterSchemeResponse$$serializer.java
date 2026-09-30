package im.toss.features.faceverify.impl.data.response;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
public final /* synthetic */ class TransferFacepayRegisterSchemeResponse$$serializer implements aeu2<TransferFacepayRegisterSchemeResponse> {
    public static final int $stable;
    public static final TransferFacepayRegisterSchemeResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static final byte[] $$a = {115, -125, 45, -41};
    private static final int $$b = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, int i2) {
        int i3;
        int i4;
        int i5 = (i * 2) + 1;
        int i6 = 105 - (i2 * 3);
        int i7 = 3 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            int i9 = i7;
            i4 = 0;
            int i10 = i7 + (-i8);
            i3 = i4;
            int i11 = i9;
            i6 = i10;
            i7 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i12 = i7 + 1;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i12];
            int i13 = i6;
            i9 = i12;
            i7 = i13;
            int i102 = i7 + (-i8);
            i3 = i4;
            int i112 = i9;
            i6 = i102;
            i7 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i122 = i7 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            int i1222 = i7 + 1;
            if (i4 == i5) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult = 0;
        onWarmupCompleted();
        TransferFacepayRegisterSchemeResponse$$serializer transferFacepayRegisterSchemeResponse$$serializer = new TransferFacepayRegisterSchemeResponse$$serializer();
        INSTANCE = transferFacepayRegisterSchemeResponse$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.faceverify.impl.data.response.TransferFacepayRegisterSchemeResponse", transferFacepayRegisterSchemeResponse$$serializer, 1);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, ((Process.getThreadPriority(0) + 20) >> 6) + 4, new char[]{0, 65533, 5, 65533, 11, 65531}, false, (ViewConfiguration.getLongPressTimeout() >> 16) + 207, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    private TransferFacepayRegisterSchemeResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onWarmupCompleted + 71;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final TransferFacepayRegisterSchemeResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onExtraCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            int i5 = onExtraCallback + 115;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            boolean z = true;
            str = null;
            loop0: while (true) {
                int i7 = 0;
                while (z) {
                    int i8 = onWarmupCompleted + 23;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                        throw null;
                    }
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent != -1) {
                        int i9 = onWarmupCompleted + 51;
                        int i10 = i9 % 128;
                        onExtraCallback = i10;
                        int i11 = i9 % 2;
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i12 = i10 + 29;
                        onWarmupCompleted = i12 % 128;
                        int i13 = i12 % 2;
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str);
                        if (i13 != 0) {
                            break;
                        }
                        i7 = 1;
                    } else {
                        z = false;
                    }
                }
                i2 = i7;
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new TransferFacepayRegisterSchemeResponse(i2, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m243deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull TransferFacepayRegisterSchemeResponse transferFacepayRegisterSchemeResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transferFacepayRegisterSchemeResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        TransferFacepayRegisterSchemeResponse.onNavigationEvent(transferFacepayRegisterSchemeResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 23;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (TransferFacepayRegisterSchemeResponse) obj);
        int i4 = onExtraCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 41;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
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
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + 23, 10278 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 12843), 55 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2167 - KeyEvent.normalizeMetaState(0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 27;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 105;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ImageFormat.getBitsPerPixel(0)), 55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            int i11 = $11 + 87;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onNavigationEvent = 478308942;
    }
}
