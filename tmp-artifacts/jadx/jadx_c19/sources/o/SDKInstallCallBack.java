package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.SDKInstallCallBack;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SDKInstallCallBack implements TextFieldScrollKtExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final TextFieldSizeKtExternalSyntheticLambda2 onExtraCallback;
    private final TextFieldKeyInputExternalSyntheticLambda9 onExtraCallbackWithResult;
    private final setRubIn<Boolean> onNavigationEvent;

    public SDKInstallCallBack(@NotNull TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, @NotNull setRubIn<Boolean> setrubin, @NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(textFieldKeyInputExternalSyntheticLambda9, "");
        Intrinsics.checkNotNullParameter(setrubin, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onExtraCallbackWithResult = textFieldKeyInputExternalSyntheticLambda9;
        this.onNavigationEvent = setrubin;
        this.onExtraCallback = new TextFieldSizeKtExternalSyntheticLambda2(this);
        textFieldKeyInputExternalSyntheticLambda9.IAuthTabCallback(new DefaultLifecycleObserver() { // from class: im.toss.core.utils.FragmentVisibilityLifecycleOwner$1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 123;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                int i5 = onExtraCallback + 15;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                int i4 = onNavigationEvent + 115;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 1;
                onExtraCallback = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                int i4 = onExtraCallback + 69;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 121;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                    int i4 = 55 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                }
                int i5 = onExtraCallback + 59;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 93;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                    SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                SDKInstallCallBack.IAuthTabCallback(this.IAuthTabCallback);
                int i5 = onNavigationEvent + 23;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 84 / 0;
                }
            }
        });
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(null), 3, (Object) null);
    }

    public static final /* synthetic */ void IAuthTabCallback(SDKInstallCallBack sDKInstallCallBack) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        sDKInstallCallBack.onExtraCallback();
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IAuthTabCallback + 59;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ setRubIn onExtraCallbackWithResult(SDKInstallCallBack sDKInstallCallBack) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Boolean> setrubin = sDKInstallCallBack.onNavigationEvent;
        if (i4 != 0) {
            return setrubin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TextFieldKeyInputExternalSyntheticLambda9 getLifecycle() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        TextFieldSizeKtExternalSyntheticLambda2 textFieldSizeKtExternalSyntheticLambda2 = this.onExtraCallback;
        int i6 = i3 + 83;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return textFieldSizeKtExternalSyntheticLambda2;
    }

    /* renamed from: o.SDKInstallCallBack$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int label;

        AnonymousClass4(access13800<? super AnonymousClass4> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            AnonymousClass4 anonymousClass4 = SDKInstallCallBack.this.new AnonymousClass4(access13800Var);
            int i3 = onExtraCallback + 67;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return anonymousClass4;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws setWrite {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i5 = onExtraCallback + 51;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws setWrite {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 9;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = onExtraCallback + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public final Object invokeSuspend(Object obj) throws setWrite {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 97;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.onNavigationEvent(obj);
                setRubIn setrubinOnExtraCallbackWithResult = SDKInstallCallBack.onExtraCallbackWithResult(SDKInstallCallBack.this);
                final SDKInstallCallBack sDKInstallCallBack = SDKInstallCallBack.this;
                setRipple setripple = new setRipple() { // from class: o.SDKInstallCallBack.4.5
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 49;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        Object obj3 = null;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        if (i8 != 0) {
                            onWarmupCompleted(zBooleanValue, access13800Var);
                            obj3.hashCode();
                            throw null;
                        }
                        Object objOnWarmupCompleted2 = onWarmupCompleted(zBooleanValue, access13800Var);
                        int i9 = IAuthTabCallback + 63;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            return objOnWarmupCompleted2;
                        }
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object onWarmupCompleted(boolean z, access13800<? super Unit> access13800Var) {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        SDKInstallCallBack.IAuthTabCallback(sDKInstallCallBack);
                        Unit unit = Unit.INSTANCE;
                        if (i8 == 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                this.label = 1;
                if (setrubinOnExtraCallbackWithResult.collect(setripple, this) == objOnWarmupCompleted) {
                    int i6 = onExtraCallback + 47;
                    int i7 = i6 % 128;
                    IAuthTabCallback = i7;
                    if (i6 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i8 = i7 + 79;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            throw new setWrite();
        }
    }

    private final void onExtraCallback() {
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback;
        int i2 = 2 % 2;
        if (this.onExtraCallback.IAuthTabCallback() == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            int i3 = onWarmupCompleted + 107;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
                return;
            }
            return;
        }
        TextFieldSizeKtExternalSyntheticLambda2 textFieldSizeKtExternalSyntheticLambda2 = this.onExtraCallback;
        if (!(!((Boolean) this.onNavigationEvent.IAuthTabCallback()).booleanValue())) {
            TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallbackIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback();
            int i5 = IAuthTabCallback + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            onextracallback = onextracallbackIAuthTabCallback;
        } else {
            onextracallback = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback) getCodeNameBytes.onNavigationEvent(this.onExtraCallbackWithResult.IAuthTabCallback(), TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.CREATED);
        }
        textFieldSizeKtExternalSyntheticLambda2.onWarmupCompleted(onextracallback);
    }
}
