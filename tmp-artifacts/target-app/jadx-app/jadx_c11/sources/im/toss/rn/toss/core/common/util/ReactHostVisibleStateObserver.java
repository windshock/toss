package im.toss.rn.toss.core.common.util;

import androidx.lifecycle.LifecycleEventObserver;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.NetConverter3;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.deserializeLongCollection;
import o.getByteBuffer;
import o.setTid;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactHostVisibleStateObserver {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final setTid<Boolean> IAuthTabCallback;
    private final TextFieldScrollKtExternalSyntheticLambda0 onNavigationEvent;

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(function1, obj);
        int i4 = onExtraCallback + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(ReactHostVisibleStateObserver reactHostVisibleStateObserver, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(reactHostVisibleStateObserver, bool);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public ReactHostVisibleStateObserver(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        this.onNavigationEvent = textFieldScrollKtExternalSyntheticLambda0;
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        this.IAuthTabCallback = settidOnNavigationEvent;
    }

    public static final /* synthetic */ setTid onWarmupCompleted(ReactHostVisibleStateObserver reactHostVisibleStateObserver) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setTid<Boolean> settid = reactHostVisibleStateObserver.IAuthTabCallback;
        if (i3 != 0) {
            return settid;
        }
        throw null;
    }

    private static final boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = onExtraCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(ReactHostVisibleStateObserver reactHostVisibleStateObserver, Boolean bool) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        if (reactHostVisibleStateObserver.onNavigationEvent.getLifecycle().IAuthTabCallback() == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.DESTROYED) {
            return false;
        }
        int i4 = onExtraCallback + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final getByteBuffer<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        getByteBuffer getbytebufferOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(300L, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback());
        final Function1 function1 = new Function1() { // from class: im.toss.rn.toss.core.common.util.ReactHostVisibleStateObserver$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 29;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Boolean.valueOf(ReactHostVisibleStateObserver.onWarmupCompleted(this.f$0, (Boolean) obj));
                    throw null;
                }
                Boolean boolValueOf = Boolean.valueOf(ReactHostVisibleStateObserver.onWarmupCompleted(this.f$0, (Boolean) obj));
                int i4 = onNavigationEvent + 69;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return boolValueOf;
            }
        };
        getByteBuffer<Boolean> getbytebufferAsBinder = getbytebufferOnExtraCallbackWithResult.onTransact(new deserializeLongCollection() { // from class: im.toss.rn.toss.core.common.util.ReactHostVisibleStateObserver$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 81;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnNavigationEvent = ReactHostVisibleStateObserver.onNavigationEvent(function1, obj);
                int i5 = onWarmupCompleted + 13;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return zOnNavigationEvent;
            }
        }).asBinder();
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder, "");
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return getbytebufferAsBinder;
    }

    public final void IAuthTabCallback(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(new LifecycleEventObserver() { // from class: im.toss.rn.toss.core.common.util.ReactHostVisibleStateObserver$observe$1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                int i3 = WhenMappings.IAuthTabCallback[onextracallbackwithresult.ordinal()];
                if (i3 == 1) {
                    Object objOnWarmupCompleted = ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onWarmupCompleted();
                    Boolean bool = Boolean.TRUE;
                    if (!Intrinsics.areEqual(objOnWarmupCompleted, bool)) {
                        int i4 = IAuthTabCallback + 11;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onExtraCallback(bool);
                            int i5 = 15 / 0;
                        } else {
                            ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onExtraCallback(bool);
                        }
                    }
                } else if (i3 == 2) {
                    int i6 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i6 % 128;
                    Object obj = null;
                    if (i6 % 2 == 0) {
                        Intrinsics.areEqual(ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onWarmupCompleted(), Boolean.TRUE);
                        throw null;
                    }
                    if (Intrinsics.areEqual(ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onWarmupCompleted(), Boolean.TRUE)) {
                        int i7 = onExtraCallbackWithResult + 81;
                        IAuthTabCallback = i7 % 128;
                        if (i7 % 2 != 0) {
                            ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onExtraCallback(Boolean.FALSE);
                            return;
                        } else {
                            ReactHostVisibleStateObserver.onWarmupCompleted(this.onExtraCallback).onExtraCallback(Boolean.FALSE);
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                int i8 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }
        });
        int i2 = onExtraCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }
}
