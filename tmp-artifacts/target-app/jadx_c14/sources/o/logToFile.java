package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.TossApplication;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.logToFile;
import o.requestMultiplePermissions;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class logToFile extends enableNativeCSSParsing {
    private final Lazy ICustomTabsCallback;
    private final onExtraCallback extraCallback;

    public interface onExtraCallback {
        boolean onNavigationEvent(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec);

        void onWarmupCompleted(@NotNull NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec, @NotNull String str);
    }

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[sendBinary.values().length];
            try {
                iArr[sendBinary.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sendBinary.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public logToFile(@NotNull ViewGroup viewGroup, @NotNull onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        ViewDataBinding viewDataBindingOnWarmupCompleted = ContextMenuAreaKtExternalSyntheticLambda0.onWarmupCompleted(LayoutInflater.from(viewGroup.getContext()), toRealPath.onNavigationEvent.TRANSACTION_V2_ITEM.getLayoutResId(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingOnWarmupCompleted, "");
        super(viewDataBindingOnWarmupCompleted);
        this.extraCallback = onextracallback;
        this.ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.detail.viewholder.TransactionItemViewHolder$$ExternalSyntheticLambda0
            public final Object invoke() {
                return logToFile.IAuthTabCallback();
            }
        });
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(40, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View2.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(40, displayMetrics2));
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW2B);
        tdsListRowV1View2.setCenterText1MaxLines(3);
        tdsListRowV1View2.setCenterText2MaxLines(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map IAuthTabCallback() {
        return new LinkedHashMap();
    }

    private final Map<String, AnimatorSet> onWarmupCompleted() {
        return (Map) this.ICustomTabsCallback.getValue();
    }

    public void onExtraCallback(@Nullable enableInteropViewManagerClassLookUpOptimizationIOS enableinteropviewmanagerclasslookupoptimizationios) {
        final NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpecOnNavigationEvent;
        Context context;
        int i;
        AnimatorSet animatorSet;
        UST_CHECK_UNISIGN ust_check_unisign = enableinteropviewmanagerclasslookupoptimizationios instanceof UST_CHECK_UNISIGN ? (UST_CHECK_UNISIGN) enableinteropviewmanagerclasslookupoptimizationios : null;
        if (ust_check_unisign == null || (nativeJSCHeapCaptureSpecOnNavigationEvent = ust_check_unisign.onNavigationEvent()) == null) {
            return;
        }
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) this).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        deleteTimer deletetimerIAuthTabCallback = nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback();
        UST_PKCS12_MakePFX.onExtraCallbackWithResult(tdsListRowV1View2, deletetimerIAuthTabCallback != null ? deletetimerIAuthTabCallback.onWarmupCompleted(tdsListRowV1View2.getContext()) : null, false, 0, 8, null);
        deleteTimer deletetimerIAuthTabCallback2 = nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback();
        sendBinary sendbinaryOnWarmupCompleted = deletetimerIAuthTabCallback2 != null ? deletetimerIAuthTabCallback2.onWarmupCompleted() : null;
        int i2 = sendbinaryOnWarmupCompleted == null ? -1 : onNavigationEvent.IAuthTabCallback[sendbinaryOnWarmupCompleted.ordinal()];
        if (i2 == 1) {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.LOTTIE);
            DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(40, displayMetrics);
            DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            tdsListRowV1View2.setLeftLottieSize(iOnNavigationEvent, varyMatches.onNavigationEvent(40, displayMetrics2));
            tdsListRowV1View2.setLeftLottieUrl(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback().onWarmupCompleted(tdsListRowV1View2.getContext()), nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback().onNavigationEvent());
        } else if (i2 == 2) {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            UST_PKCS12_MakePFX.onExtraCallbackWithResult(tdsListRowV1View2, nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback().onWarmupCompleted(tdsListRowV1View2.getContext()), false, 0, 8, null);
        } else {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.NONE);
        }
        requestMultiplePermissions.onExtraCallback onextracallback = requestMultiplePermissions.Companion;
        requestMultiplePermissions requestmultiplepermissionsOnExtraCallback = nativeJSCHeapCaptureSpecOnNavigationEvent.onExtraCallback();
        Context context2 = tdsListRowV1View2.getContext();
        Context context3 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setCenterText1Color(onextracallback.onExtraCallback(requestmultiplepermissionsOnExtraCallback, context2, new getUrlokhttp(new onExtraCallbackWithResult(configuration)).onRelationshipValidationResult()));
        requestMultiplePermissions requestmultiplepermissionsOnExtraCallback2 = nativeJSCHeapCaptureSpecOnNavigationEvent.onExtraCallback();
        Context context4 = tdsListRowV1View2.getContext();
        Context context5 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration2 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        tdsListRowV1View2.setCenterText2Color(onextracallback.IAuthTabCallback(requestmultiplepermissionsOnExtraCallback2, context4, new getUrlokhttp(new onWarmupCompleted(configuration2)).onPostMessage()));
        requestMultiplePermissions requestmultiplepermissionsOnExtraCallback3 = nativeJSCHeapCaptureSpecOnNavigationEvent.onExtraCallback();
        Context context6 = tdsListRowV1View2.getContext();
        Context context7 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        Configuration configuration3 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration3, "");
        tdsListRowV1View2.setRightText1Color(onextracallback.onWarmupCompleted(requestmultiplepermissionsOnExtraCallback3, context6, new getUrlokhttp(new IAuthTabCallback(configuration3)).ICustomTabsCallbackStubProxy()));
        requestMultiplePermissions requestmultiplepermissionsOnExtraCallback4 = nativeJSCHeapCaptureSpecOnNavigationEvent.onExtraCallback();
        Context context8 = tdsListRowV1View2.getContext();
        Context context9 = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        Configuration configuration4 = context9.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration4, "");
        tdsListRowV1View2.setRightText2Color(onextracallback.onNavigationEvent(requestmultiplepermissionsOnExtraCallback4, context8, new getUrlokhttp(new IAuthTabCallbackStub(configuration4)).onPostMessage()));
        tdsListRowV1View2.setCenterText1(BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpecOnNavigationEvent}, 1210258625, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback()), false, 1, (Object) null));
        tdsListRowV1View2.setCenterText2(BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpecOnNavigationEvent}, -1841901167, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback()), false, 1, (Object) null));
        tdsListRowV1View2.setRightText1(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback_Parcel(), false, 1, (Object) null));
        tdsListRowV1View2.setRightText2(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallbackDefault(), false, 1, (Object) null));
        tdsListRowV1View2.setRightArrow(nativeJSCHeapCaptureSpecOnNavigationEvent.onNavigationEvent());
        if (nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallbackStub().length() > 0) {
            tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.detail.viewholder.TransactionItemViewHolder$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    logToFile.onWarmupCompleted(this.f$0, nativeJSCHeapCaptureSpecOnNavigationEvent, view);
                }
            });
        } else {
            tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
            tdsListRowV1View2.setClickable(false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(-1210258625, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpecOnNavigationEvent}, 1210258625, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback())) + " ");
        if (StringsKt.contains$default(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback_Parcel(), "-", false, 2, (Object) null)) {
            context = tdsListRowV1View2.getContext();
            i = R.string.withdrawal_transfer;
        } else {
            context = tdsListRowV1View2.getContext();
            i = R.string.deposit_transfer;
        }
        sb.append(context.getString(i));
        sb.append(StringsKt.replace$default(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallback_Parcel(), "-", "", false, 4, (Object) null));
        sb.append(" " + ((String) NativeJSCHeapCaptureSpec.onExtraCallbackWithResult(1841901168, TossApplication.onSessionEnded.onExtraCallback(), new Object[]{nativeJSCHeapCaptureSpecOnNavigationEvent}, -1841901167, TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback(), TossApplication.onSessionEnded.onExtraCallback())) + " ");
        sb.append(tdsListRowV1View2.getContext().getString(R.string.transfer_my_account_balance));
        sb.append(nativeJSCHeapCaptureSpecOnNavigationEvent.IAuthTabCallbackDefault());
        tdsListRowV1View2.setContentDescription(sb.toString());
        String strAsInterface = nativeJSCHeapCaptureSpecOnNavigationEvent.asInterface();
        int i3 = R.id.animation;
        Object tag = tdsListRowV1View2.getTag(i3);
        String str = tag instanceof String ? (String) tag : null;
        if (str != null && !Intrinsics.areEqual(str, strAsInterface) && (animatorSet = onWarmupCompleted().get(str)) != null) {
            animatorSet.cancel();
        }
        if (!this.extraCallback.onNavigationEvent(nativeJSCHeapCaptureSpecOnNavigationEvent) || onWarmupCompleted().containsKey(strAsInterface)) {
            return;
        }
        tdsListRowV1View2.setTag(i3, strAsInterface);
        requestMultiplePermissions requestmultiplepermissionsOnWarmupCompleted = ((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{tdsListRowV1View2.getContext()}, 194147643, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue() ? nativeJSCHeapCaptureSpecOnNavigationEvent.onWarmupCompleted() : nativeJSCHeapCaptureSpecOnNavigationEvent.onExtraCallback();
        if (requestmultiplepermissionsOnWarmupCompleted != null) {
            Context context10 = tdsListRowV1View2.getContext();
            Context context11 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "");
            Configuration configuration5 = context11.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, "");
            tdsListRowV1View2.setBackgroundColor(onextracallback.onExtraCallbackWithResult(requestmultiplepermissionsOnWarmupCompleted, context10, ((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new asInterface(configuration5)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue()));
        }
        Drawable background = tdsListRowV1View2.getBackground();
        if (background != null) {
            background.setAlpha(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(300L);
        animatorSet2.play(onExtraCallbackWithResult(tdsListRowV1View2, 25, 0)).after(1500L).after(onExtraCallbackWithResult(tdsListRowV1View2, 0, 25));
        animatorSet2.addListener(new onTransact(tdsListRowV1View2, tdsListRowV1View2));
        onWarmupCompleted().put(strAsInterface, animatorSet2);
        animatorSet2.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(logToFile logtofile, NativeJSCHeapCaptureSpec nativeJSCHeapCaptureSpec, View view) {
        logtofile.extraCallback.onWarmupCompleted(nativeJSCHeapCaptureSpec, nativeJSCHeapCaptureSpec.IAuthTabCallbackStub());
    }

    public static final class onTransact implements Animator.AnimatorListener {
        final /* synthetic */ TdsListRowV1View onExtraCallbackWithResult;
        final /* synthetic */ TdsListRowV1View onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public onTransact(TdsListRowV1View tdsListRowV1View, TdsListRowV1View tdsListRowV1View2) {
            this.onWarmupCompleted = tdsListRowV1View;
            this.onExtraCallbackWithResult = tdsListRowV1View2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.onWarmupCompleted.setBackground(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.onExtraCallbackWithResult.setBackground(null);
        }
    }

    private final Animator onExtraCallbackWithResult(final View view, int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        valueAnimatorOfInt.setDuration(700L);
        valueAnimatorOfInt.setInterpolator(TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.account.detail.viewholder.TransactionItemViewHolder$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                logToFile.onWarmupCompleted(view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(View view, ValueAnimator valueAnimator) {
        Drawable background;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        background.setAlpha(((Integer) animatedValue).intValue());
    }
}
