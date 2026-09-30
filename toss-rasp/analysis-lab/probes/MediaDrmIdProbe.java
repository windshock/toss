package probe;

import android.media.MediaDrm;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;

public final class MediaDrmIdProbe {
    private static final UUID WIDEVINE_UUID =
            new UUID(-1301668207276963122L, -6645017420763422227L);

    private static String hex(byte[] data) {
        StringBuilder sb = new StringBuilder(data.length * 2);
        for (byte b : data) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

    private static String digest(String alg, byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance(alg);
        md.update(data);
        return hex(md.digest());
    }

    private static void setStaticStringIfPresent(Class<?> cls, String fieldName, String value) {
        try {
            Field f = cls.getDeclaredField(fieldName);
            f.setAccessible(true);
            if (f.getType() == String.class) {
                f.set(null, value);
            }
        } catch (Throwable ignored) {
        }
    }

    private static void setLikelyStaticStrings(Class<?> cls, String value) {
        try {
            for (Field f : cls.getDeclaredFields()) {
                int mod = f.getModifiers();
                if (!Modifier.isStatic(mod) || f.getType() != String.class) {
                    continue;
                }
                String n = f.getName();
                if (!(n.toLowerCase().contains("package") || n.toLowerCase().contains("process"))) {
                    continue;
                }
                try {
                    f.setAccessible(true);
                    Object old = f.get(null);
                    f.set(null, value);
                    System.out.println("seeded_static_string=" + cls.getName() + "." + n + " old=" + old + " new=" + value);
                } catch (Throwable t) {
                    System.out.println("seed_static_string_error=" + cls.getName() + "." + n + " err=" + t);
                }
            }
        } catch (Throwable t) {
            System.out.println("list_static_string_error=" + cls.getName() + " err=" + t);
        }
    }

    private static void printStaticStringMethodIfPresent(Class<?> cls, String methodName) {
        try {
            Method m = cls.getDeclaredMethod(methodName);
            m.setAccessible(true);
            Object v = m.invoke(null);
            System.out.println("method_value=" + cls.getName() + "." + methodName + "=" + v);
        } catch (Throwable ignored) {
        }
    }

    private static void seedActivityThreadPackageName(String pkg) {
        try {
            Class<?> at = Class.forName("android.app.ActivityThread");
            try {
                Method sm = at.getDeclaredMethod("systemMain");
                sm.setAccessible(true);
                Object thread = sm.invoke(null);
                System.out.println("activity_thread_system_main=" + thread);
            } catch (Throwable t) {
                System.out.println("activity_thread_system_main_error=" + t);
            }
            setStaticStringIfPresent(at, "sCurrentPackageName", pkg);
            setStaticStringIfPresent(at, "sCurrentProcessName", pkg);
            setStaticStringIfPresent(at, "mBoundApplication", pkg);
            setLikelyStaticStrings(at, pkg);
            printStaticStringMethodIfPresent(at, "currentPackageName");
            printStaticStringMethodIfPresent(at, "currentOpPackageName");
            printStaticStringMethodIfPresent(at, "currentProcessName");
            try {
                Class<?> ag = Class.forName("android.app.AppGlobals");
                setLikelyStaticStrings(ag, pkg);
                printStaticStringMethodIfPresent(ag, "getInitialPackage");
            } catch (Throwable t) {
                System.out.println("appglobals_seed_error=" + t);
            }
            System.out.println("seeded_activity_thread_pkg=" + pkg);
        } catch (Throwable t) {
            System.out.println("seed_activity_thread_pkg_error=" + t);
        }
    }

    private static Object getUnsafe() throws Exception {
        Class<?> uc = Class.forName("sun.misc.Unsafe");
        for (Field f : uc.getDeclaredFields()) {
            if (!Modifier.isStatic(f.getModifiers())) {
                continue;
            }
            if (!uc.isAssignableFrom(f.getType())) {
                continue;
            }
            f.setAccessible(true);
            Object u = f.get(null);
            if (u != null) {
                return u;
            }
        }
        throw new IllegalStateException("sun.misc.Unsafe singleton not found");
    }

    private static byte[] uuidBytes(UUID uuid) {
        ByteBuffer b = ByteBuffer.allocate(16);
        b.putLong(uuid.getMostSignificantBits());
        b.putLong(uuid.getLeastSignificantBits());
        return b.array();
    }

    private static MediaDrm constructWithPackageName(UUID uuid, String pkg) throws Exception {
        try {
            return new MediaDrm(uuid);
        } catch (IllegalArgumentException e) {
            System.out.println("public_ctor_failed=" + e);
        }

        Object unsafe = getUnsafe();
        Method alloc = unsafe.getClass().getDeclaredMethod("allocateInstance", Class.class);
        alloc.setAccessible(true);
        MediaDrm drm = (MediaDrm) alloc.invoke(unsafe, MediaDrm.class);

        try {
            Field appPkg = MediaDrm.class.getDeclaredField("mAppPackageName");
            appPkg.setAccessible(true);
            appPkg.set(drm, pkg);
        } catch (Throwable t) {
            System.out.println("set_mAppPackageName_error=" + t);
        }

        Method setup = MediaDrm.class.getDeclaredMethod("native_setup", Object.class, byte[].class, String.class);
        setup.setAccessible(true);
        setup.invoke(drm, new WeakReference<MediaDrm>(drm), uuidBytes(uuid), pkg);
        System.out.println("unsafe_native_setup_pkg=" + pkg);
        return drm;
    }

    public static void main(String[] args) throws Exception {
        if (args.length > 0 && "--reflect".equals(args[0])) {
            Class<?> c = MediaDrm.class;
            for (Constructor<?> ctor : c.getDeclaredConstructors()) {
                System.out.println("ctor=" + ctor);
            }
            for (Method m : c.getDeclaredMethods()) {
                String n = m.getName();
                if (n.toLowerCase().contains("setup") || n.toLowerCase().contains("property")
                        || n.toLowerCase().contains("package") || n.toLowerCase().contains("native")) {
                    System.out.println("method=" + m);
                }
            }
            for (Field f : c.getDeclaredFields()) {
                String n = f.getName();
                if (n.toLowerCase().contains("package") || n.toLowerCase().contains("native")
                        || n.toLowerCase().contains("context") || n.toLowerCase().contains("attribution")) {
                    System.out.println("field=" + f);
                }
            }
            return;
        }
        String pkg = args.length > 0 ? args[0] : "viva.republica.toss";
        seedActivityThreadPackageName(pkg);
        MediaDrm drm = null;
        try {
            drm = constructWithPackageName(WIDEVINE_UUID, pkg);
            byte[] id = drm.getPropertyByteArray("deviceUniqueId");
            System.out.println("widevine_uuid=" + WIDEVINE_UUID);
            System.out.println("deviceUniqueId_len=" + id.length);
            System.out.println("deviceUniqueId_hex=" + hex(id));
            System.out.println("md5=" + digest("MD5", id));
            System.out.println("sha1=" + digest("SHA-1", id));
            System.out.println("sha256=" + digest("SHA-256", id));
        } finally {
            if (drm != null) {
                drm.close();
            }
        }
    }
}
