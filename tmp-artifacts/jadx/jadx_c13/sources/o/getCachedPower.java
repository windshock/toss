package o;

import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getCachedPower {
    static final RegisteredView IAuthTabCallback;
    private static final Logger onNavigationEvent;
    static final awaitResult onWarmupCompleted;
    private final Map<getDataTrimmed, RegisteredView> onExtraCallback = new HashMap();
    private final List<RegisteredView> onExtraCallbackWithResult;

    static {
        awaitResult awaitresultOnNavigationEvent = awaitResult.IAuthTabCallbackDefault().onNavigationEvent();
        onWarmupCompleted = awaitresultOnNavigationEvent;
        IAuthTabCallback = RegisteredView.onExtraCallbackWithResult(TaskType.IAuthTabCallbackDefault().onExtraCallbackWithResult("*").onExtraCallbackWithResult(), awaitresultOnNavigationEvent, tryConvert.onExtraCallback, 2000, registerBinderFactory.onWarmupCompleted());
        onNavigationEvent = Logger.getLogger(getCachedPower.class.getName());
    }

    getCachedPower(clearMetadataTab clearmetadatatab, addMetadataString addmetadatastring, List<RegisteredView> list) {
        for (getDataTrimmed getdatatrimmed : getDataTrimmed.values()) {
            this.onExtraCallback.put(getdatatrimmed, RegisteredView.onExtraCallbackWithResult(TaskType.IAuthTabCallbackDefault().onExtraCallbackWithResult("*").onExtraCallbackWithResult(), awaitResult.IAuthTabCallbackDefault().onWarmupCompleted(clearmetadatatab.getDefaultAggregation(getdatatrimmed)).onNavigationEvent(), withJavaConverters.onNavigationEvent(), addmetadatastring.getCardinalityLimit(getdatatrimmed), registerBinderFactory.onWarmupCompleted()));
        }
        this.onExtraCallbackWithResult = list;
    }

    public static getCachedPower onExtraCallbackWithResult(clearMetadataTab clearmetadatatab, addMetadataString addmetadatastring, List<RegisteredView> list) {
        return new getCachedPower(clearmetadatatab, addmetadatastring, new ArrayList(list));
    }

    public List<RegisteredView> onWarmupCompleted(tryFindBinder tryfindbinder, TombstoneParserCompanion tombstoneParserCompanion) {
        ArrayList arrayList = new ArrayList();
        for (RegisteredView registeredView : this.onExtraCallbackWithResult) {
            if (onWarmupCompleted(registeredView.onExtraCallback(), tryfindbinder, tombstoneParserCompanion)) {
                if (((OpaqueValue) registeredView.onNavigationEvent().IAuthTabCallback()).onExtraCallbackWithResult(tryfindbinder)) {
                    arrayList.add(registeredView);
                } else {
                    onNavigationEvent.log(Level.WARNING, "View aggregation " + NativeBridgeWhenMappings.onExtraCallbackWithResult(registeredView.onNavigationEvent().IAuthTabCallback()) + " is incompatible with instrument " + tryfindbinder.onNavigationEvent() + " of type " + tryfindbinder.onExtraCallbackWithResult());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        RegisteredView registeredViewOnNavigationEvent = this.onExtraCallback.get(tryfindbinder.onExtraCallbackWithResult());
        Objects.requireNonNull(registeredViewOnNavigationEvent);
        if (!((OpaqueValue) registeredViewOnNavigationEvent.onNavigationEvent().IAuthTabCallback()).onExtraCallbackWithResult(tryfindbinder)) {
            onNavigationEvent.log(Level.WARNING, "Instrument default aggregation " + NativeBridgeWhenMappings.onExtraCallbackWithResult(registeredViewOnNavigationEvent.onNavigationEvent().IAuthTabCallback()) + " is incompatible with instrument " + tryfindbinder.onNavigationEvent() + " of type " + tryfindbinder.onExtraCallbackWithResult());
            registeredViewOnNavigationEvent = IAuthTabCallback;
        }
        if (tryfindbinder.onExtraCallback().onWarmupCompleted()) {
            registeredViewOnNavigationEvent = onNavigationEvent(registeredViewOnNavigationEvent, tryfindbinder.onExtraCallback());
        }
        return Collections.singletonList(registeredViewOnNavigationEvent);
    }

    private static boolean onWarmupCompleted(TaskType taskType, tryFindBinder tryfindbinder, TombstoneParserCompanion tombstoneParserCompanion) {
        if (taskType.IAuthTabCallback() != null && taskType.IAuthTabCallback() != tryfindbinder.onExtraCallbackWithResult()) {
            return false;
        }
        if (taskType.onExtraCallbackWithResult() != null && !taskType.onExtraCallbackWithResult().equals(tryfindbinder.IAuthTabCallback())) {
            return false;
        }
        if (taskType.onExtraCallback() == null || component19.onNavigationEvent(taskType.onExtraCallback()).test(tryfindbinder.onNavigationEvent())) {
            return onWarmupCompleted(taskType, tombstoneParserCompanion);
        }
        return false;
    }

    private static boolean onWarmupCompleted(TaskType taskType, TombstoneParserCompanion tombstoneParserCompanion) {
        if (taskType.onWarmupCompleted() != null && !taskType.onWarmupCompleted().equals(tombstoneParserCompanion.onExtraCallback())) {
            return false;
        }
        if (taskType.asBinder() == null || taskType.asBinder().equals(tombstoneParserCompanion.onExtraCallbackWithResult())) {
            return taskType.onNavigationEvent() == null || taskType.onNavigationEvent().equals(tombstoneParserCompanion.IAuthTabCallback());
        }
        return false;
    }

    private static RegisteredView onNavigationEvent(RegisteredView registeredView, registerReader registerreader) {
        TaskType taskTypeOnExtraCallback = registeredView.onExtraCallback();
        awaitResult awaitresultOnNavigationEvent = registeredView.onNavigationEvent();
        List listOnExtraCallback = registerreader.onExtraCallback();
        Objects.requireNonNull(listOnExtraCallback);
        return RegisteredView.onExtraCallbackWithResult(taskTypeOnExtraCallback, awaitresultOnNavigationEvent, new skipDefaultValues(listOnExtraCallback), registeredView.IAuthTabCallback(), registeredView.onExtraCallbackWithResult());
    }
}
