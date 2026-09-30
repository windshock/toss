package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import com.google.android.material.button.MaterialButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;
import o.LazyStaggeredGridDslKtExternalSyntheticLambda1;
import o.LazyStaggeredGridMeasureKtExternalSyntheticLambda1;
import o.PagerKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazySaveableStateHolderExternalSyntheticLambda2<T extends onExtraCallbackWithResult<T>> {
    private static final LazySaveableStateHolderExternalSyntheticLambda2<?> onNavigationEvent = new LazySaveableStateHolderExternalSyntheticLambda2<>(true);
    private boolean IAuthTabCallback;
    private final PagerKtExternalSyntheticLambda1<T, Object> onExtraCallback;
    private boolean onExtraCallbackWithResult;

    public interface onExtraCallbackWithResult<T extends onExtraCallbackWithResult<T>> extends Comparable<T> {
        boolean IAuthTabCallback();

        PagerKtExternalSyntheticLambda6.onNavigationEvent onExtraCallback();

        LazyStaggeredGridMeasureKtExternalSyntheticLambda1.onExtraCallback onExtraCallbackWithResult(LazyStaggeredGridMeasureKtExternalSyntheticLambda1.onExtraCallback onextracallback, LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1);

        boolean onExtraCallbackWithResult();

        PagerKtExternalSyntheticLambda6.onExtraCallback onNavigationEvent();

        int onWarmupCompleted();
    }

    private LazySaveableStateHolderExternalSyntheticLambda2() {
        this.onExtraCallback = PagerKtExternalSyntheticLambda1.onExtraCallback();
    }

    private LazySaveableStateHolderExternalSyntheticLambda2(boolean z) {
        this(PagerKtExternalSyntheticLambda1.onExtraCallback());
        getInterfaceDescriptor();
    }

    private LazySaveableStateHolderExternalSyntheticLambda2(PagerKtExternalSyntheticLambda1<T, Object> pagerKtExternalSyntheticLambda1) {
        this.onExtraCallback = pagerKtExternalSyntheticLambda1;
        getInterfaceDescriptor();
    }

    public static <T extends onExtraCallbackWithResult<T>> LazySaveableStateHolderExternalSyntheticLambda2<T> IAuthTabCallback() {
        return new LazySaveableStateHolderExternalSyntheticLambda2<>();
    }

    public static <T extends onExtraCallbackWithResult<T>> LazySaveableStateHolderExternalSyntheticLambda2<T> onExtraCallback() {
        return (LazySaveableStateHolderExternalSyntheticLambda2<T>) onNavigationEvent;
    }

    boolean asInterface() {
        return this.onExtraCallback.isEmpty();
    }

    public void getInterfaceDescriptor() {
        if (this.IAuthTabCallback) {
            return;
        }
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            Map.Entry<K, Object> entryIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(i2);
            if (entryIAuthTabCallback.getValue() instanceof PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) {
                ((PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda0) entryIAuthTabCallback.getValue()).onActivityResized();
            }
        }
        this.onExtraCallback.asBinder();
        this.IAuthTabCallback = true;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazySaveableStateHolderExternalSyntheticLambda2) {
            return this.onExtraCallback.equals(((LazySaveableStateHolderExternalSyntheticLambda2) obj).onExtraCallback);
        }
        return false;
    }

    public int hashCode() {
        return this.onExtraCallback.hashCode();
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public LazySaveableStateHolderExternalSyntheticLambda2<T> clone() {
        LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback();
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            Map.Entry<K, Object> entryIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(i2);
            lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<T>) entryIAuthTabCallback.getKey(), entryIAuthTabCallback.getValue());
        }
        Iterator it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.onWarmupCompleted((LazySaveableStateHolderExternalSyntheticLambda2<T>) entry.getKey(), entry.getValue());
        }
        lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback.onExtraCallbackWithResult = this.onExtraCallbackWithResult;
        return lazySaveableStateHolderExternalSyntheticLambda2IAuthTabCallback;
    }

    public Iterator<Map.Entry<T, Object>> asBinder() {
        if (asInterface()) {
            return Collections.emptyIterator();
        }
        if (this.onExtraCallbackWithResult) {
            return new LazyStaggeredGridDslKtExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback.entrySet().iterator());
        }
        return this.onExtraCallback.entrySet().iterator();
    }

    Iterator<Map.Entry<T, Object>> onNavigationEvent() {
        if (asInterface()) {
            return Collections.emptyIterator();
        }
        if (this.onExtraCallbackWithResult) {
            return new LazyStaggeredGridDslKtExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback.onWarmupCompleted().iterator());
        }
        return this.onExtraCallback.onWarmupCompleted().iterator();
    }

    public Object onExtraCallbackWithResult(T t) {
        Object obj = this.onExtraCallback.get(t);
        return obj instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1 ? ((LazyStaggeredGridDslKtExternalSyntheticLambda1) obj).onNavigationEvent() : obj;
    }

    public void onWarmupCompleted(T t, Object obj) {
        if (t.IAuthTabCallback()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                onNavigationEvent((LazySaveableStateHolderExternalSyntheticLambda2<T>) t, it.next());
            }
            obj = arrayList;
        } else {
            onNavigationEvent((LazySaveableStateHolderExternalSyntheticLambda2<T>) t, obj);
        }
        if (obj instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1) {
            this.onExtraCallbackWithResult = true;
        }
        this.onExtraCallback.put(t, obj);
    }

    public void onExtraCallback(T t, Object obj) {
        List arrayList;
        if (!t.IAuthTabCallback()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        onNavigationEvent((LazySaveableStateHolderExternalSyntheticLambda2<T>) t, obj);
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<T>) t);
        if (objOnExtraCallbackWithResult == null) {
            arrayList = new ArrayList();
            this.onExtraCallback.put(t, arrayList);
        } else {
            arrayList = (List) objOnExtraCallbackWithResult;
        }
        arrayList.add(obj);
    }

    private void onNavigationEvent(T t, Object obj) {
        if (onNavigationEvent(t.onExtraCallback(), obj)) {
            return;
        }
        int iOnWarmupCompleted = t.onWarmupCompleted();
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(iOnWarmupCompleted), t.onExtraCallback().getJavaType(), obj.getClass().getName()));
    }

    private static boolean onNavigationEvent(PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, Object obj) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(obj);
        switch (AnonymousClass3.onExtraCallback[onnavigationevent.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof LazyLayoutKtExternalSyntheticLambda3) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted)) {
                }
                break;
            case 9:
                if ((obj instanceof LazyStaggeredGridMeasureKtExternalSyntheticLambda1) || (obj instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1)) {
                }
                break;
        }
        return false;
    }

    public boolean IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            if (!onNavigationEvent(this.onExtraCallback.IAuthTabCallback(i2))) {
                return false;
            }
        }
        Iterator it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            if (!onNavigationEvent((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends onExtraCallbackWithResult<T>> boolean onNavigationEvent(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.onNavigationEvent() != PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE) {
            return true;
        }
        if (key.IAuthTabCallback()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!onExtraCallback(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        return onExtraCallback(entry.getValue());
    }

    private static boolean onExtraCallback(Object obj) {
        if (obj instanceof LazyStaggeredGridKtExternalSyntheticLambda0) {
            return ((LazyStaggeredGridKtExternalSyntheticLambda0) obj).onMinimized();
        }
        if (obj instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static int IAuthTabCallback(PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, boolean z) {
        if (z) {
            return 2;
        }
        return onnavigationevent.getWireType();
    }

    public void onNavigationEvent(LazySaveableStateHolderExternalSyntheticLambda2<T> lazySaveableStateHolderExternalSyntheticLambda2) {
        int iOnExtraCallbackWithResult = lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallback.onExtraCallbackWithResult();
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            onExtraCallback((Map.Entry) lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallback.IAuthTabCallback(i2));
        }
        Iterator it = lazySaveableStateHolderExternalSyntheticLambda2.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            onExtraCallback((Map.Entry) it.next());
        }
    }

    private static Object onWarmupCompleted(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void onExtraCallback(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1;
        if (key.IAuthTabCallback()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<T>) key);
            if (objOnExtraCallbackWithResult == null) {
                objOnExtraCallbackWithResult = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objOnExtraCallbackWithResult).add(onWarmupCompleted(it.next()));
            }
            this.onExtraCallback.put(key, objOnExtraCallbackWithResult);
            return;
        }
        if (key.onNavigationEvent() != PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.onExtraCallback.put(key, onWarmupCompleted(value));
            return;
        }
        Object objOnExtraCallbackWithResult2 = onExtraCallbackWithResult((LazySaveableStateHolderExternalSyntheticLambda2<T>) key);
        if (objOnExtraCallbackWithResult2 == null) {
            this.onExtraCallback.put(key, onWarmupCompleted(value));
            if (z) {
                this.onExtraCallbackWithResult = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((LazyStaggeredGridDslKtExternalSyntheticLambda1) value).onNavigationEvent();
        }
        this.onExtraCallback.put(key, key.onExtraCallbackWithResult(((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) objOnExtraCallbackWithResult2).onUnminimized(), (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) value).onNavigationEvent());
    }

    static void onNavigationEvent(CodedOutputStream codedOutputStream, PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, int i2, Object obj) throws IOException {
        if (onnavigationevent == PagerKtExternalSyntheticLambda6.onNavigationEvent.GROUP) {
            codedOutputStream.onWarmupCompleted(i2, (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
        } else {
            codedOutputStream.access000(i2, IAuthTabCallback(onnavigationevent, false));
            onNavigationEvent(codedOutputStream, onnavigationevent, obj);
        }
    }

    /* renamed from: o.LazySaveableStateHolderExternalSyntheticLambda2$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] onExtraCallback;
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[PagerKtExternalSyntheticLambda6.onNavigationEvent.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[PagerKtExternalSyntheticLambda6.onNavigationEvent.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onNavigationEvent[PagerKtExternalSyntheticLambda6.onNavigationEvent.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[PagerKtExternalSyntheticLambda6.onExtraCallback.values().length];
            onExtraCallback = iArr2;
            try {
                iArr2[PagerKtExternalSyntheticLambda6.onExtraCallback.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                onExtraCallback[PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    static void onNavigationEvent(CodedOutputStream codedOutputStream, PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, Object obj) throws IOException {
        switch (AnonymousClass3.onNavigationEvent[onnavigationevent.ordinal()]) {
            case 1:
                codedOutputStream.onExtraCallbackWithResult(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.onWarmupCompleted(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.asInterface(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.access000(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.IAuthTabCallbackStubProxy(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.onTransact(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.access000(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.onExtraCallback(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.onWarmupCompleted((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
                break;
            case 10:
                codedOutputStream.onNavigationEvent((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
                break;
            case 11:
                if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    codedOutputStream.onNavigationEvent((LazyLayoutKtExternalSyntheticLambda3) obj);
                    break;
                } else {
                    codedOutputStream.onNavigationEvent((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    codedOutputStream.onNavigationEvent((LazyLayoutKtExternalSyntheticLambda3) obj);
                    break;
                } else {
                    codedOutputStream.onExtraCallbackWithResult((byte[]) obj);
                    break;
                }
            case 13:
                codedOutputStream.writeTypedObject(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.access100(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.asBinder(((Long) obj).longValue());
                break;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                codedOutputStream.getInterfaceDescriptor(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.IAuthTabCallbackDefault(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted) {
                    codedOutputStream.IAuthTabCallback_Parcel(((LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted) obj).getNumber());
                    break;
                } else {
                    codedOutputStream.IAuthTabCallback_Parcel(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public int onTransact() {
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        int iIAuthTabCallback = 0;
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            Map.Entry<K, Object> entryIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(i2);
            iIAuthTabCallback += IAuthTabCallback((onExtraCallbackWithResult<?>) entryIAuthTabCallback.getKey(), entryIAuthTabCallback.getValue());
        }
        Iterator it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iIAuthTabCallback += IAuthTabCallback((onExtraCallbackWithResult<?>) entry.getKey(), entry.getValue());
        }
        return iIAuthTabCallback;
    }

    public int onWarmupCompleted() {
        int iOnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = 0;
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            iOnExtraCallbackWithResult2 += onExtraCallbackWithResult(this.onExtraCallback.IAuthTabCallback(i2));
        }
        Iterator it = this.onExtraCallback.IAuthTabCallback().iterator();
        while (it.hasNext()) {
            iOnExtraCallbackWithResult2 += onExtraCallbackWithResult((Map.Entry) it.next());
        }
        return iOnExtraCallbackWithResult2;
    }

    private int onExtraCallbackWithResult(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.onNavigationEvent() == PagerKtExternalSyntheticLambda6.onExtraCallback.MESSAGE && !key.IAuthTabCallback() && !key.onExtraCallbackWithResult()) {
            if (value instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1) {
                return CodedOutputStream.IAuthTabCallback(entry.getKey().onWarmupCompleted(), (LazyStaggeredGridDslKtExternalSyntheticLambda1) value);
            }
            return CodedOutputStream.onExtraCallback(entry.getKey().onWarmupCompleted(), (LazyStaggeredGridMeasureKtExternalSyntheticLambda1) value);
        }
        return IAuthTabCallback((onExtraCallbackWithResult<?>) key, value);
    }

    static int onExtraCallbackWithResult(PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, int i2, Object obj) {
        int iAsInterface = CodedOutputStream.asInterface(i2);
        if (onnavigationevent == PagerKtExternalSyntheticLambda6.onNavigationEvent.GROUP) {
            iAsInterface <<= 1;
        }
        return iAsInterface + onWarmupCompleted(onnavigationevent, obj);
    }

    static int onWarmupCompleted(PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationevent, Object obj) {
        switch (AnonymousClass3.onNavigationEvent[onnavigationevent.ordinal()]) {
            case 1:
                return CodedOutputStream.onWarmupCompleted(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.onExtraCallback(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.IAuthTabCallback(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.onExtraCallback(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.onNavigationEvent(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.onWarmupCompleted(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.onWarmupCompleted(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.onWarmupCompleted(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.onExtraCallbackWithResult((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
            case 10:
                if (obj instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1) {
                    return CodedOutputStream.onWarmupCompleted((LazyStaggeredGridDslKtExternalSyntheticLambda1) obj);
                }
                return CodedOutputStream.IAuthTabCallback((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
            case 11:
                if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    return CodedOutputStream.IAuthTabCallback((LazyLayoutKtExternalSyntheticLambda3) obj);
                }
                return CodedOutputStream.onExtraCallbackWithResult((String) obj);
            case 12:
                if (obj instanceof LazyLayoutKtExternalSyntheticLambda3) {
                    return CodedOutputStream.IAuthTabCallback((LazyLayoutKtExternalSyntheticLambda3) obj);
                }
                return CodedOutputStream.onExtraCallback((byte[]) obj);
            case 13:
                return CodedOutputStream.onTransact(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.IAuthTabCallbackDefault(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.onNavigationEvent(((Long) obj).longValue());
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return CodedOutputStream.asBinder(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.onExtraCallbackWithResult(((Long) obj).longValue());
            case 18:
                if (obj instanceof LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted) {
                    return CodedOutputStream.onExtraCallbackWithResult(((LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted) obj).getNumber());
                }
                return CodedOutputStream.onExtraCallbackWithResult(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int IAuthTabCallback(onExtraCallbackWithResult<?> onextracallbackwithresult, Object obj) {
        PagerKtExternalSyntheticLambda6.onNavigationEvent onnavigationeventOnExtraCallback = onextracallbackwithresult.onExtraCallback();
        int iOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        if (onextracallbackwithresult.IAuthTabCallback()) {
            List list = (List) obj;
            int size = list.size();
            int i2 = 0;
            if (!onextracallbackwithresult.onExtraCallbackWithResult()) {
                int iOnExtraCallbackWithResult = 0;
                while (i2 < size) {
                    iOnExtraCallbackWithResult += onExtraCallbackWithResult(onnavigationeventOnExtraCallback, iOnWarmupCompleted, list.get(i2));
                    i2++;
                }
                return iOnExtraCallbackWithResult;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int iOnWarmupCompleted2 = 0;
            while (i2 < size) {
                iOnWarmupCompleted2 += onWarmupCompleted(onnavigationeventOnExtraCallback, list.get(i2));
                i2++;
            }
            return CodedOutputStream.asInterface(iOnWarmupCompleted) + iOnWarmupCompleted2 + CodedOutputStream.onTransact(iOnWarmupCompleted2);
        }
        return onExtraCallbackWithResult(onnavigationeventOnExtraCallback, iOnWarmupCompleted, obj);
    }
}
