package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.uh1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class jni_YGNodeStyleSetMaxHeightPercentJNI<T, U extends uh1<U>> implements jni_YGNodeSwapChildJNI<T> {
    public /* synthetic */ jni_YGNodeStyleSetMaxHeightPercentJNI(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract jw9<U> IAuthTabCallback();

    public abstract T onExtraCallbackWithResult(@NotNull U u);

    public abstract U onNavigationEvent();

    private jni_YGNodeStyleSetMaxHeightPercentJNI() {
    }

    @Override // o.jni_YGNodeSwapChildJNI
    public T onExtraCallback(@NotNull CharSequence charSequence) {
        String str;
        Intrinsics.checkNotNullParameter(charSequence, "");
        try {
            try {
                return onExtraCallbackWithResult(uhycx.onExtraCallback(uhycx.onNavigationEvent(IAuthTabCallback().onExtraCallback()), charSequence, onNavigationEvent(), 0, 4, null));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new jni_YGNodeStyleGetMaxHeightJNI(str, e);
            }
        } catch (ludzb e2) {
            throw new jni_YGNodeStyleGetMaxHeightJNI("Failed to parse value from '" + ((Object) charSequence) + '\'', e2);
        }
    }
}
