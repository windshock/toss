package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class NativeAdBaseNativeAdLoadConfigBuilder implements Interceptor {
    private final Object onWarmupCompleted;

    public NativeAdBaseNativeAdLoadConfigBuilder(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.onWarmupCompleted = obj;
    }

    public Response intercept(@NotNull Interceptor.Chain chain) throws Throwable {
        Intrinsics.checkNotNullParameter(chain, "");
        Request request = chain.request();
        Object obj = this.onWarmupCompleted;
        try {
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1203654317);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 14 - MotionEvent.axisFromString(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 10991, -1996402749, false, "onWarmupCompleted", new Class[0]);
            }
            Map map = (Map) ((Method) objOnExtraCallback).invoke(obj, null);
            if (!map.isEmpty()) {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 34 - Color.blue(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7093, -1088743663, false, "Companion", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback2).get(null);
                Object[] objArr = {request.url().toString()};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1421773909);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (63469 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 51, Color.green(0) + 7128, -1711174341, false, "IAuthTabCallback", new Class[]{String.class});
                }
                if (((Method) objOnExtraCallback3).invoke(obj2, objArr) != null) {
                    Request.Builder builderNewBuilder = request.newBuilder();
                    for (Map.Entry entry : map.entrySet()) {
                        if (request.headers().get((String) entry.getKey()) == null) {
                            builderNewBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    return chain.proceed(builderNewBuilder.build());
                }
            }
            return chain.proceed(request);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
