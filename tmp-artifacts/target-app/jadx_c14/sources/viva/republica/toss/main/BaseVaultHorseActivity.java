package viva.republica.toss.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.EncoderImplExternalSyntheticLambda3;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.SessionTrackerb;
import o.onPageExit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class BaseVaultHorseActivity extends Hilt_BaseVaultHorseActivity {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int IAuthTabCallbackDefault = 8;
    private final IEngagementSignalsCallback_Parcel<Intent> asBinder = onPageExit.onNavigationEvent(this, new Function1() { // from class: viva.republica.toss.main.BaseVaultHorseActivity$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return BaseVaultHorseActivity.onExtraCallback(this.f$0, (IEngagementSignalsCallbackDefault) obj);
        }
    });

    @Inject
    public SessionTrackerb tossRouter;

    public long getScreenId() {
        return -1L;
    }

    public final SessionTrackerb onNavigationEvent() {
        SessionTrackerb sessionTrackerb = this.tossRouter;
        if (sessionTrackerb != null) {
            return sessionTrackerb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String IAuthTabCallback() {
        String stringExtra = getIntent().getStringExtra("baseScheme");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String setEngagementSignalsCallback() {
        String stringExtra = getIntent().getStringExtra("nextUrl");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Intent validateRelationship() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        Intent intent2 = (Intent) ((Parcelable) EncoderImplExternalSyntheticLambda3.onWarmupCompleted(intent, "originIntent", Intent.class));
        return intent2 == null ? new Intent() : intent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Class<?> ICustomTabsServiceDefault() {
        Serializable serializableExtra = getIntent().getSerializableExtra("originClass");
        if (serializableExtra instanceof Class) {
            return (Class) serializableExtra;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(BaseVaultHorseActivity baseVaultHorseActivity, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Intent intentAddFlags;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (StringsKt.isBlank(baseVaultHorseActivity.IAuthTabCallback())) {
            intentAddFlags = new Intent((Context) baseVaultHorseActivity, baseVaultHorseActivity.ICustomTabsServiceDefault()).putExtras(baseVaultHorseActivity.validateRelationship()).addFlags(65536);
        } else {
            Intent intentOnExtraCallback = baseVaultHorseActivity.onNavigationEvent().onExtraCallback(baseVaultHorseActivity, baseVaultHorseActivity.IAuthTabCallback());
            intentAddFlags = intentOnExtraCallback != null ? intentOnExtraCallback.addFlags(65536) : null;
        }
        baseVaultHorseActivity.startActivity(intentAddFlags);
        baseVaultHorseActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.main.Hilt_BaseVaultHorseActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        SessionTrackerb.onNavigationEvent(onNavigationEvent(), this, setEngagementSignalsCallback(), this.asBinder, (Bundle) null, 8, (Object) null);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, @Nullable String str2, @Nullable Class<?> cls, @Nullable Intent intent) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) BaseVaultHorseActivity.class).putExtra("nextUrl", str).putExtra("baseScheme", str2).putExtra("originClass", cls).putExtra("originIntent", intent);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // viva.republica.toss.main.Hilt_BaseVaultHorseActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.main.Hilt_BaseVaultHorseActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.main.Hilt_BaseVaultHorseActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.main.Hilt_BaseVaultHorseActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
