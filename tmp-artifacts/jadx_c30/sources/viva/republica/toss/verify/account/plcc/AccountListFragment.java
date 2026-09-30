package viva.republica.toss.verify.account.plcc;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1T05View;
import im.toss.utils.RxUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import o.AppMsgReceiver2;
import o.AppNode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.ExoPlayerImplExternalSyntheticLambda31;
import o.GetCAPubs;
import o.PageContext;
import o.ParamUtils;
import o.PluginInfo;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.access502;
import o.access8100;
import o.addAllCommandLine;
import o.bindApp;
import o.checkDeviceBrand;
import o.checkNavigationBarBySystemProperties;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.exitAllPages;
import o.getAdService;
import o.getBacktraceNote;
import o.getByteBuffer;
import o.getParamImp;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.initMiniApp;
import o.overrideBySynchronousMountPropsAtMountingAndroid;
import o.parcelStartParams;
import o.preFillDefault;
import o.readIntokhttp;
import o.send;
import o.sendBroadcastWithAdObject;
import o.setVisitUrl;
import o.transparentBackground;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.databinding.RowCoinVerificationAccountListHeaderBinding;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;
import viva.republica.toss.verify.account.plcc.AccountListFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AccountListFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStub = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static char[] asBinder;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onNavigationEvent;
    private static int onTransact;
    private final onNavigationEvent IAuthTabCallback;
    private final PageContext IAuthTabCallbackDefault;
    private IAuthTabCallback asInterface;
    private final List<overrideBySynchronousMountPropsAtMountingAndroid> onExtraCallbackWithResult;
    private final List<checkNavigationBarBySystemProperties> onWarmupCompleted;

    public interface IAuthTabCallback {
    }

    static {
        onWarmupCompleted();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(AccountListFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentAccountListBinding;", 0)};
        Companion = new onWarmupCompleted(null);
        onNavigationEvent = 8;
        int i = access000 + 25;
        access100 = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AccountListFragment accountListFragment = (AccountListFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(accountListFragment);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onTransact + 17;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(AccountListFragment accountListFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountListFragment, th);
        int i4 = IAuthTabCallbackStub + 57;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = (~(i7 | i2)) | (~(i | i2));
        int i9 = i | i6;
        int i10 = (~(i6 | (~i2))) | (~(i7 | (~i))) | (~i9);
        int i11 = i + i2 + i5 + (1350191703 * i4) + ((-44904237) * i3);
        int i12 = i11 * i11;
        int i13 = ((i * (-560584373)) - 948043776) + ((-560584373) * i2) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i5) + ((-71041024) * i4) + ((-766246912) * i3) + (1339949056 * i12);
        int i14 = (i * 1657715387) + 2046152777 + (i2 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i5 * 1657716305) + (i4 * 1507858311) + (i3 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            final AccountListFragment accountListFragment = (AccountListFragment) objArr[0];
            final String str = (String) objArr[1];
            int i16 = 2 % 2;
            ConvertByteArrayToFloatArray.onWarmupCompleted("click_button", false, (String) null, (List) null, (Map) null, new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda8
                public final Object invoke(Object obj) {
                    return AccountListFragment.onExtraCallbackWithResult(this.f$0, str, (SetDetectableSize) obj);
                }
            }, 30, (Object) null);
            int i17 = IAuthTabCallbackStub + 57;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
            return null;
        }
        if (i15 == 3) {
            return onExtraCallback(objArr);
        }
        if (i15 == 4) {
            return onWarmupCompleted(objArr);
        }
        if (i15 == 5) {
            return onNavigationEvent(objArr);
        }
        AccountListFragment accountListFragment2 = (AccountListFragment) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallbackStub + 1;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) onExtraCallback(14703213, -14703209, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment2})).booleanValue();
        int i22 = IAuthTabCallbackStub + 17;
        onTransact = i22 % 128;
        int i23 = i22 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountListFragment accountListFragment, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountListFragment, str, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 89;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function1, obj);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        int i5 = IAuthTabCallbackStub + 77;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountListFragment accountListFragment, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(accountListFragment, view);
        }
        IAuthTabCallback(accountListFragment, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountListFragment accountListFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(accountListFragment, list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(accountListFragment, list);
        int i3 = onTransact + 73;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountListFragment accountListFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(accountListFragment, deserializeurinullablecollection);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(accountListFragment, deserializeurinullablecollection);
        int i3 = IAuthTabCallbackStub + 89;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public final class onNavigationEvent extends exitAllPages<Object> {
        private overrideBySynchronousMountPropsAtMountingAndroid onNavigationEvent;

        public static final class IAuthTabCallbackStub implements Function1<Object, Boolean> {
            public static final IAuthTabCallbackStub onExtraCallbackWithResult = new IAuthTabCallbackStub();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
                return Boolean.valueOf(obj instanceof C0014onNavigationEvent);
            }
        }

        public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
            public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
                return Boolean.valueOf(obj instanceof overrideBySynchronousMountPropsAtMountingAndroid);
            }
        }

        public static final class onExtraCallback implements getAdService {
            final /* synthetic */ Configuration IAuthTabCallback;

            public onExtraCallback(Configuration configuration) {
                this.IAuthTabCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class asBinder implements Function1<Object, Boolean> {
            public static final asBinder onNavigationEvent = new asBinder();

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, BuildConfig.FLAVOR);
                return Boolean.valueOf(obj instanceof onWarmupCompleted);
            }
        }

        public onNavigationEvent() {
            parcelStartParams.onNavigationEvent onnavigationevent = new parcelStartParams.onNavigationEvent();
            onnavigationevent.onExtraCallback(IAuthTabCallback.onExtraCallbackWithResult);
            onnavigationevent.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AccountListFragment.onNavigationEvent.onWarmupCompleted(accountListFragment, (AppNode) obj);
                }
            });
            if (onnavigationevent.onNavigationEvent() == null && onnavigationevent.IAuthTabCallback() == null) {
                onnavigationevent.onExtraCallbackWithResult(asBinder.onNavigationEvent);
            }
            onExtraCallbackWithResult(onnavigationevent.onExtraCallback());
            access502.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = new access502.onNavigationEvent().onExtraCallbackWithResult(onExtraCallbackWithResult.onExtraCallback);
            int i = R.layout.row_coin_verification_account_list_item;
            onExtraCallbackWithResult(onnavigationeventOnExtraCallbackWithResult.onNavigationEvent(i).onNavigationEvent(new getBacktraceNote() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AccountListFragment.onNavigationEvent.onExtraCallback(accountListFragment, this, (AppMsgReceiver2) obj, (overrideBySynchronousMountPropsAtMountingAndroid) obj2, (List) obj3);
                }
            }).IAuthTabCallback());
            onExtraCallbackWithResult(new access502.onNavigationEvent().onExtraCallbackWithResult(IAuthTabCallbackStub.onExtraCallbackWithResult).onNavigationEvent(i).onExtraCallback(new Function2() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountListFragment.onNavigationEvent.onWarmupCompleted(accountListFragment, (AppMsgReceiver2) obj, (AccountListFragment.onNavigationEvent.C0014onNavigationEvent) obj2);
                }
            }).IAuthTabCallback());
            ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted = CollectionsKt.emptyList();
        }

        public final overrideBySynchronousMountPropsAtMountingAndroid onNavigationEvent() {
            return this.onNavigationEvent;
        }

        public final void onExtraCallback(@Nullable overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid) {
            overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid2 = this.onNavigationEvent;
            this.onNavigationEvent = overridebysynchronousmountpropsatmountingandroid;
            if (overridebysynchronousmountpropsatmountingandroid2 != null) {
                onExtraCallbackWithResult(overridebysynchronousmountpropsatmountingandroid2);
            }
            if (overridebysynchronousmountpropsatmountingandroid != null) {
                onExtraCallbackWithResult(overridebysynchronousmountpropsatmountingandroid);
            }
        }

        static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements getBacktraceNote<LayoutInflater, ViewGroup, Boolean, RowCoinVerificationAccountListHeaderBinding> {
            public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

            IAuthTabCallback() {
                super(3, RowCoinVerificationAccountListHeaderBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lviva/republica/toss/databinding/RowCoinVerificationAccountListHeaderBinding;", 0);
            }

            public final RowCoinVerificationAccountListHeaderBinding IAuthTabCallback(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
                Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
                return RowCoinVerificationAccountListHeaderBinding.IAuthTabCallback(layoutInflater, viewGroup, z);
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return IAuthTabCallback((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }
        }

        public static Unit onWarmupCompleted(AccountListFragment accountListFragment, AppNode appNode) {
            Intrinsics.checkNotNullParameter(appNode, BuildConfig.FLAVOR);
            RowCoinVerificationAccountListHeaderBinding rowCoinVerificationAccountListHeaderBinding = (RowCoinVerificationAccountListHeaderBinding) appNode.onExtraCallbackWithResult();
            rowCoinVerificationAccountListHeaderBinding.onExtraCallback.setText(AccountListFragment.onTransact(accountListFragment));
            CharSequence charSequenceOnExtraCallbackWithResult = AccountListFragment.onExtraCallbackWithResult(accountListFragment);
            if (charSequenceOnExtraCallbackWithResult != null && charSequenceOnExtraCallbackWithResult.length() > 0) {
                TdsTopV1T05View tdsTopV1T05View = rowCoinVerificationAccountListHeaderBinding.onWarmupCompleted;
                tdsTopV1T05View.setText(AccountListFragment.onExtraCallbackWithResult(accountListFragment));
                Intrinsics.checkNotNull(tdsTopV1T05View);
                tdsTopV1T05View.setVisibility(0);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(AccountListFragment accountListFragment, final onNavigationEvent onnavigationevent, AppMsgReceiver2 appMsgReceiver2, final overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid, List list) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(overridebysynchronousmountpropsatmountingandroid, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            checkNavigationBarBySystemProperties checknavigationbarbysystempropertiesOnExtraCallback = bindApp.onExtraCallback(send.Companion.onWarmupCompleted(), AccountListFragment.onWarmupCompleted(accountListFragment), overridebysynchronousmountpropsatmountingandroid.IAuthTabCallback());
            String str = checknavigationbarbysystempropertiesOnExtraCallback.access000() + " " + overridebysynchronousmountpropsatmountingandroid.onNavigationEvent();
            tdsListRowV1View2.setCenterText1(overridebysynchronousmountpropsatmountingandroid.onExtraCallbackWithResult());
            tdsListRowV1View2.setCenterText2(str);
            BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy != null) {
                transparentBackground.onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), new Object[]{baseTextViewICustomTabsCallbackStubProxy, null, null, true, 3, null}, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -2039764647, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 2039764661, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
            }
            tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(checknavigationbarbysystempropertiesOnExtraCallback.IAuthTabCallback_Parcel()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 63, (DefaultConstructorMarker) null)}));
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View2.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setChecked(Intrinsics.areEqual(overridebysynchronousmountpropsatmountingandroid, onnavigationevent.onNavigationEvent));
            }
            getByteBuffer getbytebufferOnTransact = RxView.onNavigationEvent(tdsListRowV1View2).onTransact(1500L, TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda4
                public final Object invoke(Object obj) {
                    return AccountListFragment.onNavigationEvent.onExtraCallback(this.f$0, overridebysynchronousmountpropsatmountingandroid, (Unit) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getbytebufferOnTransact.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda5
                public final void accept(Object obj) {
                    AccountListFragment.onNavigationEvent.IAuthTabCallback(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, BuildConfig.FLAVOR);
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            AccountListFragment.onExtraCallback(394955614, -394955609, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{accountListFragment, deserializeurinullablecollectionIAuthTabCallback});
            return Unit.INSTANCE;
        }

        public static void IAuthTabCallback(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static Unit onExtraCallback(onNavigationEvent onnavigationevent, overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid, Unit unit) {
            onnavigationevent.onExtraCallback(overridebysynchronousmountpropsatmountingandroid);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onWarmupCompleted(final AccountListFragment accountListFragment, AppMsgReceiver2 appMsgReceiver2, C0014onNavigationEvent c0014onNavigationEvent) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, BuildConfig.FLAVOR);
            Intrinsics.checkNotNullParameter(c0014onNavigationEvent, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNull(tdsListRowV1View, BuildConfig.FLAVOR);
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
            RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(Integer.valueOf(im.toss.core.R.drawable.icn_add));
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
            tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, Integer.valueOf(new getUrlokhttp(new onExtraCallback(configuration)).extraCallback()), 15, (DefaultConstructorMarker) null)}));
            tdsListRowV1View2.setCenterText1(accountListFragment.getString(R.string.app_verify_account_plcc___fe68ebb330));
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.NONE);
            Object[] objArr = {tdsListRowV1View2, ParamUtils.NORMAL, new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$AccountListAdapter$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return AccountListFragment.onNavigationEvent.onNavigationEvent(accountListFragment, (View) obj);
                }
            }};
            deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) transparentBackground.onWarmupCompleted(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -1385263125, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 1385263142, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted());
            if (deserializeurinullablecollection != null) {
                int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
                AccountListFragment.onExtraCallback(394955614, -394955609, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment, deserializeurinullablecollection});
            }
            return Unit.INSTANCE;
        }

        public static Unit onNavigationEvent(AccountListFragment accountListFragment, View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            if (AccountListFragment.IAuthTabCallback(accountListFragment) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            }
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            AccountListFragment.onExtraCallback(571926099, -571926096, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment, "other_account"});
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(@NotNull List<overrideBySynchronousMountPropsAtMountingAndroid> list) {
            Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
            ArrayList arrayList = new ArrayList();
            AccountListFragment accountListFragment = AccountListFragment.this;
            arrayList.add(new onWarmupCompleted());
            arrayList.addAll(list);
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            if (((Boolean) AccountListFragment.onExtraCallback(-1071371324, 1071371324, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment})).booleanValue()) {
                arrayList.add(new C0014onNavigationEvent());
            }
            ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted = arrayList;
            overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid = this.onNavigationEvent;
            if (overridebysynchronousmountpropsatmountingandroid == null || !list.contains(overridebysynchronousmountpropsatmountingandroid)) {
                onExtraCallback((overrideBySynchronousMountPropsAtMountingAndroid) CollectionsKt.firstOrNull(list));
            }
        }

        private final void onExtraCallbackWithResult(overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroid) {
            Integer numValueOf = Integer.valueOf(((List) ((ExoPlayerImplExternalSyntheticLambda31) this).onWarmupCompleted).indexOf(overridebysynchronousmountpropsatmountingandroid));
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                notifyItemChanged(numValueOf.intValue(), "selectionChanged");
            }
        }

        public final class onWarmupCompleted {
            public onWarmupCompleted() {
            }
        }

        /* renamed from: viva.republica.toss.verify.account.plcc.AccountListFragment$onNavigationEvent$onNavigationEvent, reason: collision with other inner class name */
        public final class C0014onNavigationEvent {
            public C0014onNavigationEvent() {
            }
        }
    }

    public AccountListFragment() {
        super(R.layout.fragment_account_list);
        this.IAuthTabCallbackDefault = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onWarmupCompleted);
        this.IAuthTabCallback = new onNavigationEvent();
        this.onExtraCallbackWithResult = new ArrayList();
        this.onWarmupCompleted = new ArrayList();
    }

    public static final /* synthetic */ IAuthTabCallback IAuthTabCallback(AccountListFragment accountListFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 65;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        IAuthTabCallback iAuthTabCallback = accountListFragment.asInterface;
        int i5 = i3 + 73;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return iAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountListFragment accountListFragment = (AccountListFragment) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {accountListFragment, str};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
        if (i3 == 0) {
            onExtraCallback(-409034159, 409034161, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr2);
            throw null;
        }
        onExtraCallback(-409034159, 409034161, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr2);
        int i4 = IAuthTabCallbackStub + 61;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return null;
    }

    public static final /* synthetic */ CharSequence onExtraCallbackWithResult(AccountListFragment accountListFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            accountListFragment.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CharSequence charSequenceOnNavigationEvent = accountListFragment.onNavigationEvent();
        int i3 = onTransact + 17;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AccountListFragment accountListFragment = (AccountListFragment) objArr[0];
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 87;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        accountListFragment.autoDisposable(deserializeurinullablecollection);
        int i4 = IAuthTabCallbackStub + 91;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ CharSequence onTransact(AccountListFragment accountListFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return accountListFragment.onExtraCallback();
        }
        accountListFragment.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onWarmupCompleted(AccountListFragment accountListFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        List<checkNavigationBarBySystemProperties> list = accountListFragment.onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return list;
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, GetCAPubs> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
            super(1, GetCAPubs.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentAccountListBinding;", 0);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final GetCAPubs invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return GetCAPubs.onExtraCallback(view);
        }
    }

    private final GetCAPubs onExtraCallbackWithResult() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.IAuthTabCallbackDefault;
            addallcommandline = onExtraCallback[0];
        } else {
            pageContext = this.IAuthTabCallbackDefault;
            addallcommandline = onExtraCallback[0];
        }
        GetCAPubs getCAPubs = (GetCAPubs) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = IAuthTabCallbackStub + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return getCAPubs;
    }

    private final CharSequence onExtraCallback() throws Throwable {
        String string;
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            string = getString(R.string.app_verify_account_plcc___79ff8a0081);
            Object[] objArr = new Object[1];
            a(new int[]{0, 11, 21, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1}, objArr);
            obj = objArr[0];
        } else {
            string = getString(R.string.app_verify_account_plcc___79ff8a0081);
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 11, 21, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1}, objArr2);
            obj = objArr2[0];
        }
        return arguments.getCharSequence(((String) obj).intern(), string);
    }

    private final CharSequence onNavigationEvent() {
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments == null) {
            int i2 = onTransact + 15;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        CharSequence charSequence = arguments.getCharSequence("extra_description");
        int i4 = IAuthTabCallbackStub + 97;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return charSequence;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        AccountListFragment accountListFragment = (AccountListFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = accountListFragment.getArguments();
        if (arguments == null) {
            return true;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        boolean z = arguments.getBoolean("extra_other_account_available", true);
        int i6 = IAuthTabCallbackStub + 75;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, BuildConfig.FLAVOR);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_account_list, viewGroup, false);
        int i4 = IAuthTabCallbackStub + 17;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    private static final Unit IAuthTabCallback(AccountListFragment accountListFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        overrideBySynchronousMountPropsAtMountingAndroid overridebysynchronousmountpropsatmountingandroidOnNavigationEvent = accountListFragment.IAuthTabCallback.onNavigationEvent();
        if (overridebysynchronousmountpropsatmountingandroidOnNavigationEvent != null) {
            if (accountListFragment.asInterface == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
            }
            Object[] objArr = {accountListFragment, overridebysynchronousmountpropsatmountingandroidOnNavigationEvent.IAuthTabCallback()};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            onExtraCallback(-409034159, 409034161, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr);
            return Unit.INSTANCE;
        }
        int i2 = onTransact + 101;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 77;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit IAuthTabCallback(AccountListFragment accountListFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        BaseFragment.showProgressDialog$default(accountListFragment, (String) null, false, 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 7;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 117;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(AccountListFragment accountListFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        accountListFragment.dismissProgressDialog();
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 27;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(AccountListFragment accountListFragment, List list) {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            accountListFragment.onWarmupCompleted.clear();
            List<checkNavigationBarBySystemProperties> list2 = accountListFragment.onWarmupCompleted;
            Intrinsics.checkNotNull(list);
            list2.addAll(list);
            accountListFragment.onTransact();
            return Unit.INSTANCE;
        }
        accountListFragment.onWarmupCompleted.clear();
        List<checkNavigationBarBySystemProperties> list3 = accountListFragment.onWarmupCompleted;
        Intrinsics.checkNotNull(list);
        list3.addAll(list);
        accountListFragment.onTransact();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(AccountListFragment accountListFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, accountListFragment.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 93;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        List listEmptyList;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        this.onExtraCallbackWithResult.clear();
        List<overrideBySynchronousMountPropsAtMountingAndroid> list = this.onExtraCallbackWithResult;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = IAuthTabCallbackStub + 85;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            listEmptyList = arguments.getParcelableArrayList("extra_account_list");
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
                int i6 = IAuthTabCallbackStub + 35;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        list.addAll(listEmptyList);
        TdsBottomCtaV1View tdsBottomCtaV1View = onExtraCallbackWithResult().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, BuildConfig.FLAVOR);
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return AccountListFragment.onNavigationEvent(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        writeRaw writerawIAuthTabCallback = send.IAuthTabCallback(send.Companion.onWarmupCompleted(), false, (String) null, checkDeviceBrand.ALL, 3, (Object) null).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, BuildConfig.FLAVOR);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return AccountListFragment.onNavigationEvent(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda2
            public final void accept(Object obj) {
                AccountListFragment.onExtraCallbackWithResult(function1, obj);
            }
        }).onWarmupCompleted(new deserializeDecimalCollection() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda3
            public final void run() {
                Object[] objArr = {this.f$0};
                int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
                AccountListFragment.onExtraCallback(-1709949407, 1709949408, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, objArr);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return AccountListFragment.onNavigationEvent(this.f$0, (List) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda5
            public final void accept(Object obj) {
                AccountListFragment.IAuthTabCallback(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return AccountListFragment.IAuthTabCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.verify.account.plcc.AccountListFragment$$ExternalSyntheticLambda7
            public final void accept(Object obj) {
                AccountListFragment.onExtraCallback(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, BuildConfig.FLAVOR);
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
    }

    private final void onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult);
            onExtraCallbackWithResult().onNavigationEvent.setAdapter(this.IAuthTabCallback);
        } else {
            this.IAuthTabCallback.onExtraCallback(this.onExtraCallbackWithResult);
            onExtraCallbackWithResult().onNavigationEvent.setAdapter(this.IAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit onExtraCallback(AccountListFragment accountListFragment, String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, BuildConfig.FLAVOR);
        setDetectableSize.onExtraCallback().put("category", sendBroadcastWithAdObject.COMMON);
        setDetectableSize.onExtraCallback().put("view", accountListFragment.getScreenName());
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new int[]{11, 6, 0, 0}, false, new byte[]{0, 1, 1, 0, 1, 1}, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), "select_account");
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a(new int[]{17, 5, 54, 0}, false, new byte[]{0, 1, 1, 1, 0}, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 63;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i4 = onTransact + 37;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            String string = arguments.getString("extra_screen_name");
            if (string != null) {
                int i6 = onTransact + 25;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 84 / 0;
                }
                return string;
            }
        }
        int i8 = IAuthTabCallbackStub + 39;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 75 / 0;
        }
        return "password_setting";
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = onTransact + 41;
        IAuthTabCallbackStub = i2 % 128;
        return i2 % 2 == 0 ? access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("status", "account_list"), getWrite.IAuthTabCallback("category", "common")}) : access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("category", "common"), getWrite.IAuthTabCallback("status", "account_list")});
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = asBinder;
        if (cArr2 != null) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 35283), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 35, (Process.myPid() >> 22) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 25;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10935), Gravity.getAbsoluteGravity(0, 0) + 65, 16718 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 29, 17657 - Color.alpha(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i12 = $11 + 81;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 4 / 4;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 49467), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 70, View.MeasureSpec.getSize(0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $10 + 5;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 29;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        super.onAttach(context);
        boolean z = !(context instanceof IAuthTabCallback);
        Object obj = context;
        if (z) {
            if (!(getParentFragment() instanceof IAuthTabCallback)) {
                throw new IllegalStateException("Must implement callback from parent Activity or Fragment");
            }
            int i2 = onTransact + 67;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback parentFragment = getParentFragment();
            if (parentFragment == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.verify.account.plcc.AccountListFragment.Callback");
            }
            int i4 = onTransact;
            int i5 = i4 + 57;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 49;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            obj = parentFragment;
        }
        this.asInterface = (IAuthTabCallback) obj;
    }

    public static /* synthetic */ void onNavigationEvent(AccountListFragment accountListFragment) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallback(-1709949407, 1709949408, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment});
    }

    public static final /* synthetic */ void onExtraCallback(AccountListFragment accountListFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallback(394955614, -394955609, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment, deserializeurinullablecollection});
    }

    public static final /* synthetic */ boolean onExtraCallback(AccountListFragment accountListFragment) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-1071371324, 1071371324, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment})).booleanValue();
    }

    public static final /* synthetic */ void IAuthTabCallback(AccountListFragment accountListFragment, String str) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallback(571926099, -571926096, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{accountListFragment, str});
    }

    private final boolean IAuthTabCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(14703213, -14703209, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this})).booleanValue();
    }

    private final void onWarmupCompleted(String str) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        onExtraCallback(-409034159, 409034161, setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this, str});
    }

    static void onWarmupCompleted() {
        asBinder = new char[]{27251, 27341, 27333, 27334, 27184, 27195, 27184, 27341, 27341, 27339, 27187, 27263, 27173, 27194, 27194, 27199, 27168, 27160, 27375, 27346, 27368, 27373};
    }
}
