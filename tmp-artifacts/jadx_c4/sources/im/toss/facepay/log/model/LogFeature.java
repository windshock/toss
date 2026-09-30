package im.toss.facepay.log.model;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access15300;
import o.liq;
import o.nc;
import o.updateRenderInfoForVideo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LogFeature {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogFeature[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @nc(IAuthTabCallback = "faceauth")
    public static final LogFeature FACEAUTH;

    @nc(IAuthTabCallback = "facecollection")
    public static final LogFeature FACECOLLECTION;

    @nc(IAuthTabCallback = "facepass")
    public static final LogFeature FACEPASS;

    @nc(IAuthTabCallback = "facepay")
    public static final LogFeature FACEPAY;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static long onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String value;

    public static /* synthetic */ KSerializer $r8$lambda$Gkdcv4YcpeXBzopO5ZALFrYcvYw() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializer_init_$_anonymous_ = _init_$_anonymous_();
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return kSerializer_init_$_anonymous_;
    }

    private static final /* synthetic */ LogFeature[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LogFeature logFeature = FACEPAY;
        if (i3 != 0) {
            return new LogFeature[]{logFeature, FACEAUTH, FACEPASS, FACECOLLECTION};
        }
        LogFeature logFeature2 = FACEAUTH;
        LogFeature logFeature3 = FACEPASS;
        LogFeature logFeature4 = FACECOLLECTION;
        LogFeature[] logFeatureArr = {logFeature, logFeature2};
        logFeatureArr[4] = logFeature3;
        logFeatureArr[5] = logFeature4;
        return logFeatureArr;
    }

    public static EnumEntries<LogFeature> getEntries() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 103;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<LogFeature> enumEntries = $ENTRIES;
        int i4 = i2 + 117;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return enumEntries;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializer = (KSerializer) LogFeature.access$get$cachedSerializer$delegate$cp().getValue();
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<LogFeature> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<LogFeature> kSerializerOnExtraCallback = onExtraCallback();
            int i4 = onExtraCallback + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return kSerializerOnExtraCallback;
        }
    }

    private static final /* synthetic */ KSerializer _init_$_anonymous_() throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LogFeature[] logFeatureArrValues = values();
        Object[] objArr = new Object[1];
        a(new char[]{36354, 36452, 18337, 35502, 39140, 24202, 13310, 25265, 50235, 30377, 56252}, TextUtils.lastIndexOf("", '0', 0) + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{21217, 21127, 32677, 39741, 13989, 33400, 3066, 29474, 27258, 20153, 51746, 18336}, ViewConfiguration.getScrollBarSize() >> 8, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a(new char[]{12313, 12415, 6826, 3851, 57042, 57489, 28405, 59156, 33293, 11170, 24083, 45004}, KeyEvent.normalizeMetaState(0), objArr3);
        String strIntern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{3206, 3296, 44645, 51588, 57379, 56349, 55866, 8603, 48380, 40803, 39043, 37154, 44307, 52343, 43907, 16959, 32257, 15730}, ViewConfiguration.getTouchSlop() >> 8, objArr4);
        Object[] objArr5 = new Object[1];
        a(new char[]{18179, 18282, 8502, 28393, 41295, 38804, 21861, 34491, 64897, 4128, 16316, 53277, 59029, 17194, 3252, 846, 13723, 45602, 56742, 12813, 1167, 60692, 43648, 23861, 21430, 56348, 31627, 35958, 41663, 3909, 18619, 48996, 61868, 32293, 6554, 61026, 49335, 44782, 63221, 6558}, KeyEvent.getMaxKeyCode() >> 16, objArr5);
        KSerializer kSerializerOnNavigationEvent = updateRenderInfoForVideo.onNavigationEvent(((String) objArr5[0]).intern(), logFeatureArrValues, new String[]{strIntern, strIntern2, strIntern3, ((String) objArr4[0]).intern()}, new Annotation[][]{null, null, null, null}, (Annotation[]) null);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return kSerializerOnNavigationEvent;
    }

    public static final /* synthetic */ Lazy access$get$cachedSerializer$delegate$cp() {
        Lazy<KSerializer<Object>> lazy;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            lazy = $cachedSerializer$delegate;
            int i4 = 58 / 0;
        } else {
            lazy = $cachedSerializer$delegate;
        }
        int i5 = i3 + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    private LogFeature(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.value;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
        return str;
    }

    static {
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(new char[]{3193, 3135, 40095, 49018, 49747, 56529, 59616, 22341, 40620, 44439, 61032}, ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{36354, 36452, 18337, 35502, 39140, 24202, 13310, 25265, 50235, 30377, 56252}, (-1) - ImageFormat.getBitsPerPixel(0), objArr2);
        FACEPAY = new LogFeature(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new char[]{25907, 25973, 54449, 13526, 48946, 46474, 41166, 56553, 58317, 58797, 26057, 52791}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new char[]{21217, 21127, 32677, 39741, 13989, 33400, 3066, 29474, 27258, 20153, 51746, 18336}, View.resolveSize(0, 0), objArr4);
        FACEAUTH = new LogFeature(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a(new char[]{37554, 37620, 49094, 20208, 39934, 16922, 52153, 42703, 50945, 36558, 8168, 60128}, ViewConfiguration.getTouchSlop() >> 8, objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{12313, 12415, 6826, 3851, 57042, 57489, 28405, 59156, 33293, 11170, 24083, 45004}, Drawable.resolveOpacity(0, 0), objArr6);
        FACEPASS = new LogFeature(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(new char[]{63540, 63602, 45459, 7583, 20709, 10383, 50668, 62880, 3098, 32917, 19608, 8676, 22913, 54145, 32664, 62201, 35475, 8836}, ExpandableListView.getPackedPositionGroup(0L), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new char[]{3206, 3296, 44645, 51588, 57379, 56349, 55866, 8603, 48380, 40803, 39043, 37154, 44307, 52343, 43907, 16959, 32257, 15730}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
        FACECOLLECTION = new LogFeature(strIntern4, 3, ((String) objArr8[0]).intern());
        LogFeature[] logFeatureArr$values = $values();
        $VALUES = logFeatureArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(logFeatureArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: im.toss.facepay.log.model.LogFeature$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    return LogFeature.$r8$lambda$Gkdcv4YcpeXBzopO5ZALFrYcvYw();
                }
                LogFeature.$r8$lambda$Gkdcv4YcpeXBzopO5ZALFrYcvYw();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i = IAuthTabCallback + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static LogFeature valueOf(String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LogFeature logFeature = (LogFeature) Enum.valueOf(LogFeature.class, str);
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return logFeature;
        }
        throw null;
    }

    public static LogFeature[] values() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        LogFeature[] logFeatureArr = (LogFeature[]) $VALUES.clone();
        int i3 = onWarmupCompleted + 13;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return logFeatureArr;
        }
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallbackWithResult ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $11 + 99;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 45812), 84 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 21233 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 19 - TextUtils.getOffsetAfter("", 0), 8808 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i6 = $10 + 1;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    static void onNavigationEvent() {
        onExtraCallbackWithResult = 595785846505934642L;
    }
}
