package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.toHashtable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getAlgorithm extends RecipientIdentifier<EncryptedContentInfoParser> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAlgorithm(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // o.RecipientIdentifier
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(@NotNull EncryptedContentInfoParser encryptedContentInfoParser, @Nullable toHashtable.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(encryptedContentInfoParser, "");
        ViewGroup.LayoutParams layoutParams = ((RecyclerView.ViewHolder) this).onNavigationEvent.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (encryptedContentInfoParser.onExtraCallbackWithResult() == 0) {
            DisplayMetrics displayMetrics = IAuthTabCallback().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            marginLayoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(1.0f), displayMetrics);
            DisplayMetrics displayMetrics2 = IAuthTabCallback().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            marginLayoutParams.leftMargin = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics2);
        } else {
            DisplayMetrics displayMetrics3 = IAuthTabCallback().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            marginLayoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(16.0f), displayMetrics3);
            marginLayoutParams.leftMargin = 0;
        }
        View view = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        if (encryptedContentInfoParser.onExtraCallbackWithResult() == 0) {
            View view2 = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnExtraCallbackWithResult = new getUrlokhttp(new onWarmupCompleted(configuration)).extraCallback();
        } else {
            View view3 = ((RecyclerView.ViewHolder) this).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            Context context2 = view3.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Resources resources = context2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration2 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnExtraCallbackWithResult = new getDEFAULT_CONNECTION_SPECSokhttp(new onNavigationEvent(configuration2)).onExtraCallbackWithResult();
        }
        view.setBackgroundColor(iOnExtraCallbackWithResult);
        ((RecyclerView.ViewHolder) this).onNavigationEvent.requestLayout();
    }

    public static final class onNavigationEvent implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public onNavigationEvent(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }
}
