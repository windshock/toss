package viva.republica.toss.account.group;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.ApiServerError;
import im.toss.network.throwable.TossApiCallException;
import im.toss.utils.RxUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinAdServiceImplc;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.DERConstructedSet;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.KeyBoardVisiblePoint;
import o.NetConverter3;
import o.PageShowPoint;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.RewardedAdListener;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TypeUtils2;
import o.access13800;
import o.access8100;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.matches;
import o.maybeUpdateAnimatable;
import o.onCollectWhenDestroy;
import o.onDisclaimerClick;
import o.onExitFullscreen;
import o.onJsBridgeReady;
import o.setMessageBytes;
import o.setRandomHost;
import o.withFailOnCacheFailureEnabled;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.group.JointTransferActivity$;
import viva.republica.toss.send.AbsCompactSendActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JointTransferActivity extends Hilt_JointTransferActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int ICustomTabsCallback = 0;
    private static char[] access000 = null;
    public static final int asBinder;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int onPostMessage = 1;
    private static boolean readTypedObject;
    private static boolean writeTypedObject;
    private long IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub = "";
    private String IAuthTabCallback_Parcel = "";
    private onWarmupCompleted access100;

    @Inject
    public AppLovinAdServiceImplc analyticsHelper;
    private withFailOnCacheFailureEnabled asInterface;
    private long getInterfaceDescriptor;

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JointTransferActivity.onNavigationEvent(JointTransferActivity.this, null, this);
        }
    }

    static final class onTransact extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JointTransferActivity.onExtraCallback(JointTransferActivity.this, null, this);
        }
    }

    static {
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = onPostMessage + 109;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(JointTransferActivity jointTransferActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCallback + 21;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(jointTransferActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        JointTransferActivity jointTransferActivity = (JointTransferActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 117;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onWarmupCompleted(jointTransferActivity);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(JointTransferActivity jointTransferActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(jointTransferActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = extraCallback + 81;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(JointTransferActivity jointTransferActivity, RewardedAdListener rewardedAdListener) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(new Object[]{jointTransferActivity, rewardedAdListener}, -2079997205, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 2079997206, matches.onExtraCallback());
        int i4 = ICustomTabsCallback + 65;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        JointTransferActivity jointTransferActivity = (JointTransferActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(jointTransferActivity, th);
        int i4 = ICustomTabsCallback + 47;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i6)) | i5;
        int i9 = i6 | i5 | i7;
        int i10 = i5 + i + i2 + (1159740906 * i3) + ((-617157175) * i4);
        int i11 = i10 * i10;
        int i12 = ((i5 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i2) + (1488977920 * i3) + (2111832064 * i4) + (2070937600 * i11);
        int i13 = (i5 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i2 * (-824977973)) + (i3 * (-135083378)) + (i4 * 1125239651) + (i11 * 298844160);
        int i14 = i12 + (i13 * i13 * 2098200576);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JointTransferActivity jointTransferActivity, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(jointTransferActivity, l);
        int i4 = ICustomTabsCallback + 87;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = ICustomTabsCallback + 83;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 5;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 13;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return 1013707L;
    }

    public static final /* synthetic */ Object onExtraCallback(JointTransferActivity jointTransferActivity, TypeUtils2 typeUtils2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(new Object[]{jointTransferActivity, typeUtils2, access13800Var}, 1929465793, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1929465790, matches.onExtraCallback());
        int i4 = extraCallback + 15;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ onWarmupCompleted onExtraCallback(JointTransferActivity jointTransferActivity) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted onwarmupcompleted = jointTransferActivity.access100;
        if (i3 != 0) {
            return onwarmupcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onNavigationEvent(JointTransferActivity jointTransferActivity) {
        long jAccess200;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            jAccess200 = jointTransferActivity.access200();
            int i3 = 35 / 0;
        } else {
            jAccess200 = jointTransferActivity.access200();
        }
        int i4 = ICustomTabsCallback + 39;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jAccess200;
    }

    public static final /* synthetic */ Object onNavigationEvent(JointTransferActivity jointTransferActivity, TypeUtils2 typeUtils2, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = extraCallback + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(new Object[]{jointTransferActivity, typeUtils2, access13800Var}, 1032303235, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1032303231, matches.onExtraCallback());
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public final AppLovinAdServiceImplc onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 89;
        ICustomTabsCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        AppLovinAdServiceImplc appLovinAdServiceImplc = this.analyticsHelper;
        if (appLovinAdServiceImplc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 5;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return appLovinAdServiceImplc;
        }
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallback = i2 % 128;
        onWarmupCompleted onwarmupcompleted = null;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            onExtraCallback(bundle);
            onwarmupcompleted.hashCode();
            throw null;
        }
        super.onCreate(bundle);
        onExtraCallback(bundle);
        onWarmupCompleted onwarmupcompleted2 = this.access100;
        if (onwarmupcompleted2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            onwarmupcompleted2 = null;
        }
        if (onwarmupcompleted2 == onWarmupCompleted.SEND_EVENT_FEE && this.IAuthTabCallbackDefault <= 0) {
            int i3 = extraCallback + 65;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                finish();
                return;
            } else {
                finish();
                onwarmupcompleted.hashCode();
                throw null;
            }
        }
        onWarmupCompleted onwarmupcompleted3 = this.access100;
        if (onwarmupcompleted3 == null) {
            int i4 = extraCallback + 111;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                onwarmupcompleted.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            onwarmupcompleted = onwarmupcompleted3;
        }
        if (onwarmupcompleted == onWarmupCompleted.DEPOSIT && TextUtils.isEmpty(this.IAuthTabCallbackStub)) {
            finish();
        } else {
            IPostMessageServiceStub();
        }
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public KeyBoardVisiblePoint aA_() {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onDisclaimerClick ondisclaimerclickOnNavigationEvent = PageShowPoint.Companion.onNavigationEvent(this.IAuthTabCallbackStub);
        int i4 = ICustomTabsCallback + 55;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return ondisclaimerclickOnNavigationEvent;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundle, "");
        Serializable serializable = this.access100;
        if (serializable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = extraCallback + 111;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            serializable = null;
        }
        bundle.putSerializable("extra.type", serializable);
        bundle.putString("extra.accountId", this.IAuthTabCallbackStub);
        bundle.putString("extra.inputMessage", this.IAuthTabCallback_Parcel);
        bundle.putLong("id", this.IAuthTabCallbackDefault);
        bundle.putLong("extra.amount", this.getInterfaceDescriptor);
        super.onSaveInstanceState(bundle);
        int i4 = extraCallback + 1;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Bundle bundle) throws Throwable {
        int i = 2 % 2;
        String str = "";
        if (bundle != null) {
            onWarmupCompleted serializable = bundle.getSerializable("extra.type");
            Intrinsics.checkNotNull(serializable, "");
            this.access100 = serializable;
            this.IAuthTabCallbackDefault = bundle.getLong("id", 0L);
            this.getInterfaceDescriptor = bundle.getLong("extra.amount", 0L);
            String string = bundle.getString("extra.accountId", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.IAuthTabCallbackStub = string;
            String string2 = bundle.getString("extra.inputMessage", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            this.IAuthTabCallback_Parcel = string2;
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            Enum r12 = null;
            if (intent.getBooleanExtra("im.toss.is_deep_link_flag", false)) {
                String stringExtra = intent.getStringExtra("id");
                if (stringExtra == null) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-122}, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
                    stringExtra = ((String) objArr[0]).intern();
                }
                this.IAuthTabCallbackDefault = Long.parseLong(stringExtra);
                this.access100 = onWarmupCompleted.SEND_EVENT_FEE;
                return;
            }
            onWarmupCompleted serializableExtra = intent.getSerializableExtra("extra.type");
            Intrinsics.checkNotNull(serializableExtra, "");
            onWarmupCompleted onwarmupcompleted = serializableExtra;
            this.access100 = onwarmupcompleted;
            if (onwarmupcompleted == null) {
                int i2 = ICustomTabsCallback + 55;
                extraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                r12 = onwarmupcompleted;
            }
            int i3 = onExtraCallbackWithResult.onExtraCallback[r12.ordinal()];
            if (i3 == 1) {
                this.IAuthTabCallbackDefault = intent.getLongExtra("id", 0L);
                this.getInterfaceDescriptor = intent.getLongExtra("extra.amount", 0L);
                return;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String stringExtra2 = intent.getStringExtra("extra.accountId");
            if (stringExtra2 == null) {
                int i4 = ICustomTabsCallback + 7;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                stringExtra2 = "";
            }
            this.IAuthTabCallbackStub = stringExtra2;
            this.getInterfaceDescriptor = intent.getLongExtra("extra.amount", 0L);
            String stringExtra3 = intent.getStringExtra("extra.inputMessage");
            if (stringExtra3 == null) {
                int i6 = extraCallback + 35;
                ICustomTabsCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                str = stringExtra3;
            }
            this.IAuthTabCallback_Parcel = str;
        }
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            KeyBoardVisiblePoint keyBoardVisiblePointOnGreatestScrollPercentageIncreased = onGreatestScrollPercentageIncreased();
            if (keyBoardVisiblePointOnGreatestScrollPercentageIncreased != null) {
                onNavigationEvent().onNavigationEvent("click_conversion", getScreenName(), access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("amount", Long.valueOf(access200())), getWrite.IAuthTabCallback("bank_code", keyBoardVisiblePointOnGreatestScrollPercentageIncreased.asInterface())}));
                int i3 = extraCallback + 1;
                ICustomTabsCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
            return;
        }
        onGreatestScrollPercentageIncreased();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = access000;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 77 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 75, 16037 - TextUtils.getTrimmedLength(""), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i4 = 1052772399;
        if (readTypedObject) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), 63 - (ViewConfiguration.getLongPressTimeout() >> 16), 12213 - TextUtils.lastIndexOf("", '0'), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 1052772399;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!writeTypedObject) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i7 = $11 + 95;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $10 + 123;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Gravity.getAbsoluteGravity(0, 0) + 63, 12214 - TextUtils.indexOf("", "", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // viva.republica.toss.send.AbsCompactSendActivity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        super.onActivityResult(i, i2, intent);
        if (i != 10120 || intent == null) {
            return;
        }
        int i4 = extraCallback + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        String stringExtra = intent.getStringExtra("accountId");
        if (stringExtra == null) {
            int i6 = ICustomTabsCallback + 27;
            extraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            }
            stringExtra = "";
        }
        onNavigationEvent(DERConstructedSet.onWarmupCompleted(stringExtra, onCollectWhenDestroy.TOSS_ACCOUNT));
        int i8 = ICustomTabsCallback + 23;
        extraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return "transfer_addon_joint";
    }

    private static final void onWarmupCompleted(JointTransferActivity jointTransferActivity) {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            jointTransferActivity.bo_();
            jointTransferActivity.IEngagementSignalsCallbackStubProxy();
        } else {
            jointTransferActivity.bo_();
            jointTransferActivity.IEngagementSignalsCallbackStubProxy();
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, viva.republica.toss.account.group.JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity] */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ?? r2 = (JointTransferActivity) objArr[0];
        RewardedAdListener rewardedAdListener = (RewardedAdListener) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{rewardedAdListener}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                withFailOnCacheFailureEnabled withfailoncachefailureenabled = (withFailOnCacheFailureEnabled) rewardedAdListener.onTransact();
                if (withfailoncachefailureenabled != null) {
                    ((JointTransferActivity) r2).asInterface = withfailoncachefailureenabled;
                    ((JointTransferActivity) r2).getInterfaceDescriptor = withfailoncachefailureenabled.onExtraCallback();
                    AbsCompactSendActivity.onExtraCallback(r2, withfailoncachefailureenabled.onWarmupCompleted(), withfailoncachefailureenabled.onExtraCallback(), null, 4, null);
                }
            } else {
                ApiServerError apiServerErrorAsInterface = rewardedAdListener.asInterface();
                if (apiServerErrorAsInterface != null) {
                    int i3 = ICustomTabsCallback + 121;
                    extraCallback = i3 % 128;
                    int i4 = i3 % 2;
                    String strIAuthTabCallbackDefault = apiServerErrorAsInterface.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault != null) {
                        onJsBridgeReady.onNavigationEvent((Context) r2, strIAuthTabCallbackDefault, 0, 2, (Object) null);
                    }
                }
                r2.updateVisuals();
            }
            Unit unit = Unit.INSTANCE;
            int i5 = extraCallback + 97;
            ICustomTabsCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback4 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        ((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{rewardedAdListener}, iIAuthTabCallback3, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback4)).booleanValue();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(JointTransferActivity jointTransferActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        getParamImp.onWarmupCompleted(th, jointTransferActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        jointTransferActivity.updateVisuals();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 125;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IPostMessageServiceStub() throws Throwable {
        int i = 2 % 2;
        onExtraCallbackWithResult(ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onNavigationEvent(77));
        onWarmupCompleted onwarmupcompleted = this.access100;
        if (onwarmupcompleted == null) {
            int i2 = ICustomTabsCallback + 41;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            onwarmupcompleted = null;
        }
        if (onwarmupcompleted == onWarmupCompleted.SEND_EVENT_FEE) {
            BaseActivity.IAuthTabCallback(this, (String) null, false, 3, (Object) null);
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, View.getDefaultSize(0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
            }
            Object obj = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                }
                writeRaw writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent(this.IAuthTabCallbackDefault).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
                Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
                writeRaw writerawOnWarmupCompleted = writerawIAuthTabCallback.onWarmupCompleted(new JointTransferActivity$.ExternalSyntheticLambda1(this));
                Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
                setMessageBytes.onExtraCallbackWithResult(writerawOnWarmupCompleted, new JointTransferActivity$.ExternalSyntheticLambda2(this), new JointTransferActivity$.ExternalSyntheticLambda3(this));
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String string = getString(R.string.app_account_group___de650e1b66);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbsCompactSendActivity.onExtraCallback(this, string, this.getInterfaceDescriptor, null, 4, null);
        IEngagementSignalsCallbackStubProxy();
        int i4 = ICustomTabsCallback + 61;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallback + 95;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        writeRaw.onExtraCallback(350L, TimeUnit.MILLISECONDS).IAuthTabCallback(NetConverter3.onExtraCallback()).onExtraCallbackWithResult(new JointTransferActivity$.ExternalSyntheticLambda5(new JointTransferActivity$.ExternalSyntheticLambda4(this)));
        int i2 = ICustomTabsCallback + 69;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(JointTransferActivity jointTransferActivity, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 45;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            jointTransferActivity.setResult(1);
        } else {
            jointTransferActivity.setResult(0);
        }
        jointTransferActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 5;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(JointTransferActivity jointTransferActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(jointTransferActivity.getString(R.string.app_account_group___89d8edec6f));
            Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
            int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
            int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        } else {
            Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
            commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(jointTransferActivity.getString(R.string.app_account_group___89d8edec6f));
            Object[] objArr3 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
            int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr3, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
            Object[] objArr4 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
            int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
            CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr4, iOnExtraCallbackWithResult4, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.account.group.JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.group.JointTransferActivity.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(JointTransferActivity jointTransferActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCallback + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(jointTransferActivity.getString(R.string.app_account_group___89d8edec6f));
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onWarmupCompleted(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, (Function1) null, 1, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 15;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r0 != r7) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0284  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.app.Activity, android.content.Context, im.toss.base.BaseActivity, viva.republica.toss.account.group.JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.group.JointTransferActivity.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onExtraCallbackWithResult(TossApiCallException.ApiError apiError) throws Throwable {
        int i = 2 % 2;
        if (Intrinsics.areEqual(apiError.asBinder(), "6070")) {
            int i2 = ICustomTabsCallback + 15;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            Map mapAsInterface = apiError.asInterface();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -123, -124, -125, -126, -127}, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            Object obj = mapAsInterface.get(((String) objArr[0]).intern());
            if (obj != null) {
                int i4 = ICustomTabsCallback + 35;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                String string = obj.toString();
                if (string != null) {
                    int i6 = ICustomTabsCallback + 29;
                    extraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    SessionTrackerb.IAuthTabCallback(onVerticalScrollEvent(), this, string, false, (Function1) null, (Bundle) null, false, 60, (Object) null);
                    return true;
                }
            }
        }
        return false;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, long j, long j2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) JointTransferActivity.class);
            intent.putExtra("id", j);
            intent.putExtra("extra.amount", j2);
            intent.putExtra("extra.type", (Serializable) onWarmupCompleted.SEND_EVENT_FEE);
            return intent;
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, long j, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) JointTransferActivity.class);
            intent.putExtra("extra.accountId", str);
            intent.putExtra("extra.amount", j);
            intent.putExtra("extra.inputMessage", str2);
            intent.putExtra("extra.type", (Serializable) onWarmupCompleted.DEPOSIT);
            return intent;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(JointTransferActivity jointTransferActivity, Throwable th) {
        return (Unit) onExtraCallbackWithResult(new Object[]{jointTransferActivity, th}, 902323188, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -902323186, matches.onExtraCallback());
    }

    private final Object onWarmupCompleted(TypeUtils2 typeUtils2, access13800<? super Unit> access13800Var) {
        return onExtraCallbackWithResult(new Object[]{this, typeUtils2, access13800Var}, 1032303235, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1032303231, matches.onExtraCallback());
    }

    private final Object IAuthTabCallback(TypeUtils2 typeUtils2, access13800<? super Unit> access13800Var) {
        return onExtraCallbackWithResult(new Object[]{this, typeUtils2, access13800Var}, 1929465793, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1929465790, matches.onExtraCallback());
    }

    private static final Unit onNavigationEvent(JointTransferActivity jointTransferActivity, RewardedAdListener rewardedAdListener) {
        return (Unit) onExtraCallbackWithResult(new Object[]{jointTransferActivity, rewardedAdListener}, -2079997205, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 2079997206, matches.onExtraCallback());
    }

    @Override // viva.republica.toss.account.group.Hilt_JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallback + 85;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallback + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 57;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.group.Hilt_JointTransferActivity, viva.republica.toss.send.AbsCompactSendActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = extraCallback + 115;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
    }

    static void setEngagementSignalsCallback() {
        access000 = new char[]{32265, 32281, 32284, 32287, 32279, 32468, 32270, 32283, 32272, 32271};
        IAuthTabCallbackStubProxy = -1184334204;
        writeTypedObject = true;
        readTypedObject = true;
    }
}
