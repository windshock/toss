package o;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AlgorithmIdentifier extends DeeplinkConditionalRouter {
    public void execute(@NotNull Context context, @NotNull Uri uri) {
        boolean booleanQueryParameter;
        boolean booleanQueryParameter2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        if (queryParameterNames.isEmpty()) {
            booleanQueryParameter = true;
            booleanQueryParameter2 = true;
        } else {
            booleanQueryParameter2 = uri.getBooleanQueryParameter("webViewCache", false);
            booleanQueryParameter = uri.getBooleanQueryParameter("appCache", false);
        }
        if (booleanQueryParameter) {
            maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(putChannelInfo.IAuthTabCallback()), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(context, null), 3, (Object) null);
        }
        if (booleanQueryParameter2) {
            try {
                new WebView(context).clearCache(true);
            } catch (Throwable th) {
                ALCDetectionMode.onExtraCallbackWithResult(th, (Map) null, 1, (Object) null);
            }
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Context context, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$context, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Context context = this.$context;
            try {
                Result.Companion companion = Result.Companion;
                File cacheDir = context.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "");
                Result.constructor-impl(access14000.onNavigationEvent(FilesKt.deleteRecursively(cacheDir)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Unit.INSTANCE;
        }
    }
}
