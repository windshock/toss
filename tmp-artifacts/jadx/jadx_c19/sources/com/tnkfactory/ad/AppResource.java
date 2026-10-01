package com.tnkfactory.ad;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppResource {
    public static final Companion Companion = new Companion(null);
    private static AppResource pThis;
    public Context applicationContext;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AppResource getInstance() {
            if (getPThis() == null) {
                setPThis(new AppResource());
            }
            AppResource pThis = getPThis();
            Intrinsics.checkNotNull(pThis);
            return pThis;
        }

        public final AppResource getPThis() {
            return AppResource.pThis;
        }

        public final void setPThis(@Nullable AppResource appResource) {
            AppResource.pThis = appResource;
        }
    }

    public final Context getApplicationContext() {
        Context context = this.applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        setApplicationContext(context.getApplicationContext());
    }

    public final void setApplicationContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.applicationContext = context;
    }
}
