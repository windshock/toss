package im.toss.features.benefit.dto;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.benefit.dto.BenefitActivationIntelligence;
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
import o.dj3;
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
public final /* synthetic */ class BenefitActivationIntelligence$Type1$$serializer implements aeu2<BenefitActivationIntelligence.Type1> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 0;
    public static final BenefitActivationIntelligence$Type1$$serializer INSTANCE;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onWarmupCompleted();
        BenefitActivationIntelligence$Type1$$serializer benefitActivationIntelligence$Type1$$serializer = new BenefitActivationIntelligence$Type1$$serializer();
        INSTANCE = benefitActivationIntelligence$Type1$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.benefit.dto.BenefitActivationIntelligence.Type1", benefitActivationIntelligence$Type1$$serializer, 13);
        setanimationsloop.onWarmupCompleted("id", true);
        setanimationsloop.onWarmupCompleted("logType", true);
        setanimationsloop.onWarmupCompleted("titleLower", true);
        setanimationsloop.onWarmupCompleted("loadingMessage", true);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-124, -125, -127, -126, -127}, (ViewConfiguration.getTouchSlop() >> 8) + 127, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -125, -127, -126, -127, -121, -122, -123}, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("lightImageUrl", true);
        setanimationsloop.onWarmupCompleted("darkImageUrl", true);
        setanimationsloop.onWarmupCompleted("imageWidth", true);
        setanimationsloop.onWarmupCompleted("imageHeight", true);
        setanimationsloop.onWarmupCompleted("buttonTitle", true);
        setanimationsloop.onWarmupCompleted("buttonLandingUrl", true);
        setanimationsloop.onWarmupCompleted("showAd", true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 39;
        asInterface = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private BenefitActivationIntelligence$Type1$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializer2 = getBgColor.IAuthTabCallback;
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer2);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback6 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback7 = sp.IAuthTabCallback(kSerializer);
        dj3 dj3Var = dj3.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializer, kSerializerIAuthTabCallback5, kSerializerIAuthTabCallback6, kSerializerIAuthTabCallback7, sp.IAuthTabCallback(dj3Var), sp.IAuthTabCallback(dj3Var), kSerializer, kSerializer, kSerializer2};
        int i4 = IAuthTabCallbackStub + 99;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final BenefitActivationIntelligence.Type1 deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        Float f;
        String str2;
        int i;
        Float f2;
        String str3;
        Boolean bool;
        String strAsInterface;
        String strAsInterface2;
        boolean zOnExtraCallbackWithResult;
        String str4;
        String str5;
        String str6;
        String str7;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        boolean z = true;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        Float f3 = null;
        if (!(!ywVarOnWarmupCompleted.extraCallbackWithResult())) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str8 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            String str9 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getwrigglelayout, (Object) null);
            Boolean bool2 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, (Object) null);
            String str10 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String str11 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getwrigglelayout, (Object) null);
            String str12 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            String str13 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            dj3 dj3Var = dj3.onWarmupCompleted;
            Float f4 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, dj3Var, (Object) null);
            Float f5 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 9, dj3Var, (Object) null);
            str = str13;
            str2 = str9;
            f = f5;
            bool = bool2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 10);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
            str3 = str12;
            str4 = str11;
            f2 = f4;
            str5 = strAsInterface3;
            str6 = str10;
            str7 = str8;
            i = 8191;
        } else {
            int i6 = IAuthTabCallbackStub + 71;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            boolean z2 = true;
            String str14 = null;
            String str15 = null;
            Float f6 = null;
            String str16 = null;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String str17 = null;
            String strAsInterface6 = null;
            String str18 = null;
            String str19 = null;
            int i8 = 0;
            boolean zOnExtraCallbackWithResult2 = false;
            Boolean bool3 = null;
            while (z2 == z) {
                int i9 = asBinder + 3;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z2 = false;
                        z = true;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 0:
                        str19 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str19);
                        i8 |= 1;
                        int i10 = asBinder + 73;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        str17 = str17;
                        str18 = str18;
                        z = true;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 1:
                        str15 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str15);
                        i8 |= 2;
                        z = true;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 2:
                        c = 3;
                        bool3 = (Boolean) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getBgColor.IAuthTabCallback, bool3);
                        i8 |= 4;
                        z = true;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 3:
                        c = 3;
                        i8 |= 8;
                        str18 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str18);
                        z = true;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 4:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i8 |= 16;
                        z = true;
                        i3 = 10;
                        i4 = 9;
                    case 5:
                        i8 |= 32;
                        str17 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, str17);
                        z = true;
                        i3 = 10;
                        i4 = 9;
                    case 6:
                        str16 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str16);
                        i8 |= 64;
                        z = true;
                        i3 = 10;
                    case 7:
                        str14 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str14);
                        i8 |= 128;
                        z = true;
                        i3 = 10;
                    case 8:
                        f6 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, dj3.onWarmupCompleted, f6);
                        i8 |= 256;
                        int i12 = asBinder + 83;
                        IAuthTabCallbackStub = i12 % 128;
                        int i13 = i12 % 2;
                        z = true;
                        i3 = 10;
                    case 9:
                        f3 = (Float) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, dj3.onWarmupCompleted, f3);
                        i8 |= 512;
                        z = true;
                    case 10:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, i3);
                        i8 |= 1024;
                        z = true;
                    case 11:
                        strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 11);
                        i8 |= 2048;
                        z = true;
                    case 12:
                        zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 12);
                        i8 |= 4096;
                        z = true;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str14;
            f = f3;
            str2 = str15;
            i = i8;
            f2 = f6;
            str3 = str16;
            bool = bool3;
            strAsInterface = strAsInterface4;
            strAsInterface2 = strAsInterface5;
            zOnExtraCallbackWithResult = zOnExtraCallbackWithResult2;
            str4 = str17;
            str5 = strAsInterface6;
            str6 = str18;
            str7 = str19;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        BenefitActivationIntelligence.Type1 type1 = new BenefitActivationIntelligence.Type1(i, str7, str2, bool, str6, str5, str4, str3, str, f2, f, strAsInterface, strAsInterface2, zOnExtraCallbackWithResult, (okycx) null);
        int i14 = asBinder + 35;
        IAuthTabCallbackStub = i14 % 128;
        int i15 = i14 % 2;
        return type1;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m89deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BenefitActivationIntelligence.Type1 type1Deserialize = deserialize(decoder);
        int i3 = asBinder + 67;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return type1Deserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull BenefitActivationIntelligence.Type1 type1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(type1, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        BenefitActivationIntelligence.Type1.onWarmupCompleted(type1, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 49;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (BenefitActivationIntelligence.Type1) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 117;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 78 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 20951, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 78, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i2 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 75 - KeyEvent.getDeadChar(0, 0), (-16761179) - Color.rgb(0, 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onWarmupCompleted) {
            int i10 = $10 + 107;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 62 - TextUtils.lastIndexOf("", '0', 0), (-16765002) - Color.rgb(0, 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
        }
        String str = new String(cArr6);
        int i12 = $10 + 49;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{32281, 32492, 32481, 32488, 32282, 32280, 32491};
        onNavigationEvent = -1184334187;
        IAuthTabCallback = true;
        onWarmupCompleted = true;
    }
}
