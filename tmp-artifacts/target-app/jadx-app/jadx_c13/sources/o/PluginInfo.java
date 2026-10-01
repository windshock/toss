package o;

import android.content.Context;
import android.content.res.Configuration;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PluginInfo extends OkHttpClientBuilderaddNetworkInterceptor2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public PluginInfo() {
        this(0.0f, 0.0f, 0.0f, null, 0, null, 63, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PluginInfo(float f, float f2, float f3, Integer num, int i, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        float f4;
        Integer num3;
        int iExtraCommand;
        if ((i2 & 1) != 0) {
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            f4 = 40.0f;
            if (i3 % 2 == 0) {
                int i4 = 30 / 0;
            }
        } else {
            f4 = f;
        }
        float f5 = (i2 & 2) != 0 ? 8.0f : f2;
        float f6 = (i2 & 4) != 0 ? 1.0f : f3;
        if ((i2 & 8) != 0) {
            int i5 = 2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 16) != 0) {
            Configuration configuration = ((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iExtraCommand = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).extraCommand();
            int i6 = IAuthTabCallback + 7;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        } else {
            iExtraCommand = i;
        }
        this(f4, f5, f6, num3, iExtraCommand, (i2 & 32) == 0 ? num2 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PluginInfo(float f, float f2, float f3, @Nullable Integer num, int i, @Nullable Integer num2) {
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        super(new setRouteDatabaseokhttp((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), f, f2, f3, num, i, num2));
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 != 0) {
                return getspecialfeatureoptinstatus2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
