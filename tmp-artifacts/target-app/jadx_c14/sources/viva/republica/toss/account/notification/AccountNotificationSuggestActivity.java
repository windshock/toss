package viva.republica.toss.account.notification;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.base.BaseActivity;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ASN1ObjectParser;
import o.AppLovinAdImpl;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.IPostMessageServiceStubProxy;
import o.PlayerErrorCode;
import o.SessionTrackera;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access13800;
import o.access14300;
import o.access8100;
import o.enableImagePrefetchingOnUiThreadAndroid;
import o.finalizeAPI;
import o.findResAndMsg;
import o.getDummyAd;
import o.getSignForPKCS7V2;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.r8lambda6V0YVgpvgCQzEji1GNetQSIYsE;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.notification.AccountNotificationSuggestActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationSuggestActivity extends Hilt_AccountNotificationSuggestActivity {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static byte[] ICustomTabsCallback;
    public static final int asBinder;
    private static int getInterfaceDescriptor;
    private static int onPostMessage;
    private static short[] writeTypedObject;

    @Inject
    public getDummyAd termsIntent;

    @Inject
    public SessionTrackerb tossRouter;
    private static final byte[] $$a = {13, 38, -109, 117};
    private static final int $$b = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static int readTypedObject = 1;
    private final Lazy onTransact = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda0
        public final Object invoke() {
            return Integer.valueOf(AccountNotificationSuggestActivity.onNavigationEvent(this.f$0));
        }
    });
    private final Lazy access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda1
        public final Object invoke() {
            return AccountNotificationSuggestActivity.onExtraCallback(this.f$0);
        }
    });
    private final Lazy IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda2
        public final Object invoke() {
            Object[] objArr = {this.f$0};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (String) AccountNotificationSuggestActivity.onNavigationEvent(objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2063816687, 2063816687, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
    });
    private final SessionTrackera access000 = AppLovinAdImpl.IAuthTabCallback(this, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda3
        public final Object invoke(Object obj) {
            Object[] objArr = {this.f$0, (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) obj};
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            return (Unit) AccountNotificationSuggestActivity.onNavigationEvent(objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1158826305, 1158826306, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
    });
    private final onWarmupCompleted IAuthTabCallbackStub = new onWarmupCompleted();

    private static String $$c(int i, byte b, short s) {
        int i2 = 115 - (s * 3);
        byte[] bArr = $$a;
        int i3 = i * 3;
        int i4 = 4 - (b * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i2 = i5 + i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i4];
            i4++;
            i2 += i7;
        }
    }

    static {
        onPostMessage = 1;
        setEngagementSignalsCallback();
        Companion = new onExtraCallbackWithResult(null);
        asBinder = 8;
        int i = extraCallback + 47;
        onPostMessage = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    public static /* synthetic */ String onExtraCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = readTypedObject + 59;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(accountNotificationSuggestActivity);
        int i4 = readTypedObject + 91;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strAsBinder;
    }

    public static /* synthetic */ void onExtraCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity, View view) {
        int i = 2 % 2;
        int i2 = readTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(accountNotificationSuggestActivity, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 3;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AccountNotificationSuggestActivity accountNotificationSuggestActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(accountNotificationSuggestActivity, setDetectableSize);
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        int i5 = extraCallbackWithResult + 123;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ int onNavigationEvent(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(accountNotificationSuggestActivity);
            throw null;
        }
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(accountNotificationSuggestActivity);
        int i3 = readTypedObject + 29;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return iIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onNavigationEvent(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = (~i5) | i8;
        int i10 = i7 | (~i9);
        int i11 = i5 | i8;
        int i12 = ~(i9 | i3);
        int i13 = i2 + i3 + i4 + (1075552530 * i6) + ((-1519595880) * i);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i2) - 1639710720) + ((-2116975300) * i3) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i6) + (1111490560 * i) + (1415839744 * i14);
        int i16 = (i2 * 251836610) + 257048825 + (i3 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i6 * 1710852742) + (i * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            return onExtraCallback(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 == 4) {
            return onNavigationEvent(objArr);
        }
        AccountNotificationSuggestActivity accountNotificationSuggestActivity = (AccountNotificationSuggestActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = readTypedObject + 9;
        extraCallbackWithResult = i19 % 128;
        int i20 = i19 % 2;
        String strOnTransact = onTransact(accountNotificationSuggestActivity);
        int i21 = readTypedObject + 81;
        extraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
        return strOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationSuggestActivity accountNotificationSuggestActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountNotificationSuggestActivity, setDetectableSize);
        int i4 = readTypedObject + 57;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        AccountNotificationSuggestActivity accountNotificationSuggestActivity = (AccountNotificationSuggestActivity) objArr[0];
        r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse = (r8lambda6V0YVgpvgCQzEji1GNetQSIYsE) objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 71;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(accountNotificationSuggestActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse);
        int i4 = readTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(AccountNotificationSuggestActivity accountNotificationSuggestActivity, View view) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(accountNotificationSuggestActivity, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 39;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 15;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return 1212871L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback implements Function0<finalizeAPI> {
        final /* synthetic */ Activity onNavigationEvent;

        public onExtraCallback(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final finalizeAPI invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return finalizeAPI.onExtraCallback(layoutInflater);
        }
    }

    public static final /* synthetic */ finalizeAPI onExtraCallbackWithResult(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        finalizeAPI finalizeapiICustomTabsServiceStub = accountNotificationSuggestActivity.ICustomTabsServiceStub();
        int i4 = readTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return finalizeapiICustomTabsServiceStub;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AccountNotificationSuggestActivity accountNotificationSuggestActivity = (AccountNotificationSuggestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        SessionTrackera sessionTrackera = accountNotificationSuggestActivity.access000;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = i3 + 93;
        readTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return sessionTrackera;
        }
        throw null;
    }

    public static final /* synthetic */ int onWarmupCompleted(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iUpdateVisuals = accountNotificationSuggestActivity.updateVisuals();
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return iUpdateVisuals;
    }

    public final SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 51;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 79;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 69;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return sessionTrackerb;
    }

    private final finalizeAPI ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        finalizeAPI finalizeapi = (finalizeAPI) this.onTransact.getValue();
        int i4 = extraCallbackWithResult + 49;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return finalizeapi;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final int IAuthTabCallbackDefault(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int intExtra = accountNotificationSuggestActivity.getIntent().getIntExtra("bankCode", 0);
        int i4 = readTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return intExtra;
    }

    private final int updateVisuals() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.asInterface.getValue();
        if (i3 != 0) {
            return ((Number) value).intValue();
        }
        ((Number) value).intValue();
        throw null;
    }

    private final String ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = (String) this.access100.getValue();
        int i3 = extraCallbackWithResult + 95;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String asBinder(AccountNotificationSuggestActivity accountNotificationSuggestActivity) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = accountNotificationSuggestActivity.getIntent();
        Object[] objArr = new Object[1];
        a((short) (Process.myTid() >> 22), (byte) (21 - (ViewConfiguration.getTouchSlop() >> 8)), (-1208633383) - (ViewConfiguration.getPressedStateDuration() >> 16), 1114737762 - Process.getGidForName(""), (-114) - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        String stringExtra = intent.getStringExtra(((String) objArr[0]).intern());
        int i4 = extraCallbackWithResult + 63;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return stringExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final String onTransact(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = getSignForPKCS7V2.onWarmupCompleted.asBinder(String.valueOf(accountNotificationSuggestActivity.updateVisuals()));
        int i4 = extraCallbackWithResult + 87;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return strAsBinder;
    }

    private final String validateRelationship() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.IAuthTabCallbackDefault.getValue();
        int i4 = extraCallbackWithResult + 121;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        AccountNotificationSuggestActivity accountNotificationSuggestActivity = (AccountNotificationSuggestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 11;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        getDummyAd getdummyad = accountNotificationSuggestActivity.termsIntent;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        if (getdummyad == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 25;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 119;
        readTypedObject = i7 % 128;
        int i8 = i7 % 2;
        return getdummyad;
    }

    public Map<String, Object> getScreenParams() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 85;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("bank_name", validateRelationship())});
        int i4 = readTypedObject + 39;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return mapOnExtraCallbackWithResult;
        }
        throw null;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = readTypedObject + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setContentView(ICustomTabsServiceStub().getRoot());
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1462879166, -1462879163, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        int i4 = extraCallbackWithResult + 119;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 71;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        LottieAnimationView lottieAnimationView = ICustomTabsServiceStub().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        if (lottieAnimationView.getVisibility() == 0) {
            return;
        }
        ICustomTabsServiceStub().onExtraCallbackWithResult.playAnimation();
        int i4 = readTypedObject + 43;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = 3926577757113026156L;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 24, 19627 - Color.alpha(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 59 - (KeyEvent.getMaxKeyCode() >> 16), 6383 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i4 = $11 + 113;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), ExpandableListView.getPackedPositionChild(0L) + 60, 6383 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i6 = $10 + 53;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
        }

        private onExtraCallbackWithResult() {
        }

        public static /* synthetic */ Intent IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Context context, int i, String str, int i2, Object obj) throws Throwable {
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 71;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 2) != 0) {
                int i6 = i5 + 25;
                onExtraCallbackWithResult = i6 % 128;
                str = null;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }
            Intent intentOnExtraCallback = onextracallbackwithresult.onExtraCallback(context, i, str);
            int i7 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return intentOnExtraCallback;
        }

        public final Intent onExtraCallback(@NotNull Context context, int i, @Nullable String str) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) AccountNotificationSuggestActivity.class);
            intent.putExtra("bankCode", i);
            if (str != null) {
                int i3 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{33577, 657, 32865, 1599, 34197, 2901, 35106, 2278, 36470, 3086, 37857}, View.getDefaultSize(0, 0) + 33199, objArr);
                intent.putExtra(((String) objArr[0]).intern(), str);
            }
            int i5 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return intent;
            }
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 115;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "N");
        setDetectableSize.onExtraCallback(accountNotificationSuggestActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 115;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void IAuthTabCallback(final viva.republica.toss.account.notification.AccountNotificationSuggestActivity r10, android.view.View r11) {
        /*
            r11 = 2
            int r0 = r11 % r11
            r1 = 1212873(0x1281c9, double:5.99239E-318)
            r3 = 0
            r4 = 0
            r5 = 0
            viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda7 r6 = new viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda7
            r6.<init>()
            r7 = 14
            r8 = 0
            o.ConvertByteArrayToFloatArray.onExtraCallback(r1, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = r10.ICustomTabsServiceDefault()
            if (r0 == 0) goto L47
            int r1 = viva.republica.toss.account.notification.AccountNotificationSuggestActivity.extraCallbackWithResult
            int r1 = r1 + 43
            int r2 = r1 % 128
            viva.republica.toss.account.notification.AccountNotificationSuggestActivity.readTypedObject = r2
            int r1 = r1 % r11
            int r0 = r0.length()
            if (r0 != 0) goto L2a
            goto L47
        L2a:
            o.SessionTrackerb r1 = r10.IAuthTabCallback()
            java.lang.String r3 = r10.ICustomTabsServiceDefault()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r2 = r10
            o.SessionTrackerb.IAuthTabCallback(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = viva.republica.toss.account.notification.AccountNotificationSuggestActivity.readTypedObject
            int r0 = r0 + 55
            int r1 = r0 % 128
        L43:
            viva.republica.toss.account.notification.AccountNotificationSuggestActivity.extraCallbackWithResult = r1
            int r0 = r0 % r11
            goto L4e
        L47:
            int r0 = viva.republica.toss.account.notification.AccountNotificationSuggestActivity.readTypedObject
            int r0 = r0 + 35
            int r1 = r0 % 128
            goto L43
        L4e:
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationSuggestActivity.IAuthTabCallback(viva.republica.toss.account.notification.AccountNotificationSuggestActivity, android.view.View):void");
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return AccountNotificationSuggestActivity.this.new onNavigationEvent(access13800Var);
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
                BaseActivity baseActivity = AccountNotificationSuggestActivity.this;
                int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                getDummyAd getdummyad = (getDummyAd) AccountNotificationSuggestActivity.onNavigationEvent(new Object[]{baseActivity}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1917955944, -1917955942, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                Object[] objArr = {AccountNotificationSuggestActivity.this};
                int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                SessionTrackera sessionTrackera = (SessionTrackera) AccountNotificationSuggestActivity.onNavigationEvent(objArr, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1851563625, 1851563629, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
                int iOnWarmupCompleted = AccountNotificationSuggestActivity.onWarmupCompleted(AccountNotificationSuggestActivity.this);
                this.label = 1;
                if (aSN1ObjectParser.onWarmupCompleted(baseActivity, getdummyad, sessionTrackera, iOnWarmupCompleted, this) == objOnWarmupCompleted) {
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

    private static final Unit onExtraCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 57;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("button_type", "Y");
            setDetectableSize.onExtraCallback(accountNotificationSuggestActivity.getScreenParams());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("button_type", "Y");
        setDetectableSize.onExtraCallback(accountNotificationSuggestActivity.getScreenParams());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void onNavigationEvent(final AccountNotificationSuggestActivity accountNotificationSuggestActivity, View view) {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1212873L, false, (String) null, (Map) null, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                return AccountNotificationSuggestActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            }
        }, 14, (Object) null);
        Object obj = null;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(accountNotificationSuggestActivity), (CoroutineContext) null, (setRandomHost) null, accountNotificationSuggestActivity.new onNavigationEvent(null), 3, (Object) null);
        int i2 = extraCallbackWithResult + 117;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final UIKitBaseActivity uIKitBaseActivity = (AccountNotificationSuggestActivity) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        uIKitBaseActivity.setToolbar(uIKitBaseActivity.ICustomTabsServiceStub().asInterface);
        IPostMessageServiceStubProxy supportActionBar = uIKitBaseActivity.getSupportActionBar();
        if (supportActionBar != null) {
            int i4 = readTypedObject + 117;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            supportActionBar.onNavigationEvent(true);
        }
        uIKitBaseActivity.ICustomTabsServiceStub().IAuthTabCallbackStub.setUpperText(uIKitBaseActivity.getString(R.string.app_account_notification___e55bc189a0, PlayerErrorCode.onPostMessage()));
        uIKitBaseActivity.ICustomTabsServiceStub().IAuthTabCallbackStub.setLowerText(uIKitBaseActivity.getString(R.string.app_account_notification___921d4d6ef9, uIKitBaseActivity.validateRelationship()));
        uIKitBaseActivity.ICustomTabsServiceStub().asBinder.setUpperText(uIKitBaseActivity.getString(R.string.app_account_notification___21a39c1acf, uIKitBaseActivity.validateRelationship()));
        uIKitBaseActivity.ICustomTabsServiceStub().asBinder.setLowerText(uIKitBaseActivity.getString(R.string.app_account_notification___69169a04bf));
        uIKitBaseActivity.ICustomTabsServiceStub().onExtraCallbackWithResult.addAnimatorListener(((AccountNotificationSuggestActivity) uIKitBaseActivity).IAuthTabCallbackStub);
        TdsBottomCtaV1View tdsBottomCtaV1View = uIKitBaseActivity.ICustomTabsServiceStub().onNavigationEvent;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        String string = uIKitBaseActivity.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TdsBottomCtaV1View.setSecondary$default(tdsBottomCtaV1View, string, new View.OnClickListener() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountNotificationSuggestActivity.onWarmupCompleted(this.f$0, view);
            }
        }, new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 12, (DefaultConstructorMarker) null), false, 8, (Object) null);
        String string2 = uIKitBaseActivity.getString(R.string.app_account_notification___09107156f7);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string2, new View.OnClickListener() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountNotificationSuggestActivity.onExtraCallback(this.f$0, view);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        TdsBottomCtaV1View.onExtraCallback(tdsBottomCtaV1View, false, (Function0) null, 3, (Object) null);
        return null;
    }

    private static final Unit onExtraCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(r8lambda6v0yvgpvgcqzeji1gnetqsiyse, "");
        if (!(!r8lambda6v0yvgpvgcqzeji1gnetqsiyse.onExtraCallbackWithResult().isSucceed())) {
            int i4 = readTypedObject + 97;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ASN1ObjectParser aSN1ObjectParser = ASN1ObjectParser.IAuthTabCallback;
            int iUpdateVisuals = accountNotificationSuggestActivity.updateVisuals();
            Object[] objArr = new Object[1];
            a((short) (Process.myTid() >> 22), (byte) (41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-1208633374) - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.getMode(0) + 1114737764, (ViewConfiguration.getLongPressTimeout() >> 16) - 93, objArr);
            aSN1ObjectParser.onNavigationEvent(accountNotificationSuggestActivity, iUpdateVisuals, (4 & 4) != 0 ? null : null, (4 & 8) != 0 ? null : ((String) objArr[0]).intern(), (4 & 16) != 0 ? null : "account_register");
            accountNotificationSuggestActivity.finish();
            int i6 = readTypedObject + 41;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        onWarmupCompleted() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            final finalizeAPI finalizeapiOnExtraCallbackWithResult = AccountNotificationSuggestActivity.onExtraCallbackWithResult(AccountNotificationSuggestActivity.this);
            TdsTopV1View tdsTopV1View = finalizeapiOnExtraCallbackWithResult.IAuthTabCallbackStub;
            Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
            enableImagePrefetchingOnUiThreadAndroid.onNavigationEvent(tdsTopV1View, 500L, 0L, (Interpolator) null, false, false, (Function1) null, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$animationListener$1$$ExternalSyntheticLambda0
                public final Object invoke(Object obj) {
                    return AccountNotificationSuggestActivity.onWarmupCompleted.onExtraCallbackWithResult(finalizeapiOnExtraCallbackWithResult, (View) obj);
                }
            }, 46, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(final finalizeAPI finalizeapi, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            TdsTopV1View tdsTopV1View = finalizeapi.asBinder;
            Intrinsics.checkNotNullExpressionValue(tdsTopV1View, "");
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(tdsTopV1View, 500L, 0L, (Interpolator) null, false, false, new Function1() { // from class: viva.republica.toss.account.notification.AccountNotificationSuggestActivity$animationListener$1$$ExternalSyntheticLambda1
                public final Object invoke(Object obj) {
                    return AccountNotificationSuggestActivity.onWarmupCompleted.onExtraCallback(finalizeapi, (View) obj);
                }
            }, (Function1) null, 78, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallback(finalizeAPI finalizeapi, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            LottieAnimationView lottieAnimationView = finalizeapi.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(4);
            LottieAnimationView lottieAnimationView2 = finalizeapi.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView2, "");
            lottieAnimationView2.setVisibility(0);
            finalizeapi.onExtraCallback.playAnimation();
            LinearLayout linearLayout = finalizeapi.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            enableImagePrefetchingOnUiThreadAndroid.IAuthTabCallback(linearLayout, 500L, 0L, (Interpolator) null, false, false, (Function1) null, (Function1) null, 110, (Object) null);
            finalizeapi.onNavigationEvent.onExtraCallbackWithResult(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r23, byte r24, int r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.account.notification.AccountNotificationSuggestActivity.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onNavigationEvent(AccountNotificationSuggestActivity accountNotificationSuggestActivity, r8lambda6V0YVgpvgCQzEji1GNetQSIYsE r8lambda6v0yvgpvgcqzeji1gnetqsiyse) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(new Object[]{accountNotificationSuggestActivity, r8lambda6v0yvgpvgcqzeji1gnetqsiyse}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1158826305, 1158826306, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static /* synthetic */ String IAuthTabCallback(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onNavigationEvent(new Object[]{accountNotificationSuggestActivity}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2063816687, 2063816687, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ SessionTrackera asInterface(AccountNotificationSuggestActivity accountNotificationSuggestActivity) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (SessionTrackera) onNavigationEvent(new Object[]{accountNotificationSuggestActivity}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1851563625, 1851563629, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    private final void writeTypedList() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onNavigationEvent(new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1462879166, -1462879163, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public final getDummyAd onNavigationEvent() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (getDummyAd) onNavigationEvent(new Object[]{this}, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1917955944, -1917955942, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = extraCallbackWithResult + 69;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = extraCallbackWithResult + 111;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.account.notification.Hilt_AccountNotificationSuggestActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void setEngagementSignalsCallback() {
        IAuthTabCallbackStubProxy = -330461137;
        getInterfaceDescriptor = -1538795403;
        IAuthTabCallback_Parcel = 432647175;
        ICustomTabsCallback = new byte[]{-25, 0, -4, 12, -29, -18, 20, 24, -30, -18, -33, 38, -43, 51, -34, -38, 35, -35, -43, 37, 33, 31, -101, 38, -39, 38, 44, 32, 34, 18, 32, -43, -25, 32, 36, -37, 34, 45, -43, -37, 34, 8, 8};
    }
}
