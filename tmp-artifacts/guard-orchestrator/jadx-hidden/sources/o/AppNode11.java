package o;

/* loaded from: classes.dex */
public final class AppNode11 implements getSceneParams {
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode11.class);
    public static final AppNode11 onExtraCallback = new AppNode11();

    static {
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(273);
    }

    public Void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 1) & 1) == 0) {
            throw null;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
        return null;
    }

    private AppNode11() {
    }

    @Override // o.getSceneParams
    public /* synthetic */ String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 28) & 1) == 0) {
            str = (String) onExtraCallbackWithResult();
            int i3 = 39 / 0;
        } else {
            str = (String) onExtraCallbackWithResult();
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5226);
        return str;
    }
}
