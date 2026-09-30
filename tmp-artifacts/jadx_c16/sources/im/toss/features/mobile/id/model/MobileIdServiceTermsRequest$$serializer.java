package im.toss.features.mobile.id.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
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
public final /* synthetic */ class MobileIdServiceTermsRequest$$serializer implements aeu2<MobileIdServiceTermsRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final MobileIdServiceTermsRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i3 + 73;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onWarmupCompleted();
        MobileIdServiceTermsRequest$$serializer mobileIdServiceTermsRequest$$serializer = new MobileIdServiceTermsRequest$$serializer();
        INSTANCE = mobileIdServiceTermsRequest$$serializer;
        Object[] objArr = new Object[1];
        a(new char[]{25926, 23815, 41874, 38216, 25903, 938, 7740, 35196, 7721, 33972, 39777, 550, 37664, 2466, 4211, 34684, 5171, 37557, 36215, 6267, 35176, 6058, 2685, 40298, 559, 39083, 34679, 5670, 34607, 7587, 15420, 27493, 14377, 59043, 47479, 60516, 48488, 27530, 13949, 24938, 13871, 60587, 45943, 64065, 43810, 29076, 10359, 32634, 11312, 64174, 42353, 61549, 41234, 32674, 8800, 30053, 23093, 49301, 24439, 52857, 57139, 17826, 54369, 17276}, Color.argb(0, 0, 0, 0), objArr);
        setAnimationsLoop setanimationsloop = new setAnimationsLoop(((String) objArr[0]).intern(), mobileIdServiceTermsRequest$$serializer, 2);
        Object[] objArr2 = new Object[1];
        a(new char[]{6813, 30970, 56656, 61910, 6889, 9794, 24729, 60914}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(new char[]{10770, 50589, 13716, 29849, 10867, 39720, 34912, 26801, 20806, 7218, 3455, 58300, 56444}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        setanimationsloop.onWarmupCompleted(((String) objArr3[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private MobileIdServiceTermsRequest$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            kSerializerArr = new KSerializer[5];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            kSerializerArr[1] = getwrigglelayout;
            kSerializerArr[1] = getwrigglelayout;
        } else {
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{getwrigglelayout2, getwrigglelayout2};
        }
        int i3 = onNavigationEvent + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MobileIdServiceTermsRequest deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        String strAsInterface2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i2 = 3;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onNavigationEvent + 3;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
        } else {
            String strAsInterface3 = null;
            String strAsInterface4 = null;
            int i5 = 0;
            boolean z = true;
            while (!(!z)) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i6 = onExtraCallback + 3;
                    int i7 = i6 % 128;
                    onNavigationEvent = i7;
                    int i8 = i6 % 2;
                    if (iOnNavigationEvent != 0) {
                        int i9 = i7 + 69;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i5 |= 2;
                    } else {
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i5 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface3;
            strAsInterface2 = strAsInterface4;
            i2 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MobileIdServiceTermsRequest(i2, strAsInterface, strAsInterface2, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m665deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        MobileIdServiceTermsRequest mobileIdServiceTermsRequestDeserialize = deserialize(decoder);
        int i3 = onExtraCallback + 77;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return mobileIdServiceTermsRequestDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MobileIdServiceTermsRequest mobileIdServiceTermsRequest) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mobileIdServiceTermsRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        MobileIdServiceTermsRequest.onNavigationEvent(mobileIdServiceTermsRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MobileIdServiceTermsRequest) obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return super.typeParametersSerializers();
        }
        super.typeParametersSerializers();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), TextUtils.getTrimmedLength("") + 84, 21234 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - KeyEvent.normalizeMetaState(0)), 19 - Drawable.resolveOpacity(0, 0), 8808 - View.resolveSize(0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i4 = $10 + 1;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 97;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = -5895936665583344180L;
    }
}
