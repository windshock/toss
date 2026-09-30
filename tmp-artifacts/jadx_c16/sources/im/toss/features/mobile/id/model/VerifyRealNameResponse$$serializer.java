package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.getWriggleLayout;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class VerifyRealNameResponse$$serializer implements aeu2<VerifyRealNameResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final VerifyRealNameResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 45;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        IAuthTabCallback();
        VerifyRealNameResponse$$serializer verifyRealNameResponse$$serializer = new VerifyRealNameResponse$$serializer();
        INSTANCE = verifyRealNameResponse$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{63757, 12047, 36403, 4161, 63844, 4237, 61891, 45048, 1758, 4311, 61914, 45030, 1555, 4109, 61700, 44912, 1612, 4190, 61764, 44851, 2003, 4541, 61586, 44702, 1992, 4600, 61660, 44566, 1804, 4412, 61531, 44569, 1862, 4472, 61524, 44508, 1219, 4758, 62440, 44446, 1272, 4834, 62256, 44410, 1072, 4649, 62313, 44330, 1144, 4705, 62116, 44274, 1464, 5059, 62189, 44211, 1519, 4871, 62012}, (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), verifyRealNameResponse$$serializer, 4);
        Object[] objArr2 = new Object[1];
        a(new char[]{40796, 10088, 14731, 39805, 40744, 6399, 17948, 9428}, Color.alpha(0) + 1, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new char[]{10465, 53254, 57561, 2103, 10372, 61319, 40804, 47033, 55060}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        Object[] objArr4 = new Object[1];
        a(new char[]{19906, 34154, 16511, 8654, 19873, 47850, 16332, 40558, 45599, 47791, 16257}, TextUtils.getOffsetAfter("", 0) + 1, objArr4);
        setanimationsloop.onWarmupCompleted(((String) objArr4[0]).intern(), false);
        Object[] objArr5 = new Object[1];
        a(new char[]{8487, 6223, 3770, 33252, 8526, 10198}, 1 - KeyEvent.getDeadChar(0, 0), objArr5);
        setanimationsloop.onWarmupCompleted(((String) objArr5[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private VerifyRealNameResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            return new KSerializer[]{getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        }
        KSerializer<?>[] kSerializerArr = new KSerializer[4];
        getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
        kSerializerArr[1] = getwrigglelayout2;
        kSerializerArr[0] = getwrigglelayout2;
        kSerializerArr[5] = getwrigglelayout2;
        kSerializerArr[5] = getwrigglelayout2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final VerifyRealNameResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String str;
        String strAsInterface2;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            str = strAsInterface3;
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str2 = strAsInterface4;
            i = 15;
        } else {
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String strAsInterface7 = null;
            String strAsInterface8 = null;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent == 0) {
                    strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 |= 1;
                } else if (iOnNavigationEvent == 1) {
                    strAsInterface8 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                    i5 |= 2;
                    int i6 = onExtraCallback + 41;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                } else if (iOnNavigationEvent == 2) {
                    strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                    i5 |= 4;
                } else {
                    if (iOnNavigationEvent != 3) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    int i8 = onExtraCallback + 27;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    strAsInterface7 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                    i5 |= 8;
                }
            }
            strAsInterface = strAsInterface5;
            str = strAsInterface6;
            strAsInterface2 = strAsInterface7;
            str2 = strAsInterface8;
            i = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new VerifyRealNameResponse(i, str, str2, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m672deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        VerifyRealNameResponse verifyRealNameResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return verifyRealNameResponseDeserialize;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull VerifyRealNameResponse verifyRealNameResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(verifyRealNameResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            VerifyRealNameResponse.IAuthTabCallback(verifyRealNameResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(verifyRealNameResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        VerifyRealNameResponse.IAuthTabCallback(verifyRealNameResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (VerifyRealNameResponse) obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallback + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $10 + 107;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - TextUtils.lastIndexOf("", '0')), 84 - (ViewConfiguration.getPressedStateDuration() >> 16), 21233 - ((Process.getThreadPriority(0) + 20) >> 6), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), View.resolveSize(0, 0) + 19, TextUtils.indexOf((CharSequence) "", '0') + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 35;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = 7455494541396100323L;
    }
}
