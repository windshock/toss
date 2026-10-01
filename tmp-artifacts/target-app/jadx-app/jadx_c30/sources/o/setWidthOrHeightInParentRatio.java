package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setWidthOrHeightInParentRatio<T> extends getButtonTextForNewStyleBar {
    private static final long serialVersionUID = 1;
    private final transient dv13<T> onExtraCallback;
    private final transient T onWarmupCompleted;
    private getButtonTextForNewStyleBar unwrapped;

    public T onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public dv13<T> onExtraCallback() {
        return this.onExtraCallback;
    }

    public boolean asInterface() {
        return this.unwrapped != null;
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public int size() {
        return onActivityLayout().size();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean isEmpty() {
        return onActivityLayout().isEmpty();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean containsKey(Object obj) {
        return onActivityLayout().containsKey(obj);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean containsValue(Object obj) {
        return onActivityLayout().containsValue(obj);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    /* renamed from: onExtraCallbackWithResult */
    public jc2 get(Object obj) {
        return onActivityLayout().get(obj);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    /* renamed from: onExtraCallbackWithResult */
    public jc2 put(String str, jc2 jc2Var) {
        return onActivityLayout().put(str, jc2Var);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    /* renamed from: onNavigationEvent */
    public jc2 remove(Object obj) {
        return onActivityLayout().remove(obj);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public void putAll(Map<? extends String, ? extends jc2> map) {
        super.putAll(map);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public void clear() {
        super.clear();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Set<String> keySet() {
        return onActivityLayout().keySet();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Collection<jc2> values() {
        return onActivityLayout().values();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public Set<Map.Entry<String, jc2>> entrySet() {
        return onActivityLayout().entrySet();
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public boolean equals(Object obj) {
        return onActivityLayout().equals(obj);
    }

    @Override // o.getButtonTextForNewStyleBar, java.util.Map
    public int hashCode() {
        return onActivityLayout().hashCode();
    }

    @Override // o.getButtonTextForNewStyleBar
    public String toString() {
        return onActivityLayout().toString();
    }

    @Override // o.getButtonTextForNewStyleBar
    /* renamed from: onNavigationEvent */
    public getButtonTextForNewStyleBar clone() {
        return onActivityLayout().clone();
    }

    private getButtonTextForNewStyleBar onActivityLayout() {
        if (this.onExtraCallback == null) {
            throw new wie3("Can not unwrap a BsonDocumentWrapper with no Encoder");
        }
        if (this.unwrapped == null) {
            getButtonTextForNewStyleBar getbuttontextfornewstylebar = new getButtonTextForNewStyleBar();
            this.onExtraCallback.onWarmupCompleted(new setRatio(getbuttontextfornewstylebar), this.onWarmupCompleted, dv15.onExtraCallback().IAuthTabCallback());
            this.unwrapped = getbuttontextfornewstylebar;
        }
        return this.unwrapped;
    }

    private Object writeReplace() {
        return onActivityLayout();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
}
