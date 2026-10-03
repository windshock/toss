package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_PKCS12_MakePFX_WINS extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 {
    private final int IAuthTabCallback;
    private final Paint IAuthTabCallbackStub;
    private final int onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final String onWarmupCompleted;

    public UST_PKCS12_MakePFX_WINS(int i, int i2, int i3, int i4) {
        this.IAuthTabCallback = i;
        this.onNavigationEvent = i2;
        this.onExtraCallback = i3;
        this.onExtraCallbackWithResult = i4;
        this.IAuthTabCallbackStub = new Paint(7);
        this.onWarmupCompleted = "Padding/paddingLeftAsPx:" + i + ",paddingTopAsPx:" + i2 + ",paddingRightAsPx:" + i3 + ",paddingBottomAsPx:" + i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UST_PKCS12_MakePFX_WINS(float f, float f2, float f3, float f4) {
        followRedirects followredirects = followRedirects.onExtraCallbackWithResult;
        int iOnWarmupCompleted = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted3 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted3)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
        int iOnWarmupCompleted4 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted5 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted6 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics2 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted5, iOnWarmupCompleted4, iOnWarmupCompleted6)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(Float.valueOf(f2), displayMetrics2);
        int iOnWarmupCompleted7 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted8 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted9 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics3 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted8, iOnWarmupCompleted7, iOnWarmupCompleted9)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(Float.valueOf(f3), displayMetrics3);
        int iOnWarmupCompleted10 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted11 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted12 = ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted();
        DisplayMetrics displayMetrics4 = ((Resources) followRedirects.IAuthTabCallback(1316113812, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{followredirects}, -1316113811, iOnWarmupCompleted11, iOnWarmupCompleted10, iOnWarmupCompleted12)).getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        this(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(Float.valueOf(f4), displayMetrics4));
    }

    public String IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public Object onWarmupCompleted(@NotNull Bitmap bitmap, @NotNull RememberObserverHolder rememberObserverHolder, @NotNull access13800<? super Bitmap> access13800Var) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + this.IAuthTabCallback + this.onExtraCallback, bitmap.getHeight() + this.onNavigationEvent + this.onExtraCallbackWithResult, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, this.IAuthTabCallback, this.onNavigationEvent, this.IAuthTabCallbackStub);
        return bitmapCreateBitmap;
    }
}
