package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.network.throwable.ApiServerError;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.getNodesManager;
import o.initMiniApp;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface getNodesManager {
    static /* synthetic */ Unit onExtraCallback(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(function0, dialogInterface);
    }

    static /* synthetic */ Unit onExtraCallback(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        return onWarmupCompleted(function0, gettypedexportedconstants, view);
    }

    static /* synthetic */ boolean onExtraCallback(Context context, String str) {
        int i = 2 % 2;
        return onExtraCallbackWithResult(context, str);
    }

    static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, String str3, Context context, Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        return IAuthTabCallback(str, str2, str3, context, function0, commonModule_setLeftEdgeTouchEnabled);
    }

    ApiServerError asInterface();

    public static final class onExtraCallbackWithResult implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 1;
        public static final onExtraCallbackWithResult INSTANCE = new onExtraCallbackWithResult();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public final void IAuthTabCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback((initMiniApp.onWarmupCompleted) obj);
            if (i3 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = onNavigationEvent + 123;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }
    }

    default boolean readTypedObject() {
        int i = 2 % 2;
        ApiServerError apiServerErrorAsInterface = asInterface();
        return Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, "TE00100");
    }

    default boolean writeTypedObject() {
        int i = 2 % 2;
        ApiServerError apiServerErrorAsInterface = asInterface();
        return Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, "TE00001");
    }

    default boolean onExtraCallback() {
        int i = 2 % 2;
        ApiServerError apiServerErrorAsInterface = asInterface();
        return Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, "TE00004");
    }

    default boolean onWarmupCompleted() {
        int i = 2 % 2;
        ApiServerError apiServerErrorAsInterface = asInterface();
        return Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, "TE00005");
    }

    default boolean IAuthTabCallback() {
        int i = 2 % 2;
        ApiServerError apiServerErrorAsInterface = asInterface();
        return Intrinsics.areEqual(apiServerErrorAsInterface != null ? apiServerErrorAsInterface.onExtraCallbackWithResult() : null, "TE00006");
    }

    private static boolean onExtraCallbackWithResult(Context context, String str) {
        int i = 2 % 2;
        return SessionTrackerb.onExtraCallbackWithResult(resumeForClick.asBinder, context, str, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
    }

    private static Unit onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static Unit IAuthTabCallback(String str, String str2, String str3, Context context, final Function0 function0, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(str);
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str2);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, str3, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.network.model.transfer.ITransferResp$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 89;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = getNodesManager.onExtraCallback(function0, (DialogInterface) obj);
                int i5 = onWarmupCompleted + 53;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallback;
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string = context.getString(R.string.close);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, (Function1) null, 14, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration $this_palette;

        public onNavigationEvent(Configuration configuration) {
            this.$this_palette = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.$this_palette)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 51;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    private static Unit onWarmupCompleted(Function0 function0, getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        gettypedexportedconstants.dismiss();
        return Unit.INSTANCE;
    }

    default void onExtraCallback(@NotNull final Context context) {
        final String string;
        String string2;
        String string3;
        String string4;
        String string5;
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(24.0f);
        Intrinsics.checkNotNullParameter(context, "");
        ApiServerError apiServerErrorAsInterface = asInterface();
        if (apiServerErrorAsInterface != null) {
            Object obj = ((Map) ApiServerError.onExtraCallbackWithResult(new Object[]{apiServerErrorAsInterface}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1178086673, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1178086674, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult())).get("scheme");
            if (obj == null || (string = obj.toString()) == null) {
                return;
            }
            final Function0 function0 = new Function0() { // from class: viva.republica.toss.network.model.transfer.ITransferResp$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Context context2 = context;
                    if (i4 != 0) {
                        return Boolean.valueOf(getNodesManager.onExtraCallback(context2, string));
                    }
                    Boolean.valueOf(getNodesManager.onExtraCallback(context2, string));
                    throw null;
                }
            };
            Object obj2 = ((Map) ApiServerError.onExtraCallbackWithResult(new Object[]{apiServerErrorAsInterface}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1178086673, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 1178086674, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult())).get("messageInfo");
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            if (map == null) {
                function0.invoke();
                return;
            }
            Object obj3 = map.get("showType");
            if (obj3 == null || (string2 = obj3.toString()) == null) {
                string2 = "";
            }
            Object obj4 = map.get("title");
            String str = (obj4 == null || (string5 = obj4.toString()) == null) ? "" : string5;
            Object obj5 = map.get("message");
            String str2 = (obj5 == null || (string4 = obj5.toString()) == null) ? "" : string4;
            Object obj6 = map.get("buttonText");
            if (obj6 == null || (string3 = obj6.toString()) == null) {
                string3 = context.getString(R.string.app_move);
                Intrinsics.checkNotNullExpressionValue(string3, "");
            }
            final String str3 = string3;
            if (Intrinsics.areEqual(string2, "ALERT")) {
                final String str4 = str;
                final String str5 = str2;
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new Function1() { // from class: viva.republica.toss.network.model.transfer.ITransferResp$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj7) {
                        int i2 = 2 % 2;
                        int i3 = onExtraCallback + 5;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        String str6 = str4;
                        String str7 = str5;
                        String str8 = str3;
                        Context context2 = context;
                        Function0 function02 = function0;
                        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) obj7;
                        if (i4 != 0) {
                            getNodesManager.onExtraCallbackWithResult(str6, str7, str8, context2, function02, commonModule_setLeftEdgeTouchEnabled);
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = getNodesManager.onExtraCallbackWithResult(str6, str7, str8, context2, function02, commonModule_setLeftEdgeTouchEnabled);
                        int i5 = onExtraCallback + 61;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            if (!Intrinsics.areEqual(string2, "BOTTOM_SHEET")) {
                function0.invoke();
                return;
            }
            onExtraCallbackWithResult onextracallbackwithresult = onExtraCallbackWithResult.INSTANCE;
            logAndOpenStore.IAuthTabCallback(context, (Long) null);
            final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context, 0, false, false, -1L, onextracallbackwithresult, 14, (DefaultConstructorMarker) null);
            Context context2 = gettypedexportedconstants.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setOrientation(1);
            Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            bottomSheetHeader.setShowCloseIcon(false);
            bottomSheetHeader.setTitle(str);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
            BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
            Intrinsics.checkNotNull(baseTextView);
            DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
            DisplayMetrics displayMetrics2 = baseTextView.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            baseTextView.setPadding(iOnNavigationEvent, baseTextView.getPaddingTop(), varyMatches.onNavigationEvent(fValueOf, displayMetrics2), baseTextView.getPaddingBottom());
            Context context4 = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            baseTextView.setTextColor(new getUrlokhttp(new onNavigationEvent(configuration)).ICustomTabsCallbackStubProxy());
            baseTextView.setText(str2);
            Intrinsics.checkNotNull(baseTextView);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
            Context context5 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, str3, new Function1() { // from class: viva.republica.toss.network.model.transfer.ITransferResp$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj7) {
                    int i2 = 2 % 2;
                    int i3 = IAuthTabCallback + 1;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    Function0 function02 = function0;
                    if (i4 != 0) {
                        return getNodesManager.onExtraCallback(function02, gettypedexportedconstants, (View) obj7);
                    }
                    Unit unitOnExtraCallback = getNodesManager.onExtraCallback(function02, gettypedexportedconstants, (View) obj7);
                    int i5 = 33 / 0;
                    return unitOnExtraCallback;
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
            setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
            gettypedexportedconstants.setContentView(linearLayout);
            gettypedexportedconstants.show();
            Unit unit = Unit.INSTANCE;
        }
    }
}
