package o;

import kotlin.NoWhenBranchMatchedException;
import o.createDefaultMediaViewVideoRendererApi;
import o.setCallToAction;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getKeySize {

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] IAuthTabCallback;
        public static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[createDefaultMediaViewVideoRendererApi.onExtraCallback.values().length];
            try {
                iArr[createDefaultMediaViewVideoRendererApi.onExtraCallback.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[createDefaultMediaViewVideoRendererApi.onExtraCallback.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[createDefaultMediaViewVideoRendererApi.onExtraCallback.DANGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[createDefaultMediaViewVideoRendererApi.onExtraCallback.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            IAuthTabCallback = iArr;
            int[] iArr2 = new int[createDefaultMediaViewVideoRendererApi.onExtraCallbackWithResult.values().length];
            try {
                iArr2[createDefaultMediaViewVideoRendererApi.onExtraCallbackWithResult.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[createDefaultMediaViewVideoRendererApi.onExtraCallbackWithResult.WEAK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallback = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final setCallToAction.onWarmupCompleted onExtraCallbackWithResult(createDefaultMediaViewVideoRendererApi.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = onExtraCallbackWithResult.IAuthTabCallback[onwarmupcompleted.onExtraCallback().ordinal()];
        if (i == 1) {
            return setCallToAction.onWarmupCompleted.Primary;
        }
        if (i == 2) {
            return setCallToAction.onWarmupCompleted.Dark;
        }
        if (i == 3) {
            return setCallToAction.onWarmupCompleted.Danger;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return setCallToAction.onWarmupCompleted.Light;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final setCallToAction.onExtraCallback IAuthTabCallback(createDefaultMediaViewVideoRendererApi.onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException {
        int i = onExtraCallbackWithResult.onExtraCallback[onwarmupcompleted.onNavigationEvent().ordinal()];
        if (i == 1) {
            return setCallToAction.onExtraCallback.Fill;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return setCallToAction.onExtraCallback.Weak;
    }
}
