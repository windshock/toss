package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class q5 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Set<String> IAuthTabCallback;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface = 0;
    public static final q5 onExtraCallback;
    private static final Map<String, q5ExternalSyntheticLambda0> onExtraCallbackWithResult;
    private static final List<q5ExternalSyntheticLambda0> onNavigationEvent;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), View.resolveSizeAndState(0, 0, 0) + 24, (KeyEvent.getMaxKeyCode() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onWarmupCompleted ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16777275, 6382 - MotionEvent.axisFromString(""), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $11 + 53;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 4;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 71;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                throw null;
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 60 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 6383 - Drawable.resolveOpacity(0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    public static final class IAuthTabCallback<T> implements Comparator {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback(((q5ExternalSyntheticLambda0) t).onWarmupCompleted(), ((q5ExternalSyntheticLambda0) t2).onWarmupCompleted());
            int i4 = IAuthTabCallback + 87;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iIAuthTabCallback;
        }
    }

    private q5() {
    }

    static {
        onWarmupCompleted();
        q5 q5Var = new q5();
        onExtraCallback = q5Var;
        IAuthTabCallback = clearFaultAdjacentMetadata.onExtraCallback(new String[]{"sli_signal_type", "alert_policy"});
        Set<String> setOnExtraCallbackWithResult = q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "excluded", "latency_ms");
        Set<String> setIAuthTabCallback = q5Var.IAuthTabCallback("auth_flow", "member_state", "path_template", "host_category", "auth_outcome", "load_duration_bucket", "last_step", "last_step_result", "last_step_detail", "failed_step", "failed_step_error_category", "slowest_step", "slowest_step_duration_bucket", "completed_step_count_bucket", "recorded_step_count_bucket", "metric_step_detail");
        Object[] objArr = new Object[1];
        a(new char[]{6527, 31634, 56485, 12700, 37525, 63391, 18566, 44430, 3768, 25520, 50341, 22956, 47782, 8172, 28883, 54743, 14040, 35832, 60638, 16834, 41679, 2046, 39152, 64997}, 25339 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnWarmupCompleted = q5Var.onWarmupCompleted(((String) objArr[0]).intern(), setOnExtraCallbackWithResult, setIAuthTabCallback);
        Set<String> setOnExtraCallbackWithResult2 = q5Var.onExtraCallbackWithResult("retry_count");
        Set<String> setIAuthTabCallback2 = q5Var.IAuthTabCallback("auth_flow", "member_state", "path_template", "host_category", "error_category", "metric_step_detail");
        Object[] objArr2 = new Object[1];
        a(new char[]{6527, 53492, 35433, 17850, 16141, 59753, 41162, 39448, 21896, 4070, 63817, 45274, 27198, 9642, 8168, 51546, 32936, 31251, 13439}, 51614 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnNavigationEvent = q5Var.onNavigationEvent(((String) objArr2[0]).intern(), setOnExtraCallbackWithResult2, setIAuthTabCallback2);
        Set<String> setOnExtraCallbackWithResult3 = q5Var.onExtraCallbackWithResult("failure", "latency_ms");
        Set<String> setIAuthTabCallback3 = q5Var.IAuthTabCallback("auth_step", "auth_result", "auth_flow", "member_state", "path_template", "host_category", "error_category", "load_duration_bucket", "metric_step_detail");
        Object[] objArr3 = new Object[1];
        a(new char[]{6527, 26276, 59081, 26122, 58957, 26233, 59306, 26568, 59159, 26445, 59243, 25779, 58575, 25623, 58463, 25724, 58793, 26109, 58642}, Color.red(0) + 32717, objArr3);
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnNavigationEvent2 = q5Var.onNavigationEvent(((String) objArr3[0]).intern(), setOnExtraCallbackWithResult3, setIAuthTabCallback3);
        Set<String> setOnExtraCallbackWithResult4 = q5Var.onExtraCallbackWithResult("eligible", "failure");
        Set<String> setIAuthTabCallback4 = q5Var.IAuthTabCallback("auth_flow", "member_state", "path_template", "host_category", "metric_step_detail");
        Object[] objArr4 = new Object[1];
        a(new char[]{6527, 9222, 25485, 41266, 60629, 10836, 27109, 46956, 61979, 12677, 32517, 47788, 63552, 2015, 17783, 33023, 53145, 3383}, Color.blue(0) + 15727, objArr4);
        List<q5ExternalSyntheticLambda0> listSortedWith = CollectionsKt.sortedWith(CollectionsKt.listOf(new q5ExternalSyntheticLambda0[]{q5externalsyntheticlambda0OnWarmupCompleted, q5externalsyntheticlambda0OnNavigationEvent, q5externalsyntheticlambda0OnNavigationEvent2, q5Var.onNavigationEvent(((String) objArr4[0]).intern(), setOnExtraCallbackWithResult4, setIAuthTabCallback4), q5Var.onNavigationEvent("se_stomp_connect_attempt_event", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "latency_ms"), q5Var.IAuthTabCallback("connect_action", "connect_outcome", "connect_quality", "path_template", "host_category", "error_category", "load_duration_bucket", "metric_step_detail")), q5Var.onNavigationEvent("se_stomp_connect_attempt_summary", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "slow_success_count", "latency_ms"), q5Var.IAuthTabCallback("connect_action", "path_template", "host_category", "summary_window_bucket", "flush_reason", "summary_overflowed", "metric_step_detail")), q5Var.onNavigationEvent("se_sse_connect_attempt_summary", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "slow_success_count", "latency_ms"), q5Var.IAuthTabCallback("connect_action", "sse_stream", "path_template", "host_category", "summary_window_bucket", "flush_reason", "summary_overflowed", "metric_step_detail")), q5Var.onNavigationEvent("se_sse_availability_summary", q5Var.onExtraCallbackWithResult("expected_duration_ms", "connected_duration_ms", "disconnected_duration_ms", "disconnect_count", "fault_count"), q5Var.IAuthTabCallback("sse_stream", "path_template", "host_category", "summary_window_bucket", "flush_reason", "availability_state", "metric_step_detail")), q5Var.onNavigationEvent("se_stomp_availability_summary", q5Var.onExtraCallbackWithResult("expected_duration_ms", "connected_duration_ms", "disconnected_duration_ms", "disconnect_count", "fault_count"), q5Var.IAuthTabCallback("path_template", "host_category", "summary_window_bucket", "flush_reason", "availability_state", "metric_step_detail")), q5Var.onNavigationEvent("se_sse_fault_event", q5Var.onExtraCallbackWithResult("failure"), q5Var.IAuthTabCallback("sse_stream", "sse_event", "sse_state_at_fault", "path_template", "host_category", "error_category", "metric_step_detail")), q5Var.onNavigationEvent("se_stomp_subscription_failure", q5Var.onExtraCallbackWithResult("failure", "latency_ms"), q5Var.IAuthTabCallback("topic_type", "subscription_action", "path_template", "host_category", "backing_policy", "error_category", "metric_step_detail")), q5Var.onNavigationEvent("se_webview_page_load_event", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "latency_ms"), q5Var.IAuthTabCallback("webview_type", "page_load_event", "page_load_outcome", "path_template", "host_category", "is_main_frame", "http_status_bucket", "error_category", "load_duration_bucket", "metric_step_detail")), q5Var.onNavigationEvent("se_webview_page_load_summary", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "slow_success_count", "latency_ms"), q5Var.IAuthTabCallback("webview_type", "path_template", "host_category", "summary_window_bucket", "flush_reason", "summary_overflowed", "metric_step_detail")), q5Var.onNavigationEvent("se_webview_render_process_event", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "latency_ms"), q5Var.IAuthTabCallback("webview_type", "render_process_event", "recovery_outcome", "path_template", "host_category", "error_category", "load_duration_bucket", "metric_step_detail")), q5Var.onNavigationEvent("se_webview_js_health_event", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "latency_ms"), q5Var.IAuthTabCallback("webview_type", "js_health_event", "js_health_result", "path_template", "host_category", "error_category", "load_duration_bucket", "metric_step_detail")), IAuthTabCallback(q5Var, "telemetry_health", q5Var.onExtraCallbackWithResult("eligible", "success", "failure", "produced_count", "enqueue_success_count", "enqueue_failure_count", "flush_attempt_count", "flush_success_count", "flush_failure_count", "parse_drop_count", "drop_count", "pending_count", "queue_oldest_age_ms", "monitoring_produced_count", "monitoring_enqueue_success_count", "monitoring_enqueue_failure_count", "monitoring_flush_success_count", "monitoring_flush_failure_count", "monitoring_drop_count"), null, 4, null)}), new IAuthTabCallback());
        onNavigationEvent = listSortedWith;
        List<q5ExternalSyntheticLambda0> list = listSortedWith;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(access8100.IAuthTabCallback(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        int i = IAuthTabCallbackStub + 31;
        onTransact = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 % 2;
        }
        for (Object obj : list) {
            linkedHashMap.put(((q5ExternalSyntheticLambda0) obj).onWarmupCompleted(), obj);
        }
        onExtraCallbackWithResult = linkedHashMap;
        int i3 = IAuthTabCallbackStub + 49;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
    }

    public final List<q5ExternalSyntheticLambda0> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, q5ExternalSyntheticLambda0> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Map<String, q5ExternalSyntheticLambda0> map = onExtraCallbackWithResult;
        int i5 = i3 + 35;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private final Set<String> onExtraCallbackWithResult(String... strArr) {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Set<String> set = ArraysKt.toSet(strArr);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return set;
    }

    private final Set<String> IAuthTabCallback(String... strArr) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            clearFaultAdjacentMetadata.onWarmupCompleted(IAuthTabCallback, ArraysKt.toSet(strArr));
            throw null;
        }
        Set<String> setOnWarmupCompleted = clearFaultAdjacentMetadata.onWarmupCompleted(IAuthTabCallback, ArraysKt.toSet(strArr));
        int i3 = asInterface + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return setOnWarmupCompleted;
    }

    private final q5ExternalSyntheticLambda0 onWarmupCompleted(String str, Set<String> set, Set<String> set2) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnWarmupCompleted = onWarmupCompleted(str, set, clearFaultAdjacentMetadata.onExtraCallback("slo_source"), clearFaultAdjacentMetadata.onExtraCallback("page_allowed"), set2);
        int i4 = asBinder + 23;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return q5externalsyntheticlambda0OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final q5ExternalSyntheticLambda0 onNavigationEvent(String str, Set<String> set, Set<String> set2) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, set, clearFaultAdjacentMetadata.onExtraCallback("diagnostic"), clearFaultAdjacentMetadata.onExtraCallback("observation_only"), set2);
        }
        onWarmupCompleted(str, set, clearFaultAdjacentMetadata.onExtraCallback("diagnostic"), clearFaultAdjacentMetadata.onExtraCallback("observation_only"), set2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ q5ExternalSyntheticLambda0 IAuthTabCallback(q5 q5Var, String str, Set set, Set set2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 5) != 0) {
            int i5 = i3 + 123;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                set2 = IAuthTabCallback;
                int i6 = 14 / 0;
            } else {
                set2 = IAuthTabCallback;
            }
        }
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnExtraCallback = q5Var.onExtraCallback(str, set, set2);
        int i7 = asInterface + 1;
        asBinder = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 9 / 0;
        }
        return q5externalsyntheticlambda0OnExtraCallback;
    }

    private final q5ExternalSyntheticLambda0 onExtraCallback(String str, Set<String> set, Set<String> set2) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0OnWarmupCompleted = onWarmupCompleted(str, set, clearFaultAdjacentMetadata.onExtraCallback("data_quality_gate"), clearFaultAdjacentMetadata.onExtraCallback("observation_only"), set2);
        int i4 = asInterface + 27;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return q5externalsyntheticlambda0OnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final q5ExternalSyntheticLambda0 onWarmupCompleted(String str, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4) {
        int i = 2 % 2;
        q5ExternalSyntheticLambda0 q5externalsyntheticlambda0 = new q5ExternalSyntheticLambda0(str, set4, set, set2, set3);
        int i2 = asBinder + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return q5externalsyntheticlambda0;
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = 3050534218927021115L;
    }
}
