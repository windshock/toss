package o;

import android.widget.Toast;
import im.toss.uikit.base.UIKitBaseActivity;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    final /* synthetic */ UIKitBaseActivity $activity;
    final /* synthetic */ String $base64String;
    final /* synthetic */ byte[] $byteArray;
    final /* synthetic */ File $destinationFile;
    final /* synthetic */ String $mimeType;
    final /* synthetic */ String $userAgent;
    int label;
    final /* synthetic */ setBackgroundAlpha this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted(File file, setBackgroundAlpha setbackgroundalpha, String str, String str2, String str3, byte[] bArr, UIKitBaseActivity uIKitBaseActivity, access13800<? super setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.$destinationFile = file;
        this.this$0 = setbackgroundalpha;
        this.$base64String = str;
        this.$mimeType = str2;
        this.$userAgent = str3;
        this.$byteArray = bArr;
        this.$activity = uIKitBaseActivity;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted setbackgroundalpha_onextracallbackwithresult_onwarmupcompleted = new setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted(this.$destinationFile, this.this$0, this.$base64String, this.$mimeType, this.$userAgent, this.$byteArray, this.$activity, access13800Var);
        int i3 = onWarmupCompleted + 17;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return setbackgroundalpha_onextracallbackwithresult_onwarmupcompleted;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
        int i5 = onWarmupCompleted + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        if (i4 != 0) {
            int i5 = 86 / 0;
        }
        return objInvokeSuspend;
    }

    /* renamed from: o.setBackgroundAlpha$onExtraCallbackWithResult$onWarmupCompleted$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ UIKitBaseActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(UIKitBaseActivity uIKitBaseActivity, access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
            this.$activity = uIKitBaseActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$activity, access13800Var);
            int i3 = IAuthTabCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass3;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            IAuthTabCallback = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return anonymousClass3Create.invokeSuspend(unit);
            }
            anonymousClass3Create.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 53;
            onNavigationEvent = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Toast.makeText(this.$activity.getApplicationContext(), "다운로드 폴더에 파일을 저장했어요.", 1).show();
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 123;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = this.label;
        try {
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.$destinationFile);
                try {
                    fileOutputStream.write(this.$byteArray);
                    fileOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$activity, null);
                    this.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass3, this) == objOnWarmupCompleted) {
                        int i6 = onNavigationEvent + 61;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        return objOnWarmupCompleted;
                    }
                } finally {
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
        } catch (Throwable th) {
            setBackgroundAlpha.onNavigationEvent(this.this$0, this.$base64String, this.$mimeType, this.$userAgent, th);
        }
        return Unit.INSTANCE;
    }
}
