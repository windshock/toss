package o;

import j$.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Function;
import o.initListener;
import org.apache.commons.text.lookup.ResourceBundleStringLookup;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class initListener {
    public static final initListener IAuthTabCallback = new initListener();
    static final ry4<String> onExtraCallback = ry4.onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.StringLookupFactory$$ExternalSyntheticLambda0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return initListener.onExtraCallbackWithResult((String) obj);
        }
    });
    static final ry4<String> onWarmupCompleted = ry4.onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.StringLookupFactory$$ExternalSyntheticLambda1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Base64.getEncoder().encodeToString(((String) obj).getBytes(StandardCharsets.ISO_8859_1));
        }
    });
    static final ry4<String> onExtraCallbackWithResult = ry4.onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.StringLookupFactory$$ExternalSyntheticLambda2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return System.getenv((String) obj);
        }
    });
    static final ry4<String> onNavigationEvent = ry4.onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.StringLookupFactory$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return initListener.IAuthTabCallback((String) obj);
        }
    });
    static final ry4<String> IAuthTabCallbackDefault = ry4.onExtraCallback(new Function() { // from class: org.apache.commons.text.lookup.StringLookupFactory$$ExternalSyntheticLambda4
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return System.getProperty((String) obj);
        }
    });

    public static /* synthetic */ String IAuthTabCallback(String str) {
        return null;
    }

    static final class onWarmupCompleted {
        static final onWarmupCompleted onExtraCallback = new onWarmupCompleted(System.getProperties());
        private final Map<String, zb7> onNavigationEvent;

        private static void onExtraCallbackWithResult(ry5 ry5Var, Map<String, zb7> map) {
            map.put(initListener.onExtraCallback(ry5Var.getKey()), ry5Var.getStringLookup());
            if (ry5.BASE64_DECODER.equals(ry5Var)) {
                map.put(initListener.onExtraCallback("base64"), ry5Var.getStringLookup());
            }
        }

        private static Map<String, zb7> onExtraCallbackWithResult() {
            HashMap map = new HashMap();
            onExtraCallbackWithResult(ry5.BASE64_DECODER, map);
            onExtraCallbackWithResult(ry5.BASE64_ENCODER, map);
            onExtraCallbackWithResult(ry5.CONST, map);
            onExtraCallbackWithResult(ry5.DATE, map);
            onExtraCallbackWithResult(ry5.ENVIRONMENT, map);
            onExtraCallbackWithResult(ry5.FILE, map);
            onExtraCallbackWithResult(ry5.JAVA, map);
            onExtraCallbackWithResult(ry5.LOCAL_HOST, map);
            onExtraCallbackWithResult(ry5.PROPERTIES, map);
            onExtraCallbackWithResult(ry5.RESOURCE_BUNDLE, map);
            onExtraCallbackWithResult(ry5.SYSTEM_PROPERTIES, map);
            onExtraCallbackWithResult(ry5.URL_DECODER, map);
            onExtraCallbackWithResult(ry5.URL_ENCODER, map);
            onExtraCallbackWithResult(ry5.XML, map);
            return map;
        }

        private static Map<String, zb7> onExtraCallbackWithResult(String str) {
            HashMap map = new HashMap();
            try {
                for (String str2 : str.split("[\\s,]+")) {
                    if (!str2.isEmpty()) {
                        onExtraCallbackWithResult(ry5.valueOf(str2.toUpperCase()), map);
                    }
                }
                return map;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid default string lookups definition: " + str, e);
            }
        }

        onWarmupCompleted(Properties properties) {
            Map<String, zb7> mapOnExtraCallbackWithResult;
            if (properties.containsKey("org.apache.commons.text.lookup.StringLookupFactory.defaultStringLookups")) {
                mapOnExtraCallbackWithResult = onExtraCallbackWithResult(properties.getProperty("org.apache.commons.text.lookup.StringLookupFactory.defaultStringLookups"));
            } else {
                mapOnExtraCallbackWithResult = onExtraCallbackWithResult();
            }
            this.onNavigationEvent = Collections.unmodifiableMap(mapOnExtraCallbackWithResult);
        }

        Map<String, zb7> onNavigationEvent() {
            return this.onNavigationEvent;
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str) {
        return new String(Base64.getDecoder().decode(str), StandardCharsets.ISO_8859_1);
    }

    static String onExtraCallback(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    static <K, V> Map<K, V> onWarmupCompleted(Map<K, V> map) {
        return map == null ? Collections.EMPTY_MAP : map;
    }

    private initListener() {
    }

    public void IAuthTabCallback(Map<String, zb7> map) {
        if (map != null) {
            map.putAll(onWarmupCompleted.onExtraCallback.onNavigationEvent());
        }
    }

    public zb7 IAuthTabCallback() {
        return onExtraCallback;
    }

    public zb7 onExtraCallbackWithResult() {
        return onWarmupCompleted;
    }

    public zb7 onExtraCallback() {
        return setExpressVideoListenerProxy.onExtraCallback;
    }

    public zb7 onWarmupCompleted() {
        return ry3.onExtraCallback;
    }

    public zb7 onNavigationEvent() {
        return sya32.onExtraCallback;
    }

    public zb7 IAuthTabCallbackDefault() {
        return onExtraCallbackWithResult;
    }

    public zb7 IAuthTabCallbackStub() {
        return ry31.onNavigationEvent;
    }

    public zb7 onTransact() {
        return zb5.onExtraCallback;
    }

    public zb7 asInterface() {
        return zb4.onExtraCallbackWithResult;
    }

    public <V> zb7 onExtraCallback(Map<String, V> map) {
        return ry4.onExtraCallback(map);
    }

    public zb7 asBinder() {
        return zb6.onExtraCallbackWithResult;
    }

    public zb7 IAuthTabCallback_Parcel() {
        return ResourceBundleStringLookup.onExtraCallback;
    }

    public zb7 access100() {
        return sya33.onNavigationEvent;
    }

    public zb7 getInterfaceDescriptor() {
        return IAuthTabCallbackDefault;
    }

    public zb7 access000() {
        return TopLayoutDislike2.onNavigationEvent;
    }

    public zb7 IAuthTabCallbackStubProxy() {
        return getCommonRingBGImageView.onNavigationEvent;
    }

    public zb7 extraCallbackWithResult() {
        return zb11.onExtraCallback;
    }

    public zb7 extraCallback() {
        return clickSound.onExtraCallbackWithResult;
    }
}
