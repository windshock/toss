package o;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class SearchBarDefaultsExternalSyntheticLambda10$onExtraCallbackWithResult {
    static <T, V> ObjectAnimator onExtraCallback(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
