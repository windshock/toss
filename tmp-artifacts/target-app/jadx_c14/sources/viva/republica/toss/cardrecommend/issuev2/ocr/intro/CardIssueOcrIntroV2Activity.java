package viva.republica.toss.cardrecommend.issuev2.ocr.intro;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.home.core.ui.compose.dst.HomeAssetSubCategoryHeaderKt$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CERT_Finalize;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.CommonModule_setScreenAwakeMode;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7;
import o.GOST3410NamedParameters;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.RightClickGesturesKtonRightClickDown2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.TypographyKtExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.disableImageViewPreallocationAndroid;
import o.findResAndMsg;
import o.getTileModeX;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.onPageExit;
import o.readType;
import o.setRandomHost;
import o.stringSize;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2ViewModel;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardIssueOcrIntroV2Activity extends Hilt_CardIssueOcrIntroV2Activity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    public static final int IAuthTabCallbackStub;
    private static char[] IAuthTabCallback_Parcel = null;
    private static boolean ICustomTabsCallback = false;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static int onMinimized = 0;
    private static int onPostMessage = 1;
    private static boolean readTypedObject = false;
    private static int writeTypedObject = 1;

    @Inject
    public readType ocrIntent;

    @Inject
    public stringSize ocrMaintenanceManager;
    private final Lazy IAuthTabCallbackStubProxy = new RightClickGesturesKtonRightClickDown2(Reflection.getOrCreateKotlinClass(CardIssueOcrIntroV2ViewModel.class), new onNavigationEvent(this), new onExtraCallback(this), new IAuthTabCallbackDefault(null, this));
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onWarmupCompleted(this));
    private final Lazy access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda2
        public final Object invoke() {
            return CardIssueOcrIntroV2Activity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda3
        public final Object invoke() {
            return Boolean.valueOf(CardIssueOcrIntroV2Activity.IAuthTabCallback(this.f$0));
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda4
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            return Boolean.valueOf(((Boolean) CardIssueOcrIntroV2Activity.IAuthTabCallback(-934364341, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, 934364344)).booleanValue());
        }
    });
    private final Lazy getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda5
        public final Object invoke() {
            return Boolean.valueOf(CardIssueOcrIntroV2Activity.onExtraCallbackWithResult(this.f$0));
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda6
        public final Object invoke() {
            return CardIssueOcrIntroV2Activity.onNavigationEvent(this.f$0);
        }
    });
    private final IEngagementSignalsCallback_Parcel<Intent> asInterface = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda7
        public final Object invoke(Object obj) {
            return CardIssueOcrIntroV2Activity.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    static {
        IAuthTabCallback();
        Companion = new onExtraCallbackWithResult(null);
        IAuthTabCallbackStub = 8;
        int i = onMinimized + 13;
        onPostMessage = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i6 | i | i4);
        int i8 = ~i6;
        int i9 = ~i;
        int i10 = ~(i8 | i9);
        int i11 = ~i4;
        int i12 = (~(i8 | i11)) | i10 | (~(i9 | i11));
        int i13 = i11 | i10;
        int i14 = i6 + i + i2 + (105149790 * i5) + ((-719480883) * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-424837635)) + 281018368 + ((-424837635) * i) + (1798143484 * i7) + (i12 * (-1798143484)) + ((-1798143484) * i13) + (2071986176 * i2) + ((-654311424) * i5) + (1702887424 * i3) + ((-155189248) * i15);
        int i17 = (i6 * 910058005) + 1460508013 + (i * 910058005) + (i7 * (-484)) + (i12 * 484) + (i13 * 484) + (i2 * 910058489) + (i5 * (-759332242)) + (i3 * (-1121784475)) + (i15 * 1086324736);
        int i18 = i16 + (i17 * i17 * (-1925185536));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? onExtraCallbackWithResult(objArr) : IAuthTabCallbackStub(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ boolean IAuthTabCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
            return ((Boolean) IAuthTabCallback(-985092993, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, 985092993)).booleanValue();
        }
        int iOnExtraCallback4 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback5 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback6 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        ((Boolean) IAuthTabCallback(-985092993, iOnExtraCallback5, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback6, new Object[]{cardIssueOcrIntroV2Activity}, 985092993)).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(cardIssueOcrIntroV2Activity);
        int i4 = extraCallback + 107;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = extraCallback + 77;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(cardIssueOcrIntroV2Activity, dialogInterface);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(cardIssueOcrIntroV2Activity, dialogInterface);
        int i3 = extraCallback + 71;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueOcrIntroV2Activity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = writeTypedObject + 125;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cardIssueOcrIntroV2Activity, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        int i5 = writeTypedObject + 67;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(cardIssueOcrIntroV2Activity, dialogInterface);
        int i4 = writeTypedObject + 101;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = extraCallback + 81;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(1948632593, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, -1948632589)).booleanValue();
        int i4 = extraCallback + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity = (CardIssueOcrIntroV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsBinder = asBinder(cardIssueOcrIntroV2Activity);
        int i4 = writeTypedObject + 103;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(zAsBinder);
        }
        int i5 = 86 / 0;
        return Boolean.valueOf(zAsBinder);
    }

    public static /* synthetic */ HashMap onNavigationEvent(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(cardIssueOcrIntroV2Activity);
        }
        onTransact(cardIssueOcrIntroV2Activity);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 87;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 29;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 35;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class onWarmupCompleted implements Function0<CERT_Finalize> {
        final /* synthetic */ Activity onNavigationEvent;

        public onWarmupCompleted(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final CERT_Finalize invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CERT_Finalize.onWarmupCompleted(layoutInflater);
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(cardIssueOcrIntroV2Activity, onextracallbackwithresult);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 69;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity = (CardIssueOcrIntroV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return cardIssueOcrIntroV2Activity.access200();
        }
        cardIssueOcrIntroV2Activity.access200();
        throw null;
    }

    public final readType onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 37;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        readType readtype = this.ocrIntent;
        if (readtype == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 45;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return readtype;
    }

    private final CardIssueOcrIntroV2ViewModel access200() {
        int i = 2 % 2;
        int i2 = extraCallback + 65;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        CardIssueOcrIntroV2ViewModel cardIssueOcrIntroV2ViewModel = (CardIssueOcrIntroV2ViewModel) this.IAuthTabCallbackStubProxy.getValue();
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return cardIssueOcrIntroV2ViewModel;
    }

    private final CERT_Finalize updateVisuals() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        CERT_Finalize cERT_Finalize = (CERT_Finalize) this.asBinder.getValue();
        int i4 = writeTypedObject + 31;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return cERT_Finalize;
        }
        throw null;
    }

    private final TypographyKtExternalSyntheticLambda0 ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            updateVisuals().onExtraCallbackWithResult.onNavigationEvent().IAuthTabCallback();
            throw null;
        }
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0IAuthTabCallback = updateVisuals().onExtraCallbackWithResult.onNavigationEvent().IAuthTabCallback();
        int i3 = extraCallback + 53;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return typographyKtExternalSyntheticLambda0IAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String IAuthTabCallbackStub(viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity.extraCallback
            int r1 = r1 + 71
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity.writeTypedObject = r2
            int r1 = r1 % r0
            java.lang.String r2 = "EXTRA_REFERRER"
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r3 = r3.getStringExtra(r2)
            if (r1 != 0) goto L1f
            r1 = 95
            int r1 = r1 / 0
            if (r3 != 0) goto L23
            goto L21
        L1f:
            if (r3 != 0) goto L23
        L21:
            java.lang.String r3 = ""
        L23:
            int r1 = viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity.writeTypedObject
            int r1 = r1 + 105
            int r2 = r1 % 128
            viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity.extraCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            r0 = 3
            int r0 = r0 / 0
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity.IAuthTabCallbackStub(viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity):java.lang.String");
    }

    private final String writeTypedList() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access000.getValue();
        int i4 = extraCallback + 99;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 11;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            ((Boolean) this.access100.getValue()).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) this.access100.getValue()).booleanValue();
        int i3 = extraCallback + 93;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (CardIssueOcrIntroV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallback + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = baseActivity.getIntent().getBooleanExtra("manualInputEnabled", false);
        int i4 = extraCallback + 69;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(booleanExtra);
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity = (CardIssueOcrIntroV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) cardIssueOcrIntroV2Activity.IAuthTabCallbackDefault.getValue()).booleanValue();
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = writeTypedObject + 65;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean asBinder(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = cardIssueOcrIntroV2Activity.getIntent().getBooleanExtra("editable", true);
        int i4 = writeTypedObject + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return booleanExtra;
        }
        throw null;
    }

    private final boolean IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getInterfaceDescriptor.getValue();
        if (i3 != 0) {
            return ((Boolean) value).booleanValue();
        }
        int i4 = 41 / 0;
        return ((Boolean) value).booleanValue();
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BaseActivity baseActivity = (CardIssueOcrIntroV2Activity) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean booleanExtra = baseActivity.getIntent().getBooleanExtra("skipInitialLoading", false);
        int i4 = writeTypedObject + 41;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(booleanExtra);
        }
        int i5 = 33 / 0;
        return Boolean.valueOf(booleanExtra);
    }

    private final HashMap<String, Object> ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HashMap<String, Object> map = (HashMap) this.onTransact.getValue();
        int i4 = extraCallback + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final HashMap onTransact(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Serializable serializableExtra = cardIssueOcrIntroV2Activity.getIntent().getSerializableExtra("screenParams");
        if (!(serializableExtra instanceof HashMap)) {
            return null;
        }
        HashMap map = (HashMap) serializableExtra;
        int i4 = extraCallback + 77;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            cardIssueOcrIntroV2Activity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
            cardIssueOcrIntroV2Activity.finish();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        cardIssueOcrIntroV2Activity.setResult(iEngagementSignalsCallbackDefault.onNavigationEvent(), iEngagementSignalsCallbackDefault.onExtraCallbackWithResult());
        cardIssueOcrIntroV2Activity.finish();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(updateVisuals().getRoot());
        LinearLayout root = updateVisuals().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        disableImageViewPreallocationAndroid.onNavigationEvent(root, updateVisuals().onWarmupCompleted, (View) null, (View) null, false, 14, (Object) null);
        access200().onWarmupCompleted(ICustomTabsServiceDefault());
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0ICustomTabsServiceStub = ICustomTabsServiceStub();
        ExposedDropdownMenuPopup_androidKtExternalSyntheticLambda7 exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback = ICustomTabsServiceStub().IAuthTabCallbackDefault().onExtraCallback(R.navigation.nav_card_ocr_intro);
        if (IEngagementSignalsCallback()) {
            int i4 = extraCallback + 15;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback.onExtraCallback(R.id.step2_fragment);
        }
        typographyKtExternalSyntheticLambda0ICustomTabsServiceStub.onWarmupCompleted(exposedDropdownMenuPopup_androidKtExternalSyntheticLambda7OnExtraCallback);
        Object[] objArr = {this, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this)};
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(1640680346, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, -1640680341);
        int i6 = extraCallback + 109;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final class onExtraCallback implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ ComponentActivity onExtraCallback;

        public onExtraCallback(ComponentActivity componentActivity) {
            this.onExtraCallback = componentActivity;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            return this.onExtraCallback.getDefaultViewModelProviderFactory();
        }
    }

    public static final class onNavigationEvent implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public onNavigationEvent(ComponentActivity componentActivity) {
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            return this.onExtraCallbackWithResult.getViewModelStore();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private static final void onExtraCallback(final CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (onextracallbackwithresult instanceof CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult.C0024onExtraCallbackWithResult) {
            CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(cardIssueOcrIntroV2Activity, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda8
                public final Object invoke(Object obj) {
                    return CardIssueOcrIntroV2Activity.onExtraCallbackWithResult(this.f$0, (CommonModule_setLeftEdgeTouchEnabled) obj);
                }
            });
        } else {
            if (Intrinsics.areEqual(onextracallbackwithresult, CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult.onWarmupCompleted.onExtraCallbackWithResult)) {
                int i4 = extraCallback + 73;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                cardIssueOcrIntroV2Activity.ICustomTabsServiceStubProxy();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class IAuthTabCallbackDefault implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 onExtraCallback;
        final /* synthetic */ ComponentActivity onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(Function0 function0, ComponentActivity componentActivity) {
            this.onExtraCallback = function0;
            this.onExtraCallbackWithResult = componentActivity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.onExtraCallback;
            return (function0 == null || (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) == null) ? this.onExtraCallbackWithResult.getDefaultViewModelCreationExtras() : androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, DialogInterface dialogInterface) {
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 107;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            i = 120;
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            i = 9;
        }
        cardIssueOcrIntroV2Activity.setResult(i);
        cardIssueOcrIntroV2Activity.finish();
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallback(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        if (cardIssueOcrIntroV2Activity.IEngagementSignalsCallback()) {
            int i2 = extraCallback + 43;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0ICustomTabsServiceStub = cardIssueOcrIntroV2Activity.ICustomTabsServiceStub();
            int i4 = R.id.step2_fragment;
            if (!typographyKtExternalSyntheticLambda0ICustomTabsServiceStub.onExtraCallbackWithResult(i4, false)) {
                int i5 = extraCallback + 43;
                writeTypedObject = i5 % 128;
                if (i5 % 2 == 0) {
                    cardIssueOcrIntroV2Activity.ICustomTabsServiceStub().onNavigationEvent(i4);
                    int i6 = 34 / 0;
                } else {
                    cardIssueOcrIntroV2Activity.ICustomTabsServiceStub().onNavigationEvent(i4);
                }
            }
        } else {
            cardIssueOcrIntroV2Activity.ICustomTabsServiceStub().onExtraCallbackWithResult(GOST3410NamedParameters.Companion.IAuthTabCallback());
            int i7 = writeTypedObject + 115;
            extraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        cardIssueOcrIntroV2Activity.ICustomTabsServiceStub().onExtraCallbackWithResult(R.id.step4_fragment);
        cardIssueOcrIntroV2Activity.access200().onTransact();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(final CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(cardIssueOcrIntroV2Activity.getString(R.string.card_ocr_impl_intro_fail_ssa_model_file_title));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(cardIssueOcrIntroV2Activity.getString(R.string.card_ocr_impl_intro_fail_ssa_model_file_message));
        String string = cardIssueOcrIntroV2Activity.getString(R.string.card_ocr_impl_intro_fail_ssa_model_file_positive_button);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return CardIssueOcrIntroV2Activity.onExtraCallback(this.f$0, (DialogInterface) obj);
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new DialogInterface.OnCancelListener() { // from class: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CardIssueOcrIntroV2Activity.onExtraCallbackWithResult(this.f$0, dialogInterface);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallback + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return CardIssueOcrIntroV2Activity.this.new IAuthTabCallback(access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* renamed from: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$IAuthTabCallback$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            int label;
            final /* synthetic */ CardIssueOcrIntroV2Activity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = cardIssueOcrIntroV2Activity;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass2(this.this$0, access13800Var);
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: viva.republica.toss.cardrecommend.issuev2.ocr.intro.CardIssueOcrIntroV2Activity$IAuthTabCallback$2$4, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass4 extends AdaptedFunctionReference implements Function2<CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult, access13800<? super Unit>, Object> {
                final /* synthetic */ CardIssueOcrIntroV2Activity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
                    super(2, Intrinsics.Kotlin.class, "observeEvent", "observe$observeEvent(Lviva/republica/toss/cardrecommend/issuev2/ocr/intro/CardIssueOcrIntroV2Activity;Lviva/republica/toss/cardrecommend/issuev2/ocr/intro/CardIssueOcrIntroV2ViewModel$Event;)V", 4);
                    this.this$0 = cardIssueOcrIntroV2Activity;
                }

                /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult onextracallbackwithresult, access13800<? super Unit> access13800Var) {
                    return AnonymousClass2.onWarmupCompleted(this.this$0, onextracallbackwithresult, access13800Var);
                }
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
                    getTileModeX<CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult> gettilemodexOnNavigationEvent = ((CardIssueOcrIntroV2ViewModel) CardIssueOcrIntroV2Activity.IAuthTabCallback(-518360869, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), objArr, 518360871)).onNavigationEvent();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(gettilemodexOnNavigationEvent, anonymousClass4, this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object onWarmupCompleted(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity, CardIssueOcrIntroV2ViewModel.onExtraCallbackWithResult onextracallbackwithresult, access13800 access13800Var) throws NoWhenBranchMatchedException {
                CardIssueOcrIntroV2Activity.IAuthTabCallback(cardIssueOcrIntroV2Activity, onextracallbackwithresult);
                return Unit.INSTANCE;
            }
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity = CardIssueOcrIntroV2Activity.this;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cardIssueOcrIntroV2Activity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onExtraCallback(cardIssueOcrIntroV2Activity, onextracallback, anonymousClass2, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent((findResAndMsg) objArr[1], (CoroutineContext) null, (setRandomHost) null, ((CardIssueOcrIntroV2Activity) objArr[0]).new IAuthTabCallback(null), 3, (Object) null);
        int i2 = writeTypedObject + 5;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallback + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        readType readtypeOnNavigationEvent = onNavigationEvent();
        boolean zICustomTabsServiceDefault = ICustomTabsServiceDefault();
        HashMap<String, Object> mapICustomTabsService_Parcel = ICustomTabsService_Parcel();
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        this.asInterface.onNavigationEvent(readType.onNavigationEvent(readtypeOnNavigationEvent, this, (String) null, (String) null, zICustomTabsServiceDefault, mapICustomTabsService_Parcel, false, ((Boolean) IAuthTabCallback(1279124588, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, -1279124587)).booleanValue(), 38, (Object) null));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        int i4 = extraCallback + 93;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Map<String, Object> setEngagementSignalsCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-127, -126, -127, -127, -126, -125, -126, -127}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback(((String) objArr[0]).intern(), writeTypedList())});
        HashMap<String, Object> mapICustomTabsService_Parcel = ICustomTabsService_Parcel();
        if (mapICustomTabsService_Parcel != null) {
            int i4 = extraCallback + 109;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            mapIAuthTabCallback.putAll(mapICustomTabsService_Parcel);
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        return mapIAuthTabCallback;
    }

    public final Map<String, Object> onWarmupCompleted(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> engagementSignalsCallback = setEngagementSignalsCallback();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-126, -122, -123, -124}, Color.alpha(0) + 127, objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), str);
        Map<String, Object> mapOnWarmupCompleted = access8100.onWarmupCompleted(access8100.onWarmupCompleted(engagementSignalsCallback, linkedHashMap));
        int i2 = extraCallback + 21;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return mapOnWarmupCompleted;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = IAuthTabCallback_Parcel;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = $11 + 69;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 21;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 77, (ViewConfiguration.getLongPressTimeout() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(obj, objArr2)).charValue();
                        i6++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 77, ExpandableListView.getPackedPositionType(0L) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6++;
                    i2 = 2;
                    obj = null;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(extraCallbackWithResult)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 75 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16036 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        int i8 = 1052772399;
        if (ICustomTabsCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $10 + 23;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >> 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] + iIntValue);
                    try {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 63, 12214 - View.MeasureSpec.makeMeasureSpec(0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, (ViewConfiguration.getPressedStateDuration() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!readTypedObject) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $11 + 63;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i12 = $11 + 107;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr7 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i8);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.getCapsMode("", 0, 0) + 63, KeyEvent.normalizeMetaState(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i14 = $11 + 85;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            i8 = 1052772399;
        }
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ boolean onWarmupCompleted(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(-934364341, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, 934364344)).booleanValue();
    }

    public static final /* synthetic */ CardIssueOcrIntroV2ViewModel asInterface(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return (CardIssueOcrIntroV2ViewModel) IAuthTabCallback(-518360869, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, 518360871);
    }

    private final boolean validateRelationship() {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(1279124588, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this}, -1279124587)).booleanValue();
    }

    private static final boolean IAuthTabCallbackDefault(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(-985092993, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, 985092993)).booleanValue();
    }

    private final void onNavigationEvent(findResAndMsg findresandmsg) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        IAuthTabCallback(1640680346, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{this, findresandmsg}, -1640680341);
    }

    private static final boolean access100(CardIssueOcrIntroV2Activity cardIssueOcrIntroV2Activity) {
        int iOnExtraCallback = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback2 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        int iOnExtraCallback3 = HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback();
        return ((Boolean) IAuthTabCallback(1948632593, iOnExtraCallback2, HomeAssetSubCategoryHeaderKt$.ExternalSyntheticLambda1.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{cardIssueOcrIntroV2Activity}, -1948632589)).booleanValue();
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallback + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = extraCallback + 61;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 123;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 95;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.cardrecommend.issuev2.ocr.intro.Hilt_CardIssueOcrIntroV2Activity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallback + 45;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 117;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static void IAuthTabCallback() {
        IAuthTabCallback_Parcel = new char[]{32740, 32745, 32744, 32538, 32541, 32742};
        extraCallbackWithResult = -1184333930;
        readTypedObject = true;
        ICustomTabsCallback = true;
    }
}
