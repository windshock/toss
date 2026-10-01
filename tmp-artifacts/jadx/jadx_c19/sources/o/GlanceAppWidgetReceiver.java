package o;

import java.io.Serializable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class GlanceAppWidgetReceiver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _allowJDKTypeCtors;
    protected final boolean _requireCtorAnnotation;
    protected final onWarmupCompleted _singleArgMode;
    public static final GlanceAppWidgetReceiver onExtraCallback = new GlanceAppWidgetReceiver(onWarmupCompleted.HEURISTIC);
    public static final GlanceAppWidgetReceiver IAuthTabCallback = new GlanceAppWidgetReceiver(onWarmupCompleted.PROPERTIES);
    public static final GlanceAppWidgetReceiver onExtraCallbackWithResult = new GlanceAppWidgetReceiver(onWarmupCompleted.DELEGATING);
    public static final GlanceAppWidgetReceiver onNavigationEvent = new GlanceAppWidgetReceiver(onWarmupCompleted.REQUIRE_MODE);

    public enum onWarmupCompleted {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    protected GlanceAppWidgetReceiver(onWarmupCompleted onwarmupcompleted, boolean z, boolean z2) {
        this._singleArgMode = onwarmupcompleted;
        this._requireCtorAnnotation = z;
        this._allowJDKTypeCtors = z2;
    }

    protected GlanceAppWidgetReceiver(onWarmupCompleted onwarmupcompleted) {
        this(onwarmupcompleted, false, false);
    }

    public onWarmupCompleted onNavigationEvent() {
        return this._singleArgMode;
    }

    public boolean onWarmupCompleted() {
        return this._requireCtorAnnotation;
    }

    public boolean IAuthTabCallback() {
        return this._singleArgMode == onWarmupCompleted.DELEGATING;
    }

    public boolean onExtraCallback() {
        return this._singleArgMode == onWarmupCompleted.PROPERTIES;
    }

    public boolean onExtraCallbackWithResult(Class<?> cls) {
        if (this._requireCtorAnnotation) {
            return false;
        }
        return this._allowJDKTypeCtors || !SavedStateHandleImplExternalSyntheticLambda0.ICustomTabsCallback(cls) || Throwable.class.isAssignableFrom(cls);
    }
}
