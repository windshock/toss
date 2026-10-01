package o;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;
import o.getDelegateokhttp;
import o.setDnsokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface setDnsokhttp {
    public static final onExtraCallback Companion = onExtraCallback.IAuthTabCallback;

    getDelegateokhttp resolve(@NotNull Context context, float f);

    public static final class onExtraCallback {
        private static int asBinder = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        static final /* synthetic */ onExtraCallback IAuthTabCallback = new onExtraCallback();
        private static final setDnsokhttp onExtraCallback = new setDnsokhttp() { // from class: im.toss.tds.view.component.atom.text.style.TdsWordBreakStrategyResolver$Companion$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // o.setDnsokhttp
            public final getDelegateokhttp resolve(Context context, float f) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                getDelegateokhttp getdelegateokhttpOnExtraCallback = setDnsokhttp.onExtraCallback.onExtraCallback(context, f);
                int i4 = IAuthTabCallback + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return getdelegateokhttpOnExtraCallback;
            }
        };

        public static /* synthetic */ getDelegateokhttp onExtraCallback(Context context, float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getDelegateokhttp getdelegateokhttpOnNavigationEvent = onNavigationEvent(context, f);
            int i4 = onNavigationEvent + 93;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return getdelegateokhttpOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback() {
        }

        static {
            int i = asBinder + 91;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final setDnsokhttp onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 15;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setDnsokhttp setdnsokhttp = onExtraCallback;
            int i4 = i2 + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 50 / 0;
            }
            return setdnsokhttp;
        }

        private static final getDelegateokhttp onNavigationEvent(Context context, float f) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            if (!readIntokhttp.IAuthTabCallback(configuration)) {
                return getDelegateokhttp.Companion.onExtraCallback();
            }
            int i4 = onWarmupCompleted + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getDelegateokhttp getdelegateokhttpOnNavigationEvent = getDelegateokhttp.Companion.onNavigationEvent();
            int i6 = onWarmupCompleted + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 0;
            }
            return getdelegateokhttpOnNavigationEvent;
        }
    }
}
