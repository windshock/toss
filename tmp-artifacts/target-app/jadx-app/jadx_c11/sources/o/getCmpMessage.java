package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public abstract class getCmpMessage {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final getBorderRadius<Unit> onNavigationEvent = RealImageLoaderKtCoroutineScopeinlinedCoroutineExceptionHandler1.onWarmupCompleted();
    private final ConcurrentHashMap<p6, getPackageType> IAuthTabCallback = new ConcurrentHashMap<>();

    public abstract void onExtraCallback(@NotNull p6 p6Var);

    public abstract Object onNavigationEvent(@NotNull p6 p6Var, @NotNull access13800<? super Unit> access13800Var);

    public abstract o7d onWarmupCompleted();

    public static final /* synthetic */ ConcurrentHashMap onWarmupCompleted(getCmpMessage getcmpmessage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ConcurrentHashMap<p6, getPackageType> concurrentHashMap = getcmpmessage.IAuthTabCallback;
        if (i3 == 0) {
            return concurrentHashMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBorderRadius<Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        getBorderRadius<Unit> getborderradius = this.onNavigationEvent;
        int i5 = i3 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 11 / 0;
        }
        return getborderradius;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ p6 $section;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(p6 p6Var, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$section = p6Var;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = getCmpMessage.this.new IAuthTabCallback(this.$section, access13800Var);
            int i2 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 85 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 14 / 0;
            return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                getCmpMessage getcmpmessage = getCmpMessage.this;
                p6 p6Var = this.$section;
                this.label = 1;
                if (getcmpmessage.onNavigationEvent(p6Var, this) == objOnWarmupCompleted) {
                    int i3 = onWarmupCompleted + 67;
                    onExtraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    public void onExtraCallback() {
        int i = 2 % 2;
        Set<p6> setKeySet = this.IAuthTabCallback.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        int i2 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        for (p6 p6Var : setKeySet) {
            int i4 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullExpressionValue(p6Var, "");
            p6 p6Var2 = p6Var;
            onExtraCallback(p6Var2);
            getPackageType getpackagetype = this.IAuthTabCallback.get(p6Var2);
            if (getpackagetype != null) {
                int i6 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
        this.IAuthTabCallback.clear();
        int i8 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
    }

    public final Object onNavigationEvent(@NotNull findResAndMsg findresandmsg, @NotNull Set<? extends p6> set, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Enumeration enumerationKeys = onWarmupCompleted(this).keys();
            Intrinsics.checkNotNullExpressionValue(enumerationKeys, "");
            ArrayList list = Collections.list(enumerationKeys);
            Intrinsics.checkNotNullExpressionValue(list, "");
            for (p6 p6Var : CollectionsKt.minus(list, set)) {
                int i2 = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                getPackageType getpackagetype = (getPackageType) onWarmupCompleted(this).get(p6Var);
                if (getpackagetype != null) {
                    getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
                }
                onWarmupCompleted(this).remove(p6Var);
                Intrinsics.checkNotNull(p6Var);
                onExtraCallback(p6Var);
            }
            for (p6 p6Var2 : set) {
                getPackageType getpackagetype2 = (getPackageType) onWarmupCompleted(this).get(p6Var2);
                if (getpackagetype2 == null || !getpackagetype2.onExtraCallback()) {
                    onWarmupCompleted(this).put(p6Var2, maybeUpdateAnimatable.onNavigationEvent(findresandmsg, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new IAuthTabCallback(p6Var2, null), 2, (Object) null));
                    int i4 = onWarmupCompleted + 81;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int i6 = onExtraCallbackWithResult + 107;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(e3));
            int i8 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }
}
