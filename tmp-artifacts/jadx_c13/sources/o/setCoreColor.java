package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.qt;
import o.setCoreColor;
import o.uu;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setCoreColor<K, V> extends getDynamicWidth<K, V, Map.Entry<? extends K, ? extends V>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27260, 27169, 27196, 27253, 27173, 27176, 27198, 27171};
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final SerialDescriptor onExtraCallback;

    public static /* synthetic */ Unit IAuthTabCallback(KSerializer kSerializer, KSerializer kSerializer2, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(kSerializer, kSerializer2, qtVar);
        int i4 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.getDynamicWidth
    public /* synthetic */ Object IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        K kOnWarmupCompleted = onWarmupCompleted((Map.Entry) obj);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return kOnWarmupCompleted;
    }

    @Override // o.getDynamicWidth
    public /* synthetic */ Object onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        Map.Entry<? extends K, ? extends V> entry = (Map.Entry) obj;
        if (i2 % 2 != 0) {
            return onNavigationEvent(entry);
        }
        onNavigationEvent(entry);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getDynamicWidth
    public /* synthetic */ Object onExtraCallback(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(obj, obj2);
            throw null;
        }
        Map.Entry<K, V> entryIAuthTabCallback = IAuthTabCallback(obj, obj2);
        int i3 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return entryIAuthTabCallback;
    }

    static final class onWarmupCompleted<K, V> implements Map.Entry<K, V>, KMappedMarker {
        private final V onExtraCallbackWithResult;
        private final K onWarmupCompleted;

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            return Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.onWarmupCompleted;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.onExtraCallbackWithResult;
            return (iHashCode * 31) + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.onWarmupCompleted + ", value=" + this.onExtraCallbackWithResult + ')';
        }

        public onWarmupCompleted(K k, V v) {
            this.onWarmupCompleted = k;
            this.onExtraCallbackWithResult = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.onWarmupCompleted;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.onExtraCallbackWithResult;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCoreColor(@NotNull final KSerializer<K> kSerializer, @NotNull final KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.onExtraCallback = ujb.onExtraCallback("kotlin.collections.Map.Entry", uu.onWarmupCompleted.onWarmupCompleted, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.MapEntrySerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCoreColor.IAuthTabCallback(kSerializer, kSerializer2, (qt) obj);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(KSerializer kSerializer, KSerializer kSerializer2, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        Object[] objArr = new Object[1];
        a(new int[]{0, 3, 0, 2}, false, new byte[]{1, 0, 0}, objArr);
        qt.onExtraCallback(qtVar, ((String) objArr[0]).intern(), kSerializer.getDescriptor(), null, false, 12, null);
        Object[] objArr2 = new Object[1];
        a(new int[]{3, 5, 0, 0}, false, new byte[]{0, 1, 1, 1, 0}, objArr2);
        qt.onExtraCallback(qtVar, ((String) objArr2[0]).intern(), kSerializer2.getDescriptor(), null, false, 12, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unit;
    }

    protected K onWarmupCompleted(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        K key;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(entry, "");
            key = entry.getKey();
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(entry, "");
            key = entry.getKey();
        }
        int i4 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return key;
        }
        throw null;
    }

    protected V onNavigationEvent(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        V value = entry.getValue();
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    protected Map.Entry<K, V> IAuthTabCallback(K k, V v) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(k, v);
        int i2 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = IAuthTabCallback;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 25;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0, 0) + 35284), 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14238 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i8 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 35283), Drawable.resolveOpacity(0, 0) + 35, 14239 - (ViewConfiguration.getPressedStateDuration() >> 16), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                c = '0';
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10935), 65 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 28, 17658 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 71, View.MeasureSpec.makeMeasureSpec(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
                int i12 = $11 + 43;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i15 = $10 + 53;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i17 = $10 + 39;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] * iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent >> 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
