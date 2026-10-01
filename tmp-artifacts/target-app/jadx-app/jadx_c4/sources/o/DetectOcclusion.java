package o;

import android.content.Context;
import android.content.res.Resources;
import androidx.collection.LruCache;
import im.toss.core.R;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DetectOcclusion {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;
    public static final DetectOcclusion onWarmupCompleted = new DetectOcclusion();
    private static final LruCache<String, IdGeneratorExternalSyntheticLambda1> IAuthTabCallback = new LruCache<>(50);

    private DetectOcclusion() {
    }

    public static final /* synthetic */ IdGeneratorExternalSyntheticLambda1 onExtraCallback(DetectOcclusion detectOcclusion, Resources resources, int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return detectOcclusion.onExtraCallback(resources, i);
        }
        detectOcclusion.onExtraCallback(resources, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onExtraCallback + 97;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 28 / 0;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        public static final onExtraCallbackWithResult onNavigationEvent = new onExtraCallbackWithResult();
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 35;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 37 / 0;
            }
        }

        private onExtraCallbackWithResult() {
        }

        public final IdGeneratorExternalSyntheticLambda1 onExtraCallback(@NotNull Resources resources) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(resources, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback = DetectOcclusion.onExtraCallback(DetectOcclusion.onWarmupCompleted, resources, R.string.date_format_date_numeric);
            int i4 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return idGeneratorExternalSyntheticLambda1OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IdGeneratorExternalSyntheticLambda1 onNavigationEvent(@NotNull Context context) throws Resources.NotFoundException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnExtraCallback = onExtraCallback(resources);
            int i4 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return idGeneratorExternalSyntheticLambda1OnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final IdGeneratorExternalSyntheticLambda1 onExtraCallback(Resources resources, int i) throws Resources.NotFoundException {
        int i2 = 2 % 2;
        Locale localeOnExtraCallbackWithResult = PageExitListener.onExtraCallbackWithResult(resources);
        String str = i + ":" + localeOnExtraCallbackWithResult.getLanguage() + "_" + localeOnExtraCallbackWithResult.getCountry();
        LruCache<String, IdGeneratorExternalSyntheticLambda1> lruCache = IAuthTabCallback;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = (IdGeneratorExternalSyntheticLambda1) lruCache.get(str);
        if (idGeneratorExternalSyntheticLambda1 == null) {
            String string = resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda12 = new IdGeneratorExternalSyntheticLambda1(string, localeOnExtraCallbackWithResult);
            lruCache.put(str, idGeneratorExternalSyntheticLambda12);
            int i3 = IAuthTabCallbackDefault + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return idGeneratorExternalSyntheticLambda12;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 123;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }
}
