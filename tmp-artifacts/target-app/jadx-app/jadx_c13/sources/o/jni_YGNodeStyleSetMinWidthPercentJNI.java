package o;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class jni_YGNodeStyleSetMinWidthPercentJNI {
    public static final jni_YGNodeStyleSetMinWidthPercentJNI onNavigationEvent = new jni_YGNodeStyleSetMinWidthPercentJNI();
    private static final ltlt<jni_YGNodeStyleSetMinWidthJNI> IAuthTabCallback = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.jni_YGNodeStyleSetMinWidthPercentJNI.IAuthTabCallback
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((jni_YGNodeStyleSetMinWidthJNI) obj).onWarmupCompleted();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((jni_YGNodeStyleSetMinWidthJNI) obj).onNavigationEvent((Integer) obj2);
        }
    }, null, 2, null), 1, 31, null, null, null, 56, null);
    private static final ltlt<jni_YGNodeStyleSetMinWidthJNI> onExtraCallbackWithResult = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.jni_YGNodeStyleSetMinWidthPercentJNI.onExtraCallbackWithResult
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((jni_YGNodeStyleSetMinWidthJNI) obj).IAuthTabCallback();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((jni_YGNodeStyleSetMinWidthJNI) obj).onExtraCallbackWithResult((Integer) obj2);
        }
    }, null, 2, null), 1, 7, null, null, null, 56, null);
    private static final ltlt<jni_YGNodeStyleSetMinWidthJNI> onWarmupCompleted = new ltlt<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.jni_YGNodeStyleSetMinWidthPercentJNI.onExtraCallback
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((jni_YGNodeStyleSetMinWidthJNI) obj).onExtraCallbackWithResult();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((jni_YGNodeStyleSetMinWidthJNI) obj).onExtraCallback((Integer) obj2);
        }
    }, null, 2, null), 1, 366, null, null, null, 56, null);

    private jni_YGNodeStyleSetMinWidthPercentJNI() {
    }

    public final ltlt<jni_YGNodeStyleSetMinWidthJNI> IAuthTabCallback() {
        return IAuthTabCallback;
    }

    public final ltlt<jni_YGNodeStyleSetMinWidthJNI> onNavigationEvent() {
        return onExtraCallbackWithResult;
    }
}
