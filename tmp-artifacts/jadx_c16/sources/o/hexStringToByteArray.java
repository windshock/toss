package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleService;
import im.toss.features.benefit.guideoverlay.VisitMissionOverlayGuideService$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.features.useronboarding.guardian.component.ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.Cacheurls1;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hexStringToByteArray extends LifecycleService {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int readTypedObject = 1;
    private Rally IAuthTabCallback;
    private WindowManager.LayoutParams IAuthTabCallbackDefault;
    private WindowManager.LayoutParams IAuthTabCallbackStub;
    private WindowManager IAuthTabCallback_Parcel;
    private getPackageType access000;
    private Rally asBinder;
    private onDeactivated asInterface;
    private ChoosePhoneContactBridgeExtension onExtraCallback;
    private WindowManager.LayoutParams onExtraCallbackWithResult;
    private hasFeatureHCE onNavigationEvent;
    private onAccountReturned onTransact;
    private processCommandApdu onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = readTypedObject + 103;
        getInterfaceDescriptor = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.Context, o.hexStringToByteArray] */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = i7 | i;
        int i10 = (~(i7 | i8)) | (~i9) | (~(i8 | i));
        int i11 = (~(i | i6)) | (~(i7 | i6));
        int i12 = i9 | i8;
        int i13 = i + i5 + i4 + (988256597 * i2) + ((-695401848) * i3);
        int i14 = i13 * i13;
        int i15 = ((-1367684995) * i) + 376186498 + (i5 * (-1367684423)) + (i10 * (-286)) + (i11 * (-286)) + (i12 * 286) + ((-1367684709) * i4) + (1512018807 * i2) + (1127043160 * i3) + (i14 * (-418185216));
        int i16 = (((-880163897) * i) - 1270611968) + ((-1462879173) * i5) + (i10 * 291357638) + (291357638 * i11) + ((-291357638) * i12) + ((-1171521536) * i4) + (479985664 * i2) + (1063256064 * i3) + (1273561088 * i14) + (i15 * i15 * 1903099904);
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? i16 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }
        ?? r3 = (hexStringToByteArray) objArr[0];
        startHCE starthce = (startHCE) objArr[1];
        int i17 = 2 % 2;
        int i18 = access100;
        int i19 = i18 + 43;
        int i20 = i19 % 128;
        IAuthTabCallbackStubProxy = i20;
        int i21 = i19 % 2;
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = ((hexStringToByteArray) r3).onExtraCallback;
        if (choosePhoneContactBridgeExtension == null) {
            int i22 = i20 + 95;
            access100 = i22 % 128;
            int i23 = i22 % 2;
        } else {
            int i24 = 8;
            if (starthce == null) {
                int i25 = i18 + 125;
                IAuthTabCallbackStubProxy = i25 % 128;
                int i26 = i25 % 2;
                LinearLayout linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallback, "");
                linearLayoutOnExtraCallback.setVisibility(8);
            } else {
                Context context = choosePhoneContactBridgeExtension.onExtraCallback().getContext();
                LinearLayout linearLayoutOnExtraCallback2 = choosePhoneContactBridgeExtension.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallback2, "");
                linearLayoutOnExtraCallback2.setVisibility(0);
                TdsRoundLayout tdsRoundLayout = choosePhoneContactBridgeExtension.onExtraCallbackWithResult;
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
                Intrinsics.checkNotNull(context);
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                TdsRoundLayout.setShadow$default(tdsRoundLayout, new Cacheurls1.onExtraCallback(10, 1, new getUrlokhttp(new IAuthTabCallback(configuration)).ICustomTabsCallback_Parcel(), 0, 8, (DefaultConstructorMarker) null), (AppLovinSdkSettings) null, 2, (Object) null);
                choosePhoneContactBridgeExtension.onExtraCallbackWithResult.setBackgroundColor(isNfcEnable.onExtraCallback((Context) r3, starthce.onExtraCallbackWithResult(), R.color.background_default));
                SubTypography8 subTypography8 = choosePhoneContactBridgeExtension.IAuthTabCallback;
                Intrinsics.checkNotNullExpressionValue(subTypography8, "");
                isNfcEnable.IAuthTabCallback(subTypography8, starthce.asBinder(), (String) startHCE.onWarmupCompleted(421170354, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -421170353, new Object[]{starthce}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback()), R.color.grey_900);
                Typography6 typography6 = choosePhoneContactBridgeExtension.onWarmupCompleted;
                Intrinsics.checkNotNullExpressionValue(typography6, "");
                String strOnWarmupCompleted = starthce.onWarmupCompleted();
                String strOnNavigationEvent = starthce.onNavigationEvent();
                int i27 = R.color.grey_600;
                isNfcEnable.IAuthTabCallback(typography6, strOnWarmupCompleted, strOnNavigationEvent, i27);
                Typography6 typography62 = choosePhoneContactBridgeExtension.IAuthTabCallbackDefault;
                Intrinsics.checkNotNullExpressionValue(typography62, "");
                isNfcEnable.IAuthTabCallback(typography62, starthce.asInterface(), starthce.onTransact(), i27);
                if (((NFCUtils) startHCE.onWarmupCompleted(2071221852, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2071221852, new Object[]{starthce}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback())) == null) {
                    int i28 = access100 + 35;
                    IAuthTabCallbackStubProxy = i28 % 128;
                    i24 = i28 % 2 != 0 ? 103 : 16;
                }
                choosePhoneContactBridgeExtension.onNavigationEvent.setPadding(0, varyMatches.IAuthTabCallback(Integer.valueOf(i24), context), 0, varyMatches.IAuthTabCallback(Integer.valueOf(i24), context));
                NFCUtils nFCUtils = (NFCUtils) startHCE.onWarmupCompleted(2071221852, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2071221852, new Object[]{starthce}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback());
                contact contactVar = choosePhoneContactBridgeExtension.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(contactVar, "");
                isNfcEnable.onExtraCallbackWithResult(nFCUtils, contactVar, 0, 100, 4, (Object) null);
            }
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = access100 + 45;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(onaccountreturned);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(onaccountreturned);
        }
        onWarmupCompleted(onaccountreturned);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(onaccountreturned);
        int i4 = access100 + 29;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(hexStringToByteArray hexstringtobytearray, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(hexstringtobytearray, view, motionEvent);
        }
        IAuthTabCallback(hexstringtobytearray, view, motionEvent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = access100 + 37;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(onaccountreturned);
        }
        IAuthTabCallbackStub(onaccountreturned);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(processCommandApdu processcommandapdu, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(processcommandapdu, z);
        int i4 = IAuthTabCallbackStubProxy + 73;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.LongRef longRef, Ref.IntRef intRef, WindowManager.LayoutParams layoutParams, Ref.IntRef intRef2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, onDeactivated ondeactivated, int i, hexStringToByteArray hexstringtobytearray, View view, MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 15;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(booleanRef, booleanRef2, longRef, intRef, layoutParams, intRef2, floatRef, floatRef2, ondeactivated, i, hexstringtobytearray, view, motionEvent);
        int i5 = access100 + 107;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static final class onExtraCallback implements View.OnLayoutChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public onExtraCallback() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = 2 % 2;
            int i10 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 == 0) {
                view.removeOnLayoutChangeListener(this);
                Object[] objArr = {hexStringToByteArray.this};
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                hexStringToByteArray.IAuthTabCallback(1154184708, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr, -1154184704, iOnExtraCallbackWithResult);
            } else {
                view.removeOnLayoutChangeListener(this);
                Object[] objArr2 = {hexStringToByteArray.this};
                int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                hexStringToByteArray.IAuthTabCallback(1154184708, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), objArr2, -1154184704, iOnExtraCallbackWithResult2);
            }
            hexStringToByteArray.onExtraCallbackWithResult(hexStringToByteArray.this, true);
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(hexStringToByteArray hexstringtobytearray, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hexstringtobytearray.onExtraCallback(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        hexStringToByteArray hexstringtobytearray = (hexStringToByteArray) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hexstringtobytearray.onExtraCallbackWithResult();
        if (i3 != 0) {
            return null;
        }
        int i4 = 69 / 0;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        WindowManager windowManager;
        int i = 2 % 2;
        super.onCreate();
        sendHCEMessage sendhcemessage = new sendHCEMessage(this, 1.6f);
        Object systemService = getSystemService("window");
        if (systemService instanceof WindowManager) {
            windowManager = (WindowManager) systemService;
        } else {
            int i2 = access100 + 11;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            windowManager = null;
        }
        this.IAuthTabCallback_Parcel = windowManager;
        this.onTransact = onAccountReturned.onExtraCallbackWithResult(LayoutInflater.from(sendhcemessage));
        this.onWarmupCompleted = processCommandApdu.onExtraCallback(LayoutInflater.from(sendhcemessage));
        this.onExtraCallback = ChoosePhoneContactBridgeExtension.onExtraCallback(LayoutInflater.from(sendhcemessage));
        int i4 = IAuthTabCallbackStubProxy + 77;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 61;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback();
            super.onDestroy();
            int i3 = access100 + 123;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 96 / 0;
                return;
            }
            return;
        }
        IAuthTabCallback();
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = IAuthTabCallback + 89;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getSpecialFeatureOptInStatus.Dark;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.hexStringToByteArray.IAuthTabCallbackDefault.onWarmupCompleted + 123;
            o.hexStringToByteArray.IAuthTabCallbackDefault.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 26 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = o.hexStringToByteArray.IAuthTabCallbackStub.onExtraCallback + 5;
            o.hexStringToByteArray.IAuthTabCallbackStub.onNavigationEvent = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r0 = 30 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted)) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onTransact(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i4 = IAuthTabCallback + 55;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            int i5 = onWarmupCompleted + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i6 != 0) {
                int i7 = 63 / 0;
            }
            return getspecialfeatureoptinstatus2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 85;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(configuration, "");
            super/*android.app.Service*/.onConfigurationChanged(configuration);
            int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
            int iIAuthTabCallback = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
            IAuthTabCallback(-457374963, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), alertWithArgs.onExtraCallbackWithResult(), iIAuthTabCallback, new Object[]{this}, 457374966, iOnExtraCallbackWithResult);
            throw null;
        }
        Intrinsics.checkNotNullParameter(configuration, "");
        super/*android.app.Service*/.onConfigurationChanged(configuration);
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        int iIAuthTabCallback2 = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        IAuthTabCallback(-457374963, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), alertWithArgs.onExtraCallbackWithResult(), iIAuthTabCallback2, new Object[]{this}, 457374966, iOnExtraCallbackWithResult2);
        int i3 = access100 + 27;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r2.onWarmupCompleted(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r6 = o.hexStringToByteArray.access100 + 87;
        o.hexStringToByteArray.IAuthTabCallbackStubProxy = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context, o.hexStringToByteArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        hasFeatureHCE hasfeaturehce;
        onExtraCallbackWithResult onextracallbackwithresult;
        ?? r6 = (hexStringToByteArray) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 5;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult onextracallbackwithresult2 = Companion;
            onextracallbackwithresult2.onExtraCallback(r6);
            hasfeaturehce = ((hexStringToByteArray) r6).onNavigationEvent;
            int i3 = 52 / 0;
            onextracallbackwithresult = onextracallbackwithresult2;
        } else {
            onExtraCallbackWithResult onextracallbackwithresult3 = Companion;
            onextracallbackwithresult3.onExtraCallback(r6);
            hasfeaturehce = ((hexStringToByteArray) r6).onNavigationEvent;
            onextracallbackwithresult = onextracallbackwithresult3;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = hexStringToByteArray.this.new onNavigationEvent(access13800Var);
            int i2 = onWarmupCompleted + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 87;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onnavigationeventCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onnavigationeventCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 71;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onNavigationEvent + 7;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            hexStringToByteArray.this.stopSelf();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int onStartCommand(@Nullable Intent intent, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = access100 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            super.onStartCommand(intent, i, i2);
            hasFeatureHCE hasfeaturehce = intent != null ? (hasFeatureHCE) intent.getParcelableExtra("extra_visit_mission_overlay_content") : null;
            if (hasfeaturehce == null) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "VisitMissionOverlayGuideService", "VisitMissionOverlayContentModel is null", (Throwable) null, (Map) null, 12, (Object) null);
                stopSelf();
                return 2;
            }
            int iIAuthTabCallback = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
            IAuthTabCallback(1492393945, alertWithArgs.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017764).substring(0, 4).length() + 108766666, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), new Object[]{this}, -1492393944, iIAuthTabCallback);
            this.onNavigationEvent = hasfeaturehce;
            byteArrayToHexString.onExtraCallbackWithResult.onExtraCallback(hasfeaturehce);
            getPackageType getpackagetype = this.access000;
            if (getpackagetype != null) {
                int i5 = access100 + 3;
                IAuthTabCallbackStubProxy = i5 % 128;
                if (i5 % 2 != 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 0, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            this.access000 = maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(null), 3, (Object) null);
            IAuthTabCallback(hasfeaturehce);
            return 2;
        }
        super.onStartCommand(intent, i, i2);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void IAuthTabCallback(hasFeatureHCE hasfeaturehce) throws NoWhenBranchMatchedException {
        int i;
        WindowManager windowManager;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 19;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback(-2081610269, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), new Object[]{this, hasfeaturehce.onNavigationEvent()}, 2081610271, alertWithArgs.onExtraCallbackWithResult());
        startHCE starthceOnNavigationEvent = hasfeaturehce.onNavigationEvent();
        onExtraCallback(starthceOnNavigationEvent != null ? starthceOnNavigationEvent.IAuthTabCallback() : null, hasfeaturehce.onExtraCallbackWithResult());
        int i5 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, i5, 131112, -3);
        layoutParams.softInputMode = 16;
        int i6 = onWarmupCompleted.IAuthTabCallback[hasfeaturehce.onExtraCallback().ordinal()];
        if (i6 == 1) {
            i = 48;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 80;
        }
        layoutParams.gravity = i;
        this.IAuthTabCallbackStub = layoutParams;
        int i7 = i5;
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, i7, 8, -3);
        layoutParams2.gravity = 17;
        this.onExtraCallbackWithResult = layoutParams2;
        this.IAuthTabCallbackDefault = new WindowManager.LayoutParams(-1, -2, i7, 8, -3);
        onExtraCallbackWithResult();
        this.asInterface = hasfeaturehce.onExtraCallback();
        processCommandApdu processcommandapdu = this.onWarmupCompleted;
        if (processcommandapdu != null) {
            int i8 = access100 + 85;
            int i9 = i8 % 128;
            IAuthTabCallbackStubProxy = i9;
            int i10 = i8 % 2;
            WindowManager windowManager2 = this.IAuthTabCallback_Parcel;
            if (windowManager2 != null) {
                int i11 = i9 + 83;
                access100 = i11 % 128;
                if (i11 % 2 != 0) {
                    windowManager2.addView(processcommandapdu.IAuthTabCallback(), this.onExtraCallbackWithResult);
                } else {
                    windowManager2.addView(processcommandapdu.IAuthTabCallback(), this.onExtraCallbackWithResult);
                    int i12 = 93 / 0;
                }
            }
        }
        onAccountReturned onaccountreturned = this.onTransact;
        if (onaccountreturned != null) {
            int i13 = access100 + 121;
            IAuthTabCallbackStubProxy = i13 % 128;
            int i14 = i13 % 2;
            WindowManager windowManager3 = this.IAuthTabCallback_Parcel;
            if (windowManager3 != null) {
                windowManager3.addView(onaccountreturned.onExtraCallbackWithResult(), this.IAuthTabCallbackDefault);
            }
        }
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = this.onExtraCallback;
        if (choosePhoneContactBridgeExtension != null && (windowManager = this.IAuthTabCallback_Parcel) != null) {
            windowManager.addView(choosePhoneContactBridgeExtension.onExtraCallback(), this.IAuthTabCallbackStub);
        }
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension2 = this.onExtraCallback;
        onNavigationEvent(choosePhoneContactBridgeExtension2 != null ? choosePhoneContactBridgeExtension2.onExtraCallbackWithResult : null, hasfeaturehce.onExtraCallback());
    }

    private static final boolean IAuthTabCallback(hexStringToByteArray hexstringtobytearray, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
            if (motionEvent.getAction() != 0) {
                return true;
            }
        } else if (motionEvent.getAction() != 0) {
            return true;
        }
        int i4 = access100 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        byteArrayToHexString.onExtraCallbackWithResult.IAuthTabCallback(hexstringtobytearray.onNavigationEvent, "guide_close");
        hexstringtobytearray.onExtraCallback(false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean onExtraCallbackWithResult(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.LongRef longRef, Ref.IntRef intRef, WindowManager.LayoutParams layoutParams, Ref.IntRef intRef2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, onDeactivated ondeactivated, int i, hexStringToByteArray hexstringtobytearray, View view, MotionEvent motionEvent) {
        String str;
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback;
        LinearLayout linearLayoutOnExtraCallback;
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback2;
        LinearLayout linearLayoutOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            booleanRef.element = false;
            booleanRef2.element = false;
            longRef.element = System.currentTimeMillis();
            intRef.element = layoutParams.x;
            intRef2.element = layoutParams.y;
            floatRef.element = motionEvent.getRawX();
            floatRef2.element = motionEvent.getRawY();
        } else if (action != 1) {
            int i3 = access100 + 71;
            IAuthTabCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0 ? action == 2 : action == 2) {
                float rawX = motionEvent.getRawX();
                float f = floatRef.element;
                float rawY = (motionEvent.getRawY() - floatRef2.element) * (ondeactivated == onDeactivated.TOP ? 1 : -1);
                if (Math.abs(rawY) <= i) {
                    int i4 = IAuthTabCallbackStubProxy + 69;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    if (intRef.element == layoutParams.x) {
                        int i6 = access100 + 123;
                        IAuthTabCallbackStubProxy = i6 % 128;
                        int i7 = i6 % 2;
                        boolean z2 = intRef2.element != layoutParams.y;
                        if (!booleanRef2.element && z2) {
                            hexstringtobytearray.IAuthTabCallback(true);
                            booleanRef2.element = true;
                        }
                        if (booleanRef2.element) {
                            onAccountReturned onaccountreturned = hexstringtobytearray.onTransact;
                            if (onaccountreturned != null && (linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult()) != null && linearLayoutOnExtraCallbackWithResult.getVisibility() == 0) {
                                int i8 = access100 + 53;
                                IAuthTabCallbackStubProxy = i8 % 128;
                                if (i8 % 2 != 0) {
                                    hexstringtobytearray.onExtraCallback(true);
                                } else {
                                    hexstringtobytearray.onExtraCallback(false);
                                }
                            }
                            layoutParams.x = intRef.element + ((int) (rawX - f));
                            layoutParams.y = intRef2.element + ((int) rawY);
                            WindowManager windowManager = hexstringtobytearray.IAuthTabCallback_Parcel;
                            if (windowManager != null) {
                                ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = hexstringtobytearray.onExtraCallback;
                                windowManager.updateViewLayout(choosePhoneContactBridgeExtension != null ? choosePhoneContactBridgeExtension.onExtraCallback() : null, layoutParams);
                            }
                            if (onExtraCallbackWithResult(hexstringtobytearray, null, null, 3, null)) {
                                if (!booleanRef.element) {
                                    minFresh.onNavigationEvent(hexstringtobytearray, noStore.Companion.onExtraCallback());
                                    booleanRef.element = true;
                                }
                                ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension2 = hexstringtobytearray.onExtraCallback;
                                if (choosePhoneContactBridgeExtension2 != null) {
                                    int i9 = IAuthTabCallbackStubProxy + 19;
                                    access100 = i9 % 128;
                                    int i10 = i9 % 2;
                                    LinearLayout linearLayoutOnExtraCallback2 = choosePhoneContactBridgeExtension2.onExtraCallback();
                                    if (linearLayoutOnExtraCallback2 != null) {
                                        linearLayoutOnExtraCallback2.setAlpha(0.7f);
                                    }
                                }
                                processCommandApdu processcommandapdu = hexstringtobytearray.onWarmupCompleted;
                                if (processcommandapdu != null && (tdsRoundLayoutIAuthTabCallback2 = processcommandapdu.IAuthTabCallback()) != null) {
                                    Configuration configuration = hexstringtobytearray.getResources().getConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(configuration, "");
                                    tdsRoundLayoutIAuthTabCallback2.setBackgroundColor(new getUrlokhttp(new onTransact(configuration)).ICustomTabsServiceStubProxy());
                                }
                            } else {
                                booleanRef.element = false;
                                ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension3 = hexstringtobytearray.onExtraCallback;
                                if (choosePhoneContactBridgeExtension3 != null && (linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension3.onExtraCallback()) != null) {
                                    linearLayoutOnExtraCallback.setAlpha(1.0f);
                                }
                                processCommandApdu processcommandapdu2 = hexstringtobytearray.onWarmupCompleted;
                                if (processcommandapdu2 != null && (tdsRoundLayoutIAuthTabCallback = processcommandapdu2.IAuthTabCallback()) != null) {
                                    Configuration configuration2 = hexstringtobytearray.getResources().getConfiguration();
                                    Intrinsics.checkNotNullExpressionValue(configuration2, "");
                                    tdsRoundLayoutIAuthTabCallback.setBackgroundColor(new getUrlokhttp(new IAuthTabCallbackDefault(configuration2)).onPostMessage());
                                }
                            }
                        }
                    }
                }
            }
        } else if (!booleanRef2.element && System.currentTimeMillis() - longRef.element < 100) {
            int i11 = access100;
            int i12 = i11 + 19;
            IAuthTabCallbackStubProxy = i12 % 128;
            int i13 = i12 % 2;
            onAccountReturned onaccountreturned2 = hexstringtobytearray.onTransact;
            if (onaccountreturned2 != null) {
                int i14 = i11 + 83;
                IAuthTabCallbackStubProxy = i14 % 128;
                int i15 = i14 % 2;
                LinearLayout linearLayoutOnExtraCallbackWithResult2 = onaccountreturned2.onExtraCallbackWithResult();
                if (linearLayoutOnExtraCallbackWithResult2 != null && linearLayoutOnExtraCallbackWithResult2.getVisibility() == 0) {
                    int i16 = IAuthTabCallbackStubProxy + 81;
                    access100 = i16 % 128;
                    if (i16 % 2 != 0) {
                        z = true;
                    }
                }
            }
            byteArrayToHexString bytearraytohexstring = byteArrayToHexString.onExtraCallbackWithResult;
            hasFeatureHCE hasfeaturehce = hexstringtobytearray.onNavigationEvent;
            if (z) {
                str = "guide_close";
            } else {
                int i17 = access100 + 105;
                IAuthTabCallbackStubProxy = i17 % 128;
                int i18 = i17 % 2;
                str = "guide_open";
            }
            bytearraytohexstring.IAuthTabCallback(hasfeaturehce, str);
            hexstringtobytearray.onExtraCallback(!z);
        } else if (onExtraCallbackWithResult(hexstringtobytearray, null, null, 3, null)) {
            byteArrayToHexString.onExtraCallbackWithResult.IAuthTabCallback(hexstringtobytearray.onNavigationEvent, "button_close");
            hexstringtobytearray.stopSelf();
        } else {
            IAuthTabCallback(-92028634, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), alertWithArgs.onExtraCallbackWithResult(), ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), new Object[]{hexstringtobytearray, layoutParams}, 92028634, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022857).substring(0, 22).codePointAt(13) - 605298760);
            hexstringtobytearray.IAuthTabCallback(false);
        }
        int i19 = IAuthTabCallbackStubProxy + 17;
        access100 = i19 % 128;
        int i20 = i19 % 2;
        return true;
    }

    private final void onNavigationEvent(View view, onDeactivated ondeactivated) {
        WindowManager.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (view != null && (layoutParams = this.IAuthTabCallbackStub) != null) {
            view.setOnTouchListener(new VisitMissionOverlayGuideService$.ExternalSyntheticLambda2(new Ref.BooleanRef(), new Ref.BooleanRef(), new Ref.LongRef(), new Ref.IntRef(), layoutParams, new Ref.IntRef(), new Ref.FloatRef(), new Ref.FloatRef(), ondeactivated, ViewConfiguration.get(view.getContext()).getScaledTouchSlop() << 1, this));
            return;
        }
        int i5 = i3 + 91;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 93;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
            int iIAuthTabCallback2 = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
            IAuthTabCallback(1492393945, alertWithArgs.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017764).substring(0, 4).length() + 108766666, iIAuthTabCallback2, new Object[]{this}, -1492393944, iIAuthTabCallback);
            getPackageType getpackagetype = this.access000;
            if (getpackagetype != null) {
                int i3 = IAuthTabCallbackStubProxy + 61;
                access100 = i3 % 128;
                if (i3 % 2 == 0) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                } else {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
            }
            stopSelf();
            return;
        }
        int iIAuthTabCallback3 = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        int iIAuthTabCallback4 = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        IAuthTabCallback(1492393945, alertWithArgs.onExtraCallbackWithResult(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017764).substring(0, 4).length() + 108766666, iIAuthTabCallback4, new Object[]{this}, -1492393944, iIAuthTabCallback3);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ViewParent parent;
        ViewParent parent2;
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback;
        LinearLayout linearLayoutOnExtraCallbackWithResult;
        LinearLayout linearLayoutOnExtraCallback;
        hexStringToByteArray hexstringtobytearray = (hexStringToByteArray) objArr[0];
        int i = 2 % 2;
        WindowManager windowManager = hexstringtobytearray.IAuthTabCallback_Parcel;
        if (windowManager != null) {
            ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = hexstringtobytearray.onExtraCallback;
            if (choosePhoneContactBridgeExtension == null || (linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback()) == null) {
                parent = null;
            } else {
                int i2 = IAuthTabCallbackStubProxy + 47;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                parent = linearLayoutOnExtraCallback.getParent();
            }
            if (parent != null) {
                ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension2 = hexstringtobytearray.onExtraCallback;
                windowManager.removeView(choosePhoneContactBridgeExtension2 != null ? choosePhoneContactBridgeExtension2.onExtraCallback() : null);
            }
            onAccountReturned onaccountreturned = hexstringtobytearray.onTransact;
            if (onaccountreturned == null || (linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult()) == null) {
                parent2 = null;
            } else {
                int i4 = access100 + 35;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    linearLayoutOnExtraCallbackWithResult.getParent();
                    throw null;
                }
                parent2 = linearLayoutOnExtraCallbackWithResult.getParent();
            }
            if (parent2 != null) {
                int i5 = IAuthTabCallbackStubProxy + 85;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                onAccountReturned onaccountreturned2 = hexstringtobytearray.onTransact;
                windowManager.removeView(onaccountreturned2 != null ? onaccountreturned2.onExtraCallbackWithResult() : null);
                int i7 = IAuthTabCallbackStubProxy + 3;
                access100 = i7 % 128;
                int i8 = i7 % 2;
            }
            processCommandApdu processcommandapdu = hexstringtobytearray.onWarmupCompleted;
            if (((processcommandapdu == null || (tdsRoundLayoutIAuthTabCallback = processcommandapdu.IAuthTabCallback()) == null) ? null : tdsRoundLayoutIAuthTabCallback.getParent()) != null) {
                processCommandApdu processcommandapdu2 = hexstringtobytearray.onWarmupCompleted;
                windowManager.removeView(processcommandapdu2 != null ? processcommandapdu2.IAuthTabCallback() : null);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[PHI: r5
      0x007c: PHI (r5v11 o.ChoosePhoneContactBridgeExtension) = (r5v10 o.ChoosePhoneContactBridgeExtension), (r5v12 o.ChoosePhoneContactBridgeExtension) binds: [B:32:0x007a, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, o.hexStringToByteArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension;
        LinearLayout linearLayoutOnExtraCallback;
        LinearLayout linearLayoutOnExtraCallback2;
        ?? r1 = (hexStringToByteArray) objArr[0];
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) objArr[1];
        int i2 = 2 % 2;
        int i3 = access100 + 1;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = r1.getResources().getDisplayMetrics().heightPixels;
        ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension2 = ((hexStringToByteArray) r1).onExtraCallback;
        int height = (choosePhoneContactBridgeExtension2 == null || (linearLayoutOnExtraCallback2 = choosePhoneContactBridgeExtension2.onExtraCallback()) == null) ? 0 : linearLayoutOnExtraCallback2.getHeight();
        if (layoutParams.y + (height / 2) < i5 / 2) {
            WindowManager.LayoutParams layoutParams2 = ((hexStringToByteArray) r1).IAuthTabCallbackStub;
            ((hexStringToByteArray) r1).asInterface = (layoutParams2 == null || layoutParams2.gravity != 48) ? onDeactivated.BOTTOM : onDeactivated.TOP;
            i = 0;
        } else {
            WindowManager.LayoutParams layoutParams3 = ((hexStringToByteArray) r1).IAuthTabCallbackStub;
            ((hexStringToByteArray) r1).asInterface = (layoutParams3 == null || layoutParams3.gravity != 48) ? onDeactivated.TOP : onDeactivated.BOTTOM;
            i = i5 - height;
        }
        layoutParams.y = i;
        r1.onExtraCallbackWithResult();
        WindowManager windowManager = ((hexStringToByteArray) r1).IAuthTabCallback_Parcel;
        if (windowManager != null) {
            int i6 = access100 + 87;
            int i7 = i6 % 128;
            IAuthTabCallbackStubProxy = i7;
            if (i6 % 2 != 0) {
                choosePhoneContactBridgeExtension = ((hexStringToByteArray) r1).onExtraCallback;
                int i8 = 71 / 0;
                if (choosePhoneContactBridgeExtension != null) {
                    linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback();
                } else {
                    int i9 = i7 + 57;
                    access100 = i9 % 128;
                    int i10 = i9 % 2;
                    linearLayoutOnExtraCallback = null;
                }
            } else {
                choosePhoneContactBridgeExtension = ((hexStringToByteArray) r1).onExtraCallback;
                if (choosePhoneContactBridgeExtension != null) {
                }
            }
            windowManager.updateViewLayout(linearLayoutOnExtraCallback, layoutParams);
        }
        WindowManager windowManager2 = ((hexStringToByteArray) r1).IAuthTabCallback_Parcel;
        if (windowManager2 != null) {
            onAccountReturned onaccountreturned = ((hexStringToByteArray) r1).onTransact;
            windowManager2.updateViewLayout(onaccountreturned != null ? onaccountreturned.onExtraCallbackWithResult() : null, ((hexStringToByteArray) r1).IAuthTabCallbackDefault);
        }
        return null;
    }

    private final void onExtraCallbackWithResult() {
        int height;
        int i;
        LinearLayout linearLayoutOnExtraCallback;
        int i2 = 2 % 2;
        onAccountReturned onaccountreturned = this.onTransact;
        if (onaccountreturned != null) {
            ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = this.onExtraCallback;
            if (choosePhoneContactBridgeExtension == null || (linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback()) == null) {
                height = 0;
            } else {
                int i3 = access100 + 11;
                IAuthTabCallbackStubProxy = i3 % 128;
                if (i3 % 2 != 0) {
                    linearLayoutOnExtraCallback.getHeight();
                    throw null;
                }
                height = linearLayoutOnExtraCallback.getHeight();
                int i4 = access100 + 11;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
            int iIntValue = ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 8}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue();
            WindowManager.LayoutParams layoutParams = this.IAuthTabCallbackDefault;
            if (layoutParams != null) {
                onDeactivated ondeactivated = this.asInterface;
                int i6 = ondeactivated == null ? -1 : onWarmupCompleted.IAuthTabCallback[ondeactivated.ordinal()];
                if (i6 != 1) {
                    int i7 = access100 + 71;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    if (i7 % 2 == 0 ? i6 == 2 : i6 == 4) {
                        onaccountreturned.onExtraCallbackWithResult().setPadding(((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 24}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue(), 0, ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 24}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue(), height - iIntValue);
                        i = 80;
                    } else {
                        i = 17;
                    }
                } else {
                    onaccountreturned.onExtraCallbackWithResult().setPadding(((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 24}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue(), height - iIntValue, ((Integer) varyMatches.onNavigationEvent(486882314, -486882312, new Object[]{this, 24}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).intValue(), 0);
                    i = 48;
                }
                layoutParams.gravity = i;
            }
        }
    }

    private static final Unit onWarmupCompleted(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 83;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
        linearLayoutOnExtraCallbackWithResult.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 75;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    private static final Unit asInterface(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = access100 + 53;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
        linearLayoutOnExtraCallbackWithResult.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(onAccountReturned onaccountreturned) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
        linearLayoutOnExtraCallbackWithResult.setVisibility(8);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 53;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(onAccountReturned onaccountreturned) {
        LinearLayout linearLayoutOnExtraCallbackWithResult;
        int i;
        int i2 = 2 % 2;
        int i3 = access100 + 29;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
            Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
            i = 74;
        } else {
            linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
            Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
            i = 8;
        }
        linearLayoutOnExtraCallbackWithResult.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(boolean z) {
        Cache cache;
        Rally rallyOnExtraCallbackWithResult;
        Cache cache2;
        LinearLayout linearLayoutOnExtraCallbackWithResult;
        int i = 2 % 2;
        onExtraCallbackWithResult();
        WindowManager windowManager = this.IAuthTabCallback_Parcel;
        if (windowManager != null) {
            onAccountReturned onaccountreturned = this.onTransact;
            if (onaccountreturned != null) {
                int i2 = IAuthTabCallbackStubProxy + 121;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
                int i4 = IAuthTabCallbackStubProxy + 91;
                access100 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 5;
                }
            } else {
                linearLayoutOnExtraCallbackWithResult = null;
            }
            windowManager.updateViewLayout(linearLayoutOnExtraCallbackWithResult, this.IAuthTabCallbackDefault);
        }
        onAccountReturned onaccountreturned2 = this.onTransact;
        if (onaccountreturned2 != null) {
            Rally rally = this.asBinder;
            if (rally == null || !rally.postMessage()) {
                if (z) {
                    LinearLayout linearLayoutOnExtraCallbackWithResult2 = onaccountreturned2.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult2, "");
                    AuthenticatorCompanion authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
                    authenticate authenticateVar = authenticate.IN;
                    if (this.asInterface == onDeactivated.BOTTOM) {
                        int i6 = IAuthTabCallbackStubProxy + 57;
                        access100 = i6 % 128;
                        if (i6 % 2 == 0) {
                            Cache cache3 = Cache.UP;
                            throw null;
                        }
                        cache2 = Cache.UP;
                    } else {
                        cache2 = Cache.DOWN;
                    }
                    rallyOnExtraCallbackWithResult = Rally.onExtraCallbackWithResult(Rally.onTransact((Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutOnExtraCallbackWithResult2, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache2, AuthenticatorCompanionAuthenticatorNone.FAST, true, (Function1) null, 16, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new VisitMissionOverlayGuideService$.ExternalSyntheticLambda3(onaccountreturned2), 1, (Object) null), (Object) null, new VisitMissionOverlayGuideService$.ExternalSyntheticLambda4(onaccountreturned2), 1, (Object) null);
                } else {
                    LinearLayout linearLayoutOnExtraCallbackWithResult3 = onaccountreturned2.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult3, "");
                    AuthenticatorCompanion authenticatorCompanion2 = AuthenticatorCompanion.IAuthTabCallback;
                    authenticate authenticateVar2 = authenticate.OUT;
                    if (this.asInterface == onDeactivated.BOTTOM) {
                        int i7 = access100 + 119;
                        IAuthTabCallbackStubProxy = i7 % 128;
                        if (i7 % 2 != 0) {
                            cache = Cache.DOWN;
                            int i8 = 46 / 0;
                        } else {
                            cache = Cache.DOWN;
                        }
                    } else {
                        cache = Cache.UP;
                    }
                    Object[] objArr = {(Rally) RallysKt.onWarmupCompleted(new Object[]{linearLayoutOnExtraCallbackWithResult3, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion2, authenticateVar2, cache, AuthenticatorCompanionAuthenticatorNone.FAST, true, (Function1) null, 16, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new VisitMissionOverlayGuideService$.ExternalSyntheticLambda5(onaccountreturned2), 1, null};
                    rallyOnExtraCallbackWithResult = Rally.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 2128644226), (Object) null, new VisitMissionOverlayGuideService$.ExternalSyntheticLambda6(onaccountreturned2), 1, (Object) null);
                }
                this.asBinder = rallyOnExtraCallbackWithResult;
                if (rallyOnExtraCallbackWithResult != null) {
                    isFireOS.onExtraCallbackWithResult(rallyOnExtraCallbackWithResult, false, 1, (Object) null);
                }
            }
        }
    }

    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 51;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        processCommandApdu processcommandapdu = this.onWarmupCompleted;
        if (processcommandapdu == null) {
            return;
        }
        Rally rally = this.IAuthTabCallback;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
            int i3 = access100 + 21;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback = processcommandapdu.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutIAuthTabCallback, "");
        this.IAuthTabCallback = isFireOS.onExtraCallbackWithResult(Rally.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{tdsRoundLayoutIAuthTabCallback, AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(z ? authenticate.IN : authenticate.OUT, AuthenticatorCompanionAuthenticatorNone.FAST), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Object) null, new VisitMissionOverlayGuideService$.ExternalSyntheticLambda1(processcommandapdu, z), 1, (Object) null), false, 1, (Object) null);
        int i5 = IAuthTabCallbackStubProxy + 71;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallback(processCommandApdu processcommandapdu, boolean z) {
        float f;
        int i = 2 % 2;
        TdsRoundLayout tdsRoundLayoutIAuthTabCallback = processcommandapdu.IAuthTabCallback();
        if (z) {
            int i2 = access100 + 27;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            f = 1.0f;
        } else {
            int i4 = IAuthTabCallbackStubProxy + 67;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            f = 0.0f;
        }
        tdsRoundLayoutIAuthTabCallback.setAlpha(f);
        return Unit.INSTANCE;
    }

    static /* synthetic */ boolean onExtraCallbackWithResult(hexStringToByteArray hexstringtobytearray, View view, View view2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = hexstringtobytearray.onExtraCallback;
            if (choosePhoneContactBridgeExtension != null) {
                int i3 = IAuthTabCallbackStubProxy + 3;
                access100 = i3 % 128;
                int i4 = i3 % 2;
                view = choosePhoneContactBridgeExtension.onExtraCallback();
            } else {
                int i5 = IAuthTabCallbackStubProxy + 11;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                view = null;
            }
        }
        if ((i & 2) != 0) {
            int i7 = IAuthTabCallbackStubProxy + 67;
            access100 = i7 % 128;
            int i8 = i7 % 2;
            processCommandApdu processcommandapdu = hexstringtobytearray.onWarmupCompleted;
            if (processcommandapdu != null) {
                view2 = processcommandapdu.IAuthTabCallback();
                int i9 = access100 + 15;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
            } else {
                view2 = null;
            }
        }
        boolean zIAuthTabCallback = hexstringtobytearray.IAuthTabCallback(view, view2);
        int i11 = access100 + 43;
        IAuthTabCallbackStubProxy = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 25 / 0;
        }
        return zIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r10 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r2 = new int[2];
        r0 = new int[2];
        r9.getLocationOnScreen(r2);
        r10.getLocationOnScreen(r0);
        r3 = r2[0];
        r7 = new android.graphics.Rect(r3, r2[1], r9.getWidth() + r3, r2[1] + r9.getHeight());
        r9 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        return android.graphics.Rect.intersects(r7, new android.graphics.Rect(r9, r0[1], r10.getWidth() + r9, r0[1] + r10.getHeight()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r10 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean IAuthTabCallback(View view, View view2) {
        int i = 2 % 2;
        int i2 = access100 + 21;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view != null) {
            int i4 = i3 + 11;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTaskRemoved(@Nullable Intent intent) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Service*/.onTaskRemoved(intent);
        IAuthTabCallback();
        int i4 = access100 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onWarmupCompleted(@NotNull Context context, @NotNull hasFeatureHCE hasfeaturehce) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(hasfeaturehce, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) hexStringToByteArray.class).putExtra("extra_visit_mission_overlay_content", (Parcelable) hasfeaturehce);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            context.startService(intentPutExtra);
            int i2 = onNavigationEvent + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public final void onExtraCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            context.stopService(new Intent(context, (Class<?>) hexStringToByteArray.class));
            int i2 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(stopHCE stophce, boolean z) {
        int iIEngagementSignalsCallbackStub;
        LinearLayout linearLayoutOnExtraCallback;
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 1;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        onAccountReturned onaccountreturned = this.onTransact;
        if (onaccountreturned != null) {
            if (stophce == null) {
                int i4 = i2 + 81;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 != 0) {
                    LinearLayout linearLayoutOnExtraCallbackWithResult = onaccountreturned.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult, "");
                    linearLayoutOnExtraCallbackWithResult.setVisibility(107);
                    return;
                } else {
                    LinearLayout linearLayoutOnExtraCallbackWithResult2 = onaccountreturned.onExtraCallbackWithResult();
                    Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult2, "");
                    linearLayoutOnExtraCallbackWithResult2.setVisibility(8);
                    return;
                }
            }
            Context context = onaccountreturned.onExtraCallbackWithResult().getContext();
            TdsImageView tdsImageView = onaccountreturned.onExtraCallback;
            String strOnExtraCallbackWithResult = stophce.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                iIEngagementSignalsCallbackStub = isNfcEnable.onExtraCallback(this, strOnExtraCallbackWithResult, im.toss.tds.R.color.static_white_opacity_300);
            } else {
                Intrinsics.checkNotNull(context);
                Configuration configuration = context.getResources().getConfiguration();
                Intrinsics.checkNotNullExpressionValue(configuration, "");
                iIEngagementSignalsCallbackStub = new getUrlokhttp(new IAuthTabCallbackStub(configuration)).requestPostMessageChannel().IEngagementSignalsCallbackStub();
            }
            tdsImageView.setImageTintList(ColorStateList.valueOf(iIEngagementSignalsCallbackStub));
            TdsRoundLayout tdsRoundLayout = onaccountreturned.onNavigationEvent;
            String strOnExtraCallback = stophce.onExtraCallback();
            if (strOnExtraCallback == null) {
                int i5 = IAuthTabCallbackStubProxy + 91;
                access100 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                strOnExtraCallback = "#1B4AA6";
            }
            tdsRoundLayout.setBackgroundColor(isNfcEnable.onExtraCallback(this, strOnExtraCallback, im.toss.tds.R.color.blue_900));
            SubTypography8 subTypography8 = onaccountreturned.asBinder;
            Intrinsics.checkNotNullExpressionValue(subTypography8, "");
            isNfcEnable.IAuthTabCallback(subTypography8, stophce.onWarmupCompleted(), stophce.IAuthTabCallback(), im.toss.tds.R.color.static_white);
            onaccountreturned.onExtraCallback.setOnTouchListener(new VisitMissionOverlayGuideService$.ExternalSyntheticLambda0(this));
            NFCUtils nFCUtilsOnNavigationEvent = stophce.onNavigationEvent();
            contact contactVar = onaccountreturned.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(contactVar, "");
            isNfcEnable.onExtraCallbackWithResult(nFCUtilsOnNavigationEvent, contactVar, 0, (Integer) null, 8, (Object) null);
            if (!z) {
                LinearLayout linearLayoutOnExtraCallbackWithResult3 = onaccountreturned.onExtraCallbackWithResult();
                Intrinsics.checkNotNullExpressionValue(linearLayoutOnExtraCallbackWithResult3, "");
                linearLayoutOnExtraCallbackWithResult3.setVisibility(8);
                return;
            }
            ChoosePhoneContactBridgeExtension choosePhoneContactBridgeExtension = this.onExtraCallback;
            if (choosePhoneContactBridgeExtension != null) {
                int i6 = IAuthTabCallbackStubProxy + 105;
                access100 = i6 % 128;
                if (i6 % 2 == 0) {
                    linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback();
                    int i7 = 47 / 0;
                    if (linearLayoutOnExtraCallback == null) {
                        return;
                    }
                } else {
                    linearLayoutOnExtraCallback = choosePhoneContactBridgeExtension.onExtraCallback();
                    if (linearLayoutOnExtraCallback == null) {
                        return;
                    }
                }
                if (!linearLayoutOnExtraCallback.isLaidOut() || linearLayoutOnExtraCallback.isLayoutRequested()) {
                    linearLayoutOnExtraCallback.addOnLayoutChangeListener(new onExtraCallback());
                    return;
                }
                int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                IAuthTabCallback(1154184708, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -1154184704, iOnExtraCallbackWithResult);
                onExtraCallbackWithResult(this, true);
            }
        }
    }

    public static final /* synthetic */ void onExtraCallback(hexStringToByteArray hexstringtobytearray) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(1154184708, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{hexstringtobytearray}, -1154184704, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallback(WindowManager.LayoutParams layoutParams) {
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132022857).substring(0, 22).codePointAt(13) - 605298760;
        IAuthTabCallback(-92028634, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), alertWithArgs.onExtraCallbackWithResult(), ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), new Object[]{this, layoutParams}, 92028634, iCodePointAt);
    }

    private final void onWarmupCompleted() {
        int iIAuthTabCallback = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        int iIAuthTabCallback2 = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        IAuthTabCallback(1492393945, alertWithArgs.onExtraCallbackWithResult(), 108766666 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(2132017764).substring(0, 4).length(), iIAuthTabCallback2, new Object[]{this}, -1492393944, iIAuthTabCallback);
    }

    private final void IAuthTabCallback(startHCE starthce) {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
        IAuthTabCallback(-2081610269, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, starthce}, 2081610271, iOnExtraCallbackWithResult);
    }

    private final void onExtraCallback() {
        int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
        int iIAuthTabCallback = ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback();
        IAuthTabCallback(-457374963, ComposableSingletons$GuardianVerifyReasonGuideBottomSheetKt$.ExternalSyntheticLambda2.IAuthTabCallback(), alertWithArgs.onExtraCallbackWithResult(), iIAuthTabCallback, new Object[]{this}, 457374966, iOnExtraCallbackWithResult);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
