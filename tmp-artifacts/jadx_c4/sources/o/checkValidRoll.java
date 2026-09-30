package o;

import android.os.SystemClock;
import im.toss.core.tuba.Trigger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.checkValidRoll;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkValidRoll implements ALCFaceSDKExternalSyntheticLambda1 {
    private static int asBinder = 1;
    private static int asInterface;
    private final onAssetDownloadCompleted IAuthTabCallback;
    private final ArrayDeque<extractAntispoofingFaceQuality> IAuthTabCallbackDefault;
    private final ALCFaceSDK1 IAuthTabCallbackStub;
    private final AppSetIdAndScope1 onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final Object onTransact;
    private final ALCFaceSDKExternalSyntheticLambda3 onWarmupCompleted;

    public static /* synthetic */ findResAndMsg onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgIAuthTabCallback = IAuthTabCallback();
        int i4 = asInterface + 115;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return findresandmsgIAuthTabCallback;
    }

    public checkValidRoll(@NotNull onAssetDownloadCompleted onassetdownloadcompleted, @NotNull ALCFaceSDKExternalSyntheticLambda3 aLCFaceSDKExternalSyntheticLambda3, @NotNull ALCFaceSDK1 aLCFaceSDK1, @NotNull AppSetIdAndScope1 appSetIdAndScope1, @NotNull String str) {
        Intrinsics.checkNotNullParameter(onassetdownloadcompleted, "");
        Intrinsics.checkNotNullParameter(aLCFaceSDKExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(aLCFaceSDK1, "");
        Intrinsics.checkNotNullParameter(appSetIdAndScope1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = onassetdownloadcompleted;
        this.onWarmupCompleted = aLCFaceSDKExternalSyntheticLambda3;
        this.IAuthTabCallbackStub = aLCFaceSDK1;
        this.onExtraCallback = appSetIdAndScope1;
        this.onNavigationEvent = str;
        this.onTransact = new Object();
        this.IAuthTabCallbackDefault = new ArrayDeque<>();
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tuba.DefaultTubaTriggerHandler$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 89;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    checkValidRoll.onWarmupCompleted();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                findResAndMsg findresandmsgOnWarmupCompleted = checkValidRoll.onWarmupCompleted();
                int i3 = IAuthTabCallback + 83;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 0;
                }
                return findresandmsgOnWarmupCompleted;
            }
        });
    }

    public static final /* synthetic */ String IAuthTabCallback(checkValidRoll checkvalidroll) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str = checkvalidroll.onNavigationEvent;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ onAssetDownloadCompleted onExtraCallback(checkValidRoll checkvalidroll) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 47;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onAssetDownloadCompleted onassetdownloadcompleted = checkvalidroll.IAuthTabCallback;
        if (i4 == 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 33;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return onassetdownloadcompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallbackWithResult(checkValidRoll checkvalidroll) {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = checkvalidroll.onExtraCallback;
        if (i3 == 0) {
            return appSetIdAndScope1;
        }
        throw null;
    }

    private static final findResAndMsg IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.onExtraCallback().onExtraCallback()));
        int i4 = asBinder + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return findresandmsgOnWarmupCompleted;
    }

    private final findResAndMsg onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.onExtraCallbackWithResult.getValue();
        int i4 = asInterface + 7;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return findresandmsg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ALCFaceSDKExternalSyntheticLambda1
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<Trigger> listOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
        if (listOnExtraCallback == null) {
            return false;
        }
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallback.isEmpty() ^ true;
    }

    @Override // o.ALCFaceSDKExternalSyntheticLambda1
    public void IAuthTabCallback(@NotNull List<Trigger> list) {
        Intrinsics.checkNotNullParameter(list, "");
        synchronized (this.onTransact) {
            this.IAuthTabCallbackStub.onNavigationEvent(list);
            onTransact();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.ALCFaceSDKExternalSyntheticLambda1
    public void onExtraCallback() {
        synchronized (this.onTransact) {
            this.IAuthTabCallbackStub.onNavigationEvent();
            this.IAuthTabCallbackDefault.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // o.ALCFaceSDKExternalSyntheticLambda1
    public void IAuthTabCallback(boolean z) {
        synchronized (this.onTransact) {
            this.IAuthTabCallbackStub.onNavigationEvent();
            this.IAuthTabCallbackDefault.clear();
            Unit unit = Unit.INSTANCE;
        }
        this.onWarmupCompleted.onNavigationEvent(z);
    }

    private final void onTransact() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault.isEmpty()) {
            return;
        }
        List<Trigger> listOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
        if (listOnExtraCallback != null) {
            int i2 = asBinder + 5;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                listOnExtraCallback.isEmpty();
                throw null;
            }
            if (!listOnExtraCallback.isEmpty()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ArrayDeque<extractAntispoofingFaceQuality> arrayDeque = this.IAuthTabCallbackDefault;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = arrayDeque.iterator();
                while (!(!it.hasNext())) {
                    Object next = it.next();
                    if (jElapsedRealtime - ((extractAntispoofingFaceQuality) next).onNavigationEvent() <= 15000) {
                        arrayList.add(next);
                    }
                }
                arrayList.size();
                this.IAuthTabCallbackDefault.size();
                arrayList.size();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i3 = asInterface + 113;
                    asBinder = i3 % 128;
                    int i4 = i3 % 2;
                    onExtraCallbackWithResult(((extractAntispoofingFaceQuality) it2.next()).onWarmupCompleted());
                }
            }
        }
        this.IAuthTabCallbackDefault.clear();
    }

    @Override // o.ALCFaceSDKExternalSyntheticLambda1
    public boolean onExtraCallbackWithResult(@NotNull downloadZip downloadzip) {
        Intrinsics.checkNotNullParameter(downloadzip, "");
        synchronized (this.onTransact) {
            List<Trigger> listOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback();
            if (listOnExtraCallback == null) {
                extractAgeGender.onExtraCallback(this.IAuthTabCallbackDefault, new extractAntispoofingFaceQuality(downloadzip, 0L, 2, null), 500);
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOnExtraCallback) {
                if (((Trigger) obj).onExtraCallback(downloadzip)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult((Trigger) it.next());
            }
            return !arrayList.isEmpty();
        }
    }

    private final void onExtraCallbackWithResult(Trigger trigger) {
        int i = 2 % 2;
        int i2 = asInterface + 33;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.onExtraCallbackWithResult(trigger);
            obj.hashCode();
            throw null;
        }
        if (this.onWarmupCompleted.onExtraCallbackWithResult(trigger)) {
            maybeUpdateAnimatable.onNavigationEvent(onNavigationEvent(), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(trigger, null), 3, (Object) null);
            int i3 = asBinder + 41;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Trigger $trigger;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Trigger trigger, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$trigger = trigger;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = checkValidRoll.this.new onExtraCallbackWithResult(this.$trigger, access13800Var);
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            IAuthTabCallback = i2 % 128;
            Object obj3 = null;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 95;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 29;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    onAssetDownloadCompleted onassetdownloadcompletedOnExtraCallback = checkValidRoll.onExtraCallback(checkValidRoll.this);
                    Trigger trigger = this.$trigger;
                    String strIAuthTabCallback = checkValidRoll.IAuthTabCallback(checkValidRoll.this);
                    this.label = 1;
                    if (onassetdownloadcompletedOnExtraCallback.onExtraCallbackWithResult(trigger, strIAuthTabCallback, this) == objOnWarmupCompleted) {
                        int i5 = onWarmupCompleted + 73;
                        int i6 = i5 % 128;
                        IAuthTabCallback = i6;
                        int i7 = i5 % 2;
                        int i8 = i6 + 31;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
            } catch (Exception unused) {
                checkValidRoll.onExtraCallbackWithResult(checkValidRoll.this);
            }
            return Unit.INSTANCE;
        }
    }
}
