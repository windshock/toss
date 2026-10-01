package im.toss.features.home.core.local.model.consumption.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.home.core.local.model.dst.section.BaseSectionLocal;
import im.toss.features.home.core.local.model.dst.section.BaseSectionLocal$Item$;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getBgColor;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeDstLocal$$serializer implements aeu2<HomeConsumptionHomeDstLocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    public static final HomeConsumptionHomeDstLocal$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 107;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 71;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        HomeConsumptionHomeDstLocal$$serializer homeConsumptionHomeDstLocal$$serializer = new HomeConsumptionHomeDstLocal$$serializer();
        INSTANCE = homeConsumptionHomeDstLocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.consumption.element.HomeConsumptionHomeDstLocal", homeConsumptionHomeDstLocal$$serializer, 4);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-124, -125, -126, -127}, Color.rgb(0, 0, 0) + 16777343, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("trackEvent", false);
        setanimationsloop.onWarmupCompleted("id", false);
        setanimationsloop.onWarmupCompleted("homeDstItem", false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 3;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private HomeConsumptionHomeDstLocal$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(BaseSectionLocal$Item$.serializer.INSTANCE);
            kSerializerArr = new KSerializer[5];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[0] = getBgColor.IAuthTabCallback;
            kSerializerArr[3] = getwrigglelayout;
            kSerializerArr[2] = kSerializerIAuthTabCallback;
        } else {
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(BaseSectionLocal$Item$.serializer.INSTANCE);
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getBgColor.IAuthTabCallback, getwrigglelayout2, kSerializerIAuthTabCallback2};
        }
        int i3 = asInterface + 91;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[PHI: r0 r2
      0x0059: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[PHI: r0 r2
      0x0039: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v9 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0037, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeConsumptionHomeDstLocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        String strAsInterface;
        int i;
        String strAsInterface2;
        BaseSectionLocal.Item item;
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = asInterface + 23;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            int i5 = 93 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                boolean zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                strAsInterface = strAsInterface3;
                i = 15;
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                item = (BaseSectionLocal.Item) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BaseSectionLocal$Item$.serializer.INSTANCE, (Object) null);
                z = zOnExtraCallbackWithResult;
            } else {
                String strAsInterface4 = null;
                strAsInterface = null;
                BaseSectionLocal.Item item2 = null;
                int i6 = 0;
                boolean zOnExtraCallbackWithResult2 = false;
                boolean z2 = true;
                while (z2) {
                    int i7 = IAuthTabCallbackStub + 59;
                    asInterface = i7 % 128;
                    int i8 = i7 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z2 = false;
                    } else if (iOnNavigationEvent == 0) {
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i9 = asInterface;
                        int i10 = i9 + 111;
                        IAuthTabCallbackStub = i10 % 128;
                        if (i10 % 2 == 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i11 = i9 + 7;
                            IAuthTabCallbackStub = i11 % 128;
                            i2 = i11 % 2;
                            BaseSectionLocal$Item$.serializer serializerVar = BaseSectionLocal$Item$.serializer.INSTANCE;
                            if (i2 != 0) {
                                item2 = (BaseSectionLocal.Item) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, serializerVar, item2);
                                i6 |= 115;
                            } else {
                                item2 = (BaseSectionLocal.Item) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, serializerVar, item2);
                                i6 |= 8;
                            }
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i112 = i9 + 7;
                            IAuthTabCallbackStub = i112 % 128;
                            i2 = i112 % 2;
                            BaseSectionLocal$Item$.serializer serializerVar2 = BaseSectionLocal$Item$.serializer.INSTANCE;
                            if (i2 != 0) {
                            }
                        }
                    } else {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                    }
                }
                item = item2;
                z = zOnExtraCallbackWithResult2;
                int i12 = i6;
                strAsInterface2 = strAsInterface4;
                i = i12;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeConsumptionHomeDstLocal(i, strAsInterface, z, strAsInterface2, item, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m260deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionHomeDstLocal homeConsumptionHomeDstLocalDeserialize = deserialize(decoder);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        int i5 = asInterface + 117;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return homeConsumptionHomeDstLocalDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeConsumptionHomeDstLocal homeConsumptionHomeDstLocal) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(homeConsumptionHomeDstLocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeConsumptionHomeDstLocal.onExtraCallbackWithResult(homeConsumptionHomeDstLocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeConsumptionHomeDstLocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeConsumptionHomeDstLocal.onExtraCallbackWithResult(homeConsumptionHomeDstLocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeConsumptionHomeDstLocal) obj);
        int i4 = asInterface + 57;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 29;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackStub + 47;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 77, 20952 - Color.red(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 75 - TextUtils.getOffsetBefore("", 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i8 = 1052772399;
            if (IAuthTabCallback) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i11 = $10 + 117;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 63 - View.MeasureSpec.getMode(0), 12214 - TextUtils.indexOf("", "", 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i8 = 1052772399;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!(!onNavigationEvent)) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i13 = $11 + 113;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), 63 - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i15 = $11 + 67;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted << 1;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            String str = new String(cArr6);
            int i16 = $10 + 15;
            $11 = i16 % 128;
            if (i16 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i17 = 70 / 0;
                objArr[0] = str;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32532, 32527, 32528, 32539};
        onWarmupCompleted = -1184333952;
        onNavigationEvent = true;
        IAuthTabCallback = true;
    }
}
