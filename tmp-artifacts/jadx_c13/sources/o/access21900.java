package o;

import io.realm.RealmFieldType;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public enum access21900 implements Row {
    INSTANCE;

    @Override // io.realm.internal.Row
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.internal.Row
    public boolean isValid() {
        return false;
    }

    public long getColumnCount() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public String[] getColumnNames() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public long getColumnKey(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public RealmFieldType getColumnType(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public Table getTable() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public long getObjectKey() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public long getLong(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public boolean getBoolean(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public float getFloat(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public double getDouble(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public Date getDate(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public String getString(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public byte[] getBinaryByteArray(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public Decimal128 getDecimal128(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public ObjectId getObjectId(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public UUID getUUID(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public NativeRealmAny getNativeRealmAny(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public long getLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public boolean isNullLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsList getModelList(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsList getValueList(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public OsMap getRealmAnyMap(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public OsSet getRealmAnySet(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsSet getModelSet(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public OsMap getModelMap(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setLong(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setBoolean(long j, boolean z) {
        throw getStubException();
    }

    public void setFloat(long j, float f) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setDouble(long j, double d) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setDate(long j, Date date) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setString(long j, String str) {
        throw getStubException();
    }

    public void setBinaryByteArray(long j, byte[] bArr) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setLink(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void nullifyLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public boolean isNull(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public void setNull(long j) {
        throw getStubException();
    }

    public void setDecimal128(long j, Decimal128 decimal128) {
        throw getStubException();
    }

    public void setObjectId(long j, ObjectId objectId) {
        throw getStubException();
    }

    public void setUUID(long j, UUID uuid) {
        throw getStubException();
    }

    public void setRealmAny(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public long createEmbeddedObject(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    public void checkIfAttached() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public boolean hasColumn(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public Row freeze(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }

    private RuntimeException getStubException() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }
}
