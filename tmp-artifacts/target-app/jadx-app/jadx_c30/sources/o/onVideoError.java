package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onVideoError {
    private static final Map<String, String> IAuthTabCallback;
    private static final Map<String, String> IAuthTabCallbackDefault;
    private static final Map<Class<?>, Class<?>> asInterface;
    public static final String onExtraCallback = "$";
    public static final String onExtraCallbackWithResult = ".";
    private static final Map<Class<?>, Class<?>> onNavigationEvent;
    private static final Map<String, Class<?>> onWarmupCompleted;

    static {
        HashMap map = new HashMap();
        onWarmupCompleted = map;
        Class cls = Boolean.TYPE;
        map.put("boolean", cls);
        Class cls2 = Byte.TYPE;
        map.put("byte", cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Short.TYPE;
        map.put("short", cls4);
        Class cls5 = Integer.TYPE;
        map.put("int", cls5);
        Class cls6 = Long.TYPE;
        map.put("long", cls6);
        Class cls7 = Double.TYPE;
        map.put("double", cls7);
        Class cls8 = Float.TYPE;
        map.put("float", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        HashMap map2 = new HashMap();
        onNavigationEvent = map2;
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls4, Short.class);
        map2.put(cls5, Integer.class);
        map2.put(cls6, Long.class);
        map2.put(cls7, Double.class);
        map2.put(cls8, Float.class);
        map2.put(cls9, cls9);
        asInterface = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Class<?> cls10 = (Class) entry.getKey();
            Class<?> cls11 = (Class) entry.getValue();
            if (!cls10.equals(cls11)) {
                asInterface.put(cls11, cls10);
            }
        }
        HashMap map3 = new HashMap();
        map3.put("int", "I");
        map3.put("boolean", "Z");
        map3.put("float", "F");
        map3.put("long", "J");
        map3.put("short", "S");
        map3.put("byte", "B");
        map3.put("double", "D");
        map3.put("char", "C");
        HashMap map4 = new HashMap();
        for (Map.Entry entry2 : map3.entrySet()) {
            map4.put(entry2.getValue(), entry2.getKey());
        }
        IAuthTabCallback = Collections.unmodifiableMap(map3);
        IAuthTabCallbackDefault = Collections.unmodifiableMap(map4);
    }

    public static String onExtraCallback(Class<?> cls) {
        if (cls == null) {
            return BuildConfig.FLAVOR;
        }
        return onExtraCallbackWithResult(cls.getName());
    }

    public static String onExtraCallbackWithResult(String str) {
        if (PAGAppOpenAd.onExtraCallback(str)) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = IAuthTabCallbackDefault;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int iIndexOf = str.indexOf(36, iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (iIndexOf != -1) {
            strSubstring = strSubstring.replace('$', '.');
        }
        return strSubstring + ((Object) sb);
    }

    public static boolean onExtraCallback(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!getVideoProgress.IAuthTabCallback(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = getVideoProgress.asBinder;
        }
        if (clsArr2 == null) {
            clsArr2 = getVideoProgress.asBinder;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!onExtraCallbackWithResult(clsArr[i], clsArr2[i], z)) {
                return false;
            }
        }
        return true;
    }

    public static boolean onWarmupCompleted(Class<?> cls) {
        return asInterface.containsKey(cls);
    }

    public static boolean onNavigationEvent(Class<?> cls, Class<?> cls2) {
        return onExtraCallbackWithResult(cls, cls2, true);
    }

    public static boolean onExtraCallbackWithResult(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = onNavigationEvent(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = onExtraCallbackWithResult(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            Class cls3 = Integer.TYPE;
            boolean zEquals = cls3.equals(cls);
            Class cls4 = Long.TYPE;
            Class cls5 = Double.TYPE;
            Class cls6 = Float.TYPE;
            if (zEquals) {
                return cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
            }
            if (cls4.equals(cls)) {
                return cls6.equals(cls2) || cls5.equals(cls2);
            }
            if (Boolean.TYPE.equals(cls) || cls5.equals(cls)) {
                return false;
            }
            if (cls6.equals(cls)) {
                return cls5.equals(cls2);
            }
            if (Character.TYPE.equals(cls)) {
                return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
            }
            Class cls7 = Short.TYPE;
            if (cls7.equals(cls)) {
                return cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
            }
            if (Byte.TYPE.equals(cls)) {
                return cls7.equals(cls2) || cls3.equals(cls2) || cls4.equals(cls2) || cls6.equals(cls2) || cls5.equals(cls2);
            }
            return false;
        }
        return cls2.isAssignableFrom(cls);
    }

    public static Class<?> onNavigationEvent(Class<?> cls) {
        return (cls == null || !cls.isPrimitive()) ? cls : onNavigationEvent.get(cls);
    }

    public static Class<?> onExtraCallbackWithResult(Class<?> cls) {
        return asInterface.get(cls);
    }

    public static /* synthetic */ Iterator IAuthTabCallback(Class cls) {
        final wwx7 wwx7Var = new wwx7(cls);
        return new Iterator<Class<?>>() { // from class: o.onVideoError.2
            @Override // java.util.Iterator
            public boolean hasNext() {
                return wwx7Var.onExtraCallbackWithResult() != null;
            }

            @Override // java.util.Iterator
            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public Class<?> next() {
                Class<?> cls2 = (Class) wwx7Var.onExtraCallbackWithResult();
                wwx7Var.onExtraCallback(cls2.getSuperclass());
                return cls2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static /* synthetic */ Iterator IAuthTabCallback(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final Iterator it = iterable.iterator();
        return new Iterator<Class<?>>() { // from class: o.onVideoError.1
            Iterator onExtraCallbackWithResult = Collections.EMPTY_SET.iterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.onExtraCallbackWithResult.hasNext() || it.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public Class<?> next() {
                if (this.onExtraCallbackWithResult.hasNext()) {
                    Class<?> cls = (Class) this.onExtraCallbackWithResult.next();
                    hashSet.add(cls);
                    return cls;
                }
                Class<?> cls2 = (Class) it.next();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                onExtraCallbackWithResult(linkedHashSet, cls2);
                this.onExtraCallbackWithResult = linkedHashSet.iterator();
                return cls2;
            }

            private void onExtraCallbackWithResult(Set<Class<?>> set, Class<?> cls) {
                for (Class<?> cls2 : cls.getInterfaces()) {
                    if (!hashSet.contains(cls2)) {
                        set.add(cls2);
                    }
                    onExtraCallbackWithResult(set, cls2);
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
