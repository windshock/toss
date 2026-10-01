package o;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.getStarImageView;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setTileModeX<S extends getStarImageView<?>> {
    private S[] IAuthTabCallback;
    private ltycx onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;

    protected abstract S asBinder();

    protected abstract S[] onExtraCallback(int i);

    public final S[] IAuthTabCallback_Parcel() {
        return this.IAuthTabCallback;
    }

    public final int IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    public final setRubIn<Integer> onExtraCallbackWithResult() {
        ltycx ltycxVar;
        synchronized (this) {
            ltycxVar = this.onExtraCallback;
            if (ltycxVar == null) {
                ltycxVar = new ltycx(this.onNavigationEvent);
                this.onExtraCallback = ltycxVar;
            }
        }
        return ltycxVar;
    }

    public final S IAuthTabCallbackDefault() {
        S s;
        ltycx ltycxVar;
        synchronized (this) {
            S[] sArr = this.IAuthTabCallback;
            if (sArr == null) {
                sArr = (S[]) onExtraCallback(2);
                this.IAuthTabCallback = sArr;
            } else if (this.onNavigationEvent >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length << 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                this.IAuthTabCallback = (S[]) ((getStarImageView[]) objArrCopyOf);
                sArr = (S[]) ((getStarImageView[]) objArrCopyOf);
            }
            int i = this.onExtraCallbackWithResult;
            do {
                s = sArr[i];
                if (s == null) {
                    s = (S) asBinder();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                Intrinsics.checkNotNull(s, "");
            } while (!s.onNavigationEvent(this));
            this.onExtraCallbackWithResult = i;
            this.onNavigationEvent++;
            ltycxVar = this.onExtraCallback;
        }
        if (ltycxVar != null) {
            ltycxVar.onWarmupCompleted(1);
        }
        return s;
    }

    public final void onWarmupCompleted(@NotNull S s) {
        ltycx ltycxVar;
        int i;
        access13800<Unit>[] access13800VarArrOnExtraCallbackWithResult;
        synchronized (this) {
            int i2 = this.onNavigationEvent - 1;
            this.onNavigationEvent = i2;
            ltycxVar = this.onExtraCallback;
            if (i2 == 0) {
                this.onExtraCallbackWithResult = 0;
            }
            Intrinsics.checkNotNull(s, "");
            access13800VarArrOnExtraCallbackWithResult = s.onExtraCallbackWithResult(this);
        }
        for (access13800<Unit> access13800Var : access13800VarArrOnExtraCallbackWithResult) {
            if (access13800Var != null) {
                Result.Companion companion = Result.Companion;
                access13800Var.resumeWith(Result.m31constructorimpl(Unit.INSTANCE));
            }
        }
        if (ltycxVar != null) {
            ltycxVar.onWarmupCompleted(-1);
        }
    }
}
