package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class getItemAnimator implements getEdgeEffectFactory {
    private static final addFocusables onTransact = addFocusables.onExtraCallback(getItemAnimator.class.getSimpleName());
    removeOnChildAttachStateChangeListener onExtraCallbackWithResult;
    setViewCacheExtension onNavigationEvent = null;
    private setChildImportantForAccessibilityInternal IAuthTabCallbackStub = null;
    protected String onWarmupCompleted = "aPosition";
    protected String IAuthTabCallbackDefault = "aTextureCoord";
    protected String IAuthTabCallback = "uMVPMatrix";
    protected String asInterface = "uTexMatrix";
    protected String onExtraCallback = "vTextureCoord";

    private static String onExtraCallbackWithResult(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        return "uniform mat4 " + str3 + ";\nuniform mat4 " + str4 + ";\nattribute vec4 " + str + ";\nattribute vec4 " + str2 + ";\nvarying vec2 " + str5 + ";\nvoid main() {\n    gl_Position = " + str3 + " * " + str + ";\n    " + str5 + " = (" + str4 + " * " + str2 + ").xy;\n}\n";
    }

    private static String onNavigationEvent(@NonNull String str) {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 " + str + ";\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, " + str + ");\n}\n";
    }

    protected String onExtraCallbackWithResult() {
        return onExtraCallbackWithResult(this.onWarmupCompleted, this.IAuthTabCallbackDefault, this.IAuthTabCallback, this.asInterface, this.onExtraCallback);
    }

    protected String onExtraCallback() {
        return onNavigationEvent(this.onExtraCallback);
    }

    public void onExtraCallbackWithResult(int i) {
        this.onNavigationEvent = new setViewCacheExtension(i, this.onWarmupCompleted, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.asInterface);
        this.IAuthTabCallbackStub = new setHasFixedSize();
    }

    public void asInterface() {
        this.onNavigationEvent.onNavigationEvent();
        this.onNavigationEvent = null;
        this.IAuthTabCallbackStub = null;
    }

    public String onNavigationEvent() {
        return onExtraCallbackWithResult();
    }

    public void onNavigationEvent(int i, int i2) {
        this.onExtraCallbackWithResult = new removeOnChildAttachStateChangeListener(i, i2);
    }

    public void onNavigationEvent(long j, @NonNull float[] fArr) {
        if (this.onNavigationEvent == null) {
            onTransact.onWarmupCompleted(new Object[]{"Filter.draw() called after destroying the filter. This can happen rarely because of threading."});
            return;
        }
        onExtraCallbackWithResult(j, fArr);
        onExtraCallbackWithResult(j);
        onWarmupCompleted(j);
    }

    protected void onExtraCallbackWithResult(long j, @NonNull float[] fArr) {
        this.onNavigationEvent.onExtraCallbackWithResult(fArr);
        setViewCacheExtension setviewcacheextension = this.onNavigationEvent;
        setChildImportantForAccessibilityInternal setchildimportantforaccessibilityinternal = this.IAuthTabCallbackStub;
        setviewcacheextension.IAuthTabCallback(setchildimportantforaccessibilityinternal, setchildimportantforaccessibilityinternal.IAuthTabCallback());
    }

    protected void onExtraCallbackWithResult(long j) {
        this.onNavigationEvent.onWarmupCompleted(this.IAuthTabCallbackStub);
    }

    protected void onWarmupCompleted(long j) {
        this.onNavigationEvent.onExtraCallback(this.IAuthTabCallbackStub);
    }

    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public final getItemAnimator onWarmupCompleted() {
        getNanoTime getnanotimeIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = this.onExtraCallbackWithResult;
        if (removeonchildattachstatechangelistener != null) {
            getnanotimeIAuthTabCallbackDefault.onNavigationEvent(removeonchildattachstatechangelistener.onExtraCallback(), this.onExtraCallbackWithResult.onExtraCallbackWithResult());
        }
        if (this instanceof getNanoTime) {
        }
        if (this instanceof getLayoutManager) {
        }
        return getnanotimeIAuthTabCallbackDefault;
    }

    protected getItemAnimator IAuthTabCallbackDefault() {
        try {
            return (getItemAnimator) getClass().newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e2);
        }
    }
}
