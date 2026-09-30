package o;

import android.content.Intent;
import com.facebook.react.bridge.ReactContext;
import com.google.gson.JsonObject;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.rn.toss.core.TossModule;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.rn.toss.core.handler.location.GeolocationUpdateEmitterRnHandler$;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdazfFh1wkJD3B6O3YZyi_yb5N7Bjw implements r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    public static final onExtraCallback Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted = 1;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = onWarmupCompleted + 97;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(TossModule tossModule, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(tossModule, str, str2, str3);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tossModule, str, str2, str3);
        int i3 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 53 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        boolean zOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
            int i3 = 29 / 0;
        } else {
            zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(TossModule tossModule, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            tossModule.onExtraCallback(str, str2, str3);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        tossModule.onExtraCallback(str, str2, str3);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        ReactContext reactContextIEngagementSignalsCallback;
        getTitleResource gettitleresourceIAuthTabCallback;
        ResourceResolutionException resourceResolutionExceptionOnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (Intrinsics.areEqual(str, "startGeolocationUpdateEmitter")) {
            TossModule tossModule = null;
            TossReactContentOwner tossReactContentOwner = reactNativeContentOwner instanceof TossReactContentOwner ? (TossReactContentOwner) reactNativeContentOwner : null;
            if (tossReactContentOwner != null && (reactContextIEngagementSignalsCallback = tossReactContentOwner.IEngagementSignalsCallback()) != null) {
                WrappedCompositionsetContent1ExternalSyntheticLambda0 activity = tossReactContentOwner.getActivity();
                WrappedCompositionsetContent1ExternalSyntheticLambda0 wrappedCompositionsetContent1ExternalSyntheticLambda0 = activity instanceof WrappedCompositionsetContent1ExternalSyntheticLambda0 ? activity : null;
                if (wrappedCompositionsetContent1ExternalSyntheticLambda0 == null || (resourceResolutionExceptionOnExtraCallbackWithResult = wrappedCompositionsetContent1ExternalSyntheticLambda0.onExtraCallbackWithResult()) == null) {
                    int i2 = onExtraCallbackWithResult + 123;
                    IAuthTabCallback = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 5 / 2;
                    }
                    gettitleresourceIAuthTabCallback = null;
                } else {
                    gettitleresourceIAuthTabCallback = resourceResolutionExceptionOnExtraCallbackWithResult.IAuthTabCallback("TossModule");
                    int i4 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 % 4;
                    }
                }
                if (gettitleresourceIAuthTabCallback instanceof TossModule) {
                    int i6 = onExtraCallbackWithResult + 29;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    tossModule = (TossModule) gettitleresourceIAuthTabCallback;
                }
                if (tossModule == null) {
                    return;
                }
                r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo r8lambdaypxgs8dwewxzbqeveqkylxwaso = r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallbackWithResult;
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallback(r8lambdaypxgs8dwewxzbqeveqkylxwaso, string, reactContextIEngagementSignalsCallback, tossReactContentOwner.getLifecycle(), new GeolocationUpdateEmitterRnHandler$.ExternalSyntheticLambda0(tossModule), (Function1) null, 16, (Object) null);
                return;
            }
        } else if (Intrinsics.areEqual(str, "stopGeolocationUpdateEmitter")) {
            r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallbackWithResult.IAuthTabCallback();
        }
        int i8 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 19 / 0;
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
