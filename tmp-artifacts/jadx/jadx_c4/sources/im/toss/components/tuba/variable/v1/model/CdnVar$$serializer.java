package im.toss.components.tuba.variable.v1.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.components.tuba.variable.v1.model.CdnVar;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonPrimitive;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.decryptType4;
import o.getWriggleLayout;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class CdnVar$$serializer implements aeu2<CdnVar> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final CdnVar$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 83;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        CdnVar$$serializer cdnVar$$serializer = new CdnVar$$serializer();
        INSTANCE = cdnVar$$serializer;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-113, -115, -108, -119, -110, -109, -125, -112, -118, -110, -123, -126, -125, -111, -114, -125, -118, -112, -116, -115, -127, -113, -115, -114, -125, -115, -116, -117, -124, -125, -122, -124, -119, -118, -119, -123, -120, -126, -123, -121, -125, -122, -122, -123, -124, -125, -126, -127}, 127 - KeyEvent.normalizeMetaState(0), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), cdnVar$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-106, -118, -107}, Color.green(0) + 127, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(null, null, new byte[]{-118, -117, -112, -115, -114}, ((Process.getThreadPriority(0) + 20) >> 6) + 127, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(null, null, new byte[]{-122, -124, -119, -127, -115, -113, -124, -122, -119, -123, -109, -113, -118, -108, -119, -127, -126}, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        Object[] objArr5 = new Object[1];
        a(null, null, new byte[]{-122, -124, -119, -127, -115, -113, -124, -122, -119, -123, -109, -113, -118, -108, -105, -115, -126}, 127 - KeyEvent.keyCodeFromString(""), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = asBinder + 85;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CdnVar$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            CdnVar$VersionConstraints$$serializer cdnVar$VersionConstraints$$serializer = CdnVar$VersionConstraints$$serializer.INSTANCE;
            KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(cdnVar$VersionConstraints$$serializer);
            KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(cdnVar$VersionConstraints$$serializer);
            kSerializerArr = new KSerializer[3];
            kSerializerArr[1] = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = decryptType4.onExtraCallback;
            kSerializerArr[2] = kSerializerIAuthTabCallback;
            kSerializerArr[4] = kSerializerIAuthTabCallback2;
        } else {
            CdnVar$VersionConstraints$$serializer cdnVar$VersionConstraints$$serializer2 = CdnVar$VersionConstraints$$serializer.INSTANCE;
            kSerializerArr = new KSerializer[]{getWriggleLayout.onNavigationEvent, decryptType4.onExtraCallback, sp.IAuthTabCallback(cdnVar$VersionConstraints$$serializer2), sp.IAuthTabCallback(cdnVar$VersionConstraints$$serializer2)};
        }
        int i3 = onTransact + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CdnVar deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        CdnVar.VersionConstraints versionConstraints;
        JsonPrimitive jsonPrimitive;
        String str;
        CdnVar.VersionConstraints versionConstraints2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        CdnVar.VersionConstraints versionConstraints3 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = asInterface + 27;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            JsonPrimitive jsonPrimitive2 = (JsonPrimitive) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, decryptType4.onExtraCallback, (Object) null);
            CdnVar$VersionConstraints$$serializer cdnVar$VersionConstraints$$serializer = CdnVar$VersionConstraints$$serializer.INSTANCE;
            versionConstraints = (CdnVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, cdnVar$VersionConstraints$$serializer, (Object) null);
            str = strAsInterface;
            versionConstraints2 = (CdnVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, cdnVar$VersionConstraints$$serializer, (Object) null);
            jsonPrimitive = jsonPrimitive2;
            i = 15;
        } else {
            int i5 = asInterface + 39;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 5;
            }
            int i7 = 0;
            boolean z = true;
            JsonPrimitive jsonPrimitive3 = null;
            String strAsInterface2 = null;
            CdnVar.VersionConstraints versionConstraints4 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i8 = asInterface + 61;
                    int i9 = i8 % 128;
                    onTransact = i9;
                    int i10 = i8 % 2;
                    if (iOnNavigationEvent == 1) {
                        jsonPrimitive3 = (JsonPrimitive) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, decryptType4.onExtraCallback, jsonPrimitive3);
                        i7 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                        versionConstraints3 = (CdnVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, CdnVar$VersionConstraints$$serializer.INSTANCE, versionConstraints3);
                        i7 |= 4;
                    } else {
                        if (iOnNavigationEvent != 3) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i11 = i9 + 87;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        versionConstraints4 = (CdnVar.VersionConstraints) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, CdnVar$VersionConstraints$$serializer.INSTANCE, versionConstraints4);
                        i7 |= 8;
                    }
                } else {
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i7 |= 1;
                    int i13 = asInterface + 111;
                    onTransact = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            i = i7;
            versionConstraints = versionConstraints3;
            jsonPrimitive = jsonPrimitive3;
            str = strAsInterface2;
            versionConstraints2 = versionConstraints4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new CdnVar(i, str, jsonPrimitive, versionConstraints, versionConstraints2, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m74deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CdnVar cdnVarDeserialize = deserialize(decoder);
        int i4 = onTransact + 121;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return cdnVarDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CdnVar cdnVar) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(cdnVar, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            CdnVar.onNavigationEvent(cdnVar, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(cdnVar, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        CdnVar.onNavigationEvent(cdnVar, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CdnVar) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 103;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onExtraCallback;
        if (cArr4 != null) {
            int i4 = $10;
            int i5 = i4 + 61;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 1;
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
                i2 = 0;
            }
            int i6 = i4 + 121;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i2])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 77 - (ViewConfiguration.getTouchSlop() >> 8), Color.rgb(0, 0, 0) + 16798168, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i2++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 97;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 75 - Color.green(0), 16036 - ImageFormat.getBitsPerPixel(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        char c = '0';
        if (onNavigationEvent) {
            int i10 = $11 + 93;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", c) + 64, Color.green(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                c = '0';
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i11 = $10 + 53;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), 63 - View.combineMeasuredStates(0, 0), 12213 - TextUtils.lastIndexOf("", '0', 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{32542, 32530, 32721, 32523, 32528, 32532, 32740, 32535, 32529, 32538, 32522, 32741, 32742, 32521, 32533, 32531, 32726, 32539, 32708, 32745, 32540, 32526, 32527};
        onWarmupCompleted = -1184333945;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
    }
}
