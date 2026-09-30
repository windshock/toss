package im.toss.appsintoss.data.remote.model;

import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
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
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AppsInTossProductOffer$$serializer implements aeu2<AppsInTossProductOffer> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 0;
    public static final AppsInTossProductOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i6 = i3 + 23;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return serialDescriptor;
    }

    static {
        onWarmupCompleted();
        AppsInTossProductOffer$$serializer appsInTossProductOffer$$serializer = new AppsInTossProductOffer$$serializer();
        INSTANCE = appsInTossProductOffer$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.appsintoss.data.remote.model.AppsInTossProductOffer", appsInTossProductOffer$$serializer, 4);
        setanimationsloop.onWarmupCompleted("offerId", false);
        setanimationsloop.onWarmupCompleted("period", false);
        setanimationsloop.onWarmupCompleted("displayAmount", true);
        Object[] objArr = new Object[1];
        a(new char[]{1106, 1062, 54874, 11433, 34645, 57178, 29233, 12449}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
    }

    private AppsInTossProductOffer$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, kSerializer, sp.IAuthTabCallback(kSerializer), kSerializer};
        int i5 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final AppsInTossProductOffer deserialize(@NotNull Decoder decoder) throws Throwable {
        String strAsInterface;
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Throwable th = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i4 = IAuthTabCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            String strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            str2 = strAsInterface2;
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            str3 = strAsInterface3;
            str = str4;
            i2 = 15;
        } else {
            int i6 = 0;
            boolean z = true;
            String strAsInterface4 = null;
            String strAsInterface5 = null;
            String strAsInterface6 = null;
            String str5 = null;
            while (z) {
                int i7 = IAuthTabCallback + 5;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw th;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent != -1) {
                    int i8 = IAuthTabCallback + 29;
                    int i9 = i8 % 128;
                    onExtraCallbackWithResult = i9;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    if (iOnNavigationEvent == 0) {
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i6 |= 1;
                    } else if (iOnNavigationEvent == 1) {
                        strAsInterface6 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 1);
                        i6 |= 2;
                    } else if (iOnNavigationEvent != 2) {
                        int i10 = i9 + 79;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (iOnNavigationEvent != 5) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                        } else {
                            if (iOnNavigationEvent != 3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            strAsInterface5 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                            i6 |= 8;
                        }
                    } else {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i6 |= 4;
                    }
                    th = null;
                } else {
                    z = false;
                }
            }
            strAsInterface = strAsInterface5;
            str = str5;
            str2 = strAsInterface4;
            int i11 = i6;
            str3 = strAsInterface6;
            i2 = i11;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        AppsInTossProductOffer appsInTossProductOffer = new AppsInTossProductOffer(i2, str2, str3, str, strAsInterface, null);
        int i12 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 != 0) {
            return appsInTossProductOffer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m162deserialize(Decoder decoder) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        AppsInTossProductOffer appsInTossProductOfferDeserialize = deserialize(decoder);
        if (i4 == 0) {
            int i5 = 35 / 0;
        }
        return appsInTossProductOfferDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull AppsInTossProductOffer appsInTossProductOffer) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(appsInTossProductOffer, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            AppsInTossProductOffer.onWarmupCompleted(appsInTossProductOffer, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appsInTossProductOffer, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        AppsInTossProductOffer.onWarmupCompleted(appsInTossProductOffer, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        serialize(encoder, (AppsInTossProductOffer) obj);
        int i5 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.typeParametersSerializers();
            obj.hashCode();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        throw null;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i2);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i4 = $10 + 31;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i6 = $10 + 41;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i8 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Gravity.getAbsoluteGravity(0, 0)), 84 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getEdgeSlop() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 14185), 19 - View.combineMeasuredStates(0, 0), 8807 - TextUtils.lastIndexOf("", '0'), 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static void onWarmupCompleted() {
        onExtraCallback = 5300541994599285126L;
    }
}
