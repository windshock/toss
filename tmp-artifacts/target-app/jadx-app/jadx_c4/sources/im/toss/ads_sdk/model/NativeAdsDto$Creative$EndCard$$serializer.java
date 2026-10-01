package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.model.NativeAdsDto;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Creative$EndCard$$serializer implements aeu2<NativeAdsDto.Creative.EndCard> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 1;
    public static final NativeAdsDto$Creative$EndCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static char[] onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return serialDescriptor;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        int i4 = 9;
        if (cArr2 != null) {
            int i5 = $10;
            int i6 = i5 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = i5 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + i4;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, (ViewConfiguration.getPressedStateDuration() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i10])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                }
                i10++;
                i4 = 9;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 26 - ExpandableListView.getPackedPositionType(0L), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    int i12 = $10 + 67;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24824), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, 8088 - TextUtils.getOffsetAfter("", 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 30 - Color.alpha(0), 19489 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                    } else {
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        onNavigationEvent();
        NativeAdsDto$Creative$EndCard$$serializer nativeAdsDto$Creative$EndCard$$serializer = new NativeAdsDto$Creative$EndCard$$serializer();
        INSTANCE = nativeAdsDto$Creative$EndCard$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.Creative.EndCard", nativeAdsDto$Creative$EndCard$$serializer, 6);
        Object[] objArr = new Object[1];
        a(new char[]{'\b', 7, '\b', 6, 13890}, (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 66), 5 - View.resolveSize(0, 0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("subTitle", true);
        setanimationsloop.onWarmupCompleted("titleGradient", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{0, 6, 2, 0, 5, 3, 2, 6}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 115), 8 - KeyEvent.getDeadChar(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("ctaText", true);
        setanimationsloop.onWarmupCompleted("listContent", true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 55;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private NativeAdsDto$Creative$EndCard$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnNavigationEvent = NativeAdsDto.Creative.EndCard.onNavigationEvent();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE), kSerializer, kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnNavigationEvent[5].getValue())};
        int i4 = IAuthTabCallbackDefault + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Creative.EndCard deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i;
        String str;
        String str2;
        String str3;
        NativeAdsDto.Creative.EndCard.Gradient gradient;
        List list;
        char c;
        boolean z;
        char c2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnNavigationEvent = NativeAdsDto.Creative.EndCard.onNavigationEvent();
        int i3 = 4;
        String strAsInterface2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = IAuthTabCallbackDefault + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
            NativeAdsDto.Creative.EndCard.Gradient gradient2 = (NativeAdsDto.Creative.EndCard.Gradient) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE, (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            i = 63;
            gradient = gradient2;
            list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), (Object) null);
            str3 = strAsInterface4;
            strAsInterface = strAsInterface5;
            str = str4;
            str2 = strAsInterface3;
        } else {
            int i6 = onWarmupCompleted + 105;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            boolean z2 = true;
            int i8 = 0;
            List list2 = null;
            strAsInterface = null;
            NativeAdsDto.Creative.EndCard.Gradient gradient3 = null;
            String str5 = null;
            String strAsInterface6 = null;
            while (z2) {
                int i9 = onWarmupCompleted + 123;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (i10 == 0) {
                    int i11 = 25 / 0;
                    switch (iOnNavigationEvent) {
                        case -1:
                            int i12 = onWarmupCompleted + 31;
                            IAuthTabCallbackDefault = i12 % 128;
                            int i13 = i12 % 2;
                            z2 = false;
                            i3 = 4;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i8 |= 1;
                            i3 = 4;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                            i8 |= 2;
                            i3 = 4;
                            break;
                        case 2:
                            c = 3;
                            gradient3 = (NativeAdsDto.Creative.EndCard.Gradient) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE, gradient3);
                            i8 |= 4;
                            break;
                        case 3:
                            c = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i8 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i8 |= 16;
                            break;
                        case 5:
                            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), list2);
                            i8 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                } else {
                    switch (iOnNavigationEvent) {
                        case -1:
                            int i122 = onWarmupCompleted + 31;
                            IAuthTabCallbackDefault = i122 % 128;
                            int i132 = i122 % 2;
                            z2 = false;
                            i3 = 4;
                            break;
                        case 0:
                            z = true;
                            c2 = 3;
                            strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                            i8 |= 1;
                            i3 = 4;
                            break;
                        case 1:
                            c2 = 3;
                            z = true;
                            str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str5);
                            i8 |= 2;
                            i3 = 4;
                            break;
                        case 2:
                            c = 3;
                            gradient3 = (NativeAdsDto.Creative.EndCard.Gradient) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$Creative$EndCard$Gradient$$serializer.INSTANCE, gradient3);
                            i8 |= 4;
                            break;
                        case 3:
                            c = 3;
                            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i8 |= 8;
                            break;
                        case 4:
                            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                            i8 |= 16;
                            break;
                        case 5:
                            list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnNavigationEvent[5].getValue(), list2);
                            i8 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
            }
            i = i8;
            str = str5;
            str2 = strAsInterface6;
            List list3 = list2;
            str3 = strAsInterface2;
            gradient = gradient3;
            list = list3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new NativeAdsDto.Creative.EndCard(i, str2, str, gradient, str3, strAsInterface, list, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m17deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsDto.Creative.EndCard endCardDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return endCardDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Creative.EndCard endCard) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(endCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Creative.EndCard.onExtraCallback(endCard, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (NativeAdsDto.Creative.EndCard) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{64961, 64978, 64980, 64990, 64982, 64998, 64986, 64967, 64991};
        onNavigationEvent = (char) 51242;
    }
}
