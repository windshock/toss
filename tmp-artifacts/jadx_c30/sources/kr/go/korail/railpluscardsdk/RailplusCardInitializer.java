package kr.go.korail.railpluscardsdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.AdSlot;
import o.OutlinedTextFieldDefaultsExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RailplusCardInitializer implements OutlinedTextFieldDefaultsExternalSyntheticLambda0<AdSlot> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public List<Class<? extends OutlinedTextFieldDefaultsExternalSyntheticLambda0<?>>> dependencies() {
        return new ArrayList();
    }

    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public AdSlot create(Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        AdSlot adSlot = AdSlot.onWarmupCompleted;
        adSlot.IAuthTabCallback(context);
        return adSlot;
    }
}
