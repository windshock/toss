package o;

import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class updateRenderInfoForVideo {
    public static final <T extends Enum<T>> KSerializer<T> onExtraCallbackWithResult(@NotNull String str, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        return new setScoreCountWithIcon(str, tArr);
    }

    public static final <T extends Enum<T>> KSerializer<T> onExtraCallbackWithResult(@NotNull String str, @NotNull T[] tArr, @NotNull String[] strArr, @NotNull Annotation[][] annotationArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        setTimeOutListener settimeoutlistener = new setTimeOutListener(str, tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            String strName = (String) ArraysKt___ArraysKt.getOrNull(strArr, i2);
            if (strName == null) {
                strName = t.name();
            }
            setAnimationsLoop.onExtraCallbackWithResult(settimeoutlistener, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) ArraysKt___ArraysKt.getOrNull(annotationArr, i2);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    settimeoutlistener.onExtraCallback(annotation);
                }
            }
            i++;
            i2++;
        }
        return new setScoreCountWithIcon(str, tArr, settimeoutlistener);
    }

    public static final <T extends Enum<T>> KSerializer<T> onNavigationEvent(@NotNull String str, @NotNull T[] tArr, @NotNull String[] strArr, @NotNull Annotation[][] annotationArr, @Nullable Annotation[] annotationArr2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        setTimeOutListener settimeoutlistener = new setTimeOutListener(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                settimeoutlistener.onWarmupCompleted(annotation);
            }
        }
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            String strName = (String) ArraysKt___ArraysKt.getOrNull(strArr, i2);
            if (strName == null) {
                strName = t.name();
            }
            setAnimationsLoop.onExtraCallbackWithResult(settimeoutlistener, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) ArraysKt___ArraysKt.getOrNull(annotationArr, i2);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    settimeoutlistener.onExtraCallback(annotation2);
                }
            }
            i++;
            i2++;
        }
        return new setScoreCountWithIcon(str, tArr, settimeoutlistener);
    }
}
