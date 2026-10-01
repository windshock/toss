package o;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jni_YGNodeStyleSetPositionJNI {
    private static final lt2<jni_YGNodeStyleSetPositionAutoJNI, String> onExtraCallback = new lt2<>(new lt4(new MutablePropertyReference1Impl() { // from class: o.jni_YGNodeStyleSetPositionJNI.onExtraCallbackWithResult
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.addAllCauses
        public Object get(Object obj) {
            return ((jni_YGNodeStyleSetPositionAutoJNI) obj).onMessageChannelReady();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.access5500
        public void set(Object obj, Object obj2) {
            ((jni_YGNodeStyleSetPositionAutoJNI) obj).IAuthTabCallback((String) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);
    private static final jni_YGNodeStyleSetPositionAutoJNI onExtraCallbackWithResult = new jni_YGNodeStyleSetPositionAutoJNI(null, null, null, null, 15, null);
}
