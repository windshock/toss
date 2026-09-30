package im.toss.features.home.core.remote.model;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.BpsBannerResponse;
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
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BpsBannerResponse$$serializer implements aeu2<BpsBannerResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final BpsBannerResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static int onTransact;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 15;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 109;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onNavigationEvent();
        BpsBannerResponse$$serializer bpsBannerResponse$$serializer = new BpsBannerResponse$$serializer();
        INSTANCE = bpsBannerResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.BpsBannerResponse", bpsBannerResponse$$serializer, 5);
        setanimationsloop.onWarmupCompleted("requestId", true);
        setanimationsloop.onWarmupCompleted("sectionTitle", true);
        setanimationsloop.onWarmupCompleted("buy", true);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-124, -125, -126, -127}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("service", true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 35;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private BpsBannerResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(getwrigglelayout);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getwrigglelayout);
        BpsBannerResponse$SlotResponse$$serializer bpsBannerResponse$SlotResponse$$serializer = BpsBannerResponse$SlotResponse$$serializer.INSTANCE;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(bpsBannerResponse$SlotResponse$$serializer), sp.IAuthTabCallback(BpsBannerResponse$PlaySlotResponse$$serializer.INSTANCE), sp.IAuthTabCallback(bpsBannerResponse$SlotResponse$$serializer)};
        int i4 = asBinder + 113;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BpsBannerResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        BpsBannerResponse.PlaySlotResponse playSlotResponse;
        BpsBannerResponse.SlotResponse slotResponse;
        BpsBannerResponse.SlotResponse slotResponse2;
        String str;
        String str2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = false;
        BpsBannerResponse.PlaySlotResponse playSlotResponse2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onTransact + 23;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            BpsBannerResponse$SlotResponse$$serializer bpsBannerResponse$SlotResponse$$serializer = BpsBannerResponse$SlotResponse$$serializer.INSTANCE;
            BpsBannerResponse.SlotResponse slotResponse3 = (BpsBannerResponse.SlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, bpsBannerResponse$SlotResponse$$serializer, (Object) null);
            str = str4;
            playSlotResponse = (BpsBannerResponse.PlaySlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BpsBannerResponse$PlaySlotResponse$$serializer.INSTANCE, (Object) null);
            slotResponse = (BpsBannerResponse.SlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, bpsBannerResponse$SlotResponse$$serializer, (Object) null);
            str2 = str3;
            i = 31;
            slotResponse2 = slotResponse3;
        } else {
            int i5 = 0;
            boolean z2 = true;
            BpsBannerResponse.SlotResponse slotResponse4 = null;
            BpsBannerResponse.SlotResponse slotResponse5 = null;
            String str5 = null;
            String str6 = null;
            while (z2) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onTransact + 21;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        if (iOnNavigationEvent == 1) {
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                            i5 |= 2;
                        } else if (iOnNavigationEvent == 2) {
                            slotResponse5 = (BpsBannerResponse.SlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, BpsBannerResponse$SlotResponse$$serializer.INSTANCE, slotResponse5);
                            i5 |= 4;
                        } else if (iOnNavigationEvent == 3) {
                            playSlotResponse2 = (BpsBannerResponse.PlaySlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, BpsBannerResponse$PlaySlotResponse$$serializer.INSTANCE, playSlotResponse2);
                            i5 |= 8;
                        } else {
                            if (iOnNavigationEvent != 4) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            slotResponse4 = (BpsBannerResponse.SlotResponse) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, BpsBannerResponse$SlotResponse$$serializer.INSTANCE, slotResponse4);
                            i5 |= 16;
                        }
                        z = false;
                    } else {
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str6);
                        i5 |= 1;
                        z = false;
                    }
                } else {
                    z2 = z;
                }
            }
            int i8 = onTransact + 119;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            i = i5;
            playSlotResponse = playSlotResponse2;
            slotResponse = slotResponse4;
            slotResponse2 = slotResponse5;
            str = str5;
            str2 = str6;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        BpsBannerResponse bpsBannerResponse = new BpsBannerResponse(i, str2, str, slotResponse2, playSlotResponse, slotResponse, (okycx) null);
        int i10 = asBinder + 87;
        onTransact = i10 % 128;
        int i11 = i10 % 2;
        return bpsBannerResponse;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m527deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BpsBannerResponse bpsBannerResponse) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bpsBannerResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BpsBannerResponse.onNavigationEvent(bpsBannerResponse, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 75;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BpsBannerResponse) obj);
        int i4 = onTransact + 35;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 19;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallbackWithResult;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), Color.argb(0, 0, 0, 0) + 77, 20952 - View.MeasureSpec.getSize(0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $10 + 7;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 75, 16037 - TextUtils.getCapsMode("", 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        float f = 0.0f;
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, 12213 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i7 = $11 + 89;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i8 = $11 + 37;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback % 0) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] << i] % iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)), 63 - TextUtils.getTrimmedLength(""), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            } else {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (KeyEvent.getMaxKeyCode() >> 16) + 63, Gravity.getAbsoluteGravity(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                i6 = 1052772399;
            }
            f = 0.0f;
        }
        objArr[0] = new String(cArr6);
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{32285, 32281, 32492, 32276};
        IAuthTabCallback = -1184334195;
        onNavigationEvent = true;
        onExtraCallback = true;
    }
}
