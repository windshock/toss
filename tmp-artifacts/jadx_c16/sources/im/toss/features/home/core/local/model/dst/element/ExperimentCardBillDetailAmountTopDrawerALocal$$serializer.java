package im.toss.features.home.core.local.model.dst.element;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
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
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.oty1;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ExperimentCardBillDetailAmountTopDrawerALocal$$serializer implements aeu2<ExperimentCardBillDetailAmountTopDrawerALocal> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    public static final ExperimentCardBillDetailAmountTopDrawerALocal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static int onNavigationEvent;
    private static int onTransact;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallback();
        ExperimentCardBillDetailAmountTopDrawerALocal$$serializer experimentCardBillDetailAmountTopDrawerALocal$$serializer = new ExperimentCardBillDetailAmountTopDrawerALocal$$serializer();
        INSTANCE = experimentCardBillDetailAmountTopDrawerALocal$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.ExperimentCardBillDetailAmountTopDrawerALocal", experimentCardBillDetailAmountTopDrawerALocal$$serializer, 5);
        setanimationsloop.onWarmupCompleted("row1", false);
        setanimationsloop.onWarmupCompleted("row2Amount", false);
        Object[] objArr = new Object[1];
        a(new char[]{5409, 34714, 44501, 7643}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("hiddenItems", false);
        setanimationsloop.onWarmupCompleted("handler", false);
        descriptor = setanimationsloop;
        int i = onNavigationEvent + 15;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private ExperimentCardBillDetailAmountTopDrawerALocal$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = ExperimentCardBillDetailAmountTopDrawerALocal.IAuthTabCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {sp.IAuthTabCallback(getwrigglelayout), oty1.onExtraCallback, getwrigglelayout, lazyArrIAuthTabCallback[3].getValue(), sp.IAuthTabCallback(setAppxVersionInWorker.onExtraCallback)};
        int i4 = onTransact + 13;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ExperimentCardBillDetailAmountTopDrawerALocal deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        String str;
        List list;
        String str2;
        HandlerLocal handlerLocal;
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrIAuthTabCallback = ExperimentCardBillDetailAmountTopDrawerALocal.IAuthTabCallback();
        int i3 = 4;
        int i4 = 1;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            String str3 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, (Object) null);
            long jIAuthTabCallbackDefault = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, 1);
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), (Object) null);
            str2 = str3;
            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, (Object) null);
            i = 31;
            j = jIAuthTabCallbackDefault;
            str = strAsInterface;
        } else {
            i = 0;
            boolean z = true;
            String strAsInterface2 = null;
            HandlerLocal handlerLocal2 = null;
            long jIAuthTabCallbackDefault2 = 0;
            List list2 = null;
            String str4 = null;
            while (z) {
                int i5 = onTransact + 65;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    int i6 = i4;
                    int i7 = onTransact + 111;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    i4 = i6;
                    z = false;
                    i3 = 4;
                } else if (iOnNavigationEvent == 0) {
                    str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, str4);
                    i |= 1;
                    i4 = i4;
                } else if (iOnNavigationEvent != i4) {
                    if (iOnNavigationEvent != 2) {
                        int i9 = onTransact + 93;
                        int i10 = i9 % 128;
                        IAuthTabCallbackDefault = i10;
                        int i11 = i9 % 2;
                        if (iOnNavigationEvent == 3) {
                            list2 = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 3, (jp) lazyArrIAuthTabCallback[3].getValue(), list2);
                            i |= 8;
                        } else {
                            if (iOnNavigationEvent != i3) {
                                throw new UnknownFieldException(iOnNavigationEvent);
                            }
                            int i12 = i10 + 109;
                            onTransact = i12 % 128;
                            int i13 = i12 % 2;
                            handlerLocal2 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, setAppxVersionInWorker.onExtraCallback, handlerLocal2);
                            i |= 16;
                            int i14 = IAuthTabCallbackDefault + 55;
                            onTransact = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    } else {
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                    }
                    i4 = 1;
                } else {
                    jIAuthTabCallbackDefault2 = ywVarOnWarmupCompleted.IAuthTabCallbackDefault(serialDescriptor, i4);
                    i |= 2;
                }
            }
            str = strAsInterface2;
            list = list2;
            str2 = str4;
            handlerLocal = handlerLocal2;
            j = jIAuthTabCallbackDefault2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ExperimentCardBillDetailAmountTopDrawerALocal(i, str2, j, str, list, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m342deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ExperimentCardBillDetailAmountTopDrawerALocal experimentCardBillDetailAmountTopDrawerALocalDeserialize = deserialize(decoder);
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return experimentCardBillDetailAmountTopDrawerALocalDeserialize;
        }
        throw null;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ExperimentCardBillDetailAmountTopDrawerALocal experimentCardBillDetailAmountTopDrawerALocal) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(experimentCardBillDetailAmountTopDrawerALocal, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ExperimentCardBillDetailAmountTopDrawerALocal.onWarmupCompleted(experimentCardBillDetailAmountTopDrawerALocal, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(experimentCardBillDetailAmountTopDrawerALocal, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ExperimentCardBillDetailAmountTopDrawerALocal.onWarmupCompleted(experimentCardBillDetailAmountTopDrawerALocal, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = IAuthTabCallbackDefault + 67;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ExperimentCardBillDetailAmountTopDrawerALocal) obj);
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 31;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
            int i3 = 50 / 0;
        } else {
            kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        }
        int i4 = onTransact + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % i4];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $10 + 111;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i11 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i12 = (ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumFlingVelocity, i11, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionChild(0L) + 11, (ViewConfiguration.getScrollBarSize() >> 8) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16761202) - Color.rgb(0, 0, 0)), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), 19901 - View.resolveSizeAndState(0, 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        IAuthTabCallback = (char) 48556;
        onWarmupCompleted = (char) 54034;
        onExtraCallback = (char) 64344;
        onExtraCallbackWithResult = (char) 36124;
    }
}
