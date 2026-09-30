package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.RealmConfiguration;
import io.realm.internal.OsSharedRealm;
import io.realm.log.RealmLog;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import o.access21700;
import o.access22100;
import o.access22500;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class OsRealmConfig implements access22100 {
    private static final long onWarmupCompleted = nativeGetFinalizerPtr();
    private final access21700 IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final RealmConfiguration IAuthTabCallbackStub;
    private final OsSharedRealm.MigrationCallback asBinder;
    private final OsSharedRealm.InitializationCallback asInterface;
    private final Object onExtraCallback;
    private final Object onExtraCallbackWithResult;
    private final CompactOnLaunchCallback onNavigationEvent;
    private final URI onTransact;

    private static native long nativeCreate(String str, String str2, boolean z, long j);

    private native String nativeCreateAndSetSyncConfig(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, byte b, String str7, String str8, String[] strArr, byte b2, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j, boolean z);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j, byte[] bArr);

    private static native void nativeSetInMemory(long j, boolean z);

    private native void nativeSetInitializationCallback(long j, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j, byte b, long j2, long j3, @Nullable OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j, byte b, String str, int i);

    private static native void nativeSetSyncConfigSslSettings(long j, boolean z, String str);

    /* synthetic */ OsRealmConfig(RealmConfiguration realmConfiguration, String str, boolean z, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, AnonymousClass5 anonymousClass5) {
        this(realmConfiguration, str, z, osSchemaInfo, migrationCallback, initializationCallback);
    }

    public enum onExtraCallback {
        FULL(0),
        MEM_ONLY(1);

        final int value;

        onExtraCallback(int i) {
            this.value = i;
        }
    }

    public enum onNavigationEvent {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);

        final byte value;

        onNavigationEvent(byte b) {
            this.value = b;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    public static class onWarmupCompleted {
        private RealmConfiguration IAuthTabCallback;
        private OsSchemaInfo IAuthTabCallbackStub = null;
        private OsSharedRealm.MigrationCallback onWarmupCompleted = null;
        private OsSharedRealm.InitializationCallback onNavigationEvent = null;
        private boolean onExtraCallbackWithResult = false;
        private String onExtraCallback = _UrlKt.FRAGMENT_ENCODE_SET;

        public onWarmupCompleted(RealmConfiguration realmConfiguration) {
            this.IAuthTabCallback = realmConfiguration;
        }

        public onWarmupCompleted onNavigationEvent(@Nullable OsSchemaInfo osSchemaInfo) {
            this.IAuthTabCallbackStub = osSchemaInfo;
            return this;
        }

        public onWarmupCompleted onExtraCallbackWithResult(@Nullable OsSharedRealm.MigrationCallback migrationCallback) {
            this.onWarmupCompleted = migrationCallback;
            return this;
        }

        public onWarmupCompleted onWarmupCompleted(@Nullable OsSharedRealm.InitializationCallback initializationCallback) {
            this.onNavigationEvent = initializationCallback;
            return this;
        }

        public onWarmupCompleted onExtraCallback(boolean z) {
            this.onExtraCallbackWithResult = z;
            return this;
        }

        public OsRealmConfig onExtraCallback() {
            return new OsRealmConfig(this.IAuthTabCallback, this.onExtraCallback, this.onExtraCallbackWithResult, this.IAuthTabCallbackStub, this.onWarmupCompleted, this.onNavigationEvent, null);
        }

        public onWarmupCompleted onExtraCallback(File file) {
            this.onExtraCallback = file.getAbsolutePath();
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OsRealmConfig(RealmConfiguration realmConfiguration, String str, boolean z, @Nullable OsSchemaInfo osSchemaInfo, @Nullable OsSharedRealm.MigrationCallback migrationCallback, @Nullable OsSharedRealm.InitializationCallback initializationCallback) {
        OsRealmConfig osRealmConfig;
        URI uri;
        int i;
        int i2;
        String str2;
        String str3;
        ProxySelector proxySelector;
        URI uri2;
        List<Proxy> listSelect;
        Proxy proxy;
        this.IAuthTabCallback = new access21700();
        this.IAuthTabCallbackStub = realmConfiguration;
        this.IAuthTabCallbackDefault = nativeCreate(realmConfiguration.asInterface(), str, true, realmConfiguration.onTransact());
        access21700.onWarmupCompleted.onWarmupCompleted(this);
        Object[] objArrOnExtraCallback = access22500.onExtraCallback().onExtraCallback(realmConfiguration);
        String str4 = (String) objArrOnExtraCallback[0];
        String str5 = (String) objArrOnExtraCallback[1];
        String str6 = (String) objArrOnExtraCallback[2];
        String str7 = (String) objArrOnExtraCallback[3];
        String str8 = (String) objArrOnExtraCallback[4];
        String str9 = (String) objArrOnExtraCallback[5];
        String str10 = (String) objArrOnExtraCallback[6];
        Byte b = (Byte) objArrOnExtraCallback[7];
        String str11 = (String) objArrOnExtraCallback[8];
        String str12 = (String) objArrOnExtraCallback[9];
        Map map = (Map) objArrOnExtraCallback[10];
        Byte b2 = (Byte) objArrOnExtraCallback[11];
        this.onExtraCallback = objArrOnExtraCallback[12];
        this.onExtraCallbackWithResult = objArrOnExtraCallback[13];
        String str13 = (String) objArrOnExtraCallback[14];
        Object obj = objArrOnExtraCallback[15];
        Long l = (Long) objArrOnExtraCallback[16];
        boolean zEquals = Boolean.TRUE.equals(objArrOnExtraCallback[17]);
        String str14 = (String) objArrOnExtraCallback[18];
        String[] strArr = new String[map != null ? map.size() << 1 : 0];
        if (map != null) {
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i3] = (String) entry.getKey();
                strArr[i3 + 1] = (String) entry.getValue();
                i3 += 2;
            }
        }
        byte[] bArrIAuthTabCallback = realmConfiguration.IAuthTabCallback();
        if (bArrIAuthTabCallback != null) {
            nativeSetEncryptionKey(this.IAuthTabCallbackDefault, bArrIAuthTabCallback);
        }
        nativeSetInMemory(this.IAuthTabCallbackDefault, realmConfiguration.onExtraCallbackWithResult() == onExtraCallback.MEM_ONLY);
        nativeEnableChangeNotification(this.IAuthTabCallbackDefault, z);
        onNavigationEvent onnavigationevent = onNavigationEvent.SCHEMA_MODE_MANUAL;
        if (realmConfiguration.writeTypedObject()) {
            onnavigationevent = onNavigationEvent.SCHEMA_MODE_IMMUTABLE;
        } else if (realmConfiguration.extraCallbackWithResult()) {
            onnavigationevent = onNavigationEvent.SCHEMA_MODE_READONLY;
        } else if (str6 != null) {
            onnavigationevent = onNavigationEvent.SCHEMA_MODE_ADDITIVE_DISCOVERED;
        } else if (realmConfiguration.onMessageChannelReady()) {
            onnavigationevent = onNavigationEvent.SCHEMA_MODE_SOFT_RESET_FILE;
        }
        long jAccess100 = realmConfiguration.access100();
        long nativePtr = osSchemaInfo == null ? 0L : osSchemaInfo.getNativePtr();
        this.asBinder = migrationCallback;
        nativeSetSchemaConfig(this.IAuthTabCallbackDefault, onnavigationevent.getNativeValue(), jAccess100, nativePtr, migrationCallback);
        CompactOnLaunchCallback compactOnLaunchCallbackOnWarmupCompleted = realmConfiguration.onWarmupCompleted();
        this.onNavigationEvent = compactOnLaunchCallbackOnWarmupCompleted;
        if (compactOnLaunchCallbackOnWarmupCompleted != null) {
            nativeSetCompactOnLaunchCallback(this.IAuthTabCallbackDefault, compactOnLaunchCallbackOnWarmupCompleted);
        }
        this.asInterface = initializationCallback;
        if (initializationCallback != null) {
            nativeSetInitializationCallback(this.IAuthTabCallbackDefault, initializationCallback);
        }
        if (str6 != null) {
            String strNativeCreateAndSetSyncConfig = nativeCreateAndSetSyncConfig(l.longValue(), this.IAuthTabCallbackDefault, str6, str4, str5, str8, str9, str10, b.byteValue(), str11, str12, strArr, b2.byteValue(), this.onExtraCallback, this.onExtraCallbackWithResult, str13, obj);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str7);
                i = 1;
                try {
                    sb.append(str11.substring(1));
                    strNativeCreateAndSetSyncConfig = sb.toString();
                    i2 = 0;
                    osRealmConfig = this;
                    str2 = "Cannot create a URI from the Realm URL address";
                    uri = new URI(strNativeCreateAndSetSyncConfig);
                    str3 = strNativeCreateAndSetSyncConfig;
                } catch (URISyntaxException e) {
                    e = e;
                    i2 = 0;
                    str2 = "Cannot create a URI from the Realm URL address";
                    RealmLog.onExtraCallbackWithResult(e, str2, new Object[0]);
                    osRealmConfig = this;
                    str3 = strNativeCreateAndSetSyncConfig;
                    uri = null;
                    nativeSetSyncConfigSslSettings(osRealmConfig.IAuthTabCallbackDefault, zEquals, str14);
                    proxySelector = ProxySelector.getDefault();
                    if (uri != null) {
                        try {
                            uri2 = new URI(str3.replaceFirst("ws", "http"));
                        } catch (URISyntaxException e2) {
                            RealmLog.onExtraCallbackWithResult(e2, str2, new Object[i2]);
                            uri2 = null;
                        }
                        listSelect = proxySelector.select(uri2);
                        if (listSelect != null) {
                            proxy = listSelect.get(i2);
                            if (proxy.type() != Proxy.Type.DIRECT) {
                            }
                        }
                    }
                    osRealmConfig.onTransact = uri;
                }
            } catch (URISyntaxException e3) {
                e = e3;
                i = 1;
            }
            nativeSetSyncConfigSslSettings(osRealmConfig.IAuthTabCallbackDefault, zEquals, str14);
            proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                uri2 = new URI(str3.replaceFirst("ws", "http"));
                listSelect = proxySelector.select(uri2);
                if (listSelect != null && !listSelect.isEmpty()) {
                    proxy = listSelect.get(i2);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b3 = AnonymousClass5.onNavigationEvent[proxy.type().ordinal()] != i ? -1 : i2;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress socketAddressAddress = proxy.address();
                            if (socketAddressAddress instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                String strOnExtraCallback = osRealmConfig.onExtraCallback(inetSocketAddress);
                                if (strOnExtraCallback != null) {
                                    nativeSetSyncConfigProxySettings(osRealmConfig.IAuthTabCallbackDefault, b3, strOnExtraCallback, inetSocketAddress.getPort());
                                } else {
                                    RealmLog.onWarmupCompleted("Could not retrieve proxy's hostname.", new Object[i2]);
                                }
                            } else {
                                RealmLog.onWarmupCompleted("Unsupported proxy socket address type: " + socketAddressAddress.getClass().getName(), new Object[i2]);
                            }
                        } else {
                            RealmLog.onWarmupCompleted("SOCKS proxies are not supported.", new Object[i2]);
                        }
                    }
                }
            }
        } else {
            osRealmConfig = this;
            uri = null;
        }
        osRealmConfig.onTransact = uri;
    }

    /* renamed from: io.realm.internal.OsRealmConfig$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            onNavigationEvent = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private String onExtraCallback(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.getHostName() != null) {
            return inetSocketAddress.getHostName();
        }
        if (inetSocketAddress.getAddress() == null) {
            return null;
        }
        InetAddress address = inetSocketAddress.getAddress();
        if (address.getHostName() != null) {
            return address.getHostName();
        }
        return address.getHostAddress();
    }

    @Override // o.access22100
    public long getNativePtr() {
        return this.IAuthTabCallbackDefault;
    }

    @Override // o.access22100
    public long getNativeFinalizerPtr() {
        return onWarmupCompleted;
    }

    public RealmConfiguration onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    public URI onExtraCallback() {
        return this.onTransact;
    }

    access21700 IAuthTabCallback() {
        return this.IAuthTabCallback;
    }
}
