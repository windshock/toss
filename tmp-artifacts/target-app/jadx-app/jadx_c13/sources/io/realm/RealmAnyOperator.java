package io.realm;

import io.realm.RealmAny;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryDumpBuilder;
import o.TombstoneProtosMemoryDumpOrBuilder;
import o.access20000;
import o.access20500;
import o.access20800;
import o.access21100;
import o.clearArmMteMetadata;
import o.clearTool;
import o.getHeap;
import o.setArmMteMetadata;
import o.setRegisterName;
import o.setRegisterNameBytes;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmAnyOperator {

    @Nullable
    private NativeRealmAny onNavigationEvent;
    private RealmAny.Type onWarmupCompleted;

    public abstract <T> T IAuthTabCallback(Class<T> cls);

    public void IAuthTabCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
    }

    protected abstract NativeRealmAny onExtraCallbackWithResult();

    public static RealmAnyOperator onExtraCallbackWithResult(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, NativeRealmAny nativeRealmAny) {
        RealmAny.Type type = nativeRealmAny.getType();
        switch (AnonymousClass1.onNavigationEvent[type.ordinal()]) {
            case 1:
                return new setRegisterNameBytes(nativeRealmAny);
            case 2:
                return new access20500(nativeRealmAny);
            case 3:
                return new clearTool(nativeRealmAny);
            case 4:
                return new access20000(nativeRealmAny);
            case 5:
                return new access20800(nativeRealmAny);
            case 6:
                return new setRegisterName(nativeRealmAny);
            case 7:
                return new clearArmMteMetadata(nativeRealmAny);
            case 8:
                return new access21100(nativeRealmAny);
            case 9:
                return new TombstoneProtosMemoryDumpBuilder(nativeRealmAny);
            case 10:
                return new getHeap(nativeRealmAny);
            case 11:
                if (tombstoneProtosLogMessageOrBuilder instanceof Realm) {
                    try {
                        return new RealmModelOperator(tombstoneProtosLogMessageOrBuilder, nativeRealmAny, nativeRealmAny.getModelClass(tombstoneProtosLogMessageOrBuilder.IAuthTabCallbackDefault, tombstoneProtosLogMessageOrBuilder.onExtraCallbackWithResult.getInterfaceDescriptor()));
                    } catch (RealmException unused) {
                    }
                }
                return new setArmMteMetadata(tombstoneProtosLogMessageOrBuilder, nativeRealmAny);
            case 12:
                return new TombstoneProtosMemoryDumpOrBuilder(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    /* renamed from: io.realm.RealmAnyOperator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[RealmAny.Type.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[RealmAny.Type.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[RealmAny.Type.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[RealmAny.Type.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[RealmAny.Type.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[RealmAny.Type.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[RealmAny.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[RealmAny.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onNavigationEvent[RealmAny.Type.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onNavigationEvent[RealmAny.Type.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onNavigationEvent[RealmAny.Type.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onNavigationEvent[RealmAny.Type.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onNavigationEvent[RealmAny.Type.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private NativeRealmAny onExtraCallback() {
        NativeRealmAny nativeRealmAny;
        synchronized (this) {
            if (this.onNavigationEvent == null) {
                this.onNavigationEvent = onExtraCallbackWithResult();
            }
            nativeRealmAny = this.onNavigationEvent;
        }
        return nativeRealmAny;
    }

    long onNavigationEvent() {
        return onExtraCallback().getNativePtr();
    }

    public RealmAnyOperator(RealmAny.Type type) {
        this.onWarmupCompleted = type;
    }

    public RealmAnyOperator(RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        this.onWarmupCompleted = type;
        this.onNavigationEvent = nativeRealmAny;
    }

    RealmAny.Type onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    protected Class<?> IAuthTabCallback() {
        return this.onWarmupCompleted.getTypedClass();
    }
}
