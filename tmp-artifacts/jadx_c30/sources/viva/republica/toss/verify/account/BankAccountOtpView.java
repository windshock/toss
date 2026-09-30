package viva.republica.toss.verify.account;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.deprecated_proxy;
import o.deprecated_proxySelector;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.readIntokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class BankAccountOtpView extends FrameLayout {
    private final Lazy IAuthTabCallback;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountOtpView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BankAccountOtpView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccountOtpView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda0
            public final Object invoke() {
                return BankAccountOtpView.IAuthTabCallbackStub(this.f$0);
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda1
            public final Object invoke() {
                return BankAccountOtpView.onTransact(this.f$0);
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda2
            public final Object invoke() {
                return BankAccountOtpView.asBinder(this.f$0);
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda3
            public final Object invoke() {
                return BankAccountOtpView.access000(this.f$0);
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda4
            public final Object invoke() {
                return BankAccountOtpView.getInterfaceDescriptor(this.f$0);
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda5
            public final Object invoke() {
                return BankAccountOtpView.IAuthTabCallbackStubProxy(this.f$0);
            }
        });
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.verify.account.BankAccountOtpView$$ExternalSyntheticLambda6
            public final Object invoke() {
                return BankAccountOtpView.IAuthTabCallback_Parcel(this.f$0);
            }
        });
        View.inflate(context, R.layout.view_bank_account_otp, this);
        asBinder();
    }

    public /* synthetic */ BankAccountOtpView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asBinder(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asInterface implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public asInterface(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
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

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onTransact(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    private final EditText onExtraCallback() {
        Object value = this.onExtraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (EditText) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText IAuthTabCallbackStub(BankAccountOtpView bankAccountOtpView) {
        return (EditText) bankAccountOtpView.findViewById(R.id.hidden_input);
    }

    private final TdsRoundLayout onExtraCallbackWithResult() {
        Object value = this.onWarmupCompleted.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (TdsRoundLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TdsRoundLayout onTransact(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp1);
    }

    private final BaseTextView IAuthTabCallback() {
        Object value = this.onExtraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (BaseTextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseTextView asBinder(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp1Value);
    }

    private final TdsRoundLayout onNavigationEvent() {
        Object value = this.onNavigationEvent.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (TdsRoundLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TdsRoundLayout access000(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp2);
    }

    private final BaseTextView onWarmupCompleted() {
        Object value = this.IAuthTabCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (BaseTextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseTextView getInterfaceDescriptor(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp2Value);
    }

    private final TdsRoundLayout asInterface() {
        Object value = this.asInterface.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (TdsRoundLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TdsRoundLayout IAuthTabCallbackStubProxy(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp3);
    }

    private final BaseTextView IAuthTabCallbackDefault() {
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, BuildConfig.FLAVOR);
        return (BaseTextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseTextView IAuthTabCallback_Parcel(BankAccountOtpView bankAccountOtpView) {
        return bankAccountOtpView.findViewById(R.id.otp3Value);
    }

    private final void asBinder() {
        onExtraCallback().addTextChangedListener(new onNavigationEvent());
        IAuthTabCallback(0);
    }

    public static final class onNavigationEvent implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onNavigationEvent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            BankAccountOtpView bankAccountOtpView = BankAccountOtpView.this;
            Character orNull = StringsKt.getOrNull(strValueOf, 0);
            String strValueOf2 = orNull != null ? String.valueOf(orNull.charValue()) : null;
            String str = BuildConfig.FLAVOR;
            if (strValueOf2 == null) {
                strValueOf2 = BuildConfig.FLAVOR;
            }
            Character orNull2 = StringsKt.getOrNull(strValueOf, 1);
            String strValueOf3 = orNull2 != null ? String.valueOf(orNull2.charValue()) : null;
            if (strValueOf3 == null) {
                strValueOf3 = BuildConfig.FLAVOR;
            }
            Character orNull3 = StringsKt.getOrNull(strValueOf, 2);
            String strValueOf4 = orNull3 != null ? String.valueOf(orNull3.charValue()) : null;
            if (strValueOf4 != null) {
                str = strValueOf4;
            }
            bankAccountOtpView.onExtraCallbackWithResult(strValueOf2, strValueOf3, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult(String str, String str2, String str3) {
        IAuthTabCallback(str, IAuthTabCallback());
        IAuthTabCallback(str2, onWarmupCompleted());
        IAuthTabCallback(str3, IAuthTabCallbackDefault());
        IAuthTabCallback(str.length() + str2.length() + str3.length());
    }

    private final void IAuthTabCallback(String str, BaseTextView baseTextView) {
        if (Intrinsics.areEqual(str, baseTextView.getText())) {
            return;
        }
        baseTextView.setText(str);
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(baseTextView, deprecated_proxy.onNavigationEvent.onExtraCallback(deprecated_proxySelector.BIG).onNavigationEvent(), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 1916, (Object) null), false, 1, (Object) null);
    }

    private final void IAuthTabCallback(int i) {
        if (i == 0) {
            TdsRoundLayout tdsRoundLayoutOnExtraCallbackWithResult = onExtraCallbackWithResult();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, BuildConfig.FLAVOR);
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, BuildConfig.FLAVOR);
            tdsRoundLayoutOnExtraCallbackWithResult.setBackgroundColor(new getUrlokhttp(new IAuthTabCallback(configuration)).onMessageChannelReady());
            TdsRoundLayout tdsRoundLayoutOnNavigationEvent = onNavigationEvent();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, BuildConfig.FLAVOR);
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, BuildConfig.FLAVOR);
            tdsRoundLayoutOnNavigationEvent.setBackgroundColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).extraCallback());
            TdsRoundLayout tdsRoundLayoutAsInterface = asInterface();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, BuildConfig.FLAVOR);
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, BuildConfig.FLAVOR);
            tdsRoundLayoutAsInterface.setBackgroundColor(new getUrlokhttp(new onWarmupCompleted(configuration3)).extraCallback());
            return;
        }
        if (i == 1) {
            TdsRoundLayout tdsRoundLayoutOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, BuildConfig.FLAVOR);
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, BuildConfig.FLAVOR);
            tdsRoundLayoutOnExtraCallbackWithResult2.setBackgroundColor(new getUrlokhttp(new onExtraCallback(configuration4)).extraCallback());
            TdsRoundLayout tdsRoundLayoutOnNavigationEvent2 = onNavigationEvent();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, BuildConfig.FLAVOR);
            Configuration configuration5 = context5.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration5, BuildConfig.FLAVOR);
            tdsRoundLayoutOnNavigationEvent2.setBackgroundColor(new getUrlokhttp(new IAuthTabCallbackStub(configuration5)).onMessageChannelReady());
            TdsRoundLayout tdsRoundLayoutAsInterface2 = asInterface();
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, BuildConfig.FLAVOR);
            Configuration configuration6 = context6.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration6, BuildConfig.FLAVOR);
            tdsRoundLayoutAsInterface2.setBackgroundColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration6)).extraCallback());
            return;
        }
        if (i != 2) {
            return;
        }
        TdsRoundLayout tdsRoundLayoutOnExtraCallbackWithResult3 = onExtraCallbackWithResult();
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, BuildConfig.FLAVOR);
        Configuration configuration7 = context7.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration7, BuildConfig.FLAVOR);
        tdsRoundLayoutOnExtraCallbackWithResult3.setBackgroundColor(new getUrlokhttp(new asBinder(configuration7)).extraCallback());
        TdsRoundLayout tdsRoundLayoutOnNavigationEvent3 = onNavigationEvent();
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, BuildConfig.FLAVOR);
        Configuration configuration8 = context8.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration8, BuildConfig.FLAVOR);
        tdsRoundLayoutOnNavigationEvent3.setBackgroundColor(new getUrlokhttp(new asInterface(configuration8)).extraCallback());
        TdsRoundLayout tdsRoundLayoutAsInterface3 = asInterface();
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, BuildConfig.FLAVOR);
        Configuration configuration9 = context9.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration9, BuildConfig.FLAVOR);
        tdsRoundLayoutAsInterface3.setBackgroundColor(new getUrlokhttp(new onTransact(configuration9)).onMessageChannelReady());
    }
}
