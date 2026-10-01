package im.toss.ads_sdk.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
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
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class NativeAdsDto$Mediation$$serializer implements aeu2<NativeAdsDto.Mediation> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final NativeAdsDto$Mediation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static boolean onExtraCallback = false;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static boolean onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        NativeAdsDto$Mediation$$serializer nativeAdsDto$Mediation$$serializer = new NativeAdsDto$Mediation$$serializer();
        INSTANCE = nativeAdsDto$Mediation$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.ads_sdk.model.NativeAdsDto.Mediation", nativeAdsDto$Mediation$$serializer, 6);
        setanimationsloop.onWarmupCompleted("mediationId", true);
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-122, -123, -125, -126, -124, -125, -126, -127}, MotionEvent.axisFromString("") + 128, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("admob", true);
        setanimationsloop.onWarmupCompleted("endpoint", true);
        setanimationsloop.onWarmupCompleted("ruleSet", true);
        setanimationsloop.onWarmupCompleted("bannedKeywords", true);
        descriptor = setanimationsloop;
        int i = IAuthTabCallbackStub + 115;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private NativeAdsDto$Mediation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArr = (Lazy[]) NativeAdsDto.Mediation.onExtraCallbackWithResult(-227196375, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 227196376, zzmr.onExtraCallbackWithResult(), new Object[0], zzmr.onExtraCallbackWithResult());
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent, lazyArr[1].getValue(), sp.IAuthTabCallback(NativeAdsDto$AdmobInfo$$serializer.INSTANCE), NativeAdsDto$MediationEndPoint$$serializer.INSTANCE, lazyArr[4].getValue(), lazyArr[5].getValue()};
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final NativeAdsDto.Mediation deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        String str;
        int i;
        List list2;
        NativeAdsDto.MediationEndPoint mediationEndPoint;
        NativeAdsDto.AdmobInfo admobInfo;
        List list3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArr = (Lazy[]) NativeAdsDto.Mediation.onExtraCallbackWithResult(-227196375, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 227196376, zzmr.onExtraCallbackWithResult(), new Object[0], zzmr.onExtraCallbackWithResult());
        int i4 = 5;
        NativeAdsDto.MediationEndPoint mediationEndPoint2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list4 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), (Object) null);
            NativeAdsDto.AdmobInfo admobInfo2 = (NativeAdsDto.AdmobInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$AdmobInfo$$serializer.INSTANCE, (Object) null);
            NativeAdsDto.MediationEndPoint mediationEndPoint3 = (NativeAdsDto.MediationEndPoint) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, NativeAdsDto$MediationEndPoint$$serializer.INSTANCE, (Object) null);
            List list5 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), (Object) null);
            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 5, (jp) lazyArr[5].getValue(), (Object) null);
            mediationEndPoint = mediationEndPoint3;
            list3 = list5;
            admobInfo = admobInfo2;
            i = 63;
            str = strAsInterface;
            list = list4;
        } else {
            int i5 = 0;
            boolean z = true;
            List list6 = null;
            List list7 = null;
            NativeAdsDto.AdmobInfo admobInfo3 = null;
            List list8 = null;
            String strAsInterface2 = null;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                    case 0:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                        i2 = IAuthTabCallbackDefault + 95;
                        onTransact = i2 % 128;
                        int i6 = i2 % 2;
                        i4 = 5;
                    case 1:
                        list8 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArr[1].getValue(), list8);
                        i5 |= 2;
                        i4 = 5;
                    case 2:
                        admobInfo3 = (NativeAdsDto.AdmobInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, NativeAdsDto$AdmobInfo$$serializer.INSTANCE, admobInfo3);
                        i5 |= 4;
                        i4 = 5;
                    case 3:
                        mediationEndPoint2 = (NativeAdsDto.MediationEndPoint) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, NativeAdsDto$MediationEndPoint$$serializer.INSTANCE, mediationEndPoint2);
                        i5 |= 8;
                        i4 = 5;
                    case 4:
                        list7 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 4, (jp) lazyArr[4].getValue(), list7);
                        i5 |= 16;
                        i4 = 5;
                    case 5:
                        list6 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, i4, (jp) lazyArr[i4].getValue(), list6);
                        i5 |= 32;
                        i2 = IAuthTabCallbackDefault + 53;
                        onTransact = i2 % 128;
                        int i62 = i2 % 2;
                        i4 = 5;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            list = list8;
            str = strAsInterface2;
            i = i5;
            list2 = list6;
            List list9 = list7;
            mediationEndPoint = mediationEndPoint2;
            admobInfo = admobInfo3;
            list3 = list9;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        NativeAdsDto.Mediation mediation = new NativeAdsDto.Mediation(i, str, list, admobInfo, mediationEndPoint, list3, list2, (okycx) null);
        int i7 = IAuthTabCallbackDefault + 63;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return mediation;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m35deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return deserialize(decoder);
        }
        deserialize(decoder);
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull NativeAdsDto.Mediation mediation) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mediation, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        NativeAdsDto.Mediation.IAuthTabCallback(mediation, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onTransact + 43;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (NativeAdsDto.Mediation) obj);
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallbackDefault + 9;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int length;
        char[] cArr3;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr4 = onNavigationEvent;
        if (cArr4 != null) {
            int i3 = $10 + 17;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr4[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Color.red(0) + 77, KeyEvent.keyCodeFromString("") + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
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
            cArr4 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        long j = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 75 - Gravity.getAbsoluteGravity(0, 0), 16085 - AndroidCharacter.getMirror('0'), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 64 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i5 = $10 + 53;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                int i7 = $10 + 71;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i9 = $11 + 119;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        int i10 = $11 + 41;
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 3;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr4[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 62 - Process.getGidForName(""), TextUtils.getTrimmedLength("") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new char[]{32739, 32737, 32746, 32748, 32743, 32538};
        IAuthTabCallback = -1184333933;
        onWarmupCompleted = true;
        onExtraCallback = true;
    }
}
