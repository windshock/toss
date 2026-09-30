package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.access20200;
import o.access21400;
import o.access22600;
import o.clearLocation;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmQuery<E> {
    private final access22600 IAuthTabCallback;
    private final TombstoneProtosLogMessageOrBuilder IAuthTabCallbackStub;
    private final RealmObjectSchema asBinder;
    private final Table asInterface;
    private final TableQuery onExtraCallback;
    private String onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private Class<E> onWarmupCompleted;

    private static native String nativeSerializeQuery(long j);

    static <E extends RealmModel> RealmQuery<E> onExtraCallback(Realm realm, Class<E> cls) {
        return new RealmQuery<>(realm, cls);
    }

    public static <E extends RealmModel> RealmQuery<E> onExtraCallbackWithResult(access21400 access21400Var, String str) {
        return new RealmQuery<>(access21400Var, str);
    }

    private static boolean onNavigationEvent(Class<?> cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    private RealmQuery(Realm realm, Class<E> cls) {
        this.IAuthTabCallbackStub = realm;
        this.onWarmupCompleted = cls;
        boolean zOnNavigationEvent = onNavigationEvent(cls);
        this.onNavigationEvent = !zOnNavigationEvent;
        if (!zOnNavigationEvent) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        RealmObjectSchema realmObjectSchemaIAuthTabCallback = realm.access000().IAuthTabCallback((Class<? extends RealmModel>) cls);
        this.asBinder = realmObjectSchemaIAuthTabCallback;
        Table tableIAuthTabCallback = realmObjectSchemaIAuthTabCallback.IAuthTabCallback();
        this.asInterface = tableIAuthTabCallback;
        this.IAuthTabCallback = null;
        this.onExtraCallback = tableIAuthTabCallback.access100();
    }

    private RealmQuery(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, String str) {
        this.IAuthTabCallbackStub = tombstoneProtosLogMessageOrBuilder;
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = false;
        RealmObjectSchema realmObjectSchemaOnTransact = tombstoneProtosLogMessageOrBuilder.access000().onTransact(str);
        this.asBinder = realmObjectSchemaOnTransact;
        Table tableIAuthTabCallback = realmObjectSchemaOnTransact.IAuthTabCallback();
        this.asInterface = tableIAuthTabCallback;
        this.onExtraCallback = tableIAuthTabCallback.access100();
        this.IAuthTabCallback = null;
    }

    public RealmQuery<E> onExtraCallback(String str, @Nullable String str2) {
        return IAuthTabCallback(str, str2, access20200.SENSITIVE);
    }

    public RealmQuery<E> IAuthTabCallback(String str, @Nullable String str2, access20200 access20200Var) {
        this.IAuthTabCallbackStub.onTransact();
        onWarmupCompleted(str, RealmAny.onExtraCallback(str2), access20200Var);
        return this;
    }

    public RealmQuery<E> onWarmupCompleted(String str, RealmAny realmAny, access20200 access20200Var) {
        this.IAuthTabCallbackStub.onTransact();
        if (access20200Var == access20200.SENSITIVE) {
            this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, realmAny);
            return this;
        }
        this.onExtraCallback.onNavigationEvent(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, realmAny);
        return this;
    }

    public RealmQuery<E> IAuthTabCallback(String str, @Nullable Integer num) {
        this.IAuthTabCallbackStub.onTransact();
        this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, RealmAny.onWarmupCompleted(num));
        return this;
    }

    public RealmQuery<E> onExtraCallbackWithResult(String str, @Nullable Long l) {
        this.IAuthTabCallbackStub.onTransact();
        this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, RealmAny.onExtraCallback(l));
        return this;
    }

    public RealmQuery<E> onNavigationEvent(String str, @Nullable String[] strArr) {
        return onExtraCallback(str, strArr, access20200.SENSITIVE);
    }

    public RealmQuery<E> onExtraCallback(String str, @Nullable String[] strArr, access20200 access20200Var) {
        this.IAuthTabCallbackStub.onTransact();
        if (strArr == null || strArr.length == 0) {
            onExtraCallback();
            return this;
        }
        RealmAny[] realmAnyArr = new RealmAny[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null) {
                realmAnyArr[i] = RealmAny.onExtraCallback(str2);
            } else {
                realmAnyArr[i] = null;
            }
        }
        if (access20200Var == access20200.SENSITIVE) {
            this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, realmAnyArr);
            return this;
        }
        this.onExtraCallback.onExtraCallbackWithResult(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, realmAnyArr);
        return this;
    }

    public RealmQuery<E> IAuthTabCallback(String str, @Nullable Integer[] numArr) {
        this.IAuthTabCallbackStub.onTransact();
        if (numArr == null || numArr.length == 0) {
            onExtraCallback();
            return this;
        }
        RealmAny[] realmAnyArr = new RealmAny[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            realmAnyArr[i] = RealmAny.onWarmupCompleted(numArr[i]);
        }
        this.onExtraCallback.onWarmupCompleted(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, realmAnyArr);
        return this;
    }

    public RealmQuery<E> onExtraCallbackWithResult(String str, int i) {
        this.IAuthTabCallbackStub.onTransact();
        this.onExtraCallback.onExtraCallbackWithResult(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), str, RealmAny.onWarmupCompleted(Integer.valueOf(i)));
        return this;
    }

    /* renamed from: io.realm.RealmQuery$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[RealmFieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[RealmFieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[RealmFieldType.DECIMAL128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[RealmFieldType.MIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public long onExtraCallbackWithResult() {
        this.IAuthTabCallbackStub.onTransact();
        this.IAuthTabCallbackStub.IAuthTabCallback();
        return onTransact().IAuthTabCallbackDefault();
    }

    public RealmResults<E> onWarmupCompleted() {
        this.IAuthTabCallbackStub.onTransact();
        this.IAuthTabCallbackStub.IAuthTabCallback();
        return onWarmupCompleted(this.onExtraCallback, true);
    }

    private OsResults onTransact() {
        this.IAuthTabCallbackStub.onTransact();
        return onWarmupCompleted(this.onExtraCallback, false).onWarmupCompleted;
    }

    public RealmResults<E> IAuthTabCallback() {
        this.IAuthTabCallbackStub.onTransact();
        this.IAuthTabCallbackStub.IAuthTabCallbackDefault.capabilities.onNavigationEvent("Async query cannot be created on current thread.");
        return onWarmupCompleted(this.onExtraCallback, false);
    }

    public RealmQuery<E> onExtraCallback(String[] strArr, clearLocation[] clearlocationArr) {
        if (clearlocationArr == null || clearlocationArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if (strArr.length != clearlocationArr.length) {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        this.IAuthTabCallbackStub.onTransact();
        this.onExtraCallback.onNavigationEvent(this.IAuthTabCallbackStub.access000().onWarmupCompleted(), strArr, clearlocationArr);
        return this;
    }

    public RealmQuery<E> onExtraCallback() {
        this.IAuthTabCallbackStub.onTransact();
        this.onExtraCallback.onExtraCallbackWithResult();
        return this;
    }

    private boolean asBinder() {
        return this.onExtraCallbackWithResult != null;
    }

    @Nullable
    public E onNavigationEvent() {
        this.IAuthTabCallbackStub.onTransact();
        this.IAuthTabCallbackStub.IAuthTabCallback();
        if (this.onNavigationEvent) {
            return null;
        }
        long jAsInterface = asInterface();
        if (jAsInterface < 0) {
            return null;
        }
        return (E) this.IAuthTabCallbackStub.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallbackWithResult, jAsInterface);
    }

    private RealmResults<E> onWarmupCompleted(TableQuery tableQuery, boolean z) {
        RealmResults<E> realmResults;
        OsResults osResultsOnExtraCallback = OsResults.onExtraCallback(this.IAuthTabCallbackStub.IAuthTabCallbackDefault, tableQuery);
        if (asBinder()) {
            realmResults = new RealmResults<>(this.IAuthTabCallbackStub, osResultsOnExtraCallback, this.onExtraCallbackWithResult);
        } else {
            realmResults = new RealmResults<>(this.IAuthTabCallbackStub, osResultsOnExtraCallback, this.onWarmupCompleted);
        }
        if (z) {
            realmResults.asBinder();
        }
        return realmResults;
    }

    private long asInterface() {
        return this.onExtraCallback.IAuthTabCallback();
    }
}
