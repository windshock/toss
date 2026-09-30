package im.toss.deeplink;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import im.toss.deeplink.DeepLinkResult;
import im.toss.deeplink.annotation.ConditionalDeepLink;
import im.toss.deeplink.annotation.DeepLinkIntentFlags;
import im.toss.deeplink.annotation.PrivateDeepLink;
import im.toss.deeplink.annotation.RootActivity;
import im.toss.deeplink.annotation.TransparentDeepLink;
import java.io.EOFException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DeepLinkHandler {
    public static final String ACTION = "im.toss.DEEP_LINK_ACTION";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_SUCCESSFUL = "im.toss.EXTRA_SUCCESSFUL";
    public static final String EXTRA_URI = "im.toss.EXTRA_URI";
    public static final String EXTRA_URI_TEMPLATE = "im.toss.EXTRA_URI_TEMPLATE";
    private static int IAuthTabCallback = 0;
    private static final String TAG = "DeepLinkHandler";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final DeepLinkBaseRegistry registry;

    static {
        int i = onExtraCallbackWithResult + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public DeepLinkHandler(@NotNull DeepLinkBaseRegistry deepLinkBaseRegistry) {
        Intrinsics.checkNotNullParameter(deepLinkBaseRegistry, "");
        this.registry = deepLinkBaseRegistry;
    }

    public final DeepLinkResult dispatchFrom(@NotNull Activity activity, @NotNull Uri uri, @Nullable Bundle bundle, @Nullable Intent intent, boolean z) throws EOFException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(uri, "");
        DeepLinkResult deepLinkResultCreateResult = createResult(activity, uri, bundle, z);
        Object obj = null;
        if (deepLinkResultCreateResult instanceof DeepLinkResult.Found) {
            int i4 = onWarmupCompleted + 63;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (intent != null) {
                int i6 = i5 + 93;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    activity.startActivity(intent);
                    throw null;
                }
                activity.startActivity(intent);
            }
            Intent intent2 = ((DeepLinkResult.Found) deepLinkResultCreateResult).getIntent();
            if (intent2 != null) {
                activity.startActivity(intent2);
            }
        }
        notifyListener(activity, deepLinkResultCreateResult);
        int i7 = onWarmupCompleted + 111;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return deepLinkResultCreateResult;
        }
        obj.hashCode();
        throw null;
    }

    public final Class<?> findClass(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Class<?> clsFindClass = findClass(uri.toString());
        int i4 = IAuthTabCallback + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return clsFindClass;
    }

    public final Class<?> findClass(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            DeepLinkBaseRegistryKt.findClass(this.registry, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, str);
        int i3 = IAuthTabCallback + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return clsFindClass;
    }

    public final boolean supportsUri(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zSupportsUri = supportsUri(uri.toString());
        int i4 = IAuthTabCallback + 41;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zSupportsUri;
    }

    public final boolean supportsUri(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.registry.supportsUri(str);
            obj.hashCode();
            throw null;
        }
        boolean zSupportsUri = this.registry.supportsUri(str);
        int i3 = onWarmupCompleted + 29;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return zSupportsUri;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isPrivateDeepLink(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            return isPrivateDeepLink(uri.toString());
        }
        Intrinsics.checkNotNullParameter(uri, "");
        isPrivateDeepLink(uri.toString());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isPrivateDeepLink(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, str);
        if (clsFindClass == null) {
            return false;
        }
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (!clsFindClass.isAnnotationPresent(PrivateDeepLink.class)) {
            return false;
        }
        int i6 = onWarmupCompleted + 45;
        int i7 = i6 % 128;
        IAuthTabCallback = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 5;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isTransparentDeepLink(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zIsTransparentDeepLink = isTransparentDeepLink(uri.toString());
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIsTransparentDeepLink;
    }

    public final boolean isTransparentDeepLink(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, str);
        if (clsFindClass != null && clsFindClass.isAnnotationPresent(TransparentDeepLink.class)) {
            int i4 = onWarmupCompleted + 1;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = onWarmupCompleted + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final boolean isRootActivity(@NotNull Uri uri) {
        boolean zIsRootActivity;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            zIsRootActivity = isRootActivity(uri.toString());
            int i3 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            zIsRootActivity = isRootActivity(uri.toString());
        }
        int i4 = onWarmupCompleted + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zIsRootActivity;
    }

    public final boolean isRootActivity(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, str);
        if (clsFindClass == null) {
            return false;
        }
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            if (!clsFindClass.isAnnotationPresent(RootActivity.class)) {
                return false;
            }
        } else if (!clsFindClass.isAnnotationPresent(RootActivity.class)) {
            return false;
        }
        int i5 = onWarmupCompleted + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final boolean isConditionalDeepLink(@NotNull Uri uri) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        boolean zIsConditionalDeepLink = isConditionalDeepLink(uri.toString());
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return zIsConditionalDeepLink;
    }

    public final boolean isConditionalDeepLink(@Nullable String str) {
        int i = 2 % 2;
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, str);
        if (clsFindClass != null) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0 ? clsFindClass.isAnnotationPresent(ConditionalDeepLink.class) : clsFindClass.isAnnotationPresent(ConditionalDeepLink.class)) {
                return true;
            }
        }
        int i3 = onWarmupCompleted + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public final List<TargetRegion> getTargetRegions(@NotNull Uri uri) {
        List<TargetRegion> targetRegions;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            targetRegions = getTargetRegions(uri.toString());
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            targetRegions = getTargetRegions(uri.toString());
        }
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return targetRegions;
    }

    public final List<TargetRegion> getTargetRegions(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.registry.findEntry(str);
            obj.hashCode();
            throw null;
        }
        DeeplinkEntry deeplinkEntryFindEntry = this.registry.findEntry(str);
        if (deeplinkEntryFindEntry != null) {
            return deeplinkEntryFindEntry.getRegions();
        }
        int i3 = onWarmupCompleted + 77;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
        return null;
    }

    public final DeeplinkConditionalRouter getConditionalRouter(@NotNull Uri uri) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        Class<?> clsFindClass = DeepLinkBaseRegistryKt.findClass(this.registry, uri.toString());
        if (clsFindClass == null) {
            int i4 = IAuthTabCallback + 39;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        if (clsFindClass.isAnnotationPresent(ConditionalDeepLink.class)) {
            int i6 = IAuthTabCallback + 71;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            Object objNewInstance = clsFindClass.getConstructor(null).newInstance(null);
            if (objNewInstance instanceof DeeplinkConditionalRouter) {
                return (DeeplinkConditionalRouter) objNewInstance;
            }
        }
        return null;
    }

    public static /* synthetic */ DeepLinkResult createResult$default(DeepLinkHandler deepLinkHandler, Activity activity, Uri uri, Bundle bundle, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 4) != 0 : (i & 2) != 0) {
            int i5 = i3 + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            bundle = null;
        }
        if ((i & 8) != 0) {
            int i7 = i3 + 5;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        return deepLinkHandler.createResult(activity, uri, bundle, z);
    }

    public final DeepLinkResult createResult(@NotNull Activity activity, @Nullable Uri uri, @Nullable Bundle bundle, boolean z) throws EOFException {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        if (uri != null) {
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            string = uri.toString();
        } else {
            string = null;
        }
        String baseUrl = this.registry.parseBaseUrl(string);
        DeeplinkEntry deeplinkEntryFindEntry = this.registry.findEntry(string);
        if (deeplinkEntryFindEntry == null) {
            DeepLinkResult.NotFound notFound = new DeepLinkResult.NotFound(string, baseUrl);
            int i4 = onWarmupCompleted + 3;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return notFound;
            }
            throw null;
        }
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            int i5 = IAuthTabCallback + 3;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            bundle2.putAll(bundle);
        }
        QueryParameterParser queryParameterParser = QueryParameterParser.parse(string);
        Set<String> setQueryParameterNames = queryParameterParser.queryParameterNames();
        Intrinsics.checkNotNullExpressionValue(setQueryParameterNames, "");
        Iterator<T> it = setQueryParameterNames.iterator();
        while (it.hasNext()) {
            int i7 = onWarmupCompleted + 113;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                List<String> listQueryParameterValues = queryParameterParser.queryParameterValues((String) it.next());
                Intrinsics.checkNotNullExpressionValue(listQueryParameterValues, "");
                listQueryParameterValues.iterator();
                throw null;
            }
            String str = (String) it.next();
            List<String> listQueryParameterValues2 = queryParameterParser.queryParameterValues(str);
            Intrinsics.checkNotNullExpressionValue(listQueryParameterValues2, "");
            for (String str2 : listQueryParameterValues2) {
                int i8 = IAuthTabCallback + 79;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                bundle2.containsKey(str);
                bundle2.putString(str, str2);
            }
        }
        Intent intent = new Intent(activity, deeplinkEntryFindEntry.getClazz());
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("im.toss.deep_link_uri", String.valueOf(uri));
        intent.putExtra("im.toss.is_deep_link_flag", true);
        intent.putExtra("im.toss.deeplink.referrer_uri", uri);
        if (z) {
            int i10 = onWarmupCompleted + 45;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            intent.addFlags(33554432);
        }
        DeepLinkIntentFlags deepLinkIntentFlags = (DeepLinkIntentFlags) deeplinkEntryFindEntry.getClazz().getAnnotation(DeepLinkIntentFlags.class);
        if (deepLinkIntentFlags != null) {
            int i12 = IAuthTabCallback + 23;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 == 0) {
                intent.addFlags(deepLinkIntentFlags.flags());
                int i13 = 1 / 0;
            } else {
                intent.addFlags(deepLinkIntentFlags.flags());
            }
        }
        intent.putExtras(bundle2);
        return new DeepLinkResult.Found(string, baseUrl, deeplinkEntryFindEntry.getClazz(), intent);
    }

    private final void notifyListener(Context context, DeepLinkResult deepLinkResult) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.putExtra(EXTRA_URI, deepLinkResult.getUriString());
        intent.putExtra(EXTRA_URI_TEMPLATE, deepLinkResult.getUriTemplate());
        intent.putExtra(EXTRA_SUCCESSFUL, deepLinkResult.isSuccessful());
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String parseBaseUrl(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String baseUrl = this.registry.parseBaseUrl(str);
        int i4 = IAuthTabCallback + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return baseUrl;
        }
        throw null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
