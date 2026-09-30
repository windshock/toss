package o;

import android.content.Context;
import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class issueCertV2 {
    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, @NotNull Context context, float f, float f2, int i) {
        Intrinsics.checkNotNullParameter(checknavigationbarbysystemproperties, "");
        Intrinsics.checkNotNullParameter(context, "");
        return RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystemproperties.IAuthTabCallback_Parcel()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(f, f2, 0.0f, null, i, null, 44, null)});
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(@NotNull checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, @NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(checknavigationbarbysystemproperties, "");
        Intrinsics.checkNotNullParameter(context, "");
        return checknavigationbarbysystemproperties.getInterfaceDescriptor().length() == 0 ? onExtraCallbackWithResult(checknavigationbarbysystemproperties, context, f, 0.0f, 0, 12, null) : RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(checknavigationbarbysystemproperties.getInterfaceDescriptor()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, null)});
    }

    public static final RecomposerawaitIdle2.onNavigationEvent IAuthTabCallback(@NotNull String str, @NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = send.Companion.onWarmupCompleted().onExtraCallback(str);
        if (checknavigationbarbysystempropertiesOnExtraCallback != null) {
            return onExtraCallbackWithResult(checknavigationbarbysystempropertiesOnExtraCallback, context, f);
        }
        return null;
    }

    public static /* synthetic */ RecomposerawaitIdle2.onNavigationEvent onExtraCallbackWithResult(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, Context context, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 40.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 8.0f;
        }
        if ((i2 & 8) != 0) {
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new onNavigationEvent(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            i = ((Integer) getUrlokhttp.onNavigationEvent(objArr, 2109422447, -2109422438, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        return onExtraCallbackWithResult(checknavigationbarbysystemproperties, context, f, f2, i);
    }
}
