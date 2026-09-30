package o;

import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTouchListenerProxy {
    private final getBeforeTimestamp IAuthTabCallback;
    private final boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private final boolean onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return setTouchListenerProxy.this.IAuthTabCallback(null, this);
        }
    }

    public setTouchListenerProxy(@NotNull changeVideoState changevideostate, @NotNull getBeforeTimestamp getbeforetimestamp) {
        Intrinsics.checkNotNullParameter(changevideostate, "");
        Intrinsics.checkNotNullParameter(getbeforetimestamp, "");
        this.IAuthTabCallback = getbeforetimestamp;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        this.onExtraCallback = ((Boolean) changeVideoState.onExtraCallback(-1913675560, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1913675562, iOnExtraCallbackWithResult2, new Object[]{changevideostate}, iOnExtraCallbackWithResult3)).booleanValue();
        this.onWarmupCompleted = changevideostate.onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(setLoadBias<Unit, JsonElement> setloadbias, access13800<? super JsonElement> access13800Var) {
        onNavigationEvent onnavigationevent;
        setTouchListenerProxy settouchlistenerproxy;
        LinkedHashMap linkedHashMap;
        onNavigationEvent onnavigationevent2;
        byte b;
        setLoadBias setloadbias2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            byte bOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent((byte) 6);
            if (this.IAuthTabCallback.IAuthTabCallback_Parcel() == 4) {
                getBeforeTimestamp.onExtraCallbackWithResult(this.IAuthTabCallback, "Unexpected leading comma", 0, null, 6, null);
                throw new setWrite();
            }
            settouchlistenerproxy = this;
            linkedHashMap = new LinkedHashMap();
            onnavigationevent2 = onnavigationevent;
            b = bOnNavigationEvent;
            setloadbias2 = setloadbias;
            if (settouchlistenerproxy.IAuthTabCallback.onWarmupCompleted()) {
            }
            if (b == 6) {
            }
            return new JsonObject(linkedHashMap);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = (String) onnavigationevent.L$3;
        linkedHashMap = (LinkedHashMap) onnavigationevent.L$2;
        settouchlistenerproxy = (setTouchListenerProxy) onnavigationevent.L$1;
        setLoadBias setloadbias3 = (setLoadBias) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(obj);
        linkedHashMap.put(str, (JsonElement) obj);
        byte bOnExtraCallback = settouchlistenerproxy.IAuthTabCallback.onExtraCallback();
        if (bOnExtraCallback == 4) {
            if (bOnExtraCallback != 7) {
                getBeforeTimestamp.onExtraCallbackWithResult(settouchlistenerproxy.IAuthTabCallback, "Expected end of the object or comma", 0, null, 6, null);
                throw new setWrite();
            }
            b = bOnExtraCallback;
            if (b == 6) {
                settouchlistenerproxy.IAuthTabCallback.onNavigationEvent((byte) 7);
            } else if (b == 4) {
                if (!settouchlistenerproxy.onWarmupCompleted) {
                    setTouchStateListener.onWarmupCompleted(settouchlistenerproxy.IAuthTabCallback, (String) null, 1, (Object) null);
                    throw new setWrite();
                }
                settouchlistenerproxy.IAuthTabCallback.onNavigationEvent((byte) 7);
            }
            return new JsonObject(linkedHashMap);
        }
        onnavigationevent2 = onnavigationevent;
        b = bOnExtraCallback;
        setloadbias2 = setloadbias3;
        if (settouchlistenerproxy.IAuthTabCallback.onWarmupCompleted()) {
            String strOnTransact = settouchlistenerproxy.onExtraCallback ? settouchlistenerproxy.IAuthTabCallback.onTransact() : settouchlistenerproxy.IAuthTabCallback.asBinder();
            settouchlistenerproxy.IAuthTabCallback.onNavigationEvent((byte) 5);
            Unit unit = Unit.INSTANCE;
            onnavigationevent2.L$0 = setloadbias2;
            onnavigationevent2.L$1 = settouchlistenerproxy;
            onnavigationevent2.L$2 = linkedHashMap;
            onnavigationevent2.L$3 = strOnTransact;
            onnavigationevent2.label = 1;
            Object objIAuthTabCallback = setloadbias2.IAuthTabCallback(unit, onnavigationevent2);
            if (objIAuthTabCallback == objOnExtraCallback) {
                return objOnExtraCallback;
            }
            setloadbias3 = setloadbias2;
            obj = objIAuthTabCallback;
            onNavigationEvent onnavigationevent3 = onnavigationevent2;
            str = strOnTransact;
            onnavigationevent = onnavigationevent3;
            linkedHashMap.put(str, (JsonElement) obj);
            byte bOnExtraCallback2 = settouchlistenerproxy.IAuthTabCallback.onExtraCallback();
            if (bOnExtraCallback2 == 4) {
            }
        }
        if (b == 6) {
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement onExtraCallbackWithResult() {
        byte bOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        if (this.IAuthTabCallback.IAuthTabCallback_Parcel() == 4) {
            getBeforeTimestamp.onExtraCallbackWithResult(this.IAuthTabCallback, "Unexpected leading comma", 0, null, 6, null);
            throw new setWrite();
        }
        ArrayList arrayList = new ArrayList();
        while (this.IAuthTabCallback.onWarmupCompleted()) {
            arrayList.add(onNavigationEvent());
            bOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
            if (bOnExtraCallback != 4) {
                getBeforeTimestamp getbeforetimestamp = this.IAuthTabCallback;
                boolean z = bOnExtraCallback == 9;
                int i = getbeforetimestamp.onWarmupCompleted;
                if (!z) {
                    getBeforeTimestamp.onExtraCallbackWithResult(getbeforetimestamp, "Expected end of the array or comma", i, null, 4, null);
                    throw new setWrite();
                }
            }
        }
        if (bOnExtraCallback == 8) {
            this.IAuthTabCallback.onNavigationEvent((byte) 9);
        } else if (bOnExtraCallback == 4) {
            if (!this.onWarmupCompleted) {
                setTouchStateListener.onNavigationEvent(this.IAuthTabCallback, "array");
                throw new setWrite();
            }
            this.IAuthTabCallback.onNavigationEvent((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive onNavigationEvent(boolean z) {
        String strOnTransact;
        if (this.onExtraCallback || !z) {
            strOnTransact = this.IAuthTabCallback.onTransact();
        } else {
            strOnTransact = this.IAuthTabCallback.asBinder();
        }
        String str = strOnTransact;
        return (z || !Intrinsics.areEqual(str, "null")) ? new muteVideo(str, z, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement onNavigationEvent() {
        JsonElement jsonElementOnWarmupCompleted;
        byte bIAuthTabCallback_Parcel = this.IAuthTabCallback.IAuthTabCallback_Parcel();
        if (bIAuthTabCallback_Parcel == 1) {
            return onNavigationEvent(true);
        }
        if (bIAuthTabCallback_Parcel == 0) {
            return onNavigationEvent(false);
        }
        if (bIAuthTabCallback_Parcel == 6) {
            int i = this.onExtraCallbackWithResult + 1;
            this.onExtraCallbackWithResult = i;
            if (i == 200) {
                jsonElementOnWarmupCompleted = onExtraCallback();
            } else {
                jsonElementOnWarmupCompleted = onWarmupCompleted();
            }
            this.onExtraCallbackWithResult--;
            return jsonElementOnWarmupCompleted;
        }
        if (bIAuthTabCallback_Parcel == 8) {
            return onExtraCallbackWithResult();
        }
        getBeforeTimestamp.onExtraCallbackWithResult(this.IAuthTabCallback, "Cannot read Json element because of unexpected " + getRunTime.onWarmupCompleted(bIAuthTabCallback_Parcel), 0, null, 6, null);
        throw new setWrite();
    }

    static final class IAuthTabCallback extends RestrictedSuspendLambda implements getBacktraceNote<setLoadBias<Unit, JsonElement>, Unit, access13800<? super JsonElement>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(3, access13800Var);
        }

        @Override // o.getBacktraceNote
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setLoadBias<Unit, JsonElement> setloadbias, Unit unit, access13800<? super JsonElement> access13800Var) {
            IAuthTabCallback iAuthTabCallback = setTouchListenerProxy.this.new IAuthTabCallback(access13800Var);
            iAuthTabCallback.L$0 = setloadbias;
            return iAuthTabCallback.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setLoadBias setloadbias = (setLoadBias) this.L$0;
                byte bIAuthTabCallback_Parcel = setTouchListenerProxy.this.IAuthTabCallback.IAuthTabCallback_Parcel();
                if (bIAuthTabCallback_Parcel == 1) {
                    return setTouchListenerProxy.this.onNavigationEvent(true);
                }
                if (bIAuthTabCallback_Parcel == 0) {
                    return setTouchListenerProxy.this.onNavigationEvent(false);
                }
                if (bIAuthTabCallback_Parcel != 6) {
                    if (bIAuthTabCallback_Parcel == 8) {
                        return setTouchListenerProxy.this.onExtraCallbackWithResult();
                    }
                    getBeforeTimestamp.onExtraCallbackWithResult(setTouchListenerProxy.this.IAuthTabCallback, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new setWrite();
                }
                setTouchListenerProxy settouchlistenerproxy = setTouchListenerProxy.this;
                this.label = 1;
                obj = settouchlistenerproxy.IAuthTabCallback(setloadbias, this);
                if (obj == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return (JsonElement) obj;
        }
    }

    private final JsonElement onExtraCallback() {
        return (JsonElement) clearExecute.onNavigationEvent(new clearOffset(new IAuthTabCallback(null)), Unit.INSTANCE);
    }

    private final JsonElement onWarmupCompleted() {
        byte bOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent((byte) 6);
        if (this.IAuthTabCallback.IAuthTabCallback_Parcel() == 4) {
            getBeforeTimestamp.onExtraCallbackWithResult(this.IAuthTabCallback, "Unexpected leading comma", 0, null, 6, null);
            throw new setWrite();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.IAuthTabCallback.onWarmupCompleted()) {
                break;
            }
            String strOnTransact = this.onExtraCallback ? this.IAuthTabCallback.onTransact() : this.IAuthTabCallback.asBinder();
            this.IAuthTabCallback.onNavigationEvent((byte) 5);
            linkedHashMap.put(strOnTransact, onNavigationEvent());
            bOnNavigationEvent = this.IAuthTabCallback.onExtraCallback();
            if (bOnNavigationEvent != 4) {
                if (bOnNavigationEvent != 7) {
                    getBeforeTimestamp.onExtraCallbackWithResult(this.IAuthTabCallback, "Expected end of the object or comma", 0, null, 6, null);
                    throw new setWrite();
                }
            }
        }
        if (bOnNavigationEvent == 6) {
            this.IAuthTabCallback.onNavigationEvent((byte) 7);
        } else if (bOnNavigationEvent == 4) {
            if (!this.onWarmupCompleted) {
                setTouchStateListener.onWarmupCompleted(this.IAuthTabCallback, (String) null, 1, (Object) null);
                throw new setWrite();
            }
            this.IAuthTabCallback.onNavigationEvent((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }
}
