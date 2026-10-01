package o;

import android.content.Context;
import android.content.res.Configuration;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Plugin extends OkHttpClientBuilderaddNetworkInterceptor2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public Plugin() {
        this(0.0f, 0.0f, 0.0f, 0, 0, 31, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Plugin(float f, float f2, float f3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        float f4;
        float f5;
        int iExtraCommand;
        if ((i3 & 1) != 0) {
            int i4 = onNavigationEvent + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            f4 = -1.0f;
        } else {
            f4 = f;
        }
        float f6 = 0.0f;
        if ((i3 & 2) != 0) {
            int i7 = 2 % 2;
            f5 = 0.0f;
        } else {
            f5 = f2;
        }
        if ((i3 & 4) != 0) {
            int i8 = onNavigationEvent + 19;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } else {
            f6 = f3;
        }
        if ((i3 & 8) != 0) {
            Configuration configuration = ((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followRedirects.onExtraCallbackWithResult}, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iExtraCommand = new getUrlokhttp(new onNavigationEvent(configuration)).extraCommand();
        } else {
            iExtraCommand = i;
        }
        this(f4, f5, f6, iExtraCommand, (i3 & 16) != 0 ? -1 : i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Plugin(float f, float f2, float f3, int i, int i2) {
        Object[] objArr = {followRedirects.onExtraCallbackWithResult};
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        super(new setProxyokhttp((Context) followRedirects.IAuthTabCallback(-603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr, 603441979, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted()), f, f2, f3, i, i2));
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onNavigationEvent(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onNavigationEvent))) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }
}
