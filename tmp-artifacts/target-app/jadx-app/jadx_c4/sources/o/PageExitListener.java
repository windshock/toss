package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class PageExitListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static final PackageInfo onNavigationEvent(@NotNull Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final Locale onExtraCallbackWithResult(@NotNull Resources resources) {
        LocaleList locales;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(resources, "");
            locales = resources.getConfiguration().getLocales();
        } else {
            Intrinsics.checkNotNullParameter(resources, "");
            locales = resources.getConfiguration().getLocales();
        }
        Locale locale = locales.get(0);
        Intrinsics.checkNotNull(locale);
        int i3 = IAuthTabCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return locale;
    }

    public static final Locale IAuthTabCallback(@NotNull Context context) {
        Locale localeOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            localeOnExtraCallbackWithResult = onExtraCallbackWithResult(resources);
            int i3 = 10 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources2 = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            localeOnExtraCallbackWithResult = onExtraCallbackWithResult(resources2);
        }
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return localeOnExtraCallbackWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        return IAuthTabCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        IAuthTabCallback(r4);
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = o.PageExitListener.onNavigationEvent + 125;
        o.PageExitListener.IAuthTabCallback = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Locale onExtraCallback(@NotNull Context context) {
        Locale localeOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            localeOnNavigationEvent = PreviewBlackScreenQuirk.onExtraCallback(context).onNavigationEvent(0);
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            localeOnNavigationEvent = PreviewBlackScreenQuirk.onExtraCallback(context).onNavigationEvent(0);
        }
    }

    public static final boolean onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.areEqual(IAuthTabCallback(context).getLanguage(), "und");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Locale localeIAuthTabCallback = IAuthTabCallback(context);
        if (!Intrinsics.areEqual(localeIAuthTabCallback.getLanguage(), "und") && !Intrinsics.areEqual(localeIAuthTabCallback, Locale.KOREA)) {
            return false;
        }
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public static final List<ComponentName> onWarmupCompleted(@NotNull Context context, @NotNull Intent intent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i2 = IAuthTabCallback + 77;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    return arrayList;
                }
                componentName.hashCode();
                throw null;
            }
            int i3 = IAuthTabCallback + 47;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual(((ResolveInfo) it.next()).activityInfo.packageName, context.getPackageName());
                componentName.hashCode();
                throw null;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            componentName = Intrinsics.areEqual(resolveInfo.activityInfo.packageName, context.getPackageName()) ? new ComponentName(context, resolveInfo.activityInfo.name) : null;
            if (componentName != null) {
                arrayList.add(componentName);
            }
        }
    }
}
