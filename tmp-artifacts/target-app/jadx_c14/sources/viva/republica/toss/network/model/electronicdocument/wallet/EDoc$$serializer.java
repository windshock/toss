package viva.republica.toss.network.model.electronicdocument.wallet;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.EncryptedContentInfoParser;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

@Deprecated
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class EDoc$$serializer implements aeu2<EDoc> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    public static final EDoc$$serializer INSTANCE;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 123;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        EDoc$$serializer eDoc$$serializer = new EDoc$$serializer();
        INSTANCE = eDoc$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.wallet.EDoc", eDoc$$serializer, 9);
        setanimationsloop.onWarmupCompleted("docId", true);
        setanimationsloop.onWarmupCompleted("docName", true);
        setanimationsloop.onWarmupCompleted("docStatus", true);
        setanimationsloop.onWarmupCompleted("expireTs", true);
        setanimationsloop.onWarmupCompleted("docCode", true);
        setanimationsloop.onWarmupCompleted("applyType", true);
        setanimationsloop.onWarmupCompleted("receivedDateTime", true);
        setanimationsloop.onWarmupCompleted("iconUrl", true);
        Object[] objArr = new Object[1];
        a(new char[]{31996, 54623, 17961, 17417, 2587, 18709}, Gravity.getAbsoluteGravity(0, 0) + 6, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 79;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private EDoc$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallbackWithResult = EDoc.onExtraCallbackWithResult();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?> kSerializerIAuthTabCallback = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[2].getValue());
        KSerializer<?> kSerializerIAuthTabCallback2 = sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallbackWithResult[5].getValue());
        KSerializer<?> kSerializerIAuthTabCallback3 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback4 = sp.IAuthTabCallback(kSerializer);
        KSerializer<?> kSerializerIAuthTabCallback5 = sp.IAuthTabCallback(EDocButton$$serializer.INSTANCE);
        oty1 oty1Var = oty1.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {oty1Var, kSerializer, kSerializerIAuthTabCallback, kSerializer, oty1Var, kSerializerIAuthTabCallback2, kSerializerIAuthTabCallback3, kSerializerIAuthTabCallback4, kSerializerIAuthTabCallback5};
        int i4 = asBinder + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        EDoc eDocM14deserialize = m14deserialize(decoder);
        int i4 = asBinder + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return eDocM14deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDoc m14deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        long jIAuthTabCallbackDefault;
        String strAsInterface;
        long jIAuthTabCallbackDefault2;
        String str;
        String str2;
        String str3;
        EDocButton eDocButton;
        int i;
        EDocIssuableCandidate.onNavigationEvent onnavigationevent;
        EDocStatus eDocStatus;
        int i2 = 2 % 2;
        int i3 = onTransact + 23;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = EDoc.onExtraCallbackWithResult();
        String strAsInterface2 = null;
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            EDocButton eDocButton2 = null;
            EDocIssuableCandidate.onNavigationEvent onnavigationevent2 = null;
            EDocStatus eDocStatus2 = null;
            strAsInterface = null;
            jIAuthTabCallbackDefault = 0;
            jIAuthTabCallbackDefault2 = 0;
            int i5 = 0;
            str2 = null;
            str = null;
            while (z) {
                int i6 = onTransact + 41;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
                        i5 |= 1;
                        break;
                    case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                        break;
                    case 2:
                        eDocStatus2 = (EDocStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), eDocStatus2);
                        i5 |= 4;
                        break;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        onnavigationevent2 = (EDocIssuableCandidate.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), onnavigationevent2);
                        i5 |= 32;
                        break;
                    case 6:
                        str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, str);
                        i5 |= 64;
                        break;
                    case 7:
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 128;
                        break;
                    case 8:
                        eDocButton2 = (EDocButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, EDocButton$$serializer.INSTANCE, eDocButton2);
                        i5 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            eDocButton = eDocButton2;
            i = i5;
            onnavigationevent = onnavigationevent2;
            eDocStatus = eDocStatus2;
            str3 = strAsInterface2;
        } else {
            int i8 = onTransact + 99;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 0);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            EDocStatus eDocStatus3 = (EDocStatus) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, (jp) lazyArrOnExtraCallbackWithResult[2].getValue(), (Object) null);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 4);
            EDocIssuableCandidate.onNavigationEvent onnavigationevent3 = (EDocIssuableCandidate.onNavigationEvent) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, (jp) lazyArrOnExtraCallbackWithResult[5].getValue(), (Object) null);
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, getwrigglelayout, (Object) null);
            str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, getwrigglelayout, (Object) null);
            str3 = strAsInterface3;
            eDocButton = (EDocButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 8, EDocButton$$serializer.INSTANCE, (Object) null);
            i = 511;
            onnavigationevent = onnavigationevent3;
            eDocStatus = eDocStatus3;
        }
        String str4 = str;
        String str5 = strAsInterface;
        long j = jIAuthTabCallbackDefault;
        long j2 = jIAuthTabCallbackDefault2;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDoc(i, j, str5, eDocStatus, str3, j2, onnavigationevent, str4, str2, eDocButton, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        serialize(encoder, (EDoc) obj);
        if (i3 != 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = asBinder + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDoc eDoc) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(eDoc, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            EDoc.IAuthTabCallback(eDoc, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eDoc, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        EDoc.IAuthTabCallback(eDoc, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = asBinder + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 123;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                int i10 = $11 + 65;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)));
                int i13 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char mode = (char) View.MeasureSpec.getMode(i3);
                        int iMyPid = 10 - (Process.myPid() >> 22);
                        int iMyTid = (Process.myTid() >> 22) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, iMyPid, iMyTid, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 10, 12434 - View.resolveSizeAndState(0, 0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16015 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, 19949 - AndroidCharacter.getMirror('0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onNavigationEvent = (char) 39174;
        onExtraCallback = (char) 57344;
        IAuthTabCallback = (char) 64417;
        onWarmupCompleted = (char) 17644;
    }
}
