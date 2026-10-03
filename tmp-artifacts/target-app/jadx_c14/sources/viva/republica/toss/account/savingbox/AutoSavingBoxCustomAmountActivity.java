package viva.republica.toss.account.savingbox;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.KeyboardBottomCta;
import im.toss.uikit.widget.textField.TextField;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertByteArrayToFloatArray;
import o.SetDetectableSize;
import o.accessgetStartTimeMscp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.savingbox.AutoSavingBoxCustomAmountActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AutoSavingBoxCustomAmountActivity extends BaseActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallbackDefault = 8;
    private long asBinder;
    private final Lazy IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxCustomAmountActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return AutoSavingBoxCustomAmountActivity.IAuthTabCallbackDefault(this.f$0);
        }
    });
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.savingbox.AutoSavingBoxCustomAmountActivity$$ExternalSyntheticLambda3
        public final Object invoke() {
            return AutoSavingBoxCustomAmountActivity.IAuthTabCallback(this.f$0);
        }
    });

    public long getScreenId() {
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextField IAuthTabCallback() {
        return (TextField) this.IAuthTabCallbackStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextField IAuthTabCallbackDefault(AutoSavingBoxCustomAmountActivity autoSavingBoxCustomAmountActivity) {
        return autoSavingBoxCustomAmountActivity.findViewById(R.id.text_field_amount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeyboardBottomCta onNavigationEvent() {
        return (KeyboardBottomCta) this.asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardBottomCta IAuthTabCallback(AutoSavingBoxCustomAmountActivity autoSavingBoxCustomAmountActivity) {
        return autoSavingBoxCustomAmountActivity.findViewById(R.id.bottom_cta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.savingbox_custom_amount);
        this.asBinder = getIntent().getLongExtra("previousAmount", 0L);
        TextField textFieldIAuthTabCallback = IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(textFieldIAuthTabCallback, "");
        TextField.setNumberFormat$default(textFieldIAuthTabCallback, 6, (TextField.onExtraCallbackWithResult) null, 2, (Object) null);
        IAuthTabCallback().setHint(getString(R.string.app_account_savingbox___3e42c7f0eb));
        if (this.asBinder > 0) {
            IAuthTabCallback().setText(String.valueOf(this.asBinder));
        }
        IAuthTabCallback().IAuthTabCallback(new onExtraCallback());
        KeyboardBottomCta keyboardBottomCtaOnNavigationEvent = onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(keyboardBottomCtaOnNavigationEvent, "");
        String string = getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        KeyboardBottomCta.setCta$default(keyboardBottomCtaOnNavigationEvent, string, new AutoSavingBoxCustomAmountActivity$.ExternalSyntheticLambda1(this), (TdsButtonV1View.asInterface) null, 4, (Object) null);
        ConvertByteArrayToFloatArray.onExtraCallback(1008569L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
    }

    public static final class onExtraCallback extends accessgetStartTimeMscp {
        onExtraCallback() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                AutoSavingBoxCustomAmountActivity autoSavingBoxCustomAmountActivity = AutoSavingBoxCustomAmountActivity.this;
                onExtraCallbackWithResult.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(editable.toString());
                if (iAuthTabCallbackOnExtraCallbackWithResult instanceof onExtraCallbackWithResult.IAuthTabCallback) {
                    autoSavingBoxCustomAmountActivity.IAuthTabCallback().setError(iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback());
                    autoSavingBoxCustomAmountActivity.asBinder = iAuthTabCallbackOnExtraCallbackWithResult.onExtraCallbackWithResult();
                    autoSavingBoxCustomAmountActivity.onNavigationEvent().onWarmupCompleted().setEnabled(true);
                } else {
                    autoSavingBoxCustomAmountActivity.IAuthTabCallback().setError(iAuthTabCallbackOnExtraCallbackWithResult.IAuthTabCallback());
                    autoSavingBoxCustomAmountActivity.onNavigationEvent().onWarmupCompleted().setEnabled(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallback(AutoSavingBoxCustomAmountActivity autoSavingBoxCustomAmountActivity, View view) {
        ConvertByteArrayToFloatArray.onExtraCallback(1008571L, false, (String) null, (Map) null, new AutoSavingBoxCustomAmountActivity$.ExternalSyntheticLambda0(autoSavingBoxCustomAmountActivity), 14, (Object) null);
        autoSavingBoxCustomAmountActivity.setResult(-1, new Intent().putExtra("newAmount", autoSavingBoxCustomAmountActivity.asBinder));
        autoSavingBoxCustomAmountActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(AutoSavingBoxCustomAmountActivity autoSavingBoxCustomAmountActivity, SetDetectableSize setDetectableSize) {
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("amount", Long.valueOf(autoSavingBoxCustomAmountActivity.asBinder));
        return Unit.INSTANCE;
    }

    public void onResume() {
        super.onResume();
        IAuthTabCallback().IAuthTabCallback().requestFocus();
    }

    public void onStart() {
        super.onStart();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onExtraCallback(@NotNull Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) AutoSavingBoxCustomAmountActivity.class).putExtra("previousAmount", j);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }
}
