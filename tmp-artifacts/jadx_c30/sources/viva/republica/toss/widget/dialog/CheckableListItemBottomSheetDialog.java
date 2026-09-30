package viva.republica.toss.widget.dialog;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppMsgReceiver2;
import o.CRYPT_AsymmEncryptWithCert;
import o.M_;
import o.access502;
import o.exitAllPages;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.readIntokhttp;
import o.varyMatches;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.widget.dialog.CheckableListItemBottomSheetDialog;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CheckableListItemBottomSheetDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access100;
    private final Lazy IAuthTabCallback;
    private final List<Checkable> IAuthTabCallbackDefault;
    private final String asBinder;
    private onExtraCallback asInterface;
    private final String onExtraCallback;
    private final Map<String, Object> onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private View.OnClickListener onTransact;

    public interface onExtraCallback {
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, view);
        int i4 = IAuthTabCallbackStubProxy + 113;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 41;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final /* synthetic */ onExtraCallback onExtraCallback(CheckableListItemBottomSheetDialog checkableListItemBottomSheetDialog) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 3;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback onextracallback = checkableListItemBottomSheetDialog.asInterface;
        int i5 = i2 + 45;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return onextracallback;
    }

    public static final class onWarmupCompleted extends exitAllPages<Checkable> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public static final class IAuthTabCallback implements Function1<Object, Boolean> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            static {
                int i = onExtraCallback + 121;
                onWarmupCompleted = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            public final Boolean IAuthTabCallback(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
                    return Boolean.valueOf(obj instanceof Checkable);
                }
                Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
                int i3 = 86 / 0;
                return Boolean.valueOf(obj instanceof Checkable);
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 103;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return IAuthTabCallback(obj);
                }
                IAuthTabCallback(obj);
                throw null;
            }
        }

        onWarmupCompleted(final CheckableListItemBottomSheetDialog checkableListItemBottomSheetDialog) {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.widget.dialog.CheckableListItemBottomSheetDialog$initView$adapter$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 79;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitOnExtraCallbackWithResult = CheckableListItemBottomSheetDialog.onWarmupCompleted.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
                    if (i3 == 0) {
                        int i4 = 28 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.widget.dialog.CheckableListItemBottomSheetDialog$initView$adapter$1$$ExternalSyntheticLambda1
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 115;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    CheckableListItemBottomSheetDialog checkableListItemBottomSheetDialog2 = checkableListItemBottomSheetDialog;
                    if (i3 == 0) {
                        return CheckableListItemBottomSheetDialog.onWarmupCompleted.onNavigationEvent(checkableListItemBottomSheetDialog2, this, (AppMsgReceiver2) obj, (Checkable) obj2);
                    }
                    CheckableListItemBottomSheetDialog.onWarmupCompleted.onNavigationEvent(checkableListItemBottomSheetDialog2, this, (AppMsgReceiver2) obj, (Checkable) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                int i = IAuthTabCallback + 115;
                onNavigationEvent = i % 128;
                int i2 = i % 2;
                onextracallbackwithresult.onExtraCallback(IAuthTabCallback.onExtraCallbackWithResult);
                int i3 = IAuthTabCallback + 99;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 % 2;
                }
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Configuration IAuthTabCallback;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 29;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    if (!(!readIntokhttp.onExtraCallback(this.IAuthTabCallback))) {
                        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                        int i3 = onExtraCallback + 59;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = 38 / 0;
                        }
                        return getspecialfeatureoptinstatus;
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Light;
                    int i5 = onExtraCallback + 93;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        return getspecialfeatureoptinstatus2;
                    }
                    obj.hashCode();
                    throw null;
                }
                readIntokhttp.onExtraCallback(this.IAuthTabCallback);
                obj.hashCode();
                throw null;
            }
        }

        public static final class onNavigationEvent implements getAdService {
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ Configuration IAuthTabCallback;

            public onNavigationEvent(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
                int i = 2 % 2;
                if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i2 = onWarmupCompleted + 47;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    int i3 = 98 / 0;
                } else {
                    getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                }
                int i4 = onWarmupCompleted + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return getspecialfeatureoptinstatus;
            }
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(viewHolder, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
            tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ICustomTabsCallbackStubProxy());
            Context context2 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
            tdsListRowV1View2.setCenterText2Color(new getUrlokhttp(new onNavigationEvent(configuration2)).ICustomTabsCallbackStubProxy());
            tdsListRowV1View2.setCenterText2MaxLines(Integer.MAX_VALUE);
            DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
            int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
            DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
            int iOnNavigationEvent2 = varyMatches.onNavigationEvent(12, displayMetrics2);
            DisplayMetrics displayMetrics3 = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, BuildConfig.FLAVOR);
            int iOnNavigationEvent3 = varyMatches.onNavigationEvent(24, displayMetrics3);
            DisplayMetrics displayMetrics4 = tdsListRowV1View2.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics4, BuildConfig.FLAVOR);
            tdsListRowV1View2.setPadding(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, varyMatches.onNavigationEvent(12, displayMetrics4));
            Unit unit = Unit.INSTANCE;
            int i2 = IAuthTabCallback + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return unit;
        }

        public static void onNavigationEvent(CheckableListItemBottomSheetDialog checkableListItemBottomSheetDialog, Checkable checkable, AppMsgReceiver2 appMsgReceiver2, onWarmupCompleted onwarmupcompleted, View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                CheckableListItemBottomSheetDialog.onExtraCallback(checkableListItemBottomSheetDialog);
                onwarmupcompleted.notifyItemChanged(appMsgReceiver2.getAbsoluteAdapterPosition(), checkable);
            } else {
                CheckableListItemBottomSheetDialog.onExtraCallback(checkableListItemBottomSheetDialog);
                onwarmupcompleted.notifyItemChanged(appMsgReceiver2.getAbsoluteAdapterPosition(), checkable);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static Unit onNavigationEvent(final CheckableListItemBottomSheetDialog checkableListItemBottomSheetDialog, final onWarmupCompleted onwarmupcompleted, final AppMsgReceiver2 appMsgReceiver2, final Checkable checkable) {
            int i;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(checkable, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            if (checkable.isChecked()) {
                int i3 = onNavigationEvent + 19;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                i = R.drawable.icon_checkmark_selected;
                int i5 = IAuthTabCallback + 103;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i = R.drawable.icon_checkmark_unselected;
            }
            tdsListRowV1View2.setLeftImage(i);
            TdsImageView tdsImageViewMayLaunchUrl = tdsListRowV1View2.mayLaunchUrl();
            if (tdsImageViewMayLaunchUrl != null) {
                ViewGroup.LayoutParams layoutParams = tdsImageViewMayLaunchUrl.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ConstraintLayout.onExtraCallbackWithResult) layoutParams;
                DisplayMetrics displayMetrics = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).width = varyMatches.onNavigationEvent(30, displayMetrics);
                DisplayMetrics displayMetrics2 = tdsListRowV1View2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
                ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).height = varyMatches.onNavigationEvent(30, displayMetrics2);
                onextracallbackwithresult.IAuthTabCallbackDefault = -1;
                tdsImageViewMayLaunchUrl.setLayoutParams(onextracallbackwithresult);
            }
            tdsListRowV1View2.setCenterText1(checkable.toString());
            if (CheckableListItemBottomSheetDialog.onExtraCallback(checkableListItemBottomSheetDialog) != null) {
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.widget.dialog.CheckableListItemBottomSheetDialog$initView$adapter$1$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 107;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        CheckableListItemBottomSheetDialog.onWarmupCompleted.onNavigationEvent(checkableListItemBottomSheetDialog, checkable, appMsgReceiver2, onwarmupcompleted, view);
                        int i10 = IAuthTabCallback + 61;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                tdsListRowV1View2.setClickable(true);
            } else {
                tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
                tdsListRowV1View2.setClickable(false);
            }
            return Unit.INSTANCE;
        }
    }

    private final CRYPT_AsymmEncryptWithCert onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 45;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback.getValue();
        if (i3 == 0) {
            return (CRYPT_AsymmEncryptWithCert) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 75;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallback;
        if (str == null) {
            return BuildConfig.FLAVOR;
        }
        int i5 = i2 + 81;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        if (str.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int i7 = IAuthTabCallbackStubProxy + 63;
        access100 = i7 % 128;
        if (i7 % 2 == 0) {
            return this.onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onExtraCallbackWithResult;
        int i5 = i2 + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
            ConstraintLayout constraintLayoutOnWarmupCompleted = onWarmupCompleted().onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted, BuildConfig.FLAVOR);
            setContentView(constraintLayoutOnWarmupCompleted);
            onExtraCallbackWithResult();
            int i3 = 24 / 0;
        } else {
            super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
            ConstraintLayout constraintLayoutOnWarmupCompleted2 = onWarmupCompleted().onWarmupCompleted();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutOnWarmupCompleted2, BuildConfig.FLAVOR);
            setContentView(constraintLayoutOnWarmupCompleted2);
            onExtraCallbackWithResult();
        }
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
        int i4 = IAuthTabCallbackStubProxy + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (this.asBinder == null) {
            BottomSheetHeader bottomSheetHeader = onWarmupCompleted().onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(bottomSheetHeader, BuildConfig.FLAVOR);
            bottomSheetHeader.setVisibility(8);
        } else {
            int i5 = i3 + 107;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                onWarmupCompleted().onExtraCallback.setTitle(this.asBinder);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onWarmupCompleted().onExtraCallback.setTitle(this.asBinder);
        }
        ConstraintLayout.onExtraCallbackWithResult layoutParams = onWarmupCompleted().onNavigationEvent.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, BuildConfig.FLAVOR);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = layoutParams;
        onextracallbackwithresult.asBinder = true;
        onextracallbackwithresult.prefetchWithMultipleUrls = (int) (M_.onExtraCallback.IAuthTabCallbackDefault() * 0.5d);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this);
        onWarmupCompleted().onNavigationEvent.setAdapter(onwarmupcompleted);
        onwarmupcompleted.onNavigationEvent(this.IAuthTabCallbackDefault);
        onwarmupcompleted.notifyDataSetChanged();
        if (this.onNavigationEvent != null) {
            onWarmupCompleted().IAuthTabCallback.setText(this.onNavigationEvent);
            onWarmupCompleted().IAuthTabCallback.setOnClickListener(this.onTransact);
        } else {
            TdsButtonV1View tdsButtonV1View = onWarmupCompleted().IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, BuildConfig.FLAVOR);
            tdsButtonV1View.setVisibility(8);
        }
    }
}
