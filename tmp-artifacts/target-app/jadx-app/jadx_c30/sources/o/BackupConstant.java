package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class BackupConstant implements Serializable {
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean fieldSeparatorAtEnd;
    private boolean fieldSeparatorAtStart;
    private boolean useShortClassName;
    public static final BackupConstant onExtraCallback = new onExtraCallbackWithResult();
    public static final BackupConstant onWarmupCompleted = new onWarmupCompleted();
    public static final BackupConstant onExtraCallbackWithResult = new onNavigationEvent();
    public static final BackupConstant asBinder = new asInterface();
    public static final BackupConstant IAuthTabCallbackDefault = new IAuthTabCallbackDefault();
    public static final BackupConstant IAuthTabCallback = new IAuthTabCallback();
    public static final BackupConstant onNavigationEvent = new onExtraCallback();
    private static final ThreadLocal<WeakHashMap<Object, Object>> asInterface = new ThreadLocal<>();
    private boolean useFieldNames = true;
    private boolean useClassName = true;
    private boolean useIdentityHashCode = true;
    private String contentStart = "[";
    private String contentEnd = "]";
    private String fieldNameValueSeparator = "=";
    private String fieldSeparator = ",";
    private String arrayStart = "{";
    private String arraySeparator = ",";
    private boolean arrayContentDetail = true;
    private String arrayEnd = "}";
    private boolean defaultFullDetail = true;
    private String nullText = "<null>";
    private String sizeStartText = "<size=";
    private String sizeEndText = ">";
    private String summaryObjectStartText = "<";
    private String summaryObjectEndText = ">";

    static Map<Object, Object> onExtraCallbackWithResult() {
        return asInterface.get();
    }

    static boolean onExtraCallbackWithResult(Object obj) {
        Map<Object, Object> mapOnExtraCallbackWithResult = onExtraCallbackWithResult();
        return mapOnExtraCallbackWithResult != null && mapOnExtraCallbackWithResult.containsKey(obj);
    }

    static void onNavigationEvent(Object obj) {
        if (obj != null) {
            if (onExtraCallbackWithResult() == null) {
                asInterface.set(new WeakHashMap<>());
            }
            onExtraCallbackWithResult().put(obj, null);
        }
    }

    static void IAuthTabCallback(Object obj) {
        Map<Object, Object> mapOnExtraCallbackWithResult;
        if (obj == null || (mapOnExtraCallbackWithResult = onExtraCallbackWithResult()) == null) {
            return;
        }
        mapOnExtraCallbackWithResult.remove(obj);
        if (mapOnExtraCallbackWithResult.isEmpty()) {
            asInterface.remove();
        }
    }

    public void onNavigationEvent(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            onExtraCallbackWithResult(stringBuffer, obj);
            IAuthTabCallback(stringBuffer, obj);
            onNavigationEvent(stringBuffer);
            if (this.fieldSeparatorAtStart) {
                onExtraCallback(stringBuffer);
            }
        }
    }

    public void onExtraCallback(StringBuffer stringBuffer, Object obj) {
        if (!this.fieldSeparatorAtEnd) {
            onWarmupCompleted(stringBuffer);
        }
        IAuthTabCallback(stringBuffer);
        IAuthTabCallback(obj);
    }

    protected void onWarmupCompleted(StringBuffer stringBuffer) {
        if (PAGAppOpenAd.onWarmupCompleted(stringBuffer, this.fieldSeparator)) {
            stringBuffer.setLength(stringBuffer.length() - this.fieldSeparator.length());
        }
    }

    public void onNavigationEvent(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        onExtraCallback(stringBuffer, str);
        if (obj == null) {
            onNavigationEvent(stringBuffer, str);
        } else {
            onWarmupCompleted(stringBuffer, str, obj, onWarmupCompleted(bool));
        }
        onWarmupCompleted(stringBuffer, str);
    }

    protected void onWarmupCompleted(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (onExtraCallbackWithResult(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            onExtraCallback(stringBuffer, str, obj);
            return;
        }
        onNavigationEvent(obj);
        try {
            if (obj instanceof Collection) {
                if (z) {
                    onExtraCallback(stringBuffer, str, (Collection<?>) obj);
                } else {
                    IAuthTabCallback(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z) {
                    onExtraCallbackWithResult(stringBuffer, str, (Map<?, ?>) obj);
                } else {
                    IAuthTabCallback(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z) {
                    IAuthTabCallback(stringBuffer, str, (long[]) obj);
                } else {
                    onExtraCallback(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z) {
                    onExtraCallback(stringBuffer, str, (int[]) obj);
                } else {
                    onWarmupCompleted(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z) {
                    IAuthTabCallback(stringBuffer, str, (short[]) obj);
                } else {
                    onExtraCallbackWithResult(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z) {
                    IAuthTabCallback(stringBuffer, str, (byte[]) obj);
                } else {
                    onExtraCallbackWithResult(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z) {
                    onExtraCallbackWithResult(stringBuffer, str, (char[]) obj);
                } else {
                    onExtraCallback(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z) {
                    onWarmupCompleted(stringBuffer, str, (double[]) obj);
                } else {
                    IAuthTabCallback(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z) {
                    onNavigationEvent(stringBuffer, str, (float[]) obj);
                } else {
                    onExtraCallback(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z) {
                    onExtraCallbackWithResult(stringBuffer, str, (boolean[]) obj);
                } else {
                    onNavigationEvent(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z) {
                    IAuthTabCallback(stringBuffer, str, (Object[]) obj);
                } else {
                    onNavigationEvent(stringBuffer, str, (Object[]) obj);
                }
            } else if (z) {
                onNavigationEvent(stringBuffer, str, obj);
            } else {
                onExtraCallbackWithResult(stringBuffer, str, obj);
            }
        } finally {
            IAuthTabCallback(obj);
        }
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, Object obj) {
        PAGAppOpenAd1.onNavigationEvent(stringBuffer, obj);
    }

    public void onNavigationEvent(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.summaryObjectStartText);
        stringBuffer.append(onExtraCallbackWithResult(obj.getClass()));
        stringBuffer.append(this.summaryObjectEndText);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append((int) s);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append((int) b);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    public void IAuthTabCallback(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < objArr.length; i++) {
            onNavigationEvent(stringBuffer, str, i, objArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, int i, Object obj) {
        if (i > 0) {
            stringBuffer.append(this.arraySeparator);
        }
        if (obj == null) {
            onNavigationEvent(stringBuffer, str);
        } else {
            onWarmupCompleted(stringBuffer, str, obj, this.arrayContentDetail);
        }
    }

    public void onWarmupCompleted(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.arrayStart);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            onNavigationEvent(stringBuffer, str, i, Array.get(obj, i));
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, Object[] objArr) {
        IAuthTabCallback(stringBuffer, str, objArr.length);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallbackWithResult(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, long[] jArr) {
        IAuthTabCallback(stringBuffer, str, jArr.length);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallback(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onWarmupCompleted(StringBuffer stringBuffer, String str, int[] iArr) {
        IAuthTabCallback(stringBuffer, str, iArr.length);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallback(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, short[] sArr) {
        IAuthTabCallback(stringBuffer, str, sArr.length);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onNavigationEvent(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, byte[] bArr) {
        IAuthTabCallback(stringBuffer, str, bArr.length);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallbackWithResult(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, char[] cArr) {
        IAuthTabCallback(stringBuffer, str, cArr.length);
    }

    protected void onWarmupCompleted(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onNavigationEvent(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, String str, double[] dArr) {
        IAuthTabCallback(stringBuffer, str, dArr.length);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallback(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str, float[] fArr) {
        IAuthTabCallback(stringBuffer, str, fArr.length);
    }

    protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            onExtraCallback(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str, boolean[] zArr) {
        IAuthTabCallback(stringBuffer, str, zArr.length);
    }

    public void onExtraCallbackWithResult(StringBuffer stringBuffer, Object obj) {
        if (!this.useClassName || obj == null) {
            return;
        }
        onNavigationEvent(obj);
        if (this.useShortClassName) {
            stringBuffer.append(onExtraCallbackWithResult(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    public void IAuthTabCallback(StringBuffer stringBuffer, Object obj) {
        if (!IAuthTabCallbackDefault() || obj == null) {
            return;
        }
        onNavigationEvent(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    protected void onNavigationEvent(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentStart);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentEnd);
    }

    protected void onNavigationEvent(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.nullText);
    }

    protected void onExtraCallback(StringBuffer stringBuffer) {
        stringBuffer.append(this.fieldSeparator);
    }

    protected void onExtraCallback(StringBuffer stringBuffer, String str) {
        if (!this.useFieldNames || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.fieldNameValueSeparator);
    }

    protected void onWarmupCompleted(StringBuffer stringBuffer, String str) {
        onExtraCallback(stringBuffer);
    }

    protected void IAuthTabCallback(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.sizeStartText);
        stringBuffer.append(i);
        stringBuffer.append(this.sizeEndText);
    }

    protected boolean onWarmupCompleted(Boolean bool) {
        if (bool == null) {
            return this.defaultFullDetail;
        }
        return bool.booleanValue();
    }

    protected String onExtraCallbackWithResult(Class<?> cls) {
        return onVideoError.onExtraCallback(cls);
    }

    protected void onExtraCallback(boolean z) {
        this.useClassName = z;
    }

    protected void IAuthTabCallback(boolean z) {
        this.useShortClassName = z;
    }

    protected boolean IAuthTabCallbackDefault() {
        return this.useIdentityHashCode;
    }

    protected void onExtraCallbackWithResult(boolean z) {
        this.useIdentityHashCode = z;
    }

    protected void onNavigationEvent(boolean z) {
        this.useFieldNames = z;
    }

    protected String onNavigationEvent() {
        return this.arrayStart;
    }

    protected void IAuthTabCallback(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.arrayStart = str;
    }

    protected String IAuthTabCallback() {
        return this.arrayEnd;
    }

    protected void onNavigationEvent(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.arrayEnd = str;
    }

    protected String onExtraCallback() {
        return this.contentStart;
    }

    protected void onExtraCallback(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.contentStart = str;
    }

    protected String onWarmupCompleted() {
        return this.contentEnd;
    }

    protected void onWarmupCompleted(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.contentEnd = str;
    }

    protected void onExtraCallbackWithResult(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.fieldNameValueSeparator = str;
    }

    protected void asInterface(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.fieldSeparator = str;
    }

    protected void onWarmupCompleted(boolean z) {
        this.fieldSeparatorAtStart = z;
    }

    public String onTransact() {
        return this.nullText;
    }

    protected void onTransact(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.nullText = str;
    }

    protected void asBinder(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.sizeStartText = str;
    }

    protected void IAuthTabCallbackDefault(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.sizeEndText = str;
    }

    protected void getInterfaceDescriptor(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.summaryObjectStartText = str;
    }

    protected void IAuthTabCallbackStub(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        this.summaryObjectEndText = str;
    }

    static final class onExtraCallbackWithResult extends BackupConstant {
        private static final long serialVersionUID = 1;

        onExtraCallbackWithResult() {
        }

        private Object readResolve() {
            return BackupConstant.onExtraCallback;
        }
    }

    static final class onNavigationEvent extends BackupConstant {
        private static final long serialVersionUID = 1;

        onNavigationEvent() {
            onNavigationEvent(false);
        }

        private Object readResolve() {
            return BackupConstant.onExtraCallbackWithResult;
        }
    }

    static final class asInterface extends BackupConstant {
        private static final long serialVersionUID = 1;

        asInterface() {
            IAuthTabCallback(true);
            onExtraCallbackWithResult(false);
        }

        private Object readResolve() {
            return BackupConstant.asBinder;
        }
    }

    static final class IAuthTabCallbackDefault extends BackupConstant {
        private static final long serialVersionUID = 1;

        IAuthTabCallbackDefault() {
            onExtraCallback(false);
            onExtraCallbackWithResult(false);
            onNavigationEvent(false);
            onExtraCallback(BuildConfig.FLAVOR);
            onWarmupCompleted(BuildConfig.FLAVOR);
        }

        private Object readResolve() {
            return BackupConstant.IAuthTabCallbackDefault;
        }
    }

    static final class onWarmupCompleted extends BackupConstant {
        private static final long serialVersionUID = 1;

        onWarmupCompleted() {
            onExtraCallback("[");
            asInterface(System.lineSeparator() + "  ");
            onWarmupCompleted(true);
            onWarmupCompleted(System.lineSeparator() + "]");
        }

        private Object readResolve() {
            return BackupConstant.onWarmupCompleted;
        }
    }

    static final class IAuthTabCallback extends BackupConstant {
        private static final long serialVersionUID = 1;

        IAuthTabCallback() {
            onExtraCallback(false);
            onExtraCallbackWithResult(false);
        }

        private Object readResolve() {
            return BackupConstant.IAuthTabCallback;
        }
    }

    static final class onExtraCallback extends BackupConstant {
        private static final long serialVersionUID = 1;

        onExtraCallback() {
            onExtraCallback(false);
            onExtraCallbackWithResult(false);
            onExtraCallback("{");
            onWarmupCompleted("}");
            IAuthTabCallback("[");
            onNavigationEvent("]");
            asInterface(",");
            onExtraCallbackWithResult(":");
            onTransact("null");
            getInterfaceDescriptor("\"<");
            IAuthTabCallbackStub(">\"");
            asBinder("\"<size=");
            IAuthTabCallbackDefault(">\"");
        }

        @Override // o.BackupConstant
        public void onNavigationEvent(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!onWarmupCompleted(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.onNavigationEvent(stringBuffer, str, obj, bool);
        }

        @Override // o.BackupConstant
        protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, char c) {
            IAuthTabCallback(stringBuffer, String.valueOf(c));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.BackupConstant
        public void onNavigationEvent(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                onNavigationEvent(stringBuffer, str);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Character)) {
                IAuthTabCallback(stringBuffer, obj.toString());
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
                return;
            }
            String string = obj.toString();
            if (IAuthTabCallback_Parcel(string) || access100(string)) {
                stringBuffer.append(obj);
            } else {
                onNavigationEvent(stringBuffer, str, string);
            }
        }

        @Override // o.BackupConstant
        protected void onExtraCallback(StringBuffer stringBuffer, String str, Collection<?> collection) {
            if (collection != null && !collection.isEmpty()) {
                stringBuffer.append(onNavigationEvent());
                Iterator<?> it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    onNavigationEvent(stringBuffer, str, i, it.next());
                    i++;
                }
                stringBuffer.append(IAuthTabCallback());
                return;
            }
            stringBuffer.append(collection);
        }

        @Override // o.BackupConstant
        protected void onExtraCallbackWithResult(StringBuffer stringBuffer, String str, Map<?, ?> map) {
            if (map != null && !map.isEmpty()) {
                stringBuffer.append(onExtraCallback());
                boolean z = true;
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    String string = Objects.toString(entry.getKey(), null);
                    if (string != null) {
                        if (z) {
                            z = false;
                        } else {
                            onWarmupCompleted(stringBuffer, string);
                        }
                        onExtraCallback(stringBuffer, string);
                        Object value = entry.getValue();
                        if (value == null) {
                            onNavigationEvent(stringBuffer, string);
                        } else {
                            onWarmupCompleted(stringBuffer, string, value, true);
                        }
                    }
                }
                stringBuffer.append(onWarmupCompleted());
                return;
            }
            stringBuffer.append(map);
        }

        private boolean access100(String str) {
            return str.startsWith(onNavigationEvent()) && str.endsWith(IAuthTabCallback());
        }

        private boolean IAuthTabCallback_Parcel(String str) {
            return str.startsWith(onExtraCallback()) && str.endsWith(onWarmupCompleted());
        }

        private void IAuthTabCallback(StringBuffer stringBuffer, String str) {
            stringBuffer.append('\"');
            stringBuffer.append(PAGAppOpenAdInteractionCallback.onExtraCallbackWithResult(str));
            stringBuffer.append('\"');
        }

        @Override // o.BackupConstant
        protected void onExtraCallback(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            super.onExtraCallback(stringBuffer, "\"" + PAGAppOpenAdInteractionCallback.onExtraCallbackWithResult(str) + "\"");
        }

        private Object readResolve() {
            return BackupConstant.onNavigationEvent;
        }
    }
}
