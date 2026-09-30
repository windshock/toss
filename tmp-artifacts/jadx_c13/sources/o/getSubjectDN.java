package o;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.getSignPrikeyFHFilename;
import retrofit2.Reflection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getSubjectDN {

    @Nullable
    public static final Executor onExtraCallback;
    public static final getSignPrikeyFHFilename onExtraCallbackWithResult;
    public static final Reflection onNavigationEvent;

    static {
        String property = System.getProperty("java.vm.name");
        if (property.equals("RoboVM")) {
            onExtraCallback = null;
            onNavigationEvent = new Reflection();
            onExtraCallbackWithResult = new getSignPrikeyFHFilename();
        } else if (property.equals("Dalvik")) {
            onExtraCallback = new getSignPriKeyIndexOfUUID();
            onNavigationEvent = new Reflection.Android24();
            onExtraCallbackWithResult = new getSignPrikeyFHFilename.onNavigationEvent();
        } else {
            onExtraCallback = null;
            onNavigationEvent = new Reflection.Java8();
            onExtraCallbackWithResult = new getSignPrikeyFHFilename.onNavigationEvent();
        }
    }
}
