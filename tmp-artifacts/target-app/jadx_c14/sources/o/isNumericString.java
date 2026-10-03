package o;

import android.content.Context;
import android.view.ViewConfiguration;
import j$.time.ZoneId;
import java.lang.reflect.Constructor;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.callTimeoutMillis;
import o.isNumericString;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class isNumericString implements FragmentStateAdapter4, FragmentStateAdapter1 {
    private final Object onExtraCallback;
    private final ConstraintsSizeResolverExternalSyntheticLambda0 onNavigationEvent;

    static final class onWarmupCompleted extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return isNumericString.this.onNavigationEvent((access13800<? super String>) this);
        }
    }

    @Inject
    public isNumericString(@NotNull ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(constraintsSizeResolverExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.onNavigationEvent = constraintsSizeResolverExternalSyntheticLambda0;
        this.onExtraCallback = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.access13800<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.isNumericString.onWarmupCompleted
            if (r0 == 0) goto L13
            r0 = r5
            o.isNumericString$onWarmupCompleted r0 = (o.isNumericString.onWarmupCompleted) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.isNumericString$onWarmupCompleted r0 = new o.isNumericString$onWarmupCompleted
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.onNavigationEvent(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.onNavigationEvent(r5)
            o.AudienceNetworkAdsAdFormat r5 = o.AudienceNetworkAdsAdFormat.onExtraCallbackWithResult
            r0.label = r3
            java.lang.Object r5 = r5.onExtraCallback(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            o.ConstraintTrackingWorkerExternalSyntheticLambda1 r5 = o.ConstraintTrackingWorkerExternalSyntheticLambda1.onWarmupCompleted
            java.lang.String r5 = r5.onExtraCallback()
            int r0 = r5.length()
            if (r0 != 0) goto L4d
            java.lang.String r5 = ""
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isNumericString.onNavigationEvent(o.access13800):java.lang.Object");
    }

    public String onWarmupCompleted() {
        String strOnExtraCallback = ConstraintTrackingWorkerExternalSyntheticLambda1.onWarmupCompleted.onExtraCallback();
        return strOnExtraCallback.length() > 0 ? strOnExtraCallback : "";
    }

    public String onNavigationEvent() {
        return PlayerErrorCode.asInterface();
    }

    public void onExtraCallback(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        callTimeoutMillis.onNavigationEvent.onExtraCallbackWithResult(callTimeoutMillis.Companion, context, str, new certificateChainCleaner((String) null, "ads_playable", (String) null), (List) null, (String) null, (String) null, (Function1) null, (Function1) null, 248, (Object) null);
    }

    public void onNavigationEvent(@NotNull OkHttpClient.Builder builder) throws Throwable {
        Intrinsics.checkNotNullParameter(builder, "");
        if (zzaj.onNavigationEvent().RemoteActionCompatParcelizer()) {
            try {
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1590500397);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50078), (ViewConfiguration.getTouchSlop() >> 8) + 23, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24756, -1871569597, false, (String) null, new Class[0]);
                }
                builder.addInterceptor((Interceptor) ((Constructor) objOnExtraCallback).newInstance(null));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        builder.addInterceptor(new Interceptor() { // from class: viva.republica.toss.ads.AppInfoProviderImpl$$ExternalSyntheticLambda0
            public final Response intercept(Interceptor.Chain chain) {
                return isNumericString.onWarmupCompleted(this.f$0, chain);
            }
        });
        builder.addInterceptor(new NativeAdBaseNativeAdLoadConfigBuilder(this.onExtraCallback));
        if (zzaj.onNavigationEvent().onActivityLayout()) {
            UST_CERT_GetSubjectKeyIdentifier.onExtraCallback.onWarmupCompleted(builder);
            Interceptor interceptorIAuthTabCallback = UST_CERT_GetVIDRandomWithPrikey.onWarmupCompleted.IAuthTabCallback();
            if (interceptorIAuthTabCallback != null) {
                builder.addInterceptor(interceptorIAuthTabCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response onWarmupCompleted(isNumericString isnumericstring, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "");
        Request.Builder builderHeader = chain.request().newBuilder().header("User-Agent", zzaj.onNavigationEvent().access100()).header("X-Toss-OS", "android").header("X-Toss-App-Version", zzaj.onNavigationEvent().getSmallIconBitmap()).header("X-Toss-Locale", getStartTimeMillis.Companion.onExtraCallback().onExtraCallback());
        String id = ZoneId.systemDefault().getId();
        Intrinsics.checkNotNullExpressionValue(id, "");
        return chain.proceed(builderHeader.header("X-Toss-Tz", id).header("X-TossExt-Device-ID", isnumericstring.onNavigationEvent.onNavigationEvent()).build());
    }
}
