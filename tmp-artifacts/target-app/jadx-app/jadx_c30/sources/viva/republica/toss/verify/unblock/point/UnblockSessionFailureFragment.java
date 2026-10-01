package viva.republica.toss.verify.unblock.point;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.collect.Synchronized;
import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.base.BaseFragment;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.textbutton.TdsTextButtonV0View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.PageContext;
import o.RippleNode;
import o.TrackGroupExternalSyntheticLambda0;
import o.TurboModuleManager;
import o.TypographyKtExternalSyntheticLambda0;
import o.access8100;
import o.addAllCommandLine;
import o.convertClassToJniType;
import o.convertReturnClassToJniType;
import o.getPathLength;
import o.getUrlokhttp;
import o.getWrite;
import o.preFillDefault;
import o.r8lambdaFnmXJTCM06NhGodUBf7CAKxLL0;
import o.setBodyokhttp;
import o.zzck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UnblockSessionFailureFragment extends BaseFragment {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    public static final int onWarmupCompleted;
    private final PageContext IAuthTabCallback;
    private final Lazy asBinder;
    private boolean asInterface;
    private boolean onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private boolean onTransact;

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new addAllCommandLine[]{new PropertyReference1Impl<>(UnblockSessionFailureFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentUnblockSessionFailureBinding;", 0)};
        onWarmupCompleted = 8;
        int i = IAuthTabCallback_Parcel + 91;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(UnblockSessionFailureFragment unblockSessionFailureFragment, UnblockSessionActivity unblockSessionActivity, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback, TurboModuleManager turboModuleManager) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(unblockSessionFailureFragment, unblockSessionActivity, iAuthTabCallback, turboModuleManager);
        int i4 = access100 + 5;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UnblockSessionFailureFragment unblockSessionFailureFragment = (UnblockSessionFailureFragment) objArr[0];
        UnblockSessionActivity.IAuthTabCallback iAuthTabCallback = (UnblockSessionActivity.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(unblockSessionFailureFragment, iAuthTabCallback);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(unblockSessionFailureFragment, iAuthTabCallback);
        int i3 = access100 + 117;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(UnblockSessionFailureFragment unblockSessionFailureFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(unblockSessionFailureFragment, list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(unblockSessionFailureFragment, list);
        int i3 = IAuthTabCallbackDefault + 27;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 28 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i4);
        int i11 = ~i4;
        int i12 = i11 | i2;
        int i13 = ~(i6 | i12);
        int i14 = i9 | i10 | i13;
        int i15 = i13 | (~(i7 | i11 | i8));
        int i16 = (~i12) | i10;
        int i17 = i2 + i4 + i3 + ((-573665793) * i5) + ((-1595597844) * i);
        int i18 = i17 * i17;
        int i19 = ((-1787860089) * i2) + 959184896 + (1033409659 * i4) + ((-1473697548) * i14) + (1473697548 * i15) + ((-1410634874) * i16) + ((-377225216) * i3) + (1316749312 * i5) + (833617920 * i) + (497221632 * i18);
        int i20 = ((i2 * 2143800573) - 1595758) + (i4 * 2143800249) + (i14 * (-324)) + (i15 * 324) + (i16 * 162) + (i3 * 2143800411) + (i5 * 1405922725) + (i * (-1943733020)) + (i18 * 1827733504);
        int i21 = i19 + (i20 * i20 * (-911933440));
        if (i21 != 1) {
            return i21 != 2 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
        }
        UnblockSessionFailureFragment unblockSessionFailureFragment = (UnblockSessionFailureFragment) objArr[0];
        String str = (String) objArr[1];
        UnblockSessionActivity unblockSessionActivity = (UnblockSessionActivity) objArr[2];
        View view = (View) objArr[3];
        int i22 = 2 % 2;
        int i23 = IAuthTabCallbackDefault + 107;
        access100 = i23 % 128;
        int i24 = i23 % 2;
        onExtraCallbackWithResult(unblockSessionFailureFragment, str, unblockSessionActivity, view);
        int i25 = access100 + 83;
        IAuthTabCallbackDefault = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(UnblockSessionFailureFragment unblockSessionFailureFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(unblockSessionFailureFragment, str, unblockSessionActivity, view);
        int i4 = access100 + 31;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100 + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 15;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return 1259411L;
    }

    public UnblockSessionFailureFragment() throws Throwable {
        super(R.layout.fragment_unblock_session_failure);
        Object[] objArr = new Object[1];
        a(new int[]{0, 60, 0, 0}, false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1}, objArr);
        this.onNavigationEvent = ((String) objArr[0]).intern();
        this.IAuthTabCallback = preFillDefault.onExtraCallbackWithResult(this, onExtraCallback.onWarmupCompleted);
        this.asBinder = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(convertReturnClassToJniType.class), new onExtraCallbackWithResult(this), new onWarmupCompleted(null, this), new IAuthTabCallback(this));
    }

    static final /* synthetic */ class onExtraCallback extends FunctionReferenceImpl implements Function1<View, getPathLength> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
            super(1, getPathLength.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentUnblockSessionFailureBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final getPathLength invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return getPathLength.onWarmupCompleted(view);
        }
    }

    private final getPathLength onExtraCallback() {
        PageContext pageContext;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 57;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            pageContext = this.IAuthTabCallback;
            addallcommandline = onExtraCallback[1];
        } else {
            pageContext = this.IAuthTabCallback;
            addallcommandline = onExtraCallback[0];
        }
        getPathLength getpathlength = (getPathLength) pageContext.onExtraCallbackWithResult(this, addallcommandline);
        int i3 = access100 + 89;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return getpathlength;
        }
        throw null;
    }

    private final convertReturnClassToJniType onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        convertReturnClassToJniType convertreturnclasstojnitype = (convertReturnClassToJniType) this.asBinder.getValue();
        int i4 = IAuthTabCallbackDefault + 49;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return convertreturnclasstojnitype;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new int[]{60, 8, 70, 0}, true, new byte[]{0, 1, 1, 0, 1, 1, 1, 1}, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), onNavigationEvent().extraCallbackWithResult());
        String strExtraCallback = onNavigationEvent().extraCallback();
        if (StringsKt.isBlank(strExtraCallback)) {
            int i4 = IAuthTabCallbackDefault + 65;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            strExtraCallback = onNavigationEvent().onPostMessage();
        }
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("service_referrer", strExtraCallback)});
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            super.onViewCreated(view, bundle);
            onWarmupCompleted();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        onWarmupCompleted();
        int i3 = access100 + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallbackWithResult(UnblockSessionFailureFragment unblockSessionFailureFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        convertClassToJniType.IAuthTabCallback.onNavigationEvent(unblockSessionFailureFragment.getScreenParams(), str);
        Object obj = null;
        if (unblockSessionFailureFragment.onTransact) {
            unblockSessionFailureFragment.onNavigationEvent(unblockSessionActivity);
            int i2 = access100 + 33;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (unblockSessionFailureFragment.onExtraCallbackWithResult) {
            int i3 = access100 + 3;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                unblockSessionFailureFragment.requireActivity().finish();
                return;
            } else {
                unblockSessionFailureFragment.requireActivity().finish();
                throw null;
            }
        }
        if (unblockSessionFailureFragment.asInterface) {
            unblockSessionFailureFragment.IAuthTabCallbackStub();
            return;
        }
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -556315175, iOnNavigationEvent2, 556315177, iOnNavigationEvent3, new Object[]{unblockSessionFailureFragment}, iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(UnblockSessionFailureFragment unblockSessionFailureFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        convertClassToJniType.IAuthTabCallback.onExtraCallback(unblockSessionFailureFragment.getScreenParams(), str);
        unblockSessionFailureFragment.onExtraCallback(unblockSessionActivity);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    private final void onWarmupCompleted() throws Throwable {
        String string;
        int i = 2 % 2;
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        convertClassToJniType convertclasstojnitype = convertClassToJniType.IAuthTabCallback;
        Map<String, Object> screenParams = getScreenParams();
        Object[] objArr = {onNavigationEvent()};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        String str = (String) convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 466018476, objArr, iIAuthTabCallback, -466018465, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        Object[] objArr2 = {onNavigationEvent()};
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        convertclasstojnitype.onNavigationEvent(screenParams, str, (String) convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -774739773, objArr2, iIAuthTabCallback2, 774739783, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback()), onNavigationEvent().onExtraCallbackWithResult());
        Object[] objArr3 = {onNavigationEvent()};
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        String str2 = (String) convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), 466018476, objArr3, iIAuthTabCallback3, -466018465, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        Object[] objArr4 = {onNavigationEvent()};
        int iIAuthTabCallback4 = AdResponseKtKt.IAuthTabCallback();
        String str3 = (String) convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -774739773, objArr4, iIAuthTabCallback4, 774739783, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        if (!Intrinsics.areEqual(onNavigationEvent().onExtraCallbackWithResult(), "TV3001")) {
            if (Intrinsics.areEqual(onNavigationEvent().onExtraCallbackWithResult(), "TV9100")) {
                int i2 = IAuthTabCallbackDefault + 111;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                this.asInterface = true;
                string = getString(im.toss.uikit.R.string.uikit_confirm);
            } else {
                this.onTransact = true;
                string = getString(R.string.unblock_selfie_failure_retry_text);
            }
        } else {
            int i4 = access100 + 77;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.onExtraCallbackWithResult = false;
            } else {
                this.onExtraCallbackWithResult = true;
            }
            string = getString(im.toss.uikit.R.string.uikit_confirm);
        }
        final String str4 = string;
        Intrinsics.checkNotNull(str4);
        final String string2 = getString(R.string.unblock_failure_select_alternatives_text);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        getPathLength getpathlengthOnExtraCallback = onExtraCallback();
        TdsTopV1View tdsTopV1View = getpathlengthOnExtraCallback.onWarmupCompleted;
        tdsTopV1View.setUpperText(str2);
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP3);
        tdsTopV1View.setUpperTextColor(ColorStateList.valueOf(geturlokhttpOnExtraCallback.onRelationshipValidationResult()));
        tdsTopV1View.setLowerText(str3);
        tdsTopV1View.setLowerType(TdsTopV1View.onNavigationEvent.TOP5);
        tdsTopV1View.setLowerTextColor(ColorStateList.valueOf(geturlokhttpOnExtraCallback.onRelationshipValidationResult()));
        LottieAnimationView lottieAnimationView = getpathlengthOnExtraCallback.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, BuildConfig.FLAVOR);
        zzck.onExtraCallback(lottieAnimationView, this.onNavigationEvent, (ManagedRetainedValuesStoreKtExternalSyntheticLambda0) null, 2, (Object) null);
        UnblockSessionActivity unblockSessionActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(unblockSessionActivityRequireActivity, BuildConfig.FLAVOR);
        final UnblockSessionActivity unblockSessionActivity = unblockSessionActivityRequireActivity;
        TdsBottomCtaV1View tdsBottomCtaV1View = getpathlengthOnExtraCallback.onExtraCallback;
        Intrinsics.checkNotNull(tdsBottomCtaV1View);
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, str4, new View.OnClickListener() { // from class: viva.republica.toss.verify.unblock.point.UnblockSessionFailureFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {this.f$0, str4, unblockSessionActivity, view};
                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                UnblockSessionFailureFragment.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -183014934, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 183014935, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr5, iOnNavigationEvent);
            }
        }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        if (this.onExtraCallbackWithResult) {
            return;
        }
        tdsBottomCtaV1View.setBottomButton(string2, new Function1() { // from class: viva.republica.toss.verify.unblock.point.UnblockSessionFailureFragment$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return UnblockSessionFailureFragment.onNavigationEvent(this.f$0, string2, unblockSessionActivity, (View) obj);
            }
        });
        TdsTextButtonV0View tdsTextButtonV0ViewOnExtraCallbackWithResult = tdsBottomCtaV1View.onExtraCallbackWithResult();
        if (tdsTextButtonV0ViewOnExtraCallbackWithResult != null) {
            int i5 = access100 + 103;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                tdsTextButtonV0ViewOnExtraCallbackWithResult.setArrow(false);
            } else {
                tdsTextButtonV0ViewOnExtraCallbackWithResult.setArrow(true);
            }
            tdsTextButtonV0ViewOnExtraCallbackWithResult.setType(TdsTextButtonV0View.IAuthTabCallback.GREY);
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        RippleNode.onNavigationEvent(this).onNavigationEvent(R.id.action_sessionFailureFragment_to_sessionIntroFragment);
        int i4 = IAuthTabCallbackDefault + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UnblockSessionFailureFragment unblockSessionFailureFragment = (UnblockSessionFailureFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0OnNavigationEvent = RippleNode.onNavigationEvent(unblockSessionFailureFragment);
        if (i3 == 0) {
            typographyKtExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(R.id.action_sessionFailureFragment_to_idCardIntroFragment);
            return null;
        }
        typographyKtExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent(R.id.action_sessionFailureFragment_to_idCardIntroFragment);
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(UnblockSessionActivity unblockSessionActivity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            RippleNode.onNavigationEvent(this).getInterfaceDescriptor();
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            UnblockSessionActivity.onNavigationEvent(-1896162750, 1896162761, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback3, iIAuthTabCallback2, iIAuthTabCallback, new Object[]{unblockSessionActivity});
            int i3 = access100 + 109;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        RippleNode.onNavigationEvent(this).getInterfaceDescriptor();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback5 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback6 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        UnblockSessionActivity.onNavigationEvent(-1896162750, 1896162761, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback6, iIAuthTabCallback5, iIAuthTabCallback4, new Object[]{unblockSessionActivity});
        throw null;
    }

    private final void onExtraCallback(final UnblockSessionActivity unblockSessionActivity) {
        int i = 2 % 2;
        Object[] objArr = {onNavigationEvent()};
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        convertReturnClassToJniType.onNavigationEvent(AdResponseKtKt.IAuthTabCallback(), -513620356, objArr, iIAuthTabCallback, 513620368, AdResponseKtKt.IAuthTabCallback(), AdResponseKtKt.IAuthTabCallback());
        ArrayList arrayListIAuthTabCallback = onNavigationEvent().IAuthTabCallback();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, BuildConfig.FLAVOR);
        r8lambdaFnmXJTCM06NhGodUBf7CAKxLL0.onExtraCallbackWithResult(contextRequireContext, arrayListIAuthTabCallback, new Function1() { // from class: viva.republica.toss.verify.unblock.point.UnblockSessionFailureFragment$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return UnblockSessionFailureFragment.onExtraCallbackWithResult(this.f$0, (List) obj);
            }
        }, new Function2() { // from class: viva.republica.toss.verify.unblock.point.UnblockSessionFailureFragment$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return UnblockSessionFailureFragment.IAuthTabCallback(this.f$0, unblockSessionActivity, (UnblockSessionActivity.IAuthTabCallback) obj, (TurboModuleManager) obj2);
            }
        }, true, new Function1() { // from class: viva.republica.toss.verify.unblock.point.UnblockSessionFailureFragment$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (UnblockSessionActivity.IAuthTabCallback) obj};
                int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
                return (Unit) UnblockSessionFailureFragment.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 822694818, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -822694818, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), objArr2, iOnNavigationEvent);
            }
        });
        int i2 = IAuthTabCallbackDefault + 37;
        access100 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onWarmupCompleted(UnblockSessionFailureFragment unblockSessionFailureFragment, List list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
            convertClassToJniType.IAuthTabCallback.onExtraCallback(unblockSessionFailureFragment.getScreenParams(), list);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, BuildConfig.FLAVOR);
        convertClassToJniType.IAuthTabCallback.onExtraCallback(unblockSessionFailureFragment.getScreenParams(), list);
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 11;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit onExtraCallbackWithResult(UnblockSessionFailureFragment unblockSessionFailureFragment, UnblockSessionActivity unblockSessionActivity, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback, TurboModuleManager turboModuleManager) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 119;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(turboModuleManager, BuildConfig.FLAVOR);
            boolean z = turboModuleManager instanceof TurboModuleManager.onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(turboModuleManager, BuildConfig.FLAVOR);
        if (turboModuleManager instanceof TurboModuleManager.onNavigationEvent) {
            convertClassToJniType.IAuthTabCallback.onWarmupCompleted(unblockSessionFailureFragment.getScreenParams(), iAuthTabCallback);
        } else if (!(!(turboModuleManager instanceof TurboModuleManager.IAuthTabCallback))) {
            Object[] objArr = {convertClassToJniType.IAuthTabCallback, unblockSessionFailureFragment.getScreenParams(), iAuthTabCallback, ((TurboModuleManager.IAuthTabCallback) turboModuleManager).IAuthTabCallback()};
            convertClassToJniType.onNavigationEvent(-200377254, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), objArr, 200377255, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback());
        } else if (!Intrinsics.areEqual(turboModuleManager, TurboModuleManager.onWarmupCompleted.onExtraCallback)) {
            throw new NoWhenBranchMatchedException();
        }
        if (iAuthTabCallback != null) {
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            UnblockSessionActivity.onNavigationEvent(547705507, -547705503, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), iIAuthTabCallback2, iIAuthTabCallback, new Object[]{unblockSessionActivity, iAuthTabCallback});
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 23;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(UnblockSessionFailureFragment unblockSessionFailureFragment, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iAuthTabCallback, BuildConfig.FLAVOR);
            convertClassToJniType.IAuthTabCallback.onExtraCallbackWithResult(unblockSessionFailureFragment.getScreenParams(), iAuthTabCallback);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(iAuthTabCallback, BuildConfig.FLAVOR);
        convertClassToJniType.IAuthTabCallback.onExtraCallbackWithResult(unblockSessionFailureFragment.getScreenParams(), iAuthTabCallback);
        int i3 = 97 / 0;
        return Unit.INSTANCE;
    }

    public static final class onExtraCallbackWithResult extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, BuildConfig.FLAVOR);
            return viewModelStore;
        }
    }

    public static final class onWarmupCompleted extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, BuildConfig.FLAVOR);
            return defaultViewModelCreationExtras;
        }
    }

    public static final class IAuthTabCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, BuildConfig.FLAVOR);
            return defaultViewModelProviderFactory;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = IAuthTabCallbackStub;
        char c = '0';
        if (cArr != null) {
            int i6 = $11 + 103;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 35283), 'S' - AndroidCharacter.getMirror(c), 14239 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i8++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i9 = $11 + 21;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i11 = $11 + 99;
                $10 = i11 % 128;
                if (i11 % 2 == 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(0L) + 10936), 65 - (Process.myPid() >> 22), View.MeasureSpec.makeMeasureSpec(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 28 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 49467), Color.argb(0, 0, 0, 0) + 70, 12485 - ImageFormat.getBitsPerPixel(0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ void onExtraCallback(UnblockSessionFailureFragment unblockSessionFailureFragment, String str, UnblockSessionActivity unblockSessionActivity, View view) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -183014934, iOnNavigationEvent2, 183014935, iOnNavigationEvent3, new Object[]{unblockSessionFailureFragment, str, unblockSessionActivity, view}, iOnNavigationEvent);
    }

    public static /* synthetic */ Unit onNavigationEvent(UnblockSessionFailureFragment unblockSessionFailureFragment, UnblockSessionActivity.IAuthTabCallback iAuthTabCallback) {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        return (Unit) onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 822694818, iOnNavigationEvent2, -822694818, iOnNavigationEvent3, new Object[]{unblockSessionFailureFragment, iAuthTabCallback}, iOnNavigationEvent);
    }

    private final void IAuthTabCallback() {
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        int iOnNavigationEvent3 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -556315175, iOnNavigationEvent2, 556315177, iOnNavigationEvent3, new Object[]{this}, iOnNavigationEvent);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = new char[]{27258, 27168, 27194, 27196, 27199, 27160, 27258, 27233, 27167, 27197, 27172, 27172, 27168, 27176, 27142, 27167, 27199, 27199, 27197, 27166, 27141, 27173, 27136, 27139, 27171, 27199, 27194, 27168, 27177, 27170, 27167, 27167, 27197, 27175, 27177, 27198, 27170, 27179, 27173, 27166, 27140, 27170, 27173, 27179, 27143, 27166, 27170, 27175, 27175, 27142, 27143, 27173, 27196, 27198, 27198, 27166, 27138, 27168, 27199, 27168, 27154, 27391, 27391, 27382, 27391, 27365, 27365, 27391};
    }
}
