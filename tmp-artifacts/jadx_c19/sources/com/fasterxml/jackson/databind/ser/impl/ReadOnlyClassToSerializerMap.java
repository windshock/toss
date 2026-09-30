package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$;
import o.FragmentFactory;
import o.dispatchOnCancelled;
import o.setUpdateThrottle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ReadOnlyClassToSerializerMap {
    private final Bucket[] onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    private static final int onNavigationEvent(int i2) {
        int i3 = 8;
        while (i3 < (i2 <= 64 ? i2 + i2 : i2 + (i2 >> 2))) {
            i3 += i3;
        }
        return i3;
    }

    public ReadOnlyClassToSerializerMap(dispatchOnCancelled<setUpdateThrottle, FragmentFactory<Object>> dispatchoncancelled) {
        int iOnNavigationEvent = onNavigationEvent(dispatchoncancelled.onWarmupCompleted());
        this.onWarmupCompleted = iOnNavigationEvent;
        this.onNavigationEvent = iOnNavigationEvent - 1;
        Bucket[] bucketArr = new Bucket[iOnNavigationEvent];
        dispatchoncancelled.onNavigationEvent(new ReadOnlyClassToSerializerMap$.ExternalSyntheticLambda0(this, bucketArr));
        this.onExtraCallbackWithResult = bucketArr;
    }

    public static /* synthetic */ void onNavigationEvent(ReadOnlyClassToSerializerMap readOnlyClassToSerializerMap, Bucket[] bucketArr, setUpdateThrottle setupdatethrottle, FragmentFactory fragmentFactory) {
        int iHashCode = readOnlyClassToSerializerMap.onNavigationEvent & setupdatethrottle.hashCode();
        bucketArr[iHashCode] = new Bucket(bucketArr[iHashCode], setupdatethrottle, fragmentFactory);
    }

    public static ReadOnlyClassToSerializerMap onNavigationEvent(dispatchOnCancelled<setUpdateThrottle, FragmentFactory<Object>> dispatchoncancelled) {
        return new ReadOnlyClassToSerializerMap(dispatchoncancelled);
    }

    public FragmentFactory<Object> onExtraCallbackWithResult(JavaType javaType) {
        Bucket bucket = this.onExtraCallbackWithResult[setUpdateThrottle.onExtraCallback(javaType) & this.onNavigationEvent];
        if (bucket == null) {
            return null;
        }
        if (bucket.onExtraCallback(javaType)) {
            return bucket.onExtraCallback;
        }
        do {
            bucket = bucket.onNavigationEvent;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.onExtraCallback(javaType));
        return bucket.onExtraCallback;
    }

    public FragmentFactory<Object> onExtraCallbackWithResult(Class<?> cls) {
        Bucket bucket = this.onExtraCallbackWithResult[setUpdateThrottle.onWarmupCompleted(cls) & this.onNavigationEvent];
        if (bucket == null) {
            return null;
        }
        if (bucket.IAuthTabCallback(cls)) {
            return bucket.onExtraCallback;
        }
        do {
            bucket = bucket.onNavigationEvent;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.IAuthTabCallback(cls));
        return bucket.onExtraCallback;
    }

    public FragmentFactory<Object> onExtraCallback(JavaType javaType) {
        Bucket bucket = this.onExtraCallbackWithResult[setUpdateThrottle.onNavigationEvent(javaType) & this.onNavigationEvent];
        if (bucket == null) {
            return null;
        }
        if (bucket.onWarmupCompleted(javaType)) {
            return bucket.onExtraCallback;
        }
        do {
            bucket = bucket.onNavigationEvent;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.onWarmupCompleted(javaType));
        return bucket.onExtraCallback;
    }

    public FragmentFactory<Object> onExtraCallback(Class<?> cls) {
        Bucket bucket = this.onExtraCallbackWithResult[setUpdateThrottle.onExtraCallbackWithResult(cls) & this.onNavigationEvent];
        if (bucket == null) {
            return null;
        }
        if (bucket.onExtraCallbackWithResult(cls)) {
            return bucket.onExtraCallback;
        }
        do {
            bucket = bucket.onNavigationEvent;
            if (bucket == null) {
                return null;
            }
        } while (!bucket.onExtraCallbackWithResult(cls));
        return bucket.onExtraCallback;
    }
}
