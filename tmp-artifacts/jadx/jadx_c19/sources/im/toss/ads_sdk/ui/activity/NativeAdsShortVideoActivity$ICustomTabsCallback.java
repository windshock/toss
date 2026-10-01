package im.toss.ads_sdk.ui.activity;

import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$ICustomTabsCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CommonModule_setSecureScreen;
import o.SpannedDataExternalSyntheticLambda0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findRes;
import o.findResAndMsg;
import o.formatMsgs;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsShortVideoActivity$ICustomTabsCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    int label;
    final /* synthetic */ NativeAdsShortVideoActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsShortVideoActivity$ICustomTabsCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, access13800<? super NativeAdsShortVideoActivity$ICustomTabsCallback> access13800Var) {
        super(2, access13800Var);
        this.this$0 = nativeAdsShortVideoActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsShortVideoActivity$ICustomTabsCallback nativeAdsShortVideoActivity$ICustomTabsCallback = new NativeAdsShortVideoActivity$ICustomTabsCallback(this.this$0, access13800Var);
        int i3 = onExtraCallback + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return nativeAdsShortVideoActivity$ICustomTabsCallback;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 101;
        onExtraCallback = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsShortVideoActivity$ICustomTabsCallback nativeAdsShortVideoActivity$ICustomTabsCallbackCreate = create(findresandmsg, access13800Var);
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            nativeAdsShortVideoActivity$ICustomTabsCallbackCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvokeSuspend = nativeAdsShortVideoActivity$ICustomTabsCallbackCreate.invokeSuspend(unit);
        int i5 = onExtraCallbackWithResult + 123;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* renamed from: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$ICustomTabsCallback$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ NativeAdsShortVideoActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, access13800<? super AnonymousClass2> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsShortVideoActivity;
        }

        public static /* synthetic */ void onExtraCallback(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent(nativeAdsShortVideoActivity, str);
            if (i4 != 0) {
                int i5 = 80 / 0;
            }
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, access13800Var);
            anonymousClass2.L$0 = obj;
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass2;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 35;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800<? super Unit>) obj2);
            int i5 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 87 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 91;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onNavigationEvent(NativeAdsShortVideoActivity nativeAdsShortVideoActivity, String str) {
            ExoPlayer exoPlayer;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
            ExoPlayer exoPlayerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
            Player player = null;
            if (exoPlayerOnExtraCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i5 = onExtraCallbackWithResult + 85;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                exoPlayer = null;
            } else {
                exoPlayer = exoPlayerOnExtraCallback;
            }
            CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayer, nativeAdsShortVideoActivity, str, false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            Player playerOnExtraCallback = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
            if (playerOnExtraCallback == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                playerOnExtraCallback = null;
            }
            playerOnExtraCallback.prepare();
            Player playerOnExtraCallback2 = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
            if (playerOnExtraCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                playerOnExtraCallback2 = null;
            }
            playerOnExtraCallback2.setPlayWhenReady(true);
            Player playerOnExtraCallback3 = NativeAdsShortVideoActivity.onExtraCallback(nativeAdsShortVideoActivity);
            if (playerOnExtraCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                player = playerOnExtraCallback3;
            }
            player.play();
        }

        public final Object invokeSuspend(Object obj) {
            final String strOnExtraCallbackWithResult;
            int i2 = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 76 / 0;
                }
            }
            ResultKt.onNavigationEvent(obj);
            while (findRes.onWarmupCompleted(findresandmsg) && (strOnExtraCallbackWithResult = NativeAdsShortVideoActivity.onExtraCallbackWithResult(this.this$0)) != null) {
                this.this$0.onExtraCallback("Retry attempt to load video: " + strOnExtraCallbackWithResult);
                try {
                    final NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.this$0;
                    nativeAdsShortVideoActivity.runOnUiThread(new Runnable() { // from class: im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity$startRetryingLoad$1$1$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = 2 % 2;
                            int i7 = IAuthTabCallback + 49;
                            onWarmupCompleted = i7 % 128;
                            int i8 = i7 % 2;
                            NativeAdsShortVideoActivity$ICustomTabsCallback.AnonymousClass2.onExtraCallback(nativeAdsShortVideoActivity, strOnExtraCallbackWithResult);
                            int i9 = onWarmupCompleted + 59;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    });
                } catch (Throwable th) {
                    this.this$0.onExtraCallback("Retry Failed: " + th.getMessage());
                }
                long jIAuthTabCallbackDefault = NativeAdsShortVideoActivity.IAuthTabCallbackDefault(this.this$0);
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(strOnExtraCallbackWithResult);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIAuthTabCallbackDefault, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallbackWithResult + 109;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onWarmupCompleted + 5;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 18 / 0;
            }
            return unit;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        Object obj2 = null;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            NativeAdsShortVideoActivity nativeAdsShortVideoActivity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(nativeAdsShortVideoActivity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(nativeAdsShortVideoActivity, onextracallback, anonymousClass2, this) == objOnWarmupCompleted) {
                int i4 = onExtraCallback + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = onExtraCallbackWithResult + 11;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                obj2.hashCode();
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 103;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 75 / 0;
        }
        return unit;
    }
}
