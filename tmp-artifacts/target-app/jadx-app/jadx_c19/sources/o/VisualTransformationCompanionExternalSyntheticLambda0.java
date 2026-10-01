package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class VisualTransformationCompanionExternalSyntheticLambda0 implements AndroidTextPaintExternalSyntheticLambda0 {
    private volatile Map<String, String> onExtraCallback;
    private final Map<String, List<AndroidParagraphIntrinsicsExternalSyntheticLambda0>> onWarmupCompleted;

    VisualTransformationCompanionExternalSyntheticLambda0(Map<String, List<AndroidParagraphIntrinsicsExternalSyntheticLambda0>> map) {
        this.onWarmupCompleted = Collections.unmodifiableMap(map);
    }

    @Override // o.AndroidTextPaintExternalSyntheticLambda0
    public Map<String, String> onNavigationEvent() {
        if (this.onExtraCallback == null) {
            synchronized (this) {
                if (this.onExtraCallback == null) {
                    this.onExtraCallback = Collections.unmodifiableMap(onExtraCallback());
                }
            }
        }
        return this.onExtraCallback;
    }

    private Map<String, String> onExtraCallback() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<AndroidParagraphIntrinsicsExternalSyntheticLambda0>> entry : this.onWarmupCompleted.entrySet()) {
            String strOnExtraCallback = onExtraCallback(entry.getValue());
            if (!TextUtils.isEmpty(strOnExtraCallback)) {
                map.put(entry.getKey(), strOnExtraCallback);
            }
        }
        return map;
    }

    private String onExtraCallback(@NonNull List<AndroidParagraphIntrinsicsExternalSyntheticLambda0> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strOnNavigationEvent = list.get(i2).onNavigationEvent();
            if (!TextUtils.isEmpty(strOnNavigationEvent)) {
                sb.append(strOnNavigationEvent);
                if (i2 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.onWarmupCompleted + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof VisualTransformationCompanionExternalSyntheticLambda0) {
            return this.onWarmupCompleted.equals(((VisualTransformationCompanionExternalSyntheticLambda0) obj).onWarmupCompleted);
        }
        return false;
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    public static final class onExtraCallbackWithResult {
        private static final String onExtraCallback;
        private static final Map<String, List<AndroidParagraphIntrinsicsExternalSyntheticLambda0>> onWarmupCompleted;
        private boolean IAuthTabCallback = true;
        private Map<String, List<AndroidParagraphIntrinsicsExternalSyntheticLambda0>> onNavigationEvent = onWarmupCompleted;
        private boolean onExtraCallbackWithResult = true;

        static {
            String strIAuthTabCallback = IAuthTabCallback();
            onExtraCallback = strIAuthTabCallback;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strIAuthTabCallback)) {
                map.put(RtspHeaders.USER_AGENT, Collections.singletonList(new IAuthTabCallback(strIAuthTabCallback)));
            }
            onWarmupCompleted = Collections.unmodifiableMap(map);
        }

        public VisualTransformationCompanionExternalSyntheticLambda0 onExtraCallbackWithResult() {
            this.IAuthTabCallback = true;
            return new VisualTransformationCompanionExternalSyntheticLambda0(this.onNavigationEvent);
        }

        static String IAuthTabCallback() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = property.charAt(i2);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }
    }

    static final class IAuthTabCallback implements AndroidParagraphIntrinsicsExternalSyntheticLambda0 {
        private final String IAuthTabCallback;

        IAuthTabCallback(@NonNull String str) {
            this.IAuthTabCallback = str;
        }

        @Override // o.AndroidParagraphIntrinsicsExternalSyntheticLambda0
        public String onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.IAuthTabCallback + "'}";
        }

        public boolean equals(Object obj) {
            if (obj instanceof IAuthTabCallback) {
                return this.IAuthTabCallback.equals(((IAuthTabCallback) obj).IAuthTabCallback);
            }
            return false;
        }

        public int hashCode() {
            return this.IAuthTabCallback.hashCode();
        }
    }
}
