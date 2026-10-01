package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_pingIntervalMillis {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final boolean IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return Pattern.compile("^(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)$").matcher(str).find();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Pattern.compile("^(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)$").matcher(str).find();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent onNavigationEvent(@NotNull deprecated_readTimeoutMillis deprecated_readtimeoutmillis, @Nullable String str, @Nullable String str2, @Nullable Uri uri) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_readtimeoutmillis, "");
        Intent intent = new Intent("android.intent.action.SEND");
        Object obj = null;
        if (uri != null) {
            int i3 = onExtraCallback + 23;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str2 != null) {
                if (!(!IAuthTabCallback(str2))) {
                    int i4 = onWarmupCompleted + 107;
                    onExtraCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        boolean z = deprecated_readtimeoutmillis.getAvailableTypes() instanceof Collection;
                        throw null;
                    }
                    List<deprecated_retryOnConnectionFailure> availableTypes = deprecated_readtimeoutmillis.getAvailableTypes();
                    if (!(availableTypes instanceof Collection) || !availableTypes.isEmpty()) {
                        Iterator<T> it = availableTypes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i5 = onWarmupCompleted + 89;
                            onExtraCallback = i5 % 128;
                            int i6 = i5 % 2;
                            if (deprecated_writeTimeoutMillis.onExtraCallback((deprecated_retryOnConnectionFailure) it.next())) {
                                int i7 = onExtraCallback + 77;
                                onWarmupCompleted = i7 % 128;
                                int i8 = i7 % 2;
                                intent.putExtra("android.intent.extra.TEXT", str2);
                                break;
                            }
                        }
                    }
                } else {
                    List<deprecated_retryOnConnectionFailure> availableTypes2 = deprecated_readtimeoutmillis.getAvailableTypes();
                    if ((!(availableTypes2 instanceof Collection)) || !availableTypes2.isEmpty()) {
                        Iterator<T> it2 = availableTypes2.iterator();
                        while (it2.hasNext()) {
                            int i9 = onWarmupCompleted + 11;
                            onExtraCallback = i9 % 128;
                            if (i9 % 2 == 0) {
                                int i10 = 17 / 0;
                                if (deprecated_writeTimeoutMillis.onWarmupCompleted((deprecated_retryOnConnectionFailure) it2.next())) {
                                    i = onWarmupCompleted + 33;
                                    onExtraCallback = i % 128;
                                    if (i % 2 != 0) {
                                        intent.putExtra("android.intent.extra.TEXT", str2);
                                        throw null;
                                    }
                                    intent.putExtra("android.intent.extra.TEXT", str2);
                                }
                            } else if (deprecated_writeTimeoutMillis.onWarmupCompleted((deprecated_retryOnConnectionFailure) it2.next())) {
                                i = onWarmupCompleted + 33;
                                onExtraCallback = i % 128;
                                if (i % 2 != 0) {
                                }
                            }
                        }
                    }
                }
            }
            intent.setDataAndType(uri, "image/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
        } else {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        if (str != null && str.length() != 0) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        if (deprecated_readtimeoutmillis instanceof EnumC0078cache) {
            int i11 = onExtraCallback + 65;
            onWarmupCompleted = i11 % 128;
            if (i11 % 2 != 0) {
                intent.setPackage(((EnumC0078cache) deprecated_readtimeoutmillis).getPackageName());
                obj.hashCode();
                throw null;
            }
            intent.setPackage(((EnumC0078cache) deprecated_readtimeoutmillis).getPackageName());
        }
        int i12 = onExtraCallback + 19;
        onWarmupCompleted = i12 % 128;
        if (i12 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    public static final boolean onNavigationEvent(@NotNull deprecated_readTimeoutMillis deprecated_readtimeoutmillis, @NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_readtimeoutmillis, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (deprecated_readtimeoutmillis instanceof deprecated_networkInterceptors) {
            int i2 = onWarmupCompleted + 95;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(deprecated_readtimeoutmillis instanceof EnumC0078cache)) {
            throw new AssertionError();
        }
        if (context.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES") != 0) {
            return true;
        }
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            ((EnumC0078cache) deprecated_readtimeoutmillis).getPackageName().length();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (((EnumC0078cache) deprecated_readtimeoutmillis).getPackageName().length() == 0) {
            return false;
        }
        try {
            if (context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(((EnumC0078cache) deprecated_readtimeoutmillis).getPackageName()) != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
