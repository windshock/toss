package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getChannel {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final View onNavigationEvent(@NotNull ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        View viewOnWarmupCompleted = onWarmupCompleted(viewGroup, varyMatches.onNavigationEvent(16, displayMetrics));
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewOnWarmupCompleted;
    }

    public static final View onWarmupCompleted(@NotNull ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onExtraCallbackWithResult());
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, view);
        int i3 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Dark;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i3 = onExtraCallbackWithResult + 89;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }
}
