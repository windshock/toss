package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import im.toss.core.R;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.uikit.widget.gl.AuthBackgroundLoadingView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.toNativeBlendMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class toNativeBlendMode {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final AppSetIdAndScope1 IAuthTabCallback = ea10.onExtraCallbackWithResult("BiometricWrapper");
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private BiometricPrompt onExtraCallback;
    private final RememberLottieCompositionKtlottieComposition1 onExtraCallbackWithResult;
    private final ExecutorService onNavigationEvent;
    private AuthBackgroundLoadingView onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void onExtraCallback();

        void onExtraCallback(@NotNull BiometricPrompt.onExtraCallback onextracallback);

        void onExtraCallbackWithResult();

        void onExtraCallbackWithResult(int i, @NotNull CharSequence charSequence);

        void onNavigationEvent();
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~(i3 | i);
        int i10 = i7 | (~i3);
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~i2) | i10;
        int i13 = i3 + i + i6 + (1134938392 * i5) + ((-1730424158) * i4);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i3) + 1061748736 + ((-382549644) * i) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i6) + (1924136960 * i5) + (748945408 * i4) + (912850944 * i14);
        int i16 = (i3 * 1914917686) + 639827133 + (i * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i6 * 1914918157) + (i5 * (-1451741640)) + (i4 * (-1338016710)) + (i14 * (-1605042176));
        if (i15 + (i16 * i16 * (-230752256)) == 1) {
            return onNavigationEvent(objArr);
        }
        toNativeBlendMode tonativeblendmode = (toNativeBlendMode) objArr[0];
        int i17 = 2 % 2;
        int i18 = asInterface + 83;
        onTransact = i18 % 128;
        int i19 = i18 % 2;
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        onWarmupCompleted(2097065731, iOnExtraCallbackWithResult, -2097065730, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{tonativeblendmode});
        int i20 = asInterface + 71;
        onTransact = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public toNativeBlendMode(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        this.onExtraCallbackWithResult = rememberLottieCompositionKtlottieComposition1;
        this.onNavigationEvent = Executors.newSingleThreadExecutor();
    }

    public static final /* synthetic */ AuthBackgroundLoadingView onExtraCallbackWithResult(toNativeBlendMode tonativeblendmode) {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AuthBackgroundLoadingView authBackgroundLoadingView = tonativeblendmode.onWarmupCompleted;
        if (i3 != 0) {
            return authBackgroundLoadingView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = IAuthTabCallback;
        int i5 = i3 + 79;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return appSetIdAndScope1;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(toNativeBlendMode tonativeblendmode) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        tonativeblendmode.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onNavigationEvent(toNativeBlendMode tonativeblendmode, AuthBackgroundLoadingView authBackgroundLoadingView) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 97;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        tonativeblendmode.onWarmupCompleted = authBackgroundLoadingView;
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = i2 + 123;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public final RememberLottieCompositionKtlottieComposition1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1 = this.onExtraCallbackWithResult;
        int i5 = i2 + 1;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return rememberLottieCompositionKtlottieComposition1;
    }

    public static final class onExtraCallback {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public final RectangleShape onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = onRetainNonConfigurationInstance.onNavigationEvent;
            int iOnWarmupCompleted = onretainnonconfigurationinstance.onWarmupCompleted(context);
            if (iOnWarmupCompleted == 0) {
                int i2 = onWarmupCompleted + 121;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                if (!onretainnonconfigurationinstance.onExtraCallback(context)) {
                    int i4 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    iOnWarmupCompleted = 14;
                }
            }
            RectangleShape rectangleShape = new RectangleShape(iOnWarmupCompleted);
            int i6 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return rectangleShape;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = IAuthTabCallbackDefault + 105;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public final void onNavigationEvent(@Nullable BiometricPrompt.IAuthTabCallback iAuthTabCallback, @NotNull String str, int i, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        IAuthTabCallback(str, i);
        BiometricPrompt.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = new BiometricPrompt.onExtraCallbackWithResult.onNavigationEvent();
        String biometricTitle = this.onExtraCallbackWithResult.getBiometricTitle();
        if (biometricTitle.length() == 0) {
            int i3 = asInterface + 117;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            biometricTitle = AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.biometric_auth_title);
        }
        BiometricPrompt.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = onnavigationevent.onExtraCallback(biometricTitle).onWarmupCompleted("").IAuthTabCallback("");
        if (str2 != null) {
            onnavigationeventIAuthTabCallback.onNavigationEvent(str2);
        } else {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = onRetainNonConfigurationInstance.onNavigationEvent;
            FragmentActivity activity = this.onExtraCallbackWithResult.getActivity();
            Intrinsics.checkNotNull(activity);
            if (onretainnonconfigurationinstance.onExtraCallbackWithResult(activity)) {
                onnavigationeventIAuthTabCallback.onNavigationEvent(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(im.toss.uikit.R.string.uikit_cancel));
            } else {
                onnavigationeventIAuthTabCallback.onNavigationEvent(AFj1rSDK.onExtraCallback.onExtraCallbackWithResult(R.string.biometric_auth_use_password));
            }
        }
        BiometricPrompt.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onnavigationeventIAuthTabCallback.onNavigationEvent(iAuthTabCallback != null).onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(onextracallbackwithresultOnWarmupCompleted, "");
        BiometricPrompt biometricPrompt = this.onExtraCallback;
        if (biometricPrompt != null) {
            biometricPrompt.onExtraCallback();
        }
        BiometricPrompt biometricPromptOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackwithresult);
        this.onExtraCallback = biometricPromptOnExtraCallbackWithResult;
        if (iAuthTabCallback != null) {
            if (biometricPromptOnExtraCallbackWithResult != null) {
                int i5 = asInterface + 51;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    biometricPromptOnExtraCallbackWithResult.onWarmupCompleted(onextracallbackwithresultOnWarmupCompleted, iAuthTabCallback);
                    return;
                } else {
                    biometricPromptOnExtraCallbackWithResult.onWarmupCompleted(onextracallbackwithresultOnWarmupCompleted, iAuthTabCallback);
                    int i6 = 10 / 0;
                    return;
                }
            }
        } else if (biometricPromptOnExtraCallbackWithResult != null) {
            int i7 = asInterface + 77;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            biometricPromptOnExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresultOnWarmupCompleted);
        }
        int i9 = asInterface + 93;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (StringsKt.isBlank(str) || Build.VERSION.SDK_INT < 28) {
            return;
        }
        int i5 = onTransact + 99;
        asInterface = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            FragmentActivity activity = this.onExtraCallbackWithResult.getActivity();
            if (activity == null || varyFields.onWarmupCompleted(activity) || activity.isFinishing() || generateLink.onExtraCallbackWithResult(activity) < i) {
                int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
                onWarmupCompleted(2097065731, iOnExtraCallbackWithResult, -2097065730, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this});
                return;
            }
            maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity), putChannelInfo.onExtraCallback(), (setRandomHost) null, new IAuthTabCallback(activity, null), 2, (Object) null);
            return;
        }
        this.onExtraCallbackWithResult.getActivity();
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ FragmentActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(FragmentActivity fragmentActivity, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$activity = fragmentActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = toNativeBlendMode.this.new IAuthTabCallback(this.$activity, access13800Var);
            int i2 = onWarmupCompleted + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 0 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 105;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            ViewGroup viewGroup;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            toNativeBlendMode tonativeblendmode = toNativeBlendMode.this;
            AuthBackgroundLoadingView authBackgroundLoadingView = new AuthBackgroundLoadingView(this.$activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            FragmentActivity fragmentActivity = this.$activity;
            authBackgroundLoadingView.onWarmupCompleted();
            authBackgroundLoadingView.onNavigationEvent(fragmentActivity);
            toNativeBlendMode.onNavigationEvent(tonativeblendmode, authBackgroundLoadingView);
            View decorView = this.$activity.getWindow().getDecorView();
            Object obj2 = null;
            if (decorView instanceof ViewGroup) {
                int i2 = onWarmupCompleted + 113;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                viewGroup = (ViewGroup) decorView;
            } else {
                int i3 = onWarmupCompleted + 39;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                viewGroup = null;
            }
            if (viewGroup != null) {
                int i5 = onWarmupCompleted + 117;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    viewGroup.addView(toNativeBlendMode.onExtraCallbackWithResult(toNativeBlendMode.this));
                    throw null;
                }
                viewGroup.addView(toNativeBlendMode.onExtraCallbackWithResult(toNativeBlendMode.this));
            }
            return Unit.INSTANCE;
        }
    }

    private final BiometricPrompt onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.onExtraCallbackWithResult;
        if (fragment instanceof Fragment) {
            return new BiometricPrompt(fragment, this.onNavigationEvent, onExtraCallback(onextracallbackwithresult));
        }
        if (!(fragment instanceof FragmentActivity)) {
            throw new IllegalStateException("Wrong type of AuthView is passed");
        }
        BiometricPrompt biometricPrompt = new BiometricPrompt((FragmentActivity) fragment, this.onNavigationEvent, onExtraCallback(onextracallbackwithresult));
        int i4 = asInterface + 85;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return biometricPrompt;
        }
        throw null;
    }

    public static final class onWarmupCompleted extends BiometricPrompt.onWarmupCompleted {
        private static final byte[] $$a = {35, -11, -97, -73};
        private static final int $$b = 239;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 478308873;
        final /* synthetic */ toNativeBlendMode onExtraCallback;
        final /* synthetic */ onExtraCallbackWithResult onWarmupCompleted;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, byte b, int i) {
            int i2;
            int i3 = s + 4;
            byte[] bArr = $$a;
            int i4 = 105 - (i * 3);
            int i5 = b * 2;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            if (bArr == null) {
                int i7 = i4;
                int i8 = 0;
                int i9 = i3;
                int i10 = (-i3) + i7;
                i2 = i8;
                int i11 = i9;
                i4 = i10;
                i3 = i11;
                int i12 = i3 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                    return new String(bArr2, 0);
                }
                int i13 = i4;
                i9 = i12;
                i3 = bArr[i12];
                i8 = i2 + 1;
                i7 = i13;
                int i102 = (-i3) + i7;
                i2 = i8;
                int i112 = i9;
                i4 = i102;
                i3 = i112;
                int i122 = i3 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            } else {
                i2 = 0;
                int i1222 = i3 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i6) {
                }
            }
        }

        public static /* synthetic */ void IAuthTabCallback(FragmentActivity fragmentActivity, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(fragmentActivity, charSequence);
            int i4 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
        }

        public static /* synthetic */ void onWarmupCompleted(FragmentActivity fragmentActivity) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(fragmentActivity);
            int i4 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, toNativeBlendMode tonativeblendmode) {
            this.onWarmupCompleted = onextracallbackwithresult;
            this.onExtraCallback = tonativeblendmode;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5;
            Throwable cause;
            int i6 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr2 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i4 = -1;
                i5 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                    break;
                }
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35125), 23 - TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Drawable.resolveOpacity(0, 0) + 12843), 55 - ExpandableListView.getPackedPositionType(0L), 2167 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (z) {
                char[] cArr4 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    int i8 = $10 + 11;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) i4;
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0, 0)), 55 - Color.argb(0, 0, 0, 0), 2167 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = -1;
                    i5 = 2083011369;
                }
                int i10 = $10 + 65;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        public void onNavigationEvent(BiometricPrompt.onExtraCallback onextracallback) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onWarmupCompleted.onExtraCallback(onextracallback);
            toNativeBlendMode.onExtraCallbackWithResult();
            Objects.toString(onextracallback);
            Object[] objArr = {this.onExtraCallback};
            int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
            toNativeBlendMode.onWarmupCompleted(-2101133863, iOnExtraCallbackWithResult, 2101133863, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr);
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final void IAuthTabCallback(FragmentActivity fragmentActivity) throws Throwable {
            Object obj;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            long globalActionKeyTimeout = ViewConfiguration.getGlobalActionKeyTimeout();
            if (i3 == 0) {
                Object[] objArr = new Object[1];
                a(117 >>> (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 104 - View.resolveSize(1, 0), new char[]{28356, 13610, 13386, 17578, 10335, 28342, 12658, 13878, 28342, 13834, 14387, 13838, 28342, 15178, 12147, 28356, 13610, 12238, 14226, 28342, 17418, 14387, 13838, 28342, 9970, 17614, 11038, 10902, 11482, 28342}, false, 37259 << Process.getGidForName(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(31 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), View.resolveSize(0, 0) + 15, new char[]{28356, 13610, 13386, 17578, 10335, 28342, 12658, 13878, 28342, 13834, 14387, 13838, 28342, 15178, 12147, 28356, 13610, 12238, 14226, 28342, 17418, 14387, 13838, 28342, 9970, 17614, 11038, 10902, 11482, 28342}, true, Process.getGidForName("") + 37259, objArr2);
                obj = objArr2[0];
            }
            Toast.makeText((Context) fragmentActivity, (CharSequence) ((String) obj).intern(), 0).show();
            int i4 = IAuthTabCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public void IAuthTabCallback(int i, final CharSequence charSequence) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
            Object[] objArr = {this.onExtraCallback};
            toNativeBlendMode.onWarmupCompleted(-2101133863, handleRemoveKey.onExtraCallbackWithResult(), 2101133863, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), objArr);
            toNativeBlendMode.onExtraCallbackWithResult();
            Objects.toString(charSequence);
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BiometricWrapper", "onAuthenticationError code=" + i + ", str=" + ((Object) charSequence), (Map) null, (String) null, false, (String) null, 60, (Object) null);
            if (i == 7) {
                final FragmentActivity activity = this.onExtraCallback.onExtraCallback().getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: im.toss.core.biometric.BiometricWrapper$createBiometricAuthenticationCallback$1$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i3 = 2 % 2;
                            int i4 = onNavigationEvent + 55;
                            onExtraCallbackWithResult = i4 % 128;
                            int i5 = i4 % 2;
                            toNativeBlendMode.onWarmupCompleted.onWarmupCompleted(activity);
                            int i6 = onNavigationEvent + 65;
                            onExtraCallbackWithResult = i6 % 128;
                            if (i6 % 2 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                }
                toNativeBlendMode.onNavigationEvent(this.onExtraCallback);
                this.onWarmupCompleted.onExtraCallbackWithResult();
                return;
            }
            Object obj = null;
            if (i == 13) {
                this.onWarmupCompleted.onExtraCallbackWithResult();
                int i3 = IAuthTabCallback + 93;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i4 = IAuthTabCallback;
            int i5 = i4 + 31;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0 ? i == 9 : i == 88) {
                if (charSequence.length() > 0) {
                    int i6 = IAuthTabCallback + 35;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    final FragmentActivity activity2 = this.onExtraCallback.onExtraCallback().getActivity();
                    if (activity2 != null) {
                        activity2.runOnUiThread(new Runnable() { // from class: im.toss.core.biometric.BiometricWrapper$createBiometricAuthenticationCallback$1$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallback + 27;
                                onExtraCallbackWithResult = i9 % 128;
                                int i10 = i9 % 2;
                                toNativeBlendMode.onWarmupCompleted.IAuthTabCallback(activity2, charSequence);
                                int i11 = onExtraCallbackWithResult + 105;
                                onExtraCallback = i11 % 128;
                                if (i11 % 2 == 0) {
                                    throw null;
                                }
                            }
                        });
                    }
                }
                toNativeBlendMode.onNavigationEvent(this.onExtraCallback);
                this.onWarmupCompleted.onExtraCallbackWithResult(i, charSequence);
                return;
            }
            if (i == 10) {
                this.onWarmupCompleted.onExtraCallback();
                return;
            }
            int i8 = i4 + 103;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                this.onWarmupCompleted.onExtraCallbackWithResult(i, charSequence);
            } else {
                this.onWarmupCompleted.onExtraCallbackWithResult(i, charSequence);
                obj.hashCode();
                throw null;
            }
        }

        private static final void onExtraCallback(FragmentActivity fragmentActivity, CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Toast.makeText((Context) fragmentActivity, charSequence, 0).show();
        }

        public void onExtraCallbackWithResult() throws Throwable {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
            String str;
            String str2;
            Map map;
            String str3;
            boolean z;
            String str4;
            int i;
            Object obj;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = {this.onExtraCallback};
                int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                toNativeBlendMode.onWarmupCompleted(-2101133863, iOnExtraCallbackWithResult, 2101133863, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr);
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                str = "BiometricWrapper";
                str2 = "onAuthenticationFailed";
                map = null;
                str3 = null;
                z = false;
                str4 = null;
                i = 44;
                obj = null;
            } else {
                Object[] objArr2 = {this.onExtraCallback};
                int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = handleRemoveKey.onExtraCallbackWithResult();
                toNativeBlendMode.onWarmupCompleted(-2101133863, iOnExtraCallbackWithResult3, 2101133863, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, objArr2);
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                str = "BiometricWrapper";
                str2 = "onAuthenticationFailed";
                map = null;
                str3 = null;
                z = false;
                str4 = null;
                i = 60;
                obj = null;
            }
            ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, str, str2, map, str3, z, str4, i, obj);
            toNativeBlendMode.onExtraCallbackWithResult();
            this.onWarmupCompleted.onNavigationEvent();
            int i4 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final BiometricPrompt.onWarmupCompleted onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onextracallbackwithresult, this);
        int i2 = onTransact + 73;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = toNativeBlendMode.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 107;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 97 / 0;
            return onnavigationeventCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            AuthBackgroundLoadingView authBackgroundLoadingViewOnExtraCallbackWithResult = toNativeBlendMode.onExtraCallbackWithResult(toNativeBlendMode.this);
            if (authBackgroundLoadingViewOnExtraCallbackWithResult != null) {
                int i2 = onExtraCallback + 61;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                authBackgroundLoadingViewOnExtraCallbackWithResult.onNavigationEvent();
                int i4 = onNavigationEvent + 121;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            toNativeBlendMode.onNavigationEvent(toNativeBlendMode.this, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getPackageType getpackagetypeOnNavigationEvent;
        toNativeBlendMode tonativeblendmode = (toNativeBlendMode) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (tonativeblendmode.onWarmupCompleted != null) {
            FragmentActivity activity = tonativeblendmode.onExtraCallbackWithResult.getActivity();
            if (activity != null) {
                int i2 = asInterface + 21;
                onTransact = i2 % 128;
                if (i2 % 2 != 0) {
                    TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity);
                    obj.hashCode();
                    throw null;
                }
                TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(activity);
                if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                    getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, putChannelInfo.onExtraCallback(), (setRandomHost) null, tonativeblendmode.new onNavigationEvent(null), 2, (Object) null);
                    int i3 = asInterface + 47;
                    onTransact = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 4 / 5;
                    }
                } else {
                    getpackagetypeOnNavigationEvent = null;
                }
                if (getpackagetypeOnNavigationEvent != null) {
                    return null;
                }
            }
        }
        tonativeblendmode.onWarmupCompleted = null;
        Unit unit = Unit.INSTANCE;
        int i5 = asInterface + 101;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent() {
        AuthBackgroundLoadingView authBackgroundLoadingView;
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            authBackgroundLoadingView = this.onWarmupCompleted;
            int i3 = 93 / 0;
            if (authBackgroundLoadingView == null) {
                return;
            }
        } else {
            authBackgroundLoadingView = this.onWarmupCompleted;
            if (authBackgroundLoadingView == null) {
                return;
            }
        }
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        AuthBackgroundLoadingView.onExtraCallback(LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, 472389948, new Object[]{authBackgroundLoadingView}, iOnWarmupCompleted3, -472389943);
        int i4 = onTransact + 9;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        BiometricPrompt biometricPrompt = this.onExtraCallback;
        if (biometricPrompt != null) {
            int i2 = asInterface + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            biometricPrompt.onExtraCallback();
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = asInterface + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void onExtraCallback(toNativeBlendMode tonativeblendmode) {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        onWarmupCompleted(-2101133863, iOnExtraCallbackWithResult, 2101133863, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{tonativeblendmode});
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
        onWarmupCompleted(2097065731, iOnExtraCallbackWithResult, -2097065730, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this});
    }
}
