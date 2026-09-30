package io.reactivex.android.plugins;

import java.util.concurrent.Callable;
import o.MapConverter;
import o.NumberConverter;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxAndroidPlugins {
    private static volatile deserializeIntNullableCollection<MapConverter, MapConverter> IAuthTabCallback;
    private static volatile deserializeIntNullableCollection<Callable<MapConverter>, MapConverter> onNavigationEvent;

    public static void onExtraCallback(deserializeIntNullableCollection<Callable<MapConverter>, MapConverter> deserializeintnullablecollection) {
        onNavigationEvent = deserializeintnullablecollection;
    }

    public static MapConverter IAuthTabCallback(Callable<MapConverter> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        deserializeIntNullableCollection<Callable<MapConverter>, MapConverter> deserializeintnullablecollection = onNavigationEvent;
        if (deserializeintnullablecollection == null) {
            return onExtraCallbackWithResult(callable);
        }
        return onExtraCallback(deserializeintnullablecollection, callable);
    }

    public static void IAuthTabCallback(deserializeIntNullableCollection<MapConverter, MapConverter> deserializeintnullablecollection) {
        IAuthTabCallback = deserializeintnullablecollection;
    }

    public static MapConverter onExtraCallback(MapConverter mapConverter) {
        if (mapConverter == null) {
            throw new NullPointerException("scheduler == null");
        }
        deserializeIntNullableCollection<MapConverter, MapConverter> deserializeintnullablecollection = IAuthTabCallback;
        return deserializeintnullablecollection == null ? mapConverter : (MapConverter) onExtraCallback((deserializeIntNullableCollection<MapConverter, R>) deserializeintnullablecollection, mapConverter);
    }

    static MapConverter onExtraCallbackWithResult(Callable<MapConverter> callable) {
        try {
            MapConverter mapConverterCall = callable.call();
            if (mapConverterCall != null) {
                return mapConverterCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw NumberConverter.onExtraCallbackWithResult(th);
        }
    }

    static MapConverter onExtraCallback(deserializeIntNullableCollection<Callable<MapConverter>, MapConverter> deserializeintnullablecollection, Callable<MapConverter> callable) {
        MapConverter mapConverter = (MapConverter) onExtraCallback((deserializeIntNullableCollection<Callable<MapConverter>, R>) deserializeintnullablecollection, callable);
        if (mapConverter != null) {
            return mapConverter;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static <T, R> R onExtraCallback(deserializeIntNullableCollection<T, R> deserializeintnullablecollection, T t) {
        try {
            return deserializeintnullablecollection.apply(t);
        } catch (Throwable th) {
            throw NumberConverter.onExtraCallbackWithResult(th);
        }
    }

    private RxAndroidPlugins() {
        throw new AssertionError("No instances.");
    }
}
