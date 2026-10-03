package viva.republica.toss.home.consumption.transaction;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.text.Typography7;
import im.toss.uikit.widget.textField.BaseEditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceAuth;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMS_EncryptedData;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultReactHostDelegate;
import o.DomainConfigProxy;
import o.FullScreenAd;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NetConverter3;
import o.TombstoneProtosMemoryMappingBuilder;
import o.clearTid;
import o.deserializeUriNullableCollection;
import o.extractConfidence;
import o.formatToParts;
import o.getInstanceIfInitialized;
import o.getParamImp;
import o.initMiniApp;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.home.consumption.transaction.TransactionMemoActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransactionMemoActivity extends Hilt_TransactionMemoActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static char[] access100 = null;
    public static final int asBinder;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;

    @Inject
    public DomainConfigProxy homeChangeHelper;
    private boolean onTransact;
    private final Lazy asInterface = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallbackWithResult(this));
    private String getInterfaceDescriptor = "";
    private ArrayList<String> IAuthTabCallbackStubProxy = new ArrayList<>();
    private String access000 = "";
    private String IAuthTabCallbackStub = "";
    private String IAuthTabCallbackDefault = "";

    static {
        setEngagementSignalsCallback();
        Companion = new IAuthTabCallback(null);
        asBinder = 8;
        int i = extraCallbackWithResult + 45;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~((~i3) | i6);
        int i11 = i9 | i10 | (~(i6 | i5));
        int i12 = (~(i5 | i3)) | (~(i7 | i3));
        int i13 = i8 | i10;
        int i14 = i3 + i6 + i + (793188503 * i2) + (2090109681 * i4);
        int i15 = i14 * i14;
        int i16 = (837707615 * i3) + 1286602752 + ((-1676358574) * i6) + (i11 * (-838022063)) + (1676044126 * i12) + ((-838022063) * i13) + ((-838336512) * i) + (1186463744 * i2) + (1166540800 * i4) + ((-1956446208) * i15);
        int i17 = ((i3 * 1389925299) - 652765764) + (i6 * 1389927018) + (i11 * 573) + (i12 * (-1146)) + (i13 * 573) + (i * 1389926445) + (i2 * (-1551828341)) + (i4 * (-2047638435)) + (i15 * 1214709760);
        int i18 = i16 + (i17 * i17 * 445972480);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? onWarmupCompleted(objArr) : asInterface(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(TransactionMemoActivity transactionMemoActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(transactionMemoActivity);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 43;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 21;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 19;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) IAuthTabCallback(new Object[]{dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 160875267, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -160875267);
        }
        int i3 = 74 / 0;
        return (Unit) IAuthTabCallback(new Object[]{dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 160875267, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -160875267);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TransactionMemoActivity transactionMemoActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(transactionMemoActivity, deserializeurinullablecollection);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Unit unit;
        TransactionMemoActivity transactionMemoActivity = (TransactionMemoActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            unit = (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, th}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -317871968, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 317871970);
            int i3 = 46 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, th}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -317871968, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 317871970);
        }
        int i4 = readTypedObject + 117;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(TransactionMemoActivity transactionMemoActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = readTypedObject + 117;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(transactionMemoActivity, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(transactionMemoActivity, commonModule_setLeftEdgeTouchEnabled);
        int i3 = readTypedObject + 55;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onNavigationEvent(TransactionMemoActivity transactionMemoActivity, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 47;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(transactionMemoActivity, obj);
        int i4 = readTypedObject + 95;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransactionMemoActivity transactionMemoActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = readTypedObject + 1;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -407071084, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 407071088);
        int i4 = extraCallback + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<CMS_EncryptedData> {
        final /* synthetic */ Activity onExtraCallback;

        public onExtraCallbackWithResult(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final CMS_EncryptedData invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMS_EncryptedData.onExtraCallbackWithResult(layoutInflater);
        }
    }

    public static final /* synthetic */ String onNavigationEvent(TransactionMemoActivity transactionMemoActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        String str = transactionMemoActivity.IAuthTabCallbackDefault;
        int i5 = i3 + 59;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ CMS_EncryptedData onWarmupCompleted(TransactionMemoActivity transactionMemoActivity) {
        CMS_EncryptedData cMS_EncryptedData;
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {transactionMemoActivity};
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (i3 == 0) {
            cMS_EncryptedData = (CMS_EncryptedData) IAuthTabCallback(objArr, iOnExtraCallback2, iOnExtraCallback3, 1307821359, iOnExtraCallback4, iOnExtraCallback, -1307821354);
            int i4 = 63 / 0;
        } else {
            cMS_EncryptedData = (CMS_EncryptedData) IAuthTabCallback(objArr, iOnExtraCallback2, iOnExtraCallback3, 1307821359, iOnExtraCallback4, iOnExtraCallback, -1307821354);
        }
        int i5 = extraCallback + 109;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return cMS_EncryptedData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ View access000() {
        int i = 2 % 2;
        int i2 = readTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseEditText baseEditTextOnNavigationEvent = onNavigationEvent();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return baseEditTextOnNavigationEvent;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        TransactionMemoActivity transactionMemoActivity = (TransactionMemoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 125;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CMS_EncryptedData cMS_EncryptedData = (CMS_EncryptedData) transactionMemoActivity.asInterface.getValue();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return cMS_EncryptedData;
    }

    public final DomainConfigProxy IAuthTabCallback() {
        int i = 2 % 2;
        DomainConfigProxy domainConfigProxy = this.homeChangeHelper;
        if (domainConfigProxy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = extraCallback + 65;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return domainConfigProxy;
    }

    public long getScreenId() {
        int i = 2 % 2;
        if (!ICustomTabsService_Parcel()) {
            int i2 = readTypedObject + 121;
            extraCallback = i2 % 128;
            int i3 = i2 % 2;
            return 1014343L;
        }
        int i4 = readTypedObject + 75;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return 5185810L;
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 41;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 89;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return "s85_timeline_memo_modal";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!ICustomTabsService_Parcel()) {
            linkedHashMap.put("version", 4);
            int i2 = extraCallback + 51;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return linkedHashMap;
        }
        int i4 = readTypedObject + 61;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{2, 0, 2, 3, 13854, 13854, 0, 2}, (byte) (54 - View.MeasureSpec.getMode(0)), 8 - Color.blue(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{2, 0, 2, 3, 13854, 13854, 0, 2}, (byte) (Color.rgb(0, 0, 0) + 16777270), Color.alpha(0) + 8, objArr2);
        linkedHashMap.put(strIntern, onWarmupCompleted(((String) objArr2[0]).intern()));
        linkedHashMap.put("transaction_id", onWarmupCompleted("transactionId"));
        int i6 = readTypedObject + 59;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public onWarmupCompleted() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TransactionMemoActivity.this.invalidateOptionsMenu();
            Typography7 typography7 = TransactionMemoActivity.onWarmupCompleted(TransactionMemoActivity.this).IAuthTabCallback;
            StringBuilder sb = new StringBuilder();
            if (TransactionMemoActivity.onNavigationEvent(TransactionMemoActivity.this).length() > 0) {
                sb.append(TransactionMemoActivity.onNavigationEvent(TransactionMemoActivity.this) + " ");
            }
            sb.append(extractConfidence.onExtraCallback(TransactionMemoActivity.onWarmupCompleted(TransactionMemoActivity.this).onExtraCallbackWithResult.getText()) + "/60");
            typography7.setText(sb.toString());
        }
    }

    @Override // viva.republica.toss.home.consumption.transaction.Hilt_TransactionMemoActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallback + 47;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onWarmupCompleted);
        IPostMessageServiceStubProxy iPostMessageServiceStubProxyExtraCommand = extraCommand();
        iPostMessageServiceStubProxyExtraCommand.onNavigationEvent(true);
        iPostMessageServiceStubProxyExtraCommand.IAuthTabCallbackStub(false);
        validateRelationship();
        updateVisuals();
        if (!this.onTransact && this.getInterfaceDescriptor.length() == 0) {
            finish();
        }
        int i4 = readTypedObject + 59;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public boolean onCreateOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        getMenuInflater().inflate(R.menu.menu_transaction_memo, menu);
        int i4 = extraCallback + 9;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(@Nullable Menu menu) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 61;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        if (menu == null) {
            return true;
        }
        int i5 = i2 + 63;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        int i7 = R.id.complete;
        if (i6 == 0) {
            menu.findItem(i7);
            throw null;
        }
        MenuItem menuItemFindItem = menu.findItem(i7);
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setEnabled(ICustomTabsServiceDefault());
        return true;
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() == R.id.complete) {
            int i4 = extraCallback + 5;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            IEngagementSignalsCallback();
            return true;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        int i6 = extraCallback + 57;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return zOnOptionsItemSelected;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TransactionMemoActivity transactionMemoActivity = (TransactionMemoActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 83;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            transactionMemoActivity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        transactionMemoActivity.finish();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 77;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(final TransactionMemoActivity transactionMemoActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(transactionMemoActivity.getString(R.string.app_home_consumption_transaction___f08981282f));
        String string = transactionMemoActivity.getString(R.string.yes_ne);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return TransactionMemoActivity.onWarmupCompleted(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(commonModule_setLeftEdgeTouchEnabled, im.toss.uikit.R.string.uikit_no, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return (Unit) TransactionMemoActivity.IAuthTabCallback(new Object[]{(DialogInterface) obj}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 2132139401, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -2132139400);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 1;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean bg_() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            if (ICustomTabsServiceDefault()) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(this, new Function1() { // from class: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity$$ExternalSyntheticLambda8
                    public final Object invoke(Object obj) {
                        return TransactionMemoActivity.onNavigationEvent(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
                int i3 = readTypedObject + 13;
                extraCallback = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            boolean zBg_ = super.bg_();
            int i5 = readTypedObject + 55;
            extraCallback = i5 % 128;
            int i6 = i5 % 2;
            return zBg_;
        }
        ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected BaseEditText onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this};
        int iOnExtraCallback = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback2 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback3 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback4 = MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback();
        if (i3 != 0) {
            Intrinsics.checkNotNullExpressionValue(((CMS_EncryptedData) IAuthTabCallback(objArr, iOnExtraCallback2, iOnExtraCallback3, 1307821359, iOnExtraCallback4, iOnExtraCallback, -1307821354)).onExtraCallbackWithResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseEditText baseEditText = ((CMS_EncryptedData) IAuthTabCallback(objArr, iOnExtraCallback2, iOnExtraCallback3, 1307821359, iOnExtraCallback4, iOnExtraCallback, -1307821354)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(baseEditText, "");
        int i4 = readTypedObject + 63;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return baseEditText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void validateRelationship() {
        int i = 2 % 2;
        this.onTransact = onWarmupCompleted("justReturn", false);
        this.getInterfaceDescriptor = onWarmupCompleted("transactionId");
        CollectionsKt.addAll(this.IAuthTabCallbackStubProxy, IAuthTabCallback("sourceIds"));
        this.access000 = onWarmupCompleted("time");
        this.IAuthTabCallbackStub = onWarmupCompleted("memo");
        String strOnWarmupCompleted = onWarmupCompleted("footerMessage");
        if (strOnWarmupCompleted.length() == 0) {
            int i2 = extraCallback + 17;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                strOnWarmupCompleted = getString(R.string.app_home_consumption_transaction___4422cbb4b4);
                Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
                int i3 = 21 / 0;
            } else {
                strOnWarmupCompleted = getString(R.string.app_home_consumption_transaction___4422cbb4b4);
                Intrinsics.checkNotNullExpressionValue(strOnWarmupCompleted, "");
            }
        }
        this.IAuthTabCallbackDefault = strOnWarmupCompleted;
        int i4 = extraCallback + 79;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r1
      0x0022: PHI (r1v5 android.content.Intent) = (r1v4 android.content.Intent), (r1v90 android.content.Intent) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.home.consumption.transaction.TransactionMemoActivity] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String onWarmupCompleted(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity.onWarmupCompleted(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0577  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.home.consumption.transaction.TransactionMemoActivity] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v64, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v65, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v67, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v68, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v69, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v70, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v75, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onWarmupCompleted(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity.onWarmupCompleted(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x056e  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Activity, viva.republica.toss.home.consumption.transaction.TransactionMemoActivity] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v51, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v55, types: [java.lang.Byte] */
    /* JADX WARN: Type inference failed for: r7v56, types: [java.lang.Short] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v59, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v64, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String[] IAuthTabCallback(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.home.consumption.transaction.TransactionMemoActivity.IAuthTabCallback(java.lang.String):java.lang.String[]");
    }

    private final boolean ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        readTypedObject = i2 % 128;
        boolean zOnWarmupCompleted = i2 % 2 == 0 ? onWarmupCompleted("fromCashflow", true) : onWarmupCompleted("fromCashflow", false);
        int i3 = readTypedObject + 1;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnWarmupCompleted;
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.setFilters((InputFilter[]) new ALCFaceAuth[]{new ALCFaceAuth(60)});
        BaseEditText baseEditText = ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(baseEditText, "");
        baseEditText.addTextChangedListener(new onWarmupCompleted());
        ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.setText(this.IAuthTabCallbackStub);
        ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.setSelection(((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.length());
        int i2 = readTypedObject + 59;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private final boolean ICustomTabsServiceDefault() {
        int i;
        int i2 = 2 % 2;
        int i3 = readTypedObject + 35;
        extraCallback = i3 % 128;
        String string = null;
        if (i3 % 2 != 0) {
            ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.getText();
            string.hashCode();
            throw null;
        }
        String str = this.IAuthTabCallbackStub;
        Editable text = ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.getText();
        if (text != null) {
            string = text.toString();
            i = readTypedObject + 69;
            extraCallback = i % 128;
        } else {
            i = extraCallback + 7;
            readTypedObject = i % 128;
        }
        int i4 = i % 2;
        return !Intrinsics.areEqual(str, string);
    }

    private static final Unit onExtraCallback(TransactionMemoActivity transactionMemoActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = readTypedObject + 49;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            BaseActivity.IAuthTabCallback(transactionMemoActivity, (String) null, true, 2, (Object) null);
        } else {
            BaseActivity.IAuthTabCallback(transactionMemoActivity, (String) null, false, 3, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = extraCallback + 51;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(TransactionMemoActivity transactionMemoActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 11;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        transactionMemoActivity.bo_();
        int i4 = extraCallback + 57;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallback() throws Throwable {
        String str;
        String string;
        int i = 2 % 2;
        DefaultReactHostDelegate defaultReactHostDelegate = DefaultReactHostDelegate.onExtraCallbackWithResult;
        if (this.IAuthTabCallbackStub.length() > 0) {
            int i2 = extraCallback;
            int i3 = i2 + 75;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            str = "edit";
        } else {
            str = "create";
        }
        DefaultReactHostDelegate.onWarmupCompleted(defaultReactHostDelegate, (String) null, "s85_timeline_memo_modal", (Integer) null, "confirm_memo", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (Long) null, (Integer) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (Integer) null, (Map) null, 1047541, (Object) null);
        Editable text = ((CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354)).onExtraCallbackWithResult.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (this.onTransact) {
            Intent intentPutExtra = new Intent().putExtra("result.memo", string);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            setResult(-1, intentPutExtra);
            finish();
            return;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Color.green(0)), TextUtils.lastIndexOf("", '0') + 23, TextUtils.lastIndexOf("", '0', 0, 0) + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-745626470);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29426), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24734, -489793014, false, "IAuthTabCallbackDefault", new Class[0]);
            }
            writeRaw<BaseApiResponse<Object>> writerawIAuthTabCallback = ((FullScreenAd) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(new getInstanceIfInitialized(this.IAuthTabCallbackStubProxy, this.access000, string));
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback2 = writerawIAuthTabCallback.IAuthTabCallback(new onNavigationEvent(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback2, "");
            writerawIAuthTabCallback2.onExtraCallback(new TransactionMemoActivity$.ExternalSyntheticLambda3(new TransactionMemoActivity$.ExternalSyntheticLambda2(this))).onWarmupCompleted(new TransactionMemoActivity$.ExternalSyntheticLambda4(this)).onNavigationEvent(new TransactionMemoActivity$.ExternalSyntheticLambda5(this), new TransactionMemoActivity$.ExternalSyntheticLambda7(new TransactionMemoActivity$.ExternalSyntheticLambda6(this)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void IAuthTabCallback(TransactionMemoActivity transactionMemoActivity, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 113;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        transactionMemoActivity.IAuthTabCallback().IAuthTabCallbackStub();
        transactionMemoActivity.setResult(-1);
        transactionMemoActivity.finish();
        int i4 = readTypedObject + 113;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 91;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 37;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BaseActivity baseActivity = (TransactionMemoActivity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, baseActivity, false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("TransactionMemoActivity::save", th);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 57;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull formatToParts formattoparts) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(formattoparts, "");
            return onWarmupCompleted(context, formattoparts.onWarmupCompleted(), formattoparts.ICustomTabsCallbackStubProxy(), formattoparts.onUnminimized(), formattoparts.extraCallbackWithResult());
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) TransactionMemoActivity.class).putExtra("transactionId", str).putExtra("sourceIds", (String[]) list.toArray(new String[0])).putExtra("time", str2).putExtra("memo", str3);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }

        public final Intent onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) TransactionMemoActivity.class).putExtra("justReturn", true).putExtra("memo", str).putExtra("footerMessage", str2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = access100;
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 55;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, (KeyEvent.getMaxKeyCode() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), 25 - TextUtils.indexOf((CharSequence) "", '0'), 23138 - Process.getGidForName(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i6 = $11 + 109;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i8 = $10 + 5;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 74 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19488 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i10];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        return (Unit) IAuthTabCallback(new Object[]{dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 2132139401, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -2132139400);
    }

    public static /* synthetic */ Unit onWarmupCompleted(TransactionMemoActivity transactionMemoActivity, Throwable th) {
        return (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, th}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 190346545, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -190346542);
    }

    private final CMS_EncryptedData ICustomTabsServiceStub() {
        return (CMS_EncryptedData) IAuthTabCallback(new Object[]{this}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 1307821359, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1307821354);
    }

    private static final Unit onExtraCallbackWithResult(TransactionMemoActivity transactionMemoActivity, DialogInterface dialogInterface) {
        return (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -407071084, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 407071088);
    }

    private static final Unit IAuthTabCallback(DialogInterface dialogInterface) {
        return (Unit) IAuthTabCallback(new Object[]{dialogInterface}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 160875267, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -160875267);
    }

    private static final Unit onExtraCallbackWithResult(TransactionMemoActivity transactionMemoActivity, Throwable th) {
        return (Unit) IAuthTabCallback(new Object[]{transactionMemoActivity, th}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -317871968, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 317871970);
    }

    @Override // viva.republica.toss.home.consumption.transaction.Hilt_TransactionMemoActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 13;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.home.consumption.transaction.Hilt_TransactionMemoActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 103;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // viva.republica.toss.home.consumption.transaction.Hilt_TransactionMemoActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = readTypedObject + 93;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // viva.republica.toss.home.consumption.transaction.Hilt_TransactionMemoActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        int i5 = readTypedObject + 27;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void setEngagementSignalsCallback() {
        access100 = new char[]{64961, 64960, 64982, 64981};
        IAuthTabCallback_Parcel = (char) 51243;
    }
}
