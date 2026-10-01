package im.toss.uikit.onboarding;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.onboarding.SmsNumberInput$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkSettings;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.getAdService;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.isOneShot;
import o.noStore;
import o.pxToDp;
import o.readIntokhttp;
import o.response;
import o.runOnUiThreadDelayed;
import o.setDone;
import o.setProtocolsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SmsNumberInput extends FrameLayout {
    private static int IAuthTabCallback_Parcel = 1;
    private static int getInterfaceDescriptor;
    private final ConstraintLayout IAuthTabCallback;
    private final View IAuthTabCallbackDefault;
    private final View IAuthTabCallbackStub;
    private Function1<? super String, Unit> access000;
    private final TextView access100;
    private runOnUiThreadDelayed asBinder;
    private boolean asInterface;
    private final View onExtraCallback;
    private Rally onExtraCallbackWithResult;
    private runOnUiThreadDelayed onNavigationEvent;
    private Rally onTransact;
    private final TdsRoundLayout onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsNumberInput(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmsNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(function0, contextMenu, view, contextMenuInfo);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function0 function0, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(function0, menuItem);
        }
        onWarmupCompleted(function0, menuItem);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i5 | i));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i | i5)) | (~(i13 | i8)) | (~(i6 | i));
        int i16 = i6 + i5 + i4 + ((-298151579) * i2) + ((-427515960) * i3);
        int i17 = i16 * i16;
        int i18 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i5) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i4) + ((-16252928) * i2) + (423624704 * i3) + (1109590016 * i17);
        int i19 = ((i6 * (-2003555040)) - 1632655964) + (i5 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i4 * (-2003554617)) + (i2 * 1812671363) + (i3 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        if (i20 != 1) {
            return i20 != 2 ? i20 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
        }
        int i21 = 0;
        SmsNumberInput smsNumberInput = (SmsNumberInput) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i22 = 2 % 2;
        int i23 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i24 = i23 % 128;
        getInterfaceDescriptor = i24;
        if (i23 % 2 == 0 ? (iIntValue2 & 2) == 0 : (iIntValue2 & 2) == 0) {
            i21 = iIntValue;
        } else {
            int i25 = i24 + 49;
            IAuthTabCallback_Parcel = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 2 % 3;
            }
        }
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{smsNumberInput, Boolean.valueOf(zBooleanValue), Integer.valueOf(i21)}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 28536530, -28536530);
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SmsNumberInput smsNumberInput) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(smsNumberInput);
        int i4 = getInterfaceDescriptor + 5;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unitIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsNumberInput(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        View.inflate(context, im.toss.uikit.R.layout.sms_number_input, this);
        View viewFindViewById = findViewById(im.toss.uikit.R.id.text_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.access100 = (TextView) viewFindViewById;
        TdsRoundLayout tdsRoundLayoutFindViewById = findViewById(im.toss.uikit.R.id.border_container);
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutFindViewById, "");
        this.onWarmupCompleted = tdsRoundLayoutFindViewById;
        View viewFindViewById2 = findViewById(im.toss.uikit.R.id.cursor);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.IAuthTabCallbackDefault = viewFindViewById2;
        ConstraintLayout constraintLayoutFindViewById = findViewById(im.toss.uikit.R.id.container);
        Intrinsics.checkNotNullExpressionValue(constraintLayoutFindViewById, "");
        this.IAuthTabCallback = constraintLayoutFindViewById;
        View viewFindViewById3 = findViewById(im.toss.uikit.R.id.container_color_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.IAuthTabCallbackStub = viewFindViewById3;
        View viewFindViewById4 = findViewById(im.toss.uikit.R.id.border_color_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.onExtraCallback = viewFindViewById4;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -907200581, 907200584);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SmsNumberInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback_Parcel + 25;
            getInterfaceDescriptor = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 101;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final TextView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        TextView textView = this.access100;
        int i5 = i3 + 97;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return textView;
    }

    public final View onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 73;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View view = this.IAuthTabCallbackDefault;
        int i4 = i3 + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public final TdsRoundLayout onExtraCallbackWithResult() {
        TdsRoundLayout tdsRoundLayout;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 7;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            tdsRoundLayout = this.onWarmupCompleted;
            int i4 = 37 / 0;
        } else {
            tdsRoundLayout = this.onWarmupCompleted;
        }
        int i5 = i2 + 9;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return tdsRoundLayout;
        }
        throw null;
    }

    public final View onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 115;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        View view = this.onExtraCallback;
        int i5 = i2 + 123;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public final void setOnLongNumberInserted(@Nullable Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.access000 = function1;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 53;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final runOnUiThreadDelayed IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        int i5 = i3 + 83;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return runonuithreaddelayed;
        }
        throw null;
    }

    public final void setAppearTextTimeline(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 1;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = runonuithreaddelayed;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onExtraCallback + 49;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 74 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallbackWithResult) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.uikit.onboarding.SmsNumberInput.onExtraCallbackWithResult.onNavigationEvent + 45;
            im.toss.uikit.onboarding.SmsNumberInput.onExtraCallbackWithResult.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Rally rallyOnWarmupCompleted;
        SmsNumberInput smsNumberInput = (SmsNumberInput) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = smsNumberInput.asBinder;
        if (runonuithreaddelayed != null && runonuithreaddelayed.postMessage()) {
            runOnUiThreadDelayed runonuithreaddelayed2 = smsNumberInput.asBinder;
            if (runonuithreaddelayed2 != null) {
                int i4 = IAuthTabCallback_Parcel + 49;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                runonuithreaddelayed2.IAuthTabCallback();
            }
            smsNumberInput.asBinder = null;
        }
        Rally rally = smsNumberInput.onTransact;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        smsNumberInput.IAuthTabCallbackDefault.setVisibility(zBooleanValue ? 0 : 8);
        if (zBooleanValue) {
            int i6 = getInterfaceDescriptor + 1;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            rallyOnWarmupCompleted = smsNumberInput.onWarmupCompleted(iIntValue);
            isFireOS.onExtraCallbackWithResult(rallyOnWarmupCompleted, false, 1, (Object) null);
            int i8 = IAuthTabCallback_Parcel + 91;
            getInterfaceDescriptor = i8 % 128;
            int i9 = i8 % 2;
        } else {
            rallyOnWarmupCompleted = null;
        }
        smsNumberInput.onTransact = rallyOnWarmupCompleted;
        return null;
    }

    private final Rally onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 53;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IAuthTabCallbackDefault, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asBinder(), 200), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), -1, null, 400, null, null, null, Integer.valueOf(i), 0L, false, 1768, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        int i5 = IAuthTabCallback_Parcel + 9;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return rally;
    }

    private final void access000() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.IAuthTabCallbackDefault());
        this.onNavigationEvent = isFireOS.onExtraCallbackWithResult(asInterface(), false, 1, (Object) null);
        int i4 = getInterfaceDescriptor + 41;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    private final runOnUiThreadDelayed asInterface() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TextView textView = this.access100;
        Address address = Address.onNavigationEvent;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(address.asBinder(), 50);
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{textView, isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.access100, isMuted.asBinder(RallysKt.onExtraCallback(address.IAuthTabCallback(), 400), Float.valueOf(0.7f), fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.onExtraCallback, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.IAuthTabCallback(), 400), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IAuthTabCallbackStub, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.IAuthTabCallback(), 400), Float.valueOf(this.IAuthTabCallbackStub.getAlpha()), fValueOf, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), isFireOS.onExtraCallbackWithResult((Rally) RallysKt.onWarmupCompleted(new Object[]{this.onWarmupCompleted, isMuted.asBinder(RallysKt.onExtraCallback(address.IAuthTabCallback(), 400), Float.valueOf(0.8f), fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), false, 1, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null);
        int i4 = IAuthTabCallback_Parcel + 27;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return runonuithreaddelayedOnWarmupCompleted;
    }

    public final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Rally rally = this.onExtraCallbackWithResult;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
            int i4 = getInterfaceDescriptor + 87;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        }
        Rally rally2 = (Rally) RallysKt.onWarmupCompleted(new Object[]{this.IAuthTabCallbackStub, isMuted.onNavigationEvent(RallysKt.onExtraCallback(Address.onNavigationEvent.asInterface(), 1000), Float.valueOf(0.1f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), -1, null, 0, null, null, null, 0, 0L, false, 2040, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
        rally2.receiveFile();
        this.onExtraCallbackWithResult = rally2;
        int i6 = IAuthTabCallback_Parcel + 101;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final boolean onWarmupCompleted(Function0 function0, MenuItem menuItem) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        if (menuItem.getItemId() != 16908322) {
            int i4 = getInterfaceDescriptor + 13;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        function0.invoke();
        int i6 = getInterfaceDescriptor + 83;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static final void onNavigationEvent(Function0 function0, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i = 2 % 2;
        contextMenu.add(0, android.R.id.paste, 0, android.R.string.paste).setAlphabeticShortcut('v').setOnMenuItemClickListener(new SmsNumberInput$.ExternalSyntheticLambda1(function0)).setShowAsAction(2);
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onNavigationEvent(@NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        setLongClickable(true);
        setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() { // from class: im.toss.uikit.onboarding.SmsNumberInput$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnCreateContextMenuListener
            public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 103;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    SmsNumberInput.IAuthTabCallback(function0, contextMenu, view, contextMenuInfo);
                    throw null;
                }
                SmsNumberInput.IAuthTabCallback(function0, contextMenu, view, contextMenuInfo);
                int i4 = IAuthTabCallback + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.extraCallback;
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
        setProtocolsokhttp.IAuthTabCallback(this, iAuthTabCallback, getContext().getString(im.toss.uikit.R.string.sms_number_input_check_pop_up_menu));
        int i2 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        CharSequence text = this.access100.getText();
        Intrinsics.checkNotNullExpressionValue(text, "");
        if (text.length() == 0) {
            int i2 = IAuthTabCallback_Parcel + 47;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        Object obj = null;
        if (!z) {
            this.onExtraCallback.setAlpha(0.0f);
            this.access100.setText((CharSequence) null);
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            int i4 = getInterfaceDescriptor + 53;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                runonuithreaddelayed.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            runonuithreaddelayed.IAuthTabCallback();
        }
        this.onNavigationEvent = null;
        this.asBinder = isFireOS.onExtraCallbackWithResult(onTransact(), false, 1, (Object) null);
    }

    private final runOnUiThreadDelayed onTransact() {
        int i = 2 % 2;
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        TextView textView = this.access100;
        Address address = Address.onNavigationEvent;
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = RallysKt.onExtraCallback(address.asBinder(), 50);
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Object obj = null;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsKt.listOf((Object[]) new Rally[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{textView, isMuted.onNavigationEvent(appLovinSdkSettingsOnExtraCallback, fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.access100, isMuted.asBinder(RallysKt.onExtraCallback(address.IAuthTabCallback(), 100), fValueOf, Float.valueOf(0.7f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), (Rally) RallysKt.onWarmupCompleted(new Object[]{this.onExtraCallback, isMuted.onNavigationEvent(RallysKt.onExtraCallback(address.IAuthTabCallback(), 100), fValueOf, fValueOf2, (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, Boolean.FALSE, 0, 0L, false, 3833, (Object) null), (Object) null, new Function0() { // from class: im.toss.uikit.onboarding.SmsNumberInput$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 1;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                SmsNumberInput smsNumberInput = this.f$0;
                if (i4 != 0) {
                    return SmsNumberInput.onExtraCallbackWithResult(smsNumberInput);
                }
                SmsNumberInput.onExtraCallbackWithResult(smsNumberInput);
                throw null;
            }
        }, 1, (Object) null);
        int i2 = IAuthTabCallback_Parcel + 31;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return runonuithreaddelayedOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(SmsNumberInput smsNumberInput) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            smsNumberInput.access100.setText((CharSequence) null);
            int i3 = 16 / 0;
            if (smsNumberInput.asInterface) {
                onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{smsNumberInput, true, 0, 2, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 604945559, -604945558);
                int i4 = getInterfaceDescriptor + 25;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            smsNumberInput.access100.setText((CharSequence) null);
            if (!(!smsNumberInput.asInterface)) {
            }
        }
        smsNumberInput.IAuthTabCallbackDefault();
        return Unit.INSTANCE;
    }

    public final void setText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.areEqual(this.access100.getText(), str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(this.access100.getText(), str)) {
            int i3 = getInterfaceDescriptor + 57;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            runOnUiThreadDelayed runonuithreaddelayed = this.asBinder;
            if (runonuithreaddelayed == null || !runonuithreaddelayed.postMessage()) {
                int i5 = IAuthTabCallback_Parcel + 17;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
        }
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -1090521190, 1090521192);
        this.access100.setText(str);
        access000();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r5 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback();
        r9 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback();
        onExtraCallback(r5, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), new java.lang.Object[]{r12, true, 0, 2, null}, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), r9, 604945559, -604945558);
        r1 = im.toss.uikit.onboarding.SmsNumberInput.IAuthTabCallback_Parcel + 43;
        im.toss.uikit.onboarding.SmsNumberInput.getInterfaceDescriptor = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r1.length() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r12.asBinder = o.isFireOS.onExtraCallbackWithResult(onTransact(), false, 1, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setFocused() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 15;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = false;
            CharSequence text = this.access100.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
        } else {
            this.asInterface = true;
            CharSequence text2 = this.access100.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "");
        }
    }

    public final void setUnFocused() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = true;
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this, false, 0, 5, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 604945559, -604945558);
        } else {
            this.asInterface = false;
            onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), new Object[]{this, false, 0, 2, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 604945559, -604945558);
        }
        int i3 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SmsNumberInput smsNumberInput = (SmsNumberInput) objArr[0];
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = smsNumberInput.onNavigationEvent;
        Object obj = null;
        if (runonuithreaddelayed != null) {
            int i2 = getInterfaceDescriptor + 17;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 == 0) {
                runonuithreaddelayed.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            runonuithreaddelayed.onNavigationEvent();
        }
        runOnUiThreadDelayed runonuithreaddelayed2 = smsNumberInput.asBinder;
        if (runonuithreaddelayed2 != null) {
            runonuithreaddelayed2.onNavigationEvent();
            int i3 = getInterfaceDescriptor + 15;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
        }
        Rally rally = smsNumberInput.onTransact;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        Rally rally2 = smsNumberInput.onExtraCallbackWithResult;
        if (rally2 != null) {
            int i5 = getInterfaceDescriptor + 7;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            rally2.ICustomTabsServiceStub();
            if (i6 == 0) {
                throw null;
            }
        }
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SmsNumberInput smsNumberInput = (SmsNumberInput) objArr[0];
        int i = 2 % 2;
        smsNumberInput.access100.setBackground(null);
        smsNumberInput.access100.setGravity(17);
        TextView textView = smsNumberInput.access100;
        response responseVar = response.Bold;
        Context context = smsNumberInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        smsNumberInput.access100.setSaveEnabled(false);
        TextView textView2 = smsNumberInput.access100;
        Context context2 = smsNumberInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        textView2.setTextColor(new getUrlokhttp(new onExtraCallback(configuration)).asBinder());
        TextView textView3 = smsNumberInput.access100;
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        DisplayMetrics displayMetrics = smsNumberInput.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(60, displayMetrics);
        DisplayMetrics displayMetrics2 = smsNumberInput.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fOnNavigationEvent = varyMatches.onNavigationEvent(32, displayMetrics2);
        float f = smsNumberInput.getContext().getResources().getConfiguration().fontScale;
        Intrinsics.checkNotNullExpressionValue(smsNumberInput.getResources().getDisplayMetrics(), "");
        layoutParams.height = Math.max(iOnNavigationEvent, (int) ((fOnNavigationEvent * f) + varyMatches.onNavigationEvent(28, r8)));
        textView3.setLayoutParams(layoutParams);
        TdsRoundLayout tdsRoundLayout = smsNumberInput.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(smsNumberInput.getResources().getDisplayMetrics(), "");
        tdsRoundLayout.setRadius(varyMatches.onNavigationEvent(12, r2));
        smsNumberInput.IAuthTabCallbackStub.setAlpha(0.1f);
        smsNumberInput.onExtraCallback.setAlpha(0.0f);
        View view = smsNumberInput.IAuthTabCallbackStub;
        Context context3 = smsNumberInput.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        view.setBackgroundColor(new getUrlokhttp(new onExtraCallbackWithResult(configuration2)).onMessageChannelReady());
        int i2 = getInterfaceDescriptor + 63;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private final void asBinder() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -1090521190, 1090521192);
    }

    private final void IAuthTabCallbackStub() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, R.drawable.IAuthTabCallback(), new Object[]{this}, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -907200581, 907200584);
    }

    private final void onExtraCallbackWithResult(boolean z, int i) {
        Object[] objArr = {this, Boolean.valueOf(z), Integer.valueOf(i)};
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 28536530, -28536530);
    }

    static /* synthetic */ void IAuthTabCallback(SmsNumberInput smsNumberInput, boolean z, int i, int i2, Object obj) {
        Object[] objArr = {smsNumberInput, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), obj};
        onExtraCallback(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 604945559, -604945558);
    }
}
