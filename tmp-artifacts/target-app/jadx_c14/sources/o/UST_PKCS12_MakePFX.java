package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.drawable.RoundRectCropTransformation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.RecomposerawaitIdle2;
import o.UST_PKCS12_MakePFX;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_PKCS12_MakePFX {

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
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

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onWarmupCompleted(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull TdsListRowV1View tdsListRowV1View, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        if (str != null) {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View.setLeftImage(str);
        } else {
            tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.NONE);
        }
    }

    public static final void IAuthTabCallback(@Nullable ImageView imageView, @Nullable String str, float f, float f2, float f3, boolean z, boolean z2, @Nullable Integer num) {
        if (imageView != null) {
            int iIAuthTabCallback = varyMatches.IAuthTabCallback(imageView, Float.valueOf(f));
            int iIAuthTabCallback2 = varyMatches.IAuthTabCallback(imageView, Float.valueOf(f2));
            imageView.setVisibility(0);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (z2) {
                imageView.getLayoutParams().width = iIAuthTabCallback;
                imageView.getLayoutParams().height = iIAuthTabCallback2;
            }
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            OriginatorIdentifierOrKey.onExtraCallbackWithResult.onExtraCallbackWithResult(str, imageView, true, iIAuthTabCallback, iIAuthTabCallback2, new RoundRectCropTransformation(context, varyMatches.IAuthTabCallback(imageView, Float.valueOf(f3)), 0, RoundRectCropTransformation.CornerType.ALL, true), z, num);
        }
    }

    public static final void onExtraCallback(@NotNull TdsListRowV1View tdsListRowV1View, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        onExtraCallback(tdsListRowV1View, str, 40.0f, true, 0, 16, null);
    }

    public static final void onExtraCallback(@NotNull TdsListRowV1View tdsListRowV1View, @Nullable String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        onNavigationEvent(tdsListRowV1View, str, 40.0f, z, i);
    }

    public static final void onNavigationEvent(@NotNull TdsListRowV1View tdsListRowV1View, @Nullable String str, float f, boolean z, int i) {
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics2));
        if (!z || (str != null && StringsKt.contains$default(str, "fill", false, 2, (Object) null))) {
            tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(str), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)}));
        } else {
            float f2 = (3.0f * f) / 5.0f;
            tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(str), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f2, f2), getAdditionalParams.onExtraCallbackWithResult(f, f, i), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)}));
        }
    }

    public static final void onWarmupCompleted(@NotNull TdsImageView tdsImageView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        onNavigationEvent(tdsImageView, str, 40.0f);
    }

    public static final void onNavigationEvent(@NotNull TdsImageView tdsImageView, @Nullable String str, float f) {
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        IAuthTabCallback(tdsImageView, str, f, 0, false, (Integer) null, 48, (Object) null);
    }

    public static final void onWarmupCompleted(@NotNull TdsImageView tdsImageView, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        IAuthTabCallback(tdsImageView, str, 40.0f, 0, z, (Integer) null, 32, (Object) null);
    }

    public static /* synthetic */ void IAuthTabCallback(TdsImageView tdsImageView, String str, float f, boolean z, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        onWarmupCompleted(tdsImageView, str, f, z, num);
    }

    public static final void onWarmupCompleted(@NotNull TdsImageView tdsImageView, @Nullable String str, float f, boolean z, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        IAuthTabCallback(tdsImageView, str, f, 0, z, num);
    }

    public static /* synthetic */ void IAuthTabCallback(TdsImageView tdsImageView, String str, float f, int i, boolean z, Integer num, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            num = null;
        }
        IAuthTabCallback(tdsImageView, str, f, i, z2, num);
    }

    public static final void IAuthTabCallback(@NotNull TdsImageView tdsImageView, @Nullable String str, float f, int i, boolean z, @Nullable Integer num) {
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int iExtraCallback;
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        if (!z || (str != null && StringsKt.contains$default(str, "fill", false, 2, (Object) null))) {
            List listMutableListOf = CollectionsKt.mutableListOf(new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(f, f)});
            if (num != null) {
                listMutableListOf.add(getAdditionalParams.onExtraCallbackWithResult(f, f, num.intValue()));
            }
            listMutableListOf.add(new Plugin(f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null));
            Context context = tdsImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onnavigationeventOnWarmupCompleted = RecomposerrecompositionRunner2.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str), listMutableListOf);
        } else {
            Context context2 = tdsImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(str);
            float f2 = (3.0f * f) / 5.0f;
            SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1 logcrosspromoteimpression = new logCrossPromoteImpression(f2, f2);
            if (num != null) {
                iExtraCallback = num.intValue();
            } else {
                Context context3 = tdsImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Configuration configuration = context3.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iExtraCallback = new getUrlokhttp(new onExtraCallbackWithResult(configuration)).extraCallback();
            }
            onnavigationeventOnWarmupCompleted = RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{logcrosspromoteimpression, getAdditionalParams.onExtraCallbackWithResult(f, f, iExtraCallback), new Plugin(f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)});
        }
        if (i != 0) {
            Context context4 = tdsImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            zzbe.onNavigationEvent(onnavigationeventOnWarmupCompleted, i, context4);
        }
        TdsImageView.setImage$default(tdsImageView, onnavigationeventOnWarmupCompleted, (Function1) null, (Function1) null, 6, (Object) null);
    }

    public static final void onNavigationEvent(@NotNull TdsListRowV1View tdsListRowV1View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        TdsButtonV1View tdsButtonV1ViewReceiveFile = tdsListRowV1View.receiveFile();
        if (tdsButtonV1ViewReceiveFile != null) {
            tdsButtonV1ViewReceiveFile.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackDefault(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (viewGroup.getTag() == setSignatureKey.NONE) {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStub(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (viewGroup.getTag() == setSignatureKey.NONE) {
            view.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallbackStubProxy(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isSyncing()) {
            view.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback_Parcel(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isSyncing()) {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getInterfaceDescriptor(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isSuccess()) {
            view.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit access100(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isSuccess()) {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit access000(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isError()) {
            view.setVisibility(4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ICustomTabsCallback(ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Object tag = viewGroup.getTag();
        setSignatureKey setsignaturekey = tag instanceof setSignatureKey ? (setSignatureKey) tag : null;
        if (setsignaturekey != null && setsignaturekey.isError()) {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public static final void onExtraCallback(@NotNull final ViewGroup viewGroup, @NotNull setSignatureKey setsignaturekey) {
        View view;
        float f;
        View view2;
        TextView textView;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(setsignaturekey, "");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        getUrlokhttp geturlokhttp = new getUrlokhttp(new onWarmupCompleted(configuration));
        View viewFindViewById = viewGroup.findViewById(R.id.lastSyncTimeLayout);
        View viewFindViewById2 = viewGroup.findViewById(R.id.taskStatusTextLayout);
        BaseTextView baseTextViewFindViewById = viewGroup.findViewById(R.id.taskStatusText);
        View view3 = (TdsImageView) viewGroup.findViewById(R.id.taskStatusIcon);
        viewGroup.setTag(setsignaturekey);
        if (setsignaturekey == setSignatureKey.NONE) {
            viewGroup.setClickable(true);
            Object tag = viewFindViewById.getTag();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(tag, bool)) {
                return;
            }
            Intrinsics.checkNotNull(viewFindViewById);
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(viewFindViewById, 0L, 300L, (Interpolator) null, false, false, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return UST_PKCS12_MakePFX.IAuthTabCallbackDefault(viewGroup, (View) obj);
                }
            }, (Function1) null, 93, (Object) null);
            Intrinsics.checkNotNull(viewFindViewById2);
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(viewFindViewById2, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return UST_PKCS12_MakePFX.IAuthTabCallbackStub(viewGroup, (View) obj);
                }
            }, 63, (Object) null);
            viewFindViewById.setTag(bool);
            viewFindViewById2.setTag(Boolean.FALSE);
            return;
        }
        if (setsignaturekey.isSyncing()) {
            viewGroup.setClickable(false);
            Object tag2 = viewFindViewById2.getTag();
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(tag2, bool2)) {
                view2 = view3;
                textView = baseTextViewFindViewById;
            } else {
                Intrinsics.checkNotNull(viewFindViewById);
                view2 = view3;
                textView = baseTextViewFindViewById;
                enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(viewFindViewById, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda2
                    public final Object invoke(Object obj) {
                        return UST_PKCS12_MakePFX.IAuthTabCallbackStubProxy(viewGroup, (View) obj);
                    }
                }, 63, (Object) null);
                Intrinsics.checkNotNull(viewFindViewById2);
                enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(viewFindViewById2, 0L, 300L, (Interpolator) null, false, false, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda3
                    public final Object invoke(Object obj) {
                        return UST_PKCS12_MakePFX.IAuthTabCallback_Parcel(viewGroup, (View) obj);
                    }
                }, (Function1) null, 93, (Object) null);
                viewFindViewById.setTag(Boolean.FALSE);
                viewFindViewById2.setTag(bool2);
            }
            textView.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
            textView.setText(viewGroup.getContext().getString(R.string.app_loading));
            Object tag3 = view2.getTag();
            ValueAnimator valueAnimator = tag3 instanceof ValueAnimator ? (ValueAnimator) tag3 : null;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                Object tag4 = view2.getTag();
                ValueAnimator valueAnimator2 = tag4 instanceof ValueAnimator ? (ValueAnimator) tag4 : null;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                view2.setRotation(0.0f);
                DisplayMetrics displayMetrics = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(0, displayMetrics);
                DisplayMetrics displayMetrics2 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                int iOnNavigationEvent2 = varyMatches.onNavigationEvent(0, displayMetrics2);
                DisplayMetrics displayMetrics3 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                int iOnNavigationEvent3 = varyMatches.onNavigationEvent(0, displayMetrics3);
                DisplayMetrics displayMetrics4 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                view2.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(0, displayMetrics4));
                Drawable drawableOnExtraCallback = ResourcesCompat.onExtraCallback(viewGroup.getResources(), R.drawable.icn_refresh_24, (Resources.Theme) null);
                Intrinsics.checkNotNull(drawableOnExtraCallback);
                drawableOnExtraCallback.setTint(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
                view2.setImageDrawable(drawableOnExtraCallback);
                view2.setSupportImageTintList(ColorStateList.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue()));
                Intrinsics.checkNotNull(view2);
                view2.setTag(enableImagePrefetchingOnUiThreadAndroid.onExtraCallbackWithResult(view2, 0.0f, 360.0f, 800L, 0L, dangerouslyForceOverride.onExtraCallbackWithResult.onWarmupCompleted(), -1, false, (Function1) null, (Function1) null, 448, (Object) null));
                return;
            }
            return;
        }
        if (!setsignaturekey.isSuccess()) {
            if (setsignaturekey.isError()) {
                viewGroup.setClickable(false);
                Object tag5 = viewFindViewById2.getTag();
                Boolean bool3 = Boolean.TRUE;
                if (!Intrinsics.areEqual(tag5, bool3)) {
                    Intrinsics.checkNotNull(viewFindViewById);
                    enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(viewFindViewById, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda6
                        public final Object invoke(Object obj) {
                            return UST_PKCS12_MakePFX.access000(viewGroup, (View) obj);
                        }
                    }, 63, (Object) null);
                    Intrinsics.checkNotNull(viewFindViewById2);
                    enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(viewFindViewById2, 0L, 300L, (Interpolator) null, false, false, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda7
                        public final Object invoke(Object obj) {
                            return UST_PKCS12_MakePFX.ICustomTabsCallback(viewGroup, (View) obj);
                        }
                    }, (Function1) null, 93, (Object) null);
                    viewFindViewById.setTag(Boolean.FALSE);
                    viewFindViewById2.setTag(bool3);
                }
                baseTextViewFindViewById.setTextColor(geturlokhttp.requestPostMessageChannel().IEngagementSignalsCallback());
                baseTextViewFindViewById.setText(viewGroup.getContext().getString(R.string.app_load_failed));
                DisplayMetrics displayMetrics5 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                int iOnNavigationEvent4 = varyMatches.onNavigationEvent(4, displayMetrics5);
                DisplayMetrics displayMetrics6 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                int iOnNavigationEvent5 = varyMatches.onNavigationEvent(4, displayMetrics6);
                DisplayMetrics displayMetrics7 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics7, "");
                int iOnNavigationEvent6 = varyMatches.onNavigationEvent(4, displayMetrics7);
                DisplayMetrics displayMetrics8 = viewGroup.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics8, "");
                view3.setPadding(iOnNavigationEvent4, iOnNavigationEvent5, iOnNavigationEvent6, varyMatches.onNavigationEvent(4, displayMetrics8));
                Drawable drawableOnExtraCallback2 = ResourcesCompat.onExtraCallback(viewGroup.getResources(), im.toss.core.R.drawable.icn_info_line, (Resources.Theme) null);
                Intrinsics.checkNotNull(drawableOnExtraCallback2);
                drawableOnExtraCallback2.setTint(geturlokhttp.requestPostMessageChannel().IEngagementSignalsCallback());
                view3.setImageDrawable(drawableOnExtraCallback2);
                view3.setSupportImageTintList(ColorStateList.valueOf(geturlokhttp.requestPostMessageChannel().IEngagementSignalsCallback()));
                Object tag6 = view3.getTag();
                ValueAnimator valueAnimator3 = tag6 instanceof ValueAnimator ? (ValueAnimator) tag6 : null;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                view3.setRotation(180.0f);
                return;
            }
            return;
        }
        viewGroup.setClickable(false);
        Object tag7 = viewFindViewById2.getTag();
        Boolean bool4 = Boolean.TRUE;
        if (Intrinsics.areEqual(tag7, bool4)) {
            view = view3;
            f = 0.0f;
        } else {
            Intrinsics.checkNotNull(viewFindViewById);
            view = view3;
            f = 0.0f;
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(viewFindViewById, 0L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return UST_PKCS12_MakePFX.getInterfaceDescriptor(viewGroup, (View) obj);
                }
            }, 63, (Object) null);
            Intrinsics.checkNotNull(viewFindViewById2);
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(viewFindViewById2, 0L, 300L, (Interpolator) null, false, false, new Function1() { // from class: viva.republica.toss.dashboard.common.DashboardBindingAdapterKt$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return UST_PKCS12_MakePFX.access100(viewGroup, (View) obj);
                }
            }, (Function1) null, 93, (Object) null);
            viewFindViewById.setTag(Boolean.FALSE);
            viewFindViewById2.setTag(bool4);
        }
        baseTextViewFindViewById.setTextColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        baseTextViewFindViewById.setText(viewGroup.getContext().getString(R.string.app_load_completed));
        DisplayMetrics displayMetrics9 = viewGroup.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics9, "");
        int iOnNavigationEvent7 = varyMatches.onNavigationEvent(2, displayMetrics9);
        DisplayMetrics displayMetrics10 = viewGroup.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics10, "");
        int iOnNavigationEvent8 = varyMatches.onNavigationEvent(2, displayMetrics10);
        DisplayMetrics displayMetrics11 = viewGroup.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics11, "");
        int iOnNavigationEvent9 = varyMatches.onNavigationEvent(2, displayMetrics11);
        DisplayMetrics displayMetrics12 = viewGroup.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics12, "");
        view.setPadding(iOnNavigationEvent7, iOnNavigationEvent8, iOnNavigationEvent9, varyMatches.onNavigationEvent(2, displayMetrics12));
        Drawable drawableOnExtraCallback3 = ResourcesCompat.onExtraCallback(viewGroup.getResources(), im.toss.core.R.drawable.icn_check, (Resources.Theme) null);
        Intrinsics.checkNotNull(drawableOnExtraCallback3);
        drawableOnExtraCallback3.setTint(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        view.setImageDrawable(drawableOnExtraCallback3);
        view.setSupportImageTintList(ColorStateList.valueOf(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{geturlokhttp.requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue()));
        Object tag8 = view.getTag();
        ValueAnimator valueAnimator4 = tag8 instanceof ValueAnimator ? (ValueAnimator) tag8 : null;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        view.setRotation(f);
    }

    public static final void IAuthTabCallback(@NotNull TdsListRowV1View tdsListRowV1View, @Nullable String str) {
        TdsImageView tdsImageViewMayLaunchUrl;
        Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
        if (str == null || (tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl()) == null) {
            return;
        }
        IAuthTabCallback(tdsImageViewMayLaunchUrl, str);
    }

    public static final void IAuthTabCallback(@NotNull TdsImageView tdsImageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(tdsImageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Context context = tdsImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsImageView.setImage$default(tdsImageView, RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(str), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new logCrossPromoteImpression(60.0f, 60.0f), new Plugin(60.0f, 0.0f, 0.0f, 0, 0, 30, (DefaultConstructorMarker) null)}), (Function1) null, (Function1) null, 6, (Object) null);
    }

    public static final void onExtraCallbackWithResult(@NotNull LottieAnimationView lottieAnimationView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            zzck.onExtraCallback(lottieAnimationView, str, (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
            lottieAnimationView.playAnimation();
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            i = new getUrlokhttp(new onNavigationEvent(configuration)).extraCallback();
        }
        onExtraCallback(tdsListRowV1View, str, z, i);
    }

    public static /* synthetic */ void onExtraCallback(TdsListRowV1View tdsListRowV1View, String str, float f, boolean z, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        if ((i2 & 16) != 0) {
            Context context = tdsListRowV1View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            i = new getUrlokhttp(new IAuthTabCallback(configuration)).extraCallback();
        }
        onNavigationEvent(tdsListRowV1View, str, f, z, i);
    }

    public static final void onWarmupCompleted(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onNavigationEvent(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void onExtraCallbackWithResult(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = i;
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
