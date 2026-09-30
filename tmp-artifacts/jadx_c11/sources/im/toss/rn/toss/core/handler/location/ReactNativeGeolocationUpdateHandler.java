package im.toss.rn.toss.core.handler.location;

import android.content.Intent;
import com.facebook.react.bridge.ReactContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.rn.toss.core.handler.location.ReactNativeGeolocationUpdateHandler$;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceValidation;
import o.access8100;
import o.getWrite;
import o.onOutOfMemory;
import o.r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ;
import o.r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo;
import o.setOnOutOfMemeryErrorCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeGeolocationUpdateHandler implements r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;

    static {
        int i = onExtraCallback + 27;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setonoutofmemeryerrorcallback, str);
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setonoutofmemeryerrorcallback, str, str2, str3);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        onOutOfMemory onoutofmemoryOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
            int i3 = 37 / 0;
        } else {
            onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        }
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    private static final Unit onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        setonoutofmemeryerrorcallback.onNavigationEvent("onGeolocationUpdated", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("lat", str), getWrite.IAuthTabCallback("lon", str2), getWrite.IAuthTabCallback("degrees", str3)}));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        setonoutofmemeryerrorcallback.onNavigationEvent("onGeolocationError", access8100.onNavigationEvent(getWrite.IAuthTabCallback("code", str)));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        JsonElement jsonElement;
        String asString;
        ReactContext reactContextIEngagementSignalsCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        if (Intrinsics.areEqual(str, "startGeolocationUpdated")) {
            int i4 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            TossReactContentOwner tossReactContentOwner = reactNativeContentOwner instanceof TossReactContentOwner ? (TossReactContentOwner) reactNativeContentOwner : null;
            if (tossReactContentOwner == null || (reactContextIEngagementSignalsCallback = tossReactContentOwner.IEngagementSignalsCallback()) == null) {
                return;
            }
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("geolocationEventId", string);
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject2);
            r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallbackWithResult.onExtraCallbackWithResult(string, reactContextIEngagementSignalsCallback, tossReactContentOwner.getLifecycle(), new ReactNativeGeolocationUpdateHandler$.ExternalSyntheticLambda0(setonoutofmemeryerrorcallback), new ReactNativeGeolocationUpdateHandler$.ExternalSyntheticLambda1(setonoutofmemeryerrorcallback));
            return;
        }
        if ((!Intrinsics.areEqual(str, "stopGeolocationUpdated")) || (jsonElement = jsonObject.get("geolocationEventId")) == null) {
            return;
        }
        int i6 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            asString = jsonElement.getAsString();
            int i7 = 25 / 0;
            if (asString == null) {
                return;
            }
        } else {
            asString = jsonElement.getAsString();
            if (asString == null) {
                return;
            }
        }
        r8lambdaypXGS8DWeWXzbqeVeqKYlXwASo.onExtraCallbackWithResult.onExtraCallback(asString);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
