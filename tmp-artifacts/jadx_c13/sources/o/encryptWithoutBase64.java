package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.uu;
import o.vbt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class encryptWithoutBase64 extends dy1 implements setAnimationType {
    protected final changeVideoState onExtraCallback;
    private final wie2 onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final JsonElement onWarmupCompleted;

    public /* synthetic */ encryptWithoutBase64(wie2 wie2Var, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(wie2Var, jsonElement, str);
    }

    @Override // o.dy1
    public String onExtraCallbackWithResult(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str2;
    }

    @Override // o.setOnShakeViewListener, o.yw
    public void onExtraCallbackWithResult(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: onNavigationEvent, reason: avoid collision after fix types in other method */
    public abstract JsonElement onNavigationEvent2(@NotNull String str);

    public /* synthetic */ encryptWithoutBase64(wie2 wie2Var, JsonElement jsonElement, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wie2Var, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    @Override // o.setAnimationType
    public wie2 access000() {
        return this.onExtraCallbackWithResult;
    }

    public JsonElement readTypedObject() {
        return this.onWarmupCompleted;
    }

    protected final String extraCallback() {
        return this.onNavigationEvent;
    }

    private encryptWithoutBase64(wie2 wie2Var, JsonElement jsonElement, String str) {
        this.onExtraCallbackWithResult = wie2Var;
        this.onWarmupCompleted = jsonElement;
        this.onNavigationEvent = str;
        this.onExtraCallback = access000().IAuthTabCallback();
    }

    @Override // o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder, o.yw
    public hfycx IAuthTabCallback() {
        return access000().onExtraCallback();
    }

    protected final JsonElement writeTypedObject() {
        JsonElement jsonElementOnNavigationEvent2;
        String interfaceDescriptor = getInterfaceDescriptor();
        return (interfaceDescriptor == null || (jsonElementOnNavigationEvent2 = onNavigationEvent2(interfaceDescriptor)) == null) ? readTypedObject() : jsonElementOnNavigationEvent2;
    }

    public final String IAuthTabCallback_Parcel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return cr_() + '.' + str;
    }

    @Override // o.setAnimationType
    public JsonElement onWarmupCompleted() {
        return writeTypedObject();
    }

    @Override // o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder
    public yw onWarmupCompleted(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        JsonElement jsonElementWriteTypedObject = writeTypedObject();
        vbt vbtVarIAuthTabCallback = serialDescriptor.IAuthTabCallback();
        if (Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onNavigationEvent.onExtraCallbackWithResult) || (vbtVarIAuthTabCallback instanceof ufy)) {
            wie2 wie2VarAccess000 = access000();
            String strOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult();
            if (jsonElementWriteTypedObject instanceof JsonArray) {
                return new fbyzb(wie2VarAccess000, (JsonArray) jsonElementWriteTypedObject);
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementWriteTypedObject.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + cr_(), jsonElementWriteTypedObject.toString());
        }
        if (!Intrinsics.areEqual(vbtVarIAuthTabCallback, uu.onWarmupCompleted.onWarmupCompleted)) {
            wie2 wie2VarAccess0002 = access000();
            String strOnExtraCallbackWithResult2 = serialDescriptor.onExtraCallbackWithResult();
            if (jsonElementWriteTypedObject instanceof JsonObject) {
                return new resumeTimers(wie2VarAccess0002, (JsonObject) jsonElementWriteTypedObject, this.onNavigationEvent, null, 8, null);
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementWriteTypedObject.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult2 + " at element: " + cr_(), jsonElementWriteTypedObject.toString());
        }
        wie2 wie2VarAccess0003 = access000();
        SerialDescriptor serialDescriptorOnNavigationEvent = cypher4EncryptWithNoWrapBase64.onNavigationEvent(serialDescriptor.onNavigationEvent(0), wie2VarAccess0003.onExtraCallback());
        vbt vbtVarIAuthTabCallback2 = serialDescriptorOnNavigationEvent.IAuthTabCallback();
        if ((vbtVarIAuthTabCallback2 instanceof spv) || Intrinsics.areEqual(vbtVarIAuthTabCallback2, vbt.onExtraCallbackWithResult.onWarmupCompleted)) {
            wie2 wie2VarAccess0004 = access000();
            String strOnExtraCallbackWithResult3 = serialDescriptor.onExtraCallbackWithResult();
            if (jsonElementWriteTypedObject instanceof JsonObject) {
                return new setOnTouchListener(wie2VarAccess0004, (JsonObject) jsonElementWriteTypedObject);
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementWriteTypedObject.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult3 + " at element: " + cr_(), jsonElementWriteTypedObject.toString());
        }
        if (wie2VarAccess0003.IAuthTabCallback().onWarmupCompleted()) {
            wie2 wie2VarAccess0005 = access000();
            String strOnExtraCallbackWithResult4 = serialDescriptor.onExtraCallbackWithResult();
            if (jsonElementWriteTypedObject instanceof JsonArray) {
                return new fbyzb(wie2VarAccess0005, (JsonArray) jsonElementWriteTypedObject);
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementWriteTypedObject.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult4 + " at element: " + cr_(), jsonElementWriteTypedObject.toString());
        }
        throw setTouchStateListener.onWarmupCompleted(serialDescriptorOnNavigationEvent);
    }

    @Override // o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder
    public boolean onNavigationEvent() {
        return !(writeTypedObject() instanceof JsonNull);
    }

    private final Void onExtraCallbackWithResult(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (StringsKt__StringsJVMKt.startsWith$default(str, "i", false, 2, null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb.toString() + " value at element: " + IAuthTabCallback_Parcel(str2), writeTypedObject().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int IAuthTabCallback(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        wie2 wie2VarAccess000 = access000();
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        String strOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult();
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            return setShakeValue.onWarmupCompleted(serialDescriptor, wie2VarAccess000, ((JsonPrimitive) jsonElementOnNavigationEvent2).onWarmupCompleted(), null, 4, null);
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: onTransact, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean asInterface(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return onNavigationEvent2(str) != JsonNull.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public String asBinder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            if (!(jsonPrimitive instanceof muteVideo)) {
                throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + IAuthTabCallback_Parcel(str), writeTypedObject().toString());
            }
            muteVideo mutevideo = (muteVideo) jsonPrimitive;
            if (!mutevideo.onExtraCallbackWithResult()) {
                if (!((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 1913675562, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{access000().IAuthTabCallback()}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue()) {
                    throw setTouchStateListener.onExtraCallbackWithResult(-1, "String literal for key '" + str + "' should be quoted at element: " + IAuthTabCallback_Parcel(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", writeTypedObject().toString());
                }
            }
            return mutevideo.onWarmupCompleted();
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of string at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: IAuthTabCallback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Decoder onExtraCallbackWithResult(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (syaycx1.onExtraCallback(serialDescriptor)) {
            wie2 wie2VarAccess000 = access000();
            JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
            String strOnExtraCallbackWithResult = serialDescriptor.onExtraCallbackWithResult();
            if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
                return new setWebTouchProxy(syaycx2.onWarmupCompleted(wie2VarAccess000, ((JsonPrimitive) jsonElementOnNavigationEvent2).onWarmupCompleted()), access000());
            }
            throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
        }
        return super.onExtraCallbackWithResult((encryptWithoutBase64) str, serialDescriptor);
    }

    @Override // o.setOnShakeViewListener, kotlinx.serialization.encoding.Decoder
    public Decoder onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return getInterfaceDescriptor() != null ? super.onExtraCallback(serialDescriptor) : new fbyycx1(access000(), readTypedObject(), this.onNavigationEvent).onExtraCallback(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T onWarmupCompleted(@NotNull jp<? extends T> jpVar) {
        JsonPrimitive jsonPrimitiveOnNavigationEvent;
        Intrinsics.checkNotNullParameter(jpVar, "");
        if (!(jpVar instanceof xf) || access000().IAuthTabCallback().writeTypedObject()) {
            return jpVar.deserialize(this);
        }
        xf xfVar = (xf) jpVar;
        String strIAuthTabCallback = setRecycled.IAuthTabCallback(xfVar.getDescriptor(), access000());
        JsonElement jsonElementOnWarmupCompleted = onWarmupCompleted();
        String strOnExtraCallbackWithResult = xfVar.getDescriptor().onExtraCallbackWithResult();
        if (jsonElementOnWarmupCompleted instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementOnWarmupCompleted;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strIAuthTabCallback);
            try {
                jp jpVarOnExtraCallback = mue.onExtraCallback((xf) jpVar, this, (jsonElement == null || (jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(jsonElement)) == null) ? null : initRenderFinish.onNavigationEvent(jsonPrimitiveOnNavigationEvent));
                Intrinsics.checkNotNull(jpVarOnExtraCallback, "");
                return (T) cypher4Decrypt.onNavigationEvent(access000(), strIAuthTabCallback, jsonObject, jpVarOnExtraCallback);
            } catch (qn e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                throw setTouchStateListener.onExtraCallbackWithResult(-1, message, jsonObject.toString());
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnWarmupCompleted.getClass()).getSimpleName() + " as the serialized body of " + strOnExtraCallbackWithResult + " at element: " + cr_(), jsonElementOnWarmupCompleted.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: IAuthTabCallback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                Boolean boolOnExtraCallbackWithResult = initRenderFinish.onExtraCallbackWithResult(jsonPrimitive);
                if (boolOnExtraCallbackWithResult == null) {
                    onExtraCallbackWithResult(jsonPrimitive, "boolean", str);
                    throw new setWrite();
                }
                return boolOnExtraCallbackWithResult.booleanValue();
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "boolean", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: onExtraCallbackWithResult, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                long jIAuthTabCallback_Parcel = initRenderFinish.IAuthTabCallback_Parcel(jsonPrimitive);
                Byte bValueOf = (-128 > jIAuthTabCallback_Parcel || jIAuthTabCallback_Parcel > 127) ? null : Byte.valueOf((byte) jIAuthTabCallback_Parcel);
                if (bValueOf == null) {
                    onExtraCallbackWithResult(jsonPrimitive, "byte", str);
                    throw new setWrite();
                }
                return bValueOf.byteValue();
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "byte", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of byte at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: access100, reason: merged with bridge method [inline-methods] */
    public short IAuthTabCallbackDefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                long jIAuthTabCallback_Parcel = initRenderFinish.IAuthTabCallback_Parcel(jsonPrimitive);
                Short shValueOf = (-32768 > jIAuthTabCallback_Parcel || jIAuthTabCallback_Parcel > 32767) ? null : Short.valueOf((short) jIAuthTabCallback_Parcel);
                if (shValueOf == null) {
                    onExtraCallbackWithResult(jsonPrimitive, "short", str);
                    throw new setWrite();
                }
                return shValueOf.shortValue();
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "short", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of short at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: IAuthTabCallbackDefault, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int IAuthTabCallbackStub(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                long jIAuthTabCallback_Parcel = initRenderFinish.IAuthTabCallback_Parcel(jsonPrimitive);
                Integer numValueOf = (-2147483648L > jIAuthTabCallback_Parcel || jIAuthTabCallback_Parcel > 2147483647L) ? null : Integer.valueOf((int) jIAuthTabCallback_Parcel);
                if (numValueOf == null) {
                    onExtraCallbackWithResult(jsonPrimitive, "int", str);
                    throw new setWrite();
                }
                return numValueOf.intValue();
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "int", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of int at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: asBinder, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public long onTransact(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                return initRenderFinish.IAuthTabCallback_Parcel(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "long", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of long at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: IAuthTabCallbackStub, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public float onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                float fOnTransact = initRenderFinish.onTransact(jsonPrimitive);
                if (access000().IAuthTabCallback().onExtraCallback() || Math.abs(fOnTransact) <= Float.MAX_VALUE) {
                    return fOnTransact;
                }
                throw setTouchStateListener.onNavigationEvent(Float.valueOf(fOnTransact), str, writeTypedObject().toString());
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "float", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of float at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: asInterface, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public double onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                double dOnExtraCallback = initRenderFinish.onExtraCallback(jsonPrimitive);
                if (access000().IAuthTabCallback().onExtraCallback() || Math.abs(dOnExtraCallback) <= Double.MAX_VALUE) {
                    return dOnExtraCallback;
                }
                throw setTouchStateListener.onNavigationEvent(Double.valueOf(dOnExtraCallback), str, writeTypedObject().toString());
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "double", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of double at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOnShakeViewListener
    /* renamed from: onExtraCallback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public char onWarmupCompleted(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonElement jsonElementOnNavigationEvent2 = onNavigationEvent2(str);
        if (jsonElementOnNavigationEvent2 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementOnNavigationEvent2;
            try {
                return StringsKt___StringsKt.single(jsonPrimitive.onWarmupCompleted());
            } catch (IllegalArgumentException unused) {
                onExtraCallbackWithResult(jsonPrimitive, "char", str);
                throw new setWrite();
            }
        }
        throw setTouchStateListener.onExtraCallbackWithResult(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(jsonElementOnNavigationEvent2.getClass()).getSimpleName() + " as the serialized body of char at element: " + IAuthTabCallback_Parcel(str), jsonElementOnNavigationEvent2.toString());
    }
}
