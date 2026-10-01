package im.toss.securities.libs.performance.tracker.data.model;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
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
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.appInfo;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final /* synthetic */ class MetricV1LogBody$$serializer implements aeu2<MetricV1LogBody> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable;
    private static int IAuthTabCallback = 1;
    public static final MetricV1LogBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return serialDescriptor;
    }

    static {
        onExtraCallbackWithResult();
        MetricV1LogBody$$serializer metricV1LogBody$$serializer = new MetricV1LogBody$$serializer();
        INSTANCE = metricV1LogBody$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("metric_v1", metricV1LogBody$$serializer, 6);
        setanimationsloop.onWarmupCompleted("metrics", false);
        setanimationsloop.onWarmupCompleted("customDimension", false);
        setanimationsloop.onWarmupCompleted("viewName", false);
        setanimationsloop.onWarmupCompleted("sourceType", false);
        setanimationsloop.onWarmupCompleted("metricName", false);
        setanimationsloop.onWarmupCompleted("logId", true);
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 193, 0}, false, new byte[]{1, 1, 1, 1}, objArr);
        setanimationsloop.onWarmupCompleted(new appInfo(((String) objArr[0]).intern()) { // from class: im.toss.securities.libs.performance.tracker.data.model.MetricV1LogBody$$serializer.onWarmupCompleted
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;
            private final /* synthetic */ String onExtraCallbackWithResult;

            {
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallbackWithResult = str;
            }

            public final /* synthetic */ String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted;
                int i3 = i2 + 125;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onExtraCallbackWithResult;
                int i5 = i2 + 45;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final /* synthetic */ Class annotationType() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 125;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 31;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return appInfo.class;
            }

            public final boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = obj instanceof appInfo;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!(obj instanceof appInfo)) {
                    return false;
                }
                if (Intrinsics.areEqual(IAuthTabCallback(), ((appInfo) obj).IAuthTabCallback())) {
                    return true;
                }
                int i3 = onWarmupCompleted + 27;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onExtraCallbackWithResult;
                if (i3 != 0) {
                    return str.hashCode() ^ 707790692;
                }
                str.hashCode();
                throw null;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.onExtraCallbackWithResult + ")";
                int i2 = IAuthTabCallback + 33;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 20 / 0;
                }
                return str;
            }
        });
        descriptor = setanimationsloop;
        $stable = 8;
        int i = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    private MetricV1LogBody$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = MetricV1LogBody.onExtraCallback();
        getWriggleLayout getwrigglelayout = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {lazyArrOnExtraCallback[0].getValue(), lazyArrOnExtraCallback[1].getValue(), getwrigglelayout, getwrigglelayout, getwrigglelayout, getwrigglelayout};
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final MetricV1LogBody deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        List list;
        Map map;
        String strAsInterface;
        String strAsInterface2;
        String strAsInterface3;
        String strAsInterface4;
        int i;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = MetricV1LogBody.onExtraCallback();
        if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            boolean z = true;
            list = null;
            strAsInterface3 = null;
            strAsInterface = null;
            map = null;
            strAsInterface4 = null;
            i = 0;
            strAsInterface2 = null;
            while (z) {
                int i4 = onNavigationEvent + 21;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i5 = onNavigationEvent + 23;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                        continue;
                    case 0:
                        list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), list);
                        i |= 1;
                        i2 = onNavigationEvent + 79;
                        IAuthTabCallback = i2 % 128;
                        break;
                    case 1:
                        map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), map);
                        i |= 2;
                        i2 = IAuthTabCallback + 19;
                        onNavigationEvent = i2 % 128;
                        break;
                    case 2:
                        strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
                        i |= 4;
                        continue;
                    case 3:
                        strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
                        i |= 8;
                        continue;
                    case 4:
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
                        i |= 16;
                        continue;
                    case 5:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
                int i7 = i2 % 2;
            }
        } else {
            list = (List) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
            map = (Map) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 2);
            strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 3);
            strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 4);
            strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            i = 63;
        }
        String str = strAsInterface;
        Map map2 = map;
        int i8 = i;
        String str2 = strAsInterface2;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new MetricV1LogBody(i8, list, map2, str, str2, strAsInterface3, strAsInterface4, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m28deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MetricV1LogBody metricV1LogBodyDeserialize = deserialize(decoder);
        int i4 = onNavigationEvent + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return metricV1LogBodyDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull MetricV1LogBody metricV1LogBody) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(metricV1LogBody, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            MetricV1LogBody.onNavigationEvent(metricV1LogBody, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(metricV1LogBody, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        MetricV1LogBody.onNavigationEvent(metricV1LogBody, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (MetricV1LogBody) obj);
        int i4 = onNavigationEvent + 93;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        long j = 0;
        if (cArr2 != null) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), 36 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 14238 - Process.getGidForName(""), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10935), 65 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, MotionEvent.axisFromString("") + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 49467), 70 - (ViewConfiguration.getTouchSlop() >> 8), 12486 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i10 = $10 + 55;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            int i13 = $10 + 29;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i15 = $11 + 43;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 3 % 3;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $11 + 15;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{27348, 27513, 27515, 27493};
    }
}
