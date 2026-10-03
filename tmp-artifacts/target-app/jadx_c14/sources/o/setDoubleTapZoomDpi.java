package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.features.mydata.ui.mydataPointGrowth.result.MydataPointGrowthResultScreenKt$;
import im.toss.utils.RxUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.setDoubleTapZoomDpi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.home.RelatedTransactions;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setDoubleTapZoomDpi {
    public static final setDoubleTapZoomDpi IAuthTabCallback = new setDoubleTapZoomDpi();
    private static final HashMap<String, ComposableLambdaImplExternalSyntheticLambda2> onWarmupCompleted = new HashMap<>();

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class ICustomTabsCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public ICustomTabsCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public access000(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access100 implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public access100(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public asBinder(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class extraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public extraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public getInterfaceDescriptor(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class readTypedObject implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public readTypedObject(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class writeTypedObject implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public writeTypedObject(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private setDoubleTapZoomDpi() {
    }

    public final int onNavigationEvent(@NotNull formatToParts formattoparts, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(formattoparts, "");
        Intrinsics.checkNotNullParameter(resources, "");
        if (!formattoparts.access100()) {
            if (!formattoparts.prefetchWithMultipleUrls()) {
                if (formattoparts.prefetch()) {
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    Object[] objArr = {new getUrlokhttp(new asBinder(configuration))};
                    int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                    return ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
                }
                if (formattoparts.onExtraCallbackWithResult() > 0.0d) {
                    Configuration configuration2 = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                    return ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallbackStub(configuration2)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
                }
                Configuration configuration3 = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                return new getUrlokhttp(new onTransact(configuration3)).onRelationshipValidationResult();
            }
            Configuration configuration4 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            Object[] objArr2 = {new getUrlokhttp(new IAuthTabCallbackDefault(configuration4))};
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            return ((Integer) getUrlokhttp.onNavigationEvent(objArr2, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        Configuration configuration5 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        Object[] objArr3 = {new getUrlokhttp(new onExtraCallbackWithResult(configuration5))};
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return ((Integer) getUrlokhttp.onNavigationEvent(objArr3, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, setVisitUrl.onExtraCallbackWithResult())).intValue();
    }

    public final int IAuthTabCallback(@NotNull formatToParts formattoparts, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(formattoparts, "");
        Intrinsics.checkNotNullParameter(resources, "");
        if (!formattoparts.access100()) {
            if (!formattoparts.prefetchWithMultipleUrls()) {
                if (formattoparts.prefetch()) {
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    return new getUrlokhttp(new access100(configuration)).onPostMessage();
                }
                Configuration configuration2 = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                return new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration2)).onPostMessage();
            }
            Configuration configuration3 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr = {new getUrlokhttp(new getInterfaceDescriptor(configuration3))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        Configuration configuration4 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        Object[] objArr2 = {new getUrlokhttp(new asInterface(configuration4))};
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return ((Integer) getUrlokhttp.onNavigationEvent(objArr2, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue();
    }

    public final int onExtraCallbackWithResult(@NotNull formatToParts formattoparts, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(formattoparts, "");
        Intrinsics.checkNotNullParameter(resources, "");
        if (!formattoparts.access100()) {
            if (!formattoparts.prefetchWithMultipleUrls()) {
                if (formattoparts.prefetch()) {
                    Configuration configuration = resources.getConfiguration();
                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                    return new getUrlokhttp(new readTypedObject(configuration)).onPostMessage();
                }
                Configuration configuration2 = resources.getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                return new getUrlokhttp(new extraCallback(configuration2)).onPostMessage();
            }
            Configuration configuration3 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            Object[] objArr = {new getUrlokhttp(new access000(configuration3))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Integer) getUrlokhttp.onNavigationEvent(objArr, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        Configuration configuration4 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        Object[] objArr2 = {new getUrlokhttp(new IAuthTabCallback_Parcel(configuration4))};
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        return ((Integer) getUrlokhttp.onNavigationEvent(objArr2, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult())).intValue();
    }

    public final String onExtraCallback(@NotNull RelatedTransactions relatedTransactions) {
        Intrinsics.checkNotNullParameter(relatedTransactions, "");
        return (relatedTransactions.onExtraCallback() > 0 ? "+" : "") + getLongName.onNavigationEvent(relatedTransactions.onExtraCallback(), (ParamImpl) null, 1, (Object) null);
    }

    public final int onExtraCallbackWithResult(@NotNull RelatedTransactions relatedTransactions, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(relatedTransactions, "");
        Intrinsics.checkNotNullParameter(resources, "");
        if (relatedTransactions.onExtraCallback() > 0) {
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        }
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        return new getUrlokhttp(new onNavigationEvent(configuration2)).onUnminimized();
    }

    public final int onExtraCallbackWithResult(@NotNull getSkeleonSymbol24 getskeleonsymbol24, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(getskeleonsymbol24, "");
        Intrinsics.checkNotNullParameter(resources, "");
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback3 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        if (Intrinsics.areEqual((String) getSkeleonSymbol24.onWarmupCompleted(-505461358, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback, 505461362, new Object[]{getskeleonsymbol24}, iOnExtraCallback2), "기타")) {
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onWarmupCompleted(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        }
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        return new getUrlokhttp(new onExtraCallback(configuration2)).onUnminimized();
    }

    public final int IAuthTabCallback(@NotNull getSkeleonSymbol24 getskeleonsymbol24, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(getskeleonsymbol24, "");
        Intrinsics.checkNotNullParameter(resources, "");
        if (StringsKt.isBlank(getskeleonsymbol24.IAuthTabCallback_Parcel()) || getskeleonsymbol24.access000().length() > 0) {
            Configuration configuration = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new writeTypedObject(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue();
        }
        Configuration configuration2 = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        return new getUrlokhttp(new ICustomTabsCallback(configuration2)).onUnminimized();
    }

    public final boolean IAuthTabCallback(@NotNull getSkeleonSymbol24 getskeleonsymbol24) {
        Intrinsics.checkNotNullParameter(getskeleonsymbol24, "");
        int iOnExtraCallback = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        int iOnExtraCallback2 = MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback();
        return (((Double) getSkeleonSymbol24.onWarmupCompleted(1986936817, MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), MydataPointGrowthResultScreenKt$.ExternalSyntheticLambda16.onExtraCallback(), iOnExtraCallback, -1986936814, new Object[]{getskeleonsymbol24}, iOnExtraCallback2)).doubleValue() == 0.0d || getskeleonsymbol24.ICustomTabsCallbackStub() || getskeleonsymbol24.ICustomTabsCallbackDefault()) ? false : true;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setDoubleTapZoomDpi setdoubletapzoomdpi, LottieAnimationView lottieAnimationView, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, int i, boolean z, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            j = 0;
        }
        setdoubletapzoomdpi.IAuthTabCallback(lottieAnimationView, composableLambdaImplExternalSyntheticLambda2, i, z, j);
    }

    public final void IAuthTabCallback(@NotNull final LottieAnimationView lottieAnimationView, @NotNull final ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, final int i, final boolean z, long j) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(composableLambdaImplExternalSyntheticLambda2, "");
        lottieAnimationView.postDelayed(new Runnable() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                setDoubleTapZoomDpi.IAuthTabCallback(lottieAnimationView, composableLambdaImplExternalSyntheticLambda2, i, z);
            }
        }, j);
    }

    public final void onNavigationEvent(@NotNull Context context, @NotNull final String str, @NotNull final Function1<? super ComposableLambdaImplExternalSyntheticLambda2, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        HashMap<String, ComposableLambdaImplExternalSyntheticLambda2> map = onWarmupCompleted;
        if (map.get(str) == null) {
            ComposableLambdaImplExternalSyntheticLambda9.IAuthTabCallback(context, str).onExtraCallbackWithResult(new ManagedRetainedValuesStoreKtExternalSyntheticLambda0() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda9
                public final void onResult(Object obj) {
                    setDoubleTapZoomDpi.onExtraCallback(str, function1, (ComposableLambdaImplExternalSyntheticLambda2) obj);
                }
            });
            return;
        }
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = map.get(str);
        Intrinsics.checkNotNull(composableLambdaImplExternalSyntheticLambda2);
        function1.invoke(composableLambdaImplExternalSyntheticLambda2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(String str, Function1 function1, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
        HashMap<String, ComposableLambdaImplExternalSyntheticLambda2> map = onWarmupCompleted;
        map.put(str, composableLambdaImplExternalSyntheticLambda2);
        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda22 = map.get(str);
        Intrinsics.checkNotNull(composableLambdaImplExternalSyntheticLambda22);
        function1.invoke(composableLambdaImplExternalSyntheticLambda22);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setDoubleTapZoomDpi setdoubletapzoomdpi, Dialog dialog, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        setdoubletapzoomdpi.onExtraCallbackWithResult(dialog, j);
    }

    public final void onExtraCallbackWithResult(@NotNull final Dialog dialog, long j) {
        Intrinsics.checkNotNullParameter(dialog, "");
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(j, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return setDoubleTapZoomDpi.onNavigationEvent(dialog, (Long) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                setDoubleTapZoomDpi.onExtraCallback(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return setDoubleTapZoomDpi.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda8
            public final void accept(Object obj) {
                setDoubleTapZoomDpi.IAuthTabCallbackDefault(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(Dialog dialog, Long l) {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onNavigationEvent(setDoubleTapZoomDpi setdoubletapzoomdpi, Activity activity, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        setdoubletapzoomdpi.IAuthTabCallback(activity, j);
    }

    public final void IAuthTabCallback(@NotNull final Activity activity, long j) {
        Intrinsics.checkNotNullParameter(activity, "");
        writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(j, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallback.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return setDoubleTapZoomDpi.onExtraCallbackWithResult(activity, (Long) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda2
            public final void accept(Object obj) {
                setDoubleTapZoomDpi.asBinder(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return setDoubleTapZoomDpi.IAuthTabCallback((Throwable) obj);
            }
        };
        writerawIAuthTabCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.home.HomeUIHelper$$ExternalSyntheticLambda4
            public final void accept(Object obj) {
                setDoubleTapZoomDpi.IAuthTabCallbackStub(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Activity activity, Long l) {
        if (!activity.isFinishing()) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final int onExtraCallback(@NotNull Context context, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return (str == null || str.length() == 0) ? i : StringsKt.startsWith$default(str, "#", false, 2, (Object) null) ? Color.parseColor(str) : setBodyokhttp.onWarmupCompleted(context, str, i);
    }

    public final void IAuthTabCallback(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "");
        int iFindFirstCompletelyVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition();
        if (Math.abs(iFindFirstCompletelyVisibleItemPosition - i) > 30) {
            if (iFindFirstCompletelyVisibleItemPosition > i) {
                recyclerView.scrollToPosition(i + 30);
            } else {
                recyclerView.scrollToPosition(i - 30);
            }
        }
        recyclerView.smoothScrollToPosition(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(LottieAnimationView lottieAnimationView, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, int i, boolean z) {
        if (lottieAnimationView.getVisibility() != 0 || Intrinsics.areEqual(lottieAnimationView.getComposition(), composableLambdaImplExternalSyntheticLambda2)) {
            return;
        }
        lottieAnimationView.setAlpha(1.0f);
        lottieAnimationView.setRepeatCount(i);
        lottieAnimationView.setMaxProgress(1.0f);
        lottieAnimationView.setSpeed(1.0f);
        lottieAnimationView.setComposition(composableLambdaImplExternalSyntheticLambda2);
        if (z) {
            lottieAnimationView.setProgress(1.0f);
            lottieAnimationView.cancelAnimation();
        } else {
            lottieAnimationView.setProgress(0.0f);
            lottieAnimationView.playAnimation();
        }
    }
}
