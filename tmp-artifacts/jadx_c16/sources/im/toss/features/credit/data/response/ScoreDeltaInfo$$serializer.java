package im.toss.features.credit.data.response;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
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
import o.DefaultGainProviderExternalSyntheticLambda0;
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
public final /* synthetic */ class ScoreDeltaInfo$$serializer implements aeu2<ScoreDeltaInfo> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 1;
    public static final ScoreDeltaInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 97;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        ScoreDeltaInfo$$serializer scoreDeltaInfo$$serializer = new ScoreDeltaInfo$$serializer();
        INSTANCE = scoreDeltaInfo$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.response.ScoreDeltaInfo", scoreDeltaInfo$$serializer, 6);
        setanimationsloop.onWarmupCompleted("kcbScoreDelta", true);
        setanimationsloop.onWarmupCompleted("niceScoreDelta", true);
        Object[] objArr = new Object[1];
        a(new char[]{2, 14, 15, 2, 13826}, (byte) (3 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 5 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{1, 5, '\b', 5, '\n', 14, '\r', 15, 11, '\t', 13912}, (byte) (100 - KeyEvent.getDeadChar(0, 0)), Process.getGidForName("") + 12, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        Object[] objArr3 = new Object[1];
        a(new char[]{11, '\b', 1, 6, 3, '\r', 7, 2}, (byte) (6 - TextUtils.lastIndexOf("", '0', 0, 0)), 9 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("linkUrl", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 43;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private ScoreDeltaInfo$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback(kSerializer);
        getDynamicHeight getdynamicheight = getDynamicHeight.onWarmupCompleted;
        KSerializer<?>[] kSerializerArr = {getdynamicheight, getdynamicheight, kSerializer, kSerializerIAuthTabCallback, kSerializerIAuthTabCallback2, kSerializer};
        int i4 = onExtraCallback + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ScoreDeltaInfo deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int iOnTransact;
        int iOnTransact2;
        String strAsInterface;
        String str;
        String strAsInterface2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i5 = 4;
        String str2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            strAsInterface2 = null;
            strAsInterface = null;
            str = null;
            i = 0;
            iOnTransact = 0;
            iOnTransact2 = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i6 = onExtraCallback + 5;
                        IAuthTabCallbackDefault = i6 % 128;
                        int i7 = i6 % 2;
                        i5 = 4;
                        z = false;
                        continue;
                    case 0:
                        iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getWriggleLayout.onNavigationEvent, str);
                        i |= 8;
                        int i8 = onExtraCallback + 61;
                        IAuthTabCallbackDefault = i8 % 128;
                        int i9 = i8 % 2;
                        break;
                    case 4:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i5, getWriggleLayout.onNavigationEvent, str2);
                        i |= 16;
                        continue;
                    case 5:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                i5 = 4;
            }
        } else {
            iOnTransact = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 0);
            iOnTransact2 = ywVarOnWarmupCompleted.onTransact(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, getwrigglelayout, (Object) null);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            i = 63;
        }
        String str3 = str2;
        String str4 = strAsInterface;
        String str5 = str;
        int i10 = i;
        int i11 = iOnTransact;
        int i12 = iOnTransact2;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreDeltaInfo(i10, i11, i12, str4, str5, str3, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m187deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ScoreDeltaInfo scoreDeltaInfoDeserialize = deserialize(decoder);
        int i4 = onExtraCallback + 43;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return scoreDeltaInfoDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreDeltaInfo scoreDeltaInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scoreDeltaInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        ScoreDeltaInfo.onExtraCallback(scoreDeltaInfo, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreDeltaInfo) obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0')), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 26 - View.combineMeasuredStates(0, 0), 23139 - Color.blue(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 125;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 24824), 73 - TextUtils.lastIndexOf("", c), 8088 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), View.resolveSize(0, 0) + 30, KeyEvent.getDeadChar(0, 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                                int i10 = $10 + 45;
                                $11 = i10 % 128;
                                int i11 = i10 % 2;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        } else {
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                        }
                    }
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                c = '0';
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            int i17 = $11 + 99;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void IAuthTabCallback() {
        IAuthTabCallback = new char[]{64989, 64982, 64978, 64991, 64976, 64980, 64961, 64977, 64988, 64960, 64986, 64990, 64963, 64983, 64967, 64998};
        onWarmupCompleted = (char) 51245;
    }
}
