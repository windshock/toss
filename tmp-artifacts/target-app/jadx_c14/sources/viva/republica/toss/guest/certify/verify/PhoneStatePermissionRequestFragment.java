package viva.republica.toss.guest.certify.verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.base.BaseFragment;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.post.Paragraph;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinSdkSettings;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.Cache;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.EncryptedContentInfoParser;
import o.SetDetectableSize;
import o.access8100;
import o.authenticate;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeUriNullableCollection;
import o.getByteBuffer;
import o.getExtraParameters;
import o.getParamImp;
import o.getWrite;
import o.initMiniApp;
import o.isFireOS;
import o.jniHandleMemoryPressure;
import o.pxToDp;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import o.writeRaw;
import o.zzad;
import o.zzaz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.guest.certify.CertifyGuestViewModel;
import viva.republica.toss.guest.certify.fragment.GuestBaseFragment;
import viva.republica.toss.guest.certify.verify.PhoneArsVerificationFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhoneStatePermissionRequestFragment extends Hilt_PhoneStatePermissionRequestFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackDefault = 1;
    private static long IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static int asInterface;
    public static final int onExtraCallbackWithResult;
    private static int onTransact;

    @Inject
    public zzad environments;
    private View onExtraCallback;
    private View onNavigationEvent;
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda19
        public final Object invoke() {
            return PhoneStatePermissionRequestFragment.onNavigationEvent(this.f$0);
        }
    });
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda20
        public final Object invoke() {
            return PhoneStatePermissionRequestFragment.onExtraCallback(this.f$0);
        }
    });

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[jniHandleMemoryPressure.values().length];
            try {
                iArr[jniHandleMemoryPressure.USIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onExtraCallbackWithResult = iArr;
        }
    }

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        int i = onTransact + 87;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i);
        int i11 = i9 | i10 | (~(i6 | i4));
        int i12 = i8 | i6;
        int i13 = (~((~i4) | i6)) | i10;
        int i14 = i6 + i + i5 + (111814883 * i2) + (1975835455 * i3);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i6) - 1583611904) + (47848387 * i) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i5) + ((-648806400) * i2) + (1432616960 * i3) + (442957824 * i15);
        int i17 = ((i6 * 961080817) - 60187382) + (i * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i5 * 961079685) + (i2 * 1618335983) + (i3 * 193609403) + (i15 * 1988296704);
        switch (i16 + (i17 * i17 * 176226304)) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asBinder(objArr);
            default:
                return onExtraCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        Context context = (Context) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(phoneStatePermissionRequestFragment, context, th);
        int i4 = asInterface + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(view);
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        int i5 = asInterface + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 91;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Unit unit;
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 71;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(-272225971, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 272225976, new Object[]{phoneStatePermissionRequestFragment, bool});
            int i3 = 14 / 0;
        } else {
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) IAuthTabCallback(-272225971, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent4, 272225976, new Object[]{phoneStatePermissionRequestFragment, bool});
        }
        int i4 = IAuthTabCallbackDefault + 19;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        Context context = (Context) objArr[1];
        Pair pair = (Pair) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(phoneStatePermissionRequestFragment, context, pair);
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 25;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        Context context = (Context) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(phoneStatePermissionRequestFragment, context, th);
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ String onExtraCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(phoneStatePermissionRequestFragment);
        int i4 = asInterface + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Intent intent) {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(phoneStatePermissionRequestFragment, intent);
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        asInterface(phoneStatePermissionRequestFragment);
        int i4 = asInterface + 9;
        IAuthTabCallbackDefault = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(View view) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(view);
        int i4 = asInterface + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Boolean bool, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) IAuthTabCallback(987266611, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -987266608, new Object[]{bool, setDetectableSize});
        int i4 = IAuthTabCallbackDefault + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(th, setDetectableSize);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(th, setDetectableSize);
        int i3 = IAuthTabCallbackDefault + 77;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(phoneStatePermissionRequestFragment, view);
        }
        onNavigationEvent(phoneStatePermissionRequestFragment, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = asInterface + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = IAuthTabCallbackDefault + 41;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStub = IAuthTabCallbackStub(phoneStatePermissionRequestFragment);
        int i4 = asInterface + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return strIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 109;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(view);
        int i4 = IAuthTabCallbackDefault + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(phoneStatePermissionRequestFragment, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(phoneStatePermissionRequestFragment, th);
        int i3 = IAuthTabCallbackDefault + 9;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 65;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 91;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return 1232467L;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        phoneStatePermissionRequestFragment.onRelationshipValidationResult();
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final zzad onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 15;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zzad zzadVar = this.environments;
        if (zzadVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 119;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return zzadVar;
    }

    private final String onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallback.getValue();
        int i4 = asInterface + 81;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return str;
    }

    private static final String IAuthTabCallbackStub(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String string = phoneStatePermissionRequestFragment.getString(R.string.phone_state_permission_request_title);
        int i4 = asInterface + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    private final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.onWarmupCompleted.getValue();
        int i4 = asInterface + 33;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onExtraCallbackWithResult(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            string = phoneStatePermissionRequestFragment.getString(R.string.phone_state_permission_request_descripton);
            int i3 = 98 / 0;
        } else {
            string = phoneStatePermissionRequestFragment.getString(R.string.phone_state_permission_request_descripton);
        }
        int i4 = IAuthTabCallbackDefault + 67;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getAccessibilityPaneTitle(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            String string = context.getString(R.string.app_phone_state_permission_request_description);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        Intrinsics.checkNotNullParameter(context, "");
        String string2 = context.getString(R.string.app_phone_state_permission_request_description);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int i3 = 19 / 0;
        return string2;
    }

    public static final class IAuthTabCallback extends OnBackPressedCallback {
        IAuthTabCallback() {
            super(true);
        }

        public void handleOnBackPressed() {
            Object[] objArr = {PhoneStatePermissionRequestFragment.this};
            PhoneStatePermissionRequestFragment.IAuthTabCallback(-343913347, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 343913347, objArr);
        }
    }

    @Override // viva.republica.toss.guest.certify.verify.Hilt_PhoneStatePermissionRequestFragment
    public void onAttach(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().onExtraCallbackWithResult(this, new IAuthTabCallback());
        int i2 = IAuthTabCallbackDefault + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 33;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 4;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 24 - TextUtils.getTrimmedLength(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() % (IAuthTabCallbackStub ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), 58 - TextUtils.indexOf((CharSequence) "", '0'), 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, TextUtils.getTrimmedLength("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 59, 6383 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i8 = $10 + 113;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            try {
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 59 - View.resolveSize(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onNavigationEvent(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            phoneStatePermissionRequestFragment.asBinder();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        phoneStatePermissionRequestFragment.asBinder();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context2 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(1);
        Context context3 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsTopV1View tdsTopV1View = new TdsTopV1View(context3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsTopV1View.setVisibility(8);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperText(onTransact());
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, tdsTopV1View);
        this.onNavigationEvent = tdsTopV1View;
        BaseTextView baseTextView = (BaseTextView) Paragraph.class.getDeclaredConstructor(Context.class).newInstance(linearLayout2.getContext());
        Intrinsics.checkNotNull(baseTextView);
        baseTextView.setText(IAuthTabCallbackDefault());
        baseTextView.setTextSize(13.0f);
        setMinWebSocketMessageToCompressokhttp.IAuthTabCallback(baseTextView, varyMatches.IAuthTabCallback(baseTextView, 24));
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, baseTextView);
        this.onExtraCallback = baseTextView;
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        View tdsBottomCtaV1View = new TdsBottomCtaV1View(context4);
        String string = tdsBottomCtaV1View.getContext().getString(R.string.app_phone_state_permission_agree_permission);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return PhoneStatePermissionRequestFragment.onExtraCallbackWithResult(this.f$0, (View) obj);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsBottomCtaV1View.onNavigationEvent(tdsBottomCtaV1View, tdsScrollView, false, 0, 6, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        View view = this.onNavigationEvent;
        View view2 = null;
        if (view == null) {
            int i2 = IAuthTabCallbackDefault + 37;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = asInterface + 113;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            view = null;
        }
        View view3 = this.onExtraCallback;
        if (view3 == null) {
            int i6 = IAuthTabCallbackDefault + 123;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        onNavigationEvent(linearLayout, view, view2, tdsBottomCtaV1View);
        return linearLayout;
    }

    private static final Unit onExtraCallback(View view) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(0);
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(View view) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(0);
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(View view) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        view.setVisibility(0);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 27;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onNavigationEvent(View view, final View view2, final View view3, final View view4) {
        int i = 2 % 2;
        pxToDp.onNavigationEvent onnavigationevent = new pxToDp.onNavigationEvent(0, 1, (DefaultConstructorMarker) null);
        AuthenticatorCompanion authenticatorCompanion = AuthenticatorCompanion.IAuthTabCallback;
        authenticate authenticateVar = authenticate.IN;
        Cache cache = Cache.UP;
        AuthenticatorCompanionAuthenticatorNone authenticatorCompanionAuthenticatorNone = AuthenticatorCompanionAuthenticatorNone.SLOW;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null);
        Boolean bool = Boolean.FALSE;
        isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted(view, onnavigationevent, CollectionsKt.listOf(new Rally[]{Rally.onTransact(RallysKt.onExtraCallback(view2, appLovinSdkSettingsIAuthTabCallback, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 958, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda15
            public final Object invoke() {
                return PhoneStatePermissionRequestFragment.IAuthTabCallback(view2);
            }
        }, 1, (Object) null), Rally.onTransact(RallysKt.onExtraCallback(view3, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 958, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda16
            public final Object invoke() {
                return PhoneStatePermissionRequestFragment.onExtraCallbackWithResult(view3);
            }
        }, 1, (Object) null), Rally.onTransact(RallysKt.onExtraCallback(view4, AuthenticatorCompanion.IAuthTabCallback(authenticatorCompanion, authenticateVar, cache, authenticatorCompanionAuthenticatorNone, false, (Function1) null, 24, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 958, (Object) null), (Object) null, new Function0() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda17
            public final Object invoke() {
                Object[] objArr = {view4};
                return (Unit) PhoneStatePermissionRequestFragment.IAuthTabCallback(-742441057, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 742441063, objArr);
            }
        }, 1, (Object) null)}), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 500, 0L, false, 3320, (Object) null), false, 1, (Object) null);
        int i2 = asInterface + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void asInterface(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        CertifyGuestViewModel certifyGuestViewModelOnUnminimized = phoneStatePermissionRequestFragment.onUnminimized();
        Context contextRequireContext = phoneStatePermissionRequestFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        certifyGuestViewModelOnUnminimized.IAuthTabCallback(contextRequireContext);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 17;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Boolean bool = (Boolean) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Intrinsics.checkNotNull(bool);
        Object[] objArr2 = new Object[1];
        a(new char[]{56859, 8011, 23699, 40393, 56086, 6214, 22954, 38641, 54317}, MotionEvent.axisFromString("") + 49478, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), zzaz.onExtraCallbackWithResult(bool.booleanValue()));
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 87;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment = (PhoneStatePermissionRequestFragment) objArr[0];
        final Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232471L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda18
            public final Object invoke(Object obj) {
                return PhoneStatePermissionRequestFragment.onExtraCallbackWithResult(bool, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        phoneStatePermissionRequestFragment.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private static final Unit onWarmupCompleted(Throwable th, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = asInterface + 119;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{56859, 8011, 23699, 40393, 56086, 6214, 22954, 38641, 54317}, View.MeasureSpec.getSize(0) + 49477, objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{56859, 8011, 23699, 40393, 56086, 6214, 22954, 38641, 54317}, 49477 - View.MeasureSpec.getSize(0), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), "N");
        setDetectableSize.onExtraCallback("error_message", th.getLocalizedMessage());
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, final Throwable th) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232471L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                return PhoneStatePermissionRequestFragment.onExtraCallbackWithResult(th, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        phoneStatePermissionRequestFragment.IAuthTabCallbackStub();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private final void asBinder() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1232469L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        RxPermissions rxPermissions = new RxPermissions(this);
        String[] strArrAsInterface = asInterface();
        getByteBuffer getbytebufferOnExtraCallback = rxPermissions.onNavigationEvent((String[]) Arrays.copyOf(strArrAsInterface, strArrAsInterface.length)).onExtraCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda4
            public final void run() {
                Object[] objArr = {this.f$0};
                PhoneStatePermissionRequestFragment.IAuthTabCallback(-1584377443, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1584377445, objArr);
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, (Boolean) obj};
                return (Unit) PhoneStatePermissionRequestFragment.IAuthTabCallback(-1526165905, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1526165913, objArr);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda6
            public final void accept(Object obj) {
                PhoneStatePermissionRequestFragment.onNavigationEvent(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return PhoneStatePermissionRequestFragment.onWarmupCompleted(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = getbytebufferOnExtraCallback.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda8
            public final void accept(Object obj) {
                PhoneStatePermissionRequestFragment.onWarmupCompleted(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        autoDisposable(deserializeurinullablecollectionOnExtraCallbackWithResult);
        int i2 = IAuthTabCallbackDefault + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 93;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = asInterface + 39;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Intent intent) {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            phoneStatePermissionRequestFragment.dismissProgressDialog();
            Intrinsics.checkNotNull(intent);
            GuestBaseFragment.onExtraCallback(phoneStatePermissionRequestFragment, intent, null, 3, null);
        } else {
            phoneStatePermissionRequestFragment.dismissProgressDialog();
            Intrinsics.checkNotNull(intent);
            GuestBaseFragment.onExtraCallback(phoneStatePermissionRequestFragment, intent, null, 2, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 3;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Context context, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 67;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        phoneStatePermissionRequestFragment.dismissProgressDialog();
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, context, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(final PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, final Context context, Pair pair) {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        jniHandleMemoryPressure jnihandlememorypressure = (jniHandleMemoryPressure) pair.onExtraCallbackWithResult();
        Bundle bundle = (Bundle) pair.IAuthTabCallback();
        if (onExtraCallback.onExtraCallbackWithResult[jnihandlememorypressure.ordinal()] == 1) {
            writeRaw<Intent> writerawOnExtraCallbackWithResult = phoneStatePermissionRequestFragment.onUnminimized().onExtraCallbackWithResult(context, jniHandleMemoryPressure.USIM, bundle.getLong("EXTRA_SIM_VERIFY_ID"));
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda11
                public final Object invoke(Object obj) {
                    return PhoneStatePermissionRequestFragment.onExtraCallback(this.f$0, (Intent) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda12
                public final void accept(Object obj) {
                    PhoneStatePermissionRequestFragment.IAuthTabCallback(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda13
                public final Object invoke(Object obj) {
                    Object[] objArr = {this.f$0, context, (Throwable) obj};
                    return (Unit) PhoneStatePermissionRequestFragment.IAuthTabCallback(2071836875, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2071836874, objArr);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnExtraCallbackWithResult.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda14
                public final void accept(Object obj) {
                    PhoneStatePermissionRequestFragment.asInterface(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            phoneStatePermissionRequestFragment.autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        } else {
            phoneStatePermissionRequestFragment.dismissProgressDialog();
            PhoneArsVerificationFragment.IAuthTabCallback iAuthTabCallback = PhoneArsVerificationFragment.Companion;
            String string = bundle.getString("EXTRA_TELCO_ARS_OTP", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            phoneStatePermissionRequestFragment.onExtraCallback(R.id.action_phoneStatePermissionRequestFragment_to_phoneArsVerificationFragment, iAuthTabCallback.onExtraCallbackWithResult(string, bundle.getLong("EXTRA_TELCO_ARS_VERIFY_ID")));
        }
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 25;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Context context, Throwable th) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        phoneStatePermissionRequestFragment.dismissProgressDialog();
        Intrinsics.checkNotNull(th);
        getParamImp.onWarmupCompleted(th, context, true, (initMiniApp) null, (Function0) null, (Function1) null, 28, (Object) null);
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PhoneStatePermissionRequestFragment", th.getMessage(), th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 65;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        final Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        BaseFragment.showProgressDialog$default(this, (String) null, false, 3, (Object) null);
        writeRaw<Pair<jniHandleMemoryPressure, Bundle>> writerawOnExtraCallback = onUnminimized().onExtraCallback(contextRequireContext);
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, contextRequireContext, (Pair) obj};
                return (Unit) PhoneStatePermissionRequestFragment.IAuthTabCallback(2071965527, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2071965518, objArr);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                PhoneStatePermissionRequestFragment.onExtraCallbackWithResult(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr = {this.f$0, contextRequireContext, (Throwable) obj};
                return (Unit) PhoneStatePermissionRequestFragment.IAuthTabCallback(-1954461945, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 1954461952, objArr);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawOnExtraCallback.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                Object[] objArr = {function12, obj};
                PhoneStatePermissionRequestFragment.IAuthTabCallback(847513522, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -847513518, objArr);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        autoDisposable(deserializeurinullablecollectionOnNavigationEvent);
        int i2 = IAuthTabCallbackDefault + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{56863, 41711, 10181, 43200, 11706}, 31982 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onTransact());
        Object[] objArr2 = new Object[1];
        a(new char[]{56847, 49043, 7458, 64223, 22637, 13843, 38837, 30036, 53994, 45185, 3623}, 24989 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), getString(R.string.phone_state_permission_request_descripton))});
        int i4 = asInterface + 57;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return mapIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[PHI: r1
      0x0059: PHI (r1v9 java.util.List) = (r1v5 java.util.List), (r1v6 java.util.List), (r1v6 java.util.List), (r1v12 java.util.List) binds: [B:8:0x0039, B:10:0x0044, B:12:0x0057, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r1
      0x003b: PHI (r1v6 java.util.List) = (r1v5 java.util.List), (r1v12 java.util.List) binds: [B:8:0x0039, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String[] asInterface() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.asInterface
            int r1 = r1 + 103
            int r2 = r1 % 128
            viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.IAuthTabCallbackDefault = r2
            int r1 = r1 % r0
            java.lang.String r2 = "android.permission.READ_PHONE_NUMBERS"
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            r4 = 1
            if (r1 != 0) goto L29
            r1 = 5
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r4] = r3
            r1[r4] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            o.zzad r2 = r5.onExtraCallback()
            boolean r2 = r2.onActivityLayout()
            if (r2 != 0) goto L59
            goto L3b
        L29:
            java.lang.String[] r1 = new java.lang.String[]{r3, r2}
            java.util.List r1 = kotlin.collections.CollectionsKt.mutableListOf(r1)
            o.zzad r2 = r5.onExtraCallback()
            boolean r2 = r2.onActivityLayout()
            if (r2 != 0) goto L59
        L3b:
            o.zzad r2 = r5.onExtraCallback()
            boolean r2 = r2.MediaBrowserCompatMediaItem()
            r2 = r2 ^ r4
            if (r2 == 0) goto L59
            int r2 = viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.asInterface
            int r2 = r2 + 119
            int r3 = r2 % 128
            viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.IAuthTabCallbackDefault = r3
            int r2 = r2 % r0
            o.zzad r2 = r5.onExtraCallback()
            boolean r2 = r2.RemoteActionCompatParcelizer()
            if (r2 == 0) goto L6d
        L59:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L6d
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r1.add(r2)
            int r2 = viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.IAuthTabCallbackDefault
            int r2 = r2 + 119
            int r3 = r2 % 128
            viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.asInterface = r3
            int r2 = r2 % r0
        L6d:
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.certify.verify.PhoneStatePermissionRequestFragment.asInterface():java.lang.String[]");
    }

    public static /* synthetic */ void onWarmupCompleted(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(-1584377443, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1584377445, new Object[]{phoneStatePermissionRequestFragment});
    }

    public static /* synthetic */ Unit onWarmupCompleted(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Context context, Pair pair) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(2071965527, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -2071965518, new Object[]{phoneStatePermissionRequestFragment, context, pair});
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(847513522, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -847513518, new Object[]{function1, obj});
    }

    public static /* synthetic */ Unit onNavigationEvent(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Boolean bool) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(-1526165905, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1526165913, new Object[]{phoneStatePermissionRequestFragment, bool});
    }

    public static /* synthetic */ Unit onWarmupCompleted(View view) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(-742441057, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 742441063, new Object[]{view});
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Context context, Throwable th) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(-1954461945, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 1954461952, new Object[]{phoneStatePermissionRequestFragment, context, th});
    }

    public static /* synthetic */ Unit onExtraCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Context context, Throwable th) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(2071836875, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -2071836874, new Object[]{phoneStatePermissionRequestFragment, context, th});
    }

    public static final /* synthetic */ void IAuthTabCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        IAuthTabCallback(-343913347, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 343913347, new Object[]{phoneStatePermissionRequestFragment});
    }

    private static final Unit onExtraCallback(PhoneStatePermissionRequestFragment phoneStatePermissionRequestFragment, Boolean bool) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(-272225971, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, 272225976, new Object[]{phoneStatePermissionRequestFragment, bool});
    }

    private static final Unit onNavigationEvent(Boolean bool, SetDetectableSize setDetectableSize) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) IAuthTabCallback(987266611, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, iOnNavigationEvent2, -987266608, new Object[]{bool, setDetectableSize});
    }

    static void onNavigationEvent() {
        IAuthTabCallbackStub = 6580856696553626460L;
    }
}
