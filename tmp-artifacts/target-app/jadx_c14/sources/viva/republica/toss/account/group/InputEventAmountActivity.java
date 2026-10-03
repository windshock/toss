package viva.republica.toss.account.group;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppLovinAdServiceImplc;
import o.GraniteModule_onEventListenerRemoved;
import o.IPostMessageServiceStubProxy;
import o.M_;
import o.ProfileInstallerExternalSyntheticLambda0;
import o.RewardedInterstitialAdRewardedInterstitialLoadAdConfig;
import o.RewardedInterstitialAdRewardedInterstitialShowAdConfig;
import o.deserializeUriNullableCollection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.group.InputEventAmountActivity$;
import viva.republica.toss.account.group.InputEventNameActivity;
import viva.republica.toss.account.group.JointRecurringPicker;
import viva.republica.toss.account.group.JointRecurringPickerDialog;
import viva.republica.toss.widget.NumberEditText;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class InputEventAmountActivity extends Hilt_InputEventAmountActivity {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onTransact = 8;
    private TdsButtonV1View IAuthTabCallbackDefault;
    private String IAuthTabCallbackStub = "";
    private long IAuthTabCallbackStubProxy;
    private ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> IAuthTabCallback_Parcel;
    private View ICustomTabsCallback;
    private int access000;
    private NumberEditText access100;

    @Inject
    public AppLovinAdServiceImplc analyticsHelper;
    private TextView asBinder;
    private TdsCheckBoxV1View asInterface;
    private ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> getInterfaceDescriptor;
    private Toolbar readTypedObject;

    public long getScreenId() {
        return -1L;
    }

    public final AppLovinAdServiceImplc IAuthTabCallback() {
        AppLovinAdServiceImplc appLovinAdServiceImplc = this.analyticsHelper;
        if (appLovinAdServiceImplc != null) {
            return appLovinAdServiceImplc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    @Override // viva.republica.toss.account.group.Hilt_InputEventAmountActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_input_event_amount);
        setEngagementSignalsCallback();
        onExtraCallbackWithResult(bundle);
        ICustomTabsServiceDefault();
    }

    public String getScreenName() {
        return "s77_accntjoint_input_amount";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10101 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        Toolbar toolbar = this.readTypedObject;
        if (toolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            toolbar = null;
        }
        toolbar.showOverflowMenu();
        setSupportActionBar(toolbar);
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onExtraCallbackWithResult(getString(R.string.InputEventAmountActivity));
            supportActionBar.onNavigationEvent(true);
        }
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> arrayList = this.getInterfaceDescriptor;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList = null;
        }
        bundle.putParcelableArrayList("extra.members", arrayList);
        bundle.putString("extra.accountId", this.IAuthTabCallbackStub);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("extra.accountId", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.IAuthTabCallbackStub = string;
            ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> parcelableArrayList = bundle.getParcelableArrayList("extra.members");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList<>();
            }
            this.getInterfaceDescriptor = parcelableArrayList;
            ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> parcelableArrayList2 = bundle.getParcelableArrayList("extra.invites");
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = new ArrayList<>();
            }
            this.IAuthTabCallback_Parcel = parcelableArrayList2;
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("extra.accountId");
            this.IAuthTabCallbackStub = stringExtra != null ? stringExtra : "";
            ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra.members");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = new ArrayList<>();
            }
            this.getInterfaceDescriptor = parcelableArrayListExtra;
            ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("extra.invites");
            if (parcelableArrayListExtra2 == null) {
                parcelableArrayListExtra2 = new ArrayList<>();
            }
            this.IAuthTabCallback_Parcel = parcelableArrayListExtra2;
        }
    }

    private final void setEngagementSignalsCallback() {
        Toolbar toolbarFindViewById = findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(toolbarFindViewById, "");
        this.readTypedObject = toolbarFindViewById;
        NumberEditText numberEditTextFindViewById = findViewById(R.id.input_amount);
        Intrinsics.checkNotNullExpressionValue(numberEditTextFindViewById, "");
        this.access100 = numberEditTextFindViewById;
        View viewFindViewById = findViewById(R.id.input_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.ICustomTabsCallback = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.auto_recurring_desc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.asBinder = (TextView) viewFindViewById2;
        TdsCheckBoxV1View tdsCheckBoxV1ViewFindViewById = findViewById(R.id.auto_recurring_checkbox);
        Intrinsics.checkNotNullExpressionValue(tdsCheckBoxV1ViewFindViewById, "");
        this.asInterface = tdsCheckBoxV1ViewFindViewById;
        TdsButtonV1View tdsButtonV1ViewFindViewById = findViewById(R.id.confirm_cta);
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1ViewFindViewById, "");
        this.IAuthTabCallbackDefault = tdsButtonV1ViewFindViewById;
        onNavigationEvent();
    }

    private final void ICustomTabsServiceDefault() {
        View view = this.IAuthTabCallbackDefault;
        TdsCheckBoxV1View tdsCheckBoxV1View = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = RxView.onNavigationEvent(view).onTransact(2L, TimeUnit.SECONDS).IAuthTabCallback(new InputEventAmountActivity$.ExternalSyntheticLambda1(new InputEventAmountActivity$.ExternalSyntheticLambda0(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
        View view2 = this.access100;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback2 = RxView.onExtraCallback(view2).IAuthTabCallback(new InputEventAmountActivity$.ExternalSyntheticLambda3(new InputEventAmountActivity$.ExternalSyntheticLambda2(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback2, "");
        onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback2);
        TextView textView = this.access100;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView = null;
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = RxTextView.onWarmupCompleted(textView).onExtraCallbackWithResult(new InputEventAmountActivity$.ExternalSyntheticLambda5(new InputEventAmountActivity$.ExternalSyntheticLambda4(this)), new InputEventAmountActivity$.ExternalSyntheticLambda7(new InputEventAmountActivity$.ExternalSyntheticLambda6(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        onNavigationEvent(deserializeurinullablecollectionOnExtraCallbackWithResult);
        NumberEditText numberEditText = this.access100;
        if (numberEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            numberEditText = null;
        }
        numberEditText.onExtraCallbackWithResult(new onWarmupCompleted());
        TdsCheckBoxV1View tdsCheckBoxV1View2 = this.asInterface;
        if (tdsCheckBoxV1View2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            tdsCheckBoxV1View = tdsCheckBoxV1View2;
        }
        tdsCheckBoxV1View.setOnCheckedChangeListener(new InputEventAmountActivity$.ExternalSyntheticLambda8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(InputEventAmountActivity inputEventAmountActivity, Unit unit) {
        ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> arrayList;
        ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> arrayList2;
        M_ m_ = M_.onExtraCallback;
        View view = inputEventAmountActivity.access100;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        m_.onExtraCallback(view);
        InputEventNameActivity.onNavigationEvent onnavigationevent = InputEventNameActivity.Companion;
        String str = inputEventAmountActivity.IAuthTabCallbackStub;
        NumberEditText numberEditText = inputEventAmountActivity.access100;
        if (numberEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            numberEditText = null;
        }
        long jLongValue = numberEditText.onNavigationEvent().longValue();
        ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> arrayList3 = inputEventAmountActivity.getInterfaceDescriptor;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList = null;
        } else {
            arrayList = arrayList3;
        }
        ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> arrayList4 = inputEventAmountActivity.IAuthTabCallback_Parcel;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            arrayList2 = null;
        } else {
            arrayList2 = arrayList4;
        }
        inputEventAmountActivity.startActivityForResult(onnavigationevent.onNavigationEvent(inputEventAmountActivity, str, jLongValue, arrayList, arrayList2, inputEventAmountActivity.access000), 10101);
        HashMap map = new HashMap();
        map.put("amount", Long.valueOf(inputEventAmountActivity.IAuthTabCallbackStubProxy));
        inputEventAmountActivity.IAuthTabCallback().onExtraCallback(inputEventAmountActivity.getScreenName(), "confirm_amount", "accnt_joint", map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(InputEventAmountActivity inputEventAmountActivity, Boolean bool) {
        View view = inputEventAmountActivity.ICustomTabsCallback;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setBackgroundResource(bool.booleanValue() ? im.toss.tds.R.color.light_theme_blue_500 : im.toss.tds.R.color.grey_100);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access000(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(InputEventAmountActivity inputEventAmountActivity, ProfileInstallerExternalSyntheticLambda0 profileInstallerExternalSyntheticLambda0) {
        TdsButtonV1View tdsButtonV1View = inputEventAmountActivity.IAuthTabCallbackDefault;
        if (tdsButtonV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsButtonV1View = null;
        }
        Editable editableOnExtraCallback = profileInstallerExternalSyntheticLambda0.onExtraCallback();
        boolean z = false;
        if ((editableOnExtraCallback != null ? editableOnExtraCallback.length() : 0) > 0 && Integer.parseInt(StringsKt.replace$default(String.valueOf(profileInstallerExternalSyntheticLambda0.onExtraCallback()), ",", "", false, 4, (Object) null)) > 0) {
            z = true;
        }
        tdsButtonV1View.setEnabled(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void access100(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(InputEventAmountActivity inputEventAmountActivity, Throwable th) {
        TdsButtonV1View tdsButtonV1View = inputEventAmountActivity.IAuthTabCallbackDefault;
        if (tdsButtonV1View == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            tdsButtonV1View = null;
        }
        tdsButtonV1View.setEnabled(false);
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements NumberEditText.IAuthTabCallbackStub {
        onWarmupCompleted() {
        }

        public void IAuthTabCallback(NumberEditText numberEditText, String str, Number number) {
            Intrinsics.checkNotNullParameter(numberEditText, "");
            Intrinsics.checkNotNullParameter(number, "");
            long jLongValue = number.longValue();
            if (jLongValue > 500000) {
                NumberEditText numberEditText2 = InputEventAmountActivity.this.access100;
                if (numberEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    numberEditText2 = null;
                }
                numberEditText2.setNumber(500000L);
                return;
            }
            InputEventAmountActivity.this.IAuthTabCallbackStubProxy = jLongValue;
        }
    }

    public static final class onNavigationEvent implements JointRecurringPickerDialog.onNavigationEvent {
        final /* synthetic */ TdsCheckBoxV1View onNavigationEvent;

        onNavigationEvent(TdsCheckBoxV1View tdsCheckBoxV1View) {
            this.onNavigationEvent = tdsCheckBoxV1View;
        }

        public void onExtraCallback() {
            InputEventAmountActivity.this.access000 = 0;
            TextView textView = InputEventAmountActivity.this.asBinder;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(InputEventAmountActivity.this.getString(R.string.app_account_group___43f8033eb6));
            this.onNavigationEvent.setChecked(false);
        }

        public void IAuthTabCallback(JointRecurringPicker.onExtraCallback onextracallback, String str, String str2) {
            Intrinsics.checkNotNullParameter(onextracallback, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            TextView textView = InputEventAmountActivity.this.asBinder;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            String string = InputEventAmountActivity.this.getString(R.string.app_account_group___86e81ced89, str2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            textView.setText(GraniteModule_onEventListenerRemoved.onExtraCallback(string, new Object[0]));
            InputEventAmountActivity.this.access000 = Integer.parseInt(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onNavigationEvent(InputEventAmountActivity inputEventAmountActivity, TdsCheckBoxV1View tdsCheckBoxV1View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV1View, "");
        if (z) {
            new JointRecurringPickerDialog(inputEventAmountActivity, (List) null, inputEventAmountActivity.new onNavigationEvent(tdsCheckBoxV1View), 2, (DefaultConstructorMarker) null).show();
        } else {
            inputEventAmountActivity.access000 = 0;
            TextView textView = inputEventAmountActivity.asBinder;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView = null;
            }
            textView.setText(inputEventAmountActivity.getString(R.string.app_account_group___43f8033eb6));
        }
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.account.group.Hilt_InputEventAmountActivity
    public void onStart() {
        super.onStart();
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, @NotNull ArrayList<RewardedInterstitialAdRewardedInterstitialShowAdConfig> arrayList, @NotNull ArrayList<RewardedInterstitialAdRewardedInterstitialLoadAdConfig> arrayList2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intent intent = new Intent(context, (Class<?>) InputEventAmountActivity.class);
            intent.putExtra("extra.accountId", str);
            intent.putParcelableArrayListExtra("extra.members", arrayList);
            intent.putParcelableArrayListExtra("extra.invites", arrayList2);
            return intent;
        }
    }

    @Override // viva.republica.toss.account.group.Hilt_InputEventAmountActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.account.group.Hilt_InputEventAmountActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.account.group.Hilt_InputEventAmountActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
