package im.toss.features.credit.data.response;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditFullscreenBannerResponse$$serializer implements aeu2<CreditFullscreenBannerResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final CreditFullscreenBannerResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i3 + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        CreditFullscreenBannerResponse$$serializer creditFullscreenBannerResponse$$serializer = new CreditFullscreenBannerResponse$$serializer();
        INSTANCE = creditFullscreenBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.CreditFullscreenBannerResponse", creditFullscreenBannerResponse$$serializer, 6);
        setanimationsloop.onWarmupCompleted("buttonText", true);
        setanimationsloop.onWarmupCompleted("linkUrl", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("sourceUrl", true);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 127 - KeyEvent.getDeadChar(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("closeButtonUrl", true);
        descriptor = setanimationsloop;
        int i = asBinder + 89;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private CreditFullscreenBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final CreditFullscreenBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        String strAsInterface;
        String str3;
        String str4;
        String str5;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i3 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            str = strAsInterface2;
            str2 = strAsInterface5;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            str3 = strAsInterface6;
            str4 = strAsInterface3;
            str5 = strAsInterface4;
            i = 63;
        } else {
            int i4 = onTransact + 59;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            String strAsInterface11 = null;
            String strAsInterface12 = null;
            int i6 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 3;
                    case 0:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 3;
                    case 1:
                        strAsInterface11 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                        i3 = 3;
                    case 2:
                        strAsInterface12 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i6 |= 4;
                        int i7 = IAuthTabCallbackDefault + 75;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = 3;
                    case 3:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                        i6 |= 8;
                    case 4:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i6 |= 16;
                    case 5:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i6 |= 32;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface7;
            str2 = strAsInterface8;
            strAsInterface = strAsInterface9;
            str3 = strAsInterface10;
            str4 = strAsInterface11;
            str5 = strAsInterface12;
            i = i6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        CreditFullscreenBannerResponse creditFullscreenBannerResponse = new CreditFullscreenBannerResponse(i, str, str4, str5, str2, str3, strAsInterface, (okycx) null);
        int i9 = IAuthTabCallbackDefault + 61;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return creditFullscreenBannerResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m146deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        CreditFullscreenBannerResponse creditFullscreenBannerResponseDeserialize = deserialize(decoder);
        int i3 = onTransact + 93;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return creditFullscreenBannerResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(creditFullscreenBannerResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        CreditFullscreenBannerResponse.onExtraCallback(creditFullscreenBannerResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (CreditFullscreenBannerResponse) obj);
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 51;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackDefault + 67;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        char c = '0';
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c) + 1), TextUtils.lastIndexOf("", c) + 78, 20953 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                    j = 0;
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
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 75, 16038 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onExtraCallbackWithResult) {
                int i7 = $10 + 7;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 63 - TextUtils.getOffsetBefore("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i9 = $10 + 27;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback + defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] + iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted / 0;
                    } else {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                    }
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i10 = $11 + 45;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.getMode(0) + 63, 12214 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32557, 32560, 32565, 32572};
        onWarmupCompleted = -1184333863;
        onNavigationEvent = true;
        onExtraCallbackWithResult = true;
    }
}
