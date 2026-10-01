package o;

import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class YogaLogLevel {
    public static /* synthetic */ ReceiveChannel IAuthTabCallback(r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return IAuthTabCallback(r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, i);
    }

    public static final <T> ReceiveChannel<T> IAuthTabCallback(@NotNull r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk<T> r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk, int i) {
        jni_YGConfigSetUseWebDefaultsJNI jni_ygconfigsetusewebdefaultsjni = new jni_YGConfigSetUseWebDefaultsJNI(i);
        r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk.subscribe(jni_ygconfigsetusewebdefaultsjni);
        return jni_ygconfigsetusewebdefaultsjni;
    }
}
