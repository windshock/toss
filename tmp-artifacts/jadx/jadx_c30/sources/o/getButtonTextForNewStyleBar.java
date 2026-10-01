package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getButtonTextForNewStyleBar extends jc2 implements Map<String, jc2>, Cloneable, Serializable {
    private static final long serialVersionUID = 1;
    private final Map<String, jc2> map = new LinkedHashMap();

    public getButtonTextForNewStyleBar(List<ea3> list) {
        for (ea3 ea3Var : list) {
            put(ea3Var.onExtraCallback(), ea3Var.onWarmupCompleted());
        }
    }

    public getButtonTextForNewStyleBar(String str, jc2 jc2Var) {
        put(str, jc2Var);
    }

    public getButtonTextForNewStyleBar() {
    }

    @Override // o.jc2
    public t_ IAuthTabCallback() {
        return t_.DOCUMENT;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jc2 get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public jc2 put(String str, jc2 jc2Var) {
        if (jc2Var == null) {
            throw new IllegalArgumentException(String.format("The value for key %s can not be null", str));
        }
        if (str.contains("\u0000")) {
            throw new initSingleCardInTwoCardStyle(String.format("BSON cstring '%s' is not valid because it contains a null character at index %d", str, Integer.valueOf(str.indexOf(0))));
        }
        return this.map.put(str, jc2Var);
    }

    @Override // java.util.Map
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public jc2 remove(Object obj) {
        return this.map.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends jc2> map) {
        for (Map.Entry<? extends String, ? extends jc2> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public Collection<jc2> values() {
        return this.map.values();
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, jc2>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getButtonTextForNewStyleBar) {
            return entrySet().equals(((getButtonTextForNewStyleBar) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public String onWarmupCompleted() {
        return IAuthTabCallback(new ltycx1());
    }

    public String IAuthTabCallback(ltycx1 ltycx1Var) {
        StringWriter stringWriter = new StringWriter();
        new pmi5().onWarmupCompleted(new setBackupVideoView(stringWriter, ltycx1Var), this, dv15.onExtraCallback().IAuthTabCallback());
        return stringWriter.toString();
    }

    public String toString() {
        return onWarmupCompleted();
    }

    @Override // 
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public getButtonTextForNewStyleBar clone() {
        getButtonTextForNewStyleBar getbuttontextfornewstylebar = new getButtonTextForNewStyleBar();
        for (Map.Entry<String, jc2> entry : entrySet()) {
            int i = AnonymousClass2.onWarmupCompleted[entry.getValue().IAuthTabCallback().ordinal()];
            if (i == 1) {
                getbuttontextfornewstylebar.put(entry.getKey(), entry.getValue().IAuthTabCallback_Parcel().clone());
            } else if (i == 2) {
                getbuttontextfornewstylebar.put(entry.getKey(), entry.getValue().onTransact().clone());
            } else if (i == 3) {
                getbuttontextfornewstylebar.put(entry.getKey(), initOneSlotMultipleAdsLayoutLandscape.onExtraCallbackWithResult(entry.getValue().IAuthTabCallbackDefault()));
            } else if (i == 4) {
                getbuttontextfornewstylebar.put(entry.getKey(), getOutline.IAuthTabCallback(entry.getValue().extraCallback()));
            } else {
                getbuttontextfornewstylebar.put(entry.getKey(), entry.getValue());
            }
        }
        return getbuttontextfornewstylebar;
    }

    /* renamed from: o.getButtonTextForNewStyleBar$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[t_.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[t_.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[t_.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[t_.BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[t_.JAVASCRIPT_WITH_SCOPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Object writeReplace() {
        return new onExtraCallbackWithResult(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    static class onExtraCallbackWithResult implements Serializable {
        private static final long serialVersionUID = 1;
        private final byte[] bytes;

        onExtraCallbackWithResult(getButtonTextForNewStyleBar getbuttontextfornewstylebar) {
            dv83 dv83Var = new dv83();
            new pmi5().onWarmupCompleted(new setShownAdCount(dv83Var), getbuttontextfornewstylebar, dv15.onExtraCallback().IAuthTabCallback());
            this.bytes = new byte[dv83Var.onNavigationEvent()];
            int iIAuthTabCallbackStub = 0;
            for (okzb1 okzb1Var : dv83Var.onWarmupCompleted()) {
                System.arraycopy(okzb1Var.IAuthTabCallback(), okzb1Var.IAuthTabCallbackStub(), this.bytes, iIAuthTabCallbackStub, okzb1Var.asInterface());
                iIAuthTabCallbackStub += okzb1Var.IAuthTabCallbackStub();
            }
        }

        private Object readResolve() {
            return new pmi5().onNavigationEvent(new setDownloadButtonData(ByteBuffer.wrap(this.bytes).order(ByteOrder.LITTLE_ENDIAN)), dv17.onExtraCallback().onExtraCallbackWithResult());
        }
    }
}
