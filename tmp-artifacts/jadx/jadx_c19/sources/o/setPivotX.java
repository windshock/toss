package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setPivotX {
    private final Context onWarmupCompleted;

    public setPivotX(Context context) {
        this.onWarmupCompleted = context;
    }

    public List<setElevation> onWarmupCompleted() throws PackageManager.NameNotFoundException {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.onWarmupCompleted.getPackageManager().getApplicationInfo(this.onWarmupCompleted.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(IAuthTabCallback(str));
                    Log.isLoggable("ManifestParser", 3);
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    private static setElevation IAuthTabCallback(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                onWarmupCompleted(cls, e);
            } catch (InstantiationException e2) {
                onWarmupCompleted(cls, e2);
            } catch (NoSuchMethodException e3) {
                onWarmupCompleted(cls, e3);
            } catch (InvocationTargetException e4) {
                onWarmupCompleted(cls, e4);
            }
            if (!(objNewInstance instanceof setElevation)) {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            }
            return (setElevation) objNewInstance;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void onWarmupCompleted(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
