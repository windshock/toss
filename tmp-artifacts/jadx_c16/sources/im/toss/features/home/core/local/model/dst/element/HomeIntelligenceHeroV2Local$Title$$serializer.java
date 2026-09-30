package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
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
public final /* synthetic */ class HomeIntelligenceHeroV2Local$Title$$serializer implements aeu2<HomeIntelligenceHeroV2Local.Title> {
    private static int IAuthTabCallback;
    public static final HomeIntelligenceHeroV2Local$Title$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static final byte[] $$a = {102, 29, -34, 39};
    private static final int $$b = 222;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = (b * 4) + 1;
        int i5 = b2 + 4;
        byte[] bArr = $$a;
        int i6 = 105 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += i7;
            i2 = i3;
            int i8 = i5;
            int i9 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i9;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i8 + 1;
            i5 = i10;
            i6 = bArr[i10];
            i7 = i9;
            i6 += i7;
            i2 = i3;
            int i82 = i5;
            int i92 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i92;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5;
            int i922 = i6;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i922;
            if (i3 == i4) {
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult = 1;
        onExtraCallback();
        HomeIntelligenceHeroV2Local$Title$$serializer homeIntelligenceHeroV2Local$Title$$serializer = new HomeIntelligenceHeroV2Local$Title$$serializer();
        INSTANCE = homeIntelligenceHeroV2Local$Title$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.HomeIntelligenceHeroV2Local.Title", homeIntelligenceHeroV2Local$Title$$serializer, 4);
        Object[] objArr = new Object[1];
        a(3 - ImageFormat.getBitsPerPixel(0), -TextUtils.lastIndexOf("", '0', 0), new char[]{3, 3, 7, 65524}, true, Color.blue(0) + 130, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("logText", false);
        setanimationsloop.onWarmupCompleted("startColor", false);
        setanimationsloop.onWarmupCompleted("endColor", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private HomeIntelligenceHeroV2Local$Title$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializerIAuthTabCallback, serializerVar, serializerVar};
        int i4 = onNavigationEvent + 93;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeIntelligenceHeroV2Local.Title deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        ColorAttributeLocal colorAttributeLocal;
        int i;
        ColorAttributeLocal colorAttributeLocal2;
        String str;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        ColorAttributeLocal colorAttributeLocal3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            i = 0;
            boolean z = true;
            String str2 = null;
            strAsInterface = null;
            colorAttributeLocal = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i5 = onNavigationEvent + 101;
                    int i6 = i5 % 128;
                    onExtraCallback = i6;
                    if (i5 % 2 != 0) {
                        int i7 = 47 / 0;
                        if (iOnNavigationEvent == 0) {
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i |= 1;
                        } else if (iOnNavigationEvent != 1) {
                            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                            i |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            colorAttributeLocal3 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal3);
                            i |= 4;
                            int i8 = onNavigationEvent + 27;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i10 = i6 + 15;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal);
                            i |= 8;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                    } else if (iOnNavigationEvent != 1) {
                    }
                } else {
                    z = false;
                }
            }
            str = str2;
            colorAttributeLocal2 = colorAttributeLocal3;
        } else {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            ColorAttributeLocal$.serializer serializerVar = ColorAttributeLocal$.serializer.INSTANCE;
            ColorAttributeLocal colorAttributeLocal4 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, serializerVar, (Object) null);
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, serializerVar, (Object) null);
            i = 15;
            colorAttributeLocal2 = colorAttributeLocal4;
            str = str3;
        }
        String str4 = strAsInterface;
        ColorAttributeLocal colorAttributeLocal5 = colorAttributeLocal;
        int i12 = i;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeIntelligenceHeroV2Local.Title(i12, str4, str, colorAttributeLocal2, colorAttributeLocal5, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m384deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeIntelligenceHeroV2Local.Title title) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(title, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeIntelligenceHeroV2Local.Title.onWarmupCompleted(title, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(title, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeIntelligenceHeroV2Local.Title.onWarmupCompleted(title, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeIntelligenceHeroV2Local.Title) obj);
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char c;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            c = '0';
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 10278 - (KeyEvent.getMaxKeyCode() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12891 - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", "", 0) + 55, 2168 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", c, 0, 0)), 54 - TextUtils.indexOf("", c, 0, 0), 2167 - (KeyEvent.getMaxKeyCode() >> 16), 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                c = '0';
            }
            int i9 = $10 + 107;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i11 = $11 + 53;
        $10 = i11 % 128;
        if (i11 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i12 = 39 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = 478308920;
    }
}
