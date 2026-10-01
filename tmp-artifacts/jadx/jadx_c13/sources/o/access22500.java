package o;

import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access22500 {
    private static final access22500 IAuthTabCallback = new access22500();
    private static access22500 onExtraCallback;

    public String IAuthTabCallback(RealmConfiguration realmConfiguration) {
        return null;
    }

    public String onExtraCallbackWithResult(RealmConfiguration realmConfiguration) {
        return null;
    }

    public boolean onNavigationEvent(Throwable th) {
        return false;
    }

    static {
        onExtraCallback = null;
        try {
            onExtraCallback = (access22500) Class.forName("io.realm.internal.SyncObjectServerFacade").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e);
        } catch (InstantiationException e2) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e2);
        } catch (NoSuchMethodException e3) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e3);
        } catch (InvocationTargetException e4) {
            throw new RealmException("Failed to init SyncObjectServerFacade", e4.getTargetException());
        }
    }

    public Object[] onExtraCallback(RealmConfiguration realmConfiguration) {
        return new Object[19];
    }

    public static access22500 onWarmupCompleted(boolean z) {
        if (z) {
            return onExtraCallback;
        }
        return IAuthTabCallback;
    }

    public static access22500 onExtraCallback() {
        access22500 access22500Var = onExtraCallback;
        return access22500Var != null ? access22500Var : IAuthTabCallback;
    }
}
