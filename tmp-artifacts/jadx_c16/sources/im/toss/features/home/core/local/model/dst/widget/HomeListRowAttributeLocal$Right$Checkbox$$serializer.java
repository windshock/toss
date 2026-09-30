package im.toss.features.home.core.local.model.dst.widget;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.home.core.local.model.dst.handler.HandlerLocal;
import im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal;
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
import o.BaseManifest3;
import o.TrackGroupExternalSyntheticLambda0;
import o.aeu2;
import o.getBgColor;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.setAppxVersionInWorker;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListRowAttributeLocal$Right$Checkbox$$serializer implements aeu2<HomeListRowAttributeLocal.Right.Checkbox> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    public static final HomeListRowAttributeLocal$Right$Checkbox$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return descriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35282), 35 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i10 = $10 + 49;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = $11 + 61;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10935), 65 - KeyEvent.getDeadChar(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0) + 29, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49467), 70 - (ViewConfiguration.getScrollBarSize() >> 8), 12486 - View.resolveSizeAndState(0, 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i16 = $11 + 95;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i18 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i18, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i18);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i19 = $10 + 89;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i21 = $10 + 97;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i23 = $11 + 71;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        onNavigationEvent();
        HomeListRowAttributeLocal$Right$Checkbox$$serializer homeListRowAttributeLocal$Right$Checkbox$$serializer = new HomeListRowAttributeLocal$Right$Checkbox$$serializer();
        INSTANCE = homeListRowAttributeLocal$Right$Checkbox$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.home.core.local.model.dst.widget.HomeListRowAttributeLocal.Right.Checkbox", homeListRowAttributeLocal$Right$Checkbox$$serializer, 6);
        setanimationsloop.onWarmupCompleted("verticalAlignment", false);
        Object[] objArr = new Object[1];
        Object obj = null;
        a(new int[]{0, 5, 0, 3}, true, null, objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), false);
        setanimationsloop.onWarmupCompleted("checked", false);
        setanimationsloop.onWarmupCompleted("disabled", false);
        setanimationsloop.onWarmupCompleted("checkedHandler", false);
        setanimationsloop.onWarmupCompleted("uncheckedHandler", false);
        descriptor = setanimationsloop;
        int i = onWarmupCompleted + 121;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private HomeListRowAttributeLocal$Right$Checkbox$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Right.Checkbox.IAuthTabCallback();
        getBgColor getbgcolor = getBgColor.IAuthTabCallback;
        setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
        KSerializer<?>[] kSerializerArr = {lazyArrIAuthTabCallback[0].getValue(), lazyArrIAuthTabCallback[1].getValue(), getbgcolor, getbgcolor, sp.IAuthTabCallback(setappxversioninworker), sp.IAuthTabCallback(setappxversioninworker)};
        int i4 = onExtraCallback + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[PHI: r0 r2 r5
      0x00bb: PHI (r0v2 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r2v5 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r5v2 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v5 kotlin.Lazy[]) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044 A[PHI: r0 r2 r5
      0x0044: PHI (r0v5 o.yw) = (r0v1 o.yw), (r0v7 o.yw) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r2v7 kotlinx.serialization.descriptors.SerialDescriptor) = (r2v4 kotlinx.serialization.descriptors.SerialDescriptor), (r2v8 kotlinx.serialization.descriptors.SerialDescriptor) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r5v4 kotlin.Lazy[]) = (r5v1 kotlin.Lazy[]), (r5v5 kotlin.Lazy[]) binds: [B:8:0x0042, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HomeListRowAttributeLocal.Right.Checkbox deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        SerialDescriptor serialDescriptor;
        yw ywVarOnWarmupCompleted;
        Lazy[] lazyArrIAuthTabCallback;
        BaseManifest3 baseManifest3;
        HomeListRowAttributeLocal.Right.Checkbox.onWarmupCompleted onwarmupcompleted;
        boolean zOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult2;
        HandlerLocal handlerLocal;
        int i;
        HandlerLocal handlerLocal2;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        onNavigationEvent = i3 % 128;
        int i4 = 5;
        HandlerLocal handlerLocal3 = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Right.Checkbox.IAuthTabCallback();
            int i5 = 80 / 0;
            if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
                int i6 = onExtraCallback + 107;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), (Object) null);
                onwarmupcompleted = (HomeListRowAttributeLocal.Right.Checkbox.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), (Object) null);
                zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                setAppxVersionInWorker setappxversioninworker = setAppxVersionInWorker.onExtraCallback;
                HandlerLocal handlerLocal4 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setappxversioninworker, (Object) null);
                handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 5, setappxversioninworker, (Object) null);
                i = 63;
                handlerLocal2 = handlerLocal4;
            } else {
                boolean z = true;
                handlerLocal = null;
                onwarmupcompleted = null;
                baseManifest3 = null;
                i = 0;
                zOnExtraCallbackWithResult2 = false;
                zOnExtraCallbackWithResult = false;
                while (z) {
                    int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    switch (iOnNavigationEvent) {
                        case -1:
                            z = false;
                        case 0:
                            baseManifest3 = (BaseManifest3) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 0, (jp) lazyArrIAuthTabCallback[0].getValue(), baseManifest3);
                            i |= 1;
                            i4 = 5;
                        case 1:
                            onwarmupcompleted = (HomeListRowAttributeLocal.Right.Checkbox.onWarmupCompleted) ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor, 1, (jp) lazyArrIAuthTabCallback[1].getValue(), onwarmupcompleted);
                            i |= 2;
                            i4 = 5;
                        case 2:
                            zOnExtraCallbackWithResult = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2);
                            i |= 4;
                            i4 = 5;
                        case 3:
                            zOnExtraCallbackWithResult2 = ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3);
                            i |= 8;
                            int i8 = onExtraCallback + 27;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            i4 = 5;
                        case 4:
                            handlerLocal3 = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, setAppxVersionInWorker.onExtraCallback, handlerLocal3);
                            i |= 16;
                        case 5:
                            handlerLocal = (HandlerLocal) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, setAppxVersionInWorker.onExtraCallback, handlerLocal);
                            i |= 32;
                        default:
                            throw new UnknownFieldException(iOnNavigationEvent);
                    }
                }
                handlerLocal2 = handlerLocal3;
            }
        } else {
            Intrinsics.checkNotNullParameter(decoder, "");
            serialDescriptor = descriptor;
            ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
            lazyArrIAuthTabCallback = HomeListRowAttributeLocal.Right.Checkbox.IAuthTabCallback();
            if (!ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            }
        }
        HomeListRowAttributeLocal.Right.Checkbox.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
        BaseManifest3 baseManifest32 = baseManifest3;
        int i10 = i;
        boolean z2 = zOnExtraCallbackWithResult2;
        boolean z3 = zOnExtraCallbackWithResult;
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new HomeListRowAttributeLocal.Right.Checkbox(i10, baseManifest32, onwarmupcompleted2, z3, z2, handlerLocal2, handlerLocal, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m499deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeListRowAttributeLocal.Right.Checkbox checkboxDeserialize = deserialize(decoder);
        if (i3 != 0) {
            int i4 = 2 / 0;
        }
        int i5 = onNavigationEvent + 43;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return checkboxDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull HomeListRowAttributeLocal.Right.Checkbox checkbox) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(checkbox, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            HomeListRowAttributeLocal.Right.Checkbox.IAuthTabCallback(checkbox, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            throw null;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(checkbox, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        HomeListRowAttributeLocal.Right.Checkbox.IAuthTabCallback(checkbox, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        int i3 = onExtraCallback + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (HomeListRowAttributeLocal.Right.Checkbox) obj);
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    static void onNavigationEvent() {
        onExtraCallbackWithResult = new char[]{27191, 27194, 27197, 27179, 27170};
    }
}
