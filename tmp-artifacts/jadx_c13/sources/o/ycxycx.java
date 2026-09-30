package o;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ycxycx {
    public static final <T> Object IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        return sya12.onWarmupCompleted(iAnimation, function2, access13800Var);
    }

    public static final <T> Object IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        return sya12.IAuthTabCallback(iAnimation, access13800Var);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(T t) {
        return djycx.onExtraCallbackWithResult(t);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return djycx.onNavigationEvent(function2);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return sycycx.onWarmupCompleted(receiveChannel);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation) {
        return lud1.IAuthTabCallback(iAnimation);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, int i) {
        return sya2.IAuthTabCallback(iAnimation, i);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, int i, @NotNull CloseableUtils closeableUtils) {
        return lud1.onExtraCallbackWithResult(iAnimation, i, closeableUtils);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycx1.onExtraCallback(iAnimation, j);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext) {
        return lud1.IAuthTabCallback(iAnimation, coroutineContext);
    }

    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Unit>, ? extends Object> function2) {
        return getBorderWidth.onWarmupCompleted(iAnimation, function2);
    }

    public static final <T1, T2, T3, R> IAnimation<R> IAuthTabCallback(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull setUnreadableElfFiles<? super setRipple<? super R>, ? super T1, ? super T2, ? super T3, ? super access13800<? super Unit>, ? extends Object> setunreadableelffiles) {
        return getBorderColor.onExtraCallbackWithResult(iAnimation, iAnimation2, iAnimation3, setunreadableelffiles);
    }

    public static final <T> setRubIn<T> IAuthTabCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull getTileModeY gettilemodey, T t) {
        return sya3.onNavigationEvent(iAnimation, findresandmsg, gettilemodey, t);
    }

    public static final <T> IAnimation<T> asBinder(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return sya1.onExtraCallbackWithResult(iAnimation, function2);
    }

    public static final <T> IAnimation<T> asInterface(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2) {
        return sya2.onExtraCallbackWithResult(iAnimation, function2);
    }

    public static final <T> Object onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        return sya12.onExtraCallback(iAnimation, access13800Var);
    }

    public static final <T> Object onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull access13800<? super setRubIn<? extends T>> access13800Var) {
        return sya3.onExtraCallback(iAnimation, findresandmsg, access13800Var);
    }

    public static final <T> Object onExtraCallback(@NotNull setRipple<? super T> setripple, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull access13800<? super Unit> access13800Var) {
        return sycycx.onWarmupCompleted(setripple, receiveChannel, access13800Var);
    }

    public static final ReceiveChannel<Unit> onExtraCallback(@NotNull findResAndMsg findresandmsg, long j) {
        return ycx1.onExtraCallback(findresandmsg, j);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull Sequence<? extends T> sequence) {
        return djycx.IAuthTabCallback(sequence);
    }

    public static final <T> IAnimation<IndexedValue<T>> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation) {
        return getBorderWidth.onExtraCallbackWithResult(iAnimation);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends IAnimation<? extends T>> iAnimation, int i) {
        return sya31.onExtraCallbackWithResult(iAnimation, i);
    }

    public static final <T, R> IAnimation<R> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, int i, @NotNull Function2<? super T, ? super access13800<? super IAnimation<? extends R>>, ? extends Object> function2) {
        return sya31.IAuthTabCallback(iAnimation, i, function2);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycx1.onWarmupCompleted(iAnimation, j);
    }

    public static final <T, R> IAnimation<R> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, R r, @NotNull getBacktraceNote<? super R, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return getBorderWidth.IAuthTabCallback(iAnimation, r, getbacktracenote);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, setLogBuffers> function1) {
        return ycx1.onExtraCallbackWithResult(iAnimation, function1);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2) {
        return sya2.onNavigationEvent(iAnimation, function2);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super T>, ? super Throwable, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return sya1.onWarmupCompleted(iAnimation, getbacktracenote);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull setTaggedAddrCtrl<? super setRipple<? super T>, ? super Throwable, ? super Long, ? super access13800<? super Boolean>, ? extends Object> settaggedaddrctrl) {
        return sya11.onWarmupCompleted(iAnimation, settaggedaddrctrl);
    }

    public static final <T> IAnimation<T> onExtraCallback(@NotNull T... tArr) {
        return djycx.onExtraCallbackWithResult((Object[]) tArr);
    }

    public static final <T> getTileModeX<T> onExtraCallback(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg, @NotNull getTileModeY gettilemodey, int i) {
        return sya3.onNavigationEvent(iAnimation, findresandmsg, gettilemodey, i);
    }

    public static final <T> getTileModeX<T> onExtraCallback(@NotNull getTileModeX<? extends T> gettilemodex, @NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return sya3.onExtraCallbackWithResult(gettilemodex, function2);
    }

    public static final <T> setRubIn<T> onExtraCallback(@NotNull getCornerRadius<T> getcornerradius) {
        return sya3.onExtraCallbackWithResult(getcornerradius);
    }

    public static final void onExtraCallback(@NotNull setRipple<?> setripple) {
        sya1.onWarmupCompleted(setripple);
    }

    public static final <T> Object onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull List<T> list, @NotNull access13800<? super List<? extends T>> access13800Var) {
        return ulycx.onNavigationEvent(iAnimation, list, access13800Var);
    }

    public static final <T> Object onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Boolean>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        return sya12.onNavigationEvent(iAnimation, function2, access13800Var);
    }

    public static final Object onExtraCallbackWithResult(@NotNull IAnimation<?> iAnimation, @NotNull access13800<? super Unit> access13800Var) {
        return syczb.onExtraCallbackWithResult(iAnimation, access13800Var);
    }

    public static final <T> Object onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull setRipple<? super T> setripple, @NotNull access13800<? super Throwable> access13800Var) throws Throwable {
        return sya11.onNavigationEvent(iAnimation, setripple, access13800Var);
    }

    public static final <T> ReceiveChannel<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg) {
        return sycycx.onExtraCallback(iAnimation, findresandmsg);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull Function2<? super setRipple<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return djycx.onExtraCallbackWithResult((Function2) function2);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return sycycx.IAuthTabCallback(receiveChannel);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation) {
        return getBorderWidth.IAuthTabCallback(iAnimation);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycx1.onNavigationEvent(iAnimation, j);
    }

    public static final <T, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super IAnimation<? extends R>>, ? extends Object> function2) {
        return sya31.onExtraCallback(iAnimation, function2);
    }

    public static final <T1, T2, T3, T4, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull setUnreadableElfFiles<? super T1, ? super T2, ? super T3, ? super T4, ? super access13800<? super R>, ? extends Object> setunreadableelffiles) {
        return getBorderColor.IAuthTabCallback(iAnimation, iAnimation2, iAnimation3, iAnimation4, setunreadableelffiles);
    }

    public static final <T1, T2, T3, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull setTaggedAddrCtrl<? super T1, ? super T2, ? super T3, ? super access13800<? super R>, ? extends Object> settaggedaddrctrl) {
        return getBorderColor.onNavigationEvent(iAnimation, iAnimation2, iAnimation3, settaggedaddrctrl);
    }

    public static final <T1, T2, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull setTaggedAddrCtrl<? super setRipple<? super R>, ? super T1, ? super T2, ? super access13800<? super Unit>, ? extends Object> settaggedaddrctrl) {
        return getBorderColor.onExtraCallbackWithResult(iAnimation, iAnimation2, settaggedaddrctrl);
    }

    public static final <T, R> IAnimation<R> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Boolean>, ? extends Object> getbacktracenote) {
        return sya2.onExtraCallbackWithResult(iAnimation, getbacktracenote);
    }

    public static final <T> IAnimation<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T>... iAnimationArr) {
        return sya31.IAuthTabCallback(iAnimationArr);
    }

    public static final <T> getTileModeX<T> onExtraCallbackWithResult(@NotNull getBorderRadius<T> getborderradius) {
        return sya3.onNavigationEvent(getborderradius);
    }

    public static final <T> Object onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super T> access13800Var) {
        return sya12.onWarmupCompleted(iAnimation, access13800Var);
    }

    public static final <T> Object onNavigationEvent(@NotNull setRipple<? super T> setripple, @NotNull IAnimation<? extends T> iAnimation, @NotNull access13800<? super Unit> access13800Var) {
        return syczb.IAuthTabCallback(setripple, iAnimation, access13800Var);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull Iterable<? extends IAnimation<? extends T>> iterable) {
        return sya31.onNavigationEvent(iterable);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return djycx.IAuthTabCallback(function2);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation) {
        return jwycx.IAuthTabCallback((IAnimation) iAnimation);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycx1.IAuthTabCallback(iAnimation, j);
    }

    public static final <T> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, long j, @NotNull Function2<? super Throwable, ? super access13800<? super Boolean>, ? extends Object> function2) {
        return sya11.onNavigationEvent(iAnimation, j, function2);
    }

    public static final <T, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, R r, @NotNull getBacktraceNote<? super R, ? super T, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return getBorderWidth.onWarmupCompleted(iAnimation, r, getbacktracenote);
    }

    public static final <T, K> IAnimation<T> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, ? extends K> function1) {
        return jwycx.onExtraCallback(iAnimation, function1);
    }

    public static final <T, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super R>, ? extends Object> function2) {
        return sya31.onExtraCallbackWithResult(iAnimation, function2);
    }

    public static final <T1, T2, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull getBacktraceNote<? super T1, ? super T2, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return getBorderColor.IAuthTabCallback(iAnimation, iAnimation2, getbacktracenote);
    }

    public static final <T, R> IAnimation<R> onNavigationEvent(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super R>, ? super T, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return sya31.onNavigationEvent(iAnimation, getbacktracenote);
    }

    public static final <T, C extends Collection<? super T>> Object onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull C c, @NotNull access13800<? super C> access13800Var) {
        return ulycx.onExtraCallback(iAnimation, c, access13800Var);
    }

    public static final <T> Object onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull access13800<? super Unit> access13800Var) {
        return syczb.IAuthTabCallback(iAnimation, function2, access13800Var);
    }

    public static final <T> IAnimation<T> onWarmupCompleted() {
        return djycx.IAuthTabCallback();
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull Iterable<? extends T> iterable) {
        return djycx.onExtraCallback(iterable);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends IAnimation<? extends T>> iAnimation) {
        return sya31.onExtraCallbackWithResult(iAnimation);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, int i) {
        return sya2.onExtraCallbackWithResult(iAnimation, i);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, long j) {
        return ycx1.onExtraCallbackWithResult(iAnimation, j);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function1<? super T, Long> function1) {
        return ycx1.onWarmupCompleted(iAnimation, function1);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        return jwycx.onExtraCallback(iAnimation, function2);
    }

    public static final <T1, T2, T3, T4, T5, R> IAnimation<R> onWarmupCompleted(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull IAnimation<? extends T5> iAnimation5, @NotNull getBacktraceNoteList<? super setRipple<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super access13800<? super Unit>, ? extends Object> getbacktracenotelist) {
        return getBorderColor.onNavigationEvent(iAnimation, iAnimation2, iAnimation3, iAnimation4, iAnimation5, getbacktracenotelist);
    }

    public static final <T1, T2, T3, T4, T5, R> IAnimation<R> onWarmupCompleted(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull IAnimation<? extends T3> iAnimation3, @NotNull IAnimation<? extends T4> iAnimation4, @NotNull IAnimation<? extends T5> iAnimation5, @NotNull setPacEnabledKeys<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super access13800<? super R>, ? extends Object> setpacenabledkeys) {
        return getBorderColor.IAuthTabCallback(iAnimation, iAnimation2, iAnimation3, iAnimation4, iAnimation5, setpacenabledkeys);
    }

    public static final <T1, T2, R> IAnimation<R> onWarmupCompleted(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull getBacktraceNote<? super T1, ? super T2, ? super access13800<? super R>, ? extends Object> getbacktracenote) {
        return getBorderColor.onExtraCallbackWithResult(iAnimation, iAnimation2, getbacktracenote);
    }

    public static final <T1, T2, R> IAnimation<R> onWarmupCompleted(@NotNull IAnimation<? extends T1> iAnimation, @NotNull IAnimation<? extends T2> iAnimation2, @NotNull setTaggedAddrCtrl<? super setRipple<? super R>, ? super T1, ? super T2, ? super access13800<? super Unit>, ? extends Object> settaggedaddrctrl) {
        return getBorderColor.onExtraCallback(iAnimation, iAnimation2, settaggedaddrctrl);
    }

    public static final <T> IAnimation<T> onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull getBacktraceNote<? super setRipple<? super T>, ? super Throwable, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return sya11.onNavigationEvent(iAnimation, getbacktracenote);
    }

    public static final <T> getPackageType onWarmupCompleted(@NotNull IAnimation<? extends T> iAnimation, @NotNull findResAndMsg findresandmsg) {
        return syczb.onExtraCallback(iAnimation, findresandmsg);
    }
}
