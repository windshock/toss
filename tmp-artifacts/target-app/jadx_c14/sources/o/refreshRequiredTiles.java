package o;

import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.collect.Synchronized;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.switches.TdsSwitchV1View;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.initMiniApp;
import o.refreshRequiredTiles;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class refreshRequiredTiles {
    public static final refreshRequiredTiles IAuthTabCallback = new refreshRequiredTiles();

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

        public final void onWarmupCompleted(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    private refreshRequiredTiles() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function1 function1, TdsListRowV1View tdsListRowV1View, TdsListRowV1View tdsListRowV1View2, getTypedExportedConstants gettypedexportedconstants, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TdsSwitchV1View tdsSwitchV1View = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        boolean zIsChecked = tdsSwitchV1View != null ? tdsSwitchV1View.isChecked() : true;
        TdsSwitchV1View tdsSwitchV1View2 = (TdsSwitchV1View) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1467355518, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1467355519, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        function1.invoke(new Pair(Boolean.valueOf(zIsChecked), Boolean.valueOf(tdsSwitchV1View2 != null ? tdsSwitchV1View2.isChecked() : true)));
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    public final LinearLayout onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(IAuthTabCallback.onExtraCallback(linearLayout, str, str2));
        return linearLayout;
    }

    private final LinearLayout onExtraCallback(ViewGroup viewGroup, String str, String str2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        ASymmetricKey aSymmetricKeyOnExtraCallback = ASymmetricKey.onExtraCallback(layoutInflaterFrom);
        Typography7 typography7 = aSymmetricKeyOnExtraCallback.onExtraCallback;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) viewGroup.getContext().getString(R.string.guardian_certify_pending_message_title));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) viewGroup.getContext().getString(R.string.guardian_certify_pending_message_content, str2, str, str));
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallback(configuration)).asBinder());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\nhttp://toss.im/가입링크");
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        typography7.setText(new SpannedString(spannableStringBuilder));
        LinearLayout root = aSymmetricKeyOnExtraCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull final Function1<? super Pair<Boolean, Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(context, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
        Context context2 = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        AFj1rSDK aFj1rSDK = AFj1rSDK.onExtraCallback;
        bottomSheetHeader.setTitle(aFj1rSDK.onExtraCallbackWithResult(R.string.app_guardian_pending_certify_count_clear_title));
        bottomSheetHeader.setDescription(aFj1rSDK.onExtraCallbackWithResult(R.string.app_guardian_pending_certify_count_clear_description));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        final TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context4, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        TdsListRowV1View.onExtraCallbackWithResult onextracallbackwithresult2 = TdsListRowV1View.onExtraCallbackWithResult.ROW1A;
        tdsListRowV1View.setCenterType(onextracallbackwithresult2);
        tdsListRowV1View.setCenterText1(aFj1rSDK.onExtraCallbackWithResult(R.string.app_guardian_pending_certify_count_clear_sms_title));
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.SWITCH;
        tdsListRowV1View.setRightType(asbinder);
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View, true, false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        final TdsListRowV1View tdsListRowV1View2 = new TdsListRowV1View(context5, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View2.setCenterType(onextracallbackwithresult2);
        tdsListRowV1View2.setCenterText1(aFj1rSDK.onExtraCallbackWithResult(R.string.app_guardian_pending_certify_count_clear_canle_title));
        tdsListRowV1View2.setRightType(asbinder);
        TdsListRowV1View.setRightSwitchChecked$default(tdsListRowV1View2, true, false, 2, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsListRowV1View2);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, aFj1rSDK.onExtraCallbackWithResult(im.toss.uikit.R.string.uikit_confirm), new Function1() { // from class: viva.republica.toss.guest.certify.guardian.GuardianContentUtil$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return refreshRequiredTiles.onExtraCallbackWithResult(function1, tdsListRowV1View2, tdsListRowV1View, gettypedexportedconstants, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }
}
