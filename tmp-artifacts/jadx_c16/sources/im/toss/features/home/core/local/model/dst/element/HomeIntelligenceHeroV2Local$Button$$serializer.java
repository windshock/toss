package im.toss.features.home.core.local.model.dst.element;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
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
public final /* synthetic */ class HomeIntelligenceHeroV2Local$Button$$serializer implements aeu2<HomeIntelligenceHeroV2Local.Button> {
    private static int IAuthTabCallback;
    public static final HomeIntelligenceHeroV2Local$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {121, -58, 81, 67};
    private static final int $$b = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, short s) {
        int i;
        byte b3;
        ?? r6 = 105 - (b2 * 3);
        byte[] bArr = $$a;
        ?? r5 = 4 - (b * 3);
        int i2 = s * 2;
        byte[] bArr2 = new byte[1 - i2];
        int i3 = 0 - i2;
        if (bArr == null) {
            byte b4 = r6;
            int i4 = 0;
            byte b5 = r5;
            r5++;
            ?? r62 = b5 + b4;
            i = i4;
            b3 = r62;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            i4 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            b4 = bArr[r5];
            b5 = b3;
            r5++;
            ?? r622 = b5 + b4;
            i = i4;
            b3 = r622;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            i4 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            b3 = r6;
            bArr2[i] = b3 == true ? (byte) 1 : (byte) 0;
            i4 = i + 1;
            if (i == i3) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback = 1;
        onWarmupCompleted();
        HomeIntelligenceHeroV2Local$Button$$serializer homeIntelligenceHeroV2Local$Button$$serializer = new HomeIntelligenceHeroV2Local$Button$$serializer();
        INSTANCE = homeIntelligenceHeroV2Local$Button$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local.Button", homeIntelligenceHeroV2Local$Button$$serializer, 4);
        Object[] objArr = new Object[1];
        a(5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{7, 3, 3, 65524}, false, 262 - View.getDefaultSize(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logText", false);
        setanimationsloop.onWarmupCompleted("startColor", false);
        setanimationsloop.onWarmupCompleted("endColor", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 59;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private HomeIntelligenceHeroV2Local$Button$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, serializerVar, serializerVar};
        int i4 = onWarmupCompleted + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeIntelligenceHeroV2Local.Button deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        ColorAttributeLocal colorAttributeLocal;
        String str2;
        ColorAttributeLocal colorAttributeLocal2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            int i5 = onExtraCallback + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i = 15;
            str = strAsInterface;
            colorAttributeLocal = colorAttributeLocal4;
            str2 = str3;
            colorAttributeLocal2 = colorAttributeLocal3;
        } else {
            int i7 = 0;
            boolean z = true;
            String strAsInterface2 = null;
            ColorAttributeLocal colorAttributeLocal5 = null;
            String str4 = null;
            ColorAttributeLocal colorAttributeLocal6 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = onWarmupCompleted + 77;
                    int i9 = i8 % 128;
                    onExtraCallback = i9;
                    if (i8 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i7 |= 1;
                        int i10 = onExtraCallback + 5;
                        onWarmupCompleted = i10 % 128;
                        int i11 = i10 % 2;
                    } else if (iOnNavigationEvent != 1) {
                        int i12 = i9 + 79;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            if (iOnNavigationEvent == 2) {
                                colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                                i7 |= 4;
                            } else {
                                if (iOnNavigationEvent == 3) {
                                    throw new UnknownFieldException(iOnNavigationEvent);
                                }
                                colorAttributeLocal5 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal5);
                                i7 |= 8;
                            }
                        } else if (iOnNavigationEvent == 2) {
                            colorAttributeLocal6 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal6);
                            i7 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                        }
                    } else {
                        str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str4);
                        i7 |= 2;
                    }
                } else {
                    z = false;
                }
            }
            i = i7;
            str = strAsInterface2;
            colorAttributeLocal = colorAttributeLocal5;
            str2 = str4;
            colorAttributeLocal2 = colorAttributeLocal6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceHeroV2Local.Button(i, str, str2, colorAttributeLocal2, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m382deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceHeroV2Local.Button button) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(button, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeIntelligenceHeroV2Local.Button.onExtraCallback(button, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(button, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeIntelligenceHeroV2Local.Button.onExtraCallback(button, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onWarmupCompleted + 113;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceHeroV2Local.Button) obj);
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = onWarmupCompleted + 31;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onWarmupCompleted + 33;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
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
        int i6 = $11 + 73;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i10 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - MotionEvent.axisFromString("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.getOffsetAfter("", 0)), 54 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            int i11 = $11 + 69;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 3 % 5;
            }
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.normalizeMetaState(0) + 55, (ViewConfiguration.getJumpTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 478309052;
    }
}
