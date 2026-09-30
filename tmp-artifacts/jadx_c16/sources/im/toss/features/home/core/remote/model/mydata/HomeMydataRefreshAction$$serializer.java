package im.toss.features.home.core.remote.model.mydata;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import im.toss.features.home.core.remote.model.mydata.HomeMydataRefreshAction;
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
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeMydataRefreshAction$$serializer implements aeu2<HomeMydataRefreshAction> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final HomeMydataRefreshAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static long onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SerialDescriptor serialDescriptor = descriptor;
        int i4 = i2 + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return serialDescriptor;
        }
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        HomeMydataRefreshAction$$serializer homeMydataRefreshAction$$serializer = new HomeMydataRefreshAction$$serializer();
        INSTANCE = homeMydataRefreshAction$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.remote.model.mydata.HomeMydataRefreshAction", homeMydataRefreshAction$$serializer, 2);
        Object[] objArr = new Object[1];
        a(new char[]{12714, 45712, 59830, 15487, 12766, 57446, 19672, 52151}, TextUtils.indexOf("", "", 0) + 1, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        Object[] objArr2 = new Object[1];
        a(new char[]{32523, 22969, 51548, 47392, 32614, 2899, 27697, 20222, 13654, 50453, 9827}, 1 - View.resolveSize(0, 0), objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 25;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    private HomeMydataRefreshAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArr = {HomeMydataRefreshAction.onExtraCallback()[0].getValue(), sp.IAuthTabCallback(getWriggleLayout.onNavigationEvent)};
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[PHI: r1 r2 r15
      0x0055: PHI (r1v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r2v8 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v10 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r15v5 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1 r2 r15
      0x003d: PHI (r1v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r1v4 kotlinx.serialization.descriptors.SerialDescriptor), (r1v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v3 kotlin.Lazy[]) = (r2v2 kotlin.Lazy[]), (r2v10 kotlin.Lazy[]) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r15v2 o.yw) = (r15v1 o.yw), (r15v7 o.yw) binds: [B:8:0x003b, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeMydataRefreshAction deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrOnExtraCallback;
        HomeMydataRefreshAction.onExtraCallback onextracallback;
        String str;
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = HomeMydataRefreshAction.onExtraCallback();
            int i4 = 22 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                onextracallback = (HomeMydataRefreshAction.onExtraCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), (Object) null);
                str = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, (Object) null);
                i = 3;
            } else {
                HomeMydataRefreshAction.onExtraCallback onextracallback2 = null;
                String str2 = null;
                boolean z = true;
                int i5 = 0;
                while (z) {
                    int i6 = onNavigationEvent + 21;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    if (iOnNavigationEvent == -1) {
                        z = false;
                    } else if (iOnNavigationEvent != 0) {
                        int i8 = onExtraCallbackWithResult;
                        int i9 = i8 + 19;
                        onNavigationEvent = i9 % 128;
                        int i10 = i9 % 2;
                        if (iOnNavigationEvent != 1) {
                            throw new UnknownFieldException(iOnNavigationEvent);
                        }
                        int i11 = i8 + 49;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        str2 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, str2);
                        i5 |= 2;
                    } else {
                        onextracallback2 = (HomeMydataRefreshAction.onExtraCallback) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrOnExtraCallback[0].getValue(), onextracallback2);
                        i5 |= 1;
                    }
                }
                onextracallback = onextracallback2;
                str = str2;
                i = i5;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrOnExtraCallback = HomeMydataRefreshAction.onExtraCallback();
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeMydataRefreshAction(i, onextracallback, str, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m604deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deserialize(decoder);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HomeMydataRefreshAction homeMydataRefreshActionDeserialize = deserialize(decoder);
        int i3 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return homeMydataRefreshActionDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeMydataRefreshAction homeMydataRefreshAction) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(homeMydataRefreshAction, "");
        SerialDescriptor serialDescriptor = descriptor;
        vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
        HomeMydataRefreshAction.onWarmupCompleted(homeMydataRefreshAction, vylVarOnExtraCallback, serialDescriptor);
        vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
        int i4 = onNavigationEvent + 87;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeMydataRefreshAction) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
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
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 115;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 % 4;
        }
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45813 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.blue(0) + 84, ImageFormat.getBitsPerPixel(0) + 21234, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14184 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 20, 8807 - ExpandableListView.getPackedPositionChild(0L), 64918803, false, "d", new Class[]{Object.class, Object.class});
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

    static void onExtraCallbackWithResult() {
        onExtraCallback = -3688560401203844733L;
    }
}
