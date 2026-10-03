package viva.republica.toss.account.notification.join;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.base.BaseActivity;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.ASN1OutputStream;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AppMsgReceiver2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GetSymmAlgorithm;
import o.PageContext;
import o.PluginInfo;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SearchBarKtExternalSyntheticLambda5;
import o.SetDetectableSize;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.VideoStartReason;
import o.access502;
import o.addAllCommandLine;
import o.exitAllPages;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.initMiniApp;
import o.logAndOpenStore;
import o.preFillDefault;
import o.readIntokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationJoinCompleteFragment extends BaseFragment {
    public static final int IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static int IAuthTabCallback_Parcel;
    private static char asInterface;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static long onTransact;
    private final PageContext onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onExtraCallbackWithResult.onExtraCallbackWithResult);
    private final Lazy onNavigationEvent = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(ASN1OutputStream.class), new IAuthTabCallbackStub(this), new IAuthTabCallbackStubProxy(null, this), new access100(this));
    private final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted(this);
    private static final byte[] $$a = {11, -55, -20, -91};
    private static final int $$b = 127;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access000 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, short r7) {
        /*
            int r5 = 110 - r5
            byte[] r0 = viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.$$c(short, short, short):java.lang.String");
    }

    static {
        IAuthTabCallback_Parcel = 0;
        onWarmupCompleted();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(AccountNotificationJoinCompleteFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentAccountNotificationJoinCompleteBinding;", 0)};
        IAuthTabCallback = 8;
        int i = access000 + 111;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(accountNotificationJoinCompleteFragment, view);
        int i4 = IAuthTabCallbackStub + 101;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i7 | i4;
        int i9 = ~i8;
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i4));
        int i12 = i8 | i10;
        int i13 = (~(i6 | i4)) | (~(i7 | (~i4)));
        int i14 = i4 + i5 + i + ((-1311665080) * i3) + (1761575915 * i2);
        int i15 = i14 * i14;
        int i16 = ((-2073022045) * i4) + 412680192 + (1917570655 * i5) + (i11 * (-1995296350)) + (1995296350 * i12) + ((-1995296350) * i13) + ((-77725696) * i) + (175112192 * i3) + ((-649461760) * i2) + (1783169024 * i15);
        int i17 = ((i4 * 1226044109) - 1701849991) + (i5 * 1226043089) + (i11 * 510) + (i12 * (-510)) + (i13 * 510) + (i * 1226043599) + (i3 * (-858626504)) + (i2 * 1069087493) + (i15 * 1627848704);
        int i18 = i16 + (i17 * i17 * 739704832);
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment = (AccountNotificationJoinCompleteFragment) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallbackStub + 57;
        asBinder = i20 % 128;
        int i21 = i20 % 2;
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = accountNotificationJoinCompleteFragment.onExtraCallbackWithResult.onExtraCallbackWithResult(accountNotificationJoinCompleteFragment, onExtraCallback[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        GetSymmAlgorithm getSymmAlgorithm = (GetSymmAlgorithm) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        int i22 = asBinder + 97;
        IAuthTabCallbackStub = i22 % 128;
        int i23 = i22 % 2;
        return getSymmAlgorithm;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment = (AccountNotificationJoinCompleteFragment) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountNotificationJoinCompleteFragment, setDetectableSize);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallback(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(gettypedexportedconstants, view);
        int i4 = IAuthTabCallbackStub + 73;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{accountNotificationJoinCompleteFragment, view}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1487625562, 1487625564, iOnExtraCallback);
        int i4 = asBinder + 11;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(accountNotificationJoinCompleteFragment, setDetectableSize);
        int i4 = IAuthTabCallbackStub + 61;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    public static final class onWarmupCompleted extends exitAllPages<Object> {

        public static final class IAuthTabCallback implements getAdService {
            final /* synthetic */ Configuration onExtraCallback;

            public IAuthTabCallback(Configuration configuration) {
                this.onExtraCallback = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class onExtraCallbackWithResult implements getAdService {
            final /* synthetic */ Configuration onNavigationEvent;

            public onExtraCallbackWithResult(Configuration configuration) {
                this.onNavigationEvent = configuration;
            }

            public final getSpecialFeatureOptInStatus onExtraCallback() {
                return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
            }
        }

        public static final class IAuthTabCallbackDefault implements Function1<Object, Boolean> {
            public static final IAuthTabCallbackDefault onNavigationEvent = new IAuthTabCallbackDefault();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onNavigationEvent);
            }
        }

        public static final class onExtraCallback implements Function1<Object, Boolean> {
            public static final onExtraCallback onNavigationEvent = new onExtraCallback();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof VideoStartReason);
            }
        }

        public static final class onNavigationEvent implements Function1<Object, Boolean> {
            public static final onNavigationEvent onWarmupCompleted = new onNavigationEvent();

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof onExtraCallback);
            }
        }

        /* renamed from: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0019onWarmupCompleted implements Function1<Object, Boolean> {
            public static final C0019onWarmupCompleted onWarmupCompleted = new C0019onWarmupCompleted();

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                Intrinsics.checkNotNullParameter(obj, "");
                return Boolean.valueOf(obj instanceof IAuthTabCallback);
            }
        }

        onWarmupCompleted(final AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment) {
            access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
            onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onNavigationEvent((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onExtraCallbackWithResult(accountNotificationJoinCompleteFragment, (AppMsgReceiver2) obj, (VideoStartReason) obj2);
                }
            });
            if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
                onextracallbackwithresult.onExtraCallback(onExtraCallback.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult2.onWarmupCompleted(R.layout.item_tds_top_v1);
            onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda2
                public final Object invoke(Object obj) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onWarmupCompleted((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onNavigationEvent((AppMsgReceiver2) obj, (AccountNotificationJoinCompleteFragment.onExtraCallback) obj2);
                }
            });
            if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
                onextracallbackwithresult2.onExtraCallback(onNavigationEvent.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult2.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult3.onWarmupCompleted(R.layout.item_space);
            onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.IAuthTabCallback(accountNotificationJoinCompleteFragment, (AppMsgReceiver2) obj, (AccountNotificationJoinCompleteFragment.IAuthTabCallback) obj2);
                }
            });
            if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
                onextracallbackwithresult3.onExtraCallback(C0019onWarmupCompleted.onWarmupCompleted);
            }
            onExtraCallbackWithResult(onextracallbackwithresult3.onExtraCallbackWithResult());
            access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
            onextracallbackwithresult4.onWarmupCompleted(R.layout.item_lottie);
            onextracallbackwithresult4.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
                }
            });
            onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$adapter$1$$ExternalSyntheticLambda6
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNotificationJoinCompleteFragment.onWarmupCompleted.onNavigationEvent((AppMsgReceiver2) obj, (AccountNotificationJoinCompleteFragment.onNavigationEvent) obj2);
                }
            });
            if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
                onextracallbackwithresult4.onExtraCallback(IAuthTabCallbackDefault.onNavigationEvent);
            }
            onExtraCallbackWithResult(onextracallbackwithresult4.onExtraCallbackWithResult());
        }

        public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
            if (tdsListRowV1View2 != null) {
                tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A);
                Context context = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListRowV1View2.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ICustomTabsCallbackStubProxy());
                Context context2 = tdsListRowV1View2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Configuration configuration2 = context2.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                tdsListRowV1View2.setCenterText2Color(new getUrlokhttp(new IAuthTabCallback(configuration2)).onPostMessage());
            }
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallbackWithResult(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, AppMsgReceiver2 appMsgReceiver2, VideoStartReason videoStartReason) {
            String strOnExtraCallback;
            String str = "";
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(videoStartReason, "");
            TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Object obj = null;
            TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View instanceof TdsListRowV1View ? tdsListRowV1View : null;
            if (tdsListRowV1View2 != null) {
                List<VideoStartReason> listOnWarmupCompleted = AccountNotificationJoinCompleteFragment.IAuthTabCallback(accountNotificationJoinCompleteFragment).onWarmupCompleted();
                if (listOnWarmupCompleted != null) {
                    Iterator<T> it = listOnWarmupCompleted.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((VideoStartReason) next).onWarmupCompleted(), videoStartReason.onWarmupCompleted())) {
                            obj = next;
                            break;
                        }
                    }
                    VideoStartReason videoStartReason2 = (VideoStartReason) obj;
                    if (videoStartReason2 != null && (strOnExtraCallback = videoStartReason2.onExtraCallback()) != null) {
                        str = strOnExtraCallback;
                    }
                }
                tdsListRowV1View2.setCenterText1(str);
                tdsListRowV1View2.setCenterText2(videoStartReason.onWarmupCompleted());
                tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(AccountNotificationJoinCompleteFragment.IAuthTabCallback(accountNotificationJoinCompleteFragment).access000()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(88.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)}));
            }
            return Unit.INSTANCE;
        }

        public static Unit onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            TdsTopV1View tdsTopV1View = viewHolder.onNavigationEvent;
            TdsTopV1View tdsTopV1View2 = tdsTopV1View instanceof TdsTopV1View ? tdsTopV1View : null;
            if (tdsTopV1View2 != null) {
                tdsTopV1View2.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
                tdsTopV1View2.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
            }
            return Unit.INSTANCE;
        }

        public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            TdsTopV1View tdsTopV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            TdsTopV1View tdsTopV1View2 = tdsTopV1View instanceof TdsTopV1View ? tdsTopV1View : null;
            if (tdsTopV1View2 != null) {
                tdsTopV1View2.setUpperText(onextracallback.onExtraCallback());
                tdsTopV1View2.setLowerText(onextracallback.IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }

        public static Unit IAuthTabCallback(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, AppMsgReceiver2 appMsgReceiver2, IAuthTabCallback iAuthTabCallback) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            View view = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
            Intrinsics.checkNotNull(layoutParams);
            float fOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
            DisplayMetrics displayMetrics = accountNotificationJoinCompleteFragment.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            layoutParams.height = varyMatches.onNavigationEvent(Float.valueOf(fOnWarmupCompleted), displayMetrics);
            view.setLayoutParams(layoutParams);
            return Unit.INSTANCE;
        }

        public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            LottieAnimationView lottieAnimationView = viewHolder.onNavigationEvent;
            LottieAnimationView lottieAnimationView2 = lottieAnimationView instanceof LottieAnimationView ? lottieAnimationView : null;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setRepeatCount(0);
                Class cls = Integer.TYPE;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
                Intrinsics.checkNotNull(layoutParams);
                DisplayMetrics displayMetrics = lottieAnimationView2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                layoutParams.height = varyMatches.onNavigationEvent(111, displayMetrics);
                lottieAnimationView2.setLayoutParams(layoutParams);
            }
            return Unit.INSTANCE;
        }

        public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent) {
            Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            LottieAnimationView lottieAnimationView = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
            LottieAnimationView lottieAnimationView2 = lottieAnimationView instanceof LottieAnimationView ? lottieAnimationView : null;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setAnimationFromUrl(onnavigationevent.IAuthTabCallback());
                lottieAnimationView2.playAnimation();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public asBinder(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public asInterface(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        public static final onTransact IAuthTabCallback = new onTransact();

        public final void onExtraCallbackWithResult(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((initMiniApp.onWarmupCompleted) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ ASN1OutputStream IAuthTabCallback(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 85;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ASN1OutputStream aSN1OutputStreamIAuthTabCallbackStub = accountNotificationJoinCompleteFragment.IAuthTabCallbackStub();
        int i4 = IAuthTabCallbackStub + 117;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return aSN1OutputStreamIAuthTabCallbackStub;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, GetSymmAlgorithm> {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, GetSymmAlgorithm.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentAccountNotificationJoinCompleteBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final GetSymmAlgorithm invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return GetSymmAlgorithm.onWarmupCompleted(view);
        }
    }

    private final RecyclerView onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        RecyclerView recyclerView = ((GetSymmAlgorithm) onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 966044125, -966044125, iOnExtraCallback)).onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        int i4 = IAuthTabCallbackStub + 61;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return recyclerView;
    }

    private final TdsListRowV1View onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(((GetSymmAlgorithm) onExtraCallback(iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, 966044125, -966044125, iOnExtraCallback)).IAuthTabCallback, "");
            throw null;
        }
        TdsListRowV1View tdsListRowV1View = ((GetSymmAlgorithm) onExtraCallback(iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, 966044125, -966044125, iOnExtraCallback)).IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        int i4 = IAuthTabCallbackStub + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return tdsListRowV1View;
    }

    private final TdsBottomCtaV1View onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        if (i3 == 0) {
            Intrinsics.checkNotNullExpressionValue(((GetSymmAlgorithm) onExtraCallback(iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, 966044125, -966044125, iOnExtraCallback)).onExtraCallbackWithResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsBottomCtaV1View tdsBottomCtaV1View = ((GetSymmAlgorithm) onExtraCallback(iOnExtraCallback2, objArr, iOnExtraCallback4, iOnExtraCallback3, 966044125, -966044125, iOnExtraCallback)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        int i4 = asBinder + 49;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return tdsBottomCtaV1View;
    }

    private final ASN1OutputStream IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ASN1OutputStream aSN1OutputStream = (ASN1OutputStream) this.onNavigationEvent.getValue();
        int i4 = asBinder + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return aSN1OutputStream;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_account_notification_join_complete, viewGroup, false);
        int i4 = IAuthTabCallbackStub + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return viewInflate;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onTransact();
        int i4 = IAuthTabCallbackStub + 53;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), Color.green(0), new char[]{58149, 2639, 58244, 63567, 8819, 24245, 14817, 23777}, new char[]{0, 0, 0, 0}, new char[]{13174, 5005, 32507, 23396}, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), accountNotificationJoinCompleteFragment.IAuthTabCallbackStub().getInterfaceDescriptor());
        setDetectableSize.onExtraCallback("bank_name", accountNotificationJoinCompleteFragment.IAuthTabCallbackStub().onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 121;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            accountNotificationJoinCompleteFragment.IAuthTabCallbackStub().asInterface();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        List<VideoStartReason> listAsInterface = accountNotificationJoinCompleteFragment.IAuthTabCallbackStub().asInterface();
        int size = 0;
        if (listAsInterface != null) {
            int i3 = asBinder + 39;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 61 / 0;
                size = listAsInterface.size();
            } else {
                size = listAsInterface.size();
            }
        }
        setDetectableSize.onExtraCallback("account_cnt", Integer.valueOf(size));
        return Unit.INSTANCE;
    }

    private static final void onExtraCallbackWithResult(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1009659L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        accountNotificationJoinCompleteFragment.asInterface();
        int i4 = IAuthTabCallbackStub + 29;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onTransact() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.onTransact():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r22) {
        /*
            r0 = 0
            r1 = r22[r0]
            viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment r1 = (viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment) r1
            r2 = 1
            r2 = r22[r2]
            android.view.View r2 = (android.view.View) r2
            r2 = 2
            int r3 = r2 % r2
            int r3 = viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.asBinder
            r4 = 3
            int r3 = r3 + r4
            int r5 = r3 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.IAuthTabCallbackStub = r5
            int r3 = r3 % r2
            r5 = 1007939(0xf6143, double:4.97988E-318)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 30
            r12 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r5, r7, r8, r9, r10, r11, r12)
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            r5 = -1
            r3.setResult(r5)
            o.ASN1OutputStream r5 = r1.IAuthTabCallbackStub()
            java.lang.String r5 = r5.IAuthTabCallback_Parcel()
            if (r5 == 0) goto L69
            int r6 = viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.IAuthTabCallbackStub
            int r6 = r6 + 33
            int r7 = r6 % 128
            viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.asBinder = r7
            int r6 = r6 % r2
            if (r6 != 0) goto L48
            boolean r2 = kotlin.text.StringsKt.isBlank(r5)
            int r4 = r4 / r0
            if (r2 != 0) goto L69
            goto L4f
        L48:
            boolean r0 = kotlin.text.StringsKt.isBlank(r5)
            if (r0 == 0) goto L4f
            goto L69
        L4f:
            o.resumeForClick r13 = o.resumeForClick.asBinder
            o.ASN1OutputStream r0 = r1.IAuthTabCallbackStub()
            java.lang.String r15 = r0.IAuthTabCallback_Parcel()
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 60
            r21 = 0
            r14 = r3
            o.SessionTrackerb.IAuthTabCallback(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L69:
            r3.finish()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
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
            int i3 = $10 + 67;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, 1451 - View.getDefaultSize(0, 0), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char cIndexOf = (char) (49123 - TextUtils.indexOf("", ""));
                    int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1495;
                    byte b3 = (byte) ($$b & 1);
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, i5, iIndexOf, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23971), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, (KeyEvent.getMaxKeyCode() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.keyCodeFromString("") + 45848), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 12577 - Color.red(0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onTransact ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallbackDefault ^ 7798559133331975163L))) ^ ((char) (asInterface ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $11 + 43;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final void onNavigationEvent(getTypedExportedConstants gettypedexportedconstants, View view) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        gettypedexportedconstants.dismiss();
        int i4 = IAuthTabCallbackStub + 95;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void asInterface() {
        Iterator it;
        int i = 2 % 2;
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        onTransact ontransact = onTransact.IAuthTabCallback;
        logAndOpenStore.IAuthTabCallback(baseActivityRequireBaseActivity, (Long) null);
        final getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(baseActivityRequireBaseActivity, 0, false, false, -1L, ontransact, 14, (DefaultConstructorMarker) null);
        gettypedexportedconstants.IAuthTabCallback(true);
        gettypedexportedconstants.getBehavior().setDraggable(false);
        Context context = gettypedexportedconstants.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(getString(R.string.app_account_notification_join___0d02c0154b));
        bottomSheetHeader.setDescription(IAuthTabCallbackStub().IAuthTabCallbackDefault());
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, bottomSheetHeader);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        List<VideoStartReason> listAsInterface = IAuthTabCallbackStub().asInterface();
        if (listAsInterface != null) {
            int i2 = IAuthTabCallbackStub + 119;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                it = listAsInterface.iterator();
                int i3 = 64 / 0;
            } else {
                it = listAsInterface.iterator();
            }
            while (it.hasNext()) {
                VideoStartReason videoStartReason = (VideoStartReason) it.next();
                Context context5 = linearLayout2.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context5, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                tdsListRowV1View.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View.getContext()).onExtraCallback(IAuthTabCallbackStub().access000()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(88.0f, 0.0f, 0.0f, (Integer) null, 0, (Integer) null, 60, (DefaultConstructorMarker) null)}));
                tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW3A);
                Context context6 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                Configuration configuration = context6.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).ICustomTabsCallbackStubProxy());
                Context context7 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                Configuration configuration2 = context7.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration2, "");
                tdsListRowV1View.setCenterText2Color(new getUrlokhttp(new asBinder(configuration2)).onPostMessage());
                Context context8 = tdsListRowV1View.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                Configuration configuration3 = context8.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration3, "");
                tdsListRowV1View.setCenterText3Color(new getUrlokhttp(new asInterface(configuration3)).requestPostMessageChannel().IEngagementSignalsCallback());
                String strOnExtraCallback = videoStartReason.onExtraCallback();
                if (strOnExtraCallback == null || strOnExtraCallback.length() == 0) {
                    tdsListRowV1View.setCenterText1(videoStartReason.onWarmupCompleted());
                } else {
                    tdsListRowV1View.setCenterText1(videoStartReason.onExtraCallback());
                    tdsListRowV1View.setCenterText2(videoStartReason.onWarmupCompleted());
                    int i4 = asBinder + 45;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 % 3;
                    }
                }
                String strAsBinder = videoStartReason.asBinder();
                if (strAsBinder == null) {
                    int i6 = asBinder + 37;
                    IAuthTabCallbackStub = i6 % 128;
                    int i7 = i6 % 2;
                    strAsBinder = getString(R.string.app_account_notification_join___3efa8afd60);
                    Intrinsics.checkNotNullExpressionValue(strAsBinder, "");
                }
                tdsListRowV1View.setCenterText3(strAsBinder);
                setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsListRowV1View);
                int i8 = asBinder + 119;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context9 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context9);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, R.string.close, new View.OnClickListener() { // from class: viva.republica.toss.account.notification.join.AccountNotificationJoinCompleteFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountNotificationJoinCompleteFragment.onExtraCallback(gettypedexportedconstants, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        gettypedexportedconstants.setContentView(linearLayout);
        gettypedexportedconstants.show();
    }

    public static final class IAuthTabCallbackStub extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStub(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class IAuthTabCallbackStubProxy extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallbackStubProxy(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class access100 extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    static final class onExtraCallback {
        private final String IAuthTabCallback;
        private final String onExtraCallback;

        public onExtraCallback(@NotNull String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = str;
            this.IAuthTabCallback = str2;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final String onExtraCallback() {
            return this.onExtraCallback;
        }
    }

    static final class IAuthTabCallback {
        private final float onNavigationEvent;

        public IAuthTabCallback(float f) {
            this.onNavigationEvent = f;
        }

        public final float onWarmupCompleted() {
            return this.onNavigationEvent;
        }
    }

    static final class onNavigationEvent {
        private final String IAuthTabCallback;

        public onNavigationEvent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = str;
        }

        public final String IAuthTabCallback() {
            return this.IAuthTabCallback;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Unit) onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{accountNotificationJoinCompleteFragment, setDetectableSize}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1154812530, -1154812529, iOnExtraCallback);
    }

    private final GetSymmAlgorithm IAuthTabCallback() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (GetSymmAlgorithm) onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 966044125, -966044125, iOnExtraCallback);
    }

    private static final void onWarmupCompleted(AccountNotificationJoinCompleteFragment accountNotificationJoinCompleteFragment, View view) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{accountNotificationJoinCompleteFragment, view}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1487625562, 1487625564, iOnExtraCallback);
    }

    static void onWarmupCompleted() {
        onTransact = 7798559133331975163L;
        IAuthTabCallbackDefault = -1776194565;
        asInterface = (char) 33801;
    }
}
