package im.toss.tosssecurities.widget.watchlist.model;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.aeu2;
import o.dj3;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class WatchlistWidgetState$Error$$serializer implements aeu2<WatchlistWidgetState.Error> {
    public static final int $stable;
    public static final WatchlistWidgetState$Error$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final byte[] $$a = {29, -26, 91, 68};
    private static final int $$b = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (s2 * 2);
        int i4 = (s * 3) + 1;
        int i5 = (s3 * 2) + 105;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            int i8 = i3;
            int i9 = (-i3) + i6;
            i = i7;
            int i10 = i8;
            i5 = i9;
            i3 = i10;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i11 = i3 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i8 = i11;
            i3 = bArr[i11];
            i7 = i2;
            i6 = i12;
            int i92 = (-i3) + i6;
            i = i7;
            int i102 = i8;
            i5 = i92;
            i3 = i102;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i112 = i3 + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i5;
            i2 = i + 1;
            int i1122 = i3 + 1;
            if (i2 == i4) {
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult = 1;
        onExtraCallback();
        WatchlistWidgetState$Error$$serializer watchlistWidgetState$Error$$serializer = new WatchlistWidgetState$Error$$serializer();
        INSTANCE = watchlistWidgetState$Error$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.tosssecurities.widget.watchlist.model.WatchlistWidgetState.Error", watchlistWidgetState$Error$$serializer, 3);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 5, 2 - Color.alpha(0), new char[]{1, 65530, 65530, 5, '\t'}, false, 230 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 7, new char[]{4, 65532, '\n', '\n', 65528, 65534, 65532}, false, (ViewConfiguration.getTouchSlop() >> 8) + 232, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private WatchlistWidgetState$Error$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.aeu2
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return new KSerializer[]{WatchlistWidgetState.Error.onExtraCallback()[0].getValue(), dj3.onWarmupCompleted, sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[5];
        kSerializerArr[0] = WatchlistWidgetState.Error.onExtraCallback()[0].getValue();
        kSerializerArr[0] = dj3.onWarmupCompleted;
        kSerializerArr[5] = sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent);
        return kSerializerArr;
    }

    @Override // o.jp
    public final WatchlistWidgetState.Error deserialize(@NotNull Decoder decoder) {
        float f;
        String str;
        DisplaySetting displaySetting;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = WatchlistWidgetState.Error.onExtraCallback();
        String str2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = onNavigationEvent + 61;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            DisplaySetting displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), null);
            float fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, null);
            displaySetting = displaySetting2;
            f = fOnWarmupCompleted;
            i = 7;
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting3 = null;
            boolean z = true;
            int i7 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    displaySetting3 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), displaySetting3);
                    i7 |= 1;
                } else if (iOnNavigationEvent != 1) {
                    int i8 = onNavigationEvent + 7;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        if (iOnNavigationEvent != 4) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 4;
                    } else {
                        if (iOnNavigationEvent != 2) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str2);
                        i7 |= 4;
                    }
                } else {
                    fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                    i7 |= 2;
                }
            }
            int i9 = onNavigationEvent + 75;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            f = fOnWarmupCompleted2;
            str = str2;
            displaySetting = displaySetting3;
            i = i7;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new WatchlistWidgetState.Error(i, displaySetting, f, str, (okycx) null);
    }

    @Override // o.jp
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull WatchlistWidgetState.Error error) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(error, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            WatchlistWidgetState.Error.onWarmupCompleted(error, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(error, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        WatchlistWidgetState.Error.onWarmupCompleted(error, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 89;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.py
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (WatchlistWidgetState.Error) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 33;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.aeu2
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            c = '0';
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 12843), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 55, 2166 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0'), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i9 = $10 + 105;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 1;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 55, ((byte) KeyEvent.getModifierMetaStateMask()) + 2168, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                c = '0';
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallback() {
        onWarmupCompleted = 478308950;
    }
}
