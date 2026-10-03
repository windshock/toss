package viva.republica.toss.cardrecommend.issuev2.ui;

import android.graphics.Color;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.base.BaseFragment;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Base64Encoder;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.CxxInspectorPackagerConnection;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.MapConverter;
import o.OIWObjectIdentifiers;
import o.PlayerErrorCode;
import o.checkDeviceBrand;
import o.checkNavigationBarByWindowManagerService;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeUri;
import o.deserializeUriNullableCollection;
import o.didScheduleMountItems;
import o.getDigestAlgorithms;
import o.getEncryptedData;
import o.getParamImp;
import o.initMiniApp;
import o.onAdViewAdDisplayFailed;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.common.accountchooser.AbsAccountInputFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueInputAccountFragment extends AbsAccountInputFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 43211;
    private static char IAuthTabCallbackStub = 27262;
    private static int access100 = 1;
    private static char asBinder = 11268;
    private static char asInterface = 25860;
    private static int onTransact;
    private final CharSequence onExtraCallbackWithResult;
    private final Lazy onWarmupCompleted = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(CardIssueOverviewViewModel.class), new onNavigationEvent(this), new onWarmupCompleted(null, this), new onExtraCallback(this));
    private final checkDeviceBrand IAuthTabCallback = checkDeviceBrand.WITHDRAWAL;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i2)) | (~(i5 | i2));
        int i11 = i7 | i2;
        int i12 = i9 | i11;
        int i13 = i5 + i2 + i4 + ((-1542968645) * i) + (1789173782 * i6);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i5) + 752877568 + ((-368479342) * i2) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i4) + (1802502144 * i) + (148897792 * i6) + (289275904 * i14);
        int i16 = (i5 * (-930071408)) + 1959937684 + (i2 * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i4 * (-930070801)) + (i * 1059663509) + (i6 * (-1428764534)) + (i14 * 484573184);
        int i17 = i15 + (i16 * i16 * 411172864);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(CardIssueInputAccountFragment cardIssueInputAccountFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cardIssueInputAccountFragment, th);
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(CardIssueInputAccountFragment cardIssueInputAccountFragment, Base64Encoder base64Encoder) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(cardIssueInputAccountFragment, base64Encoder);
        }
        onExtraCallbackWithResult(cardIssueInputAccountFragment, base64Encoder);
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -2089347135, iOnExtraCallbackWithResult, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, 2089347135, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = onTransact + 101;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueInputAccountFragment cardIssueInputAccountFragment, String str, String str2, didScheduleMountItems.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cardIssueInputAccountFragment, str, str2, onextracallback);
        int i4 = onTransact + 49;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(CardIssueInputAccountFragment cardIssueInputAccountFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = access100 + 115;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1147752729, iOnExtraCallbackWithResult, new Object[]{cardIssueInputAccountFragment, deserializeurinullablecollection}, iOnExtraCallbackWithResult2, -1147752726, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CardIssueInputAccountFragment cardIssueInputAccountFragment = (CardIssueInputAccountFragment) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(cardIssueInputAccountFragment);
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardIssueInputAccountFragment cardIssueInputAccountFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 933393326, iOnExtraCallbackWithResult3, new Object[]{cardIssueInputAccountFragment, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallbackWithResult4, -933393324, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i3 = onTransact + 69;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 85;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return 1009533L;
    }

    private final getDigestAlgorithms<OIWObjectIdentifiers> onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Parcelable parcelable = requireArguments().getParcelable("navigator");
        Intrinsics.checkNotNull(parcelable);
        getDigestAlgorithms<OIWObjectIdentifiers> getdigestalgorithms = (getDigestAlgorithms) parcelable;
        int i4 = access100 + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return getdigestalgorithms;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean asInterface() {
        int i = 2 % 2;
        int i2 = access100 + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean z = requireArguments().getBoolean("useForResult", false);
        int i4 = access100 + 37;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CardIssueOverviewViewModel IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOverviewViewModel cardIssueOverviewViewModel = (CardIssueOverviewViewModel) this.onWarmupCompleted.getValue();
        int i4 = onTransact + 115;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return cardIssueOverviewViewModel;
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public CharSequence IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = ((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onWarmupCompleted();
        int i4 = access100 + 53;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return strOnWarmupCompleted;
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public CharSequence onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 67;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public checkDeviceBrand onExtraCallbackWithResult() {
        checkDeviceBrand checkdevicebrand;
        int i = 2 % 2;
        int i2 = onTransact + 99;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            checkdevicebrand = this.IAuthTabCallback;
            int i4 = 59 / 0;
        } else {
            checkdevicebrand = this.IAuthTabCallback;
        }
        int i5 = i3 + 31;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return checkdevicebrand;
    }

    public static final class onExtraCallbackWithResult<Upstream, Downstream> implements deserializeUri {
        final /* synthetic */ MapConverter onExtraCallbackWithResult;
        final /* synthetic */ MapConverter onNavigationEvent;

        public onExtraCallbackWithResult(MapConverter mapConverter, MapConverter mapConverter2) {
            this.onExtraCallbackWithResult = mapConverter;
            this.onNavigationEvent = mapConverter2;
        }

        public final deserializeIp<didScheduleMountItems.onExtraCallback> apply(writeRaw<BaseApiResponse<didScheduleMountItems.onExtraCallback>> writeraw) {
            Intrinsics.checkNotNullParameter(writeraw, "");
            final AnonymousClass1 anonymousClass1 = new Function1<BaseApiResponse<didScheduleMountItems.onExtraCallback>, deserializeIp<? extends didScheduleMountItems.onExtraCallback>>() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onExtraCallbackWithResult.1
                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final deserializeIp<? extends didScheduleMountItems.onExtraCallback> invoke(BaseApiResponse<didScheduleMountItems.onExtraCallback> baseApiResponse) throws IllegalAccessException, InstantiationException {
                    Intrinsics.checkNotNullParameter(baseApiResponse, "");
                    int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
                    if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                        Object objOnTransact = baseApiResponse.onTransact();
                        if (objOnTransact == null) {
                            objOnTransact = didScheduleMountItems.onExtraCallback.class.newInstance();
                        }
                        return writeRaw.onExtraCallback(objOnTransact);
                    }
                    TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
                    if (apiErrorExtraCallbackWithResult == null) {
                        apiErrorExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
                    }
                    return writeRaw.onExtraCallbackWithResult(apiErrorExtraCallbackWithResult);
                }
            };
            writeRaw writerawOnExtraCallbackWithResult = writeraw.onExtraCallbackWithResult(new deserializeIntNullableCollection(anonymousClass1) { // from class: o.UtilsKtExternalSyntheticLambda17$removeOnConfigurationChangedListener
                private final /* synthetic */ Function1 onWarmupCompleted;

                {
                    Intrinsics.checkNotNullParameter(anonymousClass1, "");
                    this.onWarmupCompleted = anonymousClass1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return this.onWarmupCompleted.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            MapConverter mapConverter = this.onExtraCallbackWithResult;
            if (mapConverter != null) {
                writerawOnExtraCallbackWithResult = writerawOnExtraCallbackWithResult.onNavigationEvent(mapConverter);
                Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            }
            MapConverter mapConverter2 = this.onNavigationEvent;
            if (mapConverter2 == null) {
                return writerawOnExtraCallbackWithResult;
            }
            writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(mapConverter2);
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            return writerawIAuthTabCallback;
        }
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public Function1<Base64Encoder, Boolean> onWarmupCompleted() {
        int i = 2 % 2;
        Function1<Base64Encoder, Boolean> function1 = new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CardIssueInputAccountFragment.onExtraCallback(this.f$0, (Base64Encoder) obj));
            }
        };
        int i2 = access100 + 95;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return function1;
    }

    private static final boolean onExtraCallbackWithResult(CardIssueInputAccountFragment cardIssueInputAccountFragment, Base64Encoder base64Encoder) {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(base64Encoder, "");
            boolean z = cardIssueInputAccountFragment.IAuthTabCallbackStub().asInterface() instanceof CxxInspectorPackagerConnection.onWarmupCompleted;
            throw null;
        }
        Intrinsics.checkNotNullParameter(base64Encoder, "");
        if (cardIssueInputAccountFragment.IAuthTabCallbackStub().asInterface() instanceof CxxInspectorPackagerConnection.onWarmupCompleted) {
            return !((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{cardIssueInputAccountFragment.onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallbackWithResult().contains(Integer.valueOf(base64Encoder.IAuthTabCallback()));
        }
        if (!cardIssueInputAccountFragment.onExtraCallbackWithResult(String.valueOf(base64Encoder.IAuthTabCallback()))) {
            int i3 = onTransact + 95;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                ((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{cardIssueInputAccountFragment.onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallbackWithResult().contains(Integer.valueOf(base64Encoder.IAuthTabCallback()));
                obj.hashCode();
                throw null;
            }
            if (!((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{cardIssueInputAccountFragment.onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallbackWithResult().contains(Integer.valueOf(base64Encoder.IAuthTabCallback()))) {
                int i4 = access100 + 59;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
        }
        return false;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("card_id", IAuthTabCallbackStub().IAuthTabCallbackStub());
        linkedHashMap.put("funnel_id", IAuthTabCallbackStub().getInterfaceDescriptor());
        linkedHashMap.put("session_id", IAuthTabCallbackStub().ICustomTabsCallbackStubProxy());
        linkedHashMap.put("screen_type", ((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).onExtraCallback());
        Object[] objArr = new Object[1];
        a(new char[]{10617, 63071, 39599, 9432, 37831, 34693, 51136, 34896}, TextUtils.indexOf((CharSequence) "", '0') + 9, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), IAuthTabCallbackStub().onActivityResized());
        linkedHashMap.put("referrer_item_id", IAuthTabCallbackStub().onPostMessage());
        linkedHashMap.put("service_referrer", IAuthTabCallbackStub().ICustomTabsCallbackStub());
        Map<String, Object> interfaceDescriptor = ((OIWObjectIdentifiers) ((getEncryptedData) getDigestAlgorithms.IAuthTabCallback(1377327355, new Object[]{onExtraCallback()}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -1377327352, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent()))).getInterfaceDescriptor();
        if (interfaceDescriptor != null) {
            int i2 = onTransact + 23;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            linkedHashMap.putAll(interfaceDescriptor);
            if (i3 == 0) {
                int i4 = 55 / 0;
            }
        }
        int i5 = onTransact + 123;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashMap;
    }

    @Override // viva.republica.toss.common.accountchooser.AbsAccountInputFragment
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onWarmupCompleted(str, str2);
        int i4 = onTransact + 101;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = onTransact + 55;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueInputAccountFragment cardIssueInputAccountFragment = (CardIssueInputAccountFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 13;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            BaseFragment.showProgressDialog$default(cardIssueInputAccountFragment, (String) null, true, 4, (Object) null);
        } else {
            BaseFragment.showProgressDialog$default(cardIssueInputAccountFragment, (String) null, false, 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 89;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(CardIssueInputAccountFragment cardIssueInputAccountFragment) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        cardIssueInputAccountFragment.dismissProgressDialog();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (asInterface() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        o.getDigestAlgorithms.onExtraCallback(onExtraCallback(), o.RippleNode.onNavigationEvent(r13), IAuthTabCallbackStub(), new o.RemoteRenderingApi(new o.createRewardedVideoAd(r14, r15)), (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 40, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r1 = o.RippleNode.onNavigationEvent(r13).IAuthTabCallbackStubProxy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r1 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r2 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.access100 + 25;
        viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onTransact = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if ((r2 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r0 = r1.onTransact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r0.onWarmupCompleted("account", new o.createRewardedVideoAd(r14, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r1.onTransact();
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        o.RippleNode.onNavigationEvent(r13).access100();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (asInterface() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onWarmupCompleted(final java.lang.String r14, final java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onWarmupCompleted(java.lang.String, java.lang.String):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 51;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackDefault);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int iAlpha = 10 - Color.alpha(i3);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iAlpha, fadingEdgeLength, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), 10 - TextUtils.indexOf("", "", 0, 0), 12434 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $11 + 23;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 4 / 5;
                    }
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.getDeadChar(0, 0)), 14 - View.getDefaultSize(0, 0), TextUtils.getOffsetBefore("", 0) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[PHI: r1 r11 r14
      0x0068: PHI (r1v6 o.TypographyKtExternalSyntheticLambda0) = (r1v4 o.TypographyKtExternalSyntheticLambda0), (r1v7 o.TypographyKtExternalSyntheticLambda0) binds: [B:14:0x0066, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r11v6 viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel) = 
      (r11v3 viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel)
      (r11v7 viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel)
     binds: [B:14:0x0066, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r14v12 o.getDigestAlgorithms<o.OIWObjectIdentifiers>) = (r14v10 o.getDigestAlgorithms<o.OIWObjectIdentifiers>), (r14v13 o.getDigestAlgorithms<o.OIWObjectIdentifiers>) binds: [B:14:0x0066, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment r11, java.lang.String r12, java.lang.String r13, o.didScheduleMountItems.onExtraCallback r14) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r14 = r14.onNavigationEvent()
            java.lang.String r1 = o.PlayerErrorCode.onPostMessage()
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r1)
            if (r14 != 0) goto L20
            r11.asBinder()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            int r12 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.access100
            int r12 = r12 + 107
            int r13 = r12 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onTransact = r13
            int r12 = r12 % r0
            return r11
        L20:
            boolean r14 = r11.asInterface()
            if (r14 != 0) goto L8e
            int r14 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.access100
            int r14 = r14 + 5
            int r1 = r14 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onTransact = r1
            int r14 = r14 % r0
            if (r14 == 0) goto L50
            o.getDigestAlgorithms r14 = r11.onExtraCallback()
            o.TypographyKtExternalSyntheticLambda0 r1 = o.RippleNode.onNavigationEvent(r11)
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r11 = r11.IAuthTabCallbackStub()
            o.checkNavigationBarByWindowManagerService r2 = o.checkNavigationBarByWindowManagerService.SHINHAN_OLD
            java.lang.String r2 = r2.getCode()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
            r3 = 42
            int r3 = r3 / 0
            r2 = r2 ^ 1
            if (r2 == 0) goto L68
            goto L77
        L50:
            o.getDigestAlgorithms r14 = r11.onExtraCallback()
            o.TypographyKtExternalSyntheticLambda0 r1 = o.RippleNode.onNavigationEvent(r11)
            viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r11 = r11.IAuthTabCallbackStub()
            o.checkNavigationBarByWindowManagerService r2 = o.checkNavigationBarByWindowManagerService.SHINHAN_OLD
            java.lang.String r2 = r2.getCode()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
            if (r2 == 0) goto L77
        L68:
            int r12 = viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.access100
            int r12 = r12 + 115
            int r2 = r12 % 128
            viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onTransact = r2
            int r12 = r12 % r0
            o.checkNavigationBarByWindowManagerService r12 = o.checkNavigationBarByWindowManagerService.SHINHAN
            java.lang.String r12 = r12.getCode()
        L77:
            r4 = r11
            r2 = r14
            r3 = r1
            o.createRewardedVideoAd r11 = new o.createRewardedVideoAd
            r11.<init>(r12, r13)
            o.RemoteRenderingApi r5 = new o.RemoteRenderingApi
            r5.<init>(r11)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 40
            r10 = 0
            o.getDigestAlgorithms.onExtraCallback(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto Laf
        L8e:
            o.TypographyKtExternalSyntheticLambda0 r14 = o.RippleNode.onNavigationEvent(r11)
            o.TwoLineExternalSyntheticLambda0 r14 = r14.IAuthTabCallbackStubProxy()
            if (r14 == 0) goto La8
            o.TextLinkScopeExternalSyntheticLambda7 r14 = r14.onTransact()
            if (r14 == 0) goto La8
            java.lang.String r0 = "account"
            o.createRewardedVideoAd r1 = new o.createRewardedVideoAd
            r1.<init>(r12, r13)
            r14.onWarmupCompleted(r0, r1)
        La8:
            o.TypographyKtExternalSyntheticLambda0 r11 = o.RippleNode.onNavigationEvent(r11)
            r11.access100()
        Laf:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment.onExtraCallbackWithResult(viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment, java.lang.String, java.lang.String, o.didScheduleMountItems$onExtraCallback):kotlin.Unit");
    }

    private static final Unit onExtraCallback(CardIssueInputAccountFragment cardIssueInputAccountFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, cardIssueInputAccountFragment.requireBaseActivity(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        if (!Intrinsics.areEqual(str, checkNavigationBarByWindowManagerService.TOSS_SECURITIES.getCode())) {
            int i2 = access100 + 93;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(str, checkNavigationBarByWindowManagerService.TOSS_BANK.getCode())) {
                int i4 = onTransact + 67;
                access100 = i4 % 128;
                return i4 % 2 == 0;
            }
        }
        return true;
    }

    private final void asBinder() {
        int i = 2 % 2;
        CommonModule_setScreenAwakeMode.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueInputAccountFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueInputAccountFragment.onWarmupCompleted(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
            }
        });
        int i2 = onTransact + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueInputAccountFragment cardIssueInputAccountFragment = (CardIssueInputAccountFragment) objArr[0];
        CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled = (CommonModule_setLeftEdgeTouchEnabled) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueInputAccountFragment.getString(R.string.account_chooser_not_my_account_dialog_title_with_name, new Object[]{PlayerErrorCode.onPostMessage()}));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueInputAccountFragment.getString(R.string.account_chooser_not_my_account_dialog_message));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 81;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void onNavigationEvent(CardIssueInputAccountFragment cardIssueInputAccountFragment) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -484171707, iOnExtraCallbackWithResult, new Object[]{cardIssueInputAccountFragment}, iOnExtraCallbackWithResult2, 484171708, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(CardIssueInputAccountFragment cardIssueInputAccountFragment, deserializeUriNullableCollection deserializeurinullablecollection) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 1147752729, iOnExtraCallbackWithResult, new Object[]{cardIssueInputAccountFragment, deserializeurinullablecollection}, iOnExtraCallbackWithResult2, -1147752726, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -2089347135, iOnExtraCallbackWithResult, new Object[]{function1, obj}, iOnExtraCallbackWithResult2, 2089347135, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback(CardIssueInputAccountFragment cardIssueInputAccountFragment, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), 933393326, iOnExtraCallbackWithResult, new Object[]{cardIssueInputAccountFragment, commonModule_setLeftEdgeTouchEnabled}, iOnExtraCallbackWithResult2, -933393324, onAdViewAdDisplayFailed.onExtraCallbackWithResult());
    }

    public static final class onNavigationEvent extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
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

    public static final class onExtraCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }
}
