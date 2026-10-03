package viva.republica.toss.account.settings.withdrawagreement;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ump.FormError;
import com.google.common.collect.Synchronized;
import im.toss.base.BaseActivity;
import im.toss.network.throwable.TossApiCallException;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import im.toss.uikit.widget.AppBarLayout;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.uikit.widget.Toolbar;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppMsgReceiver2;
import o.BERSequenceGenerator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.IPostMessageServiceStubProxy;
import o.M_;
import o.PlayerErrorCode;
import o.PluginInfo;
import o.RightClickGesturesKtonRightClickDown2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access502;
import o.addExtra;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getAdService;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.maybeUpdateAnimatable;
import o.onCallBack;
import o.onPageExit;
import o.readIntokhttp;
import o.setProtocolsokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setVisitUrl;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity;
import viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountWithdrawAgreementSettingsActivity extends Hilt_AccountWithdrawAgreementSettingsActivity {
    private ConfirmBottomSheet IAuthTabCallbackStub;
    private RecyclerView asBinder;
    private TdsResultV0View asInterface;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {115, 30, 119, 102};
    private static final int $$b = 208;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int extraCallbackWithResult = 1;
    private static long access100 = 7798559133331975163L;
    private static int access000 = -1776194565;
    private static char IAuthTabCallbackStubProxy = 13071;
    private final Lazy IAuthTabCallback_Parcel = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(BERSequenceGenerator.class), new IAuthTabCallback_Parcel(this), new IAuthTabCallbackStubProxy(this), new access000(null, this));
    private final IAuthTabCallback onTransact = new IAuthTabCallback(new onNavigationEvent());
    private final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallbackDefault = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$$ExternalSyntheticLambda1
        public final Object invoke(Object obj) {
            return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, short r8, int r9) {
        /*
            int r7 = r7 + 109
            byte[] r0 = viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity.$$a
            int r9 = r9 * 2
            int r9 = r9 + 1
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity.$$c(short, short, int):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(accountWithdrawAgreementSettingsActivity, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountWithdrawAgreementSettingsActivity, iEngagementSignalsCallbackDefault);
        int i3 = getInterfaceDescriptor + 85;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(accountWithdrawAgreementSettingsActivity, setDetectableSize);
        int i4 = extraCallbackWithResult + 25;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, BERSequenceGenerator.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 119;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(1264911865, iOnExtraCallback5, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback4, new Object[]{accountWithdrawAgreementSettingsActivity, iAuthTabCallback}, iOnExtraCallback6, -1264911865);
        int i3 = extraCallbackWithResult + 89;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(-1490778819, iOnExtraCallback2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{accountWithdrawAgreementSettingsActivity, dialogInterface}, iOnExtraCallback3, 1490778821);
        int i4 = getInterfaceDescriptor + 63;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i | i6);
        int i8 = ~(i6 | i4);
        int i9 = i7 | i8;
        int i10 = ~i;
        int i11 = ~i6;
        int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
        int i13 = ~i4;
        int i14 = i12 | (~(i13 | i | i6));
        int i15 = (~(i13 | i11)) | i | i8;
        int i16 = i + i6 + i2 + (1962400304 * i5) + (1167700406 * i3);
        int i17 = i16 * i16;
        int i18 = ((i * (-1019457937)) - 559939584) + ((-1019457937) * i6) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i2) + ((-1660944384) * i5) + ((-325058560) * i3) + (867827712 * i17);
        int i19 = ((i * (-1629562239)) - 1134582380) + (i6 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i2 * (-1629561329)) + (i5 * (-1621399344)) + (i3 * (-873382486)) + (i17 * 1407582208);
        int i20 = i18 + (i19 * i19 * (-1895432192));
        if (i20 != 1) {
            if (i20 == 2) {
                return onExtraCallbackWithResult(objArr);
            }
            AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity = (AccountWithdrawAgreementSettingsActivity) objArr[0];
            BERSequenceGenerator.IAuthTabCallback iAuthTabCallback = (BERSequenceGenerator.IAuthTabCallback) objArr[1];
            int i21 = 2 % 2;
            int i22 = getInterfaceDescriptor + 115;
            extraCallbackWithResult = i22 % 128;
            int i23 = i22 % 2;
            accountWithdrawAgreementSettingsActivity.setEngagementSignalsCallback().onWarmupCompleted(iAuthTabCallback);
            Unit unit = Unit.INSTANCE;
            int i24 = extraCallbackWithResult + 47;
            getInterfaceDescriptor = i24 % 128;
            int i25 = i24 % 2;
            return unit;
        }
        AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity2 = (AccountWithdrawAgreementSettingsActivity) objArr[0];
        int i26 = 2 % 2;
        int i27 = extraCallbackWithResult;
        int i28 = i27 + 53;
        getInterfaceDescriptor = i28 % 128;
        int i29 = i28 % 2;
        SessionTrackerb sessionTrackerb = accountWithdrawAgreementSettingsActivity2.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i30 = i27 + 7;
        getInterfaceDescriptor = i30 % 128;
        int i31 = i30 % 2;
        return sessionTrackerb;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return 1257031L;
        }
        throw null;
    }

    static final class IAuthTabCallback extends onCallBack<Object> {
        private final onWarmupCompleted IAuthTabCallback;

        public interface onWarmupCompleted {
            void onNavigationEvent(@NotNull BERSequenceGenerator.IAuthTabCallback iAuthTabCallback);
        }

        public static final class asInterface implements Function1<Object, Boolean> {
            public static final asInterface onNavigationEvent = new asInterface();

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof BERSequenceGenerator.IAuthTabCallback);
            }
        }

        public static final class onTransact implements Function1<Object, Boolean> {
            public static final onTransact onWarmupCompleted = new onTransact();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof Pair);
            }
        }

        /* renamed from: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0020IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public C0020IAuthTabCallback(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onExtraCallback implements getAdService {
            final /* synthetic */ Configuration onWarmupCompleted;

            public onExtraCallback(Configuration configuration) {
                this.onWarmupCompleted = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

        public static final class onExtraCallbackWithResult implements View.OnLayoutChangeListener {
            final /* synthetic */ BaseTextView onWarmupCompleted;

            public onExtraCallbackWithResult(BaseTextView baseTextView) {
                this.onWarmupCompleted = baseTextView;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                Rect rect = new Rect();
                DisplayMetrics displayMetrics = this.onWarmupCompleted.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                int iOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
                view.getHitRect(rect);
                int i9 = -iOnNavigationEvent;
                rect.inset(i9, i9);
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull onWarmupCompleted onwarmupcompleted) {
            super(new DiffUtil.ItemCallback<Object>() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.1
                public boolean areItemsTheSame(Object obj, Object obj2) {
                    Intrinsics.checkNotNullParameter(obj, "");
                    Intrinsics.checkNotNullParameter(obj2, "");
                    if ((obj instanceof BERSequenceGenerator.IAuthTabCallback) && (obj2 instanceof BERSequenceGenerator.IAuthTabCallback)) {
                        return BERSequenceGenerator.onExtraCallback.onExtraCallback(((BERSequenceGenerator.IAuthTabCallback) obj).onNavigationEvent(), ((BERSequenceGenerator.IAuthTabCallback) obj2).onNavigationEvent());
                    }
                    return Intrinsics.areEqual(obj, obj2);
                }

                public boolean areContentsTheSame(Object obj, Object obj2) {
                    Intrinsics.checkNotNullParameter(obj, "");
                    Intrinsics.checkNotNullParameter(obj2, "");
                    return Intrinsics.areEqual(obj, obj2);
                }
            });
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.IAuthTabCallback = onwarmupcompleted;
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onWarmupCompleted((Context) obj);
                }
            });
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onWarmupCompleted((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onExtraCallbackWithResult(this.f$0, (AppMsgReceiver2) obj, (BERSequenceGenerator.IAuthTabCallback) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(asInterface.onNavigationEvent);
            }
            onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.IAuthTabCallback((Context) obj);
                }
            });
            onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda5
                public final Object invoke(Object obj, Object obj2) {
                    return AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onNavigationEvent((AppMsgReceiver2) obj, (Pair) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(onTransact.onWarmupCompleted);
            }
            onNavigationEvent(onextracallbackwithresult2.onExtraCallbackWithResult());
        }

        public static View onWarmupCompleted(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null);
        }

        public static Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            tdsListRowV1View2.setRightBreakEnabled(false);
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            tdsListRowV1View2.setLeftImageTransformation(new PluginInfo(40.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null));
            tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new C0020IAuthTabCallback(configuration)).ICustomTabsCallbackStubProxy());
            Context context2 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            tdsListRowV1View2.setCenterText2Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onExtraCallback(configuration2))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1C);
            Context context3 = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            tdsListRowV1View2.setRightText1Color(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new onNavigationEvent(configuration3))}, 975054206, -975054198, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
            tdsListRowV1View2.setRightText1(tdsListRowV1View2.getContext().getString(R.string.transfer_withdraw_agreement_settings_revoke_button_in_short));
            BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (baseTextView != null) {
                M_.onExtraCallback.onNavigationEvent(baseTextView);
                setProtocolsokhttp.onExtraCallback(baseTextView);
                if (!baseTextView.isLaidOut() || baseTextView.isLayoutRequested()) {
                    baseTextView.addOnLayoutChangeListener(new onExtraCallbackWithResult(baseTextView));
                } else {
                    Rect rect = new Rect();
                    DisplayMetrics displayMetrics = baseTextView.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                    int iOnNavigationEvent = varyMatches.onNavigationEvent(12, displayMetrics);
                    baseTextView.getHitRect(rect);
                    int i = -iOnNavigationEvent;
                    rect.inset(i, i);
                    Object parent = baseTextView.getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setTouchDelegate(new TouchDelegate(rect, baseTextView));
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallbackWithResult(final IAuthTabCallback iAuthTabCallback, AppMsgReceiver2 appMsgReceiver2, final BERSequenceGenerator.IAuthTabCallback iAuthTabCallback2) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, "");
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            String strIAuthTabCallback = iAuthTabCallback2.IAuthTabCallback();
            if (strIAuthTabCallback != null) {
                tdsListRowV1View2.setLeftImage(strIAuthTabCallback);
            } else {
                tdsListRowV1View2.setLeftImage((Drawable) null);
            }
            tdsListRowV1View2.setCenterText1(iAuthTabCallback2.onWarmupCompleted());
            tdsListRowV1View2.setCenterText2(iAuthTabCallback2.onExtraCallback());
            BaseTextView baseTextView = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (baseTextView != null) {
                baseTextView.setContentDescription(tdsListRowV1View2.getContext().getString(R.string.transfer_withdraw_agreement_settings_revoke_button_in_short) + " " + iAuthTabCallback2.onWarmupCompleted());
            }
            BaseTextView baseTextView2 = (BaseTextView) TdsListRowV1View.IAuthTabCallback(new Object[]{tdsListRowV1View2}, -1111713185, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1111713194, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
            if (baseTextView2 != null) {
                baseTextView2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$AccountListAdapter$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onWarmupCompleted(this.f$0, iAuthTabCallback2, view);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static void onWarmupCompleted(IAuthTabCallback iAuthTabCallback, BERSequenceGenerator.IAuthTabCallback iAuthTabCallback2, View view) {
            iAuthTabCallback.IAuthTabCallback.onNavigationEvent(iAuthTabCallback2);
        }

        public static View IAuthTabCallback(Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new TdsTopV2View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsTopV2View tdsTopV2View = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            TdsTopV2View tdsTopV2View2 = tdsTopV2View;
            tdsTopV2View2.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            tdsTopV2View2.setSubtitle2Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            return Unit.INSTANCE;
        }

        public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, Pair pair) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(pair, "");
            TdsTopV2View tdsTopV2View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsTopV2View, "");
            TdsTopV2View tdsTopV2View2 = tdsTopV2View;
            tdsTopV2View2.setTitleText((String) pair.getFirst());
            tdsTopV2View2.setSubtitle2Text((String) pair.getSecond());
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ ConfirmBottomSheet IAuthTabCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 29;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ConfirmBottomSheet confirmBottomSheet = accountWithdrawAgreementSettingsActivity.IAuthTabCallbackStub;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 21;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return confirmBottomSheet;
    }

    public static final /* synthetic */ BERSequenceGenerator onExtraCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        BERSequenceGenerator engagementSignalsCallback = accountWithdrawAgreementSettingsActivity.setEngagementSignalsCallback();
        int i4 = getInterfaceDescriptor + 99;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return engagementSignalsCallback;
    }

    public static final /* synthetic */ void onExtraCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, BERSequenceGenerator.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        accountWithdrawAgreementSettingsActivity.onExtraCallbackWithResult(iAuthTabCallback);
        int i4 = extraCallbackWithResult + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    public static final /* synthetic */ IAuthTabCallback onExtraCallbackWithResult(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = accountWithdrawAgreementSettingsActivity.onTransact;
        int i5 = i3 + 83;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return iAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ RecyclerView onNavigationEvent(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 1;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        RecyclerView recyclerView = accountWithdrawAgreementSettingsActivity.asBinder;
        if (i3 != 0) {
            return recyclerView;
        }
        throw null;
    }

    public static final /* synthetic */ TdsResultV0View onWarmupCompleted(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 121;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        TdsResultV0View tdsResultV0View = accountWithdrawAgreementSettingsActivity.asInterface;
        int i5 = i2 + 37;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return tdsResultV0View;
    }

    private final BERSequenceGenerator setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallback_Parcel.getValue();
        if (i3 != 0) {
            return (BERSequenceGenerator) value;
        }
        throw null;
    }

    public static final class IAuthTabCallbackStubProxy implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public IAuthTabCallbackStubProxy(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallback.getDefaultViewModelProviderFactory();
        }
    }

    public static final class onNavigationEvent implements IAuthTabCallback.onWarmupCompleted {
        onNavigationEvent() {
        }

        @Override // viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity.IAuthTabCallback.onWarmupCompleted
        public void onNavigationEvent(final BERSequenceGenerator.IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            ConvertByteArrayToFloatArray.onExtraCallback(1257035L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity$accountListAdapter$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AccountWithdrawAgreementSettingsActivity.onNavigationEvent.onWarmupCompleted(iAuthTabCallback, (SetDetectableSize) obj);
                }
            }, 14, (Object) null);
            AccountWithdrawAgreementSettingsActivity.onExtraCallback(AccountWithdrawAgreementSettingsActivity.this).IAuthTabCallback(iAuthTabCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(BERSequenceGenerator.IAuthTabCallback iAuthTabCallback, SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("bank_code", Integer.valueOf(iAuthTabCallback.onExtraCallbackWithResult()));
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallback_Parcel implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallback_Parcel(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallbackWithResult.getViewModelStore();
        }
    }

    public static final class access000 implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ ComponentActivity onNavigationEvent;
        final /* synthetic */ Function0 onWarmupCompleted;

        public access000(Function0 function0, ComponentActivity componentActivity) {
            this.onWarmupCompleted = function0;
            this.onNavigationEvent = componentActivity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onWarmupCompleted;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onNavigationEvent.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    static final class asBinder implements Function1<SetDetectableSize, Unit> {
        final /* synthetic */ List<BERSequenceGenerator.IAuthTabCallback> onWarmupCompleted;

        asBinder(List<BERSequenceGenerator.IAuthTabCallback> list) {
            this.onWarmupCompleted = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback((SetDetectableSize) obj);
            return Unit.INSTANCE;
        }

        public final void IAuthTabCallback(SetDetectableSize setDetectableSize) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("accnt_cnt", Integer.valueOf(this.onWarmupCompleted.size()));
        }
    }

    static final class onTransact implements Function1<DialogInterface, Unit> {
        onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback((DialogInterface) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(DialogInterface dialogInterface) {
            AccountWithdrawAgreementSettingsActivity.this.finish();
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 103;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 43, 1450 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.getDefaultSize(0, 0)), Drawable.resolveOpacity(0, 0) + 44, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myPid() >> 22) + 50, 22939 - ExpandableListView.getPackedPositionGroup(0L), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45848), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 12577 - View.getDefaultSize(0, 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (access100 ^ 7798559133331975163L)) ^ ((int) (access000 ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallbackStubProxy ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 45;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 63;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 82 / 0;
            objArr[0] = str;
        }
    }

    static final class access100 implements Function1<SetDetectableSize, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Throwable onNavigationEvent;
        private static char[] IAuthTabCallback = {51240, 64978, 64991, 64986, 64982, 64990, 64980, 64967, 64960};
        private static char onWarmupCompleted = 51242;

        access100(Throwable th) {
            this.onNavigationEvent = th;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((SetDetectableSize) obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 10 / 0;
            }
            int i5 = onExtraCallbackWithResult + 11;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        public final void onExtraCallback(SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{6, 4, '\b', 1, 13884}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 61), ((Process.getThreadPriority(0) + 20) >> 6) + 5, objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), this.onNavigationEvent.onTransact());
            Object[] objArr2 = new Object[1];
            a(new char[]{3, 5, 13802, 13802, 0, 7, 13824}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 1), 7 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), this.onNavigationEvent.getMessage());
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = $11 + 125;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 26, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 26 - (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24823), 73 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            try {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), Color.alpha(0) + 30, 19487 - ImageFormat.getBitsPerPixel(0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i7 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i7];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                int i8 = $11 + 93;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                            } else {
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            int i14 = 0;
            while (i14 < i) {
                cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                i14++;
                int i15 = $11 + 85;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            objArr[0] = new String(cArr4);
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AccountWithdrawAgreementSettingsActivity.this.new onExtraCallbackWithResult(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                BERSequenceGenerator bERSequenceGeneratorOnExtraCallback = AccountWithdrawAgreementSettingsActivity.onExtraCallback(AccountWithdrawAgreementSettingsActivity.this);
                this.label = 1;
                if (bERSequenceGeneratorOnExtraCallback.IAuthTabCallback((access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(accountWithdrawAgreementSettingsActivity), (CoroutineContext) null, (setRandomHost) null, accountWithdrawAgreementSettingsActivity.new onExtraCallbackWithResult(null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        boolean z;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(menu, "");
            getMenuInflater().inflate(R.menu.menu_add_account, menu);
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(menu, "");
            getMenuInflater().inflate(R.menu.menu_add_account, menu);
            z = true;
        }
        int i3 = getInterfaceDescriptor + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    private static final Unit onWarmupCompleted(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, SetDetectableSize setDetectableSize) {
        int size;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        List list = (List) accountWithdrawAgreementSettingsActivity.setEngagementSignalsCallback().onWarmupCompleted().getValue();
        if (list != null) {
            size = list.size();
            int i4 = getInterfaceDescriptor + 53;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            size = 0;
        }
        setDetectableSize.onExtraCallback("accnt_cnt", Integer.valueOf(size));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != R.id.action_add_account) {
            return super.onOptionsItemSelected(menuItem);
        }
        ConvertByteArrayToFloatArray.onExtraCallback(1309971L, false, (String) null, (Map) null, new AccountWithdrawAgreementSettingsActivity$.ExternalSyntheticLambda0(this), 14, (Object) null);
        if (addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted) && (!addExtra.extraCallback(r0))) {
            int i4 = extraCallbackWithResult + 117;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallbackDefault.onNavigationEvent(AddAccountIntroActivity.Companion.IAuthTabCallback(this));
        } else {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            SessionTrackerb sessionTrackerb = (SessionTrackerb) onWarmupCompleted(233099347, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 564910384, iOnExtraCallback, new Object[]{this}, FormError.onNavigationEvent(), -233099346);
            IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.IAuthTabCallbackDefault;
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) + 65129), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, new char[]{15034, 42291, 53315, 60649, 25862, 26358, 49610, 1914, 7867, 41378, 22378, 61241, 44495, 49862, 46772, 20079, 23672, 13548, 34062, 18935, 19581, 65377, 33222, 15809, 51475, 24563, 58432, 40604, 38316, 37073, 28534, 63007, 62152, 52482, 31115, 62230, 13953, 48724, 17817, 4781, 28601, 16965, 17537, 47883, 44439, 26813, 20831, 62833, 31228, 52879, 44640, 54260, 5722, 38900, 36619, 6543, 62645, 12242, 34996, 30847, 51236, 19582, 676, 14529, 56662, 3989, 46426, 5801, 632, 4287, 23411, 45122, 24825, 46979, 52998, 17177, 26977, 37326, 17467, 60108}, new char[]{0, 0, 0, 0}, new char[]{23829, 26327, 38771, 49406}, objArr);
            SessionTrackerb.onNavigationEvent(sessionTrackerb, this, ((String) objArr[0]).intern(), iEngagementSignalsCallback_Parcel, (Bundle) null, 8, (Object) null);
            int i6 = getInterfaceDescriptor + 45;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LinearLayout IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppBarLayout appBarLayout = new AppBarLayout(context, (AttributeSet) null);
        appBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        appBarLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(appBarLayout.getContext(), im.toss.uikit.R.drawable.appbar_elevation_off));
        appBarLayout.setId(R.id.appBarLayout);
        Context context2 = appBarLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Toolbar toolbar = new Toolbar(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        toolbar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i2 = extraCallbackWithResult + 31;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(appBarLayout, toolbar);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, appBarLayout);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsResultV0View tdsResultV0View = new TdsResultV0View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsResultV0View.setLayoutParams(layoutParams);
        Object[] objArr = new Object[1];
        a((char) (62071 - ExpandableListView.getPackedPositionGroup(0L)), Color.rgb(0, 0, 0) - 855213477, new char[]{6887, 40797, 29424, 61666, 20203, 46257, 35638, 59282, 16849, 51252, 41435, 56103, 15368, 36727, 2944, 53524, 56155, 19655, 35082, 63289, 726, 25667, 57166, 11156, 51975, 11562, 34808, 57460, 8299, 19285, 41303, 21412, 57270, 41785, 14878, 139, 1292, 26970, 12940, 49737, 57209, 29629, 62064, 41960, 44219, 61194, 12067, 49966, 55391, 8064, 58883, 36300, 52150, 33204, 47991}, new char[]{0, 0, 0, 0}, new char[]{23362, 1658, 30668, 4338}, objArr);
        tdsResultV0View.setLottieImageFromUrl(((String) objArr[0]).intern());
        tdsResultV0View.setTitle(tdsResultV0View.getContext().getString(R.string.transfer_withdraw_agreement_settings_empty));
        tdsResultV0View.setVisibility(8);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsResultV0View);
        this.asInterface = tdsResultV0View;
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        TdsRecyclerView tdsRecyclerView = new TdsRecyclerView(context4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsRecyclerView.setLayoutManager(new LinearLayoutManager(tdsRecyclerView.getContext(), 1, false));
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = -1;
        layoutParams4.height = 0;
        layoutParams4.weight = 1.0f;
        tdsRecyclerView.setLayoutParams(layoutParams3);
        tdsRecyclerView.setClipToPadding(false);
        DisplayMetrics displayMetrics = tdsRecyclerView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        tdsRecyclerView.setPadding(tdsRecyclerView.getPaddingLeft(), tdsRecyclerView.getPaddingTop(), tdsRecyclerView.getPaddingRight(), varyMatches.onNavigationEvent(48, displayMetrics));
        tdsRecyclerView.setHasFixedSize(true);
        tdsRecyclerView.setAdapter(this.onTransact);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsRecyclerView);
        this.asBinder = tdsRecyclerView;
        int i4 = getInterfaceDescriptor + 65;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return linearLayout;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity = (AccountWithdrawAgreementSettingsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        accountWithdrawAgreementSettingsActivity.IAuthTabCallbackStub = null;
        int i5 = i3 + 93;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(BERSequenceGenerator.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.IAuthTabCallbackStub != null) {
                return;
            }
            ConfirmBottomSheet confirmBottomSheet = new ConfirmBottomSheet(this, iAuthTabCallback, new AccountWithdrawAgreementSettingsActivity$.ExternalSyntheticLambda2(this, iAuthTabCallback));
            this.IAuthTabCallbackStub = confirmBottomSheet;
            confirmBottomSheet.setOnDismissListener(new AccountWithdrawAgreementSettingsActivity$.ExternalSyntheticLambda3(this));
            confirmBottomSheet.show();
            int i3 = getInterfaceDescriptor + 97;
            extraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        super.onCreate(bundle);
        LinearLayout linearLayoutIAuthTabCallback = IAuthTabCallback();
        setContentView(linearLayoutIAuthTabCallback);
        disableImageViewPreallocationAndroid.onNavigationEvent(linearLayoutIAuthTabCallback, linearLayoutIAuthTabCallback.findViewById(R.id.appBarLayout), (View) null, (View) null, false, 14, (Object) null);
        setEngagementSignalsCallback().onWarmupCompleted().observe(this, new BaseActivity.receiveFile(new onExtraCallback()));
        setEngagementSignalsCallback().onNavigationEvent().observe(this, new BaseActivity.receiveFile(new onWarmupCompleted()));
        setEngagementSignalsCallback().onExtraCallback().observe(this, new BaseActivity.receiveFile(new asInterface()));
        setEngagementSignalsCallback().IAuthTabCallback().observe(this, new BaseActivity.receiveFile(new IAuthTabCallbackDefault()));
        setEngagementSignalsCallback().onExtraCallbackWithResult().observe(this, new BaseActivity.receiveFile(new IAuthTabCallbackStub()));
        int i2 = getInterfaceDescriptor + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements Function1<BERSequenceGenerator.onExtraCallbackWithResult, Unit> {
        public IAuthTabCallbackDefault() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context, viva.republica.toss.account.settings.withdrawagreement.AccountWithdrawAgreementSettingsActivity] */
        public final void IAuthTabCallback(BERSequenceGenerator.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
            BERSequenceGenerator.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
            if (onextracallbackwithresult2 instanceof BERSequenceGenerator.onExtraCallbackWithResult.onExtraCallback) {
                Throwable thOnExtraCallback = ((BERSequenceGenerator.onExtraCallbackWithResult.onExtraCallback) onextracallbackwithresult2).onExtraCallback();
                ?? r1 = AccountWithdrawAgreementSettingsActivity.this;
                getParamImp.onWarmupCompleted(thOnExtraCallback, (Context) r1, false, (initMiniApp) null, (Function0) null, new onTransact(), 14, (Object) null);
            } else {
                if (!(onextracallbackwithresult2 instanceof BERSequenceGenerator.onExtraCallbackWithResult.onWarmupCompleted) && !(onextracallbackwithresult2 instanceof BERSequenceGenerator.onExtraCallbackWithResult.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable thOnExtraCallback2 = onextracallbackwithresult2.onExtraCallback();
                if (thOnExtraCallback2 instanceof TossApiCallException.ApiError) {
                    ConvertByteArrayToFloatArray.onExtraCallback(1257033L, false, (String) null, (Map) null, new access100(thOnExtraCallback2), 14, (Object) null);
                }
                getParamImp.onWarmupCompleted(thOnExtraCallback2, AccountWithdrawAgreementSettingsActivity.this, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
            }
        }

        public /* synthetic */ Object invoke(Object obj) throws NoWhenBranchMatchedException {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<Boolean, Unit> {
        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Boolean bool) {
            if (bool.booleanValue()) {
                BaseActivity.IAuthTabCallback(AccountWithdrawAgreementSettingsActivity.this, (String) null, false, 3, (Object) null);
            } else {
                AccountWithdrawAgreementSettingsActivity.this.bo_();
            }
        }
    }

    public static final class asInterface implements Function1<Set<? extends BERSequenceGenerator.onExtraCallback>, Unit> {
        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Set<? extends BERSequenceGenerator.onExtraCallback> set) {
            Set<? extends BERSequenceGenerator.onExtraCallback> set2 = set;
            ConfirmBottomSheet confirmBottomSheetIAuthTabCallback = AccountWithdrawAgreementSettingsActivity.IAuthTabCallback(AccountWithdrawAgreementSettingsActivity.this);
            if (confirmBottomSheetIAuthTabCallback != null) {
                confirmBottomSheetIAuthTabCallback.onExtraCallback(set2.contains(BERSequenceGenerator.onExtraCallback.onNavigationEvent(confirmBottomSheetIAuthTabCallback.onExtraCallbackWithResult().onNavigationEvent())));
            }
        }
    }

    public static final class onExtraCallback implements Function1<List<? extends BERSequenceGenerator.IAuthTabCallback>, Unit> {
        public onExtraCallback() {
        }

        public final void IAuthTabCallback(List<? extends BERSequenceGenerator.IAuthTabCallback> list) {
            List<? extends BERSequenceGenerator.IAuthTabCallback> list2 = list;
            ConvertByteArrayToFloatArray.onExtraCallback(1257041L, false, (String) null, (Map) null, new asBinder(list2), 14, (Object) null);
            View viewOnNavigationEvent = AccountWithdrawAgreementSettingsActivity.onNavigationEvent(AccountWithdrawAgreementSettingsActivity.this);
            View view = null;
            if (viewOnNavigationEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewOnNavigationEvent = null;
            }
            viewOnNavigationEvent.setVisibility(!list2.isEmpty() ? 0 : 8);
            View viewOnWarmupCompleted = AccountWithdrawAgreementSettingsActivity.onWarmupCompleted(AccountWithdrawAgreementSettingsActivity.this);
            if (viewOnWarmupCompleted == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                view = viewOnWarmupCompleted;
            }
            view.setVisibility(list2.isEmpty() ? 0 : 8);
            AccountWithdrawAgreementSettingsActivity.onExtraCallbackWithResult(AccountWithdrawAgreementSettingsActivity.this).onExtraCallbackWithResult(CollectionsKt.plus(CollectionsKt.listOf(getWrite.IAuthTabCallback(AccountWithdrawAgreementSettingsActivity.this.getString(R.string.transfer_title_toss_transfer_and_payment_accounts_settings), AccountWithdrawAgreementSettingsActivity.this.getString(R.string.transfer_subtitle_toss_transfer_and_payment_accounts_settings))), list2));
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class onWarmupCompleted implements Function1<BERSequenceGenerator.onNavigationEvent, Unit> {
        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) throws NoWhenBranchMatchedException {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void onWarmupCompleted(BERSequenceGenerator.onNavigationEvent onnavigationevent) throws NoWhenBranchMatchedException {
            BERSequenceGenerator.onNavigationEvent onnavigationevent2 = onnavigationevent;
            if (onnavigationevent2 instanceof BERSequenceGenerator.onNavigationEvent.onExtraCallback) {
                AccountWithdrawAgreementSettingsActivity.onExtraCallback(AccountWithdrawAgreementSettingsActivity.this, ((BERSequenceGenerator.onNavigationEvent.onExtraCallback) onnavigationevent2).onExtraCallback());
                return;
            }
            if (!(onnavigationevent2 instanceof BERSequenceGenerator.onNavigationEvent.IAuthTabCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            getTypedExportedConstants gettypedexportedconstantsIAuthTabCallback = AccountWithdrawAgreementSettingsActivity.IAuthTabCallback(AccountWithdrawAgreementSettingsActivity.this);
            if (gettypedexportedconstantsIAuthTabCallback != null) {
                if (!BERSequenceGenerator.onExtraCallback.onExtraCallback(gettypedexportedconstantsIAuthTabCallback.onExtraCallbackWithResult().onNavigationEvent(), ((BERSequenceGenerator.onNavigationEvent.IAuthTabCallback) onnavigationevent2).onNavigationEvent().onNavigationEvent())) {
                    gettypedexportedconstantsIAuthTabCallback = null;
                }
                if (gettypedexportedconstantsIAuthTabCallback != null) {
                    gettypedexportedconstantsIAuthTabCallback.dismiss();
                }
            }
        }
    }

    private static final Unit IAuthTabCallback(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, BERSequenceGenerator.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        return (Unit) onWarmupCompleted(1264911865, iOnExtraCallback2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{accountWithdrawAgreementSettingsActivity, iAuthTabCallback}, iOnExtraCallback3, -1264911865);
    }

    private static final void onExtraCallbackWithResult(AccountWithdrawAgreementSettingsActivity accountWithdrawAgreementSettingsActivity, DialogInterface dialogInterface) {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        onWarmupCompleted(-1490778819, iOnExtraCallback2, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), iOnExtraCallback, new Object[]{accountWithdrawAgreementSettingsActivity, dialogInterface}, iOnExtraCallback3, 1490778821);
    }

    public final SessionTrackerb onNavigationEvent() {
        int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnNavigationEvent = FormError.onNavigationEvent();
        return (SessionTrackerb) onWarmupCompleted(233099347, iOnExtraCallback2, (-564910384) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7), iOnExtraCallback, new Object[]{this}, iOnNavigationEvent, -233099346);
    }

    @Override // viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 83;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = getInterfaceDescriptor + 101;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
    }

    @Override // viva.republica.toss.account.settings.withdrawagreement.Hilt_AccountWithdrawAgreementSettingsActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 5;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 49;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }
}
