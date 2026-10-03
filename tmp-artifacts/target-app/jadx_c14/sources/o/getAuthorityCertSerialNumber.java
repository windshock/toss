package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import im.toss.deeplink.DeeplinkConditionalRouter;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAuthorityCertSerialNumber;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.common.StoreRateReviewTestActivity;
import viva.republica.toss.core.AppStateManager;

@ConditionalDeepLink
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAuthorityCertSerialNumber extends DeeplinkConditionalRouter {
    private static volatile int IAuthTabCallback;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onWarmupCompleted = 8;

    public void execute(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        if (((isIssueCertV2) Response.onExtraCallback(applicationContext, isIssueCertV2.class)).NonNull().AudioAttributesCompatParcelizer()) {
            IAuthTabCallback();
            return;
        }
        final ReviewManager reviewManagerCreate = ReviewManagerFactory.create(context.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(reviewManagerCreate, "");
        reviewManagerCreate.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: viva.republica.toss.common.StoreRateSchemeRouter$$ExternalSyntheticLambda1
            public final void onComplete(Task task) {
                getAuthorityCertSerialNumber.IAuthTabCallback(reviewManagerCreate, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ReviewManager reviewManager, Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (typedObject == null) {
                return;
            }
            reviewManager.launchReviewFlow(typedObject, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() { // from class: viva.republica.toss.common.StoreRateSchemeRouter$$ExternalSyntheticLambda0
                public final void onComplete(Task task2) {
                    getAuthorityCertSerialNumber.onNavigationEvent(task2);
                }
            });
            return;
        }
        ReviewException exception = task.getException();
        ReviewException reviewException = exception instanceof ReviewException ? exception : null;
        Integer numValueOf = reviewException != null ? Integer.valueOf(reviewException.getErrorCode()) : null;
        Objects.toString(numValueOf);
        task.getException();
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "StoreRateSchemeRouter", "requestReviewFlow failed with error code: " + numValueOf, task.getException(), (Map) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(Task task) {
        Intrinsics.checkNotNullParameter(task, "");
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "StoreRateSchemeRouter", "launchReviewFlow completed", (Map) null, (String) null, false, (String) null, 60, (Object) null);
    }

    private final void IAuthTabCallback() {
        Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
        if (typedObject == null) {
            return;
        }
        int i = IAuthTabCallback;
        IAuthTabCallback = i + 1;
        if (i % 2 == 0) {
            typedObject.startActivity(new Intent(typedObject, (Class<?>) StoreRateReviewTestActivity.class));
        } else {
            Toast.makeText(typedObject, typedObject.getString(R.string.app_store_rate_test_not_shown_toast), 0).show();
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
