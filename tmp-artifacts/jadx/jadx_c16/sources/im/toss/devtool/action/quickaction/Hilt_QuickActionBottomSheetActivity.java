package im.toss.devtool.action.quickaction;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.reflect.Constructor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ContactPickerCallback;
import o.PathMotion;
import o.access002;
import o.animate;
import o.captureEndValues;
import o.isValidMatch;
import o.matchNames;
import o.readDataToParcelable;
import o.writeTypedList;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Hilt_QuickActionBottomSheetActivity extends UIKitBaseActivity implements captureEndValues {
    private static int access100 = 1;
    private static int asBinder;
    private isValidMatch IAuthTabCallbackDefault;
    private final Object IAuthTabCallbackStub;
    private boolean asInterface;
    private volatile access002 onTransact;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i) | i3 | i2);
        int i8 = ~((~i3) | i);
        int i9 = ~i2;
        int i10 = i8 | (~(i9 | i));
        int i11 = ~(i9 | i3);
        int i12 = i + i3 + i4 + ((-1568348280) * i5) + (1617068012 * i6);
        int i13 = i12 * i12;
        int i14 = (((-430874860) * i) - 739508224) + (1544986862 * i3) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i4) + ((-1885339648) * i5) + (1743781888 * i6) + (858456064 * i13);
        int i15 = (i * (-973781596)) + 539565670 + (i3 * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i4 * (-973780651)) + (i5 * 424585256) + (i6 * 537576796) + (i13 * 1078394880);
        int i16 = i14 + (i15 * i15 * 192741376);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    Hilt_QuickActionBottomSheetActivity() {
        this.IAuthTabCallbackStub = new Object();
        this.asInterface = false;
        onExtraCallbackWithResult(443994422, ContactPickerCallback.onExtraCallbackWithResult(), -443994419, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 542131562, new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    Hilt_QuickActionBottomSheetActivity(int i) {
        super(i);
        this.IAuthTabCallbackStub = new Object();
        this.asInterface = false;
        onExtraCallbackWithResult(443994422, ContactPickerCallback.onExtraCallbackWithResult(), -443994419, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 542131562, new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        Hilt_QuickActionBottomSheetActivity hilt_QuickActionBottomSheetActivity = (Hilt_QuickActionBottomSheetActivity) objArr[0];
        int i = 2 % 2;
        try {
            Object[] objArr2 = {hilt_QuickActionBottomSheetActivity};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1605700054);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), Drawable.resolveOpacity(0, 0) + 72, TextUtils.indexOf((CharSequence) "", '0') + 8849, -1861613382, false, (String) null, new Class[]{Hilt_QuickActionBottomSheetActivity.class});
            }
            hilt_QuickActionBottomSheetActivity.addOnContextAvailableListener((writeTypedList) ((Constructor) objOnExtraCallback).newInstance(objArr2));
            int i2 = asBinder + 47;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ComponentActivity componentActivity = (Hilt_QuickActionBottomSheetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 & 95;
        int i4 = ((i2 | 95) & (~i3)) + (i3 << 1);
        access100 = i4 % 128;
        int i5 = i4 % 2;
        if (componentActivity.getApplication() instanceof matchNames) {
            int i6 = access100 + 67;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            isValidMatch isvalidmatchOnWarmupCompleted = ((access002) onExtraCallbackWithResult(-905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{componentActivity}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).onWarmupCompleted();
            ((Hilt_QuickActionBottomSheetActivity) componentActivity).IAuthTabCallbackDefault = isvalidmatchOnWarmupCompleted;
            if (isvalidmatchOnWarmupCompleted.onExtraCallback()) {
                int i8 = asBinder;
                int i9 = i8 & 73;
                int i10 = i9 + ((i8 ^ 73) | i9);
                access100 = i10 % 128;
                if (i10 % 2 == 0) {
                    ((Hilt_QuickActionBottomSheetActivity) componentActivity).IAuthTabCallbackDefault.onExtraCallback(componentActivity.getDefaultViewModelCreationExtras());
                    throw null;
                }
                ((Hilt_QuickActionBottomSheetActivity) componentActivity).IAuthTabCallbackDefault.onExtraCallback(componentActivity.getDefaultViewModelCreationExtras());
            }
        }
        int i11 = asBinder;
        int i12 = i11 & 1;
        int i13 = (i11 ^ 1) | i12;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        access100 = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = (((i2 ^ 39) | (i2 & 39)) << 1) - (((~i2) & 39) | (i2 & (-40)));
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            super.onCreate(bundle);
            onExtraCallbackWithResult(-4647819, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 4647820, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
            int i4 = access100;
            int i5 = i4 & 41;
            int i6 = -(-((i4 ^ 41) | i5));
            int i7 = (i5 & i6) + (i6 | i5);
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        super.onCreate(bundle);
        onExtraCallbackWithResult(-4647819, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 4647820, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        throw null;
    }

    public void onDestroy() throws NoSuchMethodException, SecurityException {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = (((i2 ^ 5) | (i2 & 5)) << 1) - (((~i2) & 5) | (i2 & (-6)));
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            super.onDestroy();
            isValidMatch isvalidmatch = this.IAuthTabCallbackDefault;
            if (isvalidmatch != null) {
                isvalidmatch.onNavigationEvent();
                int i4 = access100;
                int i5 = i4 & 57;
                int i6 = i5 + ((i4 ^ 57) | i5);
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
            ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length();
            ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5);
            return;
        }
        super.onDestroy();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Hilt_QuickActionBottomSheetActivity hilt_QuickActionBottomSheetActivity = (Hilt_QuickActionBottomSheetActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = ((access002) onExtraCallbackWithResult(-905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{hilt_QuickActionBottomSheetActivity}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent())).generatedComponent();
        int i4 = asBinder;
        int i5 = (i4 & (-44)) | ((~i4) & 43);
        int i6 = (i4 & 43) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return objGeneratedComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected access002 onExtraCallback() {
        int i = 2 % 2;
        access002 access002Var = new access002(this);
        int i2 = asBinder;
        int i3 = i2 & 39;
        int i4 = ((((i2 ^ 39) | i3) << 1) - (~(-((i2 | 39) & (~i3))))) - 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return access002Var;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Hilt_QuickActionBottomSheetActivity hilt_QuickActionBottomSheetActivity = (Hilt_QuickActionBottomSheetActivity) objArr[0];
        if (hilt_QuickActionBottomSheetActivity.onTransact == null) {
            synchronized (hilt_QuickActionBottomSheetActivity.IAuthTabCallbackStub) {
                if (hilt_QuickActionBottomSheetActivity.onTransact == null) {
                    hilt_QuickActionBottomSheetActivity.onTransact = hilt_QuickActionBottomSheetActivity.onExtraCallback();
                }
            }
        }
        return hilt_QuickActionBottomSheetActivity.onTransact;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted() {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = (((i2 ^ 13) | (i2 & 13)) << 1) - (((~i2) & 13) | (i2 & (-14)));
        int i4 = i3 % 128;
        access100 = i4;
        if (i3 % 2 == 0) {
            int i5 = 44 / 0;
            if (!this.asInterface) {
                int i6 = (-2) - (((i4 ^ 30) + ((i4 & 30) << 1)) ^ (-1));
                asBinder = i6 % 128;
                if (i6 % 2 != 0) {
                    this.asInterface = true;
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(-848042054, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 848042056, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
                } else {
                    this.asInterface = true;
                    objOnExtraCallbackWithResult = onExtraCallbackWithResult(-848042054, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 848042056, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
                }
                readDataToParcelable readdatatoparcelable = (readDataToParcelable) objOnExtraCallbackWithResult;
                Object objOnExtraCallbackWithResult2 = animate.onExtraCallbackWithResult(this);
                int i7 = access100;
                int i8 = (((i7 & (-92)) | ((~i7) & 91)) - (~(-(-((i7 & 91) << 1))))) - 1;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                readdatatoparcelable.IAuthTabCallback((QuickActionBottomSheetActivity) objOnExtraCallbackWithResult2);
                int i10 = access100 + 37;
                asBinder = i10 % 128;
                int i11 = i10 % 2;
            }
        } else if (!this.asInterface) {
        }
        int i12 = access100 + 117;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
    }

    public ViewModelProvider.onWarmupCompleted getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 & 13;
        int i4 = (i2 | 13) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        ViewModelProvider.onWarmupCompleted onWarmupCompleted = PathMotion.onWarmupCompleted(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
        if (i7 != 0) {
            int i8 = 51 / 0;
        }
        int i9 = access100;
        int i10 = (((i9 & (-114)) | ((~i9) & 113)) - (~((i9 & 113) << 1))) - 1;
        asBinder = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 27 / 0;
        }
        return onWarmupCompleted;
    }

    private void IAuthTabCallback() {
        onExtraCallbackWithResult(443994422, ContactPickerCallback.onExtraCallbackWithResult(), -443994419, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 542131562, new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private void onNavigationEvent() {
        onExtraCallbackWithResult(-4647819, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 4647820, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public final access002 onExtraCallbackWithResult() {
        return (access002) onExtraCallbackWithResult(-905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 905575755, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    public final Object generatedComponent() {
        return onExtraCallbackWithResult(-848042054, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 848042056, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
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
