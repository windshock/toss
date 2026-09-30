package im.toss.features.mobileid.impl.view;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import im.toss.base.BaseFragment;
import im.toss.features.mobile.id.model.MobileIdTagLocation;
import im.toss.features.mobileid.impl.MobileIdIssueViewModel;
import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.anim.text.AnimateText;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography8;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.AuthenticatorCompanion;
import o.AuthenticatorCompanionAuthenticatorNone;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.BrickModuleImplExternalSyntheticLambda0;
import o.Cache;
import o.ConvertByteArrayToFloatArray;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.ExtHubMetaInfoHelper;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.Rmipmap;
import o.SetDetectableSize;
import o.SetDetectingInterval;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access8100;
import o.alertWithArgs;
import o.authenticate;
import o.dumpMetaInfoConfigJava;
import o.findResAndMsg;
import o.formatMsgs;
import o.getAdService;
import o.getBigDecimal;
import o.getDistributionPoints;
import o.getExtraParameters;
import o.getSpecialFeatureOptInStatus;
import o.getTypedExportedConstants;
import o.getUrlokhttp;
import o.getUserData;
import o.getWrite;
import o.hasCrashWhenJavaCrash;
import o.initMiniApp;
import o.initSDK;
import o.isStopUpload;
import o.logAndOpenStore;
import o.logVerbose;
import o.maybeUpdateAnimatable;
import o.onRenderReady;
import o.pointStartFunction;
import o.readExtHubMetaInfo;
import o.readIntokhttp;
import o.readTimeout;
import o.resolveProxyClass;
import o.response;
import o.setBodyokhttp;
import o.setCookieJarokhttp;
import o.setDone;
import o.setMinWebSocketMessageToCompressokhttp;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.setRandomHost;
import o.setRubIn;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MobileIdIssueVcNfcFragment extends Hilt_MobileIdIssueVcNfcFragment implements SetDetectingInterval {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 1;
    private static long asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallback;
    private BottomSheetDialog IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private Function0<Unit> IAuthTabCallbackStub;
    private pointStartFunction onNavigationEvent;

    @Inject
    public getBigDecimal walletErrorHandler;
    private final Lazy asBinder = isStopUpload.onExtraCallback(this, 1582535, (Function1) null, (Function1) null, 6, (Object) null);
    private final Lazy onTransact = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(Class.forName("im.toss.features.mobileid.impl.MobileIdIssueViewModel")), new writeTypedObject(this), new ICustomTabsCallback(null, this), new extraCallback(this));
    private onExtraCallback onWarmupCompleted = onExtraCallback.NOTHING;
    private final Lazy onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda5(this));

    static {
        IAuthTabCallbackStubProxy();
        Companion = new IAuthTabCallback((DefaultConstructorMarker) null);
        onExtraCallback = 8;
        int i = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor();
        int i3 = access100 + 83;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mobileIdIssueVcNfcFragment, view);
        int i4 = access100 + 31;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, getTypedExportedConstants gettypedexportedconstants) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(mobileIdIssueVcNfcFragment, gettypedexportedconstants);
        int i4 = access000 + 79;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 29;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        NfcAdapter nfcAdapterAsBinder = asBinder(mobileIdIssueVcNfcFragment);
        int i4 = access000 + 83;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return nfcAdapterAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = access100 + 13;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function0, dialogInterface);
        int i4 = access100 + 83;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Ref.BooleanRef booleanRef, getTypedExportedConstants gettypedexportedconstants, LottieAnimationView lottieAnimationView, BaseTextView baseTextView, LinearLayout linearLayout, BaseTextView baseTextView2, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        int i = 2 % 2;
        int i2 = access100 + 31;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(booleanRef, gettypedexportedconstants, lottieAnimationView, baseTextView, linearLayout, baseTextView2, mobileIdIssueVcNfcFragment);
        }
        onWarmupCompleted(booleanRef, gettypedexportedconstants, lottieAnimationView, baseTextView, linearLayout, baseTextView2, mobileIdIssueVcNfcFragment);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getTypedExportedConstants gettypedexportedconstants, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 59;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(gettypedexportedconstants, mobileIdIssueVcNfcFragment, setDetectableSize);
        }
        onWarmupCompleted(gettypedexportedconstants, mobileIdIssueVcNfcFragment, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, View view) {
        int i = 2 % 2;
        int i2 = access000 + 69;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(mobileIdIssueVcNfcFragment, view);
        int i4 = access000 + 23;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access100 + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(mobileIdIssueVcNfcFragment, function0, dialogInterface);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(mobileIdIssueVcNfcFragment, gettypedexportedconstants, view);
        int i4 = access000 + 111;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getTypedExportedConstants gettypedexportedconstants, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(gettypedexportedconstants, mobileIdIssueVcNfcFragment, setDetectableSize);
        int i4 = access100 + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100();
        int i4 = access000 + 67;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = access100 + 39;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(brickModuleImplExternalSyntheticLambda0, view);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(brickModuleImplExternalSyntheticLambda0, view);
        int i3 = access000 + 15;
        access100 = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Ref.BooleanRef booleanRef, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(booleanRef, mobileIdIssueVcNfcFragment, dialogInterface);
        int i4 = access000 + 95;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011b A[PHI: r2 r6 r7 r8 r9 r12 r13
      0x011b: PHI (r2v8 java.lang.Integer) = (r2v7 int), (r2v18 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r6v14 java.lang.Integer) = (r6v13 int), (r6v20 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r7v4 java.lang.Integer) = (r7v3 int), (r7v8 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r8v4 java.lang.Integer) = (r8v3 int), (r8v7 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r9v5 java.lang.Integer) = (r9v4 int), (r9v9 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r12v1 java.lang.Integer) = (r12v0 int), (r12v3 int) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]
      0x011b: PHI (r13v1 android.content.Context) = (r13v0 android.content.Context), (r13v4 android.content.Context) binds: [B:17:0x0119, B:14:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Context context;
        int i13 = ~i;
        int i14 = ~(i13 | i5);
        int i15 = (~(i13 | i2)) | i14;
        int i16 = ~i5;
        int i17 = ~(i16 | i);
        int i18 = i14 | i17 | (~(i16 | i2));
        int i19 = (~((~i2) | i16)) | i14 | i17;
        int i20 = i + i5 + i3 + ((-369695973) * i4) + (1794320298 * i6);
        int i21 = i20 * i20;
        int i22 = ((i * 1872133577) - 2052485254) + (i5 * 1872135674) + (i15 * 2097) + (i18 * (-1398)) + (i19 * 699) + (1872134975 * i3) + ((-1328892763) * i4) + ((-1296121642) * i6) + (i21 * (-1691287552));
        switch (((-1820121865) * i) + 1478230016 + (776760710 * i5) + ((-1698084721) * i15) + ((-1731255050) * i18) + (865627525 * i19) + ((-88866816) * i3) + (217841664 * i4) + ((-410517504) * i6) + ((-175177728) * i21) + (i22 * i22 * (-1729036288))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
                int i23 = 2 % 2;
                int i24 = access100 + 93;
                access000 = i24 % 128;
                if (i24 % 2 != 0) {
                    i7 = 27538;
                    i8 = 11;
                    i9 = 83;
                    i10 = 1;
                    i11 = 29;
                    i12 = -1;
                    context = mobileIdIssueVcNfcFragment.getContext();
                    if (context != null) {
                        Context context2 = context;
                        getInterfaceDescriptor getinterfacedescriptor = getInterfaceDescriptor.onWarmupCompleted;
                        logAndOpenStore.IAuthTabCallback(context2, (Long) null);
                        getTypedExportedConstants gettypedexportedconstants = new getTypedExportedConstants(context2, 0, false, false, -1L, getinterfacedescriptor, 14, (DefaultConstructorMarker) null);
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        gettypedexportedconstants.setOnDismissListener(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda0(booleanRef, mobileIdIssueVcNfcFragment));
                        gettypedexportedconstants.IAuthTabCallback(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda1(mobileIdIssueVcNfcFragment, gettypedexportedconstants));
                        Context context3 = gettypedexportedconstants.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        LinearLayout linearLayout = new LinearLayout(context3);
                        linearLayout.setOrientation(1);
                        BaseTextView baseTextView = (BaseTextView) Typography3.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                        Intrinsics.checkNotNull(baseTextView);
                        Class cls = Integer.TYPE;
                        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(i12, i11);
                        Intrinsics.checkNotNull(layoutParams);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.width = -1;
                        layoutParams2.height = -2;
                        layoutParams2.gravity = 17;
                        baseTextView.setLayoutParams(layoutParams);
                        baseTextView.setTextAlignment(4);
                        baseTextView.onNavigationEvent(response.Bold);
                        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView, setTagsokhttp.onExtraCallbackWithResult(baseTextView, i9), setTagsokhttp.onExtraCallbackWithResult(baseTextView, i8), setTagsokhttp.onExtraCallbackWithResult(baseTextView, i9), setTagsokhttp.onExtraCallbackWithResult(baseTextView, i10));
                        baseTextView.setText(baseTextView.getContext().getString(R.string.mobileid_impl_issue_vc_nfc_loading));
                        Intrinsics.checkNotNull(baseTextView);
                        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
                        BaseTextView baseTextView2 = (BaseTextView) SubTypography8.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
                        Intrinsics.checkNotNull(baseTextView2);
                        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(i12, i11);
                        Intrinsics.checkNotNull(layoutParams3);
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.width = -1;
                        layoutParams4.height = -2;
                        layoutParams4.gravity = 17;
                        baseTextView2.setLayoutParams(layoutParams3);
                        baseTextView2.setTextAlignment(4);
                        baseTextView2.onNavigationEvent(response.Medium);
                        setMinWebSocketMessageToCompressokhttp.onExtraCallback(baseTextView2, setTagsokhttp.onExtraCallbackWithResult(baseTextView2, i9), setTagsokhttp.onExtraCallbackWithResult(baseTextView2, i8), setTagsokhttp.onExtraCallbackWithResult(baseTextView2, i9), setTagsokhttp.onExtraCallbackWithResult(baseTextView2, i10));
                        baseTextView2.setText(baseTextView2.getContext().getString(R.string.mobileid_impl_issue_vc_nfc_loading_stop_moving));
                        Context context4 = baseTextView2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        Configuration configuration = context4.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration, "");
                        baseTextView2.setTextColor(new getUrlokhttp(new access000(configuration)).asBinder());
                        Intrinsics.checkNotNull(baseTextView2);
                        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView2);
                        LottieAnimationView lottieAnimationView = new LottieAnimationView(linearLayout.getContext());
                        ViewGroup.LayoutParams layoutParams5 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(i12, i11);
                        Intrinsics.checkNotNull(layoutParams5);
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                        layoutParams6.width = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView, i7);
                        layoutParams6.height = setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView, i7);
                        layoutParams6.gravity = 17;
                        lottieAnimationView.setLayoutParams(layoutParams5);
                        lottieAnimationView.setRepeatCount(Integer.MAX_VALUE);
                        Object[] objArr2 = new Object[1];
                        a(new char[]{2246, 2222, 9170, 16455, 37643, 45871, 8553, 41304, 51713, 20617, 25702, 26555, 36317, 5555, 42724, 9268, 16563, 56184, 59679, 59768, 633, 39132, 11294, 45014, 50475, 23950, 28342, 27848, 39057, 25411, 45473, 4473, 23119, 8248, 62508, 55231, 7433, 58866, 14032, 38119, 53500, 43772, 31109, 22811, 37807, 26627, 48204, 7758, 21789, 11670, 65314, 56476, 10457, 62139, 49571, 33074, 60305, 45164, 1111}, 1 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                        lottieAnimationView.setAnimationFromUrl(((String) objArr2[0]).intern());
                        lottieAnimationView.playAnimation();
                        setMinWebSocketMessageToCompressokhttp.onExtraCallback(lottieAnimationView, 0, setTagsokhttp.onExtraCallbackWithResult(lottieAnimationView, 20), 0, 0);
                        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
                        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, lottieAnimationView);
                        mobileIdIssueVcNfcFragment.IAuthTabCallbackStub = new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda2(booleanRef, gettypedexportedconstants, lottieAnimationView, baseTextView, linearLayout, baseTextView2, mobileIdIssueVcNfcFragment);
                        Context context5 = linearLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "");
                        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context5);
                        String string = mobileIdIssueVcNfcFragment.getString(viva.republica.toss.R.string.close);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string, new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda3(mobileIdIssueVcNfcFragment, gettypedexportedconstants), (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
                        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
                        gettypedexportedconstants.setContentView(linearLayout);
                        mobileIdIssueVcNfcFragment.IAuthTabCallback = gettypedexportedconstants;
                        gettypedexportedconstants.show();
                    }
                } else {
                    i7 = 130;
                    i8 = 30;
                    i9 = 24;
                    i10 = 0;
                    i11 = -2;
                    i12 = -1;
                    context = mobileIdIssueVcNfcFragment.getContext();
                    if (context != null) {
                    }
                }
                int i25 = access100 + 109;
                access000 = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000 + 99;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public static final class getInterfaceDescriptor implements Function1<initMiniApp.onWarmupCompleted, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final getInterfaceDescriptor onWarmupCompleted = new getInterfaceDescriptor();

        static {
            int i = onExtraCallback + 49;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        public final void onExtraCallback(initMiniApp.onWarmupCompleted onwarmupcompleted) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            if (i3 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback((initMiniApp.onWarmupCompleted) obj);
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 35;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(asInterface ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 19;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $11 + 51;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(asInterface)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.MeasureSpec.getMode(0)), ExpandableListView.getPackedPositionType(0L) + 84, 21233 - TextUtils.getOffsetBefore("", 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14185 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 20, MotionEvent.axisFromString("") + 8809, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            int i6 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus2;
        }
    }

    public static final class access000 implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public access000(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            r0 = 72 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000.IAuthTabCallback + 45;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000.onExtraCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000.IAuthTabCallback + 93;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000.onExtraCallback = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 32 / 0;
            }
        }
    }

    public static final class access100 implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public access100(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onExtraCallback + 69;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                if (i4 == 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.onExtraCallback)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onExtraCallbackWithResult.onWarmupCompleted + 13;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onExtraCallbackWithResult.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
        }
    }

    public static final class readTypedObject implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public readTypedObject(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 83;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final /* synthetic */ Function0 IAuthTabCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        Function0<Unit> function0 = mobileIdIssueVcNfcFragment.IAuthTabCallbackStub;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 37;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return function0;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackDefault(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueVcNfcFragment.onMessageChannelReady();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 99;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onWarmupCompleted(-516258260, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 516258267, alertWithArgs.onExtraCallbackWithResult());
            return null;
        }
        onWarmupCompleted(-516258260, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 516258267, alertWithArgs.onExtraCallbackWithResult());
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 77;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        mobileIdIssueVcNfcFragment.readTypedObject();
        int i4 = access100 + 27;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ MobileIdIssueViewModel asInterface(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult());
        int i4 = access100 + 91;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return mobileIdIssueViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = access000 + 13;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        mobileIdIssueVcNfcFragment.IAuthTabCallbackDefault = zBooleanValue;
        int i5 = i3 + 59;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 93;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        NfcAdapter nfcAdapterIAuthTabCallback_Parcel = mobileIdIssueVcNfcFragment.IAuthTabCallback_Parcel();
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return nfcAdapterIAuthTabCallback_Parcel;
    }

    public static final /* synthetic */ void onTransact(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 11;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(994361994, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -994361991, alertWithArgs.onExtraCallbackWithResult());
        int i4 = access000 + 117;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ String onWarmupCompleted(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access100 + 23;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return mobileIdIssueVcNfcFragment.extraCallback();
        }
        mobileIdIssueVcNfcFragment.extraCallback();
        throw null;
    }

    public /* bridge */ initMiniApp.onWarmupCompleted ICustomTabsServiceDefault() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        access000 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
            throw null;
        }
        initMiniApp.onWarmupCompleted onwarmupcompletedICustomTabsServiceDefault = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceDefault();
        int i3 = access100 + 23;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return onwarmupcompletedICustomTabsServiceDefault;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strICustomTabsServiceStubProxy = super/*o.openJavaCrashMonitor*/.ICustomTabsServiceStubProxy();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return strICustomTabsServiceStubProxy;
    }

    public /* bridge */ void IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.IEngagementSignalsCallback();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ long access200() {
        long jAccess200;
        int i = 2 % 2;
        int i2 = access000 + 3;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
            int i3 = 10 / 0;
        } else {
            jAccess200 = super/*o.openJavaCrashMonitor*/.access200();
        }
        int i4 = access100 + 37;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return jAccess200;
        }
        throw null;
    }

    public /* bridge */ View aq_() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        View viewAq_ = super/*o.removeAttachLongUserData*/.aq_();
        int i4 = access100 + 53;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return viewAq_;
    }

    public /* bridge */ Map<String, Object> ar_() {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapAr_ = super/*o.openJavaCrashMonitor*/.ar_();
        int i4 = access100 + 21;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return mapAr_;
    }

    public /* bridge */ findResAndMsg as_() {
        int i = 2 % 2;
        int i2 = access100 + 121;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgAs_ = super/*o.openJavaCrashMonitor*/.as_();
        int i4 = access100 + 105;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgAs_;
    }

    public /* bridge */ void onExtraCallback(@NotNull getUserData getuserdata) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(getuserdata);
        int i4 = access000 + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onExtraCallback(@NotNull logVerbose logverbose) {
        int i = 2 % 2;
        int i2 = access100 + 41;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super/*o.openJavaCrashMonitor*/.onExtraCallback(logverbose);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = access100 + 121;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public /* bridge */ void onGreatestScrollPercentageIncreased() {
        int i = 2 % 2;
        int i2 = access000 + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.onGreatestScrollPercentageIncreased();
        int i4 = access000 + 27;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    public /* synthetic */ initSDK.onNavigationEvent setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsServiceDefault();
        }
        ICustomTabsServiceDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ initMiniApp updateVisuals() {
        hasCrashWhenJavaCrash hascrashwhenjavacrashAsBinder;
        int i = 2 % 2;
        int i2 = access000 + 103;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            hascrashwhenjavacrashAsBinder = asBinder();
            int i3 = 44 / 0;
        } else {
            hascrashwhenjavacrashAsBinder = asBinder();
        }
        int i4 = access000 + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return hascrashwhenjavacrashAsBinder;
    }

    public /* bridge */ setRubIn<Boolean> validateRelationship() {
        int i = 2 % 2;
        int i2 = access100 + 83;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        setRubIn<Boolean> setrubinValidateRelationship = super/*o.openJavaCrashMonitor*/.validateRelationship();
        int i4 = access000 + 61;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return setrubinValidateRelationship;
    }

    public /* bridge */ void writeTypedList() {
        int i = 2 % 2;
        int i2 = access100 + 75;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super/*o.openJavaCrashMonitor*/.writeTypedList();
        int i4 = access100 + 65;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final getBigDecimal onTransact() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 43;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        getBigDecimal getbigdecimal = this.walletErrorHandler;
        if (getbigdecimal == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i2 + 113;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return getbigdecimal;
    }

    public hasCrashWhenJavaCrash asBinder() {
        int i = 2 % 2;
        int i2 = access100 + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        hasCrashWhenJavaCrash hascrashwhenjavacrash = (hasCrashWhenJavaCrash) this.asBinder.getValue();
        if (i3 == 0) {
            return hascrashwhenjavacrash;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Map<String, Object> getScreenParams() throws Throwable {
        String strOnExtraCallback;
        int i = 2 % 2;
        int i2 = access000 + 65;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ExtHubMetaInfoHelper extHubMetaInfoHelperAsInterface = ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asInterface();
        if (extHubMetaInfoHelperAsInterface != null) {
            int i4 = access000 + 115;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                strOnExtraCallback = extHubMetaInfoHelperAsInterface.onExtraCallback();
                int i5 = 56 / 0;
            } else {
                strOnExtraCallback = extHubMetaInfoHelperAsInterface.onExtraCallback();
            }
        } else {
            int i6 = access100 + 125;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            }
            strOnExtraCallback = null;
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("tx_id", strOnExtraCallback);
        Object[] objArr = new Object[1];
        a(new char[]{10063, 10045, 43749, 14294, 6701, 48187, 22250, 44633, 58761, 55798, 5053, 26866}, TextUtils.getCapsMode("", 0, 0) + 1, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = {(MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())};
        return access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(strIntern, (String) MobileIdIssueViewModel.onNavigationEvent(-147195383, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 147195405, R.drawable.IAuthTabCallback(), objArr2, R.drawable.IAuthTabCallback())), getWrite.IAuthTabCallback("service_referrer", "mobile_id_issue_vc")});
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        MobileIdIssueViewModel mobileIdIssueViewModel = (MobileIdIssueViewModel) mobileIdIssueVcNfcFragment.onTransact.getValue();
        int i4 = access000 + 47;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return mobileIdIssueViewModel;
    }

    private final NfcAdapter IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        NfcAdapter nfcAdapter = (NfcAdapter) this.onExtraCallbackWithResult.getValue();
        int i3 = access000 + 7;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return nfcAdapter;
    }

    private static final NfcAdapter asBinder(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        int i = 2 % 2;
        int i2 = access100 + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Context contextRequireContext = mobileIdIssueVcNfcFragment.requireContext();
        if (i3 != 0) {
            NfcAdapter.getDefaultAdapter(contextRequireContext);
            obj.hashCode();
            throw null;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(contextRequireContext);
        int i4 = access100 + 59;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return defaultAdapter;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onTransact implements Function1<Throwable, Unit> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 1;
        private static int asInterface = 0;
        private static char onExtraCallback = 54895;
        private static char onExtraCallbackWithResult = 3252;
        private static char onNavigationEvent = 39228;
        private static char onWarmupCompleted = 18566;

        public onTransact() {
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
            char[] cArr3 = new char[2];
            while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                int i4 = $11 + 67;
                $10 = i4 % 128;
                int i5 = 58224;
                if (i4 % 2 != 0) {
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % 1];
                } else {
                    cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                    cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                }
                int i6 = i3;
                while (i6 < 16) {
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i7 = (c2 + i5) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                    int i8 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(onNavigationEvent);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback == null) {
                            char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i3) + 10;
                            int capsMode = 12434 - TextUtils.getCapsMode("", i3, i3);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, absoluteGravity, capsMode, -787580090, false, "C", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 10, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        cArr3 = cArr4;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = cArr3;
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
                cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 16014), 14 - View.MeasureSpec.makeMeasureSpec(0, 0), 19901 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1250968944, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            String str = new String(cArr2, 0, i);
            int i9 = $11 + 65;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 67;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = asInterface + 121;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
        
            r6 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            switch(im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onNavigationEvent.onExtraCallback[((com.samsung.android.ssiframework.sdk.exception.SsiException) r2).getErrorType().ordinal()]) {
                case 1: goto L26;
                case 2: goto L22;
                case 3: goto L20;
                case 4: goto L20;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L14;
                default: goto L12;
            };
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            o.maybeUpdateAnimatable.onNavigationEvent(o.onRenderReady.onExtraCallback(r21.IAuthTabCallback), (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asBinder(r21.IAuthTabCallback, r2, (o.access13800) null), 3, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.IAuthTabCallbackDefault(r21.IAuthTabCallback);
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asInterface + 25;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asBinder = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        
            if ((r2 % 2) != 0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        
            r1 = 44 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r21.IAuthTabCallback).IEngagementSignalsCallbackStubProxy().onWarmupCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
        
            r1 = r21.IAuthTabCallback.getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_not_available_description);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r21.IAuthTabCallback).IAuthTabCallback(im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onWarmupCompleted(r21.IAuthTabCallback), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            r1 = r21.IAuthTabCallback.getActivity();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
        
            if (r1 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        
            r2 = r21.IAuthTabCallback.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
            r4 = r21.IAuthTabCallback;
            r1 = r4.getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_fail_toast, new java.lang.Object[]{o.resolveProxyClass.onNavigationEvent(im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r4).asBinder(), r1)});
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
            r3 = new im.toss.uikit.widget.snackbar.TdsToastV1.onNavigationEvent(r2, r1);
            r4 = new java.lang.Object[1];
            a(new char[]{62109, 9865, 15594, 12398, 42927, 26398, 5645, 21660, 48493, 55636, 29764, 32388, 34789, 40380, 39118, 40250, 37732, 6034, ')', 34209, 33610, 59494, 4284, 24801, 52830, 35259, 37992, 226, 15734, 19839, 38503, 39314, 27875, 27498, 4129, 44650, 15459, 26360, 46714, 17318, 9031, 58494, 55192, 38808, 29622, 16595, 57099, 25490, 243, 37262, 35800, 2035, 44763, 27919, 24393, 42735, 5814, 19398, 50617, 52592}, 60 - android.graphics.Color.blue(0), r4);
            r3.IAuthTabCallback(((java.lang.String) r4[0]).intern()).onNavigationEvent();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00fa, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00fb, code lost:
        
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.IAuthTabCallbackStub(r21.IAuthTabCallback);
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asBinder + 43;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asInterface = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
        
            if ((r2 % 2) != 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x010b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x010c, code lost:
        
            r6.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x010f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x011a, code lost:
        
            if (java.lang.Class.forName("o.clearMixInAnnotations").isInstance(r13) == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x011c, code lost:
        
            r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asBinder + 121;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asInterface = r2 % 128;
            r2 = r2 % 2;
            r2 = (o.clearMixInAnnotations) r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x012c, code lost:
        
            if (r2.onExtraCallback() > 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x012e, code lost:
        
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.IAuthTabCallbackStub(r21.IAuthTabCallback);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0133, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x013a, code lost:
        
            if (r2.onExtraCallback() >= 10) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
        
            r9 = new java.lang.Object[]{im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r21.IAuthTabCallback), r2};
            r8 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback();
            im.toss.features.mobileid.impl.MobileIdIssueViewModel.onNavigationEvent(-113685643, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback(), 113685648, r8, r9, im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback());
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r21.IAuthTabCallback).ICustomTabsService().setValue(r13);
            r2 = (android.nfc.NfcAdapter) im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onWarmupCompleted(760769792, new java.lang.Object[]{r21.IAuthTabCallback}, o.alertWithArgs.onExtraCallbackWithResult(), o.alertWithArgs.onExtraCallbackWithResult(), o.alertWithArgs.onExtraCallbackWithResult(), -760769792, o.alertWithArgs.onExtraCallbackWithResult());
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x018e, code lost:
        
            if (r2 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0190, code lost:
        
            r3 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asInterface + 63;
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onTransact.asBinder = r3 % 128;
            r3 = r3 % 2;
            r2.disableForegroundDispatch(r21.IAuthTabCallback.requireActivity());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01a2, code lost:
        
            r21.IAuthTabCallback.getParentFragmentManager().extraCommand();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01ab, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01ac, code lost:
        
            r1 = r21.IAuthTabCallback.getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_not_available_description);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
            im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.asInterface(r21.IAuthTabCallback).IAuthTabCallback(im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.onWarmupCompleted(r21.IAuthTabCallback), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01c6, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01c7, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
            o.getParamImp.onWarmupCompleted(r13, r21.IAuthTabCallback.getContext(), false, (o.initMiniApp) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function1) null, 30, (java.lang.Object) null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01de, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        
            if ((r2 instanceof com.samsung.android.ssiframework.sdk.exception.SsiException) != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        
            r13 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
        
            if ((r2 instanceof com.samsung.android.ssiframework.sdk.exception.SsiException) != false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(Throwable th) throws Throwable {
            Throwable th2;
            int i = 2 % 2;
            int i2 = asBinder + 57;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                th2 = th;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "MobileIdIssueVcNfcFragment", "error invoked", th2, (Map) null, 106, (Object) null);
            } else {
                th2 = th;
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "MobileIdIssueVcNfcFragment", "error invoked", th2, (Map) null, 8, (Object) null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        pointStartFunction pointstartfunctionIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access100 + 71;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            pointstartfunctionIAuthTabCallback = pointStartFunction.IAuthTabCallback(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(pointstartfunctionIAuthTabCallback, "");
            this.onNavigationEvent = pointstartfunctionIAuthTabCallback;
            if (pointstartfunctionIAuthTabCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                pointstartfunctionIAuthTabCallback = null;
            }
        } else {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            pointstartfunctionIAuthTabCallback = pointStartFunction.IAuthTabCallback(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(pointstartfunctionIAuthTabCallback, "");
            this.onNavigationEvent = pointstartfunctionIAuthTabCallback;
            if (pointstartfunctionIAuthTabCallback == null) {
            }
        }
        ConstraintLayout constraintLayoutOnWarmupCompleted = pointstartfunctionIAuthTabCallback.onWarmupCompleted();
        int i3 = access000 + 47;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return constraintLayoutOnWarmupCompleted;
    }

    public static final class ICustomTabsCallback extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ICustomTabsCallback(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onWarmupCompleted();
                throw null;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted = onWarmupCompleted();
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2OnWarmupCompleted;
        }

        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 9;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null) {
                int i5 = i2 + 103;
                IAuthTabCallback = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke();
                if (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 != null) {
                    int i6 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
                    }
                    throw null;
                }
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    public static final class extraCallback extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public extraCallback(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ViewModelProvider.onWarmupCompleted onwarmupcompletedOnExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallback + 21;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedOnExtraCallback;
        }

        public final ViewModelProvider.onWarmupCompleted onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
            Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory(), "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class writeTypedObject extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public writeTypedObject(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onWarmupCompleted();
            }
            onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(this.$this_activityViewModels.requireActivity().getViewModelStore(), "");
                throw null;
            }
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    private final void readTypedObject() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = access000 + 83;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            String string = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_no_remaining_try_description);
            Intrinsics.checkNotNullExpressionValue(string, "");
            ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IAuthTabCallback(writeTypedObject(), string);
            return;
        }
        String string2 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_no_remaining_try_description);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IAuthTabCallback(writeTypedObject(), string2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onMinimized() {
        int i = 2 % 2;
        int i2 = access000 + 59;
        access100 = i2 % 128;
        pointStartFunction pointstartfunction = null;
        if (i2 % 2 == 0) {
            pointstartfunction.hashCode();
            throw null;
        }
        pointStartFunction pointstartfunction2 = this.onNavigationEvent;
        if (pointstartfunction2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction2 = null;
        }
        AnimateText animateText = pointstartfunction2.IAuthTabCallback;
        animateText.setSubTypography(5);
        response responseVar = response.Bold;
        animateText.setFont(responseVar);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new readTypedObject(configuration)).onRelationshipValidationResult());
        pointStartFunction pointstartfunction3 = this.onNavigationEvent;
        if (pointstartfunction3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction3 = null;
        }
        pointstartfunction3.IAuthTabCallback.extraCallbackWithResult();
        pointStartFunction pointstartfunction4 = this.onNavigationEvent;
        if (pointstartfunction4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction4 = null;
        }
        AnimateText animateText2 = pointstartfunction4.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(animateText2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_nfc_turn_on_title_1));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Object[] objArr = {new setCookieJarokhttp(response.toTypeface$default(responseVar, contextRequireContext, (setDone) null, 2, (Object) null)), new ForegroundColorSpan(setBodyokhttp.onExtraCallback(this).asBinder())};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_nfc_turn_on_title_2));
        int i3 = 0;
        while (i3 < 2) {
            spannableStringBuilder.setSpan(objArr[i3], length, spannableStringBuilder.length(), 17);
            i3++;
            int i4 = access100 + 79;
            access000 = i4 % 128;
            int i5 = i4 % 2;
        }
        spannableStringBuilder.append((CharSequence) getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_nfc_turn_on_title_3));
        AnimateText.onExtraCallback(animateText2, new SpannedString(spannableStringBuilder), readTimeout.IAuthTabCallbackStubProxy.onNavigationEvent.IAuthTabCallback, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        pointStartFunction pointstartfunction5 = this.onNavigationEvent;
        if (pointstartfunction5 == null) {
            int i6 = access000 + 83;
            access100 = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction5 = null;
        }
        AnimateText animateText3 = pointstartfunction5.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(animateText3, "");
        animateText3.setVisibility(8);
        pointStartFunction pointstartfunction6 = this.onNavigationEvent;
        if (pointstartfunction6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction6 = null;
        }
        TdsButtonV1View tdsButtonV1View = pointstartfunction6.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        tdsButtonV1View.setTheme(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.FILL, TdsButtonV1View.onWarmupCompleted.XLARGE, TdsButtonV1View.IAuthTabCallback.BLOCK);
        pointStartFunction pointstartfunction7 = this.onNavigationEvent;
        if (pointstartfunction7 == null) {
            int i8 = access000 + 11;
            access100 = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = 67 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            pointstartfunction7 = null;
        }
        TdsButtonV1View tdsButtonV1View2 = pointstartfunction7.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View2, "");
        RallysKt.onExtraCallback(tdsButtonV1View2, AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.SLOW, false, (Function1) null, 24, (Object) null), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 1000, 0L, false, 894, (Object) null);
        pointStartFunction pointstartfunction8 = this.onNavigationEvent;
        if (pointstartfunction8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction8 = null;
        }
        pointstartfunction8.onExtraCallback.setTextColor(setBodyokhttp.onExtraCallback(this).requestPostMessageChannel().IPostMessageServiceDefault());
        pointStartFunction pointstartfunction9 = this.onNavigationEvent;
        if (pointstartfunction9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction9 = null;
        }
        pointstartfunction9.onExtraCallback.setText(getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_button));
        pointStartFunction pointstartfunction10 = this.onNavigationEvent;
        if (pointstartfunction10 == null) {
            int i10 = access100 + 93;
            access000 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pointstartfunction = pointstartfunction10;
        }
        pointstartfunction.onExtraCallback.setOnClickListener(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda6(this));
    }

    private static final void onNavigationEvent(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, View view) {
        int i = 2 % 2;
        mobileIdIssueVcNfcFragment.startActivity(new Intent("android.settings.NFC_SETTINGS"));
        int i2 = access000 + 97;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
    }

    static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ BaseTextView $description;
        final /* synthetic */ LottieAnimationView $lottie;
        final /* synthetic */ LinearLayout $this_verticalLayout;
        final /* synthetic */ BaseTextView $title;
        int label;
        final /* synthetic */ MobileIdIssueVcNfcFragment this$0;
        private static char[] onWarmupCompleted = {64905, 64986, 64990, 64904, 64907, 64991, 64977, 64924, 64989, 64988, 64984, 64966, 64961, 64982, 64967, 64963, 64960, 64978, 64925, 64906, 64976, 64926, 64985, 64987, 64969};
        private static char onExtraCallback = 51244;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback_Parcel(LottieAnimationView lottieAnimationView, BaseTextView baseTextView, LinearLayout linearLayout, BaseTextView baseTextView2, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$lottie = lottieAnimationView;
            this.$title = baseTextView;
            this.$this_verticalLayout = linearLayout;
            this.$description = baseTextView2;
            this.this$0 = mobileIdIssueVcNfcFragment;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$lottie, this.$title, this.$this_verticalLayout, this.$description, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 91;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = onWarmupCompleted;
            Object obj2 = null;
            if (cArr2 != null) {
                int i4 = $11 + 31;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getCapsMode("", 0, 0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), View.resolveSize(0, 0) + 26, AndroidCharacter.getMirror('0') + 23091, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i7 = $11 + 37;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $11 + 103;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            obj = obj2;
                        } else {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "", 0) + 24824), (ViewConfiguration.getTapTimeout() >> 16) + 74, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8087, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                if (objOnExtraCallback4 == null) {
                                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 30, TextUtils.getOffsetBefore("", 0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                            } else {
                                obj = null;
                                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                    int i10 = $11 + 107;
                                    $10 = i10 % 128;
                                    int i11 = i10 % 2;
                                    defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                    int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                } else {
                                    int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                                }
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i16 = 0; i16 < i; i16++) {
                int i17 = $10 + 25;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            NfcAdapter nfcAdapter;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                LottieAnimationView lottieAnimationView = this.$lottie;
                Object[] objArr = new Object[1];
                a(new char[]{24, '\r', '\n', 19, 15, 1, 13831, 13831, 19, 11, 19, '\f', 0, 21, 19, '\r', 6, 19, 17, 19, 2, 3, '\b', 6, 14, 19, 11, 4, 11, 18, 5, 22, 3, 18, 0, 15, 1, 11, 6, '\n', 11, 23, 17, 16, 14, 19, 22, 11, 11, 18, 4, 21, 18, 23, 21, 17, 5, '\t'}, (byte) (82 - Color.red(0)), 58 - ExpandableListView.getPackedPositionGroup(0L), objArr);
                lottieAnimationView.setAnimationFromUrl(((String) objArr[0]).intern());
                this.$lottie.setRepeatCount(1);
                this.$lottie.playAnimation();
                this.$title.setText(this.$this_verticalLayout.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_loading_done));
                this.$description.setVisibility(0);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1500L, this) == objOnWarmupCompleted) {
                    int i5 = IAuthTabCallback + 13;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnWarmupCompleted;
                }
            }
            Activity activity = this.this$0.getActivity();
            if (activity != null && (nfcAdapter = (NfcAdapter) MobileIdIssueVcNfcFragment.onWarmupCompleted(760769792, new Object[]{this.this$0}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -760769792, alertWithArgs.onExtraCallbackWithResult())) != null) {
                int i7 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    nfcAdapter.disableForegroundDispatch(activity);
                    throw null;
                }
                nfcAdapter.disableForegroundDispatch(activity);
            }
            MobileIdIssueVcNfcFragment.asInterface(this.this$0).ICustomTabsServiceStubProxy().onWarmupCompleted();
            MobileIdIssueVcNfcFragment.onWarmupCompleted(-1022432636, new Object[]{this.this$0}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1022432645, alertWithArgs.onExtraCallbackWithResult());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r8
      0x001d: PHI (r8v5 android.content.Context) = (r8v1 android.content.Context), (r8v6 android.content.Context) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, View view) throws Throwable {
        Context context;
        int i = 2 % 2;
        int i2 = access000 + 65;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            context = mobileIdIssueVcNfcFragment.getContext();
            int i3 = 59 / 0;
            if (context != null) {
                BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0OnExtraCallback = onExtraCallback(mobileIdIssueVcNfcFragment, context, null, null, 3, null);
                if (brickModuleImplExternalSyntheticLambda0OnExtraCallback != null) {
                    brickModuleImplExternalSyntheticLambda0OnExtraCallback.show();
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            context = mobileIdIssueVcNfcFragment.getContext();
            if (context != null) {
            }
        }
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 61;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onActivityLayout() {
        pointStartFunction pointstartfunction;
        String name;
        int i = 2 % 2;
        int i2 = access000 + 21;
        access100 = i2 % 128;
        pointStartFunction pointstartfunction2 = null;
        if (i2 % 2 == 0) {
            pointstartfunction = this.onNavigationEvent;
            int i3 = 42 / 0;
            if (pointstartfunction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                pointstartfunction = null;
            }
        } else {
            pointstartfunction = this.onNavigationEvent;
            if (pointstartfunction == null) {
            }
        }
        AnimateText animateText = pointstartfunction.IAuthTabCallback;
        animateText.setSubTypography(5);
        animateText.setFont(response.Bold);
        Intrinsics.checkNotNull(animateText);
        Context context = animateText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        animateText.setTextColor(new getUrlokhttp(new IAuthTabCallbackStubProxy(configuration)).onRelationshipValidationResult());
        pointStartFunction pointstartfunction3 = this.onNavigationEvent;
        if (pointstartfunction3 == null) {
            int i4 = access100 + 105;
            access000 = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = 17 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            pointstartfunction3 = null;
        }
        pointstartfunction3.IAuthTabCallback.extraCallbackWithResult();
        pointStartFunction pointstartfunction4 = this.onNavigationEvent;
        if (pointstartfunction4 == null) {
            int i6 = access100 + 87;
            access000 = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction4 = null;
        }
        AnimateText animateText2 = pointstartfunction4.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(animateText2, "");
        int i7 = im.toss.features.mobileid.impl.R.string.mobileid_impl_nfc_top;
        readExtHubMetaInfo readexthubmetainfoAsBinder = ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String strOnNavigationEvent = resolveProxyClass.onNavigationEvent(readexthubmetainfoAsBinder, contextRequireContext);
        MobileIdTagLocation mobileIdTagLocationIEngagementSignalsCallback_Parcel = ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IEngagementSignalsCallback_Parcel();
        if (mobileIdTagLocationIEngagementSignalsCallback_Parcel != null) {
            int i8 = access100 + 71;
            access000 = i8 % 128;
            if (i8 % 2 != 0) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                mobileIdTagLocationIEngagementSignalsCallback_Parcel.toName(contextRequireContext2);
                pointstartfunction2.hashCode();
                throw null;
            }
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            name = mobileIdTagLocationIEngagementSignalsCallback_Parcel.toName(contextRequireContext3);
            if (name == null) {
                MobileIdTagLocation mobileIdTagLocation = MobileIdTagLocation.TOP;
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                name = mobileIdTagLocation.toName(contextRequireContext4);
            }
        }
        String string = getString(i7, new Object[]{strOnNavigationEvent, name});
        Intrinsics.checkNotNullExpressionValue(string, "");
        readTimeout.IAuthTabCallbackStubProxy.onNavigationEvent onnavigationevent = readTimeout.IAuthTabCallbackStubProxy.onNavigationEvent.IAuthTabCallback;
        AnimateText.onNavigationEvent onnavigationevent2 = AnimateText.onNavigationEvent.CENTER;
        AnimateText.onExtraCallback(animateText2, string, onnavigationevent, 0, onnavigationevent2, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        pointStartFunction pointstartfunction5 = this.onNavigationEvent;
        if (pointstartfunction5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction5 = null;
        }
        TdsImageView tdsImageView = pointstartfunction5.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        MobileIdTagLocation mobileIdTagLocationIEngagementSignalsCallback_Parcel2 = ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IEngagementSignalsCallback_Parcel();
        TdsImageView.setImage$default(tdsImageView, mobileIdTagLocationIEngagementSignalsCallback_Parcel2 != null ? mobileIdTagLocationIEngagementSignalsCallback_Parcel2.getNfcImageUrl() : null, (Function1) null, (Function1) null, 6, (Object) null);
        pointStartFunction pointstartfunction6 = this.onNavigationEvent;
        if (pointstartfunction6 == null) {
            int i9 = access000 + 75;
            access100 = i9 % 128;
            if (i9 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction6 = null;
        }
        AnimateText animateText3 = pointstartfunction6.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(animateText3, "");
        animateText3.setVisibility(0);
        pointStartFunction pointstartfunction7 = this.onNavigationEvent;
        if (pointstartfunction7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction7 = null;
        }
        AnimateText animateText4 = pointstartfunction7.onWarmupCompleted;
        animateText4.setSubTypography(8);
        animateText4.setFont(response.Medium);
        Intrinsics.checkNotNull(animateText4);
        Context context2 = animateText4.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration2 = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        animateText4.setTextColor(new getUrlokhttp(new access100(configuration2)).asBinder());
        pointStartFunction pointstartfunction8 = this.onNavigationEvent;
        if (pointstartfunction8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction8 = null;
        }
        AnimateText animateText5 = pointstartfunction8.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(animateText5, "");
        String string2 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_title_2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        AnimateText.onExtraCallback(animateText5, string2, onnavigationevent, 0, onnavigationevent2, false, false, (Function0) null, (Function0) null, (Function0) null, 500, (Object) null);
        pointStartFunction pointstartfunction9 = this.onNavigationEvent;
        if (pointstartfunction9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction9 = null;
        }
        TdsButtonV1View tdsButtonV1View = pointstartfunction9.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        tdsButtonV1View.setTheme(TdsButtonV1View.IAuthTabCallbackStub.DARK, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, TdsButtonV1View.IAuthTabCallback.INLINE);
        pointStartFunction pointstartfunction10 = this.onNavigationEvent;
        if (pointstartfunction10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i10 = access000 + 27;
            access100 = i10 % 128;
            int i11 = i10 % 2;
            pointstartfunction10 = null;
        }
        pointstartfunction10.onExtraCallback.setTextColor(setBodyokhttp.onExtraCallback(this).requestPostMessageChannel().ICustomTabsCallbackStubProxy());
        pointStartFunction pointstartfunction11 = this.onNavigationEvent;
        if (pointstartfunction11 == null) {
            int i12 = access000 + 47;
            access100 = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            pointstartfunction11 = null;
        }
        pointStartFunction pointstartfunction12 = this.onNavigationEvent;
        if (pointstartfunction12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            pointstartfunction2 = pointstartfunction12;
        }
        pointstartfunction2.onExtraCallback.setText(getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_button_2));
        int i14 = access100 + 65;
        access000 = i14 % 128;
        int i15 = i14 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        if (!this.IAuthTabCallbackDefault) {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(requireContext());
            if (defaultAdapter != null) {
                Intent intent = new Intent(requireContext(), requireActivity().getClass());
                intent.setFlags(536870912);
                defaultAdapter.enableForegroundDispatch(requireActivity(), PendingIntent.getActivity(requireContext(), 0, intent, 33554432), null, new String[][]{new String[]{"android.nfc.tech.IsoDep"}});
            }
            if (ICustomTabsCallback()) {
                onExtraCallback onextracallback = this.onWarmupCompleted;
                onExtraCallback onextracallback2 = onExtraCallback.SCAN_NFC;
                if (onextracallback != onextracallback2) {
                    int i2 = access100 + 79;
                    access000 = i2 % 128;
                    if (i2 % 2 != 0) {
                        onActivityLayout();
                        this.onWarmupCompleted = onextracallback2;
                        int i3 = 81 / 0;
                    } else {
                        onActivityLayout();
                        this.onWarmupCompleted = onextracallback2;
                    }
                }
            } else {
                onExtraCallback onextracallback3 = this.onWarmupCompleted;
                onExtraCallback onextracallback4 = onExtraCallback.NEED_TURN_ON_NFC;
                if (onextracallback3 != onextracallback4) {
                    int i4 = access100 + 65;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    onMinimized();
                    this.onWarmupCompleted = onextracallback4;
                    return;
                }
            }
        }
        int i6 = access000 + 5;
        access100 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull Intent intent) {
        int i = 2 % 2;
        int i2 = access000 + 9;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IAuthTabCallback(intent);
        } else {
            Intrinsics.checkNotNullParameter(intent, "");
            ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).IAuthTabCallback(intent);
            int i3 = 34 / 0;
        }
    }

    private final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = access100 + 25;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = getDistributionPoints.onWarmupCompleted.onWarmupCompleted(NfcAdapter.getDefaultAdapter(requireContext()), "MobileIdVcNfcFragment");
        int i4 = access100 + 69;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private static final void onWarmupCompleted(Ref.BooleanRef booleanRef, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        if (booleanRef.element) {
            return;
        }
        int i2 = access000 + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).onWarmupCompleted();
        int i4 = access100 + 33;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class IAuthTabCallbackStub implements Function1<Unit, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public IAuthTabCallbackStub() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r10
          0x0026: PHI (r10v4 kotlin.jvm.functions.Function0) = (r10v3 kotlin.jvm.functions.Function0), (r10v14 kotlin.jvm.functions.Function0) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallback(Unit unit) throws Throwable {
            Function0 function0IAuthTabCallback;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                function0IAuthTabCallback = MobileIdIssueVcNfcFragment.IAuthTabCallback(MobileIdIssueVcNfcFragment.this);
                int i3 = 5 / 0;
                if (function0IAuthTabCallback != null) {
                    function0IAuthTabCallback.invoke();
                    int i4 = IAuthTabCallback + 37;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                }
            } else {
                function0IAuthTabCallback = MobileIdIssueVcNfcFragment.IAuthTabCallback(MobileIdIssueVcNfcFragment.this);
                if (function0IAuthTabCallback != null) {
                }
            }
            MobileIdIssueVcNfcFragment.onWarmupCompleted(836076422, new Object[]{MobileIdIssueVcNfcFragment.this, true}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -836076414, alertWithArgs.onExtraCallbackWithResult());
            int i6 = onWarmupCompleted + 19;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static final class asInterface implements Function1<Unit, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public asInterface() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onExtraCallback(Unit unit) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            MobileIdIssueVcNfcFragment.onWarmupCompleted(-1022432636, new Object[]{MobileIdIssueVcNfcFragment.this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1022432645, alertWithArgs.onExtraCallbackWithResult());
            int i4 = IAuthTabCallback + 11;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class onWarmupCompleted implements Function1<Unit, Unit> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public onWarmupCompleted() {
        }

        public /* synthetic */ Object invoke(Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(obj);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final void onExtraCallback(Unit unit) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            MobileIdIssueVcNfcFragment.onTransact(MobileIdIssueVcNfcFragment.this);
            int i4 = onExtraCallback + 123;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onWarmupCompleted(getTypedExportedConstants gettypedexportedconstants, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access100 + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(gettypedexportedconstants.getScreenParams());
        setDetectableSize.onExtraCallback("result_type", "CANCEL");
        setDetectableSize.onExtraCallback("idcard_type", dumpMetaInfoConfigJava.Companion.onWarmupCompleted(((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder()));
        Unit unit = Unit.INSTANCE;
        int i4 = access100 + 75;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, getTypedExportedConstants gettypedexportedconstants) throws Throwable {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onExtraCallback(1577603L, false, (String) null, (Map) null, new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda7(gettypedexportedconstants, mobileIdIssueVcNfcFragment), 14, (Object) null);
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).onWarmupCompleted();
        onWarmupCompleted(-516258260, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 516258267, alertWithArgs.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 51;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(Ref.BooleanRef booleanRef, getTypedExportedConstants gettypedexportedconstants, LottieAnimationView lottieAnimationView, BaseTextView baseTextView, LinearLayout linearLayout, BaseTextView baseTextView2, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        int i = 2 % 2;
        booleanRef.element = true;
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(gettypedexportedconstants), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(lottieAnimationView, baseTextView, linearLayout, baseTextView2, mobileIdIssueVcNfcFragment, null), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = access000 + 61;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(getTypedExportedConstants gettypedexportedconstants, MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback(gettypedexportedconstants.getScreenParams());
        setDetectableSize.onExtraCallback("result_type", "CANCEL");
        setDetectableSize.onExtraCallback("idcard_type", dumpMetaInfoConfigJava.Companion.onWarmupCompleted(((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder()));
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 41;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, getTypedExportedConstants gettypedexportedconstants, View view) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).onWarmupCompleted();
        ConvertByteArrayToFloatArray.onExtraCallback(1577603L, false, (String) null, (Map) null, new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda8(gettypedexportedconstants, mobileIdIssueVcNfcFragment), 14, (Object) null);
        onWarmupCompleted(-516258260, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 516258267, alertWithArgs.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = access100 + 7;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment = (MobileIdIssueVcNfcFragment) objArr[0];
        int i = 2 % 2;
        BottomSheetDialog bottomSheetDialog = mobileIdIssueVcNfcFragment.IAuthTabCallback;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
            int i2 = access100 + 41;
            access000 = i2 % 128;
            int i3 = i2 % 2;
        }
        Object obj = null;
        mobileIdIssueVcNfcFragment.IAuthTabCallback = null;
        int i4 = access100 + 79;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onMessageChannelReady() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 71;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (getActivity() != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            String string = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_nfc_common_error);
            Intrinsics.checkNotNullExpressionValue(string, "");
            TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(fragmentActivityRequireActivity, string);
            Object[] objArr = new Object[1];
            a(new char[]{9455, 9351, 15184, 61188, 35721, 39930, 36394, 35213, 58920, 18443, 52005, 20334, 41460, 3377, 2471, 3297, 27802, 50170, 18012, 49581, 11856, 32862, 33629, 34563, 59650, 17676, 49653, 17437, 46264, 31681, 7906, 14764, 30310, 14522, 23407, 65386, 12576, 64880, 39315, 48178, 64725, 45694, 54991, 29139, 49045, 28810, 4884, 14040, 31018, 13660, 20606, 62549, 1264, 59962, 28387, 43518, 51131, 43246, 43790, 28415, 33117, 28070, 59481, 11339}, TextUtils.getOffsetBefore("", 0) + 1, objArr);
            onnavigationevent.IAuthTabCallback(((String) objArr[0]).intern()).onNavigationEvent();
        }
        int i4 = access000 + 119;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        if (r1 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        r3 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000 + 15;
        im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access100 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        if ((r3 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r1 != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        r0 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_4);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r0 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_3);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r1 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access100 + 17;
        im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        r1 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        r2 = im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access000 + 87;
        im.toss.features.mobileid.impl.view.MobileIdIssueVcNfcFragment.access100 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        if (r1 == 2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String writeTypedObject() throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = access000 + 83;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            i = onNavigationEvent.IAuthTabCallback[((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder().ordinal()];
        } else {
            i = onNavigationEvent.IAuthTabCallback[((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder().ordinal()];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final String extraCallback() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onNavigationEvent.IAuthTabCallback[((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).asBinder().ordinal()];
        if (i2 == 1) {
            String string = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_5);
            Intrinsics.checkNotNull(string);
            int i3 = access000 + 93;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        if (i2 == 2) {
            String string2 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_6);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        int i5 = access100 + 59;
        int i6 = i5 % 128;
        access000 = i6;
        if (i5 % 2 == 0 ? i2 == 3 : i2 == 4) {
            String string3 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_7);
            Intrinsics.checkNotNull(string3);
            int i7 = access100 + 85;
            access000 = i7 % 128;
            if (i7 % 2 == 0) {
                return string3;
            }
            throw null;
        }
        int i8 = i6 + 15;
        access100 = i8 % 128;
        if (i8 % 2 != 0 ? i2 != 4 : i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_vc_nfc_error_title_8);
        Intrinsics.checkNotNull(string4);
        return string4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ BrickModuleImplExternalSyntheticLambda0 onExtraCallback(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, Context context, Function0 function0, Function0 function02, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access100 + 9;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            function0 = new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda12();
        }
        if ((i & 2) != 0) {
            function02 = new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda13();
        }
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0IAuthTabCallback = mobileIdIssueVcNfcFragment.IAuthTabCallback(context, (Function0<Unit>) function0, (Function0<Unit>) function02);
        int i5 = access000 + 101;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return brickModuleImplExternalSyntheticLambda0IAuthTabCallback;
    }

    private static final Unit getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = access100 + 121;
        access000 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit access100() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = access000 + 9;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return unit2;
    }

    private static final void onExtraCallbackWithResult(Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = access000 + 89;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
    }

    private static final void onExtraCallbackWithResult(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment, Function0 function0, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = access000 + 13;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).onMessageChannelReady().onWarmupCompleted(Boolean.FALSE);
        function0.invoke();
        int i4 = access100 + 47;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0, View view) {
        int i = 2 % 2;
        int i2 = access100 + 19;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        brickModuleImplExternalSyntheticLambda0.dismiss();
        Unit unit = Unit.INSTANCE;
        int i4 = access000 + 27;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 87;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onPause();
        Activity activityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activityRequireActivity, "");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activityRequireActivity);
        if (defaultAdapter != null) {
            defaultAdapter.disableForegroundDispatch(activityRequireActivity);
        }
        int i4 = access000 + 29;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.onWarmupCompleted = onExtraCallback.NOTHING;
        maybeUpdateAnimatable.onNavigationEvent(onRenderReady.onExtraCallback(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackDefault(this, (access13800) null), 3, (Object) null);
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).ICustomTabsCallback_Parcel().observe(getViewLifecycleOwner(), new BaseFragment.onPostMessage(new onWarmupCompleted()));
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).access000().observe(getViewLifecycleOwner(), new BaseFragment.onPostMessage(new asInterface()));
        ((MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())).onActivityLayout().observe(getViewLifecycleOwner(), new BaseFragment.onPostMessage(new IAuthTabCallbackStub()));
        Object[] objArr = {(MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult())};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        ((Rmipmap) MobileIdIssueViewModel.onNavigationEvent(-398626569, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 398626579, iIAuthTabCallback, objArr, R.drawable.IAuthTabCallback())).observe(getViewLifecycleOwner(), new BaseFragment.onPostMessage(new onTransact()));
        int i2 = access100 + 71;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    private final BrickModuleImplExternalSyntheticLambda0 IAuthTabCallback(Context context, Function0<Unit> function0, Function0<Unit> function02) throws Throwable {
        int i = 2 % 2;
        BrickModuleImplExternalSyntheticLambda0 brickModuleImplExternalSyntheticLambda0 = new BrickModuleImplExternalSyntheticLambda0(context, false, false, 0, 0, 0L, (Function1) null, 126, (DefaultConstructorMarker) null);
        brickModuleImplExternalSyntheticLambda0.setOnShowListener(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda9(function0));
        brickModuleImplExternalSyntheticLambda0.setOnDismissListener(new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda10(this, function02));
        Context context2 = brickModuleImplExternalSyntheticLambda0.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        TdsScrollView tdsScrollView = new TdsScrollView(context3, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.weight = 1.0f;
        tdsScrollView.setLayoutParams(layoutParams);
        Context context4 = tdsScrollView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        LinearLayout linearLayout2 = new LinearLayout(context4);
        linearLayout2.setOrientation(1);
        Context context5 = linearLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        BottomSheetHeader bottomSheetHeader = new BottomSheetHeader(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        bottomSheetHeader.setTitle(bottomSheetHeader.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_bottomsheet_title));
        bottomSheetHeader.setShowCloseIcon(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout2, bottomSheetHeader);
        String string = linearLayout2.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_bottomsheet_item_1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = new Object[1];
        a(new char[]{47383, 47487, 40685, 36987, 11828, 37716, 61781, 33059, 31696, 60854, 46170, 18368, 15372, 43148, 30424, 1103, 61794, 26183, 14627, 51459, 45992, 9699, 64546, 36781, 29946, 57521, 48778, 19638, 10572, 56935, 24967, 12568, 60372, 40196, 9299, 63424, 44184, 22676, 59129, 46300, 24874, 6031, 43450, 31073, 8754, 54571, 27757, 15934, 58587, 37045, 12096, 64752, 39189, 20369, 4552, 41230, 23121, 3408, 54384, 26138, 7393, 51224, 38695, 9452}, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        onExtraCallback(linearLayout2, ((String) objArr[0]).intern(), string);
        String string2 = linearLayout2.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_bottomsheet_item_2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{25024, 25000, 31868, 55157, 52389, 8860, 46683, 12523, 41735, 3879, 62292, 62984, 58587, 18973, 12758, 46471, 10677, 34006, 32301, 30923, 27519, 51058, 47916, 15973, 44077, 544, 63876, 64894, 61851, 15606, 9865, 32976, 13059, 32661, 25437, 17928, 29775, 47621, 41463, 1300, 47613, 62750, 61108, 51369, 64229, 14266, 11107, 36854, 15372, 29223, 26702, 19768, 16834, 44288, 22214, 4294, 33414, 61377, 37758, 55250, 50230, 10889, 53289, 38180}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr2);
        onExtraCallback(linearLayout2, ((String) objArr2[0]).intern(), string2);
        String string3 = linearLayout2.getContext().getString(im.toss.features.mobileid.impl.R.string.mobileid_impl_issue_vc_nfc_bottomsheet_item_3);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Object[] objArr3 = new Object[1];
        a(new char[]{43313, 43353, 32896, 33246, 12377, 50971, 57584, 54636, 27638, 62427, 42495, 5007, 11306, 46817, 26493, 20480, 57668, 30762, 10374, 40268, 41870, 15246, 60807, 56290, 25820, 65244, 44847, 6393, 14698, 49162, 28706, 25943, 64498, 33641, 13814, 41871, 48318, 18169, 63324, 57491, 28940, 2530, 47135, 11566, 12820, 52038, 32200, 27249, 62717, 36570, 16101, 43199, 35123, 20988, 'm', 62785, 19063, 4925, 50645, 12885, 3271, 54901, 34434, 28835}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr3);
        onExtraCallback(linearLayout2, ((String) objArr3[0]).intern(), string3);
        setProxySelectorokhttp.onExtraCallbackWithResult(tdsScrollView, linearLayout2);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsScrollView);
        Context context6 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        TdsBottomCtaV1View tdsBottomCtaV1View = new TdsBottomCtaV1View(context6);
        String string4 = tdsBottomCtaV1View.getContext().getString(im.toss.uikit.R.string.uikit_confirm);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1View, string4, new MobileIdIssueVcNfcFragment$.ExternalSyntheticLambda11(brickModuleImplExternalSyntheticLambda0), new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, (TdsButtonV1View.IAuthTabCallbackDefault) null, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 14, (DefaultConstructorMarker) null), false, 8, (Object) null);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsBottomCtaV1View);
        brickModuleImplExternalSyntheticLambda0.setContentView(linearLayout);
        int i2 = access000 + 25;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return brickModuleImplExternalSyntheticLambda0;
    }

    private final void onExtraCallback(ViewGroup viewGroup, String str, String str2) {
        int i = 2 % 2;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        TdsListRowV1View tdsListRowV1View = new TdsListRowV1View(context, (AttributeSet) null, 0, true, 6, (DefaultConstructorMarker) null);
        tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View.setLeftImage(str);
        DisplayMetrics displayMetrics = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(24, displayMetrics);
        DisplayMetrics displayMetrics2 = tdsListRowV1View.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        tdsListRowV1View.setLeftImageSize(iOnNavigationEvent, varyMatches.onNavigationEvent(24, displayMetrics2));
        tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
        tdsListRowV1View.setCenterText1(str2);
        Context context2 = tdsListRowV1View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View.setCenterText1Color(new getUrlokhttp(new onExtraCallbackWithResult(configuration)).ICustomTabsCallbackStubProxy());
        tdsListRowV1View.setRightArrow(false);
        setProxySelectorokhttp.onExtraCallbackWithResult(viewGroup, tdsListRowV1View);
        int i2 = access000 + 13;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub() {
        return (Unit) onWarmupCompleted(-635646508, new Object[0], alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 635646512, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ NfcAdapter onNavigationEvent(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        return (NfcAdapter) onWarmupCompleted(1987428103, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1987428097, alertWithArgs.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit asInterface() {
        return (Unit) onWarmupCompleted(-1693386258, new Object[0], alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1693386259, alertWithArgs.onExtraCallbackWithResult());
    }

    public static final /* synthetic */ NfcAdapter onExtraCallbackWithResult(MobileIdIssueVcNfcFragment mobileIdIssueVcNfcFragment) {
        return (NfcAdapter) onWarmupCompleted(760769792, new Object[]{mobileIdIssueVcNfcFragment}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -760769792, alertWithArgs.onExtraCallbackWithResult());
    }

    private final void access000() throws Throwable {
        onWarmupCompleted(-516258260, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 516258267, alertWithArgs.onExtraCallbackWithResult());
    }

    private final MobileIdIssueViewModel extraCallbackWithResult() {
        return (MobileIdIssueViewModel) onWarmupCompleted(-1780967407, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1780967412, alertWithArgs.onExtraCallbackWithResult());
    }

    private final void onPostMessage() throws Throwable {
        onWarmupCompleted(994361994, new Object[]{this}, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -994361991, alertWithArgs.onExtraCallbackWithResult());
    }

    static void IAuthTabCallbackStubProxy() {
        asInterface = -3434631168052507743L;
    }
}
