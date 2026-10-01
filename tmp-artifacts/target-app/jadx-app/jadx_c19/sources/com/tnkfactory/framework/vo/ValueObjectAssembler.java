package com.tnkfactory.framework.vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ValueObjectAssembler implements Map<String, ValueObject>, Externalizable {
    public Map<String, ValueObject> a = new HashMap();

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ValueObject put(String str, ValueObject valueObject) {
        return this.a.put(str, valueObject);
    }

    @Override // java.util.Map
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, ValueObject>> entrySet() {
        return this.a.entrySet();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public ValueObject get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends ValueObject> map) {
        this.a.putAll(map);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        this.a = (Map) objectInput.readObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Map
    public ValueObject remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public Collection<ValueObject> values() {
        return this.a.values();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.a);
    }
}
