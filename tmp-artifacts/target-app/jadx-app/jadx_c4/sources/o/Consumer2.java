package o;

import android.content.Context;
import android.content.Intent;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.TimeoutCompanionNONE1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class Consumer2 implements onDeviceStateChanged {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @Inject
    public Consumer2() {
    }

    @Override // o.onDeviceStateChanged
    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = getIssuer.IAuthTabCallback.onNavigationEvent();
        int i4 = onNavigationEvent + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.onDeviceStateChanged
    public boolean IAuthTabCallback(@NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
            return getIssuer.IAuthTabCallback.onExtraCallback(rememberLottieCompositionKtlottieComposition1);
        }
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        getIssuer.IAuthTabCallback.onExtraCallback(rememberLottieCompositionKtlottieComposition1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.onDeviceStateChanged
    public boolean onWarmupCompleted(@Nullable Intent intent) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = getIssuer.IAuthTabCallback.onExtraCallbackWithResult(intent);
        int i4 = onWarmupCompleted + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.onDeviceStateChanged
    public boolean onExtraCallbackWithResult(@Nullable Intent[] intentArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = getIssuer.IAuthTabCallback.onNavigationEvent(intentArr);
        int i4 = onWarmupCompleted + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    @Override // o.onDeviceStateChanged
    public wasLastName onWarmupCompleted(@NotNull Context context, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable Intent intent) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        Object[] objArr = {getIssuer.IAuthTabCallback, context, rememberLottieCompositionKtlottieComposition1, intent};
        int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        wasLastName waslastname = (wasLastName) getIssuer.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr, 1466415498, -1466415494, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        int i4 = onNavigationEvent + 57;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return waslastname;
    }

    @Override // o.onDeviceStateChanged
    public wasLastName onExtraCallbackWithResult(@NotNull Context context, @NotNull RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1, @Nullable Intent[] intentArr) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
            return getIssuer.IAuthTabCallback.onExtraCallbackWithResult(context, rememberLottieCompositionKtlottieComposition1, intentArr);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(rememberLottieCompositionKtlottieComposition1, "");
        wasLastName waslastnameOnExtraCallbackWithResult = getIssuer.IAuthTabCallback.onExtraCallbackWithResult(context, rememberLottieCompositionKtlottieComposition1, intentArr);
        int i3 = 17 / 0;
        return waslastnameOnExtraCallbackWithResult;
    }

    @Override // o.onDeviceStateChanged
    public Intent[] IAuthTabCallback(@Nullable Intent[] intentArr) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {getIssuer.IAuthTabCallback, intentArr};
            int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
            throw null;
        }
        Object[] objArr2 = {getIssuer.IAuthTabCallback, intentArr};
        int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
        Intent[] intentArr2 = (Intent[]) getIssuer.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), objArr2, -1251972212, 1251972217, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted());
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return intentArr2;
    }
}
