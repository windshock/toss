package viva.republica.toss.network.model.transfer;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import net.sf.scuba.smartcards.BuildConfig;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetRecommendResponse$Banner$$serializer implements aeu2<DepositTargetRecommendResponse.Banner> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final DepositTargetRecommendResponse$Banner$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 101;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        DepositTargetRecommendResponse$Banner$$serializer depositTargetRecommendResponse$Banner$$serializer = new DepositTargetRecommendResponse$Banner$$serializer();
        INSTANCE = depositTargetRecommendResponse$Banner$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetRecommendResponse.Banner", depositTargetRecommendResponse$Banner$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{11, 15, 4, '\b'}, (byte) (79 - (ViewConfiguration.getJumpTapTimeout() >> 16)), KeyEvent.normalizeMetaState(0) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 5, 0, 2, '\b', 5, 15, 4, '\r', '\n', 13864}, (byte) (50 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("resourceMeta", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallback + 75;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private DepositTargetRecommendResponse$Banner$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {getwrigglelayout, getwrigglelayout, DepositTargetRecommendResponse$ResourceMeta$$serializer.INSTANCE};
        int i4 = onExtraCallbackWithResult + 21;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asInterface + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetRecommendResponse.Banner bannerM89deserialize = m89deserialize(decoder);
        int i4 = asInterface + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bannerM89deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DepositTargetRecommendResponse.Banner m89deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        String str2;
        DepositTargetRecommendResponse.ResourceMeta resourceMeta;
        int i;
        String strAsInterface;
        String strAsInterface2;
        DepositTargetRecommendResponse.ResourceMeta resourceMeta2;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Object obj = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = asInterface + 41;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                resourceMeta2 = (DepositTargetRecommendResponse.ResourceMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, DepositTargetRecommendResponse$ResourceMeta$$serializer.INSTANCE, (Object) null);
                i2 = 69;
            } else {
                strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                resourceMeta2 = (DepositTargetRecommendResponse.ResourceMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, DepositTargetRecommendResponse$ResourceMeta$$serializer.INSTANCE, (Object) null);
                i2 = 7;
            }
            str = strAsInterface;
            str2 = strAsInterface2;
            resourceMeta = resourceMeta2;
            i = i2;
        } else {
            boolean z = true;
            int i5 = 0;
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            DepositTargetRecommendResponse.ResourceMeta resourceMeta3 = null;
            while (z) {
                int i6 = asInterface + 37;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i7 = asInterface;
                    int i8 = i7 + 105;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        if (iOnNavigationEvent == 0) {
                            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                            i5 |= 2;
                        } else {
                            if (iOnNavigationEvent == 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i9 = i7 + 79;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            resourceMeta3 = (DepositTargetRecommendResponse.ResourceMeta) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 2, DepositTargetRecommendResponse$ResourceMeta$$serializer.INSTANCE, resourceMeta3);
                            i5 |= 4;
                        }
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    } else if (iOnNavigationEvent == 2) {
                    }
                } else {
                    strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                }
            }
            str = strAsInterface3;
            str2 = strAsInterface4;
            resourceMeta = resourceMeta3;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        DepositTargetRecommendResponse.Banner banner = new DepositTargetRecommendResponse.Banner(i, str, str2, resourceMeta, (okycx) null);
        int i11 = onExtraCallbackWithResult + 5;
        asInterface = i11 % 128;
        if (i11 % 2 != 0) {
            return banner;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetRecommendResponse.Banner) obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 55;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetRecommendResponse.Banner banner) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(banner, BuildConfig.FLAVOR);
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DepositTargetRecommendResponse.Banner.onNavigationEvent(banner, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(banner, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DepositTargetRecommendResponse.Banner.onNavigationEvent(banner, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = asInterface + 15;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        int i4 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> i4) + 26, 23140 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 8;
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 26, 23138 - MotionEvent.axisFromString(BuildConfig.FLAVOR), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 49;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24824), 74 - (ViewConfiguration.getFadingEdgeLength() >> 16), 8088 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 31, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                        int i11 = $11 + 57;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        int i17 = $10 + 7;
                        $11 = i17 % 128;
                        if (i17 % 2 == 0) {
                            int i18 = 3 / 3;
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        String str = new String(cArr4);
        int i20 = $11 + 123;
        $10 = i20 % 128;
        if (i20 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void IAuthTabCallback() {
        onWarmupCompleted = new char[]{64963, 64986, 64966, 64983, 64982, 64984, 64962, 64967, 64965, 64961, 64964, 64970, 64976, 64991, 64998, 64985};
        onExtraCallback = (char) 51245;
    }
}
