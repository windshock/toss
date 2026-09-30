package viva.republica.toss.network.model.electronicdocument.auth;

import android.graphics.Color;
import android.view.Gravity;
import android.view.KeyEvent;
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
import net.sf.scuba.smartcards.BuildConfig;
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
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class EDocTokenReq$$serializer implements aeu2<EDocTokenReq> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final EDocTokenReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onNavigationEvent();
        EDocTokenReq$$serializer eDocTokenReq$$serializer = new EDocTokenReq$$serializer();
        INSTANCE = eDocTokenReq$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.electronicdocument.auth.EDocTokenReq", eDocTokenReq$$serializer, 1);
        Object[] objArr = new Object[1];
        a(new char[]{46073, 8332, 10175, 43889, 45965, 48060, 4458, 30985, 57067}, 1 - Color.red(0), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 101;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private EDocTokenReq$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {getWriggleLayout.onNavigationEvent};
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            m49deserialize(decoder);
            obj.hashCode();
            throw null;
        }
        EDocTokenReq eDocTokenReqM49deserialize = m49deserialize(decoder);
        int i3 = onNavigationEvent + 99;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return eDocTokenReqM49deserialize;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* renamed from: deserialize, reason: collision with other method in class */
    public final EDocTokenReq m49deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String strAsInterface;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
        } else {
            String strAsInterface2 = null;
            boolean z = true;
            int i5 = 0;
            while (z) {
                int i6 = onNavigationEvent + 29;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else {
                    if (iOnNavigationEvent != 0) {
                        throw new UnknownFieldException(iOnNavigationEvent);
                    }
                    strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                    i5 = 1;
                }
            }
            strAsInterface = strAsInterface2;
            i4 = i5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new EDocTokenReq(i4, strAsInterface, (okycx) null);
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (EDocTokenReq) obj);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onNavigationEvent + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull EDocTokenReq eDocTokenReq) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(eDocTokenReq, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        EDocTokenReq.onNavigationEvent(eDocTokenReq, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArrTypeParametersSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 21;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - Color.argb(0, 0, 0, 0)), 84 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 21233 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 14185), 19 - Gravity.getAbsoluteGravity(0, 0), 8807 - ((byte) KeyEvent.getModifierMetaStateMask()), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onNavigationEvent() {
        onExtraCallbackWithResult = -227008449368563629L;
    }
}
