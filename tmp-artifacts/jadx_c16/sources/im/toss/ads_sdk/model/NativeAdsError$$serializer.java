package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.text.TextUtils;
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
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.aeu2;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsError$$serializer implements aeu2<NativeAdsError> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    public static final NativeAdsError$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 31;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        NativeAdsError$$serializer nativeAdsError$$serializer = new NativeAdsError$$serializer();
        INSTANCE = nativeAdsError$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsError", nativeAdsError$$serializer, 4);
        setanimationsloop.onWarmupCompleted("code", false);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -123, -124, -125, -125, -126, -127}, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("domain", true);
        setanimationsloop.onWarmupCompleted("requestId", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 65;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsError$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getDynamicHeight.onWarmupCompleted, kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer)};
        }
        KSerializer<?> kSerializer2 = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?>[] kSerializerArr = new KSerializer[3];
        kSerializerArr[1] = getDynamicHeight.onWarmupCompleted;
        kSerializerArr[1] = kSerializer2;
        kSerializerArr[4] = kSerializer2;
        kSerializerArr[2] = kSerializerIAuthTabCallback;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NativeAdsError deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String strAsInterface;
        String str;
        String str2;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 43;
        IAuthTabCallbackStub = i4 % 128;
        String strAsInterface2 = null;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            decoder.onWarmupCompleted(descriptor).extraCallbackWithResult();
            strAsInterface2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            i = iOnTransact;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, (Object) null);
            i2 = 15;
            str2 = strAsInterface3;
        } else {
            String str3 = null;
            String strAsInterface4 = null;
            boolean z = true;
            int iOnTransact2 = 0;
            int i5 = 0;
            while (z) {
                int i6 = IAuthTabCallbackStub + 3;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallbackStub;
                    int i9 = i8 + 105;
                    onTransact = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 43 / 0;
                        if (iOnNavigationEvent == 0) {
                            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                            i5 |= 1;
                        } else if (iOnNavigationEvent == 1) {
                            int i11 = i8 + 41;
                            onTransact = i11 % 128;
                            if (i11 % 2 != 0) {
                                if (iOnNavigationEvent == 4) {
                                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                    i5 |= 4;
                                } else {
                                    if (iOnNavigationEvent == 3) {
                                        throw new UnknownFieldException(iOnNavigationEvent);
                                    }
                                    str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str3);
                                    i5 |= 8;
                                }
                            } else if (iOnNavigationEvent == 2) {
                                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                                i5 |= 4;
                            } else if (iOnNavigationEvent == 3) {
                            }
                        } else {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        }
                    } else if (iOnNavigationEvent == 0) {
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                    }
                } else {
                    z = false;
                }
            }
            i = iOnTransact2;
            strAsInterface = strAsInterface2;
            str = str3;
            str2 = strAsInterface4;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsError(i2, i, str2, strAsInterface, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m33deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsError nativeAdsError) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(nativeAdsError, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            NativeAdsError.onExtraCallbackWithResult(nativeAdsError, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 84 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(nativeAdsError, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            NativeAdsError.onExtraCallbackWithResult(nativeAdsError, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = onTransact + 117;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsError) obj);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        int i5 = IAuthTabCallbackStub + 85;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 9;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = IAuthTabCallback;
        long j = 0;
        if (cArr4 != null) {
            int i3 = $11 + 25;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 76, (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i5 = $10 + 97;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 5;
            }
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 75 - (ViewConfiguration.getFadingEdgeLength() >> 16), 16037 - Color.alpha(0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onNavigationEvent) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
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
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 63 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
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
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0, 0), 63 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12214 - (ViewConfiguration.getTouchSlop() >> 8), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i8 = $11 + 23;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        IAuthTabCallback = new char[]{32736, 32744, 32538, 32756, 32750};
        onExtraCallback = -1184333931;
        onExtraCallbackWithResult = true;
        onNavigationEvent = true;
    }
}
