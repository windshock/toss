package im.toss.di;

import im.toss.network.model.BaseApiResponse;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ExtraHintsBuilder;
import o.getCurrentDarkerSystemColorsState;
import o.getLongValue;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class FlavoredApiModule {
    private static int IAuthTabCallback = 0;
    public static final FlavoredApiModule onExtraCallback = new FlavoredApiModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private FlavoredApiModule() {
    }

    public static final class onNavigationEvent implements ExtraHintsBuilder {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getLongValue onWarmupCompleted;

        onNavigationEvent(getLongValue getlongvalue) {
            this.onWarmupCompleted = getlongvalue;
        }

        public writeRaw<BaseApiResponse<getCurrentDarkerSystemColorsState>> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getLongValue getlongvalue = this.onWarmupCompleted;
            if (i3 == 0) {
                return getlongvalue.onExtraCallback();
            }
            getlongvalue.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Singleton
    public final ExtraHintsBuilder onExtraCallback(@NotNull getLongValue getlongvalue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getlongvalue, "");
        onNavigationEvent onnavigationevent = new onNavigationEvent(getlongvalue);
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }
}
