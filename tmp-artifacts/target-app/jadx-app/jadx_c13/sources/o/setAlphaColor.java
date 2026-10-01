package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.qt;
import o.setAlphaColor;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAlphaColor<K, V> extends getDynamicWidth<K, V, Pair<? extends K, ? extends V>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = 4531211164808015566L;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final SerialDescriptor onNavigationEvent;

    public static /* synthetic */ Unit onWarmupCompleted(KSerializer kSerializer, KSerializer kSerializer2, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(kSerializer, kSerializer2, qtVar);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(kSerializer, kSerializer2, qtVar);
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 84, (KeyEvent.getMaxKeyCode() >> 16) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - Color.blue(0)), 18 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), Color.argb(0, 0, 0, 0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 27;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 2;
                }
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

    @Override // o.getDynamicWidth
    public /* bridge */ /* synthetic */ Object IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        K kIAuthTabCallback = IAuthTabCallback((Pair) obj);
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return kIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.getDynamicWidth
    public /* synthetic */ Object onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        Pair<? extends K, ? extends V> pair = (Pair) obj;
        if (i2 % 2 == 0) {
            onWarmupCompleted(pair);
            throw null;
        }
        V vOnWarmupCompleted = onWarmupCompleted(pair);
        int i3 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return vOnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getDynamicWidth
    public /* synthetic */ Object onExtraCallback(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Pair<K, V> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(obj, obj2);
        int i4 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return pairOnExtraCallbackWithResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAlphaColor(@NotNull final KSerializer<K> kSerializer, @NotNull final KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.onNavigationEvent = ujb.IAuthTabCallback("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.PairSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setAlphaColor.onWarmupCompleted(kSerializer, kSerializer2, (qt) obj);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        SerialDescriptor serialDescriptor;
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 1;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            serialDescriptor = this.onNavigationEvent;
            int i4 = 86 / 0;
        } else {
            serialDescriptor = this.onNavigationEvent;
        }
        int i5 = i2 + 75;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return serialDescriptor;
    }

    private static final Unit onExtraCallbackWithResult(KSerializer kSerializer, KSerializer kSerializer2, qt qtVar) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(qtVar, "");
        Object[] objArr = new Object[1];
        a(new char[]{52715, 52621, 14210, 62868, 51190, 8745, 56930, 34499, 39575}, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), objArr);
        qt.onExtraCallback(qtVar, ((String) objArr[0]).intern(), kSerializer.getDescriptor(), null, false, 12, null);
        qt.onExtraCallback(qtVar, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return unit;
    }

    protected K IAuthTabCallback(@NotNull Pair<? extends K, ? extends V> pair) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            return pair.getFirst();
        }
        Intrinsics.checkNotNullParameter(pair, "");
        pair.getFirst();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected V onWarmupCompleted(@NotNull Pair<? extends K, ? extends V> pair) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        V second = pair.getSecond();
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return second;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected Pair<K, V> onExtraCallbackWithResult(K k, V v) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Pair<K, V> pairIAuthTabCallback = getWrite.IAuthTabCallback(k, v);
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }
}
