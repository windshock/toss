package o;

import o.DrawerStateCompanionExternalSyntheticLambda1;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DropdownMenuPositionProviderExternalSyntheticLambda0 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final DrawerStateCompanionExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final long onWarmupCompleted;

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    public DropdownMenuPositionProviderExternalSyntheticLambda0(DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, long j) {
        this.onExtraCallbackWithResult = drawerStateCompanionExternalSyntheticLambda1;
        this.onWarmupCompleted = j;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult.IAuthTabCallbackDefault);
        DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1 = this.onExtraCallbackWithResult;
        DrawerStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallbackDefault;
        long[] jArr = onextracallbackwithresult.onExtraCallback;
        long[] jArr2 = onextracallbackwithresult.onExtraCallbackWithResult;
        int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr, drawerStateCompanionExternalSyntheticLambda1.onExtraCallback(j), true, false);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3OnExtraCallback = onExtraCallback(iOnExtraCallback == -1 ? 0L : jArr[iOnExtraCallback], iOnExtraCallback != -1 ? jArr2[iOnExtraCallback] : 0L);
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda3OnExtraCallback.onExtraCallbackWithResult == j || iOnExtraCallback == jArr.length - 1) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3OnExtraCallback);
        }
        int i2 = iOnExtraCallback + 1;
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3OnExtraCallback, onExtraCallback(jArr[i2], jArr2[i2]));
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda3 onExtraCallback(long j, long j2) {
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda3((j * 1000000) / this.onExtraCallbackWithResult.asInterface, this.onWarmupCompleted + j2);
    }
}
