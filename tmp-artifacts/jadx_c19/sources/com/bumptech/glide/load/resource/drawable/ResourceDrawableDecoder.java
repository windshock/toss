package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;
import o.ConstraintSetForInlineDslobserver1ExternalSyntheticLambda0;
import o.Reference;
import o.SaversKtExternalSyntheticLambda30;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    private final Context onWarmupCompleted;

    public ResourceDrawableDecoder(Context context) {
        this.onWarmupCompleted = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull Uri uri, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return uri.getScheme().equals("android.resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Resource<Drawable> onNavigationEvent(@NonNull Uri uri, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Context contextOnExtraCallbackWithResult = onExtraCallbackWithResult(uri, uri.getAuthority());
        return ConstraintSetForInlineDslobserver1ExternalSyntheticLambda0.onExtraCallbackWithResult(Reference.onNavigationEvent(this.onWarmupCompleted, contextOnExtraCallbackWithResult, onNavigationEvent(contextOnExtraCallbackWithResult, uri)));
    }

    private Context onExtraCallbackWithResult(Uri uri, String str) {
        if (str.equals(this.onWarmupCompleted.getPackageName())) {
            return this.onWarmupCompleted;
        }
        try {
            return this.onWarmupCompleted.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.onWarmupCompleted.getPackageName())) {
                return this.onWarmupCompleted;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    private int onNavigationEvent(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return onExtraCallbackWithResult(context, uri);
        }
        if (pathSegments.size() == 1) {
            return onNavigationEvent(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    private int onExtraCallbackWithResult(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int onNavigationEvent(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }
}
