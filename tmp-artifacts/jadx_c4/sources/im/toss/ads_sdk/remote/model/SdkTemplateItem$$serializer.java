package im.toss.ads_sdk.remote.model;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.encryptType4;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class SdkTemplateItem$$serializer implements aeu2<SdkTemplateItem> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final SdkTemplateItem$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 103;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i3) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), windowTouchSlop, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 11, ((Process.getThreadPriority(0) + 20) >> 6) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.getTrimmedLength("")), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, TextUtils.getTrimmedLength("") + 19901, -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onExtraCallback();
        SdkTemplateItem$$serializer sdkTemplateItem$$serializer = new SdkTemplateItem$$serializer();
        INSTANCE = sdkTemplateItem$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.remote.model.SdkTemplateItem", sdkTemplateItem$$serializer, 8);
        Object[] objArr = new Object[1];
        a(new char[]{6766, 44902, 21220, 21119, 58189, 29787}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{17984, 1666, 27357, 61070, 2928, 55932, 28041, 54013}, 8 - TextUtils.indexOf("", ""), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{32424, 31827, 51763, 48656, 22478, 51563, 29559, 43358}, TextUtils.getTrimmedLength("") + 8, objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("cta", true);
        setanimationsloop.onWarmupCompleted("eventTracker", true);
        Object[] objArr4 = new Object[1];
        a(new char[]{7172, 32324, 258, 54802}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("catalogFeedId", true);
        setanimationsloop.onWarmupCompleted("productId", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 93;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private SdkTemplateItem$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, kSerializer, sp.IAuthTabCallback(SdkTemplateCta$$serializer.INSTANCE), sp.IAuthTabCallback(SspSdkEventTracker$$serializer.INSTANCE), sp.IAuthTabCallback(encryptType4.IAuthTabCallback), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(kSerializer)};
        int i4 = asInterface + 97;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final SdkTemplateItem deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        SspSdkEventTracker sspSdkEventTracker;
        JsonObject jsonObject;
        String str;
        String str2;
        String str3;
        SdkTemplateCta sdkTemplateCta;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        String strAsInterface3 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            SdkTemplateCta sdkTemplateCta2 = null;
            sspSdkEventTracker = null;
            str2 = null;
            str = null;
            jsonObject = null;
            strAsInterface2 = null;
            strAsInterface = null;
            int i3 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i3 |= 1;
                        break;
                    case 1:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        sdkTemplateCta2 = (SdkTemplateCta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, SdkTemplateCta$$serializer.INSTANCE, sdkTemplateCta2);
                        i3 |= 8;
                        break;
                    case 4:
                        sspSdkEventTracker = (SspSdkEventTracker) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkEventTracker$$serializer.INSTANCE, sspSdkEventTracker);
                        i3 |= 16;
                        break;
                    case 5:
                        jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, jsonObject);
                        i3 |= 32;
                        break;
                    case 6:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str);
                        i3 |= 64;
                        break;
                    case 7:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            sdkTemplateCta = sdkTemplateCta2;
            i = i3;
            str3 = strAsInterface3;
        } else {
            int i4 = asInterface + 115;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            SdkTemplateCta sdkTemplateCta3 = (SdkTemplateCta) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, SdkTemplateCta$$serializer.INSTANCE, (Object) null);
            sspSdkEventTracker = (SspSdkEventTracker) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, SspSdkEventTracker$$serializer.INSTANCE, (Object) null);
            jsonObject = (JsonObject) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, encryptType4.IAuthTabCallback, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            int i6 = asInterface + 55;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            str3 = strAsInterface4;
            sdkTemplateCta = sdkTemplateCta3;
            i = 255;
        }
        String str4 = str;
        JsonObject jsonObject2 = jsonObject;
        String str5 = strAsInterface2;
        String str6 = strAsInterface;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new SdkTemplateItem(i, str6, str5, str3, sdkTemplateCta, sspSdkEventTracker, jsonObject2, str4, str2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m58deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SdkTemplateItem sdkTemplateItemDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 11;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
        return sdkTemplateItemDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull SdkTemplateItem sdkTemplateItem) {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sdkTemplateItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        SdkTemplateItem.onWarmupCompleted(sdkTemplateItem, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = asInterface + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (SdkTemplateItem) obj);
        int i4 = asInterface + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 125;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    static void onExtraCallback() {
        IAuthTabCallback = (char) 65336;
        onExtraCallbackWithResult = (char) 46898;
        onWarmupCompleted = (char) 40173;
        onExtraCallback = (char) 54327;
    }
}
