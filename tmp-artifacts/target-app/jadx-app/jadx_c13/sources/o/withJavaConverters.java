package o;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class withJavaConverters {
    public abstract boolean IAuthTabCallback();

    public abstract getScreenDensityDpi onExtraCallback(getScreenDensityDpi getscreendensitydpi, trimMetadataStringsTo trimmetadatastringsto);

    withJavaConverters() {
    }

    public withJavaConverters onNavigationEvent(withJavaConverters withjavaconverters) {
        tryConvert tryconvert = tryConvert.onExtraCallback;
        if (withjavaconverters == tryconvert) {
            return this;
        }
        if (this == tryconvert) {
            return withjavaconverters;
        }
        if (withjavaconverters instanceof IAuthTabCallback) {
            return ((IAuthTabCallback) withjavaconverters).onExtraCallback(this);
        }
        return new IAuthTabCallback(Arrays.asList(this, withjavaconverters));
    }

    public static withJavaConverters onNavigationEvent() {
        return tryConvert.onExtraCallback;
    }

    public static withJavaConverters onExtraCallback(Predicate<String> predicate) {
        return new onExtraCallback(predicate, (AnonymousClass4) null);
    }

    public static Predicate<String> onExtraCallbackWithResult(Set<String> set) {
        return new onWarmupCompleted(set, (AnonymousClass4) null);
    }
}
