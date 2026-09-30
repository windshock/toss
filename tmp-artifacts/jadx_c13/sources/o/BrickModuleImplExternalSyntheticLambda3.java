package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import im.toss.tds.R;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BrickModuleImplExternalSyntheticLambda3 extends AlertDialog implements findResAndMsg {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface;
    private final CoroutineContext onExtraCallback;
    private final /* synthetic */ r8lambdaeZFGAqULWs2rNMV9lnqViN_DJc onExtraCallbackWithResult;
    private AFj1uSDK onNavigationEvent;
    private CharSequence onWarmupCompleted;

    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult.onExtraCallback();
            int i3 = 40 / 0;
        } else {
            this.onExtraCallbackWithResult.onExtraCallback();
        }
        int i4 = asInterface + 55;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrickModuleImplExternalSyntheticLambda3(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = new r8lambdaeZFGAqULWs2rNMV9lnqViN_DJc(context, "DeferredProgressDialog");
        this.onExtraCallback = isNeedUnzip.onExtraCallbackWithResult(null, 1, null).plus(putChannelInfo.onExtraCallback().onWarmupCompleted());
    }

    public static final /* synthetic */ AFj1uSDK onExtraCallback(BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AFj1uSDK aFj1uSDK = brickModuleImplExternalSyntheticLambda3.onNavigationEvent;
        if (i3 == 0) {
            return aFj1uSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda3 brickModuleImplExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super/*android.app.Dialog*/.show();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackDefault + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.findResAndMsg
    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            coroutineContext = this.onExtraCallback;
            int i4 = 25 / 0;
        } else {
            coroutineContext = this.onExtraCallback;
        }
        int i5 = i2 + 87;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        AFj1uSDK aFj1uSDKOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        AFj1uSDK aFj1uSDK = null;
        if (i2 % 2 == 0) {
            super.onCreate(bundle);
            aFj1uSDKOnExtraCallbackWithResult = AFj1uSDK.onExtraCallbackWithResult(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(aFj1uSDKOnExtraCallbackWithResult, "");
            this.onNavigationEvent = aFj1uSDKOnExtraCallbackWithResult;
            int i3 = 30 / 0;
            if (aFj1uSDKOnExtraCallbackWithResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = IAuthTabCallbackDefault + 17;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                aFj1uSDKOnExtraCallbackWithResult = null;
            }
        } else {
            super.onCreate(bundle);
            aFj1uSDKOnExtraCallbackWithResult = AFj1uSDK.onExtraCallbackWithResult(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(aFj1uSDKOnExtraCallbackWithResult, "");
            this.onNavigationEvent = aFj1uSDKOnExtraCallbackWithResult;
            if (aFj1uSDKOnExtraCallbackWithResult == null) {
            }
        }
        setContentView(aFj1uSDKOnExtraCallbackWithResult.IAuthTabCallback());
        Window window = getWindow();
        if (window != null) {
            int i6 = asInterface + 51;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            View decorView = window.getDecorView();
            if (decorView != null) {
                setProtocolsokhttp.onNavigationEvent(decorView);
            }
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        AFj1uSDK aFj1uSDK2 = this.onNavigationEvent;
        if (aFj1uSDK2 == null) {
            int i8 = IAuthTabCallbackDefault + 25;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i10 = asInterface + 43;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
        } else {
            aFj1uSDK = aFj1uSDK2;
        }
        aFj1uSDK.IAuthTabCallback.setText(this.onWarmupCompleted);
    }

    public void onExtraCallbackWithResult(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        super.onExtraCallbackWithResult(charSequence);
        this.onWarmupCompleted = charSequence;
        AFj1uSDK aFj1uSDK = this.onNavigationEvent;
        if (aFj1uSDK != null) {
            int i2 = asInterface + 49;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (aFj1uSDK == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDK = null;
            }
            aFj1uSDK.IAuthTabCallback.setText(charSequence);
        }
        int i4 = IAuthTabCallbackDefault + 71;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void show() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(0L);
        int i4 = asInterface + 93;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getPackageType IAuthTabCallback(long j) {
        int i = 2 % 2;
        getPackageType getpackagetypeOnExtraCallback = onLoadStarted.onExtraCallback(this, null, null, new onExtraCallback(j, null), 3, null);
        int i2 = asInterface + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return getpackagetypeOnExtraCallback;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ long $delayMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(long j, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$delayMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = BrickModuleImplExternalSyntheticLambda3.this.new onExtraCallback(this.$delayMillis, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            Object obj = null;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onWarmupCompleted(findresandmsg2, access13800Var2);
                obj.hashCode();
                throw null;
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg2, access13800Var2);
            int i3 = onExtraCallback + 57;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 15;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i4 = IAuthTabCallback + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                BrickModuleImplExternalSyntheticLambda3.onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda3.this);
                long j = this.$delayMillis;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(j, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            Window window = BrickModuleImplExternalSyntheticLambda3.this.getWindow();
            if (window != null) {
                window.setFlags(2, 2);
            }
            Window window2 = BrickModuleImplExternalSyntheticLambda3.this.getWindow();
            if (window2 != null) {
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(24.0f);
                Intrinsics.checkNotNullExpressionValue(BrickModuleImplExternalSyntheticLambda3.this.getContext().getResources().getDisplayMetrics(), "");
                MaterialShapeDrawable materialShapeDrawableOnExtraCallback = deprecated_noTransform.onExtraCallback(varyMatches.onNavigationEvent(fOnExtraCallbackWithResult, r3));
                Intrinsics.checkNotNull(materialShapeDrawableOnExtraCallback, "");
                MaterialShapeDrawable materialShapeDrawable = materialShapeDrawableOnExtraCallback;
                materialShapeDrawable.setFillColor(ContextCompat.getColorStateList(BrickModuleImplExternalSyntheticLambda3.this.getContext(), R.color.grey_100));
                window2.setBackgroundDrawable(materialShapeDrawable);
            }
            AFj1uSDK aFj1uSDKOnExtraCallback = BrickModuleImplExternalSyntheticLambda3.onExtraCallback(BrickModuleImplExternalSyntheticLambda3.this);
            if (aFj1uSDKOnExtraCallback == null) {
                int i6 = onExtraCallback + 81;
                IAuthTabCallback = i6 % 128;
                Object obj2 = null;
                if (i6 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    obj2.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1uSDKOnExtraCallback = null;
            }
            LinearLayout linearLayout = aFj1uSDKOnExtraCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            BrickModuleImplExternalSyntheticLambda3.this.onNavigationEvent();
            return Unit.INSTANCE;
        }
    }

    public void dismiss() {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 91;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNull(this, "");
            i = 0;
        } else {
            Intrinsics.checkNotNull(this, "");
            i = 1;
        }
        findRes.onExtraCallbackWithResult(this, null, i, null);
        onExtraCallback();
        super/*androidx.appcompat.app.AppCompatDialog*/.dismiss();
    }
}
