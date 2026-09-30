package im.toss.features.home.core.local.model.dst.element;

import android.media.AudioTrack;
import android.os.Process;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.element.OverviewMiniGraphLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal;
import im.toss.features.home.core.local.model.dst.property.ColorAttributeLocal$;
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
import o.TimelineExternalSyntheticLambda0;
import o.aeu2;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class OverviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer implements aeu2<OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final OverviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 77;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 99;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 83 - MotionEvent.axisFromString(""), 21233 - (ViewConfiguration.getFadingEdgeLength() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - ExpandableListView.getPackedPositionGroup(0L)), MotionEvent.axisFromString("") + 20, Process.getGidForName("") + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onExtraCallback();
        OverviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer overviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer = new OverviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer();
        INSTANCE = overviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.element.OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine", overviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{24872, 52959, 56767, 24923, 59871, 24195, 64918, 22987, 8685}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("color", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private OverviewMiniGraphLocal$Graph$VerticalBar$ZeroLine$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onWarmupCompleted()[0].getValue(), ColorAttributeLocal$.serializer.INSTANCE};
        int i4 = onNavigationEvent + 63;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onNavigationEvent onnavigationevent;
        ColorAttributeLocal colorAttributeLocal;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnWarmupCompleted = OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onWarmupCompleted();
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            onnavigationevent = (OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), (Object) null);
            colorAttributeLocal = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, (Object) null);
            int i3 = IAuthTabCallback + 35;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = 3;
        } else {
            OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onNavigationEvent onnavigationevent2 = null;
            ColorAttributeLocal colorAttributeLocal2 = null;
            boolean z = true;
            i = 0;
            while (z) {
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                if (iOnNavigationEvent == -1) {
                    z = false;
                } else if (iOnNavigationEvent != 0) {
                    int i5 = IAuthTabCallback + 101;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (iOnNavigationEvent != 0) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                        i |= 2;
                        int i6 = onNavigationEvent + 93;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        colorAttributeLocal2 = (ColorAttributeLocal) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, ColorAttributeLocal$.serializer.INSTANCE, colorAttributeLocal2);
                        i |= 2;
                        int i62 = onNavigationEvent + 93;
                        IAuthTabCallback = i62 % 128;
                        int i72 = i62 % 2;
                    }
                } else {
                    onnavigationevent2 = (OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onNavigationEvent) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnWarmupCompleted[0].getValue(), onnavigationevent2);
                    i |= 1;
                }
            }
            onnavigationevent = onnavigationevent2;
            colorAttributeLocal = colorAttributeLocal2;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine(i, onnavigationevent, colorAttributeLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m403deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine zeroLineDeserialize = deserialize(decoder);
        int i3 = IAuthTabCallback + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return zeroLineDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine zeroLine) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(zeroLine, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine.onNavigationEvent(zeroLine, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (OverviewMiniGraphLocal.Graph.VerticalBar.ZeroLine) obj);
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        int i5 = IAuthTabCallback + 75;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = IAuthTabCallback + 109;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onExtraCallback() {
        onExtraCallback = -1756402413081924828L;
    }
}
