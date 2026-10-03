package viva.republica.toss.pedometer.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.base.BaseActivity;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CMP_Issue_AdditionalInfo;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.ConvertByteArrayToFloatArray;
import o.GuardedAsyncTask;
import o.IPostMessageServiceStubProxy;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.shouldBeKeptAsChild;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PedometerRestartGuideActivity extends BaseActivity {
    public static final onWarmupCompleted Companion;
    private static final String IAuthTabCallbackStub;
    private static int access000;
    public static final int asInterface;
    private static long getInterfaceDescriptor;
    private static char[] onTransact;
    private final Lazy IAuthTabCallbackDefault = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private boolean asBinder;
    private static final byte[] $$a = {120, -62, 63, 57};
    private static final int $$b = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int IAuthTabCallbackStubProxy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 97 - r6
            byte[] r0 = viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.$$a
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + 1
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.$$c(int, byte, short):java.lang.String");
    }

    static {
        access000 = 0;
        onNavigationEvent();
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 62, (char) View.combineMeasuredStates(0, 0), objArr);
        IAuthTabCallbackStub = ((String) objArr[0]).intern();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        asInterface = 8;
        int i = access100 + 105;
        access000 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 19;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pedometerRestartGuideActivity, commonModule_setLeftEdgeTouchEnabled);
        if (i3 == 0) {
            int i4 = 2 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 15;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity, View view) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 101;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 340590256, iIAuthTabCallback, -340590254, new Object[]{pedometerRestartGuideActivity, view}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        int i4 = IAuthTabCallbackStubProxy + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PedometerRestartGuideActivity pedometerRestartGuideActivity = (PedometerRestartGuideActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1109493014, iIAuthTabCallback, -1109493013, new Object[]{pedometerRestartGuideActivity}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int i3 = 97 / 0;
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1109493014, iIAuthTabCallback2, -1109493013, new Object[]{pedometerRestartGuideActivity}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -298440893, iIAuthTabCallback, 298440896, new Object[]{setDetectableSize}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PedometerRestartGuideActivity pedometerRestartGuideActivity, DialogInterface dialogInterface) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pedometerRestartGuideActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PedometerRestartGuideActivity pedometerRestartGuideActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pedometerRestartGuideActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = IAuthTabCallback_Parcel + 45;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Exception {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | i7;
        int i10 = ~i4;
        int i11 = ~(i8 | i10 | i3);
        int i12 = (~(i4 | i7)) | i8 | (~(i10 | i3));
        int i13 = i3 + i5 + i + (325770565 * i2) + ((-1284996642) * i6);
        int i14 = i13 * i13;
        int i15 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i5) + (i9 * 1076876666) + (1076876666 * i11) + ((-1076876666) * i12) + ((-287834112) * i) + ((-667418624) * i2) + ((-145752064) * i6) + (1116340224 * i14);
        int i16 = (i3 * (-1991011123)) + 595473426 + (i5 * (-1991009311)) + (i9 * (-906)) + (i11 * (-906)) + (i12 * 906) + (i * (-1991010217)) + (i2 * (-1223611789)) + (i6 * (-291900814)) + (i14 * (-1931083776));
        int i17 = i15 + (i16 * i16 * (-1558839296));
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 != 2) {
            return i17 != 3 ? i17 != 4 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        PedometerRestartGuideActivity pedometerRestartGuideActivity = (PedometerRestartGuideActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = IAuthTabCallback_Parcel + 33;
        IAuthTabCallbackStubProxy = i19 % 128;
        int i20 = i19 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1006164L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pedometerRestartGuideActivity.updateVisuals();
        int i21 = IAuthTabCallbackStubProxy + 29;
        IAuthTabCallback_Parcel = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PedometerRestartGuideActivity pedometerRestartGuideActivity = (PedometerRestartGuideActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(pedometerRestartGuideActivity, dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setDetectableSize);
        int i4 = IAuthTabCallbackStubProxy + 103;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(dialogInterface);
        }
        IAuthTabCallback(dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PedometerRestartGuideActivity pedometerRestartGuideActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(pedometerRestartGuideActivity);
        int i4 = IAuthTabCallbackStubProxy + 9;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PedometerRestartGuideActivity pedometerRestartGuideActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(pedometerRestartGuideActivity, shouldbekeptaschild);
        int i4 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        if (i2 % 2 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = i3 + 37;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return 1006160L;
    }

    public static final class onExtraCallback implements Function0<CMP_Issue_AdditionalInfo> {
        final /* synthetic */ Activity onExtraCallback;

        public onExtraCallback(Activity activity) {
            this.onExtraCallback = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CMP_Issue_AdditionalInfo invoke() {
            LayoutInflater layoutInflater = this.onExtraCallback.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_Issue_AdditionalInfo.onNavigationEvent(layoutInflater);
        }
    }

    private final CMP_Issue_AdditionalInfo IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        CMP_Issue_AdditionalInfo cMP_Issue_AdditionalInfo = (CMP_Issue_AdditionalInfo) value;
        int i4 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return cMP_Issue_AdditionalInfo;
    }

    private final TdsImageView validateRelationship() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(IAuthTabCallback().onWarmupCompleted, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TdsImageView tdsImageView = IAuthTabCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        int i3 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return tdsImageView;
    }

    private final TdsBottomCtaV1View setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TdsBottomCtaV1View tdsBottomCtaV1View = IAuthTabCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsBottomCtaV1View, "");
        int i4 = IAuthTabCallbackStubProxy + 119;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return tdsBottomCtaV1View;
    }

    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(IAuthTabCallback().getRoot());
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            int i4 = IAuthTabCallback_Parcel + 99;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        TdsImageView tdsImageViewValidateRelationship = validateRelationship();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 43, (char) View.combineMeasuredStates(0, 0), objArr);
        TdsImageView.setImage$default(tdsImageViewValidateRelationship, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setEngagementSignalsCallback().asInterface().setOnClickListener(new PedometerRestartGuideActivity$.ExternalSyntheticLambda9(this));
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault()) {
            ICustomTabsServiceDefault();
            int i4 = IAuthTabCallbackStubProxy + 7;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestart() throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Activity*/.onRestart();
        if (this.asBinder) {
            GuardedAsyncTask.IAuthTabCallback(GuardedAsyncTask.IAuthTabCallback, this, new PedometerRestartGuideActivity$.ExternalSyntheticLambda6(this), null, 4, null);
            int i4 = IAuthTabCallbackStubProxy + 115;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 5;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PedometerRestartGuideActivity pedometerRestartGuideActivity = (PedometerRestartGuideActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        pedometerRestartGuideActivity.ICustomTabsServiceDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 1;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void updateVisuals() throws Exception {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1006162L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        GuardedAsyncTask.IAuthTabCallback.IAuthTabCallback(this, new PedometerRestartGuideActivity$.ExternalSyntheticLambda0(this), new PedometerRestartGuideActivity$.ExternalSyntheticLambda1(this));
        int i2 = IAuthTabCallbackStubProxy + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(PedometerRestartGuideActivity pedometerRestartGuideActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1006166L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pedometerRestartGuideActivity.ICustomTabsServiceDefault();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 13;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("from", "click_deny");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(PedometerRestartGuideActivity pedometerRestartGuideActivity, DialogInterface dialogInterface) throws Exception {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006176L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        pedometerRestartGuideActivity.updateVisuals();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 87;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006174L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 93;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(PedometerRestartGuideActivity pedometerRestartGuideActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(pedometerRestartGuideActivity.getString(R.string.app_pedometer_main___c67d5f6960));
        String string = pedometerRestartGuideActivity.getString(R.string.app_pedometer_main___4ab83bae0b);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new PedometerRestartGuideActivity$.ExternalSyntheticLambda10(pedometerRestartGuideActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new PedometerRestartGuideActivity$.ExternalSyntheticLambda11())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("from", "click_deny_never_ask");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("from", "click_deny_never_ask");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006182L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + pedometerRestartGuideActivity.getPackageName()));
        Intrinsics.checkNotNullExpressionValue(data, "");
        pedometerRestartGuideActivity.startActivity(data);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStubProxy + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1006180L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PedometerRestartGuideActivity pedometerRestartGuideActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.onExtraCallback(pedometerRestartGuideActivity.getString(R.string.app_pedometer_main___b92968901c));
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(pedometerRestartGuideActivity.getString(R.string.app_pedometer_main___90ce51bcd0));
        String string = pedometerRestartGuideActivity.getString(R.string.card_setting);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new PedometerRestartGuideActivity$.ExternalSyntheticLambda7(pedometerRestartGuideActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new PedometerRestartGuideActivity$.ExternalSyntheticLambda8())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback_Parcel + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 73;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onTransact[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 59697), 17 - (ViewConfiguration.getTapTimeout() >> 16), 10974 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(getInterfaceDescriptor), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16823350), Color.rgb(0, 0, 0) + 16777247, 20220 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), 44 - ((Process.getThreadPriority(0) + 20) >> 6), 1494 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i7 = $10 + 125;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 / 3;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode("", 0, 0)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') + 1446, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i9 = $10 + 119;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(viva.republica.toss.pedometer.main.PedometerRestartGuideActivity r19, o.shouldBeKeptAsChild r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            int r3 = r2 % r2
            int r3 = viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.IAuthTabCallback_Parcel
            int r3 = r3 + 53
            int r4 = r3 % 128
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.IAuthTabCallbackStubProxy = r4
            int r3 = r3 % r2
            r4 = 1
            java.lang.String r5 = ""
            if (r3 != 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            r0.asBinder = r4
            boolean r1 = r1.onExtraCallbackWithResult
            if (r1 == 0) goto L50
            goto L28
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            r0.asBinder = r4
            boolean r1 = r1.onExtraCallbackWithResult
            if (r1 == 0) goto L50
        L28:
            r3 = 1006172(0xf5a5c, double:4.97115E-318)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 30
            r10 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r3, r5, r6, r7, r8, r9, r10)
            r11 = 1006168(0xf5a58, double:4.97113E-318)
            r13 = 0
            r14 = 0
            r15 = 0
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda2 r16 = new viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda2
            r16.<init>()
            r17 = 14
            r18 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r11, r13, r14, r15, r16, r17, r18)
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda3 r1 = new viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda3
            r1.<init>(r0)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r0, r1)
            goto L80
        L50:
            r3 = 1006178(0xf5a62, double:4.97118E-318)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 30
            r10 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r3, r5, r6, r7, r8, r9, r10)
            r11 = 1006170(0xf5a5a, double:4.97114E-318)
            r13 = 0
            r14 = 0
            r15 = 0
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda4 r16 = new viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda4
            r16.<init>()
            r17 = 14
            r18 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r11, r13, r14, r15, r16, r17, r18)
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda5 r1 = new viva.republica.toss.pedometer.main.PedometerRestartGuideActivity$$ExternalSyntheticLambda5
            r1.<init>(r0)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r0, r1)
            int r0 = viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.IAuthTabCallback_Parcel
            int r0 = r0 + 113
            int r1 = r0 % 128
            viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.IAuthTabCallbackStubProxy = r1
            int r0 = r0 % r2
        L80:
            o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r0 = "from"
            java.lang.String r2 = "PedometerRestartGuideActivity"
            kotlin.Pair r0 = o.getWrite.IAuthTabCallback(r0, r2)
            java.lang.String r2 = "pedometer_debug"
            java.lang.String r3 = "permission denied"
            java.util.Map r4 = o.access8100.onNavigationEvent(r0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r0 = 56
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r13 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            int r16 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r11 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r14 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            int r15 = com.google.android.gms.internal.ads.zzgc.onExtraCallbackWithResult()
            r12 = -154777398(0xfffffffff6c648ca, float:-2.010842E33)
            r10 = 154777398(0x939b736, float:2.235471E-33)
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r10, r11, r12, r13, r14, r15, r16)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.main.PedometerRestartGuideActivity.onExtraCallbackWithResult(viva.republica.toss.pedometer.main.PedometerRestartGuideActivity, o.shouldBeKeptAsChild):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        setResult(-1);
        finish();
        int i4 = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1626173677, iIAuthTabCallback, 1626173681, new Object[]{pedometerRestartGuideActivity}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(PedometerRestartGuideActivity pedometerRestartGuideActivity, DialogInterface dialogInterface) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1517342601, iIAuthTabCallback, 1517342601, new Object[]{pedometerRestartGuideActivity, dialogInterface}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final void onExtraCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity, View view) throws Exception {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 340590256, iIAuthTabCallback, -340590254, new Object[]{pedometerRestartGuideActivity, view}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(PedometerRestartGuideActivity pedometerRestartGuideActivity) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1109493014, iIAuthTabCallback, -1109493013, new Object[]{pedometerRestartGuideActivity}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -298440893, iIAuthTabCallback, 298440896, new Object[]{setDetectableSize}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    static void onNavigationEvent() {
        onTransact = new char[]{60860, 58609, 65282, 63063, 51427, 50043, 55837, 44236, 42799, 48761, 45215, 35803, 33393, 38058, 28564, 26143, 30891, 29638, 18965, 23801, 22505, 11804, 8461, 15346, 12863, 1358, 8075, 5675, 59771, 58326, 64200, 52606, 51098, 57024, 53616, 43950, 41668, 46414, 36773, 34530, 39184, 36934, 27383, 32033, 29791, 20166, 16691, 22630, 21123, 9482, 15477, 13970, 2516, 'e', 6827, 60893, 58379, 65263, 61856, 51215, 49990, 54782};
        getInterfaceDescriptor = -7216046779774737275L;
    }
}
