package viva.republica.toss.iap;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.widget.textField.TextField;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CERT_GetSubjectAltName_RealName;
import o.DERTaggedObject;
import o.QueryProductDetailsParamsProduct;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getPurchasesList;
import o.maybeUpdateAnimatable;
import o.setRandomHost;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.iap.InAppPurchaseDemoActivity$;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;

@DERTaggedObject
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InAppPurchaseDemoActivity extends BaseActivity {
    private final QueryProductDetailsParamsProduct IAuthTabCallbackDefault = new QueryProductDetailsParamsProduct.onExtraCallbackWithResult().onExtraCallback(this);
    private CERT_GetSubjectAltName_RealName asBinder;

    public long getScreenId() {
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealNameIAuthTabCallback = CERT_GetSubjectAltName_RealName.IAuthTabCallback(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cERT_GetSubjectAltName_RealNameIAuthTabCallback, "");
        this.asBinder = cERT_GetSubjectAltName_RealNameIAuthTabCallback;
        if (cERT_GetSubjectAltName_RealNameIAuthTabCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cERT_GetSubjectAltName_RealNameIAuthTabCallback = null;
        }
        setContentView(cERT_GetSubjectAltName_RealNameIAuthTabCallback.IAuthTabCallback());
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName = this.asBinder;
        if (cERT_GetSubjectAltName_RealName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cERT_GetSubjectAltName_RealName = null;
        }
        cERT_GetSubjectAltName_RealName.onExtraCallbackWithResult.setText("iap_sample_product_id");
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName2 = this.asBinder;
        if (cERT_GetSubjectAltName_RealName2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cERT_GetSubjectAltName_RealName2 = null;
        }
        cERT_GetSubjectAltName_RealName2.onExtraCallback.setOnClickListener(new InAppPurchaseDemoActivity$.ExternalSyntheticLambda0(this));
        this.IAuthTabCallbackDefault.onNavigationEvent(new onExtraCallbackWithResult());
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(this, (access13800) null), 3, (Object) null);
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return InAppPurchaseDemoActivity.this.new onExtraCallback(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                QueryProductDetailsParamsProduct queryProductDetailsParamsProduct = InAppPurchaseDemoActivity.this.IAuthTabCallbackDefault;
                CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName = InAppPurchaseDemoActivity.this.asBinder;
                if (cERT_GetSubjectAltName_RealName == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    cERT_GetSubjectAltName_RealName = null;
                }
                String string = ((Editable) TextField.onExtraCallbackWithResult(NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), 450491628, new Object[]{cERT_GetSubjectAltName_RealName.onExtraCallbackWithResult}, -450491624, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback())).toString();
                this.label = 1;
                objOnExtraCallback = queryProductDetailsParamsProduct.onExtraCallback(string, this);
                if (objOnExtraCallback == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                objOnExtraCallback = ((Result) obj).onNavigationEvent();
            }
            InAppPurchaseDemoActivity inAppPurchaseDemoActivity = InAppPurchaseDemoActivity.this;
            if (Result.onNavigationEvent(objOnExtraCallback)) {
                inAppPurchaseDemoActivity.onWarmupCompleted("Purchase successful: " + ((String) objOnExtraCallback));
            }
            InAppPurchaseDemoActivity inAppPurchaseDemoActivity2 = InAppPurchaseDemoActivity.this;
            Throwable th = Result.exceptionOrNull-impl(objOnExtraCallback);
            if (th != null) {
                inAppPurchaseDemoActivity2.onWarmupCompleted("Purchase failed: " + th);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(InAppPurchaseDemoActivity inAppPurchaseDemoActivity, View view) {
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(inAppPurchaseDemoActivity), (CoroutineContext) null, (setRandomHost) null, inAppPurchaseDemoActivity.new onExtraCallback(null), 3, (Object) null);
    }

    public static final class onExtraCallbackWithResult implements getPurchasesList {
        onExtraCallbackWithResult() {
        }

        public void onExtraCallbackWithResult() {
            InAppPurchaseDemoActivity.this.onWarmupCompleted("Billing client connected");
            CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName = InAppPurchaseDemoActivity.this.asBinder;
            if (cERT_GetSubjectAltName_RealName == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cERT_GetSubjectAltName_RealName = null;
            }
            cERT_GetSubjectAltName_RealName.IAuthTabCallback.setText("Connected");
        }

        public void IAuthTabCallback() {
            InAppPurchaseDemoActivity.this.onWarmupCompleted("Billing client disconnected");
            CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName = InAppPurchaseDemoActivity.this.asBinder;
            if (cERT_GetSubjectAltName_RealName == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cERT_GetSubjectAltName_RealName = null;
            }
            cERT_GetSubjectAltName_RealName.IAuthTabCallback.setText("Disconnected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(String str) {
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName = this.asBinder;
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName2 = null;
        if (cERT_GetSubjectAltName_RealName == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            cERT_GetSubjectAltName_RealName = null;
        }
        String string = cERT_GetSubjectAltName_RealName.onNavigationEvent.getText().toString();
        CERT_GetSubjectAltName_RealName cERT_GetSubjectAltName_RealName3 = this.asBinder;
        if (cERT_GetSubjectAltName_RealName3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            cERT_GetSubjectAltName_RealName2 = cERT_GetSubjectAltName_RealName3;
        }
        Typography6 typography6 = cERT_GetSubjectAltName_RealName2.onNavigationEvent;
        if (string.length() != 0) {
            str = string + "\n" + str;
        }
        typography6.setText(str);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
