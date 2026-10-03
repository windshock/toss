package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_TSA_RequestTimeStampWithHash extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
    private final Paint onExtraCallback = new Paint(7);
    private final String onNavigationEvent = "PrimaryAccountIcon";
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onWarmupCompleted = 8;
    private static final Bitmap onExtraCallbackWithResult = BitmapFactory.decodeResource(UserChoiceBillingListener.onExtraCallback.onExtraCallback().getResources(), R.drawable.icn_fill_star);

    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public Object onWarmupCompleted(@NotNull Bitmap bitmap, @NotNull RememberObserverHolder rememberObserverHolder, @NotNull access13800<? super Bitmap> access13800Var) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        Integer numOnNavigationEvent = access14000.onNavigationEvent(12);
        followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(numOnNavigationEvent, displayMetrics);
        Integer numOnNavigationEvent2 = access14000.onNavigationEvent(42);
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted2, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted())).getDisplayMetrics(), "");
        float fOnNavigationEvent2 = (fOnNavigationEvent * f) / varyMatches.onNavigationEvent(numOnNavigationEvent2, r5);
        Matrix matrix = new Matrix();
        Bitmap bitmap2 = onExtraCallbackWithResult;
        matrix.postScale(fOnNavigationEvent2 / bitmap2.getWidth(), fOnNavigationEvent2 / bitmap2.getHeight());
        matrix.postTranslate(f - fOnNavigationEvent2, 0.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.onExtraCallback);
        canvas.drawBitmap(bitmap2, matrix, this.onExtraCallback);
        return bitmapCreateBitmap;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
