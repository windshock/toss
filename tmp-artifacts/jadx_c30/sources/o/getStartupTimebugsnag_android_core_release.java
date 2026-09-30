package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.sf.scuba.smartcards.BuildConfig;
import o.ForegroundDetectorOnActivityCallback;
import o.ImmutableConfig;
import o.getDataTrimmed;
import o.getStartupTimebugsnag_android_core_release;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getStartupTimebugsnag_android_core_release {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = -7372002987026637312L;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 24 - KeyEvent.normalizeMetaState(0), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 59 - KeyEvent.normalizeMetaState(0), 6383 - Color.green(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 81;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 123;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 60 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionGroup(0L) + 59, 6383 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public static void onNavigationEvent(getOr getor, InputStream inputStream) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = onExtraCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 5;
            }
            for (ForegroundDetectorOnActivityCallback foregroundDetectorOnActivityCallback : onNavigationEvent(inputStream)) {
                getor.onWarmupCompleted(onExtraCallbackWithResult(foregroundDetectorOnActivityCallback.onNavigationEvent()), onWarmupCompleted(foregroundDetectorOnActivityCallback.IAuthTabCallback()));
            }
            return;
        }
        onNavigationEvent(inputStream).iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ List onWarmupCompleted(List list) {
        int i = 2 % 2;
        List list2 = (List) list.stream().map(new Function() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfig$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(obj);
            }
        }).collect(Collectors.toList());
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return list2;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.allThreadsbugsnag_android_core_release */
    static List<ForegroundDetectorOnActivityCallback> onNavigationEvent(InputStream inputStream) throws Throwable {
        int i = 2 % 2;
        setNeedNativeVideoPlayBtnVisible setneednativevideoplaybtnvisible = new setNeedNativeVideoPlayBtnVisible(setVideoAdInteractionListener.onWarmupCompleted().IAuthTabCallback());
        try {
            ArrayList arrayList = new ArrayList();
            for (Map map : (List) setneednativevideoplaybtnvisible.IAuthTabCallback(inputStream)) {
                Map map2 = (Map) onExtraCallback(map, "selector", Map.class);
                Objects.requireNonNull(map2, "selector is required");
                Map map3 = (Map) onExtraCallback(map, "view", Map.class);
                Objects.requireNonNull(map3, "view is required");
                getDataTrimmed getdatatrimmed = (getDataTrimmed) Optional.ofNullable((String) onExtraCallback(map2, "instrument_type", String.class)).map(new Function() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfig$$ExternalSyntheticLambda2
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return getDataTrimmed.valueOf((String) obj);
                    }
                }).orElse(null);
                List<String> list = (List) Optional.ofNullable((List) onExtraCallback(map3, "attribute_keys", List.class)).map(new Function() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfig$$ExternalSyntheticLambda3
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return getStartupTimebugsnag_android_core_release.onWarmupCompleted((List) obj);
                    }
                }).orElse(null);
                ForegroundDetectorOnActivityCallback.onExtraCallbackWithResult onExtraCallbackWithResult2 = ForegroundDetectorOnActivityCallback.onExtraCallbackWithResult().onExtraCallbackWithResult(getBackgroundSentbugsnag_android_core_release.IAuthTabCallbackDefault().onExtraCallbackWithResult((String) onExtraCallback(map2, "instrument_name", String.class)).onWarmupCompleted(getdatatrimmed).IAuthTabCallback((String) onExtraCallback(map2, "instrument_unit", String.class)).onWarmupCompleted((String) onExtraCallback(map2, "meter_name", String.class)).onNavigationEvent((String) onExtraCallback(map2, "meter_version", String.class)).onExtraCallback((String) onExtraCallback(map2, "meter_schema_url", String.class)).onNavigationEvent());
                onActivityPostStopped$onExtraCallback onactivitypoststopped_onextracallbackIAuthTabCallbackDefault = ImmutableConfig.IAuthTabCallbackDefault();
                Object[] objArr = new Object[1];
                a(new char[]{7001, 62773, 51100, 53371}, 61026 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0), objArr);
                ImmutableConfig.onNavigationEvent onNavigationEvent = onactivitypoststopped_onextracallbackIAuthTabCallbackDefault.onNavigationEvent((String) onExtraCallback(map3, ((String) objArr[0]).intern(), String.class));
                Object[] objArr2 = new Object[1];
                a(new char[]{6995, 17839, 42686, 1955, 24753, 49583, 8873, 33704, 60598, 19901, 44731}, (-16752899) - Color.rgb(0, 0, 0), objArr2);
                arrayList.add(onExtraCallbackWithResult2.onExtraCallback(onNavigationEvent.IAuthTabCallback((String) onExtraCallback(map3, ((String) objArr2[0]).intern(), String.class)).onExtraCallback((String) onExtraCallback(map3, "aggregation", String.class)).onNavigationEvent((Map) onExtraCallback(map3, "aggregation_args", Map.class)).IAuthTabCallback(list).IAuthTabCallback()).IAuthTabCallback());
                int i2 = onExtraCallbackWithResult + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = onExtraCallbackWithResult + 17;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return arrayList;
        } catch (RuntimeException e) {
            throw new allThreadsbugsnag_android_core_release("Failed to parse view config", e);
        }
    }

    @Nullable
    private static <T> T onExtraCallback(Map<String, Object> map, String str, Class<T> cls) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            map.get(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        T t = (T) map.get(str);
        if (t == null || cls.isInstance(t)) {
            int i3 = onExtraCallback + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return t;
        }
        throw new IllegalStateException("Expected " + str + " to be type " + cls.getName() + " but was " + t.getClass().getName());
    }

    static awaitResult onWarmupCompleted(ImmutableConfig immutableConfig) {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isComplete iscompleteIAuthTabCallbackDefault = awaitResult.IAuthTabCallbackDefault();
        String strIAuthTabCallback = immutableConfig.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            iscompleteIAuthTabCallbackDefault.onExtraCallback(strIAuthTabCallback);
        }
        String strOnExtraCallback = immutableConfig.onExtraCallback();
        if (strOnExtraCallback != null) {
            iscompleteIAuthTabCallbackDefault.onWarmupCompleted(strOnExtraCallback);
        }
        String strOnNavigationEvent = immutableConfig.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            if (immutableConfig.onWarmupCompleted() == null) {
                map = Collections.EMPTY_MAP;
            } else {
                Map<String, Object> mapOnWarmupCompleted = immutableConfig.onWarmupCompleted();
                int i4 = onExtraCallbackWithResult + 9;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                map = mapOnWarmupCompleted;
            }
            iscompleteIAuthTabCallbackDefault.onWarmupCompleted(IAuthTabCallback(strOnNavigationEvent, map));
        }
        List<String> listOnExtraCallbackWithResult = immutableConfig.onExtraCallbackWithResult();
        if (listOnExtraCallbackWithResult != null) {
            final HashSet hashSet = new HashSet(listOnExtraCallbackWithResult);
            iscompleteIAuthTabCallbackDefault.onExtraCallbackWithResult(new Predicate() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfig$$ExternalSyntheticLambda4
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return hashSet.contains((String) obj);
                }
            });
        }
        return iscompleteIAuthTabCallbackDefault.onNavigationEvent();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.allThreadsbugsnag_android_core_release */
    static modifyCallback IAuthTabCallback(String str, Map<String, Object> map) throws allThreadsbugsnag_android_core_release {
        int iIntValue;
        int i;
        List<Double> listOnExtraCallback;
        int i2 = 2 % 2;
        try {
            modifyCallback modifycallbackOnExtraCallback = NativeBridgeWhenMappings.onExtraCallback(str);
            if (!(!modifyCallback.IAuthTabCallback().equals(modifycallbackOnExtraCallback)) && (listOnExtraCallback = onExtraCallback(map)) != null) {
                int i3 = onExtraCallback + 67;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return modifyCallback.onExtraCallback(listOnExtraCallback);
                }
                int i4 = 94 / 0;
                return modifyCallback.onExtraCallback(listOnExtraCallback);
            }
            if (modifyCallback.onExtraCallback().equals(modifycallbackOnExtraCallback)) {
                try {
                    Integer num = (Integer) onExtraCallback(map, "max_buckets", Integer.class);
                    if (num != null) {
                        int i5 = onExtraCallback + 21;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            iIntValue = num.intValue();
                            i = 11;
                        } else {
                            iIntValue = num.intValue();
                            i = 20;
                        }
                        return modifyCallback.onExtraCallbackWithResult(iIntValue, i);
                    }
                } catch (IllegalStateException e) {
                    throw new allThreadsbugsnag_android_core_release("max_buckets must be an integer", e);
                }
            }
            return modifycallbackOnExtraCallback;
        } catch (IllegalArgumentException e2) {
            throw new allThreadsbugsnag_android_core_release("Error creating aggregation", e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.allThreadsbugsnag_android_core_release */
    public static /* synthetic */ Double onExtraCallback(Object obj) throws allThreadsbugsnag_android_core_release {
        Double dValueOf;
        int i = 2 % 2;
        if (!(obj instanceof Number)) {
            throw new allThreadsbugsnag_android_core_release("bucket_boundaries must be an array of numbers");
        }
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
            int i3 = 17 / 0;
        } else {
            dValueOf = Double.valueOf(((Number) obj).doubleValue());
        }
        int i4 = onExtraCallbackWithResult + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    @Nullable
    private static List<Double> onExtraCallback(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            List list = (List) onExtraCallback(map, "bucket_boundaries", List.class);
            if (list == null) {
                int i3 = onExtraCallback + 27;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return null;
            }
            return (List) list.stream().map(new Function() { // from class: io.opentelemetry.sdk.extension.incubator.metric.viewconfig.ViewConfig$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return getStartupTimebugsnag_android_core_release.onExtraCallback(obj2);
                }
            }).collect(Collectors.toList());
        }
        obj.hashCode();
        throw null;
    }

    static TaskType onExtraCallbackWithResult(getBackgroundSentbugsnag_android_core_release getbackgroundsentbugsnag_android_core_release) {
        int i = 2 % 2;
        TrimMetrics trimMetricsIAuthTabCallbackDefault = TaskType.IAuthTabCallbackDefault();
        String strOnNavigationEvent = getbackgroundsentbugsnag_android_core_release.onNavigationEvent();
        if (strOnNavigationEvent != null) {
            trimMetricsIAuthTabCallbackDefault.onExtraCallbackWithResult(strOnNavigationEvent);
            int i2 = onExtraCallbackWithResult + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        getDataTrimmed getdatatrimmedOnExtraCallback = getbackgroundsentbugsnag_android_core_release.onExtraCallback();
        if (getdatatrimmedOnExtraCallback != null) {
            int i4 = onExtraCallbackWithResult + 73;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            trimMetricsIAuthTabCallbackDefault.IAuthTabCallback(getdatatrimmedOnExtraCallback);
        }
        String strOnWarmupCompleted = getbackgroundsentbugsnag_android_core_release.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i6 = onExtraCallback + 13;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                trimMetricsIAuthTabCallbackDefault.IAuthTabCallback(strOnWarmupCompleted);
                throw null;
            }
            trimMetricsIAuthTabCallbackDefault.IAuthTabCallback(strOnWarmupCompleted);
        }
        String strOnExtraCallbackWithResult = getbackgroundsentbugsnag_android_core_release.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            trimMetricsIAuthTabCallbackDefault.onExtraCallback(strOnExtraCallbackWithResult);
        }
        String strIAuthTabCallbackStub = getbackgroundsentbugsnag_android_core_release.IAuthTabCallbackStub();
        if (strIAuthTabCallbackStub != null) {
            int i7 = onExtraCallback + 3;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            trimMetricsIAuthTabCallbackDefault.onNavigationEvent(strIAuthTabCallbackStub);
        }
        String strIAuthTabCallback = getbackgroundsentbugsnag_android_core_release.IAuthTabCallback();
        if (strIAuthTabCallback != null) {
            trimMetricsIAuthTabCallbackDefault.onWarmupCompleted(strIAuthTabCallback);
        }
        return trimMetricsIAuthTabCallbackDefault.onExtraCallbackWithResult();
    }
}
