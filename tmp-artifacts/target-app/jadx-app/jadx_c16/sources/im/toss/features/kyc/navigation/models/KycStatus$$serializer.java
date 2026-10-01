package im.toss.features.kyc.navigation.models;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
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
import o.getExtraJsT2MapStr;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setEnableJsT2;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycStatus$$serializer implements aeu2<KycStatus> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final KycStatus$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        KycStatus$$serializer kycStatus$$serializer = new KycStatus$$serializer();
        INSTANCE = kycStatus$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.kyc.navigation.models.KycStatus", kycStatus$$serializer, 8);
        setanimationsloop.onWarmupCompleted("status", true);
        setanimationsloop.onWarmupCompleted("reasonCode", true);
        setanimationsloop.onWarmupCompleted("nextKycExecutionTime", true);
        Object[] objArr = new Object[1];
        a(new char[]{7, 1, 3, 1, 13899}, (byte) (76 - View.MeasureSpec.getSize(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{'\b', 3, 4, 7, 1, 7, 3, 6}, (byte) (Color.rgb(0, 0, 0) + 16777228), Color.rgb(0, 0, 0) + 16777224, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("kycDisplayStatus", true);
        setanimationsloop.onWarmupCompleted("addressModuleType", true);
        setanimationsloop.onWarmupCompleted("cddProcessType", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 115;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private KycStatus$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = KycStatus.IAuthTabCallback();
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[1].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(getExtraJsT2MapStr.IAuthTabCallback);
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {setEnableJsT2.onExtraCallback, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback(getwrigglelayout), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[5].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[6].getValue()), sp.IAuthTabCallback((KSerializer) lazyArrIAuthTabCallback[7].getValue())};
        int i4 = IAuthTabCallbackStub + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final KycStatus deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ReasonCode reasonCode;
        CddProcessType cddProcessType;
        String str;
        String str2;
        Date date;
        KycDisplayStatus kycDisplayStatus;
        Status status;
        AddressModuleType addressModuleType;
        char c;
        String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = KycStatus.IAuthTabCallback();
        int i3 = 7;
        int i4 = 6;
        KycDisplayStatus kycDisplayStatus2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            Status status2 = (Status) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, setEnableJsT2.onExtraCallback, (Object) null);
            reasonCode = (ReasonCode) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
            Date date2 = (Date) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getExtraJsT2MapStr.IAuthTabCallback, (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            String str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            kycDisplayStatus = (KycDisplayStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), (Object) null);
            AddressModuleType addressModuleType2 = (AddressModuleType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, (jp) lazyArrIAuthTabCallback[6].getValue(), (Object) null);
            CddProcessType cddProcessType2 = (CddProcessType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, (jp) lazyArrIAuthTabCallback[7].getValue(), (Object) null);
            int i5 = IAuthTabCallback + 91;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
            addressModuleType = addressModuleType2;
            date = date2;
            str2 = str5;
            str = str4;
            cddProcessType = cddProcessType2;
            status = status2;
            i = 255;
        } else {
            i = 0;
            boolean z = true;
            String str6 = null;
            reasonCode = null;
            Date date3 = null;
            cddProcessType = null;
            Status status3 = null;
            AddressModuleType addressModuleType3 = null;
            String str7 = null;
            while (z) {
                int i7 = IAuthTabCallbackStub + 71;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        i3 = 7;
                    case 0:
                        c = 5;
                        status3 = (Status) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, setEnableJsT2.onExtraCallback, status3);
                        i |= 1;
                        i3 = 7;
                        i4 = 6;
                    case 1:
                        str3 = str7;
                        c = 5;
                        reasonCode = (ReasonCode) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), reasonCode);
                        i |= 2;
                        int i8 = IAuthTabCallbackStub + 73;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        str7 = str3;
                        i3 = 7;
                        i4 = 6;
                    case 2:
                        str3 = str7;
                        c = 5;
                        date3 = (Date) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getExtraJsT2MapStr.IAuthTabCallback, date3);
                        i |= 4;
                        str7 = str3;
                        i3 = 7;
                        i4 = 6;
                    case 3:
                        c = 5;
                        str7 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str7);
                        i |= 8;
                        int i10 = IAuthTabCallback + 79;
                        IAuthTabCallbackStub = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 7;
                        i4 = 6;
                    case 4:
                        str6 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, str6);
                        i |= 16;
                        i3 = 7;
                    case 5:
                        kycDisplayStatus2 = (KycDisplayStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrIAuthTabCallback[5].getValue(), kycDisplayStatus2);
                        i |= 32;
                    case 6:
                        addressModuleType3 = (AddressModuleType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, (jp) lazyArrIAuthTabCallback[i4].getValue(), addressModuleType3);
                        i |= 64;
                    case 7:
                        cddProcessType = (CddProcessType) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, (jp) lazyArrIAuthTabCallback[i3].getValue(), cddProcessType);
                        i |= 128;
                        int i12 = IAuthTabCallbackStub + 71;
                        IAuthTabCallback = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 2 / 2;
                        }
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = str7;
            str2 = str6;
            date = date3;
            kycDisplayStatus = kycDisplayStatus2;
            status = status3;
            addressModuleType = addressModuleType3;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new KycStatus(i, status, reasonCode, date, str, str2, kycDisplayStatus, addressModuleType, cddProcessType, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m623deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        KycStatus kycStatusDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackStub + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kycStatusDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull KycStatus kycStatus) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(kycStatus, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        KycStatus.onExtraCallbackWithResult(kycStatus, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = IAuthTabCallbackStub + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (KycStatus) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackStub + 17;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallbackWithResult;
        char c = '0';
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", c, 0)), 26 - Color.blue(0), 23139 - KeyEvent.getDeadChar(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
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
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $11 + 39;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    i2 = i + 20;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $11 + 89;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $11 + 79;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - Color.red(0)), 74 - Color.red(0), 8088 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i12 = $10 + 103;
                                $11 = i12 % 128;
                                int i13 = i12 % 2;
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - (ViewConfiguration.getEdgeSlop() >> 16), 19487 - TextUtils.lastIndexOf("", '0', 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
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
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i19 = 0;
            while (i19 < i) {
                int i20 = $10 + 63;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr4[i19] = (char) (cArr4[i19] ^ 17408);
                    i19 += 80;
                } else {
                    cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                    i19++;
                }
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{64991, 64977, 64976, 64982, 64967, 64966, 64960, 64986, 64990};
        onExtraCallback = (char) 51242;
    }
}
