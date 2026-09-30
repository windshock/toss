package im.toss.ads_sdk.ui.v2.activity;

import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$writeTypedObject;
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
final class NativeAdsShortVideoV2Activity$writeTypedObject extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    int label;
    final /* synthetic */ NativeAdsShortVideoV2Activity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsShortVideoV2Activity$writeTypedObject(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, access13800<? super NativeAdsShortVideoV2Activity$writeTypedObject> access13800Var) {
        super(2, access13800Var);
        this.this$0 = nativeAdsShortVideoV2Activity;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsShortVideoV2Activity$writeTypedObject nativeAdsShortVideoV2Activity$writeTypedObject = new NativeAdsShortVideoV2Activity$writeTypedObject(this.this$0, access13800Var);
        int i3 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return nativeAdsShortVideoV2Activity$writeTypedObject;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i5 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return objIAuthTabCallback;
        }
        throw null;
    }

    /* renamed from: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$writeTypedObject$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ NativeAdsShortVideoV2Activity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
            this.this$0 = nativeAdsShortVideoV2Activity;
        }

        public static /* synthetic */ void IAuthTabCallback(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted(nativeAdsShortVideoV2Activity, str);
            int i5 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
            if (i4 != 0) {
                objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
                int i5 = 1 / 0;
            } else {
                objInvokeSuspend = anonymousClass3Create.invokeSuspend(Unit.INSTANCE);
            }
            int i6 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, access13800Var);
            anonymousClass3.L$0 = obj;
            int i3 = onExtraCallbackWithResult + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 != 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        private static final void onWarmupCompleted(NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity, String str) {
            ExoPlayer exoPlayer;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 113;
            IAuthTabCallback = i3 % 128;
            Player player = null;
            if (i3 % 2 != 0) {
                CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                player.hashCode();
                throw null;
            }
            CommonModule_setSecureScreen commonModule_setSecureScreen2 = CommonModule_setSecureScreen.onWarmupCompleted;
            ExoPlayer exoPlayer2 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (exoPlayer2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                exoPlayer = null;
            } else {
                exoPlayer = exoPlayer2;
            }
            CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen2, exoPlayer, nativeAdsShortVideoV2Activity, str, false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            Player player2 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (player2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                player2 = null;
            }
            player2.prepare();
            Player player3 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (player3 == null) {
                int i4 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = onExtraCallbackWithResult + 103;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                player3 = null;
            }
            player3.setPlayWhenReady(true);
            Player player4 = (ExoPlayer) NativeAdsShortVideoV2Activity.onExtraCallbackWithResult(C40Encoder.onExtraCallback(), -79730242, new Object[]{nativeAdsShortVideoV2Activity}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), 79730255, C40Encoder.onExtraCallback());
            if (player4 == null) {
                int i8 = onExtraCallbackWithResult + 55;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i9 != 0) {
                    throw null;
                }
            } else {
                player = player4;
            }
            player.play();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1 r3 r4
          0x002c: PHI (r1v6 o.findResAndMsg) = (r1v5 o.findResAndMsg), (r1v12 o.findResAndMsg) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x002c: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v3 java.lang.Object) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
          0x002c: PHI (r4v1 int) = (r4v0 int), (r4v12 int) binds: [B:8:0x002a, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg;
            Object objOnWarmupCompleted;
            int i2;
            int i3 = 2 % 2;
            int i4 = onExtraCallbackWithResult + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i2 = this.label;
                int i5 = 52 / 0;
                if (i2 != 0) {
                    int i6 = onExtraCallbackWithResult + 117;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            } else {
                findresandmsg = (findResAndMsg) this.L$0;
                objOnWarmupCompleted = access14300.onWarmupCompleted();
                i2 = this.label;
                if (i2 != 0) {
                }
            }
            ResultKt.onNavigationEvent(obj);
            while (findRes.onWarmupCompleted(findresandmsg)) {
                int i8 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    NativeAdsShortVideoV2Activity.onNavigationEvent(this.this$0);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                final String strOnNavigationEvent = NativeAdsShortVideoV2Activity.onNavigationEvent(this.this$0);
                if (strOnNavigationEvent == null) {
                    break;
                }
                this.this$0.onExtraCallback("Retry attempt to load video: " + strOnNavigationEvent);
                try {
                    final NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = this.this$0;
                    nativeAdsShortVideoV2Activity.runOnUiThread(new Runnable() { // from class: im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity$startRetryingLoad$1$1$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i9 = 2 % 2;
                            int i10 = IAuthTabCallback + 77;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            NativeAdsShortVideoV2Activity$writeTypedObject.AnonymousClass3.IAuthTabCallback(nativeAdsShortVideoV2Activity, strOnNavigationEvent);
                            int i12 = onExtraCallback + 83;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 != 0) {
                                throw null;
                            }
                        }
                    });
                } catch (Throwable th) {
                    this.this$0.onExtraCallback("Retry Failed: " + th.getMessage());
                }
                long jIAuthTabCallbackStub = NativeAdsShortVideoV2Activity.IAuthTabCallbackStub(this.this$0);
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(strOnNavigationEvent);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(jIAuthTabCallbackStub, this) == objOnWarmupCompleted) {
                    int i9 = IAuthTabCallback;
                    int i10 = i9 + 13;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = i9 + 123;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            NativeAdsShortVideoV2Activity nativeAdsShortVideoV2Activity = this.this$0;
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(nativeAdsShortVideoV2Activity, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.onExtraCallback(nativeAdsShortVideoV2Activity, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                int i5 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 0;
                }
                return objOnWarmupCompleted;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
