package im.toss.core.tracker.payload;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import java.util.Map;
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
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final /* synthetic */ class DomainLogPayload$$serializer implements aeu2<DomainLogPayload> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final DomainLogPayload$$serializer INSTANCE;
    private static int asInterface = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 59;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return serialDescriptor;
    }

    static {
        IAuthTabCallback();
        DomainLogPayload$$serializer domainLogPayload$$serializer = new DomainLogPayload$$serializer();
        INSTANCE = domainLogPayload$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.core.tracker.payload.DomainLogPayload", domainLogPayload$$serializer, 6);
        setanimationsloop.onWarmupCompleted("domain", false);
        Object[] objArr = new Object[1];
        a(new char[]{25821, 32708, 23109, 5856}, 4 - View.MeasureSpec.getSize(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("log_id", true);
        setanimationsloop.onWarmupCompleted("log_time", true);
        setanimationsloop.onWarmupCompleted("company", true);
        setanimationsloop.onWarmupCompleted("logName", true);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 23;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private DomainLogPayload$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnExtraCallbackWithResult = DomainLogPayload.onExtraCallbackWithResult();
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, lazyArrOnExtraCallbackWithResult[1].getValue(), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        Lazy[] lazyArrOnExtraCallbackWithResult2 = DomainLogPayload.onExtraCallbackWithResult();
        KSerializer<?>[] kSerializerArr = new KSerializer[56];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[1] = lazyArrOnExtraCallbackWithResult2[1].getValue();
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[4] = getwrigglelayout2;
        kSerializerArr[2] = getwrigglelayout2;
        kSerializerArr[3] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final DomainLogPayload deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        Map map;
        String str;
        String str2;
        String strAsInterface;
        String strAsInterface2;
        String str3;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 49;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = DomainLogPayload.onExtraCallbackWithResult();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackDefault + 9;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            Map map2 = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            String strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            int i7 = onTransact + 91;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            map = map2;
            str = strAsInterface3;
            i = 63;
            str2 = strAsInterface5;
            str3 = strAsInterface4;
        } else {
            i = 0;
            boolean z = true;
            map = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            String strAsInterface9 = null;
            String strAsInterface10 = null;
            while (z) {
                int i9 = onTransact + 97;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        continue;
                    case 1:
                        map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), map);
                        i |= 2;
                        break;
                    case 2:
                        strAsInterface10 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strAsInterface9 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            str = strAsInterface6;
            str2 = strAsInterface7;
            strAsInterface = strAsInterface8;
            strAsInterface2 = strAsInterface9;
            str3 = strAsInterface10;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new DomainLogPayload(i, str, map, str3, strAsInterface, strAsInterface2, str2, null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m88deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            throw null;
        }
        DomainLogPayload domainLogPayloadDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallbackDefault + 33;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return domainLogPayloadDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DomainLogPayload domainLogPayload) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(domainLogPayload, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            DomainLogPayload.onWarmupCompleted(domainLogPayload, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(domainLogPayload, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        DomainLogPayload.onWarmupCompleted(domainLogPayload, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = 94 / 0;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DomainLogPayload) obj);
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 97;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 69;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 65;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            int i8 = 58224;
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i8) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4) + 10;
                        int mirror = 12482 - AndroidCharacter.getMirror('0');
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iMakeMeasureSpec, mirror, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 10 - (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    int i11 = $10 + 125;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (Process.myPid() >> 22)), 14 - (KeyEvent.getMaxKeyCode() >> 16), 19900 - TextUtils.lastIndexOf("", '0', 0), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i13 = $10 + 19;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = (char) 54970;
        onExtraCallback = (char) 12011;
        onWarmupCompleted = (char) 31825;
        IAuthTabCallback = (char) 2805;
    }
}
