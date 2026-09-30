package io.realm;

import java.util.Date;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import o.TombstoneProtosLogMessageOrBuilder;
import o.TombstoneProtosMemoryDumpOrBuilder;
import o.clearTool;
import o.setRegisterNameBytes;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmAny {

    @Nonnull
    private final RealmAnyOperator onNavigationEvent;

    public RealmAny(@Nonnull RealmAnyOperator realmAnyOperator) {
        this.onNavigationEvent = realmAnyOperator;
    }

    final long onExtraCallbackWithResult() {
        return this.onNavigationEvent.onNavigationEvent();
    }

    public Type onNavigationEvent() {
        return this.onNavigationEvent.onWarmupCompleted();
    }

    @Nullable
    public Class<?> IAuthTabCallback() {
        return this.onNavigationEvent.IAuthTabCallback();
    }

    public static RealmAny onWarmupCompleted(@Nullable Integer num) {
        return new RealmAny(num == null ? new TombstoneProtosMemoryDumpOrBuilder() : new setRegisterNameBytes(num));
    }

    public static RealmAny onExtraCallback(@Nullable Long l) {
        return new RealmAny(l == null ? new TombstoneProtosMemoryDumpOrBuilder() : new setRegisterNameBytes(l));
    }

    public static RealmAny onExtraCallback(@Nullable String str) {
        return new RealmAny(str == null ? new TombstoneProtosMemoryDumpOrBuilder() : new clearTool(str));
    }

    public static RealmAny onWarmupCompleted() {
        return new RealmAny(new TombstoneProtosMemoryDumpOrBuilder());
    }

    public static RealmAny onWarmupCompleted(@Nullable RealmModel realmModel) {
        return new RealmAny(realmModel == null ? new TombstoneProtosMemoryDumpOrBuilder() : new RealmModelOperator(realmModel));
    }

    public <T extends RealmModel> T onNavigationEvent(Class<T> cls) {
        return (T) this.onNavigationEvent.IAuthTabCallback(cls);
    }

    public final int hashCode() {
        return this.onNavigationEvent.hashCode();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RealmAny) {
            return this.onNavigationEvent.equals(((RealmAny) obj).onNavigationEvent);
        }
        return false;
    }

    public String toString() {
        return this.onNavigationEvent.toString();
    }

    void onExtraCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        this.onNavigationEvent.IAuthTabCallback(tombstoneProtosLogMessageOrBuilder);
    }

    public enum Type {
        INTEGER(RealmFieldType.INTEGER, Long.class),
        BOOLEAN(RealmFieldType.BOOLEAN, Boolean.class),
        STRING(RealmFieldType.STRING, String.class),
        BINARY(RealmFieldType.BINARY, Byte[].class),
        DATE(RealmFieldType.DATE, Date.class),
        FLOAT(RealmFieldType.FLOAT, Float.class),
        DOUBLE(RealmFieldType.DOUBLE, Double.class),
        DECIMAL128(RealmFieldType.DECIMAL128, Decimal128.class),
        OBJECT_ID(RealmFieldType.OBJECT_ID, ObjectId.class),
        OBJECT(RealmFieldType.TYPED_LINK, RealmModel.class),
        UUID(RealmFieldType.UUID, UUID.class),
        NULL(null, null);

        private static final Type[] realmFieldToRealmAnyTypeMap = new Type[19];
        private final Class<?> clazz;
        private final RealmFieldType realmFieldType;

        static {
            for (Type type : values()) {
                if (type != NULL) {
                    realmFieldToRealmAnyTypeMap[type.realmFieldType.getNativeValue()] = type;
                }
            }
            realmFieldToRealmAnyTypeMap[RealmFieldType.OBJECT.getNativeValue()] = OBJECT;
        }

        public static Type fromNativeValue(int i) {
            if (i == -1) {
                return NULL;
            }
            return realmFieldToRealmAnyTypeMap[i];
        }

        Type(@Nullable RealmFieldType realmFieldType, @Nullable Class cls) {
            this.realmFieldType = realmFieldType;
            this.clazz = cls;
        }

        public Class<?> getTypedClass() {
            return this.clazz;
        }
    }
}
