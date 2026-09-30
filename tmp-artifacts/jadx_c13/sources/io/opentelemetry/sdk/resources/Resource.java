package io.opentelemetry.sdk.resources;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import o.ErrorTypes;
import o.Grisu3CachedPowersCachedPower;
import o.getLocationStatus;
import o.getNetworkAccess;
import o.getScreenDensityDpi;
import o.getUnhandledExceptions;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class Resource {
    private static final getLocationStatus<String> IAuthTabCallback;
    private static final getLocationStatus<String> IAuthTabCallbackDefault;
    private static final getLocationStatus<String> IAuthTabCallbackStub;
    private static final getLocationStatus<String> asBinder;
    private static final Resource onExtraCallback;
    private static final Resource onExtraCallbackWithResult;
    private static final Resource onNavigationEvent;
    private static final Logger onTransact = Logger.getLogger(Resource.class.getName());
    private static final Resource onWarmupCompleted;

    @Nullable
    public abstract String IAuthTabCallback();

    public abstract getScreenDensityDpi onNavigationEvent();

    static {
        getLocationStatus<String> getlocationstatusIAuthTabCallbackDefault = getLocationStatus.IAuthTabCallbackDefault("service.name");
        IAuthTabCallback = getlocationstatusIAuthTabCallbackDefault;
        getLocationStatus<String> getlocationstatusIAuthTabCallbackDefault2 = getLocationStatus.IAuthTabCallbackDefault("telemetry.sdk.language");
        IAuthTabCallbackStub = getlocationstatusIAuthTabCallbackDefault2;
        getLocationStatus<String> getlocationstatusIAuthTabCallbackDefault3 = getLocationStatus.IAuthTabCallbackDefault("telemetry.sdk.name");
        IAuthTabCallbackDefault = getlocationstatusIAuthTabCallbackDefault3;
        getLocationStatus<String> getlocationstatusIAuthTabCallbackDefault4 = getLocationStatus.IAuthTabCallbackDefault("telemetry.sdk.version");
        asBinder = getlocationstatusIAuthTabCallbackDefault4;
        onExtraCallbackWithResult = onNavigationEvent(getScreenDensityDpi.bB_());
        Resource resourceOnNavigationEvent = onNavigationEvent(getScreenDensityDpi.onExtraCallbackWithResult(getlocationstatusIAuthTabCallbackDefault, "unknown_service:java"));
        onNavigationEvent = resourceOnNavigationEvent;
        Resource resourceOnNavigationEvent2 = onNavigationEvent(getScreenDensityDpi.onWarmupCompleted().onNavigationEvent((getLocationStatus<getLocationStatus<String>>) getlocationstatusIAuthTabCallbackDefault3, (getLocationStatus<String>) "opentelemetry").onNavigationEvent((getLocationStatus<getLocationStatus<String>>) getlocationstatusIAuthTabCallbackDefault2, (getLocationStatus<String>) "java").onNavigationEvent((getLocationStatus<getLocationStatus<String>>) getlocationstatusIAuthTabCallbackDefault4, (getLocationStatus<String>) "1.49.0").onExtraCallback());
        onExtraCallback = resourceOnNavigationEvent2;
        onWarmupCompleted = resourceOnNavigationEvent.IAuthTabCallback(resourceOnNavigationEvent2);
    }

    public static Resource onWarmupCompleted() {
        return onWarmupCompleted;
    }

    public static Resource onNavigationEvent(getScreenDensityDpi getscreendensitydpi) {
        return onExtraCallback(getscreendensitydpi, null);
    }

    public static Resource onExtraCallback(getScreenDensityDpi getscreendensitydpi, @Nullable String str) {
        Objects.requireNonNull(getscreendensitydpi, "attributes");
        IAuthTabCallback(getscreendensitydpi);
        return new Grisu3CachedPowersCachedPower(str, getscreendensitydpi);
    }

    @Nullable
    public <T> T onWarmupCompleted(getLocationStatus<T> getlocationstatus) {
        return (T) onNavigationEvent().onNavigationEvent(getlocationstatus);
    }

    public Resource IAuthTabCallback(@Nullable Resource resource) {
        if (resource == null || resource == onExtraCallbackWithResult) {
            return this;
        }
        getNetworkAccess getnetworkaccessOnWarmupCompleted = getScreenDensityDpi.onWarmupCompleted();
        getnetworkaccessOnWarmupCompleted.onExtraCallback(onNavigationEvent());
        getnetworkaccessOnWarmupCompleted.onExtraCallback(resource.onNavigationEvent());
        if (resource.IAuthTabCallback() == null) {
            return onExtraCallback(getnetworkaccessOnWarmupCompleted.onExtraCallback(), IAuthTabCallback());
        }
        if (IAuthTabCallback() == null) {
            return onExtraCallback(getnetworkaccessOnWarmupCompleted.onExtraCallback(), resource.IAuthTabCallback());
        }
        if (!resource.IAuthTabCallback().equals(IAuthTabCallback())) {
            onTransact.info("Attempting to merge Resources with different schemaUrls. The resulting Resource will have no schemaUrl assigned. Schema 1: " + IAuthTabCallback() + " Schema 2: " + resource.IAuthTabCallback());
            return onExtraCallback(getnetworkaccessOnWarmupCompleted.onExtraCallback(), null);
        }
        return onExtraCallback(getnetworkaccessOnWarmupCompleted.onExtraCallback(), IAuthTabCallback());
    }

    private static void IAuthTabCallback(getScreenDensityDpi getscreendensitydpi) {
        getscreendensitydpi.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.resources.Resource$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Resource.IAuthTabCallback((getLocationStatus) obj, obj2);
            }
        });
    }

    public static /* synthetic */ void IAuthTabCallback(getLocationStatus getlocationstatus, Object obj) {
        getUnhandledExceptions.onExtraCallbackWithResult(onExtraCallbackWithResult(getlocationstatus), "Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
        Objects.requireNonNull(obj, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }

    private static boolean onNavigationEvent(String str) {
        return str.length() <= 255 && ErrorTypes.onExtraCallback(str);
    }

    private static boolean onExtraCallbackWithResult(getLocationStatus<?> getlocationstatus) {
        return !getlocationstatus.IAuthTabCallback().isEmpty() && onNavigationEvent(getlocationstatus.IAuthTabCallback());
    }

    public static ResourceBuilder onExtraCallback() {
        return new ResourceBuilder();
    }

    public ResourceBuilder onExtraCallbackWithResult() {
        ResourceBuilder resourceBuilderOnNavigationEvent = onExtraCallback().onNavigationEvent(this);
        if (IAuthTabCallback() != null) {
            resourceBuilderOnNavigationEvent.onExtraCallback(IAuthTabCallback());
        }
        return resourceBuilderOnNavigationEvent;
    }
}
