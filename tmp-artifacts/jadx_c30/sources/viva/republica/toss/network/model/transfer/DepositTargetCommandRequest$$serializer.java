package viva.republica.toss.network.model.transfer;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Lazy;
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
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class DepositTargetCommandRequest$$serializer implements aeu2<DepositTargetCommandRequest> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final DepositTargetCommandRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            serialDescriptor = descriptor;
            int i4 = 87 / 0;
        } else {
            serialDescriptor = descriptor;
        }
        int i5 = i3 + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return serialDescriptor;
    }

    static {
        onExtraCallback();
        DepositTargetCommandRequest$$serializer depositTargetCommandRequest$$serializer = new DepositTargetCommandRequest$$serializer();
        INSTANCE = depositTargetCommandRequest$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("viva.republica.toss.network.model.transfer.DepositTargetCommandRequest", depositTargetCommandRequest$$serializer, 3);
        Object[] objArr = new Object[1];
        a(new char[]{145, 250, 39760, 49455, 30448, 49853, 6827}, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("depositTarget", false);
        setanimationsloop.onWarmupCompleted("sessionKey", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 75;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private DepositTargetCommandRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlinx.serialization.KSerializer[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlinx.serialization.KSerializer[]] */
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Lazy[] lazyArrOnExtraCallbackWithResult = DepositTargetCommandRequest.onExtraCallbackWithResult();
            ?? r3 = new KSerializer[3];
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            r3[1] = sp.IAuthTabCallback(getwrigglelayout);
            r3[1] = lazyArrOnExtraCallbackWithResult[0].getValue();
            r3[2] = sp.IAuthTabCallback(getwrigglelayout);
            kSerializerArr = r3;
        } else {
            Lazy[] lazyArrOnExtraCallbackWithResult2 = DepositTargetCommandRequest.onExtraCallbackWithResult();
            getWriggleLayout getwrigglelayout2 = getWriggleLayout.onNavigationEvent;
            kSerializerArr = new KSerializer[]{sp.IAuthTabCallback(getwrigglelayout2), lazyArrOnExtraCallbackWithResult2[1].getValue(), sp.IAuthTabCallback(getwrigglelayout2)};
        }
        int i3 = onExtraCallbackWithResult + 11;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArr;
    }

    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DepositTargetCommandRequest depositTargetCommandRequestM86deserialize = m86deserialize(decoder);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return depositTargetCommandRequestM86deserialize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065 A[SYNTHETIC] */
    /* renamed from: deserialize, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DepositTargetCommandRequest m86deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        String str;
        DepositTarget depositTarget;
        int i;
        String str2;
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallbackWithResult = DepositTargetCommandRequest.onExtraCallbackWithResult();
        DepositTarget depositTarget2 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getwrigglelayout, (Object) null);
            depositTarget = (DepositTarget) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), (Object) null);
            str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getwrigglelayout, (Object) null);
            str2 = str3;
            i = 7;
        } else {
            int i3 = 0;
            String str4 = null;
            String str5 = null;
            boolean z = true;
            while (z) {
                int i4 = onNavigationEvent + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    int i5 = 66 / 0;
                    if (iOnNavigationEvent == -1) {
                        int i6 = onNavigationEvent + 103;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str5);
                        i3 |= 1;
                    } else if (iOnNavigationEvent != 1) {
                        int i8 = onExtraCallbackWithResult + 75;
                        onNavigationEvent = i8 % 128;
                        if (i8 % 2 != 0) {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i3 |= 4;
                        } else {
                            if (iOnNavigationEvent != 2) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str4);
                            i3 |= 4;
                        }
                    } else {
                        depositTarget2 = (DepositTarget) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallbackWithResult[1].getValue(), depositTarget2);
                        i3 |= 2;
                    }
                } else {
                    iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        int i62 = onNavigationEvent + 103;
                        onExtraCallbackWithResult = i62 % 128;
                        int i72 = i62 % 2;
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                    }
                }
            }
            str = str4;
            depositTarget = depositTarget2;
            i = i3;
            str2 = str5;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        DepositTargetCommandRequest depositTargetCommandRequest = new DepositTargetCommandRequest(i, str2, depositTarget, str, (okycx) null);
        int i9 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return depositTargetCommandRequest;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (DepositTargetCommandRequest) obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull DepositTargetCommandRequest depositTargetCommandRequest) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(depositTargetCommandRequest, BuildConfig.FLAVOR);
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        DepositTargetCommandRequest.IAuthTabCallback(depositTargetCommandRequest, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 25;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 45812), (ViewConfiguration.getJumpTapTimeout() >> 16) + 84, 21233 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 19, 8808 - View.resolveSizeAndState(0, 0, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onExtraCallback() {
        onExtraCallback = 8620128629567004950L;
    }
}
