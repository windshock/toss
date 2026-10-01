package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@liq(onNavigationEvent = setShineValue.class)
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGNodeStyleGetMinHeightJNI extends jni_YGNodeStyleGetPaddingJNI {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private final int days;
    private final long totalMonths;

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int IAuthTabCallback() {
        return 0;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public long IAuthTabCallbackStub() {
        return 0L;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int onExtraCallback() {
        return 0;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int onExtraCallbackWithResult() {
        return 0;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int onWarmupCompleted() {
        return 0;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public long IAuthTabCallbackDefault() {
        return this.totalMonths;
    }

    @Override // o.jni_YGNodeStyleGetPaddingJNI
    public int onNavigationEvent() {
        return this.days;
    }

    public jni_YGNodeStyleGetMinHeightJNI(long j, int i) {
        super(null);
        this.totalMonths = j;
        this.days = i;
    }

    public jni_YGNodeStyleGetMinHeightJNI(int i, int i2, int i3) {
        this(jni_YGNodeStyleGetWidthJNI.onNavigationEvent(i, i2), i3);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final KSerializer<jni_YGNodeStyleGetMinHeightJNI> serializer() {
            return setShineValue.onWarmupCompleted;
        }
    }
}
