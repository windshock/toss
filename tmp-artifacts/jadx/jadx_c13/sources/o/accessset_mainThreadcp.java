package o;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.opentelemetry.sdk.metrics.SdkMeterProvider$;
import io.opentelemetry.sdk.metrics.internal.export.RegisteredReader;
import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;
import io.opentelemetry.sdk.resources.Resource;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import o.accessset_mainThreadcp;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class accessset_mainThreadcp implements findTimestampInFilename, Closeable {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Logger IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static char[] asInterface = null;
    private static int getInterfaceDescriptor = 1;
    private final includeServiceLoader IAuthTabCallbackStub;
    private final List<RegisteredView> asBinder;
    private final AtomicBoolean onExtraCallback = new AtomicBoolean(false);
    private final List<removeMetadata> onExtraCallbackWithResult;
    private final List<RegisteredReader> onNavigationEvent;
    private final component17<getCtx> onTransact;
    private final component27<updateOrientation> onWarmupCompleted;

    static {
        onWarmupCompleted();
        IAuthTabCallback = Logger.getLogger(accessset_mainThreadcp.class.getName());
        int i = access100 + 97;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getOr IAuthTabCallback() {
        int i = 2 % 2;
        getOr getor = new getOr();
        int i2 = IAuthTabCallbackDefault + 111;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return getor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    accessset_mainThreadcp(final List<RegisteredView> list, IdentityHashMap<pausedSession, addMetadataString> identityHashMap, List<removeMetadata> list2, extractTombstoneLogBuffers extracttombstonelogbuffers, Resource resource, DslJson3 dslJson3, component27<updateOrientation> component27Var) {
        long jOnNavigationEvent = extracttombstonelogbuffers.onNavigationEvent();
        this.asBinder = list;
        List<RegisteredReader> list3 = (List) identityHashMap.entrySet().stream().map(new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda1
            public static int onExtraCallbackWithResult;
            public static int onWarmupCompleted;

            public static int IAuthTabCallback() {
                int i = onExtraCallbackWithResult;
                int i2 = i % 5525447;
                onExtraCallbackWithResult = i + 1;
                if (i2 != 0) {
                    return onWarmupCompleted;
                }
                int i3 = Settings.System.getInt(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
                onWarmupCompleted = i3;
                return i3;
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return accessset_mainThreadcp.onExtraCallbackWithResult(list, (Map.Entry) obj);
            }
        }).collect(Collectors.toList());
        this.onNavigationEvent = list3;
        this.onExtraCallbackWithResult = list2;
        this.IAuthTabCallbackStub = includeServiceLoader.IAuthTabCallback(extracttombstonelogbuffers, resource, dslJson3, jOnNavigationEvent);
        this.onTransact = new component17<>(new SdkMeterProvider$.ExternalSyntheticLambda2(this));
        this.onWarmupCompleted = component27Var;
        int i = 2 % 2;
        for (RegisteredReader registeredReader : list3) {
            ArrayList arrayList = new ArrayList(list2);
            arrayList.add(new onExtraCallback(this.onTransact, this.IAuthTabCallbackStub, registeredReader));
            registeredReader.IAuthTabCallback().onExtraCallbackWithResult((addMetadataOpaque) new onNavigationEvent(arrayList, this.IAuthTabCallbackStub, (AnonymousClass2) null));
            registeredReader.onExtraCallback(jOnNavigationEvent);
        }
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ RegisteredReader onExtraCallbackWithResult(List list, Map.Entry entry) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            RegisteredReader registeredReaderOnWarmupCompleted = RegisteredReader.onWarmupCompleted((pausedSession) entry.getKey(), getCachedPower.onExtraCallbackWithResult((clearMetadataTab) entry.getKey(), (addMetadataString) entry.getValue(), list));
            int i3 = 61 / 0;
            return registeredReaderOnWarmupCompleted;
        }
        return RegisteredReader.onWarmupCompleted((pausedSession) entry.getKey(), getCachedPower.onExtraCallbackWithResult((clearMetadataTab) entry.getKey(), (addMetadataString) entry.getValue(), list));
    }

    public static /* synthetic */ getCtx onNavigationEvent(accessset_mainThreadcp accessset_mainthreadcp, TombstoneParserCompanion tombstoneParserCompanion) {
        int i = 2 % 2;
        getCtx getctx = new getCtx(accessset_mainthreadcp.IAuthTabCallbackStub, tombstoneParserCompanion, accessset_mainthreadcp.onNavigationEvent, accessset_mainthreadcp.onExtraCallbackWithResult(tombstoneParserCompanion));
        int i2 = IAuthTabCallbackDefault + 7;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return getctx;
    }

    private updateOrientation onExtraCallbackWithResult(TombstoneParserCompanion tombstoneParserCompanion) {
        int i = 2 % 2;
        updateOrientation updateorientation = (updateOrientation) this.onWarmupCompleted.apply(tombstoneParserCompanion);
        if (updateorientation != null) {
            return updateorientation;
        }
        int i2 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        updateOrientation updateorientationIAuthTabCallback = updateOrientation.IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return updateorientationIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // o.findTimestampInFilename
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public updateSeverityInternal onNavigationEvent(String str) throws Throwable {
        int i = 2 % 2;
        if (this.onNavigationEvent.isEmpty()) {
            int i2 = IAuthTabCallbackDefault + 65;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return findTimestampInFilename.onNavigationEvent().onNavigationEvent(str);
        }
        if (str != null) {
            int i4 = IAuthTabCallbackDefault + 95;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                str.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str.isEmpty()) {
                IAuthTabCallback.fine("Meter requested without instrumentation scope name.");
                Object[] objArr = new Object[1];
                a(new int[]{0, 7, Imgproc.COLOR_BGRA2YUV_YV12, 0}, true, new byte[]{0, 1, 0, 1, 1, 1, 1}, objArr);
                str = ((String) objArr[0]).intern();
            }
        }
        getOrNull getornull = new getOrNull(this.onTransact, str);
        int i5 = IAuthTabCallbackDefault + 3;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return getornull;
    }

    public extractTombstoneThreads onExtraCallback() {
        extractTombstoneThreads extracttombstonethreadsIAuthTabCallback;
        int i = 2 % 2;
        if (!this.onExtraCallback.compareAndSet(false, true)) {
            IAuthTabCallback.info("Multiple close calls");
            return extractTombstoneThreads.IAuthTabCallback();
        }
        if (!this.onNavigationEvent.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<RegisteredReader> it = this.onNavigationEvent.iterator();
            while (it.hasNext()) {
                int i2 = IAuthTabCallback_Parcel + 57;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(it.next().IAuthTabCallback().onExtraCallback());
            }
            return extractTombstoneThreads.onExtraCallback(arrayList);
        }
        int i4 = IAuthTabCallbackDefault + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            extracttombstonethreadsIAuthTabCallback = extractTombstoneThreads.IAuthTabCallback();
            int i5 = 24 / 0;
        } else {
            extracttombstonethreadsIAuthTabCallback = extractTombstoneThreads.IAuthTabCallback();
        }
        int i6 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return extracttombstonethreadsIAuthTabCallback;
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback().onNavigationEvent(10L, TimeUnit.SECONDS);
        int i4 = IAuthTabCallbackDefault + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkMeterProvider{clock=" + this.IAuthTabCallbackStub.IAuthTabCallback() + ", resource=" + this.IAuthTabCallbackStub.onNavigationEvent() + ", metricReaders=" + this.onNavigationEvent.stream().map(new Function() { // from class: io.opentelemetry.sdk.metrics.SdkMeterProvider$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((RegisteredReader) obj).IAuthTabCallback();
            }
        }).collect(Collectors.toList()) + ", metricProducers=" + this.onExtraCallbackWithResult + ", views=" + this.asBinder + "}";
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asInterface;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 17;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35283), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), Color.blue(0) + 35, View.getDefaultSize(0, 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i7++;
                }
                j = 0;
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
                int i9 = $10 + 1;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 65, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        int i12 = $11 + 35;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 30, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17656, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 70 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i15 = $10 + 37;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 << i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i16 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i16, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i16);
            }
        }
        if (!(!z)) {
            int i17 = $10 + 47;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr7 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i19 = $11 + 63;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) / 0];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 0;
                } else {
                    cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                int i20 = $10 + 69;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        asInterface = new char[]{27188, 27318, 27319, 27322, 27324, 27324, 27321};
    }
}
