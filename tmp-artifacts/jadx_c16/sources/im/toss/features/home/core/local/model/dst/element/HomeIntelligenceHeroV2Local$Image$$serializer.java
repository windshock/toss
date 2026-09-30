package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local;
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
public final /* synthetic */ class HomeIntelligenceHeroV2Local$Image$$serializer implements aeu2<HomeIntelligenceHeroV2Local.Image> {
    public static final HomeIntelligenceHeroV2Local$Image$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {7, 75, -84, -52};
    private static final int $$b = 171;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;

    private static String $$c(short s, byte b, int i) {
        int i2 = 105 - (s * 4);
        int i3 = b * 4;
        int i4 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 17;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult = 1;
        IAuthTabCallback();
        HomeIntelligenceHeroV2Local$Image$$serializer homeIntelligenceHeroV2Local$Image$$serializer = new HomeIntelligenceHeroV2Local$Image$$serializer();
        INSTANCE = homeIntelligenceHeroV2Local$Image$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local.Image", homeIntelligenceHeroV2Local$Image$$serializer, 2);
        Object[] objArr = new Object[1];
        a(Color.red(0) + 3, TextUtils.getCapsMode("", 0, 0) + 1, new char[]{65529, 5, 2}, false, Color.alpha(0) + 286, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("darkUri", false);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 117;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private HomeIntelligenceHeroV2Local$Image$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer)};
        int i4 = IAuthTabCallback + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final HomeIntelligenceHeroV2Local.Image deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            i = 3;
        } else {
            String strAsInterface2 = null;
            String str2 = null;
            int i4 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = IAuthTabCallback + 27;
                    int i6 = i5 % 128;
                    onNavigationEvent = i6;
                    int i7 = i5 % 2;
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i4 |= 1;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i8 = i6 + 43;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i4 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface2;
            str = str2;
            i = i4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceHeroV2Local.Image(i, strAsInterface, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m383deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeIntelligenceHeroV2Local.Image imageDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return imageDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceHeroV2Local.Image image) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(image, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeIntelligenceHeroV2Local.Image.IAuthTabCallback(image, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceHeroV2Local.Image) obj);
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 43 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35124), Gravity.getAbsoluteGravity(0, 0) + 23, TextUtils.lastIndexOf("", '0', 0) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - Color.argb(0, 0, 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 55, Color.rgb(0, 0, 0) + 16779383, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i7 = $10 + 125;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12843), TextUtils.indexOf("", c, 0) + 56, 2167 - (Process.myPid() >> 22), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = '0';
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i8 = $10 + 119;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = 478308999;
    }
}
