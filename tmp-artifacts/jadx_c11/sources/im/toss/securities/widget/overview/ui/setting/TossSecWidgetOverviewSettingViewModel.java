package im.toss.securities.widget.overview.ui.setting;

import androidx.lifecycle.ViewModel;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.securities.widget.overview.ui.setting.model.AccountSections;
import im.toss.tosssecurities.core.account.domain.model.Account;
import im.toss.tosssecurities.core.account.domain.model.AccountList;
import im.toss.tosssecurities.core.account.domain.model.AssetSummary;
import im.toss.tosssecurities.core.account.domain.model.AssetSummaryResponse;
import im.toss.tosssecurities.host.contracts.DisplaySetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.KSerializer;
import o.CloseableUtils;
import o.DiskLruCacheEditornewSink11;
import o.DiskLruCacheEntry;
import o.GeckoHubImp1;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.ResourceCallback;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.decodeIpv6;
import o.findRes;
import o.findResAndMsg;
import o.getBorderRadius;
import o.getCornerRadius;
import o.getCurrentEditorokhttp;
import o.getShine;
import o.getTileModeY;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.q8a;
import o.r0b;
import o.r4;
import o.r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo;
import o.registerClient;
import o.setAdUnitIds;
import o.setCustomerUserId;
import o.setRandomHost;
import o.setRubIn;
import o.setShine;
import o.setTaggedAddrCtrl;
import o.sp;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossSecWidgetOverviewSettingViewModel extends ViewModel {
    private static int onActivityResized = 1;
    private static int onPostMessage;
    private final getCornerRadius<DisplaySetting> IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final registerClient IAuthTabCallbackStubProxy;
    private final setRubIn<DisplaySetting> IAuthTabCallback_Parcel;
    private final setRubIn<Boolean> ICustomTabsCallback;
    private final String access000;
    private final DiskLruCacheEditornewSink11.IAuthTabCallback access100;
    private final getCornerRadius<AssetSummary> asBinder;
    private final getCornerRadius<AccountSections.Account> asInterface;
    private final getBorderRadius<String> extraCallback;
    private final getBorderRadius<String> extraCallbackWithResult;
    private final String getInterfaceDescriptor;
    private final r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onExtraCallback;
    private final getCornerRadius<Float> onExtraCallbackWithResult;
    private final setRubIn<AccountSections> onNavigationEvent;
    private final setRubIn<Float> onTransact;
    private final getCornerRadius<Boolean> onWarmupCompleted;
    private final findResAndMsg readTypedObject;
    private final decodeIpv6 writeTypedObject;

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 117;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact();
        int i4 = onActivityResized + 107;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~(i5 | i2)) | i6;
        int i8 = i2 | i5 | i6;
        int i9 = ~i5;
        int i10 = i5 + i6 + i3 + ((-421447895) * i) + ((-859425246) * i4);
        int i11 = i10 * i10;
        int i12 = (i5 * (-629045104)) + 1817116672 + ((-629045104) * i6) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i3) + ((-2125594624) * i) + (888930304 * i4) + (441384960 * i11);
        int i13 = (i5 * 1303038832) + 2077918271 + (i6 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i3 * 1303038783) + (i * 1583617559) + (i4 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    @Inject
    public TossSecWidgetOverviewSettingViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull DiskLruCacheEntry diskLruCacheEntry, @NotNull setAdUnitIds setadunitids, @NotNull r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso, @NotNull decodeIpv6 decodeipv6, @NotNull registerClient registerclient) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(diskLruCacheEntry, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(r8lambdaws9z36z_nyqlya8ut2rf642vcso, "");
        Intrinsics.checkNotNullParameter(decodeipv6, "");
        Intrinsics.checkNotNullParameter(registerclient, "");
        this.onExtraCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        this.writeTypedObject = decodeipv6;
        this.IAuthTabCallbackStubProxy = registerclient;
        Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("appWidgetId");
        if (num != null) {
            iIntValue = num.intValue();
            int i = onPostMessage + 69;
            onActivityResized = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            int i3 = onPostMessage + 67;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            iIntValue = 0;
        }
        this.IAuthTabCallbackStub = iIntValue;
        this.getInterfaceDescriptor = r4.Companion.IAuthTabCallback(iIntValue);
        this.IAuthTabCallbackDefault = r0b.onNavigationEvent(iIntValue);
        this.access000 = r0b.onWarmupCompleted(iIntValue);
        this.access100 = diskLruCacheEntry.IAuthTabCallback();
        CloseableUtils closeableUtils = CloseableUtils.DROP_OLDEST;
        this.extraCallback = getShine.onWarmupCompleted(1, 0, closeableUtils, 2, (Object) null);
        this.extraCallbackWithResult = getShine.onWarmupCompleted(1, 0, closeableUtils, 2, (Object) null);
        findResAndMsg findresandmsgIAuthTabCallback = findRes.IAuthTabCallback(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), new asBinder(CoroutineExceptionHandler.extraCallbackWithResult, this));
        this.readTypedObject = findresandmsgIAuthTabCallback;
        getCornerRadius<Boolean> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(Boolean.TRUE);
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent;
        this.ICustomTabsCallback = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getCornerRadius<DisplaySetting> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent(registerclient.onNavigationEvent());
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent2;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        getCornerRadius<Float> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(Float.valueOf(1.0f));
        this.onExtraCallbackWithResult = getcornerradiusOnNavigationEvent3;
        this.onTransact = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        getCornerRadius<AssetSummary> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent((Object) null);
        this.asBinder = getcornerradiusOnNavigationEvent4;
        getCornerRadius<AccountSections.Account> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent((Object) null);
        this.asInterface = getcornerradiusOnNavigationEvent5;
        this.onNavigationEvent = ycxycx.IAuthTabCallback(ycxycx.onExtraCallbackWithResult(getcornerradiusOnNavigationEvent5, getcornerradiusOnNavigationEvent4, r8lambdaws9z36z_nyqlya8ut2rf642vcso.IAuthTabCallbackDefault(), new onWarmupCompleted(null)), findresandmsgIAuthTabCallback, getTileModeY.Companion.onNavigationEvent(), IAuthTabCallback((AccountList) r8lambdaws9z36z_nyqlya8ut2rf642vcso.IAuthTabCallbackDefault().IAuthTabCallback(), null, null));
        maybeUpdateAnimatable.onNavigationEvent(findresandmsgIAuthTabCallback, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(setadunitids, this, null), 3, (Object) null);
    }

    public static final /* synthetic */ String IAuthTabCallback(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        String str = tossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public static final /* synthetic */ DiskLruCacheEditornewSink11.IAuthTabCallback IAuthTabCallbackDefault(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 79;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallback = tossSecWidgetOverviewSettingViewModel.access100;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 47;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return iAuthTabCallback;
    }

    public static final /* synthetic */ decodeIpv6 IAuthTabCallbackStub(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 19;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        decodeIpv6 decodeipv6 = tossSecWidgetOverviewSettingViewModel.writeTypedObject;
        int i5 = i2 + 73;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return decodeipv6;
    }

    public static final /* synthetic */ String asBinder(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        String str = tossSecWidgetOverviewSettingViewModel.getInterfaceDescriptor;
        int i5 = i3 + 49;
        onActivityResized = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ registerClient asInterface(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage + 63;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        registerClient registerclient = tossSecWidgetOverviewSettingViewModel.IAuthTabCallbackStubProxy;
        int i5 = i3 + 103;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return registerclient;
    }

    public static final /* synthetic */ int onExtraCallback(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onPostMessage + 105;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        int i4 = tossSecWidgetOverviewSettingViewModel.IAuthTabCallbackStub;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) objArr[0];
        AccountList accountList = (AccountList) objArr[1];
        String str = (String) objArr[2];
        AssetSummary assetSummary = (AssetSummary) objArr[3];
        int i = 2 % 2;
        int i2 = onPostMessage + 53;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            tossSecWidgetOverviewSettingViewModel.IAuthTabCallback(accountList, str, assetSummary);
            throw null;
        }
        AccountSections accountSectionsIAuthTabCallback = tossSecWidgetOverviewSettingViewModel.IAuthTabCallback(accountList, str, assetSummary);
        int i3 = onPostMessage + 95;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return accountSectionsIAuthTabCallback;
        }
        throw null;
    }

    public static final /* synthetic */ getCornerRadius onNavigationEvent(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 3;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<AssetSummary> getcornerradius = tossSecWidgetOverviewSettingViewModel.asBinder;
        int i5 = i2 + 15;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            return getcornerradius;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, AccountSections.Account account) {
        int i = 2 % 2;
        int i2 = onActivityResized + 81;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        tossSecWidgetOverviewSettingViewModel.onExtraCallbackWithResult(account);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onPostMessage + 53;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
    }

    public static final /* synthetic */ void onTransact(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized + 49;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel}, -332899289, 332899293);
            throw null;
        }
        int iOnExtraCallbackWithResult3 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult4, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel}, -332899289, 332899293);
        int i3 = onPostMessage + 43;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 95;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = tossSecWidgetOverviewSettingViewModel.onExtraCallback;
        if (i3 == 0) {
            return r8lambdaws9z36z_nyqlya8ut2rf642vcso;
        }
        throw null;
    }

    public static final /* synthetic */ String onWarmupCompleted(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 5;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        String str = tossSecWidgetOverviewSettingViewModel.access000;
        int i5 = i2 + 13;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class asBinder extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ TossSecWidgetOverviewSettingViewModel IAuthTabCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted, TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
            super(onwarmupcompleted);
            this.IAuthTabCallback = tossSecWidgetOverviewSettingViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r0
          0x002b: PHI (r0v6 o.getBorderRadius<java.lang.String>) = (r0v5 o.getBorderRadius<java.lang.String>), (r0v9 o.getBorderRadius<java.lang.String>) binds: [B:8:0x0029, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            getBorderRadius<String> getborderradiusAsBinder;
            String strOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                getborderradiusAsBinder = this.IAuthTabCallback.asBinder();
                strOnWarmupCompleted = setCustomerUserId.onWarmupCompleted(th);
                int i3 = 73 / 0;
                if (strOnWarmupCompleted == null) {
                    q8a.IAuthTabCallback(q8a.onNavigationEvent, th, null, 2, null);
                    int i4 = onExtraCallbackWithResult + 45;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    strOnWarmupCompleted = "잠시 오류가 발생하였습니다.";
                }
            } else {
                getborderradiusAsBinder = this.IAuthTabCallback.asBinder();
                strOnWarmupCompleted = setCustomerUserId.onWarmupCompleted(th);
                if (strOnWarmupCompleted == null) {
                }
            }
            getborderradiusAsBinder.onNavigationEvent(strOnWarmupCompleted);
        }
    }

    public final getBorderRadius<String> asBinder() {
        int i = 2 % 2;
        int i2 = onPostMessage + 107;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBorderRadius<String> getborderradius = this.extraCallback;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return getborderradius;
    }

    public final getBorderRadius<String> asInterface() {
        getBorderRadius<String> getborderradius;
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        int i3 = i2 % 128;
        onActivityResized = i3;
        if (i2 % 2 == 0) {
            getborderradius = this.extraCallbackWithResult;
            int i4 = 97 / 0;
        } else {
            getborderradius = this.extraCallbackWithResult;
        }
        int i5 = i3 + 121;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return getborderradius;
    }

    public final setRubIn<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage + 61;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 25;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<DisplaySetting> setrubin = tossSecWidgetOverviewSettingViewModel.IAuthTabCallback_Parcel;
        if (i3 == 0) {
            return setrubin;
        }
        throw null;
    }

    public final setRubIn<Float> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onPostMessage;
        int i3 = i2 + 7;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Float> setrubin = this.onTransact;
        int i5 = i2 + 125;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return setrubin;
    }

    public final setRubIn<AccountSections> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements setTaggedAddrCtrl<AccountSections.Account, AssetSummary, AccountList, access13800<? super AccountSections>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(4, access13800Var);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((AccountSections.Account) obj, (AssetSummary) obj2, (AccountList) obj3, (access13800) obj4);
            if (i3 != 0) {
                int i4 = 34 / 0;
            }
            int i5 = IAuthTabCallback + 93;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(AccountSections.Account account, AssetSummary assetSummary, AccountList accountList, access13800<? super AccountSections> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = TossSecWidgetOverviewSettingViewModel.this.new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = account;
            onwarmupcompleted.L$1 = assetSummary;
            onwarmupcompleted.L$2 = accountList;
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(Unit.INSTANCE);
            int i2 = onNavigationEvent + 101;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String strOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            IAuthTabCallback = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            AccountSections.Account account = (AccountSections.Account) this.L$0;
            AssetSummary assetSummary = (AssetSummary) this.L$1;
            AccountList accountList = (AccountList) this.L$2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 != 0) {
                obj2.hashCode();
                throw null;
            }
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = TossSecWidgetOverviewSettingViewModel.this;
            if (account != null) {
                int i6 = onNavigationEvent + 43;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                strOnWarmupCompleted = account.onWarmupCompleted();
                int i8 = IAuthTabCallback + 59;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = onNavigationEvent + 63;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                strOnWarmupCompleted = null;
            }
            AccountSections accountSections = (AccountSections) TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel, accountList, strOnWarmupCompleted, assetSummary}, 239214166, -239214164);
            int i12 = onNavigationEvent + 109;
            IAuthTabCallback = i12 % 128;
            if (i12 % 2 == 0) {
                return accountSections;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* renamed from: im.toss.securities.widget.overview.ui.setting.TossSecWidgetOverviewSettingViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ setAdUnitIds $loginStatus;
        Object L$0;
        int label;
        final /* synthetic */ TossSecWidgetOverviewSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(setAdUnitIds setadunitids, TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.$loginStatus = setadunitids;
            this.this$0 = tossSecWidgetOverviewSettingViewModel;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$loginStatus, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 125;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
            return anonymousClass5;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 59;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            if (r10.emit("내 투자 내역을 확인하려면 로그인이 필요해요", r9) == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
        
            if (r0.emit(r10, r9) != r1) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (this.$loginStatus.IAuthTabCallback()) {
                    decodeIpv6 decodeipv6IAuthTabCallbackStub = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackStub(this.this$0);
                    this.label = 2;
                    obj = decodeipv6IAuthTabCallbackStub.onExtraCallback(this);
                    if (obj != objOnWarmupCompleted) {
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                } else {
                    int i4 = onWarmupCompleted + 119;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    getBorderRadius<String> getborderradiusAsBinder = this.this$0.asBinder();
                    this.label = 1;
                }
                return objOnWarmupCompleted;
            }
            int i6 = IAuthTabCallback + 87;
            int i7 = i6 % 128;
            onWarmupCompleted = i7;
            int i8 = i6 % 2;
            if (i3 != 1) {
                int i9 = i7 + 45;
                int i10 = i9 % 128;
                IAuthTabCallback = i10;
                int i11 = i9 % 2;
                if (i3 == 2) {
                    ResultKt.onNavigationEvent(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        TossSecWidgetOverviewSettingViewModel.onTransact(this.this$0);
                        int i12 = onWarmupCompleted + 109;
                        IAuthTabCallback = i12 % 128;
                        int i13 = i12 % 2;
                        return Unit.INSTANCE;
                    }
                    decodeIpv6 decodeipv6IAuthTabCallbackStub2 = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackStub(this.this$0);
                    this.label = 3;
                    obj = decodeipv6IAuthTabCallbackStub2.asBinder(this);
                    if (obj != objOnWarmupCompleted) {
                        if (((Boolean) obj).booleanValue()) {
                        }
                        getBorderRadius<String> getborderradiusAsInterface = this.this$0.asInterface();
                        this.L$0 = access15400.onNavigationEvent(str);
                        this.label = 4;
                    }
                    return objOnWarmupCompleted;
                }
                if (i3 != 3) {
                    int i14 = i10 + 109;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 == 0 ? i3 != 4 : i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    if (((Boolean) obj).booleanValue()) {
                        str = "투자 중인 자산이 없어요";
                    } else {
                        int i15 = IAuthTabCallback + 15;
                        onWarmupCompleted = i15 % 128;
                        if (i15 % 2 != 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        str = "계좌 잠금 해제가 필요해요";
                    }
                    getBorderRadius<String> getborderradiusAsInterface2 = this.this$0.asInterface();
                    this.L$0 = access15400.onNavigationEvent(str);
                    this.label = 4;
                }
            }
            ResultKt.onNavigationEvent(obj);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = TossSecWidgetOverviewSettingViewModel.this.new onExtraCallback(access13800Var);
            int i2 = onExtraCallback + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 81;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 90 / 0;
            } else {
                objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 107;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r1 r4
          0x0034: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v10 java.lang.Object) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x0034: PHI (r4v5 boolean) = (r4v0 boolean), (r4v6 boolean) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3 r4
          0x0022: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]
          0x0022: PHI (r4v1 boolean) = (r4v0 boolean), (r4v6 boolean) binds: [B:8:0x0020, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted;
            int i;
            boolean zBooleanValue;
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 3;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                zBooleanValue = false;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel2 = TossSecWidgetOverviewSettingViewModel.this;
                    q8a q8aVar = q8a.onNavigationEvent;
                    int iOnExtraCallback = TossSecWidgetOverviewSettingViewModel.onExtraCallback(tossSecWidgetOverviewSettingViewModel2);
                    this.L$0 = tossSecWidgetOverviewSettingViewModel2;
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = q8aVar.onExtraCallbackWithResult(iOnExtraCallback, (access13800<? super Boolean>) this);
                    if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                        int i4 = onExtraCallbackWithResult + 57;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                    tossSecWidgetOverviewSettingViewModel = tossSecWidgetOverviewSettingViewModel2;
                    obj = objOnExtraCallbackWithResult;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i = this.label;
                zBooleanValue = true;
                if (i != 0) {
                }
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                int i5 = onExtraCallback + 7;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
            tossSecWidgetOverviewSettingViewModel.onExtraCallbackWithResult(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = TossSecWidgetOverviewSettingViewModel.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 34 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 19 / 0;
            }
            int i5 = onWarmupCompleted + 17;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onWarmupCompleted + 57;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel2 = TossSecWidgetOverviewSettingViewModel.this;
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel2);
                String strOnWarmupCompleted = TossSecWidgetOverviewSettingViewModel.onWarmupCompleted(TossSecWidgetOverviewSettingViewModel.this);
                KSerializer kSerializerSerializer = DisplaySetting.Companion.serializer();
                DisplaySetting displaySettingOnNavigationEvent = TossSecWidgetOverviewSettingViewModel.asInterface(TossSecWidgetOverviewSettingViewModel.this).onNavigationEvent();
                this.L$0 = tossSecWidgetOverviewSettingViewModel2;
                this.label = 1;
                Object objOnExtraCallback = getCurrentEditorokhttp.onExtraCallback(iAuthTabCallbackIAuthTabCallbackDefault, strOnWarmupCompleted, kSerializerSerializer, displaySettingOnNavigationEvent, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                tossSecWidgetOverviewSettingViewModel = tossSecWidgetOverviewSettingViewModel2;
                obj = objOnExtraCallback;
            }
            int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
            TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel, (DisplaySetting) obj}, 869030385, -869030384);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = TossSecWidgetOverviewSettingViewModel.this.new IAuthTabCallback(access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel2 = TossSecWidgetOverviewSettingViewModel.this;
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel2);
                String strIAuthTabCallback = TossSecWidgetOverviewSettingViewModel.IAuthTabCallback(TossSecWidgetOverviewSettingViewModel.this);
                KSerializer kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(1.0f);
                this.L$0 = tossSecWidgetOverviewSettingViewModel2;
                this.label = 1;
                Object objOnExtraCallback = getCurrentEditorokhttp.onExtraCallback(iAuthTabCallbackIAuthTabCallbackDefault, strIAuthTabCallback, kSerializerOnWarmupCompleted, fOnExtraCallbackWithResult, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    int i7 = IAuthTabCallback + 81;
                    onExtraCallbackWithResult = i7 % 128;
                    if (i7 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
                tossSecWidgetOverviewSettingViewModel = tossSecWidgetOverviewSettingViewModel2;
                obj = objOnExtraCallback;
            }
            tossSecWidgetOverviewSettingViewModel.onWarmupCompleted(((Number) obj).floatValue());
            return Unit.INSTANCE;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = TossSecWidgetOverviewSettingViewModel.this.new onNavigationEvent(access13800Var);
            int i2 = IAuthTabCallback + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 45 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
        
            if (r11 == r1) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(TossSecWidgetOverviewSettingViewModel.this);
                String strAsBinder = TossSecWidgetOverviewSettingViewModel.asBinder(TossSecWidgetOverviewSettingViewModel.this);
                KSerializer<AccountSections.Account> kSerializerSerializer = AccountSections.Account.Companion.serializer();
                this.label = 1;
                obj = iAuthTabCallbackIAuthTabCallbackDefault.onExtraCallback(strAsBinder, kSerializerSerializer, this);
                if (obj != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onWarmupCompleted + 37;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
                ResultKt.onNavigationEvent(objOnExtraCallback);
                Account accountOnExtraCallbackWithResult = ((AccountList) objOnExtraCallback).onExtraCallbackWithResult();
                if (accountOnExtraCallbackWithResult != null) {
                    TossSecWidgetOverviewSettingViewModel.onNavigationEvent(TossSecWidgetOverviewSettingViewModel.this, new AccountSections.Account(true, accountOnExtraCallbackWithResult.IAuthTabCallbackStub(), accountOnExtraCallbackWithResult.IAuthTabCallbackDefault(), accountOnExtraCallbackWithResult.onNavigationEvent(), accountOnExtraCallbackWithResult.asInterface(), accountOnExtraCallbackWithResult.IAuthTabCallback(), accountOnExtraCallbackWithResult.onExtraCallbackWithResult(), null));
                }
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            AccountSections.Account account = (AccountSections.Account) obj;
            if (account != null) {
                int i7 = IAuthTabCallback + 27;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                TossSecWidgetOverviewSettingViewModel.onNavigationEvent(TossSecWidgetOverviewSettingViewModel.this, account);
                return Unit.INSTANCE;
            }
            Object[] objArr = {TossSecWidgetOverviewSettingViewModel.this};
            r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1220888671, -1220888668);
            this.L$0 = access15400.onNavigationEvent(account);
            this.label = 2;
            objOnExtraCallback = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onExtraCallback(this);
        }
    }

    static final class onTransact extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 125;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = TossSecWidgetOverviewSettingViewModel.this.new onTransact(access13800Var);
            ontransact.L$0 = obj;
            int i2 = IAuthTabCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return ontransact;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = IAuthTabCallback + 93;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super AccountList>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;
            int label;
            final /* synthetic */ TossSecWidgetOverviewSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            IAuthTabCallback(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, access13800<? super IAuthTabCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossSecWidgetOverviewSettingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.this$0, access13800Var);
                int i2 = IAuthTabCallback + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 67;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super AccountList> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onNavigationEvent(findresandmsg, access13800Var);
                }
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super AccountList> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 39;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = IAuthTabCallback + 11;
                    int i6 = i5 % 128;
                    onWarmupCompleted = i6;
                    int i7 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i6 + 49;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                        int i9 = 31 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallbackWithResult = ((Result) obj).onNavigationEvent();
                    }
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1220888671, -1220888668);
                    this.label = 1;
                    objOnExtraCallbackWithResult = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onExtraCallbackWithResult(this);
                    if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                        int i10 = onWarmupCompleted + 75;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
                int i12 = IAuthTabCallback + 79;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 57 / 0;
                }
                return objOnExtraCallbackWithResult;
            }
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super AssetSummaryResponse>, Object> {
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;
            int label;
            final /* synthetic */ TossSecWidgetOverviewSettingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onNavigationEvent(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = tossSecWidgetOverviewSettingViewModel;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
                int i2 = onExtraCallbackWithResult + 101;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i2 % 128;
                Object obj3 = null;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super AssetSummaryResponse> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onExtraCallback(findresandmsg, access13800Var);
                    obj3.hashCode();
                    throw null;
                }
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i3 = onNavigationEvent + 19;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    return objOnExtraCallback;
                }
                throw null;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super AssetSummaryResponse> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 49;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }
                Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 5;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted;
                int i = 2 % 2;
                Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 79;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = ((Result) obj).onNavigationEvent();
                } else {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo r8lambdaws9z36z_nyqlya8ut2rf642vcso = (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) TossSecWidgetOverviewSettingViewModel.onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), objArr, 1220888671, -1220888668);
                    this.label = 1;
                    objOnWarmupCompleted = r8lambdaws9z36z_nyqlya8ut2rf642vcso.onWarmupCompleted(this);
                    if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                        int i5 = onNavigationEvent + 117;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        return objOnWarmupCompleted2;
                    }
                }
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                return objOnWarmupCompleted;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                GeckoHubImp1 geckoHubImp1OnExtraCallback = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(TossSecWidgetOverviewSettingViewModel.this, null), 3, (Object) null);
                GeckoHubImp1 geckoHubImp1OnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(TossSecWidgetOverviewSettingViewModel.this, null), 3, (Object) null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback);
                this.L$2 = access15400.onNavigationEvent(geckoHubImp1OnExtraCallback2);
                this.label = 1;
                obj = ResourceCallback.onExtraCallback(new GeckoHubImp1[]{geckoHubImp1OnExtraCallback, geckoHubImp1OnExtraCallback2}, this);
                if (obj == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 23;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Object obj2 = ((List) obj).get(1);
            Intrinsics.checkNotNull(obj2, "");
            TossSecWidgetOverviewSettingViewModel.onNavigationEvent(TossSecWidgetOverviewSettingViewModel.this).onWarmupCompleted(((AssetSummaryResponse) obj2).IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) objArr[0];
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(tossSecWidgetOverviewSettingViewModel.readTypedObject, (CoroutineContext) null, (setRandomHost) null, tossSecWidgetOverviewSettingViewModel.new onExtraCallback(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(tossSecWidgetOverviewSettingViewModel.readTypedObject, (CoroutineContext) null, (setRandomHost) null, tossSecWidgetOverviewSettingViewModel.new onExtraCallbackWithResult(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(tossSecWidgetOverviewSettingViewModel.readTypedObject, (CoroutineContext) null, (setRandomHost) null, tossSecWidgetOverviewSettingViewModel.new IAuthTabCallback(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(tossSecWidgetOverviewSettingViewModel.readTypedObject, (CoroutineContext) null, (setRandomHost) null, tossSecWidgetOverviewSettingViewModel.new onNavigationEvent(null), 3, (Object) null);
        maybeUpdateAnimatable.onNavigationEvent(tossSecWidgetOverviewSettingViewModel.readTypedObject, (CoroutineContext) null, (setRandomHost) null, tossSecWidgetOverviewSettingViewModel.new onTransact(null), 3, (Object) null);
        int i2 = onActivityResized + 79;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 41;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.onWarmupCompleted(Boolean.valueOf(z));
        int i4 = onActivityResized + 61;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) objArr[0];
        DisplaySetting displaySetting = (DisplaySetting) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onActivityResized = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(displaySetting, "");
            tossSecWidgetOverviewSettingViewModel.IAuthTabCallback.onWarmupCompleted(displaySetting);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(displaySetting, "");
        tossSecWidgetOverviewSettingViewModel.IAuthTabCallback.onWarmupCompleted(displaySetting);
        int i3 = onPostMessage + 25;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onActivityResized + 119;
        onPostMessage = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onWarmupCompleted(Float.valueOf(f));
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult.onWarmupCompleted(Float.valueOf(f));
        int i3 = onActivityResized + 3;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void onExtraCallbackWithResult(AccountSections.Account account) {
        int i = 2 % 2;
        int i2 = onActivityResized + 69;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.onWarmupCompleted(account);
        int i4 = onPostMessage + 41;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
    }

    private static final Unit onTransact() {
        int i = 2 % 2;
        int i2 = onPostMessage + 79;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityResized + 45;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        maybeUpdateAnimatable.onNavigationEvent(this.readTypedObject, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new asInterface(function0, this, ((Boolean) this.ICustomTabsCallback.IAuthTabCallback()).booleanValue(), ((Number) this.onTransact.IAuthTabCallback()).floatValue(), (DisplaySetting) this.IAuthTabCallback_Parcel.IAuthTabCallback(), (AccountSections.Account) this.asInterface.IAuthTabCallback(), null), 2, (Object) null);
        int i2 = onActivityResized + 61;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ AccountSections.Account $account;
        final /* synthetic */ float $alpha;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ DisplaySetting $displaySetting;
        final /* synthetic */ Function0<Unit> $onEnd;
        float F$0;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ TossSecWidgetOverviewSettingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(Function0<Unit> function0, TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, boolean z, float f, DisplaySetting displaySetting, AccountSections.Account account, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$onEnd = function0;
            this.this$0 = tossSecWidgetOverviewSettingViewModel;
            this.$checked = z;
            this.$alpha = f;
            this.$displaySetting = displaySetting;
            this.$account = account;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$onEnd, this.this$0, this.$checked, this.$alpha, this.$displaySetting, this.$account, access13800Var);
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 53;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objIAuthTabCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DisplaySetting displaySetting;
            AccountSections.Account account;
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel;
            float f;
            int i;
            int i2;
            asInterface asinterface;
            asInterface asinterface2;
            AccountSections.Account account2;
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel2;
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault;
            String strOnWarmupCompleted;
            KSerializer kSerializerSerializer;
            int i3;
            asInterface asinterface3;
            AccountSections.Account account3;
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel3;
            TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel4;
            int i4 = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            try {
            } catch (Exception e) {
                Result.Companion companion = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel5 = this.this$0;
                boolean z = this.$checked;
                float f2 = this.$alpha;
                displaySetting = this.$displaySetting;
                account = this.$account;
                Result.Companion companion3 = Result.Companion;
                q8a q8aVar = q8a.onNavigationEvent;
                int iOnExtraCallback = TossSecWidgetOverviewSettingViewModel.onExtraCallback(tossSecWidgetOverviewSettingViewModel5);
                this.L$0 = tossSecWidgetOverviewSettingViewModel5;
                this.L$1 = displaySetting;
                this.L$2 = account;
                this.L$3 = access15400.onNavigationEvent(this);
                this.F$0 = f2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (q8aVar.onNavigationEvent(iOnExtraCallback, z, (access13800<? super Unit>) this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                tossSecWidgetOverviewSettingViewModel = tossSecWidgetOverviewSettingViewModel5;
                f = f2;
                i = 0;
                i2 = 0;
                asinterface = this;
            } else {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i = this.I$1;
                        i2 = this.I$0;
                        asinterface2 = (access13800) this.L$3;
                        account2 = (AccountSections.Account) this.L$2;
                        displaySetting = (DisplaySetting) this.L$1;
                        tossSecWidgetOverviewSettingViewModel2 = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        iAuthTabCallbackIAuthTabCallbackDefault = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel2);
                        strOnWarmupCompleted = TossSecWidgetOverviewSettingViewModel.onWarmupCompleted(tossSecWidgetOverviewSettingViewModel2);
                        kSerializerSerializer = DisplaySetting.Companion.serializer();
                        this.L$0 = tossSecWidgetOverviewSettingViewModel2;
                        this.L$1 = account2;
                        this.L$2 = access15400.onNavigationEvent(asinterface2);
                        this.L$3 = null;
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.label = 3;
                        if (iAuthTabCallbackIAuthTabCallbackDefault.onNavigationEvent(strOnWarmupCompleted, displaySetting, kSerializerSerializer, this) != objOnWarmupCompleted) {
                            i3 = i2;
                            asinterface3 = asinterface2;
                            account3 = account2;
                            tossSecWidgetOverviewSettingViewModel3 = tossSecWidgetOverviewSettingViewModel2;
                            if (account3 != null) {
                            }
                            TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel3).IAuthTabCallback();
                            Result.constructor-impl(Unit.INSTANCE);
                            this.$onEnd.invoke();
                            return Unit.INSTANCE;
                        }
                        return objOnWarmupCompleted;
                    }
                    if (i5 != 3) {
                        if (i5 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = onWarmupCompleted + 41;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        tossSecWidgetOverviewSettingViewModel4 = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        tossSecWidgetOverviewSettingViewModel3 = tossSecWidgetOverviewSettingViewModel4;
                        TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel3).IAuthTabCallback();
                        Result.constructor-impl(Unit.INSTANCE);
                        this.$onEnd.invoke();
                        return Unit.INSTANCE;
                    }
                    i = this.I$1;
                    i3 = this.I$0;
                    asinterface3 = (access13800) this.L$2;
                    account3 = (AccountSections.Account) this.L$1;
                    tossSecWidgetOverviewSettingViewModel3 = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    if (account3 != null) {
                        int i7 = onWarmupCompleted + 45;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                        DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault2 = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel3);
                        String strAsBinder = TossSecWidgetOverviewSettingViewModel.asBinder(tossSecWidgetOverviewSettingViewModel3);
                        KSerializer<AccountSections.Account> kSerializerSerializer2 = AccountSections.Account.Companion.serializer();
                        this.L$0 = tossSecWidgetOverviewSettingViewModel3;
                        this.L$1 = access15400.onNavigationEvent(asinterface3);
                        this.L$2 = null;
                        this.I$0 = i3;
                        this.I$1 = i;
                        this.label = 4;
                        if (iAuthTabCallbackIAuthTabCallbackDefault2.onNavigationEvent(strAsBinder, account3, kSerializerSerializer2, this) != objOnWarmupCompleted) {
                            tossSecWidgetOverviewSettingViewModel4 = tossSecWidgetOverviewSettingViewModel3;
                            tossSecWidgetOverviewSettingViewModel3 = tossSecWidgetOverviewSettingViewModel4;
                        }
                        return objOnWarmupCompleted;
                    }
                    TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel3).IAuthTabCallback();
                    Result.constructor-impl(Unit.INSTANCE);
                    this.$onEnd.invoke();
                    return Unit.INSTANCE;
                }
                i = this.I$1;
                i2 = this.I$0;
                f = this.F$0;
                asinterface = (access13800) this.L$3;
                AccountSections.Account account4 = (AccountSections.Account) this.L$2;
                DisplaySetting displaySetting2 = (DisplaySetting) this.L$1;
                tossSecWidgetOverviewSettingViewModel = (TossSecWidgetOverviewSettingViewModel) this.L$0;
                ResultKt.onNavigationEvent(obj);
                account = account4;
                displaySetting = displaySetting2;
            }
            DiskLruCacheEditornewSink11.IAuthTabCallback iAuthTabCallbackIAuthTabCallbackDefault3 = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel);
            String strIAuthTabCallback = TossSecWidgetOverviewSettingViewModel.IAuthTabCallback(tossSecWidgetOverviewSettingViewModel);
            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(f);
            KSerializer kSerializerOnWarmupCompleted = sp.onWarmupCompleted(FloatCompanionObject.INSTANCE);
            this.L$0 = tossSecWidgetOverviewSettingViewModel;
            this.L$1 = displaySetting;
            this.L$2 = account;
            this.L$3 = access15400.onNavigationEvent(asinterface);
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 2;
            if (iAuthTabCallbackIAuthTabCallbackDefault3.onNavigationEvent(strIAuthTabCallback, fOnExtraCallbackWithResult, kSerializerOnWarmupCompleted, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            asinterface2 = asinterface;
            account2 = account;
            tossSecWidgetOverviewSettingViewModel2 = tossSecWidgetOverviewSettingViewModel;
            iAuthTabCallbackIAuthTabCallbackDefault = TossSecWidgetOverviewSettingViewModel.IAuthTabCallbackDefault(tossSecWidgetOverviewSettingViewModel2);
            strOnWarmupCompleted = TossSecWidgetOverviewSettingViewModel.onWarmupCompleted(tossSecWidgetOverviewSettingViewModel2);
            kSerializerSerializer = DisplaySetting.Companion.serializer();
            this.L$0 = tossSecWidgetOverviewSettingViewModel2;
            this.L$1 = account2;
            this.L$2 = access15400.onNavigationEvent(asinterface2);
            this.L$3 = null;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 3;
            if (iAuthTabCallbackIAuthTabCallbackDefault.onNavigationEvent(strOnWarmupCompleted, displaySetting, kSerializerSerializer, this) != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
    }

    private static final AccountSections.Account onExtraCallbackWithResult(Account account, Map<String, AssetSummary.AccountOverview> map, String str) {
        int i = 2 % 2;
        int i2 = onPostMessage + 121;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        AssetSummary.AccountOverview accountOverview = map.get(account.onExtraCallbackWithResult());
        AccountSections.Account account2 = new AccountSections.Account(Intrinsics.areEqual(account.IAuthTabCallbackStub(), str), account.IAuthTabCallbackStub(), account.IAuthTabCallbackDefault(), account.onNavigationEvent(), account.asInterface(), account.IAuthTabCallback(), account.onExtraCallbackWithResult(), accountOverview != null ? Long.valueOf(accountOverview.onExtraCallback()) : null);
        int i4 = onPostMessage + 101;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            return account2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AccountSections IAuthTabCallback(AccountList accountList, String str, AssetSummary assetSummary) {
        Map mapOnNavigationEvent;
        Pair pairIAuthTabCallback;
        Long lValueOf;
        List listIAuthTabCallback;
        int i = 2 % 2;
        if (assetSummary != null) {
            int i2 = onPostMessage + 103;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            mapOnNavigationEvent = assetSummary.onExtraCallback();
            if (mapOnNavigationEvent == null) {
                mapOnNavigationEvent = access8100.onNavigationEvent();
            }
        }
        if (accountList == null || (listIAuthTabCallback = accountList.IAuthTabCallback()) == null) {
            pairIAuthTabCallback = getWrite.IAuthTabCallback(CollectionsKt.emptyList(), CollectionsKt.emptyList());
            int i4 = onActivityResized + 39;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listIAuthTabCallback) {
                if (((Boolean) Account.onNavigationEvent(new Object[]{(Account) obj}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1414740113, 1414740113, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue()) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                    int i6 = onActivityResized + 15;
                    onPostMessage = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            pairIAuthTabCallback = new Pair(arrayList, arrayList2);
        }
        List list = (List) pairIAuthTabCallback.onExtraCallbackWithResult();
        List list2 = (List) pairIAuthTabCallback.IAuthTabCallback();
        AccountSections.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult = AccountSections.onExtraCallback.onExtraCallbackWithResult.My;
        AccountSections.onNavigationEvent.IAuthTabCallback iAuthTabCallback = AccountSections.onNavigationEvent.IAuthTabCallback.My;
        AccountSections.onExtraCallback onextracallback = null;
        if (assetSummary != null) {
            lValueOf = Long.valueOf(assetSummary.IAuthTabCallback());
            if (list.size() <= 1) {
                lValueOf = null;
            }
        }
        AccountSections.onNavigationEvent onnavigationevent = new AccountSections.onNavigationEvent(iAuthTabCallback, lValueOf, 1);
        ArrayList arrayList3 = new ArrayList(list.size());
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add(onExtraCallbackWithResult((Account) list.get(i9), mapOnNavigationEvent, str));
        }
        AccountSections.onExtraCallback onextracallback2 = new AccountSections.onExtraCallback(onextracallbackwithresult, onnavigationevent, arrayList3);
        List list3 = list2;
        if (!list3.isEmpty()) {
            AccountSections.onExtraCallback.onExtraCallbackWithResult onextracallbackwithresult2 = AccountSections.onExtraCallback.onExtraCallbackWithResult.Child;
            AccountSections.onNavigationEvent onnavigationevent2 = new AccountSections.onNavigationEvent(AccountSections.onNavigationEvent.IAuthTabCallback.Child, null, 2);
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size2 = list3.size();
            while (i8 < size2) {
                int i10 = onActivityResized + 7;
                onPostMessage = i10 % 128;
                if (i10 % 2 != 0) {
                    arrayList4.add(onExtraCallbackWithResult((Account) list2.get(i8), mapOnNavigationEvent, str));
                    i8 += 89;
                } else {
                    arrayList4.add(onExtraCallbackWithResult((Account) list2.get(i8), mapOnNavigationEvent, str));
                    i8++;
                }
            }
            onextracallback = new AccountSections.onExtraCallback(onextracallbackwithresult2, onnavigationevent2, arrayList4);
        }
        return new AccountSections(onextracallback2, onextracallback);
    }

    public final void onExtraCallback(@NotNull AccountSections.Account account) {
        int i = 2 % 2;
        int i2 = onActivityResized + 39;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(account, "");
        onExtraCallbackWithResult(account);
        int i4 = onPostMessage + 119;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo onExtraCallbackWithResult(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (r8lambdaWs9z36z_NyqlYa8Ut2RF642VcSo) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel}, 1220888671, -1220888668);
    }

    public static final /* synthetic */ AccountSections onWarmupCompleted(TossSecWidgetOverviewSettingViewModel tossSecWidgetOverviewSettingViewModel, AccountList accountList, String str, AssetSummary assetSummary) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (AccountSections) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{tossSecWidgetOverviewSettingViewModel, accountList, str, assetSummary}, 239214166, -239214164);
    }

    private final void IAuthTabCallbackDefault() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this}, -332899289, 332899293);
    }

    public final setRubIn<DisplaySetting> onWarmupCompleted() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return (setRubIn) onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this}, -252893336, 252893336);
    }

    public final void onWarmupCompleted(@NotNull DisplaySetting displaySetting) {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        onNavigationEvent(QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), new Object[]{this, displaySetting}, 869030385, -869030384);
    }
}
