package im.toss.features.home.core.remote.model;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.BpsBannerResponse;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BpsBannerResponse$SlotResponse$$serializer implements aeu2<BpsBannerResponse.SlotResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final BpsBannerResponse$SlotResponse$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        BpsBannerResponse$SlotResponse$$serializer bpsBannerResponse$SlotResponse$$serializer = new BpsBannerResponse$SlotResponse$$serializer();
        INSTANCE = bpsBannerResponse$SlotResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.BpsBannerResponse.SlotResponse", bpsBannerResponse$SlotResponse$$serializer, 4);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127, -121, -122, -123}, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("thumbnailUrls", true);
        setanimationsloop.onWarmupCompleted("landingScheme", true);
        descriptor = setanimationsloop;
        int i = asInterface + 99;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private BpsBannerResponse$SlotResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = BpsBannerResponse.SlotResponse.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[2].getValue()), sp.IAuthTabCallback(getwrigglelayout)};
        int i4 = IAuthTabCallbackStub + 47;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BpsBannerResponse.SlotResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        List list;
        String str;
        String str2;
        String str3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = BpsBannerResponse.SlotResponse.IAuthTabCallback();
        List list2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            i = 15;
            str2 = str4;
            str3 = str5;
        } else {
            int i5 = 0;
            boolean z = true;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str7);
                    i5 |= 1;
                    int i6 = IAuthTabCallbackStub + 21;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                } else if (iOnNavigationEvent == 1) {
                    str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str8);
                    i5 |= 2;
                } else if (iOnNavigationEvent != 2) {
                    int i8 = asBinder + 123;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str6);
                    i5 |= 8;
                    int i10 = IAuthTabCallbackStub + 25;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 3 / 2;
                    }
                } else {
                    list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrIAuthTabCallback[2].getValue(), list2);
                    i5 |= 4;
                }
            }
            i = i5;
            list = list2;
            str = str6;
            str2 = str7;
            str3 = str8;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new BpsBannerResponse.SlotResponse(i, str2, str3, list, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m529deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BpsBannerResponse.SlotResponse slotResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return slotResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BpsBannerResponse.SlotResponse slotResponse) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(slotResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            BpsBannerResponse.SlotResponse.onWarmupCompleted(slotResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            int i3 = 94 / 0;
        } else {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(slotResponse, "");
            SerialDescriptor serialDescriptor2 = descriptor;
            vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
            BpsBannerResponse.SlotResponse.onWarmupCompleted(slotResponse, vylVarOnExtraCallback2, serialDescriptor2);
            vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        }
        int i4 = IAuthTabCallbackStub + 15;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BpsBannerResponse.SlotResponse) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 77, (Process.myPid() >> 22) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i3++;
                    f = 0.0f;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), 75 - View.combineMeasuredStates(0, 0), 16037 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i5 = $10 + 95;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $10 + 13;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 63 - TextUtils.indexOf("", ""), 12213 - TextUtils.lastIndexOf("", '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 63, 12213 - ImageFormat.getBitsPerPixel(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
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
            int i9 = $11 + 21;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >>> i] / iIntValue);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            }
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        objArr[0] = new String(cArr6);
    }

    static void IAuthTabCallback() {
        onExtraCallback = new char[]{32492, 32503, 32500, 32499, 32493, 32483, 32510};
        onExtraCallbackWithResult = -1184334184;
        onNavigationEvent = true;
        onWarmupCompleted = true;
    }
}
