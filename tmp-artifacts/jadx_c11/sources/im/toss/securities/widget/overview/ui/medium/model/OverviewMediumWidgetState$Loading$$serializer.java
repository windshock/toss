package im.toss.securities.widget.overview.ui.medium.model;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.securities.widget.overview.ui.medium.model.OverviewMediumWidgetState;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
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
import o.aeu2;
import o.dj3;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class OverviewMediumWidgetState$Loading$$serializer implements aeu2<OverviewMediumWidgetState.Loading> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final OverviewMediumWidgetState$Loading$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 27;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        OverviewMediumWidgetState$Loading$$serializer overviewMediumWidgetState$Loading$$serializer = new OverviewMediumWidgetState$Loading$$serializer();
        INSTANCE = overviewMediumWidgetState$Loading$$serializer;
        $stable = 8;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("Loading", overviewMediumWidgetState$Loading$$serializer, 2);
        setanimationsloop.onWarmupCompleted("displaySetting", true);
        Object[] objArr = new Object[1];
        a(new char[]{48109, 46302, 61528, 58030, 63770, 34008}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onExtraCallback + 115;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private OverviewMediumWidgetState$Loading$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {OverviewMediumWidgetState.Loading.IAuthTabCallback()[0].getValue(), dj3.onWarmupCompleted};
        int i4 = onTransact + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMediumWidgetState.Loading deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        DisplaySetting displaySetting;
        float fOnWarmupCompleted;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = OverviewMediumWidgetState.Loading.IAuthTabCallback();
        okycx okycxVar = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i3 = onTransact + 111;
            IAuthTabCallbackDefault = i3 % 128;
            i = 3;
            if (i3 % 2 == 0) {
                displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 0);
            } else {
                displaySetting = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
                fOnWarmupCompleted = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
            }
        } else {
            float fOnWarmupCompleted2 = 0.0f;
            DisplaySetting displaySetting2 = null;
            boolean z = true;
            int i4 = 0;
            while (z) {
                int i5 = onTransact + 45;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i6 = onTransact + 119;
                    IAuthTabCallbackDefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i4 |= 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        fOnWarmupCompleted2 = ywVarOnWarmupCompleted.onWarmupCompleted(serialDescriptor, 1);
                        i4 |= 2;
                    }
                } else {
                    displaySetting2 = (DisplaySetting) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), displaySetting2);
                    i4 |= 1;
                }
            }
            i = i4;
            displaySetting = displaySetting2;
            fOnWarmupCompleted = fOnWarmupCompleted2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMediumWidgetState.Loading(i, displaySetting, fOnWarmupCompleted, okycxVar);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m68deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        OverviewMediumWidgetState.Loading loadingDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 95;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return loadingDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMediumWidgetState.Loading loading) {
        int i = 2 % 2;
        int i2 = onTransact + 47;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(loading, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            OverviewMediumWidgetState.Loading.onExtraCallback(loading, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(loading, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        OverviewMediumWidgetState.Loading.onExtraCallback(loading, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMediumWidgetState.Loading) obj);
        int i4 = IAuthTabCallbackDefault + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onTransact + 25;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 117;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSize = (char) View.resolveSize(i3, i3);
                        int deadChar = 10 - KeyEvent.getDeadChar(i3, i3);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, deadChar, scrollDefaultDelay, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 10, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 14 - ExpandableListView.getPackedPositionGroup(0L), 19901 - Color.green(0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 52637;
        onWarmupCompleted = (char) 45274;
        onNavigationEvent = (char) 31042;
        onExtraCallbackWithResult = (char) 42700;
    }
}
