package o;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.vbt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class resumeTimers extends encryptWithoutBase64 {
    private final SerialDescriptor IAuthTabCallback;
    private int onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private final JsonObject onWarmupCompleted;

    public /* synthetic */ resumeTimers(wie2 wie2Var, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wie2Var, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // o.encryptWithoutBase64
    /* renamed from: onMinimized */
    public JsonObject readTypedObject() {
        return this.onWarmupCompleted;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resumeTimers(@NotNull wie2 wie2Var, @NotNull JsonObject jsonObject, @Nullable String str, @Nullable SerialDescriptor serialDescriptor) {
        super(wie2Var, jsonObject, str, null);
        Intrinsics.checkNotNullParameter(wie2Var, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.onWarmupCompleted = jsonObject;
        this.IAuthTabCallback = serialDescriptor;
    }

    @Override // o.yw
    public int onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        while (this.onExtraCallbackWithResult < serialDescriptor.onExtraCallback()) {
            int i = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i + 1;
            String strAccess000 = access000(serialDescriptor, i);
            int i2 = this.onExtraCallbackWithResult - 1;
            boolean z = false;
            this.onNavigationEvent = false;
            if (readTypedObject().containsKey(strAccess000) || getInterfaceDescriptor(serialDescriptor, i2)) {
                if (this.onExtraCallback.asBinder()) {
                    wie2 wie2VarAccess000 = access000();
                    boolean zOnExtraCallback = serialDescriptor.onExtraCallback(i2);
                    SerialDescriptor serialDescriptorOnNavigationEvent = serialDescriptor.onNavigationEvent(i2);
                    if (!zOnExtraCallback || serialDescriptorOnNavigationEvent.asInterface() || !(IAuthTabCallbackStubProxy(strAccess000) instanceof JsonNull)) {
                        if (!Intrinsics.areEqual(serialDescriptorOnNavigationEvent.IAuthTabCallback(), vbt.onExtraCallbackWithResult.onWarmupCompleted) || (serialDescriptorOnNavigationEvent.asInterface() && (IAuthTabCallbackStubProxy(strAccess000) instanceof JsonNull))) {
                            return i2;
                        }
                        JsonElement jsonElementIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(strAccess000);
                        JsonPrimitive jsonPrimitive = jsonElementIAuthTabCallbackStubProxy instanceof JsonPrimitive ? (JsonPrimitive) jsonElementIAuthTabCallbackStubProxy : null;
                        String strOnNavigationEvent = jsonPrimitive != null ? initRenderFinish.onNavigationEvent(jsonPrimitive) : null;
                        if (strOnNavigationEvent == null) {
                            return i2;
                        }
                        int iIAuthTabCallback = setShakeValue.IAuthTabCallback(serialDescriptorOnNavigationEvent, wie2VarAccess000, strOnNavigationEvent);
                        if (!wie2VarAccess000.IAuthTabCallback().asInterface() && serialDescriptorOnNavigationEvent.asInterface()) {
                            z = true;
                        }
                        if (iIAuthTabCallback != -3 || ((!zOnExtraCallback && !z) || getInterfaceDescriptor(serialDescriptor, i2))) {
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    private final boolean getInterfaceDescriptor(SerialDescriptor serialDescriptor, int i) {
        boolean z = (access000().IAuthTabCallback().asInterface() || serialDescriptor.onExtraCallback(i) || !serialDescriptor.onNavigationEvent(i).asInterface()) ? false : true;
        this.onNavigationEvent = z;
        return z;
    }

    @Override // o.encryptWithoutBase64, o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder
    public boolean onNavigationEvent() {
        return !this.onNavigationEvent && super.onNavigationEvent();
    }

    @Override // o.dy1
    public String IAuthTabCallback_Parcel(@NotNull SerialDescriptor serialDescriptor, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        dyycx dyycxVarOnWarmupCompleted = setShakeValue.onWarmupCompleted(serialDescriptor, access000());
        String strOnWarmupCompleted = serialDescriptor.onWarmupCompleted(i);
        if (dyycxVarOnWarmupCompleted != null || (this.onExtraCallback.IAuthTabCallbackStubProxy() && !readTypedObject().keySet().contains(strOnWarmupCompleted))) {
            Map<String, Integer> mapOnNavigationEvent = setShakeValue.onNavigationEvent(access000(), serialDescriptor);
            Iterator<T> it = readTypedObject().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = mapOnNavigationEvent.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strOnExtraCallback = dyycxVarOnWarmupCompleted != null ? dyycxVarOnWarmupCompleted.onExtraCallback(serialDescriptor, i, strOnWarmupCompleted) : null;
            if (strOnExtraCallback != null) {
                return strOnExtraCallback;
            }
        }
        return strOnWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.encryptWithoutBase64
    public JsonElement onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (JsonElement) access8000.onExtraCallback(readTypedObject(), str);
    }

    public final JsonElement IAuthTabCallbackStubProxy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (JsonElement) readTypedObject().get(str);
    }

    @Override // o.encryptWithoutBase64, o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder
    public yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (serialDescriptor == this.IAuthTabCallback) {
            wie2 wie2VarAccess000 = access000();
            JsonElement jsonElementWriteTypedObject = writeTypedObject();
            String strOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
            if (jsonElementWriteTypedObject instanceof JsonObject) {
                return new resumeTimers(wie2VarAccess000, (JsonObject) jsonElementWriteTypedObject, extraCallback(), this.IAuthTabCallback);
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementWriteTypedObject.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + cr_(), jsonElementWriteTypedObject.toString());
        }
        return super.onWarmupCompleted(serialDescriptor);
    }

    @Override // o.encryptWithoutBase64, o.setOnShakeViewListener, o.yw
    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Set<String> setOnExtraCallback;
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (setShakeValue.onExtraCallback(serialDescriptor, access000()) || (serialDescriptor.IAuthTabCallback() instanceof ufy)) {
            return;
        }
        dyycx dyycxVarOnWarmupCompleted = setShakeValue.onWarmupCompleted(serialDescriptor, access000());
        if (dyycxVarOnWarmupCompleted == null && !this.onExtraCallback.IAuthTabCallbackStubProxy()) {
            setOnExtraCallback = getDynamicLayoutBrickValue.onWarmupCompleted(serialDescriptor);
        } else if (dyycxVarOnWarmupCompleted != null) {
            setOnExtraCallback = setShakeValue.onNavigationEvent(access000(), serialDescriptor).keySet();
        } else {
            Set<String> setOnWarmupCompleted = getDynamicLayoutBrickValue.onWarmupCompleted(serialDescriptor);
            Map map = (Map) encryptType4WithNoWrapBase64.onNavigationEvent(access000()).onExtraCallback(serialDescriptor, setShakeValue.onExtraCallback());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = clearNumber.onNavigationEvent();
            }
            setOnExtraCallback = clearSenderUid.onExtraCallback(setOnWarmupCompleted, setKeySet);
        }
        for (String str : readTypedObject().keySet()) {
            if (!setOnExtraCallback.contains(str) && !Intrinsics.areEqual(str, extraCallback())) {
                throw setTouchStateListener.onWarmupCompleted(-1, "Encountered an unknown key '" + str + "' at element: " + cr_() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) setTouchStateListener.onWarmupCompleted(readTypedObject().toString(), 0, 1, (Object) null)));
            }
        }
    }
}
