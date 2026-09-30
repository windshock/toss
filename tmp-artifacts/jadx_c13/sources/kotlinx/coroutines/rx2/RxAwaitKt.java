package kotlinx.coroutines.rx2;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.JsonReaderDoublePrecision;
import o.JsonReaderErrorInfo;
import o.access13800;
import o.access14100;
import o.access14200;
import o.access14600;
import o.deserializeIp;
import o.deserializeIpNullableCollection;
import o.deserializeUriNullableCollection;
import o.ensureCapacity;
import o.jni_YGConfigSetExperimentalFeatureEnabledJNI;
import o.maybeRemoveAttachStateListener;
import o.serializeRaw;
import o.setResourceInternal;
import o.writeAscii;
import o.writeQuoted;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxAwaitKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onNavigationEvent(@NotNull writeAscii<T> writeascii, @NotNull access13800<? super T> access13800Var) {
        RxAwaitKt$awaitSingle$1 rxAwaitKt$awaitSingle$1;
        if (access13800Var instanceof RxAwaitKt$awaitSingle$1) {
            rxAwaitKt$awaitSingle$1 = (RxAwaitKt$awaitSingle$1) access13800Var;
            int i = rxAwaitKt$awaitSingle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxAwaitKt$awaitSingle$1.label = i - 2147483648;
            } else {
                rxAwaitKt$awaitSingle$1 = new RxAwaitKt$awaitSingle$1(access13800Var);
            }
        }
        Object objOnWarmupCompleted = rxAwaitKt$awaitSingle$1.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = rxAwaitKt$awaitSingle$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            rxAwaitKt$awaitSingle$1.label = 1;
            objOnWarmupCompleted = onWarmupCompleted(writeascii, rxAwaitKt$awaitSingle$1);
            if (objOnWarmupCompleted == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        }
        if (objOnWarmupCompleted != null) {
            return objOnWarmupCompleted;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object onExtraCallback(writeAscii writeascii, Object obj, access13800 access13800Var) {
        RxAwaitKt$awaitOrDefault$1 rxAwaitKt$awaitOrDefault$1;
        if (access13800Var instanceof RxAwaitKt$awaitOrDefault$1) {
            rxAwaitKt$awaitOrDefault$1 = (RxAwaitKt$awaitOrDefault$1) access13800Var;
            int i = rxAwaitKt$awaitOrDefault$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxAwaitKt$awaitOrDefault$1.label = i - 2147483648;
            } else {
                rxAwaitKt$awaitOrDefault$1 = new RxAwaitKt$awaitOrDefault$1(access13800Var);
            }
        }
        Object objOnWarmupCompleted = rxAwaitKt$awaitOrDefault$1.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = rxAwaitKt$awaitOrDefault$1.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            rxAwaitKt$awaitOrDefault$1.L$0 = obj;
            rxAwaitKt$awaitOrDefault$1.label = 1;
            objOnWarmupCompleted = onWarmupCompleted(writeascii, rxAwaitKt$awaitOrDefault$1);
            if (objOnWarmupCompleted == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = rxAwaitKt$awaitOrDefault$1.L$0;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        }
        return objOnWarmupCompleted == null ? obj : objOnWarmupCompleted;
    }

    public static final <T> Object onExtraCallback(@NotNull serializeRaw<T> serializeraw, @NotNull access13800<? super T> access13800Var) {
        return onExtraCallbackWithResult(serializeraw, jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST, null, access13800Var, 2, null);
    }

    public static final <T> Object onWarmupCompleted(@NotNull serializeRaw<T> serializeraw, @NotNull access13800<? super T> access13800Var) {
        return onExtraCallbackWithResult(serializeraw, jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST_OR_DEFAULT, null, access13800Var, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object IAuthTabCallback(@NotNull serializeRaw<T> serializeraw, @NotNull Function0<? extends T> function0, @NotNull access13800<? super T> access13800Var) {
        RxAwaitKt$awaitFirstOrElse$1 rxAwaitKt$awaitFirstOrElse$1;
        if (access13800Var instanceof RxAwaitKt$awaitFirstOrElse$1) {
            rxAwaitKt$awaitFirstOrElse$1 = (RxAwaitKt$awaitFirstOrElse$1) access13800Var;
            int i = rxAwaitKt$awaitFirstOrElse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxAwaitKt$awaitFirstOrElse$1.label = i - 2147483648;
            } else {
                rxAwaitKt$awaitFirstOrElse$1 = new RxAwaitKt$awaitFirstOrElse$1(access13800Var);
            }
        }
        RxAwaitKt$awaitFirstOrElse$1 rxAwaitKt$awaitFirstOrElse$12 = rxAwaitKt$awaitFirstOrElse$1;
        Object objOnExtraCallbackWithResult = rxAwaitKt$awaitFirstOrElse$12.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = rxAwaitKt$awaitFirstOrElse$12.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
            jni_YGConfigSetExperimentalFeatureEnabledJNI jni_ygconfigsetexperimentalfeatureenabledjni = jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST_OR_DEFAULT;
            rxAwaitKt$awaitFirstOrElse$12.L$0 = function0;
            rxAwaitKt$awaitFirstOrElse$12.label = 1;
            objOnExtraCallbackWithResult = onExtraCallbackWithResult(serializeraw, jni_ygconfigsetexperimentalfeatureenabledjni, null, rxAwaitKt$awaitFirstOrElse$12, 2, null);
            if (objOnExtraCallbackWithResult == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (Function0) rxAwaitKt$awaitFirstOrElse$12.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallbackWithResult);
        }
        return objOnExtraCallbackWithResult == null ? function0.invoke() : objOnExtraCallbackWithResult;
    }

    public static final <T> Object onNavigationEvent(@NotNull serializeRaw<T> serializeraw, @NotNull access13800<? super T> access13800Var) {
        return onExtraCallbackWithResult(serializeraw, jni_YGConfigSetExperimentalFeatureEnabledJNI.SINGLE, null, access13800Var, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection, Throwable th) {
        deserializeurinullablecollection.dispose();
        return Unit.INSTANCE;
    }

    public static final void onWarmupCompleted(@NotNull maybeRemoveAttachStateListener<?> mayberemoveattachstatelistener, @NotNull final deserializeUriNullableCollection deserializeurinullablecollection) {
        mayberemoveattachstatelistener.IAuthTabCallback(new Function1() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RxAwaitKt.onNavigationEvent(deserializeurinullablecollection, (Throwable) obj);
            }
        });
    }

    static /* synthetic */ Object onExtraCallbackWithResult(serializeRaw serializeraw, jni_YGConfigSetExperimentalFeatureEnabledJNI jni_ygconfigsetexperimentalfeatureenabledjni, Object obj, access13800 access13800Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return onNavigationEvent(serializeraw, jni_ygconfigsetexperimentalfeatureenabledjni, obj, access13800Var);
    }

    public static final Object onWarmupCompleted(@NotNull JsonReaderErrorInfo jsonReaderErrorInfo, @NotNull access13800<? super Unit> access13800Var) {
        final setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        jsonReaderErrorInfo.onExtraCallbackWithResult(new JsonReaderDoublePrecision() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$2$1
            @Override // o.JsonReaderDoublePrecision
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                RxAwaitKt.onWarmupCompleted(setresourceinternal, deserializeurinullablecollection);
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallback() {
                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }

            @Override // o.JsonReaderDoublePrecision
            public void onExtraCallbackWithResult(Throwable th) {
                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault == access14100.onExtraCallback() ? objIAuthTabCallbackDefault : Unit.INSTANCE;
    }

    public static final <T> Object onWarmupCompleted(@NotNull writeAscii<T> writeascii, @NotNull access13800<? super T> access13800Var) {
        final setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        writeascii.onExtraCallback(new ensureCapacity<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitSingleOrNull$2$1
            @Override // o.ensureCapacity
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                RxAwaitKt.onWarmupCompleted((maybeRemoveAttachStateListener<?>) setresourceinternal, deserializeurinullablecollection);
            }

            @Override // o.ensureCapacity
            public void onExtraCallback() {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(null));
            }

            @Override // o.ensureCapacity
            public void onNavigationEvent(T t) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(t));
            }

            @Override // o.ensureCapacity
            public void onExtraCallbackWithResult(Throwable th) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    public static final <T> Object onWarmupCompleted(@NotNull deserializeIp<T> deserializeip, @NotNull access13800<? super T> access13800Var) {
        final setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        deserializeip.IAuthTabCallback(new deserializeIpNullableCollection<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$5$1
            @Override // o.deserializeIpNullableCollection
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                RxAwaitKt.onWarmupCompleted((maybeRemoveAttachStateListener<?>) setresourceinternal, deserializeurinullablecollection);
            }

            @Override // o.deserializeIpNullableCollection
            public void onNavigationEvent(T t) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(t));
            }

            @Override // o.deserializeIpNullableCollection
            public void onExtraCallbackWithResult(Throwable th) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }

    private static final <T> Object onNavigationEvent(serializeRaw<T> serializeraw, final jni_YGConfigSetExperimentalFeatureEnabledJNI jni_ygconfigsetexperimentalfeatureenabledjni, final T t, access13800<? super T> access13800Var) {
        final setResourceInternal setresourceinternal = new setResourceInternal(access14200.onExtraCallbackWithResult(access13800Var), 1);
        setresourceinternal.onTransact();
        serializeraw.subscribe(new writeQuoted<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1
            private boolean IAuthTabCallback;
            private T asBinder;
            private deserializeUriNullableCollection onExtraCallback;

            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] onWarmupCompleted;

                static {
                    int[] iArr = new int[jni_YGConfigSetExperimentalFeatureEnabledJNI.values().length];
                    try {
                        iArr[jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST_OR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[jni_YGConfigSetExperimentalFeatureEnabledJNI.LAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[jni_YGConfigSetExperimentalFeatureEnabledJNI.SINGLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    onWarmupCompleted = iArr;
                }
            }

            @Override // o.writeQuoted
            public void IAuthTabCallback(final deserializeUriNullableCollection deserializeurinullablecollection) {
                this.onExtraCallback = deserializeurinullablecollection;
                setresourceinternal.IAuthTabCallback(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Throwable th) {
                        onNavigationEvent(th);
                        return Unit.INSTANCE;
                    }

                    public final void onNavigationEvent(Throwable th) {
                        deserializeurinullablecollection.dispose();
                    }
                });
            }

            @Override // o.writeQuoted
            public void onExtraCallback(T t2) {
                int i = WhenMappings.onWarmupCompleted[jni_ygconfigsetexperimentalfeatureenabledjni.ordinal()];
                deserializeUriNullableCollection deserializeurinullablecollection = null;
                if (i == 1 || i == 2) {
                    if (this.IAuthTabCallback) {
                        return;
                    }
                    this.IAuthTabCallback = true;
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                    Result.Companion companion = Result.Companion;
                    mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(t2));
                    deserializeUriNullableCollection deserializeurinullablecollection2 = this.onExtraCallback;
                    if (deserializeurinullablecollection2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        deserializeurinullablecollection = deserializeurinullablecollection2;
                    }
                    deserializeurinullablecollection.dispose();
                    return;
                }
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (jni_ygconfigsetexperimentalfeatureenabledjni == jni_YGConfigSetExperimentalFeatureEnabledJNI.SINGLE && this.IAuthTabCallback) {
                    if (setresourceinternal.onNavigationEvent()) {
                        maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener2 = setresourceinternal;
                        Result.Companion companion2 = Result.Companion;
                        mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new IllegalArgumentException("More than one onNext value for " + jni_ygconfigsetexperimentalfeatureenabledjni))));
                    }
                    deserializeUriNullableCollection deserializeurinullablecollection3 = this.onExtraCallback;
                    if (deserializeurinullablecollection3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        deserializeurinullablecollection = deserializeurinullablecollection3;
                    }
                    deserializeurinullablecollection.dispose();
                    return;
                }
                this.asBinder = t2;
                this.IAuthTabCallback = true;
            }

            @Override // o.writeQuoted
            public void onExtraCallback() {
                if (this.IAuthTabCallback) {
                    if (setresourceinternal.onNavigationEvent()) {
                        maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                        Result.Companion companion = Result.Companion;
                        mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(this.asBinder));
                        return;
                    }
                    return;
                }
                if (jni_ygconfigsetexperimentalfeatureenabledjni == jni_YGConfigSetExperimentalFeatureEnabledJNI.FIRST_OR_DEFAULT) {
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener2 = setresourceinternal;
                    Result.Companion companion2 = Result.Companion;
                    mayberemoveattachstatelistener2.resumeWith(Result.m31constructorimpl(t));
                } else if (setresourceinternal.onNavigationEvent()) {
                    maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener3 = setresourceinternal;
                    Result.Companion companion3 = Result.Companion;
                    mayberemoveattachstatelistener3.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(new NoSuchElementException("No value received via onNext for " + jni_ygconfigsetexperimentalfeatureenabledjni))));
                }
            }

            @Override // o.writeQuoted
            public void onExtraCallbackWithResult(Throwable th) {
                maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = setresourceinternal;
                Result.Companion companion = Result.Companion;
                mayberemoveattachstatelistener.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallbackDefault;
    }
}
